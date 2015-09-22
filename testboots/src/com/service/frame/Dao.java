package com.service.frame;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

public interface Dao {
	@Transactional
	public void insert(Object obj) throws Exception;
	@Transactional
	public void update(Object obj) throws Exception;
	@Transactional
	public void delete(Object obj) throws Exception;
	public Object select(Object obj) throws Exception;
	public ArrayList<Object> select() throws Exception;
	
	public ArrayList<Object> search(Object obj)throws Exception;
	public ArrayList<Object> search(int start, int end) throws Exception;
}
