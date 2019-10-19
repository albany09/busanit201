package com.example.todosample.logic.local;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Insert;

import com.example.todosample.model.User;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

@Dao
public interface ItemDao {
    @Query("select * from user where id = :id and pwd = :pwd")
    Flowable<List<User>> login(String id, String pwd);
}
