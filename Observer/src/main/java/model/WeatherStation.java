package model;

public class WeatherStation extends Observable implements Runnable{


    private double temp;
    public WeatherStation(){
        temp = Math.random()*60-30;
        // Not sure where to start the thread, so starting it here
        new Thread(this).start();
    }
    public void setTemp(double temp){
        this.temp = temp;
        notifyObservers();
    }
    public double checkTemp(){
        return temp;
    }

    public void run(){
        try{
            while(true){
                Thread.sleep(2000);
                temp += (Math.random() * 1 - 0.5);
                temp = Math.max(-30, Math.min(30, temp));
                notifyObservers();
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
