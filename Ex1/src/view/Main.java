package view;
import controller.Cavaleiros;

public class Main
{
	public static void main (String [] args)
	{
		Cavaleiros[] cavaleiros = {
			new Cavaleiros("1º Cavaleiro"),
			new Cavaleiros("2º Cavaleiro"),
			new Cavaleiros("3º Cavaleiro"),
			new Cavaleiros("4º Cavaleiro")
		};
		
		for(Cavaleiros cavaleiro : cavaleiros)
		{
			cavaleiros.start();
		}
		
	}
}