package com.example.verb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Action1 extends AppCompatActivity {
    int answer;
    int step;
    int arg[] = new int[3];
    int correct = 0;
    int hard;
    String operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action1);
        Bundle args = getIntent().getExtras();

        Solution solution = new Solution();

        String style = args.get("style").toString();
        String operation = args.get("operation").toString();
        String op;
        int hard = Integer.parseInt(args.get("difficulty").toString());

        Button button = findViewById(R.id.button3);
        EditText editText = findViewById(R.id.editTextText4);
        TextView stepView = findViewById(R.id.textView4);
        TextView correctView = findViewById(R.id.textView2);
        TextView example = findViewById(R.id.textView3);

        switch (operation){
            case "Сложение":
                op = "+";
                break;
            case "Вычитание":
                op = "-";
                break;
            case "Умножение":
                op = "*";
                break;
            case "Деление":
                op = "/";
                break;
            default:
                op = " ";
        }

        if (style.equals("Аккуратность")){
            step = 1;
            arg = solution.getTask(operation, hard);
            stepView.setText("Пример: " + step + "/10");
            correctView.setText("Правильно: " + correct + "/" + step);
            example.setText(arg[0] + " " + op + arg[1]);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    answer = Integer.parseInt(editText.getText().toString().trim());
                    step ++;
                    if(step == 10){
                        Intent intent = new Intent(Action1.this, MainActivity.class);
                        startActivity(intent);
                    }else {
                        if(answer == arg[2]){
                            correct ++;
                        }
                        arg = solution.getTask(operation, hard);
                        stepView.setText("Пример: " + step + "/10");
                        correctView.setText("Правильно: " + correct + "/" + step);
                        example.setText(arg[0] + " " + op + arg[1]);
                        editText.setText("0");
                    }
                }
            });

        }


    }
}