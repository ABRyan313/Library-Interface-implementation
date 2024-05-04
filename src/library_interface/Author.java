package library_interface;

public class Author implements Iauthor{
	
	private String fname;
	private String lname;
	private int id;
	private static int number;
	
	public Author(String fname, String lname) throws Exception{
		if(!Iauthor.authorOk(fname, lname))
			throw new Exception("Invalid author");
		this.fname = fname;
		this.lname = lname;
		id = number++;
		
	}
	
	static {
		number = 1000;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "Author [" + fname + " " + lname  + id + "]";
	}

}
