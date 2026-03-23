import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class PracticeProblemTest {

    // ─────────────────────────────────────────────
    // 1. evenOrOdd Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("evenOrOdd: positive even number returns 'Even'")
    void evenOrOddTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("evenOrOdd", cArg);
            assertEquals("Even", (String) method.invoke(null, 4));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("evenOrOdd: positive odd number returns 'Odd'")
    void evenOrOddTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("evenOrOdd", cArg);
            assertEquals("Odd", (String) method.invoke(null, 7));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("evenOrOdd: zero returns 'Even'")
    void evenOrOddTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("evenOrOdd", cArg);
            assertEquals("Even", (String) method.invoke(null, 0));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("evenOrOdd: negative even number returns 'Even'")
    void evenOrOddTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("evenOrOdd", cArg);
            assertEquals("Even", (String) method.invoke(null, -8));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("evenOrOdd: negative odd number returns 'Odd'")
    void evenOrOddTest5() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("evenOrOdd", cArg);
            assertEquals("Odd", (String) method.invoke(null, -3));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // ─────────────────────────────────────────────
    // 2. teacherOrStudent Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("teacherOrStudent: 'Kalisz' returns 'Teacher'")
    void teacherOrStudentTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("teacherOrStudent", cArg);
            assertEquals("Teacher", (String) method.invoke(null, "Kalisz"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("teacherOrStudent: a random name returns 'Student'")
    void teacherOrStudentTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("teacherOrStudent", cArg);
            assertEquals("Student", (String) method.invoke(null, "Smith"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("teacherOrStudent: empty string returns 'Student'")
    void teacherOrStudentTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("teacherOrStudent", cArg);
            assertEquals("Student", (String) method.invoke(null, ""));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("teacherOrStudent: lowercase 'kalisz' returns 'Student' (case-sensitive)")
    void teacherOrStudentTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("teacherOrStudent", cArg);
            assertEquals("Student", (String) method.invoke(null, "kalisz"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // ─────────────────────────────────────────────
    // 3. fartherFromZero Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("fartherFromZero: positive number increases by 5")
    void fartherFromZeroTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("fartherFromZero", cArg);
            assertEquals(15, (int) method.invoke(null, 10));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("fartherFromZero: negative number decreases by 5")
    void fartherFromZeroTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("fartherFromZero", cArg);
            assertEquals(-15, (int) method.invoke(null, -10));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("fartherFromZero: zero returns 0")
    void fartherFromZeroTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("fartherFromZero", cArg);
            assertEquals(0, (int) method.invoke(null, 0));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("fartherFromZero: small positive number (1) increases by 5 to 6")
    void fartherFromZeroTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("fartherFromZero", cArg);
            assertEquals(6, (int) method.invoke(null, 1));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("fartherFromZero: small negative number (-1) decreases by 5 to -6")
    void fartherFromZeroTest5() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("fartherFromZero", cArg);
            assertEquals(-6, (int) method.invoke(null, -1));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }
}