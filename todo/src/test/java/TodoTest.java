import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import java.util.ArrayList;
public class TodoTest {

    @Test public void shouldStartWithEmptyList() {
        Todo todo = new Todo();
        assertTrue(todo.tasks.isEmpty());
    }
    @Test public void getsEmptyList() {
        Todo todo = new Todo();
        assertTrue(todo.todoList().isEmpty());
    }

    @Test public void addsOneTaskAndReturnsList() {
        Todo todo = new Todo();
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Walk dog.");

        todo.addTask("Walk dog.");
        assertEquals(expectedList, todo.todoList());
     }

    @Test public void addsTwoTasksAndReturnsList() {
        Todo todo = new Todo();
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Walk dog.");
        expectedList.add("Walk cat.");

        todo.addTask("Walk dog.");
        todo.addTask("Walk cat.");
        assertEquals(expectedList, todo.todoList());
    }
}
