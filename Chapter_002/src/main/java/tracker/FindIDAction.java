package tracker;

public class FindIDAction implements UserAction {
    @Override
    public String name() {
        return "Найти заявку по ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("------------ Поиск заявки по ID--------------");
        String id = input.askStr("Введите Id заявки :");
        if (tracker.findById(id).equals(id)) {
            System.out.println("------------ Искомая зявка : " + tracker.findById(id) + "-----------");
        }
        System.out.println("------------ Не удалось найти заявку -----------");
        return true;
    }
}
