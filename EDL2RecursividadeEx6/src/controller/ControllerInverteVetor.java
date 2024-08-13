package controller;

public class ControllerInverteVetor {
	public ControllerInverteVetor () {
		super ();
	}
	
	public int[] InverteVetor(int []vet1, int tamanho, int i) {
		if (tamanho == 0) {
			return vet1;
		}
		
		else {
			vet1[i] = vet1[tamanho-1];
				
		}
		return InverteVetor(vet1, tamanho-1, i+1);
	}

}
