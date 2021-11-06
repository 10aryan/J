package oops.singleton;

public class AppConfig {
private  AppConfig() {
	
}
	 private static AppConfig obj = null; // If we do not want to use it the then give the value = null
	public static AppConfig getInstance(){
		if(obj == null) {
			obj = new AppConfig();
		}
		return obj;
		
	}
	
}
