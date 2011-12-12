package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		Set<DomainObject> objectSet = new HashSet<DomainObject>();
		objectSet.add(DomainFactory.createDomainObject("Helga, Frau"));
		objectSet.add(DomainFactory.createDomainObject("Walter, Mann"));
		objectSet.add(DomainFactory.createDomainObject("Hans, Mann"));
		objectSet.add(DomainFactory.createDomainObject("Paul, Mann")); 
		objectSet.add(DomainFactory.createDomainObject("Claudia, Frau")); 
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.getUuid()); 
		}
	}

}
