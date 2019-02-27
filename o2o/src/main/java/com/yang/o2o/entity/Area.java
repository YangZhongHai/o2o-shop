package com.yang.o2o.entity;

import java.util.Date;

public class Area {
	//区域id
	private Integer areaId;
	//区域名
	private String areaName;
	//权重
	private Integer priority;
	//创建时间
	private Date createTime;
	//更新时间
	private Date lastEditTinme;

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getSreaName() {
		return areaName;
	}

	public void setSreaName(String sreaName) {
		this.areaName = sreaName;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTinme() {
		return lastEditTinme;
	}

	public void setLastEditTinme(Date lastEditTinme) {
		this.lastEditTinme = lastEditTinme;
	}

}
