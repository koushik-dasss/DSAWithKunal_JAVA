/*
Types of Languages :-

Programming langauge :- A language which connects us with the computer for solving a problem.
The language of the computer is just a bunch of 0s and 1s.
Binary digits => 0s & 1s




Prodecural 
Functional
Object Oriented 


Procedural :- 

1) Specifies a series of well structered steps  and procedures to compose a program.
2) Contains a systematic order of statements , functions and commands to complete a task.

Ex - JAVA , C , C++ , Python etc.

Functional :-

1) Writing a program only in pure functions i.e. never modify variables , but only create new ones as an output .
2) Used in situations where we have to perform lots of different operations on the same set of data , like ML.
3) First class functions =>  Reassigning of functions just like variables

a = 10 ;
b =  a ;
c = b ;

Object oriented :-

1) Revolves around objects.
2) Code + Data = Object
3) Developed to make it easier to develop , debug , reuse and maintain software .


Class is a template through which objects are made.


Ex :- a = 10 , reference variable = a , object = 10


Static vs Dynamic languages 

1) Static lamguages perform the type checking at compile time 
Dynamic languages perform type checking at runtime.

2) Errors will show at compiler time in static languages  
In dynamic languages , errors will show after program is run.

3) In Static , declare datatype of variable before you use it .
In Dynamic , no need to declare datatype of variables.

4) SL have more control 
DL saves time in writing code but might give error in the runtime

LHS (reference variable) => compile time
RHS (object) => runtime

int a = 10 ; (JAVA) (Static , compile time type checking)
a = 10 (python) (Dynamic , runtime type checking)

Source code => Byte code => Machine code (Compilation)

In DL , Program has been compiled , then during the running , it gets specified with  the data type.(runtime auto specification)
In SL , Program has been compiled , during that time only the data type is to be declared first.(compile time mention)

int a = "koushik" // error (compile time, static)

a = 10 (dynamic, runtime )
a = "koushik" // no error

Data type of a is changed from int data type to string data type.
(reference variable and object's memory location is changed)

int a  = 10 ; ( a variable is of int data type)
a = "koushik"; // error in static languages 
a = 65; 
OR
String a = "koushik";


Memory management:-


a = 10 
a = reference variable
10= object

Stack memory has the reference variable i.e. a 
Heap memory has the object i.e. 10

a is pointing towards the memory , where  the object lies. 

Every object has a memory location .

Actual value of a is not 10 , it's just a reference variable pointing towards the object.

Important takeaways :-

1) More than one reference variables can point towards the same object.
2) If the object is changed for one of the reference variable , then it's changed for all the reference variables.


(Immutable and primitive data types are exceptions  )

Pass by reference value (JAVA)
Pass by object's value 

a = [1,3,5,9]
b = a 
b = [1,3,5,9]
a[0] = 99
b = [99,3,5,9]


If no reference variable points towards an object , then the object is hit by garbage collection .

a = 10; // 10 is hit by garbage collection
a = 37;

First , reference variable a was pointing towards the memory location of object 10 
Then , it points towards the object 37.


*/