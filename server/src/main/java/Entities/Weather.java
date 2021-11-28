package Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.context.annotation.Primary;

import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import java.util.Date;

@Table(name = "weathers")
@Entity(name = "Weather")
public class Weather {
    @OneToOne(mappedBy = "weather")
    private Relation relation;
    @Id
    @GeneratedValue
    private Long id;
    private int max;
    private int min;

}