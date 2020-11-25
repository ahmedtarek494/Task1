package com.example.demo.DTOs;

public class Employee {

	private String _id;
	  private float index;
	  private String guid;
	  private boolean isActive;
	  private String balance;
	  private String picture;


	 // Getter Methods 

	  public String get_id() {
	    return _id;
	  }

	  public float getIndex() {
	    return index;
	  }

	  public String getGuid() {
	    return guid;
	  }

	  public boolean getIsActive() {
	    return isActive;
	  }

	  public String getBalance() {
	    return balance;
	  }

	  public String getPicture() {
	    return picture;
	  }

	 // Setter Methods 

	  public void set_id( String _id ) {
	    this._id = _id;
	  }

	  public void setIndex( float index ) {
	    this.index = index;
	  }

	  public void setGuid( String guid ) {
	    this.guid = guid;
	  }

	  public void setIsActive( boolean isActive ) {
	    this.isActive = isActive;
	  }

	  public void setBalance( String balance ) {
	    this.balance = balance;
	  }

	  public void setPicture( String picture ) {
	    this.picture = picture;
	  }
}
