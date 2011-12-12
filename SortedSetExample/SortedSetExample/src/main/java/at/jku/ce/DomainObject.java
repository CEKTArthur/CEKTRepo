package at.jku.ce;

public class DomainObject implements Comparable<DomainObject> {

	private String uuid = UUID.randomUUID().toString(); 
	private String name;
	private String comment;

	/** * Default constructor */
	protected DomainObject() {
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

	public String toString() 
	{ return "DomainObject [name=" + name + ", comment=" + comment + ", uuid=" + uuid + "]"; }
	

	public int compareTo(DomainObject o) { DomainObject domainObj = (DomainObject) o; int domObjeComp = name.compareTo(domainObj.getName()); return ((domObjeComp == 0) ? uuid.compareTo(domainObj.getUuid()) : domObjeComp); }
