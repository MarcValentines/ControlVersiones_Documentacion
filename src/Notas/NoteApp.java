package Notas;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class NoteApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Content: ");
        String content = scanner.nextLine();

        Note note = new Note(title, content);
        note.display();

        try (FileWriter writer = new FileWriter("notes.txt", true)) {
            writer.write(note.toFileFormat() + "\n");
            System.out.println("Note saved.");
        } catch (IOException e) {
            System.out.println("Failed to save note: " + e.getMessage());
        }
    }
}
