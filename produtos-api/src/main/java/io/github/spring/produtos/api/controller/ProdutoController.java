package io.github.spring.produtos.api.controller;

//Classe Controller que vai receber as requisições REST (Get,Set,Put,Delete) - como se fosse o o "UsaFuncionário" nos exercicios de Java
//Anotação RestController nela, que diz que essa classe vai receber requisições
//RequestMapping quando pesquisar na porta 8080 produtos, qual é a URL base.
//ESSA É A API
import io.github.spring.produtos.api.model.Produto;
import io.github.spring.produtos.api.repository.ProdutoRepository;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController  //rest usa métodos http, delete, get, post, put
@RequestMapping("produtos") //serve para mapear a url
public class ProdutoController {

    private ProdutoRepository produtoRepository;
    //propriedade

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
        //construtor produtoRepository, que vai ser chamado
    }


    @PostMapping //para enviar, salvar dados (recurso) no servidor, PostMapping pertencente a classe Produto
    //no momento não precisa adicionar url no PostMapping, pois qndo fizer a requisição de produtos no reqmapping
    //RequestBody quando enviar um objeto JSON, coloque os dados enviados(Json) no objeto produtos.
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido " + produto);
        
        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        return produto;
        //está persistindo os dados normal
    }

    //metodo get para obter por id utilizando o produtoRepository
    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable("id") String id){
        return  produtoRepository.findById(id).orElse(null);
    }

    //Isso aqui serve para ligar o valor da URL com o parâmetro do metodo
    //@PathVariable("id") String id diz ao Spring:
    //👉 "Pegue o valor que está na URL no lugar de {id} e coloca ele na variável id".
    @DeleteMapping("{id}")
    public void deletar (@PathVariable ("id") String id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("{id}") //quando queremos atualizar
    public void atualizar(@PathVariable("id") String id,
                          @RequestBody Produto produto){

        produto.setId(id);
        produtoRepository.save(produto);
        //save tanto para salvar quanto para atualizar, se vier com id, atualiza, se vir sem id, salva.

        //Quando você usa @RequestBody, você está dizendo para o Spring:
        //"Spring, pega os dados que estão vindo no corpo da requisição HTTP (normalmente em JSON)
        // e transforma isso num objeto Java pra mim."

    }

    //metodo busca de produtos por nome
    @GetMapping
    public List<Produto> buscar(@RequestParam("nome") String nome){
        return produtoRepository.findByNome(nome);
    }



}
