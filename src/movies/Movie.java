package movies;

import java.util.Arrays;
import util.Input;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCat (String category){
        this.category = category;
    }

    public static Movie[] addMovie(Movie[] movie, String name)
}
