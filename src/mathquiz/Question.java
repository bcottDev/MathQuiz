/*
    ICTPRG532 AT2 - Math Quiz Application
    File name:  Question.java
    Author:     Benjamin Cotterill
    Version:    1.0
    Notes:      Used to create Question Comparable for Server and Client functionality.
 */

package mathquiz;

public class Question implements Comparable<Question> {
    private final int leftOperand, rightOperand, answer;
    private final String operator;
    
    public Question(int lOp, String op, int rOp, int ans) {
        leftOperand = lOp;
        operator = op;
        rightOperand = rOp;
        answer = ans;
    }
    
    public int getLOp() {
        return leftOperand;
    }
    
    public int getROp() {
        return rightOperand;
    }
    
    public int getAnswer() {
        return answer;
    }
    
    public String getOperator() {
        return operator;
    }
    
    @Override
    public String toString() {
        return answer + "(" + leftOperand + " " + operator + " " + rightOperand + ")";
    }
    
    @Override
    public int compareTo(Question anotherQuiz) {
        int comparison = 0;
        if(this.answer < anotherQuiz.answer)
        {
            comparison = -1;
        } else if(this.answer > anotherQuiz.answer) {
            comparison = 1;
        }
        return comparison;
    }
}
