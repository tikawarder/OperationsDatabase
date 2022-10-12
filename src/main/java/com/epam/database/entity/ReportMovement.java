package com.epam.database.entity;

import com.epam.database.domain.Operation;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
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
    Operation operation;
}
