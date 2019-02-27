package com.yang.o2o.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yang.o2o.entity.Area;
@Service
public interface AreaService {
	List<Area> getAreaList();

}
