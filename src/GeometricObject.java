public class GeometricObject {

	private String description;
	private java.util.Date dateCreated;

	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	public GeometricObject(String description) {
		this.dateCreated = new java.util.Date();
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public java.util.Date getDateCreated() {
		return this.dateCreated;
	}

}
