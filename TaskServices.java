import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskServices {
        List<Task> tasks = new ArrayList<>();
        int nowId = 1;

        public int addTask(String description){
                tasks.add(new Task(nowId, description));
                return nowId ++;
        }

        public Task getTaskById(int id){
                for(Task tempTask : tasks){
                        if(tempTask.getId() == id){
                                return tempTask;
                        }
                }
                return null;
        }

        public boolean deleteTask(int id) {
                Iterator<Task> iter = tasks.iterator();
                while(iter.hasNext()){
                        Task current = iter.next();
                        if(current.getId() == id){
                                iter.remove();
                                return true;
                        }
                }
                return false;
        }

        public boolean updateTask(int id, String description){
                Task tempTask = getTaskById(id);
                if(tempTask == null) return false;
                tempTask.setDescription(description);
                return true;
        }

        public boolean updateTask(int id, String description, TaskStatus status){
                Task tempTask = getTaskById(id);
                if(tempTask == null) return false;
                tempTask.setStatus(status);
                tempTask.setDescription(description);
                return true;
        }

        public boolean updateTask(int id, TaskStatus status){
                Task tempTask = getTaskById(id);
                if(tempTask == null) return false;
                tempTask.setStatus(status);
                return true;
        }

        public List<Task> getTasksByStatus(TaskStatus status){
                List<Task> tempTaskList = new ArrayList<>();
                for(Task i : tasks){
                        if(i.getStatus() == status) tempTaskList.add(i);
                }
                return tempTaskList;
        }

        public List<Task> getAllTask(){
                return new ArrayList<>(tasks);
        }
}
