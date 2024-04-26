package com.tcs.hotelapi.hotelentity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "customer_survey")
public class surveyentity {
    @Id
    @Column(name = "user_id")
    private String user_id;

	@Column(name = "overall_exp")
    private String overall_exp;
    
    @Column(name = "cleanliness")
    private String cleanliness;
    
    @Column(name = "staff_service")
    private String staff_service;
    
    @Column(name = "food_quality")
    private String food_quality;
    
    @Column(name = "next_stay")
    private String next_stay;
    
    @Column(name = "bed_comfort")
    private String bed_comfort;
    
    @Column(name = "hotel_amenities")
    private String hotel_amenities;
    
    @Column(name = "staff_friendliness")
    private String staff_friendliness;
    
    @Column(name = "value_money")
    private String value_money;
    
    @Column(name = "checkin_process")
    private String checkin_process;
    
    @Column(name = "comments")
    private String comments;


	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getOverall_exp() {
		return overall_exp;
	}

	public void setOverall_exp(String overall_exp) {
		this.overall_exp = overall_exp;
	}

	public String getCleanliness() {
		return cleanliness;
	}

	public void setCleanliness(String cleanliness) {
		this.cleanliness = cleanliness;
	}

	public String getStaff_service() {
		return staff_service;
	}

	public void setStaff_service(String staff_service) {
		this.staff_service = staff_service;
	}

	public String getFood_quality() {
		return food_quality;
	}

	public void setFood_quality(String food_quality) {
		this.food_quality = food_quality;
	}

	public String getNext_stay() {
		return next_stay;
	}

	public void setNext_stay(String next_stay) {
		this.next_stay = next_stay;
	}

	public String getBed_comfort() {
		return bed_comfort;
	}

	public void setBed_comfort(String bed_comfort) {
		this.bed_comfort = bed_comfort;
	}

	public String getHotel_amenities() {
		return hotel_amenities;
	}

	public void setHotel_amenities(String hotel_amenities) {
		this.hotel_amenities = hotel_amenities;
	}

	public String getStaff_friendliness() {
		return staff_friendliness;
	}

	public void setStaff_friendliness(String staff_friendliness) {
		this.staff_friendliness = staff_friendliness;
	}

	public String getValue_money() {
		return value_money;
	}

	public void setValue_money(String value_money) {
		this.value_money = value_money;
	}

	public String getCheckin_process() {
		return checkin_process;
	}

	public void setCheckin_process(String checkin_process) {
		this.checkin_process = checkin_process;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}


   
}
