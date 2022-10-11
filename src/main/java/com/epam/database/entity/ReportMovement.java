package com.epam.database.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="store")
public class ReportMovement {
    @Id
    @GeneratedValue
    long id;
    @Column(name="fromLevel")
    int from;
    @Column(name="toLevel")
    int to;
    int loadPeople;
    int unloadPeople;
    Enum state;
}
