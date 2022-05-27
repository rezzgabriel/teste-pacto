package com.padwan.test.repository;

import com.padwan.test.entity.Jedi;
import com.padwan.test.projection.CategoriaQuantidadeProjection;
import com.padwan.test.projection.JediMidichloriansProjection;
import com.padwan.test.projection.MentorAprendizProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JediRepository extends JpaRepository<Jedi, Integer> {

    @Query(nativeQuery = true, value = "SELECT mentor.nome as mentor, jedi.nome as aprendiz FROM test.mentor\n" +
            "LEFT JOIN test.mentor_aprendiz\n" +
            "ON mentor.id = id_mentor\n" +
            "LEFT JOIN test.jedi\n" +
            "ON jedi.id = id_aprendiz")
    List<MentorAprendizProjection> buscaMentorComAprendiz();

    @Query(nativeQuery = true, value = "SELECT j.nome, j.midichlorians from test.jedi j where j.midichlorians > 9000")
    List<JediMidichloriansProjection> buscaJediAcima9000();

    @Query(nativeQuery = true, value = "SELECT status.descricao as categoria, COUNT(id_status) as Total FROM test.status\n" +
            "INNER JOIN test.jedi\n" +
            "ON status.id = jedi.id_status\n" +
            "GROUP BY status.descricao")
    List<CategoriaQuantidadeProjection> quantidadePorCategoria();
}
