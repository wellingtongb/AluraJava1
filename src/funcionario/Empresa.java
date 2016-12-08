package funcionario;

public class Empresa {

	String nome;
	String cnpj;
	Funcionario[] listaDeFuncionarios;
	int livre = 0;

	
	
	public Funcionario GetFuncionario(int posicao){
		return this.listaDeFuncionarios[posicao];
	}
	
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	void adiciona(Funcionario f) {
        this.listaDeFuncionarios[this.livre] = f;
        this.livre++;
    }
    
    void mostraEmpregados(){
    	for( int i =0; i < this.livre; i++){
    		System.out.println("Funcionario na posição " + i);
    		System.out.println("Funcionario: " + listaDeFuncionarios[i].getNome());    		
    	}
    }
    
    void mostraTodasAsInformacoes(){
    	for( int i =0; i < this.livre; i++){
    		System.out.println("Funcionario na posição " + i);
    		this.listaDeFuncionarios[i].Mostra();
    	}
    }
    
    boolean Contem(Funcionario f){
    	for(int i =0; i < this.livre; i++){
    		if (listaDeFuncionarios[i] == f){
    			//System.out.println("true");
    			return true;
    		}    		   		
    	}
    	//System.out.println("False");
    	return false;
    }
	
}
