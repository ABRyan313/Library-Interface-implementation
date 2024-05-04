package library_interface;

import java.util.ArrayList;

public interface Ibook {
	
	public String getIsbn();
	public String getTitle();
	public void setTitle(String title);
	public float getEdition();
	public void setEdition(float edition);
	public int getRelease();
	public void setRelease(int release);
	public int getPage();
	public void setPage(int page);
	public ArrayList<Iauthor> getAut();
	public void setAut(ArrayList<Iauthor> aut);
	public Ipublisher getPub();
	public void setPub(Ipublisher pub);
	
	
	public static boolean isbn_Ok(String title, String isbn) {
		return isbn!=null && title !=null;
	}

}
