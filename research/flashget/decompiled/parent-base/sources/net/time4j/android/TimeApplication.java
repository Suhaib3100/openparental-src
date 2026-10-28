package net.time4j.android;

import android.app.Application;

/* loaded from: classes7.dex */
public abstract class TimeApplication extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        a.c(this, false);
    }
}
