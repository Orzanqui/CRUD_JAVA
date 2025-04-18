package io.github.spring.produtos.api.repository;


//CLASSES QUE VÃO FAZER A OPERAÇÃO NO BANCO DE DADOS de salvar, atualizar, deletar, spring data JPA -> JPA Repostirores = ‘Interfaces’
//Preciso ter a classe para salvar o produto no banco de dados, que vai fazer a comunicação da classe produto para o banco de dados

import io.github.spring.produtos.api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Passa a classe como Parametro (tipo da entidade que vou fazer as operações)e o 2 parametro o atributo que representa o ID
public interface ProdutoRepository extends JpaRepository<Produto,String> {

    List<Produto> findByNome(String nome);

}
