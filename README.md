# Delivery-System-Design-Patterns
Implementation of multiple design pattterns through pre-existing classes of a delivery management system

## Depot class - using the singleton pattern

## DeliverySettings - using the flyweight pattern

## NotificationService - using the observer pattern

## Payment - using strategy pattern
- Involves composition of types of payment 
- changes the behavior of context by delegating certain methods to the helper object such that both customer will enter payment information adn pay but the path taken will be dependent on the payment option the customer chooses

## OrderHistory - using the iterator pattern
- Provides several option of traversal regardless of the the type of data
- Option will be provided to either view Order History in ascending or descending order which will require different traversal methods 
 
### Related classes:
- EventListener **interface**
- EmailMsgListener **class** to handle email notifications
- MobileAppListener **class** to handle app notifications
