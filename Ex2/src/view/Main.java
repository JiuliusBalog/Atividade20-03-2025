package view;
import controller.Aeroporto;
import java.util.concurrent.Semaphore;

public class Main 
{
	public static void main (String [] args)
	{
		int circular = 2; // circulação de 2 aviões por pista
		Semaphore semaforo = new Semaphore(circular);
		
		for(int idAviao = 0; idAviao < 12; idAviao++)
		{
			Thread aviao = new Aeroporto(idAviao, semaforo);
			aviao.start();
		}
	}
}
