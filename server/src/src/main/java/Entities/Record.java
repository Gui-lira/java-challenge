package Entities;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Table(name = "records")
@Entity(name = "Record")
public class Record {
    @ManyToOne
    @JoinColumn(name = "relation_id")
    private Relation relation;
    @Id
    @Column(name = "id", nullable = false)
    protected Long id;
    public Long relation_id;
    @CreationTimestamp
    private Date created_at;
}