package Notas;

public class Note {
    private static int counter = 1;
    private int id;
    private String title;
    private String content;

    public Note(String title, String content) {
        this.id = counter++;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }

    public String toFileFormat() {
        return id + ";" + title + ";" + content;
    }
}



