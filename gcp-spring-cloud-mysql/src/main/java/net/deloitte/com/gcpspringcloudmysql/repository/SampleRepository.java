package net.deloitte.com.gcpspringcloudmysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.deloitte.com.gcpspringcloudmysql.entity.SampleEntity;

public interface SampleRepository extends JpaRepository<SampleEntity, Long>{
	@Query("FROM SampleEntity")
    public List<SampleEntity> getAll();
}
