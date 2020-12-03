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
        if (tracker.delete(id)) {
                System.out.println("Заявка успешно удалена.");
        } else {
                System.out.println("Заявка не найдена");
        }
        return true;

            }
        }