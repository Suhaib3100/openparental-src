package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.j;
import androidx.work.s;

/* loaded from: classes3.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36040a = s.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        s.c().a(f36040a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            j.H(context).T(goAsync());
        } catch (IllegalStateException e4) {
            s.c().b(f36040a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e4);
        }
    }
}
