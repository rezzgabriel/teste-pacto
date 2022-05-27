package com.padwan.test.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "MENTOR_APRENDIZ")
public class MentorAprendiz {

    @Column(name = "ID_MENTOR")
    private Jedi idMentor;

    @Column(name = "ID_APRENDIZ")
    private Jedi idAprendiz;

    public Jedi getIdMentor() {
        return idMentor;
    }

    public void setIdMentor(Jedi idMentor) {
        this.idMentor = idMentor;
    }

    public Jedi getIdAprendiz() {
        return idAprendiz;
    }

    public void setIdAprendiz(Jedi idAprendiz) {
        this.idAprendiz = idAprendiz;
    }
}
