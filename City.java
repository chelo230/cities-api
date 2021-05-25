package com.github.chelo230.citiesapi.cities;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.awt.*;

@Entity
@Table(name="cidade")

@TypeDefs(value = {
        @TypeDef(name= "point", typeClass = PointType.class)


})
public class City {

    @Id
    private Long id;

    @Column(name="nome")
    private String nome;

    private Integer uf;

    private Integer ibge;

    //1st
    @Column(name = "lat_lon")
    private String geoLocation;

    //2nd

/*
    @Type(type = "point")
    @Column(name="lat_lon", updatable = false = false, inserttable = false)
    private Point location;


    public City() {

    }

}
