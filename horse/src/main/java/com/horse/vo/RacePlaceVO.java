package com.horse.vo;

import org.apache.ibatis.type.Alias;

@Alias("raceplacevo")
public class RacePlaceVO {
	private int r_num, pnum;
	private String pname;
	private String paddr;
	private String ptel;
	private String plink;
	private String pplace;
	private String pdate;

	public int getR_num() {
		return r_num;
	}
	public void setR_num(int r_num) {
		this.r_num = r_num;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPaddr() {
		return paddr;
	}
	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}
	public String getPtel() {
		return ptel;
	}
	public void setPtel(String ptel) {
		this.ptel = ptel;
	}
	public String getPlink() {
		return plink;
	}
	public void setPlink(String plink) {
		this.plink = plink;
	}
	public String getPplace() {
		return pplace;
	}
	public void setPplace(String pplace) {
		this.pplace = pplace;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

}
