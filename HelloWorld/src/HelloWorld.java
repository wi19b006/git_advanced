public class HelloWorld {
	public static void main(String[] args) {
		if(args!=null && args.length>1) {
			System.out.println("Hello Arguments");
			for (String arg : args) {
				System.out.println(arg);
			}
		}
		else {
			System.out.println("Hello World");			
		}
	}
}