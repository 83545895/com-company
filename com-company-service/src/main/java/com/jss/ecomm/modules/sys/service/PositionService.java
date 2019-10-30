/**
 * 
 */
package com.jss.ecomm.modules.sys.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.common.service.CrudService;
import com.jss.ecomm.modules.sys.dao.PositionDao;
import com.jss.ecomm.modules.sys.entity.Position;

/**
 * 职务Service
 * @author kofi
 * @version 2017-05-05
 */
@Service
@Transactional(readOnly = true)
public class PositionService extends CrudService<PositionDao, Position> {

	/*public Position get(String id) {
		return super.get(id);
	}
	
	public List<Position> findList(Position position) {
		return super.findList(position);
	}
	
	public Page<Position> findPage(Page<Position> page, Position position) {
		return super.findPage(page, position);
	}
	
	@Transactional(readOnly = false)
	public void save(Position position) {
		super.save(position);
	}
	
	@Transactional(readOnly = false)
	public void delete(Position position) {
		super.delete(position);
	}*/
	
}