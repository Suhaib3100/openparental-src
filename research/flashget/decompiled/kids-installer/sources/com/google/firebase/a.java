package com.google.firebase;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: AutoValue_StartupTime.java */
/* loaded from: classes3.dex */
final class a extends r {

    /* renamed from: a, reason: collision with root package name */
    private final long f15025a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15026b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15027c;

    a(long j5, long j6, long j7) {
        this.f15025a = j5;
        this.f15026b = j6;
        this.f15027c = j7;
    }

    @Override // com.google.firebase.r
    public long b() {
        return this.f15026b;
    }

    @Override // com.google.firebase.r
    public long c() {
        return this.f15025a;
    }

    @Override // com.google.firebase.r
    public long d() {
        return this.f15027c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f15025a == rVar.c() && this.f15026b == rVar.b() && this.f15027c == rVar.d();
    }

    public int hashCode() {
        long j5 = this.f15025a;
        long j6 = this.f15026b;
        int i5 = (((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f15027c;
        return i5 ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public String toString() {
        return ProtectedSandApp.s("➖") + this.f15025a + ProtectedSandApp.s("➗") + this.f15026b + ProtectedSandApp.s("➘") + this.f15027c + ProtectedSandApp.s("➙");
    }
}
