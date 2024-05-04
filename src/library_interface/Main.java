package library_interface;

public class Main {

	public static void main(String[] args) {
		
		test();

	}
	
	private static void test() {
		
		try {
			Ibook book1 = create("Man in Fire", "142-15-4044", 2, 2020, 300, new Publisher("Projapoti publishers", "121"), 
					               new Author[] {new Author("Audri", "Udash"), new Author("AB", "Ryan")});
			Ibook book2 = create("The Lion King", "143-16-4144", 0, 1995, 400, new Publisher("Disney", "100"), 
		               new Author[] {new Author("Mufasa", "Simba-Nala"), new Author("Timon", "Pumba")});
			
			Ibook book3 = create("Song of Ice and Fire", "564-5956", 0, 2014, 350, new Publisher("HBO", "120"), 
		               new Author[] {new Author("Daenerys", "Targaryan"), new Author("Jon", "Snow")});
			
			
			Ibook b2 = new Book( "Spansk Vin", "978-87-400-1676-5");
			b2.getAut().add(new Author("Paul", "Klausen"));
			book1.getAut().add(new Author("No", "One"));
			b2.setPub(new Publisher("Politikkens Forlag", "001"));
			b2.setRelease(2016);
			b2.setEdition(3);
			
			
			
			print(book1);
			print(book2);
			print(book3);
			print(b2);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		
	
	}
	
	private static Ibook create(String title, String isbn, int edition, int release, int page, Ipublisher pub,  Iauthor ... aut) throws Exception{
		Ibook book = new Book(title, isbn, edition, release, page, pub, aut);
		return book;
	}
	
	private static void print(Ibook book) {
		System.out.println(book);
	}
	
	private static void print(Iauthor a) {
		
	}

}
