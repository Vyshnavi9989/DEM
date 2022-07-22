package constructor;

public class PC {

		  String Friends;

		  // constructor accepting single value
		  PC(String frds) {
		    Friends = frds;
		    System.out.println(Friends + " Best Friend");
		  }

		  public static void main(String[] args) {

		    // call constructor by passing a single value
		    PC obj1 = new PC("VYSHNA");
		    PC obj2 = new PC("RAMU");
		    PC obj3 = new PC("SRAVS");
		  }
	
}
