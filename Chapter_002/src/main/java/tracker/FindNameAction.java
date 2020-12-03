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
        List<Item> item = tracker.findByName(name);
        if (item.size() > 0) {
                System.out.println("Заявка (Имя: " + item.get(0).getName()  + ", id: " + item.get(0).getId() + ") успешно найдена");
        } else {
                System.out.println("Заявка не найдена");
    }
        return true;
    }
}




