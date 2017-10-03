package com.biubiu.Interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * @author 张海彪
 * @create 2017-10-03 下午4:52
 */
public class Evaluator implements Expression {
    private Expression syntaxTree;

    public Evaluator(String expression) {
        Stack<Expression> expressionStack = new Stack<>();
        for (String token : expression.split(" ")) {
            if (token.equals("+")) {
                Expression subExpression = new Plus(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            } else if (token.equals("-")) {
                Expression right = expressionStack.pop();
                Expression left = expressionStack.pop();
                Expression subExpression = new Minus(left, right);
                expressionStack.push(subExpression);
            } else {
                expressionStack.push(new Variable(token));
            }
        }
        syntaxTree = expressionStack.pop();
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return syntaxTree.interpret(variables);
    }
}
