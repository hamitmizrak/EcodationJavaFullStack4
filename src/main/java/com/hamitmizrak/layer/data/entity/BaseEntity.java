package com.hamitmizrak.layer.data.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

//lombok
@Getter
@Setter

//Entity
@MappedSuperclass
abstract public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="system_created_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemCreatedDate;
}
