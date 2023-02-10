import java.io.*;

public class ReadFile {
  public static void main(String[] args) {
    try {
      File file = new File("files/document.txt");
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
