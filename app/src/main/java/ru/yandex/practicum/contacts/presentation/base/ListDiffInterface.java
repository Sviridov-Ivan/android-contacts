package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <T> { //создание интерфейса ListDiffInterface, согласно заданию в Шаге №1
    boolean theSameAs(T other);

    @Override
    boolean equals(Object obj);
}


