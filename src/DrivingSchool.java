import java.util.ArrayList;
import java.util.List;

/**
 *  This is a driving school lld project.
 *  req: Customer should be able to explore the lessons available, add them to cart, checkout and make payments using credit card
 *  classes: Customer, Lessons, Cart, CreditCard, Payment
 * **/

public class DrivingSchool {
    public static void main(String [] args){
//        Admin creating lessons;

        Lesson l1 = new Lesson(300);
        Lesson l2 = new Lesson(200);
        Lesson l3 = new Lesson(500);
        Lesson l4 = new Lesson(70);

//        Create customer
        Customer c1 = new Customer(500);
        Customer c2 = new Customer(200);

        c2.addLesson(l4);
        c2.checkOut();
    }
}

class Customer{
    Cart cart;

    CreditCard card;

    Customer(int balance){
        cart = new Cart();
        card = new CreditCard(balance);
        System.out.println("Created a customer with credit balance : "+balance);
    }

    void addLesson(Lesson lesson){
        cart.addLesson(lesson);
    }

    void removeLesson(Lesson lesson){
        cart.removeLesson(lesson);
    }

    void checkOut(){
        if(cart.makePayment(card)){
            System.out.println("Successfully checkout. Current Balance : "+card.balance);
        }else{
            System.out.println("Sorry inadequate funds. Current Balance :"+card.balance);
        }
    }
}

class Lesson{
    int price;

    Lesson(int price){
        this.price = price;
        System.out.println("Created a lesson with price : "+price);
    }

    int getPrice(){
        return price;
    }
}

class Cart{
    List<Lesson> items;

    Cart(){
        items = new ArrayList<>();
    }

    void addLesson(Lesson lesson){
        items.add((lesson));
        System.out.println("added lesson from cart : " +lesson.toString());
    }

    void removeLesson(Lesson lesson){
        items.remove(lesson);
        System.out.println("removed lesson from cart : " +lesson.toString());
    }

    int getCartTotal(){
        return items.stream().reduce(0, (sum, lesson) -> sum + lesson.getPrice(), Integer::sum);
    }

    boolean makePayment(CreditCard card){
        Payment payment = new Payment(card, getCartTotal());

        return payment.isSuccess();
    }
}

class Payment{
    CreditCard card;
    int amount;
    Payment(CreditCard card, int amount){
        this.card = card;
        this.amount = amount;
    }

    private Payment(){};

    boolean isSuccess(){
        return card.pay(amount);
    }
}

class CreditCard{
    int balance;

    CreditCard(int balance){
        this.balance = balance;
    }

    boolean pay(int amount){
        if(amount <= balance) {
            balance = balance - amount;
            return true;
        }

        return false;
    }
}
