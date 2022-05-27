package com.padwan.test.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class JediDTO {

    private Integer id;
    private String nome;
    private String mentor;
    private Integer midichlorians;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public Integer getMidichlorians() {
        return midichlorians;
    }

    public void setMidichlorians(Integer midichlorians) {
        this.midichlorians = midichlorians;
    }
}
