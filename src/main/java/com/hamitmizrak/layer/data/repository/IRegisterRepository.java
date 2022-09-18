package com.hamitmizrak.layer.data.repository;

import com.hamitmizrak.layer.data.entity.RegisterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegisterRepository extends CrudRepository<RegisterEntity,Long> {

    //CRUD
    //kendi sorgumuzu yazalım: Delivered Query
    RegisterEntity findByEmail(String email);
}
