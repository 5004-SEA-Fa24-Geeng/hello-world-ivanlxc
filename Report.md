# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
Please link your UML design file here. See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].


```mermaid
---
title: Aloha World UML
---
classDiagram
    direction LR
    AlohaWorld --> Greeter 
    AlohaWorld --> ConsoleView : uses
    ConsoleView --> Greeter : uses
    class AlohaWorld {
        + main(String[] args) : void     
    }
    class Greeter {
        - name : String
        - locality : int
        - localityList : List<String>
        + Greeter(String name)
        + Greeter(String name, int locality)
        + getName() : String
        + getLocality() : int
        + setLocality(int locality) : void
        + greet() : String
        + greet(boolean asciiOnly) : String
        - getLocalityString() : String
        + hashCode() : int
        + equals(Object obj) : boolean
        + toString() : String
    }
    class ConsoleView {
        - SCANNER : scanner
        - LOCALITY_OPTIONS : List<String>
        - ConsoleView()
        + getName(): String
        + getLocality(): int
        + checkRunAgain(): boolean
        + printGreeting(String greeting): void
    }
```


### Program Flow
Write a short paragraph detailing the flow of the program in your own words. This is to help you understand / trace the code (and give you practice of something called a code walk that will be required in this course).

> AlohaWorld is the "Driver" of the program, it only contain the main method and is the start of the entire program. It initiates the ConsoleView class to collect user input including name and locality, view the greeting, and determine whether to continue and loops until user inputs “no”. The Greeter class is used to generate the greeting message, and then the greeting message is going to be shown in the ConsoleView.

## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   * (example) `final class`
   * `static`
   * `Scanner class`
   * `new`

2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * (example) The `final` keyword when used on a class prevents the class from being subclassed. This means that the class cannot be extended by another class. This is useful when you want to prevent a class from being modified or extended[^1] . It is often the standard to do this when a class only contains static methods such as driver or utility classes. Math in Java is an example of a final class[^2] .
    * `static`: A static method can be accessed without creating an object of the class first. https://www.w3schools.com/java/ref_keyword_static.asp
    * `Scanner class`: The Scanner class is used to read the user input. https://www.w3schools.com/java/java_user_input.asp
    * `new`: The new keyword creates new objects. Just like in our Greeter class, we have Greeter greeter = new Greeter(name, locality), where the `new` is used to create a Greeter object. https://www.w3schools.com/java/ref_keyword_new.asp



3. What does `main` do in Java? 

   `main` method is the entry point of a program, it initializes the execution of other methods and classes in the program. If there are no `main` method, the program may be able to compile but will not run properly.   


4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?

    `toString()` method provides a string representation of an object, and we can modify how objects are printed. For any object class we create, there should be a `toString()` method because it can represent more meaningful descriptions and information if we overrides the default return option.
   

5. What is javadoc style commenting? What is it used for? 

   Javadoc-style commenting is a way to write comments in Java using /** ... */, documenting detailed descriptions of classes, methods, and constructors. These comments can be processed by the javadoc tool to generate HTML documentation.
   It is mainly used for explaining what the code does, its purpose, and how to use it.


6. Describe Test Driving Development (TDD) in your own words. 

    Test-Driven Development (TDD) is a programming approach where you write tests before writing the actual code. By writing tests before actually writing the code, one can ensure that the code meet the requirements and catches bug early.


7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 


## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?

   Keeping client interaction in ConsoleView helps keep the program organized, and keep each class focus on their specific job. This also makes the code easier to test, change, and maintain.

2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.
   
   To make the program more dynamic, we may try to store greetings and their corresponding languages in a separate file like a JSON file. We modify our current program for it to query from the database at runtime to load greetings dynamically.


> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: Final keyword in Java: 2024. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2024-03-30. 

[^2]: Math (Java Platform SE 17). https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html. Accessed: 2024-03-30.


<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java