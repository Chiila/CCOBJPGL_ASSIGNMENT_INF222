package model;

public class Drinks {
    private String Name;
    private String Rating;

    public String getRating(){
        return this.Rating;
    }
    public void setRating (String rating){
        this.Rating = rating;
    }
    public String getName(){
        return this.Name;
    }
    public void setName (String name){
        this.Name = name;
    }
}