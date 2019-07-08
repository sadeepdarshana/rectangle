package com.t454.interntraining.travelrectangle.repository;

import com.t454.interntraining.travelrectangle.model.RoomType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomTypeRepository extends CrudRepository<RoomType, Integer> {

    List<RoomType> findByHotelId(int hotelId);
}