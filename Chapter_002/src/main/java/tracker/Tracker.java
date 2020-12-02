package tracker;
import java.util.*;

class Tracker {
    private final List<Item> items = new ArrayList<>(100);

    public String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item createItem(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    public List<Item> findById(String id) {
        List<Item> results = new ArrayList<Item>();
        for (Item item:items) {
            if (item.getId().equals(id)) {
                results.add(item);
            }
    } return results;
    }

    public List<Item> findByName(String key) {
        List<Item> results = new ArrayList<Item>();
        for (Item item: items) {
            if (item.getName().equals(key)) {
                results.add(item);
            }
    }    return results;
    }

    public boolean delete(String id) {
        boolean result = false;
        Iterator<Item> itemIterator = items.iterator();
        while (itemIterator.hasNext()) {
            Item nextItem = itemIterator.next();
            if (nextItem.getId().equals(id) && items.size() > 0) {
                itemIterator.remove();
                result = true;
            }
        } return result;
}

    public boolean replace(String name, String id2, String name2) {
        boolean result = false;
        Iterator<Item> itemIterator = items.iterator();
        while (itemIterator.hasNext()) {
            Item nextItem = itemIterator.next();
            if (nextItem.getName().equals(name) && items.size() > 0) {
                nextItem.setId(id2);
                nextItem.setName(name2);
                result = true;
            }
        }
        return result;
    }

    public List<Item> findAll() {
       List<Item> result = new ArrayList<>();
        for (Item item:items) {
            if (item != null) {
                result.add(item);
            }
        }
        return result;
    }
}
