package homeLibrary;

public class Content {
    private int numberContent;
    private String content;

    public Content(int number, String content) {
        this.numberContent = number;
        this.content = content;
    }

    public void SetContent(String value) {content = value;}
    public String GetContent (){return content;}

    public void SetNumberContent(int value){numberContent = value;}\
    public int getNumberContent() {return numberContent;}

    public void ShowContent(){System.out.print(numberContent + ". " + content);}
}