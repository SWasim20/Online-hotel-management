package com.room.RoomMicroservice.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.room.RoomMicroservice.Models.Room;
import com.room.RoomMicroservice.Models.RoomList;
import com.room.RoomMicroservice.Service.Roomservice;
import com.room.RoomMicroservice.Service.RoomserviceImpl;

@RestController
public class RoomController {
	
	@Autowired
	Roomservice roomService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}
	public RoomController(RoomserviceImpl roomservice) {
		this.roomService = roomservice;
		}
	@PostMapping("/addRoom")
	public Room addRoom(@RequestBody Room room) {
		//room.insert(roomService.getSequenceNumber(Room.SEQUENCE_NAME));
		return this.roomService.addRoom(room);
	}

	@GetMapping("/findAllRoom")
	public RoomList getAllRoom() {

		RoomList list = new RoomList();
		list.setAllRoom(this.roomService.getAllRoom());
		//Room.findAll(roomService.getSequenceNumber(Room.SEQUENCE_NAME));
		return list;

	}

	@GetMapping("/findById/{id}")
	public Optional<Room> getRoom(@PathVariable("id") String id) {

		return this.roomService.getRoom(Long.parseLong(id));
	}

	@PutMapping("/updateRoom")
	public Room updateRoom(@RequestBody Room room) {
		return this.roomService.updateRoom(room);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteRoom(@PathVariable("id") String id) {
		return this.roomService.deleteRoom(Long.parseLong(id));
	}

	@GetMapping("/findRoomAvl")
	public RoomList getRoomAvl() {

		return this.roomService.getRoomAvl();

	}
}
