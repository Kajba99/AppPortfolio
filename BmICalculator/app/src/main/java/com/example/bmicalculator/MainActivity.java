package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView resultText;
    private Button calculation;
    private RadioButton male;
    private RadioButton female;
    private EditText year;
    private EditText feet;
    private EditText inch;
    private EditText weight;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setupButtonClickListener();
        displayResult();
        displayGuidance();

    }

    private void displayGuidance() {
    }

    private void displayResult() {
    }

    public double displayResult(double bmi)  {

        DecimalFormat myDecimalFormatter = new DecimalFormat("0.00");
        String bmiTextResult = myDecimalFormatter.format(bmi);

        resultText.setText(bmiTextResult);



        String fullResultString;
        if (bmi < 18.5) {
            //Display underweight
            fullResultString = bmiTextResult + " - You are underweight";
        } else if (bmi > 25) {
            //Display underweight
            fullResultString = bmiTextResult + " - You are overweight";
        } else {
            //Display underweight
            fullResultString = bmiTextResult + " - You are healthy";
        }
        resultText.setText(fullResultString);
        return bmi;

    }


    private void findViews()  {
        resultText = findViewById(R.id.text_view_result);
        calculation = findViewById(R.id.button_calculate);
        male = findViewById(R.id.radio_button_male);
        female = findViewById(R.id.radio_button_female);
        year = findViewById(R.id.edit_text_age);
        feet = findViewById(R.id.edit_text_feet);
        inch = findViewById(R.id.edit_text_inches);
        weight = findViewById(R.id.edit_text_weight);
    }



    private void setupButtonClickListener()  {
        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bmiRez = calculateBmi();

                String ageText = year.getText().toString();
                int age = Integer.parseInt(ageText);

                if (age >= 18)  {
                    displayResult(bmiRez);
                }

                else  {
                    displayGuidance(bmiRez);
                }


            }
        });



    }


    private double calculateBmi()  {
        String feetText = feet.getText().toString();
        String inchesText = inch.getText().toString();
        String weightText = weight.getText().toString();

        int feet = Integer.parseInt(feetText);
        int inches = Integer.parseInt(inchesText);
        int weight = Integer.parseInt(weightText);

        int totalInches = (feet * 12) + inches;

        //Height in meters is the inches multiplied by 0.0254
        double heightInMeters = totalInches * 0.0254;

        //BMI formula = weight in kg divided by height in meters squared
        return weight / (heightInMeters * heightInMeters);

    }


    private void displayGuidance(double bmi)  {

        DecimalFormat myDecimalFormatter = new DecimalFormat("0.00");
        String bmiTextResult = myDecimalFormatter.format(bmi);

        String fullResultString;
        if (male.isChecked())  {
            fullResultString = bmiTextResult + " - As you are under 18, please contact with your doctor for the healthy range for boys";
        } else if (female.isChecked()) {
            fullResultString = bmiTextResult + " - As you are under 18, please contact with your doctor for the healthy range for girls";
        } else {
            fullResultString = bmiTextResult + " - As you are under 18, please contact with your doctor for the healthy range";
        }

        resultText.setText(fullResultString);



    }


}