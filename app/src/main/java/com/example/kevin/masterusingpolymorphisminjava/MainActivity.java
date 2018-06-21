package com.example.kevin.masterusingpolymorphisminjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtAnimal = (TextView) findViewById(R.id.txtAnimal);
        TextView txtLion = (TextView) findViewById(R.id.txtLion);
        TextView txtPolymorphism = (TextView) findViewById(R.id.txtPolymorphism);

        Animal animal = new Animal("Bear", "Black", -1, -1);
        Lion lion = new Lion("myLion", "Yellow", -1, -1, true, 170);


    }
}
