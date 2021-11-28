package Entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "relations")
@Entity(name = "Relation")
public class Relation {
    @OneToOne
    private Style style;
    @OneToOne
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