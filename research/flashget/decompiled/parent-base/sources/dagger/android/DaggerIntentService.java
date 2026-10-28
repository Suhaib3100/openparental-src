package dagger.android;

import android.app.IntentService;

/* loaded from: classes7.dex */
public abstract class DaggerIntentService extends IntentService {
    public DaggerIntentService(String name) {
        super(name);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        a.d(this);
        super.onCreate();
    }
}
