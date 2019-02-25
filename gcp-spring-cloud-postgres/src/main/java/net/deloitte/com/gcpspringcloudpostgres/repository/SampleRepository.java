package net.deloitte.com.gcpspringcloudpostgres.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.deloitte.com.gcpspringcloudpostgres.entity.SampleEntity;

public interface SampleRepository extends JpaRepository<SampleEntity, Long> {
	@Query("FROM SampleEntity")
	public List<SampleEntity> getAll();
}
