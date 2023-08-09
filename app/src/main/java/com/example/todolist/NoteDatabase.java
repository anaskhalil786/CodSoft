package com.example.todolist;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Note.class, version = 1)
public abstract class NoteDatabase extends RoomDatabase {

    private static NoteDatabase Instance;
    public abstract NoteDao noteDao();
    public static synchronized NoteDatabase getInstance(Context context)
    {
        if (instance==null)
        {
            instance= Room.databaseBuilder(context.getApplicationContext()
            ,NoteDatabase.class, name: "note_database").fallbackToDestructiveMigrationFrom()
                    .build();
        }
        return Instance();
    }

}
