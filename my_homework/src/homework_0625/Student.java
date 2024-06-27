package homework_0625;

import java.util.HashMap;

public class Student extends Person{
	private String schoolName, grade;
	private Boolean isGraduate;
	private int schoolNum, korScore, engScore;
	private int comScore, totalScore;
	private double averageScore;
	HashMap<String, Integer> score;
	
	public Student(String name, String address, String phone, int age, String schoolName, String grade,
			Boolean isGraduate, int schoolNum, int korScore, int engScore, int comScore, int totalScore,
			double averageScore, HashMap<String, Integer> score) {
		super(name, address, phone, age);
		this.schoolName = schoolName;
		this.grade = grade;
		this.isGraduate = isGraduate;
		this.schoolNum = schoolNum;
		this.korScore = korScore;
		this.engScore = engScore;
		this.comScore = comScore;
		this.totalScore = totalScore;
		this.averageScore = averageScore;
		this.score = score;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Boolean getIsGraduate() {
		return isGraduate;
	}
	public void setIsGraduate(Boolean isGraduate) {
		this.isGraduate = isGraduate;
	}
	public int getSchoolNum() {
		return schoolNum;
	}
	public void setSchoolNum(int schoolNum) {
		this.schoolNum = schoolNum;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getComScore() {
		return comScore;
	}
	public void setComScore(int comScore) {
		this.comScore = comScore;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
	public HashMap<String, Integer> getScore() {
		return score;
	}
	public void setScore(HashMap<String, Integer> score) {
		this.score = score;
	}
}
