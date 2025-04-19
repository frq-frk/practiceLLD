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
- Not a pattern that can be refactored into (tough to migrate to this pattern from legacy code)

[//]: # (#### Definition)

[//]: # ()
[//]: # (#### Analogy)

[//]: # ()
[//]: # (#### Code walkthrough)

[//]: # ()
[//]: # (#### Pros)

[//]: # ()
[//]: # (#### Cons)

