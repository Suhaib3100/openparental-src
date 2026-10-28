package com.google.firebase.crashlytics.internal.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.h0;

/* compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* loaded from: classes6.dex */
final class e0 extends h0.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f59196a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59197b;

    /* renamed from: c, reason: collision with root package name */
    private final int f59198c;

    /* renamed from: d, reason: collision with root package name */
    private final long f59199d;

    /* renamed from: e, reason: collision with root package name */
    private final long f59200e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f59201f;

    /* renamed from: g, reason: collision with root package name */
    private final int f59202g;

    /* renamed from: h, reason: collision with root package name */
    private final String f59203h;

    /* renamed from: i, reason: collision with root package name */
    private final String f59204i;

    e0(int i4, String str, int i5, long j4, long j5, boolean z4, int i6, String str2, String str3) {
        this.f59196a = i4;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("︖"));
        }
        this.f59197b = str;
        this.f59198c = i5;
        this.f59199d = j4;
        this.f59200e = j5;
        this.f59201f = z4;
        this.f59202g = i6;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("︕"));
        }
        this.f59203h = str2;
        if (str3 == null) {
            throw new NullPointerException(ProtectedSandApp.s("︔"));
        }
        this.f59204i = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.b
    public int a() {
        return this.f59196a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.b
    public int b() {
        return this.f59198c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.b
    public long d() {
        return this.f59200e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.b
    public boolean e() {
        return this.f59201f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.b)) {
            return false;
        }
        h0.b bVar = (h0.b) obj;
        return this.f59196a == bVar.a() && this.f59197b.equals(bVar.g()) && this.f59198c == bVar.b() && this.f59199d == bVar.j() && this.f59200e == bVar.d() && this.f59201f == bVar.e() && this.f59202g == bVar.i() && this.f59203h.equals(bVar.f()) && this.f59204i.equals(bVar.h());
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.b
    public String f() {
        return this.f59203h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.b
    public String g() {
        return this.f59197b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.b
    public String h() {
        return this.f59204i;
    }

    public int hashCode() {
        int hashCode = (((((this.f59196a ^ 1000003) * 1000003) ^ this.f59197b.hashCode()) * 1000003) ^ this.f59198c) * 1000003;
        long j4 = this.f59199d;
        int i4 = (hashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f59200e;
        return ((((((((i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ (this.f59201f ? 1231 : 1237)) * 1000003) ^ this.f59202g) * 1000003) ^ this.f59203h.hashCode()) * 1000003) ^ this.f59204i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.b
    public int i() {
        return this.f59202g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.h0.b
    public long j() {
        return this.f59199d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("︗"));
        sb.append(this.f59196a);
        sb.append(ProtectedSandApp.s("︘"));
        sb.append(this.f59197b);
        sb.append(ProtectedSandApp.s("︙"));
        sb.append(this.f59198c);
        sb.append(ProtectedSandApp.s("\ufe1a"));
        sb.append(this.f59199d);
        sb.append(ProtectedSandApp.s("\ufe1b"));
        sb.append(this.f59200e);
        sb.append(ProtectedSandApp.s("\ufe1c"));
        sb.append(this.f59201f);
        sb.append(ProtectedSandApp.s("\ufe1d"));
        sb.append(this.f59202g);
        sb.append(ProtectedSandApp.s("\ufe1e"));
        sb.append(this.f59203h);
        sb.append(ProtectedSandApp.s("\ufe1f"));
        return android.support.v4.media.c.a(sb, this.f59204i, ProtectedSandApp.s("︠"));
    }
}
