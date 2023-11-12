import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

class ReadAndWriteFromFile1 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try{
            System.out.println("Please type something");
            writeFile();

            System.out.println("Your text file has been updated. Now we will read another file for you.");
            System.out.println();

            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("exception is handled");
        }
    }

    public static void readFile() throws FileNotFoundException {

        File fileToRead = new File("src/main/resources/input.txt");

        Scanner scanner = new Scanner(fileToRead);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void writeFile() throws FileNotFoundException {
        File fileToWrite = new File("src/main/resources/output.txt");
        PrintWriter printWriter = new PrintWriter(fileToWrite);

        printWriter.println(scanner.nextLine());
        printWriter.close();
    }

}
