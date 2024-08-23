## Design Pattern
<hr>

### Strategy Pattern
<hr>

**Scenario**

Class A performs a specific task. We receive a requirement to change how it performs that task (behaviour). To achieve this, we might inherit from class A and override the task. However, what if class A has multiple tasks, and each child class needs to modify these tasks differently?

In the bigger picture, we end up with a bunch of child classes (or instances of the parent class A) doing the same work as class A, but each with its own way of implementation.
<hr>

**Problem**

1. **Code Duplication:** If multiple subclasses share the same behavior, each one would have to implement the same code, leading to redundancy.

2. **Increased Risk of Bugs:** Making changes to the behavior in the base class can inadvertently introduce bugs across all subclasses, as the changes propagate to every inherited class.

3. **Inflexibility at Runtime:** You cannot easily change the behavior of a class at runtime, as the behavior is tied to the specific subclass implementation and decided at compile time.

<hr>

**Solution**

The Strategy pattern suggests that you take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes called strategies.

The original class, called context, must have a field for storing a reference to one of the strategies. The context delegates the work to a linked strategy object instead of executing it on its own.

    NOTE: Context can be either a CONCRETE class or ABSTRACT class.

The context isn’t responsible for selecting an appropriate algorithm for the job. Instead, the client passes the desired strategy to the context. In fact, the context doesn’t know much about strategies. It works with all strategies through the same generic interface, which only exposes a single method for triggering the algorithm encapsulated within the selected strategy.

This way the context becomes independent of concrete strategies, so you can add new algorithms or modify existing ones without changing the code of the context or other strategies.

![StrategyPattern](../images/strategypattern.png)

    NOTE: Client can either be a new Class or instance of Context

<hr>

**Strategy Pattern**

*The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from
clients that use it.*
<hr>
