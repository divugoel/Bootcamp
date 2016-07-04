package com.ttnd.reap;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="giving_kitty")
public class Giving_Kitty {
	
	@Id 
	private int employeeId;
	private int gold;
	private int silver;
	private int bronze;
	
	
	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int id) {
		this.employeeId = id;
	}


	public int getGold() {
		return gold;
	}
	public void setGold(int gold){
		this.gold=gold;
	}
	
	public int getSilver() {
		return silver;
	}
	public void setSilver(int silver){
		this.silver=silver;
	}
	
	public int getBronze() {
		return bronze;
	}
	public void setBronze(int bronze){
		this.bronze=bronze;
	}

}
