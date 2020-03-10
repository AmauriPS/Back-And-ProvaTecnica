package br.edu.unievangelica.ftt.treinamento.domain.Pesquisa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PesquisaRepository extends JpaRepository<Pesquisa,Long> {
    List<Pesquisa> findByDescricao(String descricao);
    List<Pesquisa> findBySigla(String sigla);
    List<Pesquisa> findByEmail(String email);
}
