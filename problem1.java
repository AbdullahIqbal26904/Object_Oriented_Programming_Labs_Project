public class problem1 {
    public static void main(String[] args){
        problem1 p1 = new problem1("Harry Potter and the Sorcerer ’s Stone","J.K. Rowling","1234567890",309);
        System.out.println(p1.summary());
    }
    private String title;
    private String Author;
    private String ISBN;
    private int nop;

    public problem1(String title, String Author, String ISBN, int nop){
        this.title = title;
        this.Author = Author;
        this.ISBN = ISBN;
        this.nop=nop;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return Author;
    }
    public String getISBN(){
        return ISBN;
    }
    public int getNop(){
        return nop;
    }

    public String summary(){
        return "Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nISBN: "+getISBN()+"\nNumber Of Pages: "+getNop();
    }
}
