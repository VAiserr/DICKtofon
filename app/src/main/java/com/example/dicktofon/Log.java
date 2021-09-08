package com.example.dicktofon;

import java.util.Date;

public class Log {
    public String logText;
    public long logTime;
    public Boolean logUser;

    public Log() {}

    public Log(String text, Boolean user) {
        this.logText = text;
        this.logUser = user;
        this.logTime = new Date().getTime();
    }

    public String getLogText() {
        return logText;
    }

    public void setLogText(String logText) {
        this.logText = logText;
    }

    public long getLogTime() {
        return logTime;
    }

    public void setLogTime(long logTime) {
        this.logTime = logTime;
    }

    public Boolean getLogUser() {
        return logUser;
    }

    public void setLogUser(Boolean logUser) {
        this.logUser = logUser;
    }
}
