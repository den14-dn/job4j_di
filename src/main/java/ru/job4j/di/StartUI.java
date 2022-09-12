package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {
    private Store store;
    private ConsoleInput input;

    @Autowired
    public void setStore(Store store) {
        this.store = store;
    }

    @Autowired
    public void setInput(ConsoleInput input) {
        this.input = input;
    }

    public void add(String value) {
        store.add(input.askStr(value));
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
