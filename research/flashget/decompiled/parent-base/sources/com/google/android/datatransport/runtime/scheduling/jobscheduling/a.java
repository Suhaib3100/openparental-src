package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AlarmManagerScheduler.java */
/* loaded from: classes5.dex */
public class a implements y {

    /* renamed from: f, reason: collision with root package name */
    private static final String f52109f = ProtectedSandApp.s("옑");

    /* renamed from: g, reason: collision with root package name */
    static final String f52110g = ProtectedSandApp.s("옐");

    /* renamed from: h, reason: collision with root package name */
    static final String f52111h = ProtectedSandApp.s("옍");

    /* renamed from: i, reason: collision with root package name */
    static final String f52112i = ProtectedSandApp.s("옎");

    /* renamed from: j, reason: collision with root package name */
    static final String f52113j = ProtectedSandApp.s("옏");

    /* renamed from: a, reason: collision with root package name */
    private final Context f52114a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f52115b;

    /* renamed from: c, reason: collision with root package name */
    private AlarmManager f52116c;

    /* renamed from: d, reason: collision with root package name */
    private final g f52117d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f52118e;

    public a(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, com.google.android.datatransport.runtime.time.a aVar, g gVar) {
        this(context, dVar, (AlarmManager) context.getSystemService(ProtectedSandApp.s("옌")), aVar, gVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void a(com.google.android.datatransport.runtime.s sVar, int i4) {
        b(sVar, i4, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void b(com.google.android.datatransport.runtime.s sVar, int i4, boolean z4) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter(ProtectedSandApp.s("옍"), sVar.b());
        builder.appendQueryParameter(ProtectedSandApp.s("옎"), String.valueOf(q8.a.a(sVar.d())));
        if (sVar.c() != null) {
            builder.appendQueryParameter(ProtectedSandApp.s("옏"), Base64.encodeToString(sVar.c(), 0));
        }
        Intent intent = new Intent(this.f52114a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra(ProtectedSandApp.s("옐"), i4);
        String s4 = ProtectedSandApp.s("옑");
        if (!z4 && c(intent)) {
            n8.a.c(s4, ProtectedSandApp.s("옒"), sVar);
            return;
        }
        long w12 = this.f52115b.w1(sVar);
        long h4 = this.f52117d.h(sVar.d(), w12, i4);
        n8.a.e(s4, ProtectedSandApp.s("옓"), sVar, Long.valueOf(h4), Long.valueOf(w12), Integer.valueOf(i4));
        this.f52116c.set(3, this.f52118e.a() + h4, PendingIntent.getBroadcast(this.f52114a, 0, intent, androidx.core.view.accessibility.b.f26943s));
    }

    @m1
    boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.f52114a, 0, intent, 603979776) != null;
    }

    @m1
    a(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, AlarmManager alarmManager, com.google.android.datatransport.runtime.time.a aVar, g gVar) {
        this.f52114a = context;
        this.f52115b = dVar;
        this.f52116c = alarmManager;
        this.f52118e = aVar;
        this.f52117d = gVar;
    }
}
