package usjt_observer;

public class StatsDisplay extends Display{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	private int qtde = 0;
	private double totalHistorico = 0;
	
	@Override
	public void update(double temperature, double humidity, double pressure) {
		qtde++;
		totalHistorico += temperature;
		System.out.println("----------Dados Estat�sticos--------------");
		System.out.printf("M�dia: %.2f\n",totalHistorico/qtde);
		
	}

}
