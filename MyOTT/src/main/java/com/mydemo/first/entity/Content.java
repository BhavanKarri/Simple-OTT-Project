package com.mydemo.first.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "content")
public class Content {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int movieId;
	@Id
	String movieName;
	String duration;
	String genre;
	String imageLink;
	
	

	public Content(int movieId, String movieName, String duration, String genre, String imageLink) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.duration = duration;
		this.genre = genre;
		this.imageLink = imageLink;
	}

	public Content(){
	}
	
	
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getImageLink() {
		return imageLink;
	}
	public void setImgLink(String imageLink) {
		this.imageLink = imageLink;
	}
	@Override
	public String toString() {
		return "Content [movieName=" + movieName + ", duration=" + duration + ", genre=" + genre + ", imgLink="
				+ imageLink + "]";
	}
}
