package com.biubiu.Interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:57
 */
public class Main {
    public static void main(String[] args) {
        String expression = "w x z - +";
        Evaluator sentence = new Evaluator(expression);
        Map<String, Expression> variables = new HashMap<>();
        variables.put("w", new Num(5));
        variables.put("x", new Num(10));
        variables.put("z", new Num(42));
        int result = sentence.interpret(variables);
        System.out.println(result);
    }
}
