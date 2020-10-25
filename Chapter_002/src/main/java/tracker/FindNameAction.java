package tracker;

public class FindNameAction implements UserAction {

    @Override
    public String name() {
        return "Найти заявку по имени";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
            System.out.print("Введите имя заявки: ");
            String name = input.askStr("");
            for (Item item: tracker.findByName(name)) {
                System.out.println("Имя: " + item.getName() + " id: " + item.getId());
            }
            return true;
        }
}
