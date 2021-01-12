package edu.cnm.deepdive;

public class VariableScope {

  static int myNewInt = 5;

  public static void main(String[] args) {
    int myLocalInt = 10;

    {
      int myOtherInt = 20;
      System.out.println("\nmyLocalInt = " + myLocalInt); //within scope in the inside curly braces.
      System.out.println("\nmyOtherInt = " + myOtherInt);
      System.out.println("\nmyNewInt = " + myNewInt); //within scope because it is a class variable.
    }
//    System.out.println("\nmyOtherInt = " + myOtherInt); out of scope (see curly braces).

    int myOtherInt = 30; // possible to use the same name as line 11 because different scope.
    System.out.println("\nmyLocalInt = " + myLocalInt);// this will print 30.
  }
}
