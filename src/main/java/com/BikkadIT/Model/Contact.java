package com.BikkadIT.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Contact_Id")
	private Integer contactId;
	@Column(name = "Contact_Name")
	private String contactName;
	@Column(name = "Contact_Number")
	private String contactNumber;
	@Column(name = "Contact_Email")
	private String contactEmail;
	@Column(name = "Active_Switch")
    private Character activeSwitch;
	@Column(name = "Created_Date",updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	@Column(name = "Updated_Date",insertable = false)
	@UpdateTimestamp
	private LocalDate updateDate;
}
