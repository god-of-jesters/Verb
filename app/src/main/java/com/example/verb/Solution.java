package com.example.verb;

import java.util.Random;

public class Solution {
    private Random random = new Random();
    public int getTask(String operation, int hard){
        int param1;
        int param2;

        switch (hard){
            case 1:
                switch (operation){
                    case "Сложение":
                        param1 = random.nextInt(10);
                        param2 = random.nextInt(10);
                        return param1 + param2;

                    case "Вычитание":
                        param1 = random.nextInt(10);
                        param2 = random.nextInt(10);
                        if (param1 > param2){
                            return param1 - param2;
                        }else{
                            return param1 - param2;
                        }

                    case "Умножение":
                        param1 = random.nextInt(10);
                        param2 = random.nextInt(10);
                        return param1 * param2;

                    case "Деление":
                        param1 = random.nextInt(10);
                        param2 = random.nextInt(10);
                        while(param1%param2 == 0){
                            param1 = random.nextInt(10);
                            param2 = random.nextInt(10);
                        }
                        return param1 / param2;
                }
            case 2:
                switch (operation){
                    case "Сложение":
                        param1 = random.nextInt(20);
                        param2 = random.nextInt(20);
                        return param1 + param2;

                    case "Вычитание":
                        param1 = random.nextInt(20);
                        param2 = random.nextInt(20);
                        if (param1 > param2){
                            return param1 - param2;
                        }else{
                            return param1 - param2;
                        }

                    case "Умножение":
                        param1 = random.nextInt(20);
                        param2 = random.nextInt(10);
                        return param1 * param2;

                    case "Деление":
                        param1 = random.nextInt(20);
                        param2 = random.nextInt(20);
                        while(param1%param2 == 0){
                            param1 = random.nextInt(20);
                            param2 = random.nextInt(20);
                        }
                        return param1 / param2;
                }
            case 3:
                switch (operation){
                    case "Сложение":
                        param1 = random.nextInt(50);
                        param2 = random.nextInt(50);
                        return param1 + param2;

                    case "Вычитание":
                        param1 = random.nextInt(50);
                        param2 = random.nextInt(50);
                        if (param1 > param2){
                            return param1 - param2;
                        }else{
                            return param1 - param2;
                        }

                    case "Умножение":
                        param1 = random.nextInt(40);
                        param2 = random.nextInt(20);
                        return param1 * param2;

                    case "Деление":
                        param1 = random.nextInt(50);
                        param2 = random.nextInt(50);
                        while(param1%param2 == 0){
                            param1 = random.nextInt(50);
                            param2 = random.nextInt(50);
                        }
                        return param1 / param2;
                }
            case 4:
                switch (operation){
                    case "Сложение":
                        param1 = random.nextInt(150);
                        param2 = random.nextInt(150);
                        return param1 + param2;

                    case "Вычитание":
                        param1 = random.nextInt(150);
                        param2 = random.nextInt(150);
                        if (param1 > param2){
                            return param1 - param2;
                        }else{
                            return param1 - param2;
                        }

                    case "Умножение":
                        param1 = random.nextInt(50);
                        param2 = random.nextInt(30);
                        return param1 * param2;

                    case "Деление":
                        param1 = random.nextInt(70);
                        param2 = random.nextInt(70);
                        while(param1%param2 == 0){
                            param1 = random.nextInt(70);
                            param2 = random.nextInt(70);
                        }
                        return param1 / param2;
                }
            default: return 0;
        }
    }
}
