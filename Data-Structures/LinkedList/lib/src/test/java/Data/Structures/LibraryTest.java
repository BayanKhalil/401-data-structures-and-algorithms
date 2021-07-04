/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Data.Structures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    linkedList test = new linkedList();

    @Test

    public void append() {
        test.append(11);
        String output = test.toString();
        String expected=" { 11 } --> NULL";
        assertEquals(expected, output) ;

    }


    @Test
    public void InsertBefore() {

        test.insertBefore(11, 2);
        String output = test.toString();
        String expected=" { 2 } -->  { 11 } --> NULL";
        assertEquals(expected, output) ;


    }

    @Test
    public void insertAfter() {

        test.insertAfter(11, 5);
        String output = test.toString();
        String expected="{ 2 } -->  { 11 } -->  { 5 } --> NULL";
        assertEquals(expected, output) ;


    }

}