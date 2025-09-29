package org.main.classes;

public class Hideout<T> {
    private T hiddenObject;

    public Hideout() {
        this.hiddenObject = null;
    }

    public void putIntoHideout(T toHide) {
        this.hiddenObject = toHide;
    }

    public T takeFromHideout() {
        T objectToReturn = this.hiddenObject;
        this.hiddenObject = null;
        return objectToReturn;
    }

    public boolean isInHideout() {
        return this.hiddenObject != null;
    }
}
