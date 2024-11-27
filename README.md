<div align="center">
  <img src="https://github.com/itsejmendoza/HoopReserve/blob/main/images/HoopReserve.png" alt="HoopReserve Logo" width="290" height="260">

# HoopReserve-Basketball-Court-Reservation-Management-System
A community basketball court reservation system. Made to play, built to be fair..

  <p><b>IT 2104</b><br>
  <a href="https://github.com/itsejmendoza">Mendoza, Elthon-Jhon M.</a></p>

   
  <hr class="w-48 h-1 mx-auto my-4 bg-gray-100 border-0 rounded md:my-10 dark:bg-gray-700">
</div>

<details>
  <summary><strong>Table of Contents</strong></summary>
  
  1. [Project Overview](#project-overview)  
  2. [Application of OOP Principles](#application-of-oop-principles)   
  3. [Integration with SDG](#integration-with-sdg)  
  4. [Running the Program](#running-the-program)
  5. [Gratitude Statement](#gratitude-statementa)
</details>

---

### Project Overview 
**HoopReserve** makes reserving local basketball courts easy and fair. By allowing users to book court time in advance, it helps prevent conflicts over who gets to play, ensuring everyone has an equal opportunity. The simple booking process lets players plan their games without hassle, so they can focus on enjoying the sport. It's not just about convenience—it's about building a respectful, connected community where everyone has a fair chance to use the court.

 <hr class="w-48 h-1 mx-auto my-4 bg-gray-100 border-0 rounded md:my-10 dark:bg-gray-700">
</div>

### Application of OOP Principles
In developing **HoopReserve**, core Object-Oriented Programming (OOP) principles were applied to create a system that is organized and easy to manage. Here's how each principle was implemented:

**Inheritance**
  -  One class can inherit features (like attributes and methods) from another class.
  -  The `User` and `Reservation` classes inherit from a `Person` class. This way, both share the `name` property, reducing repetition.

**Encapsulation**
  -	 Keeping data safe inside a class and providing methods to access or update it.
  -	 The `User` and `Reservation` classes hide sensitive details (like `contact`, `address`, and reservation times) and only allow controlled access through methods.

**Polymorphism**
  -  The ability for the same method to work in different ways based on the object it's acting on.
  -	 The `toString()` method is customized in both the `User` and `Reservation` classes to print different details based on the object type.
    
**Abstraction**
  -  Hiding complex details and showing only the essentials.
  -	 The user interacts with simple methods like `registerUser()` and `createReservation()` without needing to know how everything works behind the scenes.

 <hr class="w-48 h-1 mx-auto my-4 bg-gray-100 border-0 rounded md:my-10 dark:bg-gray-700">
</div>




