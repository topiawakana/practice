public class Book extends TangibleAsset{
	//コメント追加
	private String test;
	private String isbn;
	public Book(String name, int price, String color, String isbn){
		super(name, price, color);
		this.isbn = isbn;
	}
	public String getIsbn(){ return this.isbn; }
}
