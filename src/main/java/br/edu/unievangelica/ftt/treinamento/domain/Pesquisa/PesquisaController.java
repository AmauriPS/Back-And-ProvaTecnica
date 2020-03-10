package br.edu.unievangelica.ftt.treinamento.domain.Pesquisa;

import br.edu.unievangelica.ftt.treinamento.core.controller.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/pesquisa")
public class PesquisaController extends AbstractController<Pesquisa> {

    @Autowired
    PesquisaService pesquisaService;

    @GetMapping("{pesquisa}")
    public ResponseEntity<?> findByPesquisa(@RequestBody Pesquisa pesquisa){
        return jsonResponse(pesquisaService.findByPesquisa(pesquisa));
    }
}
