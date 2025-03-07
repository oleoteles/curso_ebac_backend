package tarefapadraodeprojetos1;

public class CarroEsportivoFactory implements CarFactory {
	
	public Car createCar() {
        return new CarroEsportivo();
    }
}
