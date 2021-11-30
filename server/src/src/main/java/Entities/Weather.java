package Entities;



import javax.persistence.*;


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