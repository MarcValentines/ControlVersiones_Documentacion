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
    private String title;
    private String content;
    private String type;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.type = detectType(content);
    }

    private String detectType(String content) {
        content = content.toLowerCase();
        if (content.contains("buy") || content.contains("call")) {
            return "TASK";
        } else if (content.contains("idea") || content.contains("project")) {
            return "IDEA";
        } else if (content.contains("remind") || content.contains("appointment")) {
            return "REMINDER";
        } else {
            return "NOTE";
        }
    }

    public void display() {
        System.out.println("[" + type + "] " + title + ": " + content);
    }
}


