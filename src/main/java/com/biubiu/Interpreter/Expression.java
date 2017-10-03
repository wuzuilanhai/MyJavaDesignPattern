package com.biubiu.Interpreter;

import java.util.Map;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:46
 */
public interface Expression {
    int interpret(Map<String, Expression> variables);
}

class Num implements Expression {
    private int number;

    public Num(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return number;
    }
}

class Plus implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public Plus(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}

class Minus implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public Minus(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) - rightOperand.interpret(variables);
    }
}

class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public int interpret(Map<String, Expression> variables) {
        if (null == variables.get(name))
            return 0;
        return variables.get(name).interpret(variables);
    }
}