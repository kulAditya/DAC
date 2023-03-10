package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer>
{
	
	@Query("select d from Doctor d where experience>:exp and specialization like:spe")
	public List<Doctor> getAll(int exp ,String spe);
	
}
