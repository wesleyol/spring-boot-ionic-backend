package com.wesley.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wesley.cursomc.domain.Categoria;
import com.wesley.cursomc.domain.Cidade;
import com.wesley.cursomc.domain.Cliente;
import com.wesley.cursomc.domain.Endereco;
import com.wesley.cursomc.domain.Estado;
import com.wesley.cursomc.domain.ItemPedido;
import com.wesley.cursomc.domain.Pagamento;
import com.wesley.cursomc.domain.PagamentoComBoleto;
import com.wesley.cursomc.domain.PagamentoComCartao;
import com.wesley.cursomc.domain.Pedido;
import com.wesley.cursomc.domain.Produto;
import com.wesley.cursomc.domain.enums.EstadoPagamento;
import com.wesley.cursomc.domain.enums.TipoCliente;
import com.wesley.cursomc.repositories.CategoriaRepository;
import com.wesley.cursomc.repositories.CidadeRepository;
import com.wesley.cursomc.repositories.ClienteRepository;
import com.wesley.cursomc.repositories.EnderecoRepository;
import com.wesley.cursomc.repositories.EstadoRepository;
import com.wesley.cursomc.repositories.ItemPedidoRepository;
import com.wesley.cursomc.repositories.PagamentoRepository;
import com.wesley.cursomc.repositories.PedidoRepository;
import com.wesley.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	}
}