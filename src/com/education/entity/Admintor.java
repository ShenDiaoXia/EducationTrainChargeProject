package com.education.entity;
//持久化管理员对象
public class Admintor  {
    private int  id;
    private int slogin_id;
    private String name;
    private String school;
    private String  question;
    private String  answer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSlogin_id() {
		return slogin_id;
	}

	public void setSlogin_id(int slogin_id) {
		this.slogin_id = slogin_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
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

	@Override
	public String toString() {
		return "["+"账号"+this.getId()+","+"密保"+this.getQuestion()+","+"答案"+this.getAnswer()+","+"loginid"+this.getSlogin_id()+"]";
	}
    
}
