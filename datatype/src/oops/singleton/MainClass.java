package oops.singleton;

public class MainClass {

	public static void main(String[] args) {
//		AppConfig obj = new AppConfig();
//		AppConfig obj2 = new AppConfig();
		AppConfig obj  = AppConfig.getInstance();
		AppConfig obj2 = AppConfig.getInstance();
	}
}
