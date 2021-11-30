package Entities;
import javax.persistence.*;
import java.util.List;

@Table(name = "relations")
@Entity(name = "Relation")
public class Relation {
    @OneToOne
    @JoinColumn(name = "style_id", referencedColumnName = "id")
    private Style style;
    @OneToOne
    @JoinColumn(name = "weather_id", referencedColumnName = "id")
    private Weather weather;
    @OneToMany(mappedBy = "relation")
    private List<Record> recordList;
    @Id
    @GeneratedValue
    private Long id;
    private Long style_id;
    private Long weather_id;

    public Style getStyle() {
        return style;
    }
}