package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.runtime.s;

/* loaded from: classes5.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static /* synthetic */ void a() {
    }

    private static /* synthetic */ void b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter(ProtectedSandApp.s("옄"));
        String queryParameter2 = intent.getData().getQueryParameter(ProtectedSandApp.s("옅"));
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(ProtectedSandApp.s("옆"))).intValue();
        int i4 = intent.getExtras().getInt(ProtectedSandApp.s("옇"));
        com.google.android.datatransport.runtime.x.f(context);
        s.a d5 = com.google.android.datatransport.runtime.s.a().b(queryParameter).d(q8.a.b(intValue));
        if (queryParameter2 != null) {
            d5.c(Base64.decode(queryParameter2, 0));
        }
        com.google.android.datatransport.runtime.x.c().e().v(d5.a(), i4, new b());
    }
}
