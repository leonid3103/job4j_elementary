package tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Удалить заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("------------ Удаление заявки --------------");
        String id = input.askStr("Введите Id заявки :");
        if (tracker.findById(id).getId().equals(id)) {
            System.out.println("------------ Удаление зявок : " + tracker.delete(id) + "-----------");
        } else {
            System.out.println("------------ Не удалось найти заявку -----------");
        }
        return true;
    }
}
