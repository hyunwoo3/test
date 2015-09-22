package com.service.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.frame.Dao;
import com.service.mybatis.mapper.CustMapper;
@Repository("custdao") //데이터가 저장되는의미
public class CustDao implements Dao {

	@Autowired
	CustMapper db;
	
	@Override
	public void insert(Object obj) throws Exception {
		db.insertCust(obj);
		System.out.println(obj);
		
		
	}

	@Override
	public void update(Object obj) throws Exception {
		db.updateCust(obj);
		
	}

	@Override
	public void delete(Object obj) throws Exception {
		db.deleteCust(obj);
		
	}

	@Override
	public Object select(Object obj) throws Exception {
		return db.selectCust(obj);

	}

	@Override
	public ArrayList<Object> select() throws Exception { 
		return db.selectAllCust();
	}
	
	@Override
	public ArrayList<Object> search(Object obj)throws Exception{
		return db.searchCust(obj);
	}

	@Override
	public ArrayList<Object> search(int start, int end) throws Exception {
		return db.selectAllCust(new RowBounds(start, end));
	}
	

}
