package constructor;

public class Main {
		  private String name;

		  // constructor
		  Main() {
		    System.out.println("Constructor Called:");
		    name = "VYSHNA";
		  }

		  public static void main(String[] args) {

		    Main obj = new Main();
		    System.out.println("The name is " + obj.name);
		  }
		
}
