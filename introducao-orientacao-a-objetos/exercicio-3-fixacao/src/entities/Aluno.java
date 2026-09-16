package entities;

public class Aluno {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	
	public String media() {
	    if (finalGrade() < 60.0) {
	        double calc = 60.0 - finalGrade();

	        return "FAILED%nMISSING %.2f POINTS".formatted(calc);
	    } else {
	        return "PASS";
	    }
	}
	
	public String toString() {
	    return "FINAL GRADE = "
	        + String.format("%.2f%n", finalGrade())
	        + media();
	}
	
	
}
