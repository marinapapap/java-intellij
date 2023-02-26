import java.util.ArrayList;
public class Todo {
    public ArrayList<String> tasks = new ArrayList<>();
    public static void main(String[] args) {

    }
    public ArrayList<String> todoList() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
    }
}
