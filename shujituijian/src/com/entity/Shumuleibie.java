package com.entity;

public class Shumuleibie {
    private Integer id;
	private String leibie;	
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getLeibie() {
        return leibie;
    }
    public void setLeibie(String leibie) {
        this.leibie = leibie == null ? null : leibie.trim();
    }	
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息
