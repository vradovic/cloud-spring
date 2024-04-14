package com.vradovic.cloudspring;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sv_27_2021")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String genre;
    Long year;
}
