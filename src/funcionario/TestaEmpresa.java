package funcionario;

public class TestaEmpresa {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();
		
		//instanciando um array de 10 posições para o array existente na clasa empresa
		empresa.listaDeFuncionarios = new Funcionario[10];
		
		Funcionario f1 = new Funcionario();
		f1.setNome("wellington");
		f1.setRg("123456789");
		f1.setDepartamento("Setor Projetos"); 
		f1.setSalario(1800.0);
		Data d = new Data();
		d.preencheData(02, 12, 2016);
		f1.setDataDeEntrada(d);		
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Roberto");
		f2.setRg("12355559"); 
		f2.setDepartamento("Setor Vendas");
		f2.setSalario(2500.0);
		Data d1 = new Data();
		d1.preencheData(23, 04, 2005);
		f2.setDataDeEntrada(d1);	
		
		empresa.adiciona(f1);
		empresa.adiciona(f2);
		
		empresa.mostraTodasAsInformacoes();
		
		//empresa.mostraTodasAsInformacoes();		
		System.out.println(empresa.Contem(f1));		
		
	}

}
