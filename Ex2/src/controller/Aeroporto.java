package controller;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Aeroporto extends Thread
{
	Random random = new Random();
	private int idAviao;
	private Semaphore semaforo;
	private int numPista = random.nextInt(100);
	
	
	public Aeroporto(int idAviao, semaforo)
	{
		this.semaforo = semaforo;
		this.idAviao = idAviao;
	}
	public void run()
	{
		aviaoManobrando();
		aviaoTaxiando();
		aviaoDecolando();
		aviaoAfastando();
	}
	private void aviaoManobrando()
	{
		System.out.println("o Avião Nº" + idAviao + " iniciou a manobra");
		try
		{
			sleep(random.nextInt(700)+300);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	private void aviaoTaxiando()
	{
		System.out.println("o Avião Nº" + idAviao + " começou a taxiar");
		try
		{
			sleep(random.nextInt(1000) + 500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	private void aviaoDecolando()
	{
		System.out.println("o Avião Nº" + idAviao + " iniciou a decolagem");
		try
		{
			sleep(random.nextInt(800) + 600);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	private void aviaoAfastando()
	{
		System.out.println("o Avião Nº" + idAviao + " iniciou o afastamento de área");
		try
		{
			sleep(random.nextInt(800) + 300);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}