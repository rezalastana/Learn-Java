import repository.TodoListRepositoryImpl;
import repository.TodolistRepository;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class AppTodoList {
    public static void main(String[] args) throws Exception {
        //Logic untuk data di repository
        TodolistRepository todolistRepository = new TodoListRepositoryImpl();
        //Logic untuk business ada di service
        TodoListService todoListService = new TodoListServiceImpl(todolistRepository);
        //Logic untuk view ada di view
        TodoListView todoListView = new TodoListView(todoListService);
        
        todoListView.showTodolist();
    }
}
