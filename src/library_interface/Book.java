package library_interface;

import java.util.ArrayList;
import java.util.Arrays;



public class Book implements Ibook{
	
	private static int num;
	private int number;
	
	private String isbn;
	private String title;
	private float edition;
	private int release;
	private Ipublisher pub;
	private int page;
	private ArrayList <Iauthor> aut = new ArrayList<>();
	
	public Book(String title, String isbn) throws Exception{
		if(!Ibook.isbn_Ok(title, isbn))
			throw new Exception("Ilegal isbn/title");
		this.title = title;
		this.isbn = isbn;
		
	}
	
	public Book(String title, String isbn, int release) throws Exception {
			
		this(title, isbn);
		if (release == 0) throw new Exception("Release date not available");
		this.release = release;
	}
	
	public Book(String title, String isbn, Ipublisher pub) throws Exception {
		this(title, isbn);
		this.setPub(pub);
	}
	
	public Book(String title, String isbn, int edition, int release, int page, Ipublisher pub,  Iauthor ... aut) throws Exception{
		this(title, isbn);
		this.edition = edition;
		this.release = release;
		this.page = page;
		this.setPub(pub);
		this.aut = new ArrayList<>(Arrays.asList(aut));
		number = num++;
	}
	
	
	static{
		 num = 1;
	}

	

	public String getIsbn() {
		return isbn;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getEdition() {
		return edition;
	}

	public void setEdition(float edition) {
		this.edition = edition;
	}

	public int getRelease() {
		return release;
	}

	public void setRelease(int release) {
		this.release = release;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public ArrayList<Iauthor> getAut() {
		return aut;
	}

	public void setAut(ArrayList<Iauthor> aut) {
		this.aut = aut;
	}

	public Ipublisher getPub() {
		return pub;
	}

	public void setPub(Ipublisher pub) {
		this.pub = pub;
	}
	
	@Override
	public String toString() {
		return "Book" + number + "[isbn=" + isbn + ", title=" + title + ", edition=" + edition + ", released" + release + ", Publisher:"
				+ pub  + page +" Pages" + ", aut=" + aut + "]";
	}

}
