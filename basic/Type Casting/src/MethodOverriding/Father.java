package MethodOverriding;

public class Father {

	 protected void displayInfo() {
	      System.out.println("I am Father");
	   }
	}

	class Child extends Father {
	   public void displayInfo() {
	      System.out.println("I am a Child");
	   }
	}

	class Main {
	   public static void main(String[] args) {
	      Child d1 = new Child();
	      d1.displayInfo();
	   }

}
