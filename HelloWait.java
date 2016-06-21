public class HelloWait {

    public static void main(String[] args) 
        throws InterruptedException {
      int time = 1000;
      int num;
      if (args.length > 0){
        num = Integer.parseInt(args[0]);
	time = 1000 * num;
      }
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, Wait");
        Thread.sleep(time);
        System.out.println("Goodbye!");
    }

}

