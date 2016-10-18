package com.androidchill.niki.polymorphism.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.androidchill.niki.polymorphism.R;
import com.androidchill.niki.polymorphism.models.Employee;
import com.androidchill.niki.polymorphism.models.Overload;
import com.androidchill.niki.polymorphism.models.Salary;

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

        //Create Objects
        Salary s = new Salary("Niki Izvorski", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        //Create Object
        Overload overload = new Overload();

        //First
        overload.demo(5);

        //Second
        overload.demo(5,5);

        //Third
        double result = overload.demo(5.5);

        //setText to TextViews
        tx.setText(s.mailCheck());
        tx1.setText(e.mailCheck());
        tx2.setText("O/P : " + result);
    }
}
