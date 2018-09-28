package notas;
public class Nota{
	public int nota1;
	public int nota2;
	public int nota3;
	public int notaF = getTotal();
	
	public int getNota1 (){
		return nota1>100?0:nota1;
	}
	public int getNota2 (){
		return nota2>100?0:nota2;
	}
	
	public int getNota3 (){
		return nota3>100?0:nota3;
	}
	
	public void setNota1(int nota1){
		this.nota1=nota1>100?0:nota1;
	}
	
	public void setNota2(int nota2){
		this.nota2=nota2>100?0:nota2;
	}
	
	public void setNota3(int nota3){
		this.nota3=nota3>100?0:nota3;
	}
	
	public int getTotal (){
		return (nota1+nota2+nota3)/3;
	}
	
}
