package Notas;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

import java.io.IOException;
import java.util.Scanner;

public class NoteApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter note ID (integer): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Enter note title: ");
        String title = scanner.nextLine();

        try {
            Note note = new Note(id, title); // Constructor con IOException
            note.display();
        } catch (IOException e) {
            System.out.println("Error loading note content from file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
