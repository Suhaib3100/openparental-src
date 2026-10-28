package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.app.p0;

/* compiled from: PendingIntentActivityWrapper.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26663a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26664b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final Intent f26665c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26666d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private final Bundle f26667e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private final PendingIntent f26668f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f26669g;

    public a(@o0 Context context, int i4, @o0 Intent intent, int i5, boolean z4) {
        this(context, i4, intent, i5, null, z4);
    }

    @q0
    private PendingIntent a() {
        Bundle bundle = this.f26667e;
        return bundle == null ? p0.e(this.f26663a, this.f26664b, this.f26665c, this.f26666d, this.f26669g) : p0.d(this.f26663a, this.f26664b, this.f26665c, this.f26666d, bundle, this.f26669g);
    }

    @o0
    public Context b() {
        return this.f26663a;
    }

    public int c() {
        return this.f26666d;
    }

    @o0
    public Intent d() {
        return this.f26665c;
    }

    @o0
    public Bundle e() {
        return this.f26667e;
    }

    @q0
    public PendingIntent f() {
        return this.f26668f;
    }

    public int g() {
        return this.f26664b;
    }

    public boolean h() {
        return this.f26669g;
    }

    public a(@o0 Context context, int i4, @o0 Intent intent, int i5, @q0 Bundle bundle, boolean z4) {
        this.f26663a = context;
        this.f26664b = i4;
        this.f26665c = intent;
        this.f26666d = i5;
        this.f26667e = bundle;
        this.f26669g = z4;
        this.f26668f = a();
    }
}
