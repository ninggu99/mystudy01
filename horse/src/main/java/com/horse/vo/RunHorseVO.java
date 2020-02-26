package com.horse.vo;

import org.apache.ibatis.type.Alias;

@Alias("runhorsevo")
public class RunHorseVO {
	private int r_num, hnum;
	private int hage;
	private int htotal;
	private int hwin;
	private int hweight;
	private String hname;
	private String hsex;
	private String hsanji;
	private String hpicture;

	public int getR_num() {
		return r_num;
	}

	public void setR_num(int r_num) {
		this.r_num = r_num;
	}

	public int getHnum() {
		return hnum;
	}

	public void setHnum(int hnum) {
		this.hnum = hnum;
	}

	public int getHage() {
		return hage;
	}

	public void setHage(int hage) {
		this.hage = hage;
	}

	public int getHtotal() {
		return htotal;
	}

	public void setHtotal(int htotal) {
		this.htotal = htotal;
	}

	public int getHwin() {
		return hwin;
	}

	public void setHwin(int hwin) {
		this.hwin = hwin;
	}

	public int getHweight() {
		return hweight;
	}

	public void setHweight(int hweight) {
		this.hweight = hweight;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getHsex() {
		return hsex;
	}

	public void setHsex(String hsex) {
		this.hsex = hsex;
	}

	public String getHsanji() {
		return hsanji;
	}

	public void setHsanji(String hsanji) {
		this.hsanji = hsanji;
	}

	public String getHpicture() {
		return hpicture;
	}

	public void setHpicture(String hpicture) {
		this.hpicture = hpicture;
	}

}
