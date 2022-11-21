import org.example.ListNode;
import org.example.Solution;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionTest {

    Solution solution;

    @BeforeAll
    void setup(){
        solution = new Solution();
    }

    @Test
    public void linkedListIsPalindrome(){
        ListNode reverse = new ListNode(4321);
        ListNode listNode = new ListNode(4321,reverse);
        assertTrue(solution.isPalindrome(listNode));
    }

    @Test
    public void linkedListIsNotPalindrome(){
        ListNode reverse = new ListNode(2212);
        ListNode listNode = new ListNode(1234, reverse);
        assertFalse(solution.isPalindrome(listNode));
    }

}
