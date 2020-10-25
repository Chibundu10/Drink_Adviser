package com.drinkadviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private DrinkExpert expert = new DrinkExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindDrink(View view){
        Toast.makeText(this, "selected", Toast.LENGTH_SHORT).show();
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);

        String beerType = String.valueOf(color.getSelectedItem());
        brands.setText(beerType);

        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();

        for (String details : brandsList){
            brandsFormatted.append(details).append("\n");
        }
        brands.setText(brandsFormatted);
    }
}