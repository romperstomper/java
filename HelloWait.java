public class HelloWait {

    public static void main(String[] args) 
        throws InterruptedException {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, Wait");
        Thread.sleep(1000);
        System.out.println("Goodbye!");
    }

}

