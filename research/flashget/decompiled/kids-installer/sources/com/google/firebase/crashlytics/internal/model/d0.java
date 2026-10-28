package com.google.firebase.crashlytics.internal.model;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* loaded from: classes3.dex */
final class d0 extends g0.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f16076a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16077b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16078c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16079d;

    /* renamed from: e, reason: collision with root package name */
    private final long f16080e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16081f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16082g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16083h;

    /* renamed from: i, reason: collision with root package name */
    private final String f16084i;

    d0(int i5, String str, int i6, long j5, long j6, boolean z5, int i7, String str2, String str3) {
        this.f16076a = i5;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("⤞"));
        }
        this.f16077b = str;
        this.f16078c = i6;
        this.f16079d = j5;
        this.f16080e = j6;
        this.f16081f = z5;
        this.f16082g = i7;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("⤝"));
        }
        this.f16083h = str2;
        if (str3 == null) {
            throw new NullPointerException(ProtectedSandApp.s("⤜"));
        }
        this.f16084i = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public int a() {
        return this.f16076a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public int b() {
        return this.f16078c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public long d() {
        return this.f16080e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public boolean e() {
        return this.f16081f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.b)) {
            return false;
        }
        g0.b bVar = (g0.b) obj;
        return this.f16076a == bVar.a() && this.f16077b.equals(bVar.g()) && this.f16078c == bVar.b() && this.f16079d == bVar.j() && this.f16080e == bVar.d() && this.f16081f == bVar.e() && this.f16082g == bVar.i() && this.f16083h.equals(bVar.f()) && this.f16084i.equals(bVar.h());
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public String f() {
        return this.f16083h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public String g() {
        return this.f16077b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public String h() {
        return this.f16084i;
    }

    public int hashCode() {
        int hashCode = (((((this.f16076a ^ 1000003) * 1000003) ^ this.f16077b.hashCode()) * 1000003) ^ this.f16078c) * 1000003;
        long j5 = this.f16079d;
        int i5 = (hashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.f16080e;
        return ((((((((i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ (this.f16081f ? 1231 : 1237)) * 1000003) ^ this.f16082g) * 1000003) ^ this.f16083h.hashCode()) * 1000003) ^ this.f16084i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public int i() {
        return this.f16082g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.b
    public long j() {
        return this.f16079d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⤟"));
        sb.append(this.f16076a);
        sb.append(ProtectedSandApp.s("⤠"));
        sb.append(this.f16077b);
        sb.append(ProtectedSandApp.s("⤡"));
        sb.append(this.f16078c);
        sb.append(ProtectedSandApp.s("⤢"));
        sb.append(this.f16079d);
        sb.append(ProtectedSandApp.s("⤣"));
        sb.append(this.f16080e);
        sb.append(ProtectedSandApp.s("⤤"));
        sb.append(this.f16081f);
        sb.append(ProtectedSandApp.s("⤥"));
        sb.append(this.f16082g);
        sb.append(ProtectedSandApp.s("⤦"));
        sb.append(this.f16083h);
        sb.append(ProtectedSandApp.s("⤧"));
        return androidx.concurrent.futures.a.a(sb, this.f16084i, ProtectedSandApp.s("⤨"));
    }
}
