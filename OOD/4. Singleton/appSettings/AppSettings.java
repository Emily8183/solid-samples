public class AppSettings {
    //Step1: private static
    private static AppSettings instance;

    private String dataUrl;

    // Step2: private constructor to prevent direct object creation
    //constructor为无参数的构造函数,执行固定的初始化逻辑，比如读取配置文件、初始化默认属性等
    private AppSettings() {
        dataUrl = "jdbc:mysql://localhost:3306/mydatabase";
    }

    //Step 3: public the getter
    public static AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }

        return instance;
    }

    public String getDataUrl(){
        return dataUrl;
    }

}
