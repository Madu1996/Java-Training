public final class ConfigManager {
    private static volatile ConfigManager instance = null;

    private ConfigManager(){

    }
    public static ConfigManager getInstance(){
        if(instance == null){
          synchronized(ConfigManager.class){
              if(instance == null){
                  instance = new ConfigManager();
              }
          }
        }
        return instance;
    }
	
	public static void main(String [] args){
		ConfigManager instance = ConfigManager.getInstance();
		System.out.println(instance);
		
		ConfigManager instance1 = ConfigManager.getInstance();
		System.out.println(instance1);
	}
}