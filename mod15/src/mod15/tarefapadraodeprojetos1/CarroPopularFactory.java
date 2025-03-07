package tarefapadraodeprojetos1;

public class CarroPopularFactory implements CarFactory {
	
	public Car createCar() {
        return new CarroPopular();
    }
}
