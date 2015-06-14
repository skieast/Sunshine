package com.sixlhasa.bsegal.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastArray = {
                "Today - Sunny - 90/80",
                "Tomorrow  - Sunny - 85/63",
                "Weds - Sunny - 85/63",
                "Thurs  - Sunny - 81/63",
                "Fri  - Sunny - 82/63",
                "Sat  - Sunny - 84/63",
                "Sun - Rain - 86/63",
        };
        List<String> weekForecast = new ArrayList<>(Arrays.asList(forecastArray));

        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<>(
                //current context, in this case parent activity
                getActivity(),
                //list item layout
                R.layout.list_item_forecast,
                //textview to populate
                R.id.list_item_forecast_textview,
                //forecast data can be teh String array or list . Adapter calls for each
                forecastArray);


        ListView listview = (ListView)  rootView.findViewById(R.id.listview_forecast);
        listview.setAdapter(mForecastAdapter);

        return rootView;
    }
}
