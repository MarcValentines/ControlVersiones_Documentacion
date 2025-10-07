package Notas;
import java.util.Scanner;

public class NoteApp {
    public static void main(String[] args) {
        System.out.println("Welcome to SmartNotes!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter note title: ");
        String title = scanner.nextLine();

        System.out.print("Enter note content: ");
        String content = scanner.nextLine();

        Note note = new Note(title, content);
        note.display();
    }
}