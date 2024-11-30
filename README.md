<div align="center">
  <img src="https://github.com/itsejmendoza/HoopReserve-Basketball-Court-Reservation-Management-System/blob/main/IMAGE/HoopReserve.png" alt="HoopReserve Logo" width="290" height="260">

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

### Integration with SDG 
<div align="center">
  <img src="https://github.com/itsejmendoza/HoopReserve-Basketball-Court-Reservation-Management-System/blob/main/IMAGE/SDG%20Goal%2011.png" alt="SDG Goal 11" width="900">
</div>

**Sustainable Development Goal (SDG) 11: Sustainable Cities and Communities :**
  HoopReserve aligns perfectly with Sustainable Development Goal (SDG) 11: Sustainable Cities and Communities. By offering a fair and respectful system for reserving basketball courts, it promotes inclusivity, prevents conflicts, and ensures everyone has equal access to community spaces. Beyond fairness, structured bookings allow for better maintenance planning, keeping courts clean, safe, and enjoyable for all. This isn’t just about convenience—it’s about fostering respect, connection, and sustainability in urban communities. HoopReserve helps create vibrant, well-managed spaces where everyone can come together and play.

 <hr class="w-48 h-1 mx-auto my-4 bg-gray-100 border-0 rounded md:my-10 dark:bg-gray-700">
</div>

### Instructions for Running the HoopReserve Basketball Court Reservation System

Once the program is running, you'll interact with it through the console. Here is the typical flow of interaction:
 **Starting the Program** 
   -	Run the program in a java environment.
   -	Upon starting, you will see a welcome message and a main menu with the following options:
   -	Enter the number corresponding to the action you want to perform.
     
 <div align="right side">
  <img src="https://github.com/itsejmendoza/HoopReserve-Basketball-Court-Reservation-Management-System/blob/main/IMAGE/Starting%20the%20Program.png" alt="Register a User" width="370" height="200">
</div>

**Register User:**
  -  When you choose option 1, you'll be prompted to enter your full name, contact number, and address. This information will be stored in the User class.

 <div align="right side">
  <img src="https://github.com/itsejmendoza/HoopReserve-Basketball-Court-Reservation-Management-System/blob/main/IMAGE/Register%20a%20User.png" alt="Register a User" width="370" height="200">
</div>
    

**Create Reservation:**
 -	Option 2 allows you to create a reservation by entering a date and time for the reservation. This information is stored in the Reservation class, associated with the registered user.

 <div align="right side">
  <img src="https://github.com/itsejmendoza/HoopReserve-Basketball-Court-Reservation-Management-System/blob/main/IMAGE/Creating%20a%20Reservation.png" alt="Register a User" width="500" height="200">
</div>
    

**Update Reservation:**
 -	Option 3 lets you update an existing reservation. You can modify the date, start time, and end time. If you leave any of these fields empty, the program will keep the existing values.

 <div align="right side">
  <img src="https://github.com/itsejmendoza/HoopReserve-Basketball-Court-Reservation-Management-System/blob/main/IMAGE/Updating%20a%20Reservation.png" alt="Register a User" width="550" height="220">
</div>

**Cancel Reservation:**
 -	Choosing option 4 allows you to cancel an existing reservation. You'll be asked for confirmation before proceeding with the cancellation.

<div align="right side">
  <img src="https://github.com/itsejmendoza/HoopReserve-Basketball-Court-Reservation-Management-System/blob/main/IMAGE/Canceling%20a%20Reservation.png" alt="Register a User" width="500" height="180">
</div>

**Print Receipt:**
 -	With option 5, you can print a formatted receipt that includes the reservation details such as the user's name, contact number, reservation date, and time.

<div align="right side">
  <img src="https://github.com/itsejmendoza/HoopReserve-Basketball-Court-Reservation-Management-System/blob/main/IMAGE/Print%20a%20Receipt.png" alt="Register a User" width="400" height="440">
</div>

**Exit:**
 -	Option 6 allows you to exit the program.

<div align="right side">
  <img src="https://github.com/itsejmendoza/HoopReserve-Basketball-Court-Reservation-Management-System/blob/main/IMAGE/Exiting%20the%20Program.png" alt="Register a User" width="400" height="120">
</div>


<hr class="w-48 h-1 mx-auto my-4 bg-gray-100 border-0 rounded md:my-10 dark:bg-gray-700">
</div>

### Gratitude Statement 🫡

`I want to thank God for the guidance, my family for their love, my friends for their support, and Professor Mr. Jayson Abratique for her guidance and wisdom. Thank you all for being part of this project journey.`

