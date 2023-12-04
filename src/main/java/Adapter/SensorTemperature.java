package Adapter;

public interface SensorTemperature {

    int getIdentifier(); // Уникальный идентификатор датчика

    double temperature(); // Средняя температура
}
