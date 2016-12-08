package funcionario;

public class Data {
	int dia;
	int mes; 
	int ano;
	
	public void preencheData (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
	
	public String GetFormatada()
	{
		return this.dia+ "/" + this.mes + "/" + this.ano;		
	}

}
