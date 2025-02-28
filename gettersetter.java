package firstproject;

public class gettersetter {
	
	private int bookid;
	private String bookname , author;
	
	void Setbookid(int bookid) {
		this.bookid = bookid;
	}
	int Get_bookid() {
		return bookid;
	}
	
	void Setbookname(String name) {
		this.bookname = name;
	}
	String Getbookname() {
		return this.bookname;
	}
	
	void Setauthor(String name) {
		this.author = name;
	}
	String Getauthor() {
		return this.author;
	}
	
	gettersetter(int bookid , String bookname , String bookauthor){
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = bookauthor;
		
		System.out.println(bookid + " " + bookname + " " + author);
	}
	
	gettersetter(){
		System.out.println("Default Constructor");
	}
	
	public static void main(String [] args) {
		
		gettersetter g = new gettersetter(1,"Wings of Fire","Dr.APJ Abdul Kalam");

//		gettersetter g =new gettersetter();
//		
//		g.Setbookid(1);
//		g.Setbookname("Wings of Fire");
//		g.Setauthor("Dr. APJ Abdul Kalam");
//		
//		System.out.println(g.Get_bookid() + " " +g.Getbookname() + " " +g.Getauthor());
	}
}
