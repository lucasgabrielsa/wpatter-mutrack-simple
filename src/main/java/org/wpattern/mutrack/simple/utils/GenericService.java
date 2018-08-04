package org.wpattern.mutrack.simple.utils;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public abstract class GenericService<T extends BaseEntity<ID>, ID extends Serializable> implements ServiceMap {
	
	private final Logger LOGGER = Logger.getLogger(getClass());
	
	@Autowired
	protected JpaRepository<T, ID> genericRepository;
	
	@RequestMapping(method= RequestMethod.GET)
	public List<T> findAll() {
		this.LOGGER.info("Requesting all records");
		return this.genericRepository.findAll();
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public T insert(@RequestBody T entity) {
		this.LOGGER.info(String.format("Saving the entity [%s]", entity));
		entity.setId(null);
		return this.genericRepository.save(entity);
	}

}
