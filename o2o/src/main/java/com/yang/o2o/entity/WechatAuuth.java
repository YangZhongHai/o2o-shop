package com.yang.o2o.entity;

import java.util.Date;

public class WechatAuuth {
	private long wechatAuuthId;
	private String openId;
	private Date createTime;
	private PersonInfo personInfo;
	public long getWechatAuuthId() {
		return wechatAuuthId;
	}

	public void setWechatAuuthId(long wechatAuuthId) {
		this.wechatAuuthId = wechatAuuthId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

}
