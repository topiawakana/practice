public class Book extends TangbleAsset{
	private String isbn;
	public Book(String name, int price, String color, String isbn){
		super(name,price,color);
		this.isbn = isbn;
	}
	public void setIsbn(String isbn){this.isbn = isbn;}
	public String getIsbn(){return this.isbn;}
}
