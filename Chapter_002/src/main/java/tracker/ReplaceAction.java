package tracker;

import java.util.List;

public class ReplaceAction implements UserAction {

    @Override
    public String name() {
        return "Заменить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("------------ Замена заявки --------------");
        String name = input.askStr("Введите Имя заявки для поиска: ");
        Item item = tracker.findByName(name);
        if (item != null) {
                System.out.println("Заявка (Имя: " + item.getName() + ", id: " + item.getId() + ") успешно найдена.");
                String name2 = input.askStr("Введите значение нового поля Имя: ");
                String id2 = input.askStr("Введите значение нового поля id: ");
                tracker.replace(item.getName(), id2, name2);
                System.out.println("Заявка успешно заменена.");
        } else {
            System.out.println("Заявка не найдена");
        }
        return true;
} }
