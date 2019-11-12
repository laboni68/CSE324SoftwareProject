package com.ELane;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by ASUS on 17-Apr-17.
 */
public interface UserRepository extends CrudRepository<MyUser, Long> {

}