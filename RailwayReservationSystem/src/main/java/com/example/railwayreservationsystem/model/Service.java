package com.example.railwayreservationsystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="service")

public class Service implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    // The service date. (02/02/2022 17:45)
    @NotNull
    private Date date;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "Train_id")
    private Train train;

    // The service rotation called as Railway. (İstanbul-Ankara)
    @OneToOne
    @NotNull
    private Railway railway;


}
