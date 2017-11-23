package com.cms.bean;

import java.util.Date;

public class Category {
	private Integer id;
	private String name;
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	private Integer status;

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", createTime=" + createTime + ", status=" + status + "]";
	}

}
