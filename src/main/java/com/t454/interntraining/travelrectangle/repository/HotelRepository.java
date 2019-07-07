package com.t454.interntraining.travelrectangle.repository;

import com.t454.interntraining.travelrectangle.model.Hotel;
import com.t454.interntraining.travelrectangle.model.projections.HotelNameId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HotelRepository extends CrudRepository<Hotel, Integer> {


    List<HotelNameId> findAllProjectedBy();

}