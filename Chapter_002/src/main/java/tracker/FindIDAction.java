package tracker;

import java.util.List;

public class FindIDAction implements UserAction {
    @Override
    public String name() {
        return "Найти заявку по ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("------------ Поиск заявки по ID--------------");
        String id = input.askStr("Введите Id заявки: ");
        Item item = tracker.findById(id);
        if (item != null) {
                System.out.println("Заявка (Имя: " + item.getName() + ", id: " + item.getId() + ") успешно найдена.");
            } else {
                System.out.println("Заявка не найдена");
        }
        return true;
    }
}
