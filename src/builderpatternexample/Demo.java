package builderpatternexample;

public class Demo {
    public static void main(String[] args) {
        URLBuilder.Builder urlBuilder = new URLBuilder.Builder();
        urlBuilder.protocol("https://").hostname("localhost").pathParam("/test");

        URLBuilder url = urlBuilder.build();

        System.out.print(url.protocol);
        System.out.print(url.hostname);
        System.out.print(url.pathParam);

    }
}
