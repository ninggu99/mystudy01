package com.horse.vo;

import org.apache.ibatis.type.Alias;

@Alias("revo")
public class ReplyBoardVO {

	private int onum;  // 댓글번호
	private String ooid; // 작성자 아이디?
	private int qnum; // 문의사항 댓글번호
	private String ocontent; // 댓글내용
	private String ndate; // 날짜
	
	public int getOnum() {
		return onum;
	}
	public void setOnum(int onum) {
		this.onum = onum;
	}
	public String getOoid() {
		return ooid;
	}
	public void setOoid(String ooid) {
		this.ooid = ooid;
	}
	public int getQnum() {
		return qnum;
	}
	public void setQnum(int qnum) {
		this.qnum = qnum;
	}
	public String getOcontent() {
		return ocontent;
	}
	public void setOcontent(String ocontent) {
		this.ocontent = ocontent;
	}
	public String getNdate() {
		return ndate;
	}
	public void setNdate(String ndate) {
		this.ndate = ndate;
	}
}
