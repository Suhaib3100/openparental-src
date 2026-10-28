package com.google.firebase;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AutoValue_StartupTime.java */
/* loaded from: classes6.dex */
final class a extends r {

    /* renamed from: a, reason: collision with root package name */
    private final long f58098a;

    /* renamed from: b, reason: collision with root package name */
    private final long f58099b;

    /* renamed from: c, reason: collision with root package name */
    private final long f58100c;

    a(long j4, long j5, long j6) {
        this.f58098a = j4;
        this.f58099b = j5;
        this.f58100c = j6;
    }

    @Override // com.google.firebase.r
    public long b() {
        return this.f58099b;
    }

    @Override // com.google.firebase.r
    public long c() {
        return this.f58098a;
    }

    @Override // com.google.firebase.r
    public long d() {
        return this.f58100c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f58098a == rVar.c() && this.f58099b == rVar.b() && this.f58100c == rVar.d();
    }

    public int hashCode() {
        long j4 = this.f58098a;
        long j5 = this.f58099b;
        int i4 = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.f58100c;
        return i4 ^ ((int) ((j6 >>> 32) ^ j6));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("墳"));
        sb.append(this.f58098a);
        sb.append(ProtectedSandApp.s("奄"));
        sb.append(this.f58099b);
        sb.append(ProtectedSandApp.s("奔"));
        return android.support.v4.media.session.b.a(sb, this.f58100c, ProtectedSandApp.s("婢"));
    }
}
