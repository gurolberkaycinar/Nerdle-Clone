package test;

import com.util.EquationUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquationUtilTest {

    @Test
    void lengthTest() {
        String equation = new EquationUtil().generateEquation();
        assertTrue(equation.length() >= 7 || equation.length() <= 9);
    }

    @Test
    void hasOneEqualSign() {
        String equation = new EquationUtil().generateEquation();
        int count = 0;
        for(int i = 0; i < equation.length(); i++) {
            if(equation.charAt(i) == '=') {
                count++;
            }
        }
        assertTrue(count == 1);
    }

    @Test
    void returnsString() {
        assertTrue(String.class == new EquationUtil().generateEquation().getClass());
    }

    @Test
    void leadingZero() {
        String equation = new EquationUtil().generateEquation();
        boolean check = true;
        for(int i = 1; i < equation.length() - 1; i++) {
            if(equation.charAt(i) == '0' && (equation.charAt(i - 1) < '0' && equation.charAt(i - 1) > '9') && (equation.charAt(i + 1) >= '0' && equation.charAt(i + 1) <= '9')) {
                check = false;
            }
        }
        assertTrue(check);
    }
}