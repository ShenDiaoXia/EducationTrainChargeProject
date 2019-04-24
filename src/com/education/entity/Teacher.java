package com.education.entity;
//持久化教师对象
public class Teacher {
	 private int  t_id;
	    private int tlogin_id;
	    private int ts_id;
	    private int t_name;
	    private String phone;

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public int getTlogin_id() {
		return tlogin_id;
	}

	public void setTlogin_id(int tlogin_id) {
		this.tlogin_id = tlogin_id;
	}

	public int getTs_id() {
		return ts_id;
	}

	public void setTs_id(int ts_id) {
		this.ts_id = ts_id;
	}

	public int getT_name() {
		return t_name;
	}

	public void setT_name(int t_name) {
		this.t_name = t_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	private String  question;
	    private String  answer;


		@Override
		public String toString() {
			return "["+this.t_id+","+this.tlogin_id+","+
					+this.t_name+","+this.question+","+this.answer+"]";
		}
}
