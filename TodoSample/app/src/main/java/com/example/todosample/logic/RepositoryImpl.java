package com.example.todosample.logic;

import com.example.todosample.base.BasePresenter;
import com.example.todosample.logic.local.LocalDataSourceImpl;
import com.example.todosample.model.Item;
import com.example.todosample.model.User;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

public class RepositoryImpl<T> implements Repository {
    BasePresenter<T> presenter;
    DataSource localDataSource;
    DataSource remoteDataSource;

    @Override
    public void setPresenter(BasePresenter presenter) {
        this.presenter = presenter;
        localDataSource = new LocalDataSourceImpl();
        //remoteDataSource = new RemoteDataSourceImpl();
        localDataSource.setRepository(this);
        remoteDataSource.setRepository(this);
    }

    @Override
    public Single<Long> save(Item item) {
        return null;
    }

    @Override
    public void saveDone() {

    }

    @Override
    public Single<Long> loginProc(User user) {
        return localDataSource.loginProc(user);
    }

    @Override
    public Flowable<List<Item>> fetchItems() {
        return null;
    }

    @Override
    public Single<Item> fetchItem(int no) {
        return null;
    }

    @Override
    public void fetchItemsDone(List list) {

    }
}
