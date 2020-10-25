package tracker;

public class FindAction implements UserAction  {
    @Override
    public String name() {
        return "Найти все заявки";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(String.format("%s %s", item.getId(), item.getName()));
        }
        return true;
    }
}