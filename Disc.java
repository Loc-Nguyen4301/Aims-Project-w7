import java.lang.reflect.Constructor;
import java.util.*;

public class Disc extends Media {

    protected String director;
    protected int length;

    public String getDirector() {
        return this.director;
    }


    public int getLength() {
        return this.length;
    }

    public Disc(String title,String category,float cost, String director,int length){
        super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		this.length = length;
    }


}


//2.2