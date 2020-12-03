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
        List<Item> item = tracker.findById(id);
        if (item.size() > 0) {
                System.out.println("Заявка (Имя: " + item.get(0).getName() + ", id: " + item.get(0).getId() + ") успешно найдена.");
            } else {
                System.out.println("Заявка не найдена");
        }
        return true;
    }
}
