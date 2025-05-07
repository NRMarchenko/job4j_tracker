package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

/*    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;

    }   */

    private int indexOf(int id) {
        int result = -1;
        for (Item item : items) {
            if (item.getId() == id) {
                result = item.getId();
                break;
            }
        }
        return result;
    }

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }

    public List<Item> findAll() {
        return List.copyOf(items);
    }

    public boolean replace(int id, Item updateItem) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            updateItem.setId(id);
            items.set(index, updateItem);
        }
        return result;
    }

    public void delete(int id) {
        int delPos = indexOf(id);
        boolean result = delPos != -1;
        if (result) {
            items.remove(delPos);
        }
    }
}