package br.edu.unievangelica.ftt.treinamento.domain.Pesquisa;

import br.edu.unievangelica.ftt.treinamento.core.controller.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("api/")
public class PesquisaController extends AbstractController<Pesquisa> {

    @Autowired
    PesquisaService pesquisaService;

    @PostMapping("pesquisa")
    public ResponseEntity<?> findByPesquisa(@RequestBody Pesquisa pesquisa, Errors errors){
        return jsonResponse(pesquisaService.findByPesquisa(pesquisa, errors));
    }
    
    // pq isso não sobe?
    @PostMapping("salvar")
    public ResponseEntity<?> save(@RequestBody Pesquisa pesquisa, Errors errors){
        return jsonResponse(service.save(pesquisa, errors));
    }
}
