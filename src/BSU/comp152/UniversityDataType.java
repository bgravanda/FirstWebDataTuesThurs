package BSU.comp152;

import java.util.ArrayList;

public class UniversityDataType {
    String alpha_two_code;
    ArrayList<String> web_pages;
    String name;
    String country;
    ArrayList<String>domains;
    @Override
    public String toString(){
        return name+" is in "+country+" you can find it on the web here: "+web_pages;
    }
}
