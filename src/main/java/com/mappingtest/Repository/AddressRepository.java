package com.mappingtest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mappingtest.entities.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{
}
