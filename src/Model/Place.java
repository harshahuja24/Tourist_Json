package Model;

public class Place {
    private int place_id;
    private String city_name;
    private String country_name;

    public int getPlace_id() {
        return place_id;
    }

    public void setPlace_id(int place_id) {
        this.place_id = place_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }


    public Place(String name,String countryname, int id){
        this.city_name=name;
        this.country_name=countryname;
        this.place_id=id;
    }
    public String toString(){

        return "User name:"+this.city_name+" Surname:"+this.country_name+" place Id "+this.place_id;
    }
}
