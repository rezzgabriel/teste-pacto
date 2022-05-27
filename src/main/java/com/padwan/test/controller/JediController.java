package com.padwan.test.controller;

import com.padwan.test.projection.CategoriaQuantidadeProjection;
import com.padwan.test.projection.JediMidichloriansProjection;
import com.padwan.test.projection.MentorAprendizProjection;
import com.padwan.test.repository.JediRepository;
import com.padwan.test.service.JediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jedi")
public class JediController {

    @Autowired
    JediService jediService;

    @RequestMapping(value = "/mentores", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MentorAprendizProjection> buscaMentorComAprendiz() {
        return jediService.buscaMentorComAprendiz();
    }

    @RequestMapping(value = "/9000", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<JediMidichloriansProjection> buscaJediAcima9000() {
        return jediService.buscaJediAcima9000();
    }

    @RequestMapping(value = "/qtd-categoria", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CategoriaQuantidadeProjection> quantidadePorCategoria() {
        return jediService.quantidadePorCategoria();
    }

}
