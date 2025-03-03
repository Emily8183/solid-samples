The ***Builder Pattern*** is a creational design pattern that allows you to construct complex objects step by step while keeping the construction logic separate from the object representation. It is particularly useful when an object has multiple optional parameters.  
  
1) Mandatory vs. Optional Parameters 
   
2) Builder Can Be a Static Inner Class

Because each setter method (setDessert(), setAppetizer()) returns the same object (this), you can call them back-to-back in a single statement. This is called method chaining.  

***About "return this", How It Works Step-by-Step***
First, new MealBuilder(fullMainDish, fullSideDish, fullDrink) creates a MealBuilder object.  
Then .setDessert(fullDessert) is called on that object, which updates the dessert field and returns this (the same MealBuilder object).  
Then .setAppetizer(fullAppetizer) is called on that same object, updating the appetizer field.  
Finally, .build() is called, which returns the final Meal object.  