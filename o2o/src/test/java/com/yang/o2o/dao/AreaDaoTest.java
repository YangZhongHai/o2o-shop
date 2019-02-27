package com.yang.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yang.o2o.BaseTest;
import com.yang.o2o.entity.Area;

public class AreaDaoTest extends BaseTest{
	//引入AreaDao
	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void testQueryArea(){
		List<Area> area = areaDao.queryArea();
		assertEquals(2,area.size());
	
	}

}
