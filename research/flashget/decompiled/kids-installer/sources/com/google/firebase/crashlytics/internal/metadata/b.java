package com.google.firebase.crashlytics.internal.metadata;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: AutoValue_RolloutAssignment.java */
/* loaded from: classes3.dex */
final class b extends i {

    /* renamed from: c, reason: collision with root package name */
    private final String f15799c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15800d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15801e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15802f;

    /* renamed from: g, reason: collision with root package name */
    private final long f15803g;

    b(String str, String str2, String str3, String str4, long j5) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("⡈"));
        }
        this.f15799c = str;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("⡇"));
        }
        this.f15800d = str2;
        if (str3 == null) {
            throw new NullPointerException(ProtectedSandApp.s("⡆"));
        }
        this.f15801e = str3;
        if (str4 == null) {
            throw new NullPointerException(ProtectedSandApp.s("⡅"));
        }
        this.f15802f = str4;
        this.f15803g = j5;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.i
    public String c() {
        return this.f15800d;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.i
    public String d() {
        return this.f15801e;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.i
    public String e() {
        return this.f15799c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f15799c.equals(iVar.e()) && this.f15800d.equals(iVar.c()) && this.f15801e.equals(iVar.d()) && this.f15802f.equals(iVar.g()) && this.f15803g == iVar.f();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.i
    public long f() {
        return this.f15803g;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.i
    public String g() {
        return this.f15802f;
    }

    public int hashCode() {
        int hashCode = (((((((this.f15799c.hashCode() ^ 1000003) * 1000003) ^ this.f15800d.hashCode()) * 1000003) ^ this.f15801e.hashCode()) * 1000003) ^ this.f15802f.hashCode()) * 1000003;
        long j5 = this.f15803g;
        return hashCode ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        return ProtectedSandApp.s("⡉") + this.f15799c + ProtectedSandApp.s("⡊") + this.f15800d + ProtectedSandApp.s("⡋") + this.f15801e + ProtectedSandApp.s("⡌") + this.f15802f + ProtectedSandApp.s("⡍") + this.f15803g + ProtectedSandApp.s("⡎");
    }
}
