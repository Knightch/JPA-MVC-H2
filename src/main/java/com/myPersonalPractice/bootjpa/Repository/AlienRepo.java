package com.myPersonalPractice.bootjpa.Repository;

import com.myPersonalPractice.bootjpa.entity.AlienEntity;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<AlienEntity, Integer> {

}
