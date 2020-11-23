package com.antoniogilberto.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.antoniogilberto.cursomc.domain.Categoria;
import com.antoniogilberto.cursomc.domain.Cidade;
import com.antoniogilberto.cursomc.domain.Cliente;
import com.antoniogilberto.cursomc.domain.Endereco;
import com.antoniogilberto.cursomc.domain.Estado;
import com.antoniogilberto.cursomc.domain.Produto;
import com.antoniogilberto.cursomc.domain.enums.TipoCliente;
import com.antoniogilberto.cursomc.repositories.CategoriaRepository;
import com.antoniogilberto.cursomc.repositories.CidadeRepository;
import com.antoniogilberto.cursomc.repositories.ClienteRepository;
import com.antoniogilberto.cursomc.repositories.EnderecoRepository;
import com.antoniogilberto.cursomc.repositories.EstadoRepository;
import com.antoniogilberto.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	
	@Autowired
	public CategoriaRepository categoriaRepository;
	
	@Autowired
	public ProdutoRepository produtoRepository;
	
	@Autowired
	public EstadoRepository estadoRepository;
	
	@Autowired
	public ClienteRepository clienteRepository;
	
	@Autowired
	public CidadeRepository cidadeRepository;
	
	@Autowired
	public EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 Categoria cat1 = new Categoria(null, "Informatica");
		 Categoria cat2 = new Categoria(null, "Escritório");
		 
		 Produto p1 = new Produto(null, "Computador", 2000.00);
		 Produto p2 = new Produto(null, "Impressora", 800.00);
		 Produto p3 = new Produto(null, "Mouse", 80.00);
		 
		 

         cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
         cat2.getProdutos().addAll(Arrays.asList(p2));
         
         p1.getCategorias().addAll(Arrays.asList(cat1));
         p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
         p3.getCategorias().addAll(Arrays.asList(cat1));
         
         categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		 produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
         
         Estado est1 = new Estado(null, "Minas Gerais");
         Estado est2 = new Estado(null, "São Paulo");
         
         Cidade c1 = new Cidade(null, "Uberlândia", est1);
         Cidade c2 = new Cidade(null, "São Paulo", est2);
         Cidade c3 = new Cidade(null, "Campinas", est2);
         
         est1.getCidades().addAll(Arrays.asList(c1));
         est2.getCidades().addAll(Arrays.asList(c2, c3));
         
         estadoRepository.saveAll(Arrays.asList(est1, est2));
         cidadeRepository.saveAll(Arrays.asList(c1,c2, c3));
         
         Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "36378912377", TipoCliente.PESSOAFISICA);
         
         cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));
         
         Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 303", "jardim", "38220834", cli1, c1);
		 Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c2);
		 
		 cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		 
		 clienteRepository.saveAll(Arrays.asList(cli1));
		 enderecoRepository.saveAll(Arrays.asList(e1, e2));

	}

}
