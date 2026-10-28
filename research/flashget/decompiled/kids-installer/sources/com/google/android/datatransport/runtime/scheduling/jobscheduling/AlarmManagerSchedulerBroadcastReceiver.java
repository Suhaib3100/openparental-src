package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.s;

/* loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static /* synthetic */ void a() {
    }

    private static /* synthetic */ void b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter(ProtectedSandApp.s("ऽ"));
        String queryParameter2 = intent.getData().getQueryParameter(ProtectedSandApp.s("ा"));
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(ProtectedSandApp.s("ि"))).intValue();
        int i5 = intent.getExtras().getInt(ProtectedSandApp.s("ी"));
        com.google.android.datatransport.runtime.x.f(context);
        s.a d6 = com.google.android.datatransport.runtime.s.a().b(queryParameter).d(m1.a.b(intValue));
        if (queryParameter2 != null) {
            d6.c(Base64.decode(queryParameter2, 0));
        }
        com.google.android.datatransport.runtime.x.c().e().v(d6.a(), i5, new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.b
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.a();
            }
        });
    }
}
