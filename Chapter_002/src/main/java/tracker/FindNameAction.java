package tracker;

import java.util.List;

public class FindNameAction implements UserAction {

    @Override
    public String name() {
        return "Найти заявку по имени";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Введите имя заявки: ");
        String name = input.askStr("");
        List<Item> items = tracker.findByName(name);
        if (items.size() > 0) {
            for (Item item : items) {
                System.out.println("Заявка (Имя: " + item.getName() + ", id: " + item.getId() + ") успешно найдена");
            }
        } else {
            System.out.println("Заявка не найдена");
    }
        return true;
    }
}




