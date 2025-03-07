package tarefapadraodeprojetos1;

public class CarroLuxoFactory implements CarFactory {
	
	public Car createCar() {
        return new CarroLuxo();
    }
}
