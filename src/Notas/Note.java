package Notas;
//HLDASBHFJBAS
//LAHBfljbnasñksdfa´sdfa
//hliSBDGFJABSDF
//KLFHsbdhfklbas
//jbnfÑJSDBFÑJAS
//,ÑMASKNAS´DF
/*
 * LKNASDGFJBNDAÑF
 * KMAÑSLDMN
 * klmnsklnas
 * KNS´LAKMDF
 * dfkasfgn
 */

public class Note {
    private int id;
    private String title;
    private String content;
    private String type;  // Declarado pero no inicializado

    // Constructor incompatible: cambia los parámetros y lógica errónea
    public Note(int id, String title) throws IOException {
        this.id = id;
        this.title = title;
        // Olvida inicializar content y type: produce error o comportamiento raro
        loadContentFromFile();
    }

    // Método exclusivo que no existe en autodetect
    private void loadContentFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("notes.txt"));
        String line = br.readLine();
        if(line != null) {
            // Parseamos mal, sin comprobar formato (error intencional)
            String[] parts = line.split(":"); // Esto fallará si no hay ":"
            content = parts[2]; // Posible IndexOutOfBoundsException
            type = "LOADED";
        }
        br.close();
    }

    // Método display diferente, imprime mal tipo o lo ignora
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Type: " + (type == null ? "Unknown" : type));
    }
}



