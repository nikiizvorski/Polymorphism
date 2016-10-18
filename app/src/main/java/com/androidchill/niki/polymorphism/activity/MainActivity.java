package com.androidchill.niki.polymorphism.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.androidchill.niki.polymorphism.R;
import com.androidchill.niki.polymorphism.model.Employee;
import com.androidchill.niki.polymorphism.model.Overload;
import com.androidchill.niki.polymorphism.model.Salary;

public class MainActivity extends AppCompatActivity {

    TextView tx;
    TextView tx1;
    TextView tx2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //You can see Polymorphism here calling the superclass method onCreate()
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set Up Views
        tx = (TextView) findViewById(R.id.textView);
        tx1 = (TextView) findViewById(R.id.textView2);
        tx2 = (TextView) findViewById(R.id.textView3);

        //Create Objects as you can see polymorphism
        Salary s = new Salary("Niki Izvorski", "Ambehta, UP", 3, 3600.00);

        //Base Object with References from the Second
        Employee e = new Salary("Mihail Petrov", "Boston, MA", 2, 2400.00);

        //Create Object for Method Overloading
        Overload overload = new Overload();

        //First method
        overload.demo(5);

        //Second method
        overload.demo(5,5);

        //Third method
        overload.demo(3,4,5);

        //Fourth method
        double result = overload.demo(5.5);

        //Using Method override from the super class
        tx.setText(s.mailCheck());

        //Using Base Method
        tx1.setText(e.mailCheck());

        //Set Text from result
        tx2.setText("O/P : " + result);
    }
}
