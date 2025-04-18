package io.github.spring.produtos.api.model;

//POJO -> Plain Old Java Object
//Diz que essa classe é uma entidade JPA
//ESSA É A CLASSE - MODELO DE NEGÓCIO
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Mapeamento da entidade produto

@Entity
@Table (name = "produto") //table opcional porque nesse o nome da classe é igual ao da tabela do banco
public class Produto {

    @Id //que é a primary key da tabela do banco, id /  //isso é o mapeamento do banco de dados; JPA
    @Column (name = "id")
    private String id;

    @Column (name = "nome")
    private String nome;

    @Column (name = "descricao")
    private String descricao;

    @Column (name = "preco")
    private Double preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    //representação toString desse objeto -> pra imprimir
    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
