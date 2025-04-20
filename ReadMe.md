# LLD Notes

NVT - Noun Verb Technique -> Nouns are domain classes in an use case, Verbs are behaviour(can be related to one or more classes)

## relationships between classes
- has a
  - aggregation, A is related to B, but can also exist independently
  - composition, A is related to B and can not exist independently
- is a
  - inheritance
- association

## Types of Design Patterns

Designing patterns are categorized based on two criteria.

### Purpose 
### Scope

#### Creational: Used for creating or instantiating classes.

- Factory Method
- Abstract Factory
- Builder
- Prototype
- Singleton

#### Structural: Used for structuring more than one classes or objects together.

- Adapter(class/Object)
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy

#### Behavioral: Used for identifying and setting up common communication paterns among objects.

- Interpreter
- Template Method
- Chain of Responsibility
- Command
- Iterator
- Mediator
- Memento
- Observer
- State
- Strategy

## Design Patterns 

### Factory Method

#### Definition
- Creating objects of similar types.
- Hides complexity of object creation.
- Client code has no idea about object creation.

#### Concept and Class Diagram
client code ---> factory class -----> ConcreteClasses

CreateVehicle("Heavy, 8") ----> CreateVehicle(p1, p2) ----> CreateVehicle(p1, p2){ if(p1 == "heavy" && p2 == 8) return createTruck(); else return createOtherVehicle();}
#### Analogy
A client requests for a good from factory and he gets it, a factory abstracts how the goods are made or what machinery is used.

#### Code walkthrough
Please go through the factory pattern example package.

#### Pros 
- guarantees abstraction
- code is flexible and adaptable
- Very useful for frameworks and libraries

#### Cons
- Complex code
- Time-consuming on boilerplate code.
- Not a pattern that can be refactored into (tough to migrate to this pattern from legacy code).
- Have to come up with end to end use cases or far sighted thinking.

### Builder Pattern

#### Definition
- Creational, Creating complex objects
- Replaces telescope constructor concept. (c1 -> c2 -> c3) [telescope constructures reduces the lines of code but the actual problem with permutation of various params remain same]

#### Analogy
- consider building an object with various features, where few features are optional and few are mandatory, but client can choose any combination of features.
- If we consider same problem in object creation we might need to create constructors for that object with all the permutations as arguments.

### Usability
(What's the difference between using a builder pattern and implementing a builder pattern)

- String builder is a builder class which helps you to concatenate the string one after another and finally returns an immutable string. It's the using of builder pattern.
- Implementation involves creating a inner class with same attributes as actual class, introduce setters with return as type of inner class thus helping for chaining while setting params.

#### Code walkthrough
Please go through builder pattern example package

#### Pros
- Good way to handle complex constructor objects.
- Relatively easy to implement.
- Can be easily refactored into.

#### Cons
- Class instance returned will be immutable.
- Uses inner static might be confusing.
- Sometimes no of lines of code can be huge during implementation.
- Have to think of end to end chain.


### Abstract Factory Method
#### Definition
- Factory of factory pattern
- Creating objects which belong to a family of similar objects.
- Implemented using a common interface.
- Example Java DocumentBuilder

#### Analogy
Consider it as factory of factories/ abstraction of factories where each factory again will implement factory pattern.

#### Code walkthrough
Please go through the abstract factory pattern example

#### Pros
- Follows Open Closed principle, Single Responsibility principle
- good for abstraction.
- loose coupling.

#### Cons
- Code becomes complex over the time.
- Pattern inside the pattern.

[//]: # (#### Definition)

[//]: # ()
[//]: # (#### Analogy)

[//]: # ()
[//]: # (#### Code walkthrough)

[//]: # ()
[//]: # (#### Pros)

[//]: # ()
[//]: # (#### Cons)

