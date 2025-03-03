//被观察者

import java.util.ArrayList;
import java.util.List;

public class WeatherStationIn implements Subject{

    private float temp;

    //create an arrayList
    private List<Observer> observerList;

    //忽略外部传入的 observerList 并创建一个空的 ArrayList, 所以这里是无参构造函数
    public WeatherStationIn() {
        observerList = new ArrayList<>();
    }

    public void setTemperature(float temp) {
        this.temp = temp; //将传入的参数值赋给当前对象的成员变量temp
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temp); //temp本身就是Subject的成员变量，所以不需要在parameter传入temp参数
        }
    }

}
