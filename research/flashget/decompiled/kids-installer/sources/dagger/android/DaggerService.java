package dagger.android;

import android.app.Service;

/* loaded from: classes5.dex */
public abstract class DaggerService extends Service {
    @Override // android.app.Service
    public void onCreate() {
        a.d(this);
        super.onCreate();
    }
}
