
public class MethodOverloading {
	 private static void display(char a){
	        System.out.println('V');
	    }

	    // this method  accepts String object
	    private static void display(String a){
	        System.out.println("Vyshna");
	    }

	    public static void main(String[] args) {
	      display('h');
	      display("World");
	    }

}
