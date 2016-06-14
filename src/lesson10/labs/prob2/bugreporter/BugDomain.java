package lesson10.labs.prob2.bugreporter;

public class BugDomain {

	private String name;
	private String reportedBy;
	private String className;
	private String description;
	private int severity;
	public BugDomain(String name, String reportedBy, String className, String description, int severity) {
		this.name = name;
		this.reportedBy = reportedBy;
		this.className = className;
		this.description = description;
		this.severity = severity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReportedBy() {
		return reportedBy;
	}
	public void setReportedBy(String reportedBy) {
		this.reportedBy = reportedBy;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	
	
}
