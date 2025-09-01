package view;

import javafx.application.Platform;
import javafx.scene.text.Text;
import model.WeatherStation;

public class ObservingText extends Text implements Observer {

    private WeatherStation weatherStation;
    public ObservingText(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
        this.setText("Weather update soon!");
    }
    @Override
    public void update(){
        System.out.println("ObservingText received update");
        Platform.runLater(() -> {
            this.setText(String.format("%.2f", weatherStation.checkTemp()));
        });
    }
}
