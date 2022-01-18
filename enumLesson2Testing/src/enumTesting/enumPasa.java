package enumTesting;

public class enumPasa {
	
	Book books;
	
	public enumPasa(Book books) 
	{
		
		this.books = books;	
	}
	
	public void bookDetail() {
	
		switch(books) 
		{
		case VBNET:
			System.out.print(books + " ");
			System.out.print(books.getTitle() + " ");
			System.out.print(books.getCopyrightYear() + " " + "\n");
			break;
		case CHTP4:
			System.out.print(books + " ");
			System.out.print(books.getTitle() + " ");
			System.out.print(books.getCopyrightYear() + " " + "\n");
			break;
		case IW3HTP3:
			System.out.print(books + " ");
			System.out.print(books.getTitle() + " ");
			System.out.print(books.getCopyrightYear() + " " + "\n");
		}

}
}
