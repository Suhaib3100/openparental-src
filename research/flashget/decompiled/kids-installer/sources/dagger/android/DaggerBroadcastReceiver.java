package dagger.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes5.dex */
public abstract class DaggerBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    @androidx.annotation.i
    public void onReceive(Context context, Intent intent) {
        a.e(this, context);
    }
}
