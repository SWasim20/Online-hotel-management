package com.room.RoomMicroservice.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Room")

public class Room {
	
	@Id
	private long roomId;
	private int roomCharges;
	private String roomType;
	private String roomDesc;
	private boolean roomAvl;
	private Object sequenceNumber;
	
	
	
	public Room(long roomId, int roomCharges, String roomType, String roomDesc, boolean roomAvl,
			Object sequenceNumber) {
		super();
		this.roomId = roomId;
		this.roomCharges = roomCharges;
		this.roomType = roomType;
		this.roomDesc = roomDesc;
		this.roomAvl = roomAvl;
		this.sequenceNumber = sequenceNumber;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public int getRoomCharges() {
		return roomCharges;
	}
	public void setRoomCharges(int roomCharges) {
		this.roomCharges = roomCharges;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomDesc() {
		return roomDesc;
	}
	public void setRoomDesc(String roomDesc) {
		this.roomDesc = roomDesc;
	}
	public boolean isRoomAvl() {
		return roomAvl;
	}
	public void setRoomAvl(boolean roomAvl) {
		this.roomAvl = roomAvl;
	}
	public Object getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(Object sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	} 
	
	
}
