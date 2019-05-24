package usjt_observer;

public class Teste {
	
	public static void main(String [] args) {
		
				WeatherData estacaoMonitoramento = new WeatherData();
				CurrentConditionsDisplay d1 = new CurrentConditionsDisplay();
				StatsDisplay d2 = new StatsDisplay();
				ForecastDisplay d3 = new ForecastDisplay();
				estacaoMonitoramento.registerObserver(d1);
				estacaoMonitoramento.registerObserver(d2);
				estacaoMonitoramento.registerObserver(d3);
				estacaoMonitoramento.iniciar();

		
	}

}
