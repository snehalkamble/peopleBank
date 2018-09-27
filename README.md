# peopleBank --> Assignmeent
Assignment for PeopleBank


-----------------------------------------
The Solution.java class tests different classes for their functionalities.
-----------------------------------------

A.1.a
We can test if the Animal has valid properties - Walk, and cannot sing, fly, swim.
We can test if the Bird has valid properties - walk, fly, sing, and cannot swim.

A.1.b
For maintainibility, code is desinged to interfaces and inheritance. Set defaults in Interface, then implementing class can override this behavior.
Leveraging java 8 default methods in Interfaces to add new functionalty as and when required without affecting all implementing classes

A.3.b
Rooster can be a type of Chicken, just that it sings in a different way. This is implemented using inheritance.
Rooster can also be assosiated to a Chicken, then without inheritance, Rooster can be implemented separately.

A.3.c
Since Rooster and Chicken are heirarchial, Inheritance is the best way here.
Without Inheritance, a separate Rooster class can be written which DOES NOT extend from Chicken. Then, to give it the sing behavior, it can implement interface SING.

A.4.d
Parrot can be kept maintainable using ADAPTOR pattern. (ParrotAdaptor.java) 
As and when new behaviors are needed for the Parrot, the new behavior can be passed intto the Adaptor, and the Adaptor will behave based on the passed object.


-----------------------------------------
B.3.a
We can model a dolphin that swims without inheriting from a fish class.
Create a Dolphin class without inheritance, then add a SWIM behavior to it.

B.3.b
There is no code duplication since we only write NEW code for Dolphin.
Also, no overhead as we reuse old code like in this case, we reuse the SWIM interface.

-----------------------------------------