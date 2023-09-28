package ProjetoConstrutor;

import Cliente1.Cliente;
import Cliente1.Cliente2;
import Endereco1.Endereco;
import Endereco1.Endereco2;
import ItemTema1.ItemTema;
import ItemTema1.ItemTema2;
import Tema1.Tema;
import Tema1.Tema2;

public class ClassePrincipal {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();

		cliente1.setId(6);
		cliente1.setNome("Aline");
		cliente1.setTelefone("99888888");
		cliente1.setCpf("43445655665");
		cliente1.setRg("1234567");




		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());






		Cliente2 cliente2 = new Cliente2(7,"Mariana",
				"9914496742","24364685434","8901234");

		System.out.println(cliente2.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());	




		Endereco endereco1 = new Endereco();

		endereco1.setId(3);
		endereco1.setLogradouro("Rua");
		endereco1.setNumero(300);
		endereco1.setComplemento("Apartamento");
		endereco1.setBairro("Jd das Flores");
		endereco1.setCidade("Sao Paulo");
		endereco1.setCep("15555550");
		endereco1.setUf("SP");



		System.out.println(endereco1.getId());
		System.out.println(endereco1.getLogradouro());
		System.out.println(endereco1.getNumero());
		System.out.println(endereco1.getComplemento());
		System.out.println(endereco1.getBairro());
		System.out.println(endereco1.getCidade());
		System.out.println(endereco1.getCep());
		System.out.println(endereco1.getUf());




		Endereco2 endereco2 = new Endereco2(5,"Rua",270,
				"Nenhum","Vila Alvorada","Sao Paulo",
				"66660660","SP");

		System.out.println(endereco2.getId());
		System.out.println(endereco2.getLogradouro());
		System.out.println(endereco2.getNumero());
		System.out.println(endereco2.getComplemento());
		System.out.println(endereco2.getBairro());
		System.out.println(endereco2.getCidade());
		System.out.println(endereco2.getCep());
		System.out.println(endereco2.getUf());





		ItemTema itemTema1 = new ItemTema();

		itemTema1.setId(1);
		itemTema1.setNome("Paulo");
		itemTema1.setDescricao("Tema não identificado");


		System.out.println(itemTema1.getId());
		System.out.println(itemTema1.getNome());
		System.out.println(itemTema1.getDescricao());



		ItemTema2 itemTema2 = new ItemTema2(2,"Julia","Sem descricao");

		System.out.println(itemTema2.getId());
		System.out.println(itemTema2.getNome());
		System.out.println(itemTema2.getDescricao());




		Tema tema1 = new Tema();

		tema1.setId(1);
		tema1.setNome("Ricardo");
		tema1.setValorAluguel(700);
		tema1.setCorToalha("Branco");

		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorToalha());





		Tema2 tema2 = new Tema2(2,"Julia",650,"Rosa");

		System.out.println(tema2.getId());
		System.out.println(tema2.getNome());
		System.out.println(tema2.getValorAluguel());
		System.out.println(tema2.getCorToalha());

	}
}
