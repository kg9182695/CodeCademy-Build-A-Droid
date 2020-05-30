// Start by defining the class Droid.
/*
The Droid.java file is empty.
Start by defining the class Droid.
Don’t forget to include a main() method! You can leave it empty for now.
We want a Droid object that has the following state:
name
battery level
and the following behavior:
performing a task
stating its battery level*/
public class Droid{
  int batteryLevel;
  String name;
/*Create a constructor method for the Droid class.
The method should have one parameter of String droidName.*/
  public Droid(String droidName){
    /*Inside the constructor, assign the parameter value of droidName to the appropriate instance field.
Set the value of batteryLevel to 100. Every new instance of Droid will have a batteryLevel of 100. */
    name = droidName;
    batteryLevel = 100;


  }
  /* 
Define a new method: performTask(). This method should have a single parameter: String task.

This method does not return any value.
*/
  public void performTask(String task){
    System.out.println(name + "is performing task " + task);
    // After the print statement, set batteryLevel to be 10 less than it was before.
    batteryLevel = batteryLevel - 10;

  }
  public void energyReport(int remainingBatteryLevel){
    batteryLevel = remainingBatteryLevel;
    System.out.println(name + "'s" + " remaining battery is " + remainingBatteryLevel);
  }
  /*
  Define a toString() method within Droid
  Inside toString(), return a string that introduces the Droid using their name.
  */
  public String toString() {
    return "Hello, I'm the droid: " + name;
  }
/* 
Inside main(), create a new instance of Droid named "Codey"
Have your Droid instance perform some tasks inside of main().
*/

  public static void main(String[] args){
    Droid Codey = new Droid("Codey");
    System.out.println(Codey);
    Codey.performTask("DAncing");
    Codey.energyReport(91);

  }
  
}