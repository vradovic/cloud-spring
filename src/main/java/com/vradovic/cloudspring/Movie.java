package com.vradovic.cloudspring;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "${TABLE_NAME}")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String genre;
    Long year;
}
