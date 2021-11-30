package Controllers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties
public class JsonBody {
    private JsonPart main;
    public Float GetAverage() {
        return (main.temp_max + main.temp_min) / 2;
    }
}
