package com.anncode.amazonviewer.model;

import java.util.ArrayList;

/**
 * <H1>aSerie</H1>
 * Serie hereda de film, pero no va a ser tratado como una movie  que se reproduce, dentro de serie tendra capitulos,
 * que si actuaran como movie
 * 
 * @author AlvaroFlorencia
 * @version 1.1
 * @since 2021
 */

public class Serie extends Film {
	
	private int id;
	private int sessionQuantity;
	private ArrayList<Chapter> chapters;
	

	public Serie(String title, String genre, String creator, int duration, int sessionQuantity) {
		super(title, genre, creator, duration);
		// TODO Auto-generated constructor stub
		this.sessionQuantity = sessionQuantity;
	}
	
	

	public int getId() {
		return id;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: SERIE ::" + 
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() + 
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}

	public static ArrayList<Serie> makeSeriesList() {
		ArrayList<Serie> series = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			Serie serie = new Serie("Serie "+i, "genero "+i, "creador "+i, 1200, 5);
			serie.setChapters(Chapter.makeChaptersList(serie));
			series.add(serie);
			
		}
		
		return series;
	}



	@Override
	public void view() {
		// TODO Auto-generated method stub
		setViewed(true);
	}
	
}
