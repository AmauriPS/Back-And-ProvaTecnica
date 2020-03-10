package br.edu.unievangelica.ftt.treinamento.domain.Pesquisa;

import br.edu.unievangelica.ftt.treinamento.core.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;

@Service
public class PesquisaService extends AbstractService<Pesquisa> {

    @Autowired
    PesquisaRepository pesquisaRepository;

    public List<?> findByPesquisa(Pesquisa pesquisa, Errors errors){
        if (!pesquisa.getDescricao().isEmpty()){
            return pesquisaRepository.findByDescricao(pesquisa.getDescricao());
        }else if (!pesquisa.getSigla().isEmpty()){
            return pesquisaRepository.findBySigla(pesquisa.getSigla());
        }else if (!pesquisa.getEmail().isEmpty()){
            return pesquisaRepository.findByEmail(pesquisa.getEmail());
        }else {
            return repository.findAll();
        }
    }
}
