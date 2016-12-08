package funcionario;

public class Funcionario {
	
	private String nome;
	private String departamento;
	private double salario;
	private String rg;
	private Data dataDeEntrada = new Data();
	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Data getDataDeEntrada() {
		return dataDeEntrada;
	}

	public void setDataDeEntrada(Data dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}

	public void bateCartao(){
	System.out.println("Hoje eu cheguei no horário!");
	}
	
	public void RecebeAumento(double valor){
		this.salario += valor;
	}
	
	public double CalculaGanhoAnual(){
		return this.salario * 12;
	}
	
	public void PedeFerias(){
		System.out.println("Estou precisando de férias!");
	}
	
	public void PedeDemissao(){
		System.out.println("Agora sou livre!\nMe demito e vou pro mundo");
	}
	
	public void Mostra()
	{
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("RG: " + this.rg);
		System.out.println("Data de entrada: "+ this.dataDeEntrada.GetFormatada());
		System.out.println("-----------------------------------------\n");
	}

}
