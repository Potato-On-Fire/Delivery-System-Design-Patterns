# Delivery-System-Design-Patterns
Implementation of multiple design pattterns through pre-existing classes of a delivery management system

## Singleton.Depot class - using the singleton pattern

## Flyweight.DeliverySettings - using the flyweight pattern
- This might be the class we create the most objects of, making the optimization of the flyweight pattern as optimal as possible by consuming much less memory overall through its instances. It also has quite a lot of "redundant" values for some attributes.
- Even more beneficial if we want to store "Template settings" for users, and add a functionality to use the last used delivery settings.
- Split up the extrinsic and intrinsic attributes, with the latter being added in the newly added flyweight class.
- The flyweight class is instantiated through a factory, which only creates a new object of it if none with the same requested attribute combination exist.

## LegacyDeliverySystem to ModernDeliverySystem - using the adapter pattern
- Assumptions: The adapter will work as intended assuming that the legacy system was working completely fine before using the adapter for further deployement, and that the modern system is correctly implemented with the replaced functionality, and can communicate the same way the legacy system did with other components.
- DeliverySystemAdapter migrates legacy system to a more modern one, acts as a helpful tool in deploying the modern system in parallel with the legacy one.
- Some functionality in the modern system are adapted using the created adapter, while others that are unchanged are used within the adapter given the previous functionality of the LegacyDeliverySystem.
- Applies Open-closed principle, any changes added to the delivery system can be integrated and deployed using the adapter class.


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
