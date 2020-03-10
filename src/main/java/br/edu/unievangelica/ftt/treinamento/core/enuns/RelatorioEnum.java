package br.edu.unievangelica.ftt.treinamento.core.enuns;

public enum RelatorioEnum {

    REL_MANTENEDORAS("Lista de Mantenedora", "/jasper/mantenedora/mantenedoras.jasper"),
    REL_INSTITUICOES("Lista de Instituições", "/jasper/instituicao/instituicoes.jasper"),
    REL_PAISES("Lista de Paises", "/jasper/pais/paises.jasper");

    public String titulo;
    public String url;

    RelatorioEnum(String titulo, String url){
        this.titulo = titulo;
        this.url = url;
    }

}
