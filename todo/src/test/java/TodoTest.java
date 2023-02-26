import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
public class TodoTest {
    @Test public void testReturnsEmptyListFromVariable() {
        Todo todo = new Todo();
        assertTrue(todo.tasks.isEmpty());
    }
    @Test public void testReturnsEmptyListFromMethod() {
        Todo todo = new Todo();
        assertTrue(todo.todoList().isEmpty());
    }
}
