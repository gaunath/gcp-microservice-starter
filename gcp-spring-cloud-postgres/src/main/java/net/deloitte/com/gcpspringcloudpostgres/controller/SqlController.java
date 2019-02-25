package net.deloitte.com.gcpspringcloudpostgres.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.deloitte.com.gcpspringcloudpostgres.entity.SampleEntity;
import net.deloitte.com.gcpspringcloudpostgres.service.SampleService;



@RestController
public class SqlController {
    @Autowired
    SampleService sampleService;
 
    @RequestMapping(value = "/sample")
        public List<SampleEntity> sample() {
        return sampleService.getAll();
    }
    
    @RequestMapping(value = "/createsample", method = RequestMethod.POST)
    public SampleEntity createSample(@Valid @RequestBody SampleEntity sampleEntity) {
        return sampleService.createSample(sampleEntity);
    }
 
    @RequestMapping(value = "/deletesample/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteSample(@PathVariable(value = "id") Long id) {
        return sampleService.deleteSample(id);
    }
 
    @RequestMapping(value = "/updatesample/{id}", method = RequestMethod.PUT)
    public SampleEntity updateSample(@PathVariable(value = "id") Long id,
            @Valid @RequestBody SampleEntity sampleEntity) {
        return sampleService.updateSample(id, sampleEntity);
    }
}
