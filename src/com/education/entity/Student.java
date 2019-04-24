package com.education.entity;
//持久化学生对象
public class Student {
  private int stu_id;
  private String question;
  private String answer;
  private int slogin_id;
  private int age;
  private String sex;
  private String name;
  private  String email;

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
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

	public int getSlogin_id() {
		return slogin_id;
	}

	public void setSlogin_id(int slogin_id) {
		this.slogin_id = slogin_id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "["+this.stu_id+","+this.slogin_id+","
				+this.name+","+this.sex+","+
				this.age+","+this.email+","+
				this.question+","+this.answer+"]";
	}
}
