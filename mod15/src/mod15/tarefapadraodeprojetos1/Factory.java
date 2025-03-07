package tarefapadraodeprojetos1;

public class Factory {
	
	public static void main(String[] args) {
        CarFactory fabricaPopular = new CarroPopularFactory();
        CarFactory fabricaEsportivo = new CarroEsportivoFactory();
        CarFactory fabricaLuxo = new CarroLuxoFactory();

        Car car1 = fabricaPopular.createCar();
        Car car2 = fabricaEsportivo.createCar();
        Car car3 = fabricaLuxo.createCar();

        car1.montar();
        car2.montar();
        car3.montar();
    }
}
