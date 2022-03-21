package com.mammadov.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="details")
public class Detail {
    @Id
    private int id;
}
