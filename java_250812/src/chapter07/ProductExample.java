package chapter07;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
	
		Tv tv = product1.getKind();	//new Tv()
		//chapter07.Tv@71e7a66b(패키지.클래스@해시코드)
		System.out.println(tv);
		
		String tvModel = product1.getModel();	//스마트TV
		System.out.println(tvModel);
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		Car car = product2.getKind();	//new Car
		//chapter07.Car@4517d9a3(패키지.클래스@해시코드)
		System.out.println(car);

		product2.setModel("디젤");
		String carModel = product2.getModel(); 	//디젤	
		System.out.println(carModel);
	}
}
