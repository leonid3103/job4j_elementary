package tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Редактировать заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("------------ Редактирование заявки--------------");
        String id = input.askStr("Ввести id:");
        String name = input.askStr(" Ввести имя:");
        Item item = new Item(id);
        tracker.replace(id, item);
        return true;
    }
}
