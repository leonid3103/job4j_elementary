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
        String id = input.askStr("Введите Id заявки для поиска: ");
        String idReplace = input.askStr("Введите значение нового Id: ");
        if (tracker.replace(id, idReplace)) {
                System.out.println("Заявка успешно заменена.");
        } else {
                System.out.println("Заявка не найдена");
        }
        return true;
} }
