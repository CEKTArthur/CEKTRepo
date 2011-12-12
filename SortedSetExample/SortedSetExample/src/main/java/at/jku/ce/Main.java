package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		Set<DomainObject> objectSet = new HashSet<DomainObject>();
		objectSet.add(new DomainObject("Helga, Frau"));
		objectSet.add(new DomainObject("Walter, Mann"));
		objectSet.add(new DomainObject("Hans, Mann"));
		objectSet.add(new DomainObject("Paul, Mann")); 
		objectSet.add(new DomainObject("Claudia, Frau")); 
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.getUuid()); 
		}
	}

}
