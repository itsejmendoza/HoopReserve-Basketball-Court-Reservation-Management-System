import java.util.*;

// Base class to hold common information for User and Reservation
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}

// User class inherits from Person class
class User extends Person {
    String contact, address;

    User(String name, String contact, String address) {
        super(name); // Call the constructor of the base class (Person)
        this.contact = contact;
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + ", Contact: " + contact + ", Address: " + address;
    }
}

// Reservation class to hold reservation information
class Reservation {
    static int counter = 1;
    String id, userName, startTime, endTime, date;

    Reservation(String userName, String startTime, String endTime, String date) {
        this.id = "R" + counter++;
        this.userName = userName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
    }

    void update(String startTime, String endTime, String date) {
        if (!startTime.isEmpty()) this.startTime = startTime;
        if (!endTime.isEmpty()) this.endTime = endTime;
        if (!date.isEmpty()) this.date = date;
    }

    @Override
    public String toString() {
        return "Reservation ID: " + id + ", Name: " + userName + ", Date: " + date +
                ", Start Time: " + startTime + ", End Time: " + endTime;
    }
}

// Main class to manage user input and reservation flow
class ReservationManager {
    private User user;
    private Reservation reservation;
    private Scanner scanner = new Scanner(System.in);
    private List<Reservation> reservations = new ArrayList<>(); // List to store reservations

    void registerUser() {
        System.out.println("Let's register you for the basketball court reservation.");
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your contact number: ");
        String contact = scanner.nextLine();
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        user = new User(name, contact, address);
        System.out.println("\nWelcome, " + name + "! You've been registered.");
    }

    // Method to check if a reservation already exists for a given date and time
    boolean isDateAvailable(String date, String startTime, String endTime) {
        for (Reservation res : reservations) {
            // Check if the date overlaps with any existing reservation
            if (res.date.equals(date) && 
               ((startTime.compareTo(res.endTime) >= 0 && startTime.compareTo(res.startTime) > 0) || 
                (endTime.compareTo(res.startTime) <= 0 && endTime.compareTo(res.endTime) < 0))) {
                continue; // No conflict if times do not overlap
            } else if (res.date.equals(date)) {
                return false; // Date is already reserved
            }
        }
        return true; // Date and time are available
    }

    void createReservation() {
        if (user == null) {
            System.out.println("You need to register first!");
            return;
        }
        System.out.println("Let's create a reservation.");
        System.out.print("Enter reservation date (yyyy-mm-dd): ");
        String date = scanner.nextLine();
        System.out.print("Enter start time (HH: mm): ");
        String startTime = scanner.nextLine();
        System.out.print("Enter end time (HH: mm): ");
        String endTime = scanner.nextLine();

        if (!isDateAvailable(date, startTime, endTime)) {
            System.out.println("Sorry, the requested date and time is already reserved.");
            return;
        }

        reservation = new Reservation(user.name, startTime, endTime, date);
        reservations.add(reservation); // Add the reservation to the list
        System.out.println("\nYour reservation has been created: " + reservation);
    }

    void updateReservation() {
        if (reservation == null) {
            System.out.println("No reservation to update.");
            return;
        }
        System.out.println("Update your reservation.");
        System.out.print("Enter new start time (or press Enter to keep the same): ");
        String startTime = scanner.nextLine();
        System.out.print("Enter new end time (or press Enter to keep the same): ");
        String endTime = scanner.nextLine();
        System.out.print("Enter new date (or press Enter to keep the same): ");
        String date = scanner.nextLine();

        reservation.update(startTime, endTime, date);
        System.out.println("Your reservation has been updated: " + reservation);
    }

    void cancelReservation() {
        if (reservation == null) {
            System.out.println("No reservation to cancel.");
            return;
        }
        System.out.print("Are you sure you want to cancel your reservation? (yes/no): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            reservations.remove(reservation); // Remove the reservation from the list
            reservation = null;
            System.out.println("Your reservation has been canceled.");
        } else {
            System.out.println("Cancellation aborted.");
        }
    }

    // Updated receipt printing method as per new format
    void printReceipt() {
        if (reservation == null) {
            System.out.println("No reservation found to print a receipt.");
            return;
        }
        // Printing the formatted receipt
        System.out.println("------------------------------------------------------");
        System.out.println("    Reservation Receipt    ");
        System.out.println("-----------------------------------------------------");
        System.out.println("Paharang West Basketball Court\n");
        System.out.println("Full Name: " + user.name);
        System.out.println("Contact Number: " + user.contact);
        System.out.println("Address: " + user.address);
        System.out.println("Date: " + reservation.date);
        System.out.println("Start Time: " + reservation.startTime);
        System.out.println("End Time: " + reservation.endTime);
        System.out.println("\nTHANK YOU FOR YOUR RESERVATION AND ENJOY!");
        System.out.println("-----------------------------------------------------");
        System.out.println("PAHARANG WEST BASKETBALL COURT");
        System.out.println("09655005268");
        System.out.println("pwbcc@gmail.com");
        System.out.println("\nSCREENSHOT THIS RECEIPT FOR YOUR REFERENCE!");
        System.out.println("-----------------------------------------------------");
    }

    void start() {
        while (true) {
            System.out.println("\nWelcome to the Basketball Court Reservation System!\n");
            System.out.println("Please choose an option:");
            System.out.println("1. Register           - Press 1 if you want to register");
            System.out.println("2. Create Reservation - Press 2 to create a reservation");
            System.out.println("3. Update Reservation - Press 3 to update your reservation");
            System.out.println("4. Cancel Reservation - Press 4 to cancel your reservation");
            System.out.println("5. Print Receipt      - Press 5 to print your reservation receipt");
            System.out.println("6. Exit               - Press 6 to exit the system");
            System.out.print("\nPlease choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left over

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    createReservation();
                    break;
                case 3:
                    updateReservation();
                    break;
                case 4:
                    cancelReservation();
                    break;
                case 5:
                    printReceipt();
                    break;
                case 6:
                    System.out.println("Thank you for using the reservation system! Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
} // <-- Missing closing brace added here for the ReservationManager class

public class HoopReserve {
    public static void main(String[] args)  throws Exception {
        new ReservationManager().start();
    }
}
