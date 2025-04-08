import java.util.Scanner;

public class FraseNewMin
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
        // Leggi la frase da tastiera
        System.out.println("Inserisci una frase (max 100 caratteri):");
        String frase = scanner.nextLine();
       // frase = frase.toLowerCase();
        // Controlla che la frase non superi i 100 caratteri
        if (frase.length() > 100) 
		{
            System.out.println("La frase supera i 100 caratteri.");
            return;
        }
        
        // Costruisci la nuova frase
        String nuovaFrase = "";
        
        String[] parole = frase.split(" ");// dividere una stringa in sottostringhe in base a un delimitatore (" ")
		for(String parola : parole)
		{
			if(!parola.isEmpty())
			{
				
				nuovaFrase += Character.toUpperCase(parola.charAt(0)); //parola.charAt(0) Questa parte estrae il Primo carattere della parola corrente
				// Questo prende il primo carattere estratto "parola.charAt(0)" e lo converte in MINUSCOLO.
				//
				nuovaFrase += parola.substring(1).toLowerCase() + " ";
			}
		}
	
		
        
        // Stampa la nuova frase
        System.out.println("La nuova frase è: " + nuovaFrase.trim());//serve per gestire l'eccezione per eliminare gli spazi in eccesso 
        
    }
    
   
}

