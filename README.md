# Delivery-System-Design-Patterns
Implementation of multiple design pattterns through pre-existing classes of a delivery management system

## Singleton.Depot class - using the singleton pattern

## Flyweight.DeliverySettings - using the flyweight pattern
- This might be the class we create the most objects of, making the optimization of the flyweight pattern as optimal as possible by consuming much less memory overall through its instances. It also has quite a lot of "redundant" values for some attributes.
- Even more beneficial if we want to store "Template settings" for users, and add a functionality to use the last used delivery settings.
- Split up the extrinsic and intrinsic attributes, with the latter being added in the newly added flyweight class.
- The flyweight class is instantiated through a factory, which only creates a new object of it if none with the same requested attribute combination exist.

## Observer.NotificationService - using the observer pattern
### Related classes:
- Observer.EventListener **interface**
- Observer.EmailMsgListener **class** to handle email notifications
- Observer.MobileAppListener **class** to handle app notifications

## Payment - using strategy pattern
- Involves composition of types of payment 
- changes the behavior of context by delegating certain methods to the helper object such that both customer will enter payment information adn pay but the path taken will be dependent on the payment option the customer chooses

## OrderHistory - using the iterator pattern
- Provides several option of traversal regardless of the type of data
- Option will be provided to either view Order History in ascending or descending order which will require different traversal methods 

## DeliveryRequest - using the abstract factory pattern
- Comprises two factories that specify and manage each delivery request based on whether it is standard or express.
- It can be updated if more products/specifications for a delivery are needed, like the item category and vehicle type for a delivery.

## VehicleType - using the bridge pattern
- Specifies which vehicle type is allowed for which customer, and maintains the loose coupling between the abstraction and implementation heirarchies.
- Allows for the introduction of additional types of vehicles and the ability to modify their applicability to different customer groups.
