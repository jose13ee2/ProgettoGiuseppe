import java.util.Scanner;


public class ArrayChar2
{
	
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci il numero di stringhe che vuoi inserire(MAX 7 stringhe): ");
		int cicli = in.nextInt();
		in.nextLine(); // Passo ad un altra riga per l'input successivo
		if(cicli > 7)
		{
			System.out.print("Hai messo un numero superiore a 7! ");
			return;
		}
		
		
		String[] array = new String[cicli];
		String[] scala = {"Prima", "Seconda", "Terza", "Quarta", "Quinta", "Sesta", "Settima"};
		
		for(int i = 0; i <cicli; i++)
		{
			System.out.print("Inserisci una stringa: ");
			String word = "";
			word = in.nextLine();
			array[i] = word + ": " + scala[i];
			
		}
		
		for(String i : array)
		{
			System.out.println(i);
		}
		
		
		in.close();
		
	}
}