package tracker;

import java.util.List;

public class DeleteAction implements UserAction {

    @Override
    public String name() {
        return "Удалить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("------------ Удаление заявки --------------");
        String id = input.askStr("Введите Id заявки для поиска: ");
        List<Item> items = tracker.findById(id);
        if (items.size() > 0) {
            for (Item item : items) {
                tracker.delete(item.getId());
                System.out.println("Заявка (Имя: " + item.getName() + ", id: " + item.getId() + ") успешно удалена.");
            }
        } else {
            System.out.println("Заявка не найдена");
        }
        return true;

            }
        }