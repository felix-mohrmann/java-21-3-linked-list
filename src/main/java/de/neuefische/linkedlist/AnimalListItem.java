package de.neuefische.linkedlist;

public class AnimalListItem<T> {

    private T value;
    private AnimalListItem<T> next;

    public AnimalListItem(T animal) {
        this.value = animal;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }
}
