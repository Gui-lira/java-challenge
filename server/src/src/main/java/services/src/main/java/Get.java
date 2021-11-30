package services.src.main.java;



import javax.persistence.EntityManager;
import javax.persistence.Query;

public class Get {
    private EntityManager maneger;
    public String getStyleByWeather(Float value) {
        Query quer = maneger.createNativeQuery("SELECT name FROM Styles INNER JOIN FETCH Records" +
                "INNER JOIN FETCH Weather WHERE Weathers.max > ?1 AND Weathers.min < ?1");
        quer.setParameter(1, value);
        return  quer.getSingleResult().toString();
    }
    public String getRealtionByStyle(String name) {
        Query quer = maneger.createNativeQuery("SELECT id FROM Relations INNER JOIN FETCH Styles WHERE Styles.name = ?1");
        quer.setParameter(1, name);
        return  quer.getSingleResult().toString();
    }
}
