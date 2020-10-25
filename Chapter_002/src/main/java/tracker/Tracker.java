package tracker;

import java.util.Arrays;
import java.util.Random;

class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
   public void add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
   }
    public Item findById(String id) {
        Item result = null;
        for (Item item:items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
            }

}         return result;
}
    public void replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i != this.position; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                this.items[i] = item;
                this.items[i].setId(id);
                break;
            }
        }
    }
    public Item[] findByName(String key) {
        int count = 0;
        int index = 0;
        Item[] result = new Item[this.position];
        for (int i = 0; i < result.length; i++) {
            if (this.items[i].getName().equals(key)) {
                result[index++] = this.items[i];
                count++;
            }
        }
        return Arrays.copyOf(result, index);
    }
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (id.equals(items[i].getId())) {
                items[i] = null;
                System.arraycopy(items, i + 1, items, i, position - i);
                position--;
                result = true;
                break;
            }
        }
        return result;
    }
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }
}
