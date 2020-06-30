import java.io.IOException;

public class Elementary {
    public static void main(String[] args) throws IOException {
        System.out.println("Programs\n" +
                "0: Exit\n");
        boolean exit = false;
        do {
            String selection = Reader.read("Please select which program you would like to run: ");
            switch (selection) {
                case "0":
                    exit = true;
                    break;
                default:
                    System.out.println("Please enter a valid program number!");
                    break;
            }
        } while(!exit);
        Reader.close();
    }
}

