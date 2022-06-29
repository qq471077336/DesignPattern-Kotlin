# DesignPattern-Kotlin
## design pattern 
### Creational Patterns
#### Factory Method  
    Provides an abstraction or an interface and lets subclass or implementing classes decide which class or method should be
    instantiated or called, based on the conditions or parameters given.
#### Abstract Factory
    Provides one level of interface higher than the factory pattern. It is used to return one of several factories.
#### Builder
    Construct a complex object from simple objects step by step.
#### Prototype
    Cloning an object by reducing the cost of creation.
#### Singleton
    One instance of a class or one value accessible globally in an application.
    
### Structural Patterns
#### Adapter
    Convert the existing interfaces to a new interface to achieve compatibility and reusability of the unrelated classes
    in one application. Also known as Wrapper pattern.
#### Bridge
    Decouple an abstraction or interface from its implementation so that the two can vary independently.
#### Composite
    Build a complex object out of elemental objects and itself like a tree structure.
#### Decorator
    add additional features or behaviors to a particular instance of a class, while not modifying the other instances of same class

### Behavioral Patterns
#### Chain of Responsibility
    Let more than one object handle a request without their knowing each other. Pass the request to chained objects until
    it has been handled.
#### Command
    Streamlize objects by providing an interface to encapsulate a request and make the interface implemented by subclasses
    in order to parameterize the clients.
