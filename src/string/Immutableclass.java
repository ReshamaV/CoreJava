package string;
 final class Book
{
	int id;
	String author_name;

 Book(int id,String author_name)
 {
	 this.id=id;
	 this.author_name=author_name;
 }

public int getId() {
	return id;
}

public String getAuthor_name() {
	return author_name;
} 
}
public class Immutableclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Book b=new Book(101, "Xyz");
    int i=b.getId();
    String s=b.getAuthor_name();
    System.out.println("Book Information: "+i+" "+s);
	}

}
