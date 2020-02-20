package com.horse.vo;

import org.apache.ibatis.type.Alias;

@Alias("reviewvo")
public class ReviewVO {
	private int r_num, renum, rehit;
	private String retitle, recontent, redate;

	public int getR_num() {
		return r_num;
	}

	public void setR_num(int r_num) {
		this.r_num = r_num;
	}

	public int getRenum() {
		return renum;
	}

	public void setRenum(int renum) {
		this.renum = renum;
	}

	public int getRehit() {
		return rehit;
	}

	public void setRehit(int rehit) {
		this.rehit = rehit;
	}

	public String getRetitle() {
		return retitle;
	}

	public void setRetitle(String retitle) {
		this.retitle = retitle;
	}

	public String getRecontent() {
		return recontent;
	}

	public void setRecontent(String recontent) {
		this.recontent = recontent;
	}

	public String getRedate() {
		return redate;
	}

	public void setRedate(String redate) {
		this.redate = redate;
	}

}
