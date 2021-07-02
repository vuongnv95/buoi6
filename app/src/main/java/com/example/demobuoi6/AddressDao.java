package com.example.demobuoi6;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AddressDao {
    @Query("SELECT * FROM address WHERE province = :province")
    public List<AddressEntity> getAddress(String province);
}
