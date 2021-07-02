package com.example.demobuoi6;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "address")
public class AddressEntity {
    @ColumnInfo(name = "province")
    private String province;
}
