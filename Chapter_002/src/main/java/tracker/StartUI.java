package tracker;
import java.util.*;

public class StartUI {

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select > actions.size() - 1) {
                System.out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    public void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
                System.out.println(index + ". " + actions.get(index).name());
            }
        }

        public static void main(String[] args) {
            Input validate = new ValidateInput();
            Input input = new ConsoleInput();
            Tracker tracker = new Tracker();
            List<UserAction> actions = new ArrayList<>();
            actions.add(0, new CreateAction());
            actions.add(1, new FindIDAction());
            actions.add(2, new DeleteAction());
            actions.add(3, new FindNameAction());
            actions.add(4, new FindAction());
            actions.add(5, new ReplaceAction());
            actions.add(6, new ExitAction());
            new StartUI().init(validate, tracker, actions);
        }
}