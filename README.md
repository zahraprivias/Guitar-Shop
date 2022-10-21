# Guitar-Shop
Simple guitar shop Java program. Demonstrates ability in using Object Oriented Programming (Encapsulation and Polymorphism).

## Case  
GuitarCenter is an old shop that sells guitars. Because the cost of printing a new catalogue everytime is getting higher, they decided to invest their money on Nicholas, an app designer to create a program that list all of the Guitar, unfortunately Nicholas can’t code. You as a good programmer, you must help Nicholas make this program based on the following criteria using Java Programming Language:  

•	In the beginning, the program will show 4 menus:  
1.	Insert Guitar  
2.	View Guitar Catalogue  
3.	Delete Guitar  
4.	Exit  

•	If the user chooses menu 1 ‘Insert Guitar’, then:  
o	Ask the user to choose between Accoustic, Electric, or Cancel  
o	Then if the user chooses either Electric or Accoustic, the program will ask the user to input Guitar details, which consists of:  
1.	Model, which length must be between 5 and 10 characters.  
2.	Brand, which must be either ‘Yamaha’, ‘Fender’, or ‘Cort’ (Case sensitive). 
3.	Number of Strings, which must be between 6 and 8  
4.	If the user chose Electric, then:  
5.	Includes Amp?, which must be ‘Yes’ or ‘No’ (Case Insensitive).  
6.	If the user chose Accoustic, then:  
7.	Is Hybrid?, which must be ‘Yes’ or ‘No’ (Case Insensitive).  
o	If the user choose Cancel, then Return to main menu.  
o	After successfully input all data, then calculate the price with the following formula:  
**Total Price = Base Price + (150000 * Number of Strings) + (Extra Feature)**  
|**Brand**|**Base Price**|
|Yamaha|1500000|
|Fender|2000000|
|Cort|1000000|  
|**Guitar Type**|**Extra Price**|**Price**|
|Electric|WithAmp|1000000|
|Accoustic|Is Hybrid|500000|  
o	You must create an abstract method ‘calculatePrice’ in the superclass and then each subclass must implements the method to override its formula.  
o	After that, add the data to Array / Vector / ArrayList.  
o	Finally, show the message "New guitar added!”.  






