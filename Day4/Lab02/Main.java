/*ห้ามแก้ไฟล์ Main */
/*ห้ามแก้ไฟล์ Main */
/*ห้ามแก้ไฟล์ Main */
/*ห้ามแก้ไฟล์ Main */
/*ห้ามแก้ไฟล์ Main */
package Lab02;


// Define the Main class
public class Main {
  // Main method, entry point of the program
  public static void main(String[] args) {
    // Create a new Airplane object 
    Airplane flight1 = new Airplane("CDE345", "London","Thai Airways",25);
    // Create a new Airplane object 
    Airplane flight2 = new Airplane("KUI765", "New York","United Airlines",41);
    // Create a new Airplane object 
    Airplane flight3 = new Airplane("JUY456", "Paris","Thai Lion Air",74);
    // Create a new Airplane object 
    Airplane flight4 = new Airplane("KMITL01","LKB","KMITL AIRLINE",99);
    // Print the initial flight status
    System.out.println("Flight Status:");
    // Check and print the status of flight1
    flight1.checkStatus();
    // Check and print the status of flight2
    flight2.checkStatus();
    // Check and print the status of flight3
    flight3.checkStatus();
    flight4.checkStatus();
    // change destination for flight2
    flight2.changeDestination("BKK");
    // Set Delay time for flight2
    flight2.setDelay(60);
    // Set Delay time for flight3
    flight3.setDelay(20);
    // change gate for flight2
    flight2.changeGate(74);
    flight4.changeGate(71);
    // Print the current flight status after delays
    System.out.println("\nCurrent Flight Status:");
    // Check and print the status of flight1
    flight1.checkStatus();
    // Check and print the status of flight2
    flight2.checkStatus();
    // Check and print the status of flight3
    flight3.checkStatus();
    System.out.println(flight1);
    System.out.println(flight2);
    System.out.println(flight3);
    System.out.println(flight4);

  }
}

/*ห้ามแก้ไฟล์ Main */
/*ห้ามแก้ไฟล์ Main */
/*ห้ามแก้ไฟล์ Main */
/*ห้ามแก้ไฟล์ Main */
/*ห้ามแก้ไฟล์ Main */

