package tracker;

import java.util.List;

public class FindAction implements UserAction  {

    @Override
    public String name() {
        return "Найти все заявки";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        if (items.size() > 0) {
             for (Item item : items) {
                System.out.println(String.format("%s %s", "Имя: " + item.getName(), ", Id: " + item.getId()));
            } } else {
                System.out.println("Заявки не найдены");
        }
           return true;

}
}

