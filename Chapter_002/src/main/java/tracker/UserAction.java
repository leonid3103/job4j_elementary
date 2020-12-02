package tracker;

    interface UserAction {
        String name();

        boolean execute(Input input, Tracker tracker);
    }
