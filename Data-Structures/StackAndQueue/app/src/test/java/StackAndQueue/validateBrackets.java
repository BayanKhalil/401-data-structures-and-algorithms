package StackAndQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class validateBrackets {
    private validateBrackets balancedBracketsUsingString;

    @BeforeEach
    public void setup() {
        balancedBracketsUsingString = new validateBrackets();
    }

    @Test
    public void givenNullInput_whenCheckingForBalance_shouldReturnFalse() {
        boolean result = balancedBracketsUsingString.isBalanced("[{}]");
        assertTrue (result);
    }

    private boolean isBalanced(String s) {
        return true;
    }
    @Test
    public void givenInvalidCharacterString_whenCheckingForBalance_shouldReturnFalse() {
        boolean result = balancedBracketsUsingString.isBalanced("abc[](){}");
        assertFalse(result);
    }

}
