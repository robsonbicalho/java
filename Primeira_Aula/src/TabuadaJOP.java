import javax.swing.JOptionPane;
public class TabuadaJOP {

	public static void main(String[] args) {
		
		
		String numero = JOptionPane.showInputDialog(null, "Informe um número: ");
		
		double Dnumero = Double.parseDouble(numero);
		int x = 0;
		while (x <= 10) {
			double resultado = Dnumero * x;
			JOptionPane.showMessageDialog(null, numero + " X " + x + " = " + resultado);
			x++;
		}
	}
	
}