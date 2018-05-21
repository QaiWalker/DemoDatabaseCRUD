package com.myapplicationdev.android.demodatabasecrud;

import android.content.Context;

import java.io.Serializable;

public class Note implements Serializable{
    private int id;
    private String noteContent;

    public Note(int id, String noteContent){
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() { return id; }

    public String getNoteContent() { return noteContent; }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }
    public String toString(){
        return "ID: " + id + ", " + noteContent;
    }





}
