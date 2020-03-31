package ru.job4j.lambda;

import java.util.*;
import java.util.function.Function;


public class FunctionDiapason {
    public List<Double> diapason(int start, int end, Function<Double, Double> func){
        List<Double> result = new ArrayList<>();
        for(double i = start; i < end; i++){
            System.out.println(result.add(func.apply(i)));
        }
        return result;
    }
}
