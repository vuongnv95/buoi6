package com.example.demobuoi6;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "users")
public class UserEntity {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int mId;
    @ColumnInfo(name = "first_name")
    private String mFirstName;
    @ColumnInfo(name = "last_name")
    private String mLastName;

    @Embedded
    private Address address;
    @Ignore
    public UserEntity( String mFirstName, String mLastName, Address address) {
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
        this.address = address;
    }

    public static class Address {
        private String province;

        public Address(String province) {
            this.province = province;
        }
    }

    @Override
    @Ignore
    public String toString() {
        return "UserEntity{" +
                "mId=" + mId +
                ", mFirstName='" + mFirstName + '\'' +
                ", mLastName='" + mLastName + '\'' +
                ", address=" + address +
                '}';
    }
}
