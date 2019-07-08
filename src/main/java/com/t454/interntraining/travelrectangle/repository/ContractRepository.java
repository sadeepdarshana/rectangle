package com.t454.interntraining.travelrectangle.repository;

import com.t454.interntraining.travelrectangle.model.Contract;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public interface ContractRepository extends CrudRepository<Contract, Integer> {


    ArrayList<Contract> findContractsByStartDateLessThanEqualAndEndDateGreaterThanEqual
            (Date startDate,Date endDate);
}


//findByStartDateLessThanAndEndDateGreaterThan