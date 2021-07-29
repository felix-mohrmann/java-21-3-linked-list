package de.neuefische.linkedlist;

public class AnimalList <T extends Animal>{

    private AnimalListItem<T> head;

    public void add(T animal) {
        AnimalListItem<T> newItem = new AnimalListItem<T>(animal);
        if(isEmpty()){
            setFirstItem(newItem);
        }else {
            appendToLastItem(newItem);
        }
    }

    private boolean isEmpty() {
        return head == null;
    }

    private void setFirstItem(AnimalListItem<T> item){
        head = item;
    }

    private void appendToLastItem(AnimalListItem<T> item){
        AnimalListItem<T> current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(item);
    }

    @Override
    public String toString(){
        if(isEmpty()){
            return "";
        }

        StringBuilder builder = new StringBuilder(head.getValue().getName());

        AnimalListItem<T> current = head.getNext();
        while(current != null){
            builder.append(" -> ").append(current.getValue().getName());
            current = current.getNext();
        }

        return builder.toString();
    }

}
