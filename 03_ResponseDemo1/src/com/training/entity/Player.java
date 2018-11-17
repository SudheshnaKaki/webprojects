package com.training.entity;

public class Player {
	int player_id;
	String player_name;
	int noOfMatches;
	int totalRunsScore;
	int noOfWickets;
	boolean isCaptain; 
	
@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", player_name="
				+ player_name + ", noOfMatches=" + noOfMatches
				+ ", totalRunsScore=" + totalRunsScore + ", noOfWickets="
				+ noOfWickets + ", isCaptain=" + isCaptain + "]";
	}

public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public int getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	public int getTotalRunsScore() {
		return totalRunsScore;
	}

	public void setTotalRunsScore(int totalRunsScore) {
		this.totalRunsScore = totalRunsScore;
	}

	public int getNoOfWickets() {
		return noOfWickets;
	}

	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}

	public boolean isCaptain() {
		return isCaptain;
	}

	public void setCaptain(boolean isCaptain) {
		this.isCaptain = isCaptain;
	}

public String battingRating(){
double average = this.totalRunsScore/this.noOfMatches;
	if(average > 90) {
		return "best";
		
	}
	else if(average >50){
		return "good";
	}
	else if(average >25) {
		return "poor";
	}
	return player_name;
}
public String bowlingRating(){
double average = this.totalRunsScore/this.noOfMatches;
	if(average > 90) {
		return "best";
		
	}
	else if(average >50){
		return "good";
	}
	else if(average >25) {
		return "poor";
	}
	return player_name;
}

public Player() {
	super();
}

public Player(int player_id, String player_name, int noOfMatches,
		int totalRunsScore, int noOfWickets, boolean isCaptain) {
	super();
	this.player_id = player_id;
	this.player_name = player_name;
	this.noOfMatches = noOfMatches;
	this.totalRunsScore = totalRunsScore;
	this.noOfWickets = noOfWickets;
	this.isCaptain = isCaptain;
}

}
