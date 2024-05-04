package library_interface;

public interface Iauthor {
	
	public String getFname();
	public String getLname();
	public int getId();
	
	public static boolean authorOk(String fname, String lname) {
		return fname !=null && fname.length() > 0 && lname !=null && lname.length() > 0;
	}

}
