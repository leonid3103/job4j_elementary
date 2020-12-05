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

    public Item findById(String id) {
        for (Item item:items) {
            if (item.getId().equals(id)) {
                return item;
            }
    } return null;
    }

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item item: items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
    } return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        Iterator<Item> itemIterator = items.iterator();
        while (itemIterator.hasNext()) {
            Item nextItem = itemIterator.next();
            if (nextItem.getId().equals(id) && items.size() > 0) {
                itemIterator.remove();
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean replace(String id, String idReplace) {
        boolean result = false;
        Iterator<Item> itemIterator = items.iterator();
        while (itemIterator.hasNext()) {
            Item nextItem = itemIterator.next();
            if (nextItem.getId().equals(id) && items.size() > 0) {
                nextItem.setId(idReplace);
                result = true;
                break;
            }
        }
        return result;
    }

    public List<Item> findAll() {
       List<Item> result = new ArrayList<>();
        for (Item item:items) {
                result.add(item);
            } return result;
        }
}

