package ru.job4j.tracker;

public class Item {
    private String id;
    private String name;
    private String description;
    private long create;

    @Override
    public String toString() {
        return "Item{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", description='" + description + '\'' + ", create=" + create + '}';
    }

    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public long getCreate() {
        return this.create;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
