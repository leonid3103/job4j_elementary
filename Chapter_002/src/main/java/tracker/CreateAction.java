package tracker;

public class CreateAction implements UserAction {

    @Override
    public String name() {
        return "Создать новую заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = input.askStr("Введите имя заявки :");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
