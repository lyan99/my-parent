package com.chen.my.manage.model;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("分页对象")
public class PageParams implements Serializable{
	
	@ApiModelProperty(value="第几页")
	private int page=1;
	
	@ApiModelProperty(value="每页几条数据")
	private int row=1;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
}
