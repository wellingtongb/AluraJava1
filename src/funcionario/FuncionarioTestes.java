package funcionario;

public class FuncionarioTestes {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f.nome = "wellington";
		f.salario = 1500;
		f.departamento = "Projetos";
		f.rg = "42.172.316-6";
		f.dataDeEntrada.preencheData(02, 02, 2016);	
			
	/*	f2.nome = "wellington3434343";
		f2.salario = 1500;
		f2.departamento = "Projetos";
		f2.dataEntrada = "21/02/2016";
		f2.rg = "42.172.316-6";*/
		
		//f.bateCartao();
		//System.out.println("Salario atual: " + f.salario);
		
		//f.RecebeAumento(300);
		//f.CalculaGanhoAnual();
		
		//System.out.println("Salario com aumento: " + f.salario);
		//System.out.println("Ganho anual: " + f.CalculaGanhoAnual());
		f.Mostra();
		
	}

}
