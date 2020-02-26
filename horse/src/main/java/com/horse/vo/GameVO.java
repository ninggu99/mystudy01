package com.horse.vo;

import org.apache.ibatis.type.Alias;

@Alias("gamevo")
public class GameVO {
	private int r_num, gnum;
	private int gmeter;
	private String gtime;
	private String gdate;
	public int getR_num() {
		return r_num;
	}
	public void setR_num(int r_num) {
		this.r_num = r_num;
	}
	public int getGnum() {
		return gnum;
	}
	public void setGnum(int gnum) {
		this.gnum = gnum;
	}
	public int getGmeter() {
		return gmeter;
	}
	public void setGmeter(int gmeter) {
		this.gmeter = gmeter;
	}
	public String getGtime() {
		return gtime;
	}
	public void setGtime(String gtime) {
		this.gtime = gtime;
	}
	public String getGdate() {
		return gdate;
	}
	public void setGdate(String gdate) {
		this.gdate = gdate;
	}

}
