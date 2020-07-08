import java.io.IOException;

public class Elementary {
    public static void main(String[] args) throws IOException {
        System.out.println("Programs\n" +
                "0: Exit\n" +
                "1: Hello World\n" +
                "2: Greeting\n" +
                "3: Greet Alice or Bob\n" +
                "4: Sum\n" +
                "4a: Sum O(1)\n" +
                "5: Sum Multiples of 3 or 5\n" +
                "6: Multiplication table to 12\n" +
                "7: Guessing game\n");
        boolean exit = false;
        do {
            String selection = Reader.read("Please select which program you would like to run: ");
            switch (selection) {
                case "0":
                    exit = true;
                    break;
                case "1":
                    Programs.helloWorld();
                    break;
                case "2":
                    Programs.greet();
                    break;
                case "3":
                    Programs.greetAliceAndBob();
                    break;
                case "4":
                    Programs.sum();
                    break;
                case "4a":
                    Programs.sumO1();
                    break;
                case "5":
                    Programs.sumMultiples3or5();
                    break;
                case "6":
                    Programs.printMultiplicationTable();
                    break;
                case "7":
                    Programs.guessingGame();
                    break;
                default:
                    System.out.println("Please enter a valid program number!");
                    break;
            }
        } while(!exit);
        Reader.close();
    }
}

