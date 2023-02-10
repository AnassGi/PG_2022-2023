import java.io.*;
import java.util.Scanner;

public class ReadFileWithInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introdueix el nom del document: ");
    String fileName = sc.nextLine();
    if (!fileName.endsWith(".txt")) {
      fileName = fileName + ".txt";
    }
    try {
      File file = new File("files/" + fileName);
      BufferedReader reader = new BufferedReader(new FileReader(file));
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    } catch (Exception e) {
      System.out.println("Error al llegir el fitxer");
    }
  }
}
