import java.util.Scanner;


public class ArrayChar1
{
	
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci il numero di stringhe che vuoi inserire: ");
		int cicli = in.nextInt();
		in.nextLine(); // Passo ad un altra riga per l'input succesivo
		String[] array = new String[cicli];
		
		for(int i = 0; i <cicli; i++)
		{
			System.out.print("Inserisci una stringa: ");
			String word = "";
			word = in.nextLine();
			array[i] = word;
			
		}
		
		for(String i : array)
		{
			System.out.println(i);
		}
		in.close();
		
	}
}