package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "visiters_details", schema = "public")
public class VisitersParameters {
	
	@Id
	private Long visiternumber;
	
	private String visitername; 
	
	private String visiteremail; 
	
	private String visiterdesignation; 
	
	private String visitercompany;

	public Long getVisiternumber() {
		return visiternumber;
	}

	public void setVisiternumber(Long visiternumber) {
		this.visiternumber = visiternumber;
	}

	public String getVisitername() {
		return visitername;
	}

	public void setVisitername(String visitername) {
		this.visitername = visitername;
	}

	public String getVisiteremail() {
		return visiteremail;
	}

	public void setVisiteremail(String visiteremail) {
		this.visiteremail = visiteremail;
	}

	public String getVisiterdesignation() {
		return visiterdesignation;
	}

	public void setVisiterdesignation(String visiterdesignation) {
		this.visiterdesignation = visiterdesignation;
	}

	public String getVisitercompany() {
		return visitercompany;
	}

	public void setVisitercompany(String visitercompany) {
		this.visitercompany = visitercompany;
	}

	public VisitersParameters(Long visiternumber, String visitername, String visiteremail, String visiterdesignation,
			String visitercompany) {
		super();
		this.visiternumber = visiternumber;
		this.visitername = visitername;
		this.visiteremail = visiteremail;
		this.visiterdesignation = visiterdesignation;
		this.visitercompany = visitercompany;
	}

	public VisitersParameters() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VisitersParameters [visiternumber=" + visiternumber + ", visitername=" + visitername + ", visiteremail="
				+ visiteremail + ", visiterdesignation=" + visiterdesignation + ", visitercompany=" + visitercompany
				+ "]";
	}
	
	
	
	

}
