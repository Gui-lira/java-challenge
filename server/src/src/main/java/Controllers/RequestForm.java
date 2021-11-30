package Controllers;

import java.util.List;

public class RequestForm {
    private String city;
    private String lat;
    private String lon;
    public String[] getValue() {
        if (city.isEmpty()) {
            String[] returnArr = {lat, lon};
            return  returnArr;
        }
        String[] returnArr = {city};
        return returnArr;
    }
}
