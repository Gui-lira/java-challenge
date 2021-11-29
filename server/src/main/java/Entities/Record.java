package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Table(name = "records")
@Entity(name = "Record")
public class Record {
    @ManyToOne
    @JoinColumn(name = "relation_id")
    private Relation relation;
    @jakarta.persistence.Id
    @jakarta.persistence.Column(name = "id", nullable = false)
    protected Long id;
    public Long relation_id;
    @CreationTimestamp
    private Date created_at;
}