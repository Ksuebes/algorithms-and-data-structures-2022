package ru.mirea.practice.task3;

public class TextDocument implements IDocument {
    private String string;

    TextDocument(String string) {
        this.string = string;
    }

    @Override
    public String getString() {
        return string;
    }
}
