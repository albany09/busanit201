package com.example.todosample.logic;

import com.example.todosample.model.Item;
import com.example.todosample.model.User;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

public interface DataSource {
    void setRepository(Repository repository);
    Single<Long> save(Item item);

    Flowable<List<Item>> fetchItems();

    Single<Item> fetchItem(int no);

    Single<Long> loginProc(User user);
}
