package com.example.railwayreservationsystem.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "train")

public class Train {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private Integer capasity;

    @NotNull
    private List seat;

    // True-> The train in road or in maintenance:
    // False-> The train can usable for new line.
    @NotNull
    private boolean inusage;



}
