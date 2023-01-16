package n1exercici1;
import java.util.ArrayList;

public class Month {
	/*
	 * Crea una classe Java que insereixi en una llista ordenada els noms dels mesos de l'any.
	 */
	
	private ArrayList<String> ArrayMonth= new ArrayList<String>();

	public Month() {
		
		ArrayMonth.add("Enero");
		ArrayMonth.add("Febrero");
		ArrayMonth.add("Marzo");
		ArrayMonth.add("Abril");
		ArrayMonth.add("Mayo");
		ArrayMonth.add("Junio");
		ArrayMonth.add("Julio");
		ArrayMonth.add("Agosto");
		ArrayMonth.add("Septiembre");
		ArrayMonth.add("Octubre");
		ArrayMonth.add("Noviembre");
		ArrayMonth.add("Diciembre");
		}
	
	// Getter & Setter
	
	public  ArrayList<String> getArrayMonth() {
		return ArrayMonth;
	}

	public  void setArrayMonth(ArrayList<String> arrayMonth) {
		ArrayMonth = arrayMonth;
	}
	
	// Methods
	
		
	public  int retornSize() {
		System.out.println(ArrayMonth.size());
		return ArrayMonth.size();
		
		}
	


	public boolean retornTrueSiNulla() {
		System.out.println(ArrayMonth.size());
		return ArrayMonth.size()!=0;
		}
	
	public  boolean retornaTrueSiWordAreTheSame(String month) {
		System.out.println(ArrayMonth.get(8));
		return ArrayMonth.get(8).equalsIgnoreCase(month);
	}
	
}

