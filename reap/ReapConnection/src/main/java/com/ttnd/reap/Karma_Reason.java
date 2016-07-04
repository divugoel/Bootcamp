package com.ttnd.reap;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "karma_reason")
public class Karma_Reason {
	
	@Id @GeneratedValue
	private int id;
	
	private Date dateTime;
	private String senderId;
	private String receiverId;
	private String reason;
	private String badgeReceived;
	private String karma;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSenderId()	{
		return senderId;
	}
	public void setSenderId(String sId){
		this.senderId=sId;
	}
	
	public String getReceiverId()	{
		return receiverId;
	}
	public void setReceiverId(String rId){
		this.receiverId=rId;
	}
	
	public String getReason()	{
		return reason;
	}
	public void setReason(String reason){
		this.reason=reason;
	}
	
	public String getBadgeReceived()	{
		return badgeReceived;
	}
	public void setBadgeReceived(String badgeReceived){
		this.badgeReceived=badgeReceived;
	}
	
	public String getKarma()	{
		return karma;
	}
	public void setKarma(String karma) {
		this.karma = karma;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
	
}
