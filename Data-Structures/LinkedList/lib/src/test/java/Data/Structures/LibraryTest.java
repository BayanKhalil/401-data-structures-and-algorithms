/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Data.Structures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    linkedList test = new linkedList();

    @Test
    public void  addNodeToTheEnd(){
        test.insert(55);
        test.append(33);
        String output=test.toString();
        String expected=" { 55 } -->  { 33 } --> NULL";
        assertEquals(expected,output);
    }
    @Test
    public void addMultipleNodeToTheEnd(){
        test.insert(55);
        test.append(33);
        test.append(22);
        String output=test.toString();
        String expected=" { 55 } -->  { 33 } -->  { 22 } --> NULL";
        assertEquals(expected,output);
    }
    @Test
    public void  insertNodeBeforeNodeLocatedInMiddle(){
        test.insert(55);
        test.append(33);
        test.insertBefore(33,22);
        String output = test.toString();
        String expected = " { 55 } -->  { 22 } -->  { 33 } -->  NULL";
        assertEquals(expected,output);
    }
    @Test public void  insertNodeBeforeFirstNode(){
        test.insert(55);
        test.append(33);
        test.insertBefore(55,22);
        String output = test.toString();
        String expected = " { 22 } -->  { 55 } -->  { 33 } -->  NULL";
        assertEquals(expected,output);
    }
    @Test
    public void  insertNodeAfterNodeLocatedInMiddle(){
        test.insert(55);
        test.append(33);
        test.append(66);
        test.insertAfter(33,22);
        String output = test.toString();
        String expected = " { 55 } -->  { 33 } -->  { 22 } -->  { 66 } -->  NULL";
        assertEquals(expected,output);
    }
    @Test
    public void  insertNodeAfterLastNode(){
        test.insert(55);
        test.append(33);
        test.insertAfter(33,22);
        String output = test.toString();
        String expected = " { 55 } -->  { 33 } -->  { 22 } -->  NULL";
        assertEquals(expected,output);
    }

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
