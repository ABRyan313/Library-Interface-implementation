package library_interface;

public interface Ipublisher {
	
	
	
	public String getName();
	public void setName(String name);
	public String getId();
	public void setId(String id);
	public String toString();
	
	public static boolean publisherOk(String name, String id) {
		return name != null && name.length() > 0 && id != null;
	}

}
