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
        TextView txtCat = (TextView)findViewById(R.id.txtCat);

        Animal animal = new Animal("Bear", "Black", 200, 300);
        Lion lion = new Lion("myLion", "Yellow", 400, 700, true, 170);


        txtAnimal.setText(animal.toString());
        txtLion.setText(lion.toString());

        Animal myAnimal = lion;
        txtPolymorphism.setText(myAnimal.toString());

        Cat myCat = new Cat("myCat", "White",400, 700);

        Animal myAnimal2 = myCat;
        txtCat.setText(myCat.toString() );

    }
}
