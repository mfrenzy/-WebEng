package at.ac.tuwien.big.we15.lab2.api.bean;

import at.ac.tuwien.big.we15.lab2.api.Question;

public class Userinformation {
	private String userName;
	private String password;
	private Question lastQuestion;
	private int score;
	
	public Userinformation() {
		//initialize here
		score = 0;
		userName = "";
		password = "";
		lastQuestion = null;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Question getLastQuestion() {
		return lastQuestion;
	}

	public void setLastQuestion(Question lastQuestion) {
		this.lastQuestion = lastQuestion;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
