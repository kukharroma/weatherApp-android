package com.mlsdev.weather.model;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by romakukhar on 30.01.15.
 */
@DatabaseTable(tableName = "temperature")
public class Temperature {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = "temp")
    @SerializedName("temp")
    private double temp;

    @DatabaseField(columnName = "humidity")
    @SerializedName("humidity")
    private String humidity;

    @DatabaseField(columnName = "minTemp")
    @SerializedName("temp_min")
    private double minTemp;

    @DatabaseField(columnName = "maxTemp")
    @SerializedName("temp_max")
    private double maxTemp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void formattTemperature() {
        this.temp = (this.temp * 1e1) / 1e1;
        this.minTemp = (this.minTemp * 1e1) / 1e1;
        this.maxTemp = (this.maxTemp * 1e1) / 1e1;
    }
}
