package org.androidannotations.api.support.app;

import android.app.IntentService;
import android.content.Intent;

/* loaded from: classes5.dex */
public abstract class AbstractIntentService extends IntentService {
    public AbstractIntentService(String str) {
        super(str);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
    }
}
