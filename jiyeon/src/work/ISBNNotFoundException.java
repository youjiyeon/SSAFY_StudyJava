package work;

public class ISBNNotFoundException extends Exception{
	private String isbn;
	
	public ISBNNotFoundException(String isbn) {
		super("해당"+isbn+"의 책은 존재하지 않습니다.");
	}
	
	public String getIsbn() {
		return isbn;
	}
}
