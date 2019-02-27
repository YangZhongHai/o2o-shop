package com.yang.o2o.entity;

import java.util.Date;

public class HeadLine {
	private long lineTd;
	private String lineName;
	private String linkLink;
	private String lineImg;
	private Integer priority;
	// 0可用,1不可用
	private Integer enableStatus;
	private Date crateTime;
	private Date lastEditTme;

	public long getLineTd() {
		return lineTd;
	}

	public void setLineTd(long lineTd) {
		this.lineTd = lineTd;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getLinkLink() {
		return linkLink;
	}

	public void setLinkLink(String linkLink) {
		this.linkLink = linkLink;
	}

	public String getLineImg() {
		return lineImg;
	}

	public void setLineImg(String lineImg) {
		this.lineImg = lineImg;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}

	public Date getCrateTime() {
		return crateTime;
	}

	public void setCrateTime(Date crateTime) {
		this.crateTime = crateTime;
	}

	public Date getLastEditTme() {
		return lastEditTme;
	}

	public void setLastEditTme(Date lastEditTme) {
		this.lastEditTme = lastEditTme;
	}
}
