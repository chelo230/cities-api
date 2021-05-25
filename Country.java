package com.github.chelo230.citiesapi.countries;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity(name = "Country")
@Table(name= "pais")
public class Country {

    @Id
    protected Long id;

    @Column (name = "nome")
    protected String nomepais;

    @Column (name = "nome_pt")
    protected String portugueseName;

    @Column (name = "sigla")
    protected String siglapais;

    @Column (name = "bacen")
    protected Integer bacen;

    Country(Long id,String nomepais,String portugueseName,String siglapais,Integer bacen) {
        this.id = id;
        this.nome = nomepais;
        this.portugueseName = portugueseName;
        this.sigla = siglapais;
        this.bacen = bacen;

    }

}
