/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

/**
 *
 * @author Henz Montera
 */
public class recentmovies {
    
    private String title;
    private int year,month;
    

    public recentmovies(String title, int year, int month){
        this.title = title;
        this.year = year;
        this.month = month;
}

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }
    
    public String display(){
        return "["+title+" "+month+" "+year+"]";
    }
    
    
}
