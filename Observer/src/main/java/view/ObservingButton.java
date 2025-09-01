package view;

import javafx.application.Platform;
import javafx.scene.control.Button;
import model.WeatherStation;

public class ObservingButton extends Button implements Observer{

    private WeatherStation weatherStation;
    public ObservingButton(WeatherStation station){
        this.weatherStation=station;
        weatherStation.addObserver(this);
        this.setText("Weather update soon!");
    }
    @Override
    public void update() {
        System.out.println("Observing button got update");
        Platform.runLater(() -> {
            this.setText("Temp: " + String.format("%.2f", weatherStation.checkTemp()) + "°C");
        });
    }

}
