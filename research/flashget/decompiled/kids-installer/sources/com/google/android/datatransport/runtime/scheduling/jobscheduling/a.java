package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: AlarmManagerScheduler.java */
/* loaded from: classes3.dex */
public class a implements y {

    /* renamed from: f, reason: collision with root package name */
    private static final String f12579f = ProtectedSandApp.s("\u206b");

    /* renamed from: g, reason: collision with root package name */
    static final String f12580g = ProtectedSandApp.s("\u206c");

    /* renamed from: h, reason: collision with root package name */
    static final String f12581h = ProtectedSandApp.s("\u206d");

    /* renamed from: i, reason: collision with root package name */
    static final String f12582i = ProtectedSandApp.s("\u206e");

    /* renamed from: j, reason: collision with root package name */
    static final String f12583j = ProtectedSandApp.s("\u206f");

    /* renamed from: a, reason: collision with root package name */
    private final Context f12584a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f12585b;

    /* renamed from: c, reason: collision with root package name */
    private AlarmManager f12586c;

    /* renamed from: d, reason: collision with root package name */
    private final g f12587d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f12588e;

    public a(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, com.google.android.datatransport.runtime.time.a aVar, g gVar) {
        this(context, dVar, (AlarmManager) context.getSystemService(ProtectedSandApp.s("\u2063")), aVar, gVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void a(com.google.android.datatransport.runtime.s sVar, int i5) {
        b(sVar, i5, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void b(com.google.android.datatransport.runtime.s sVar, int i5, boolean z5) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter(ProtectedSandApp.s("\u2064"), sVar.b());
        builder.appendQueryParameter(ProtectedSandApp.s("\u2065"), String.valueOf(m1.a.a(sVar.d())));
        if (sVar.c() != null) {
            builder.appendQueryParameter(ProtectedSandApp.s("\u2066"), Base64.encodeToString(sVar.c(), 0));
        }
        Intent intent = new Intent(this.f12584a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra(ProtectedSandApp.s("\u2067"), i5);
        String s5 = ProtectedSandApp.s("\u2068");
        if (!z5 && c(intent)) {
            j1.a.c(s5, ProtectedSandApp.s("\u2069"), sVar);
            return;
        }
        long W0 = this.f12585b.W0(sVar);
        long h5 = this.f12587d.h(sVar.d(), W0, i5);
        j1.a.e(s5, ProtectedSandApp.s("\u206a"), sVar, Long.valueOf(h5), Long.valueOf(W0), Integer.valueOf(i5));
        this.f12586c.set(3, this.f12588e.a() + h5, PendingIntent.getBroadcast(this.f12584a, 0, intent, 67108864));
    }

    @m1
    boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.f12584a, 0, intent, 603979776) != null;
    }

    @m1
    a(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, AlarmManager alarmManager, com.google.android.datatransport.runtime.time.a aVar, g gVar) {
        this.f12584a = context;
        this.f12585b = dVar;
        this.f12586c = alarmManager;
        this.f12588e = aVar;
        this.f12587d = gVar;
    }
}
