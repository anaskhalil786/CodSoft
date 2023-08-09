package com.example.todolist;

import androidx.room.Entity;

@Entity (tableName = "my_notes")
public class Note {
    private String title;
    private string disp;

    @Primarykey(autoGenrate= true)
    private int id;

    public int getId() {
        return id;
    }

    public Note(String title, string disp) {
        this.title = title;
        this.disp = disp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public string getDisp() {
        return disp;
    }

    public void setDisp(string disp) {
        this.disp = disp;
    }
}
