package com.room.RoomMicroservice.Service;

import java.util.List;
import java.util.Optional;

import com.room.RoomMicroservice.Models.Room;
import com.room.RoomMicroservice.Models.RoomList;

public interface Roomservice {
	public Room addRoom(Room room);

	public Optional<Room> getRoom(long parseLong);

	public Room updateRoom(Room room);

	public String deleteRoom(long parseLong);

	public List<Room> getAllRoom();

	public RoomList getRoomAvl();
}
