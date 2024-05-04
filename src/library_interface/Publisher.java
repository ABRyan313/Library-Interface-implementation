package library_interface;

public class Publisher implements Ipublisher{
	
	private String name;
	private String id;
	
	public Publisher(String name, String id) throws Exception{
		if(!Ipublisher.publisherOk(name, id))
	          throw new Exception ("Invalid publisher");
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Publisher [name=" + name + ", id=" + id + "]";
	}
	
	
	
	

}
