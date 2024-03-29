package com.room.RoomMicroservice.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.room.RoomMicroservice.Models.Room;
import com.room.RoomMicroservice.Models.RoomList;
import com.room.RoomMicroservice.Repository.RoomMongoDbRepos;

@Service
public class RoomserviceImpl implements Roomservice{
	
	@Autowired
	RoomMongoDbRepos roomMongodbRepo;
	
	@Override
	public Room addRoom(Room room) {
		//room.addRoom(roomService.getSequenceNumber(Room.SEQUENCE_NAME));
		return roomMongodbRepo.insert(room);
	}

	@Override
	public Optional<Room> getRoom(long parseLong) {
		return roomMongodbRepo.findById(parseLong);
	}

	@Override
	public Room updateRoom(Room room) {
		return roomMongodbRepo.save(room);
	}

	@Override
	public String deleteRoom(long parseLong) {
		roomMongodbRepo.deleteById(parseLong);
		return "Room Number " + parseLong + " Deleted";
	}

	@Override
	public List<Room> getAllRoom() {
		//Room.findAll(roomService.getSequenceNumber(Room.SEQUENCE_NAME));
		return roomMongodbRepo.findAll();
	}

	@Override
	public RoomList getRoomAvl() {
		RoomList list = new RoomList();
		list.setAllRoom(roomMongodbRepo.findAvailable());;
		return list;
	}

}
