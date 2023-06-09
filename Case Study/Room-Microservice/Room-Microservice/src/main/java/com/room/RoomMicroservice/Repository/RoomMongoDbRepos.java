package com.room.RoomMicroservice.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.room.RoomMicroservice.Models.Room;

@Repository
public interface RoomMongoDbRepos extends MongoRepository <Room, Long> {
	
	@Query("{roomAvl:true}")
	List<Room> findAvailable();
}
