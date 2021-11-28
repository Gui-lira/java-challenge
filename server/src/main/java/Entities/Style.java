package Entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "styles")
@Entity(name = "Style")
public class Style {
    @OneToOne(mappedBy = "style")
    private Relation relation;
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}