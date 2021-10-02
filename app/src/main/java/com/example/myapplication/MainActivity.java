package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.myapplication.model.Car;
import com.example.myapplication.model.CarModel;

public class MainActivity extends AppCompatActivity {

    private Button get_car;
    private EditText editText;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        spinner = findViewById(R.id.spinner);

    }

    public void btnShow(View view) {
        String type = spinner.getSelectedItem().toString();
        editText.setText(type);
        CarModel model = new CarModel();
        Car c = model.getCarByType(type);
        if(c!=null){
            editText.setText(c.getMake());
        }

    }

}