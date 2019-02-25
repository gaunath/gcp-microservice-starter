package net.deloitte.com.gcpspringcloudpostgres.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "sample_entity")
public class SampleEntity {
	@Id
    @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;
 
    @Column(name = "name")
    String name;
 
    @Column(name = "age")
    Integer age;
 
    public Integer getId() {
        return Id;
    }
 
    public void setId(Integer id) {
        Id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }
}
