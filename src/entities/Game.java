package entities;

import java.util.Calendar;

import abstracts.Entity;

public class Game implements Entity {
	private int id;
	private String gameName;
	private Calendar releaseDate;
	private double gamePrice;
	
	public Game() {
		
	}
	
	public Game(int id, String gameName, Calendar releaseDate, double gamePrice) {
		this.id = id;
		this.gameName = gameName;
		this.releaseDate = releaseDate;
		this.gamePrice = gamePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public Calendar getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Calendar releaseDate) {
		this.releaseDate = releaseDate;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
}
