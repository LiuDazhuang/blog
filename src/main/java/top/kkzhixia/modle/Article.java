package top.kkzhixia.modle;

import java.sql.Date;

public class Article {
	
	public int a_id;
	public String a_title;
	public String a_content;
	
	public Date create_time;
	
	public Date update_time;
	
	public String a_type_id;

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getA_title() {
		return a_title;
	}

	public void setA_title(String a_title) {
		this.a_title = a_title;
	}

	public String getA_content() {
		return a_content;
	}

	public void setA_content(String a_content) {
		this.a_content = a_content;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public String getA_type_id() {
		return a_type_id;
	}

	public void setA_type_id(String a_type_id) {
		this.a_type_id = a_type_id;
	}
	
	
	public Article(){
		
	}
	
	

}
