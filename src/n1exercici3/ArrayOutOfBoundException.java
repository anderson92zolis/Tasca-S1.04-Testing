package n1exercici3;

public class ArrayOutOfBoundException {
	
	private int[] mi_matriz = new int[5];
	
	static int index;
	
	public ArrayOutOfBoundException(int index) {
		this.index=index;
		}
	// getters & setters	
	public int[] getMi_matriz() {
		return mi_matriz;
	}

	public static int getIndex() {
		return index;
	}
	public static void setIndex(int index) {
		ArrayOutOfBoundException.index = index;
	}
	public void setMi_matriz(int[] mi_matriz) {
		this.mi_matriz = mi_matriz;
	}
	public void compuebaArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
		if (mi_matriz.length < index) {
			System.out.println("index de list "+ index+" " + mi_matriz[index]);
			throw new ArrayIndexOutOfBoundsException("crea la clase ArrayIndexOutOfBoundsException");
			} else {
				System.out.println("índice en array correcto! ");
				}
		}
}
