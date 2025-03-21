package controller;
import java.util.Random;

public class Cavaleiros extends Thread
{
	private final int DistanciaFinal = 500;
	private int DistanciaPercorrida = 0;
	private double VelocidadeMin = 2;
	private double VelocidadeMax = 4;
	private String nome;
	
	public Cavaleiros(String nome)
	{
		this.nome = nome;
	}
	
	@Override
	public void run()
	{
		Random random = new Random();
		while(DistanciaPercorrida < DistanciaFinal)
		{
			DistanciaPercorrida = random.nextInt(4) + 2;
			try
			{
				sleep(50);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(nome + " percorreu " + DistanciaPercorrida);
			
		}
	}
}