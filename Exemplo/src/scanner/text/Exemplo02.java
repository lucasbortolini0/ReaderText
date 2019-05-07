package scanner.text;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exemplo02 {

    public static void main(String args[]) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("C:\\Users\\lucas.bortolini\\workspace\\Exemplo\\arquivo.txt"));
        scanner.useDelimiter("\\n");
   
        while (scanner.hasNext()) {
            System.out.println( scanner.next() );
        }
        scanner.close();
        
    }

}