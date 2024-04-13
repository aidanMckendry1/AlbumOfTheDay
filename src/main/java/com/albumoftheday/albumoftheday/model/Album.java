package com.albumoftheday.albumoftheday.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int albumId;
    private String title;
    private String band;
    private String country;
    private String year;
    private int rank;
    private boolean live;
    private boolean compilation;
    private int yearRank;
    private int decadeRank;
    private int rankScore;
    private float avgRating;
    private int numRatings;

    public Album(){
    }
    
    


    /**
     * @return int return the albumId
     */
    public int getAlbumId() {
        return albumId;
    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return String return the band
     */
    public String getBand() {
        return band;
    }


    /**
     * @return String return the country
     */
    public String getCountry() {
        return country;
    }



    /**
     * @return String return the year
     */
    public String getYear() {
        return year;
    }



    /**
     * @return int return the rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * @return boolean return the live
     */
    public boolean isLive() {
        return live;
    }


    /**
     * @return boolean return the compilation
     */
    public boolean isCompilation() {
        return compilation;
    }


    /**
     * @return int return the yearRank
     */
    public int getYearRank() {
        return yearRank;
    }



    /**
     * @return int return the decadeRank
     */
    public int getDecadeRank() {
        return decadeRank;
    }

    /**
     * @return int return the rankScore
     */
    public int getRankScore() {
        return rankScore;
    }

    /**
     * @return float return the avgRating
     */
    public float getAvgRating() {
        return avgRating;
    }


    /**
     * @return int return the numRatings
     */
    public int getNumRatings() {
        return numRatings;
    }
}
