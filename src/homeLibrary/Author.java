package homeLibrary;

public class Author {
    private String nameAuthor;

    public Author(String name){
        nameAuthor = name;
    }

    //public void SetAuthor(String value){nameAuthor = value;}
    public String GetAuthor(){return nameAuthor;}
    public void ShowAuthor(){System.out.print(nameAuthor + " ");}


}


