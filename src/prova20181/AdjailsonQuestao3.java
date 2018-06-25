package prova20181;

public class AdjailsonQuestao3 {
	
	public int fat (int numero) {
		if (numero == 0) {
			return 1;
		} else {
			return numero *= numero*fat(numero-1);
		}
	}

}
