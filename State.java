package com.github.chelo230.citiesapi.states;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.github.chelo230.citiesapi.countries.Country;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.hibernate.mapping.List;
import javax.persistence.*;


@Entity(name="State")
@Table(name="estado")
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class State {

    @Id
    private Long id;

    @Column (name = "nome")
    private String nome;

    private String uf;

    private Integer ibge;

    @Column (name="pais");
    private Integer paisId;

    // forma de relacionamento com tabelas
    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Country country;


    @Type(type = "json")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "json")
    private List<Integer> ddd;

    public State(){

    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public Integer getPaisId() {
        return paisId;
    }

    public List<Integer> getDdd() {
        return ddd;
    }

}

