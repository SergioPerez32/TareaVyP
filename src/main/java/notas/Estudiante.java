package notas;

public class Estudiante extends Persona implements Comparable<Estudiante>{
	public Nota nota = new Nota();
	public Estudiante (){
		super();
	}
	
	public Nota getNota (){
		return nota;
	}
	public void setNota (int nota1, int nota2, int nota3){
		nota.setNota1(nota1);
		nota.setNota2(nota2);
		nota.setNota3(nota3);
	}
    

	@Override
	public int compareTo(Estudiante e) {
        if (this.getNota().getTotal() < e.getNota().getTotal()) {
            return -1;
        }
        if (this.getNota().getTotal() > e.getNota().getTotal()) {
            return 1;
        }
        return 0;
    }	
}
