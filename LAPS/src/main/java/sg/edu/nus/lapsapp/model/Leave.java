package sg.edu.nus.lapsapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Leave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@Column(name="leaveID")
	private String leaveID;
	@Column(name="startDate")
	private String startDate;
	@Column(name="endDate")
	private String endDate;
	@Column(name="Category")
	private String Category;
	@Column(name="reasons")
	private String reasons;
	@Column(name="workDissemination")
	private String workDissemination;
	@Column(name="contactDetails")
	private String contactDetails;
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getReasons() {
		return reasons;
	}
	public void setReasons(String reasons) {
		this.reasons = reasons;
	}
	public String getWorkDissemination() {
		return workDissemination;
	}
	public void setWorkDissemination(String workDissemination) {
		this.workDissemination = workDissemination;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Leave(String startDate, String endDate, String category, String reasons, String workDissemination,
			String contactDetails) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		Category = category;
		this.reasons = reasons;
		this.workDissemination = workDissemination;
		this.contactDetails = contactDetails;
	}
	@Override
	public String toString() {
		return "Leave [startDate=" + startDate + ", endDate=" + endDate + ", Category=" + Category + ", reasons="
				+ reasons + ", workDissemination=" + workDissemination + ", contactDetails=" + contactDetails + "]";
	}
	
	
	

}
