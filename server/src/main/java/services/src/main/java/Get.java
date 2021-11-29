package services.src.main.java;

import Entities.Style;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class Get {
    private EntityManager maneger;
    public String getStyleByWeather(int value) {
        Query quer = maneger.createNativeQuery("SELECT name FROM Styles INNER JOIN FETCH Records" +
                "INNER JOIN FETCH Weather WHERE Weathers.max > ?1 AND Weathers.min < ?1");
        quer.setParameter(1, value);
        return  quer.getSingleResult().toString();
    }
}
