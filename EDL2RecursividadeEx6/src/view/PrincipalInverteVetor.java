package view;
import controller.ControllerInverteVetor;
public class PrincipalInverteVetor {
	public static void main (String [] args) {
		
		ControllerInverteVetor m = new ControllerInverteVetor();
		int [] vet1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int tamanho = vet1.length;
		m.InverteVetor(vet1, tamanho, 0);
		System.out.println (vet1);
		
	}

}
