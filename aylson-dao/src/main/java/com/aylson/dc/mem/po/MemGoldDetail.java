package com.aylson.dc.mem.po;

import java.io.Serializable;
import java.util.Date;

import com.aylson.utils.JsonDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class MemGoldDetail implements Serializable {
	
	private static final long serialVersionUID = 3928503360340879572L;
	
	private Integer id;           		  //主键
	private Integer memberId;          	  //会员id
	private Integer type;           	  //进出类别
	private Integer gold;           	  //进出金币值
	private Date createTime;           	  //进出时间
	private String description;           //描述说明
	private Integer sourceType;           //来源类型
	private Integer sourceId;             //来源id
	
	
	public MemGoldDetail() {}
	
	public MemGoldDetail(Integer id, Integer memberId, Integer type, Integer gold, Date createTime, String description,
			Integer sourceType, Integer sourceId) {
		this.id = id;
		this.memberId = memberId;
		this.type = type;
		this.gold = gold;
		this.createTime = createTime;
		this.description = description;
		this.sourceType = sourceType;
		this.sourceId = sourceId;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
	public Integer getGold() {
		return gold;
	}
	public void setGold(Integer gold) {
		this.gold = gold;
	}
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getSourceType() {
		return sourceType;
	}
	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}
	
	public Integer getSourceId() {
		return sourceId;
	}
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}
	
	
}
