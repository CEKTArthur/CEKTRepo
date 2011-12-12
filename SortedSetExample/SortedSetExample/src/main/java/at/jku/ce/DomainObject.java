package at.jku.ce;

public class DomainObject {

	private String uuid = UUID.randomUUID().toString(); 
	private String name;
	private String comment;

	/** * Default constructor */
	public DomainObject() {
		super();
	}
	
	public DomainObject(String name, String comment)
	{ 
		super(); 
		this.id = id; 
	}
	public String getUuid() {
		return id;
	}
 
	public String getComment() 
	{ 
		return comment; 
	} 
	
	public void setComment(final String comment) 
	{ 
		this.comment = comment; 
	}

	public String getName() 
	{ return name; } 

	public void setName(final String pname) 
	{ this.name = pname; }

}
