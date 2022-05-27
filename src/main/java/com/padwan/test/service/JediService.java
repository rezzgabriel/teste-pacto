package com.padwan.test.service;

import com.padwan.test.projection.CategoriaQuantidadeProjection;
import com.padwan.test.projection.JediMidichloriansProjection;
import com.padwan.test.projection.MentorAprendizProjection;
import com.padwan.test.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JediService {

    @Autowired
    JediRepository jediRepository;

    public List<MentorAprendizProjection> buscaMentorComAprendiz() {
        return jediRepository.buscaMentorComAprendiz();
    }

    public List<JediMidichloriansProjection> buscaJediAcima9000() {
        return jediRepository.buscaJediAcima9000();
    }

    public List<CategoriaQuantidadeProjection> quantidadePorCategoria() {
        return jediRepository.quantidadePorCategoria();
    }
}
