package com.mlsdev.weather.ui.fragment.impl;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mlsdev.weather.model.Weather;
import com.mlsdev.weather.ui.fragment.BaseFragment;
import com.mlsdev.weather.ui.fragment.IWeatherDetailFr;

import mlsdev.com.weather.R;

/**
 * Created by romakukhar on 04.02.15.
 */
public class WeatherDetailFr extends Fragment implements IWeatherDetailFr {

    private Weather weather;

    private TextView tvLocation, tvMainTemp, tvMainWeather, tvMainWeatherDescription, tvMinMaxTemp;

    public WeatherDetailFr(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_weather_layout, container, false);
        initComponents(view);
        fillComponents();
        return view;
    }

    @Override
    public void initComponents(View view) {
        tvLocation = (TextView) view.findViewById(R.id.tv_detail_location);
        tvMainTemp = (TextView) view.findViewById(R.id.tv_detail_main_temp);
        tvMainWeather = (TextView) view.findViewById(R.id.tv_detail_main_weather);
        tvMainWeatherDescription = (TextView) view.findViewById(R.id.tv_detail_weather_description);
        tvMinMaxTemp = (TextView) view.findViewById(R.id.tv_detail_min_max_temp);
    }

    @Override
    public void fillComponents() {
        tvLocation.setText(weather.getCity() + " ," + weather.getSys().getCountry());
        tvMainTemp.setText(String.valueOf(weather.getTemperature().getTemp()) + getString(R.string.degree));
        tvMainWeather.setText(weather.getFirstWeater().getMain());
        tvMainWeatherDescription.setText(weather.getFirstWeater().getDescription());
        tvMinMaxTemp.setText(weather.getTemperature().getMinTemp() + getString(R.string.degree) + " / " + weather.getTemperature().getMaxTemp() + getString(R.string.degree));
    }


    @Override
    public void updateDetailWeather() {

    }

    @Override
    public void showProgressDialog(String tittle, String message) {

    }

    @Override
    public void dismissProgressDialog() {

    }
}