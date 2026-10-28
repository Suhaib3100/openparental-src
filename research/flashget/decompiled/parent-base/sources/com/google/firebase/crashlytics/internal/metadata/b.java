package com.google.firebase.crashlytics.internal.metadata;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AutoValue_RolloutAssignment.java */
/* loaded from: classes6.dex */
final class b extends i {

    /* renamed from: c, reason: collision with root package name */
    private final String f58901c;

    /* renamed from: d, reason: collision with root package name */
    private final String f58902d;

    /* renamed from: e, reason: collision with root package name */
    private final String f58903e;

    /* renamed from: f, reason: collision with root package name */
    private final String f58904f;

    /* renamed from: g, reason: collision with root package name */
    private final long f58905g;

    b(String str, String str2, String str3, String str4, long j4) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("ﳻ"));
        }
        this.f58901c = str;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("ﳺ"));
        }
        this.f58902d = str2;
        if (str3 == null) {
            throw new NullPointerException(ProtectedSandApp.s("ﳹ"));
        }
        this.f58903e = str3;
        if (str4 == null) {
            throw new NullPointerException(ProtectedSandApp.s("ﳸ"));
        }
        this.f58904f = str4;
        this.f58905g = j4;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.i
    public String c() {
        return this.f58902d;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.i
    public String d() {
        return this.f58903e;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.i
    public String e() {
        return this.f58901c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f58901c.equals(iVar.e()) && this.f58902d.equals(iVar.c()) && this.f58903e.equals(iVar.d()) && this.f58904f.equals(iVar.g()) && this.f58905g == iVar.f();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.i
    public long f() {
        return this.f58905g;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.i
    public String g() {
        return this.f58904f;
    }

    public int hashCode() {
        int hashCode = (((((((this.f58901c.hashCode() ^ 1000003) * 1000003) ^ this.f58902d.hashCode()) * 1000003) ^ this.f58903e.hashCode()) * 1000003) ^ this.f58904f.hashCode()) * 1000003;
        long j4 = this.f58905g;
        return hashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ﳼ"));
        sb.append(this.f58901c);
        sb.append(ProtectedSandApp.s("ﳽ"));
        sb.append(this.f58902d);
        sb.append(ProtectedSandApp.s("ﳾ"));
        sb.append(this.f58903e);
        sb.append(ProtectedSandApp.s("ﳿ"));
        sb.append(this.f58904f);
        sb.append(ProtectedSandApp.s("ﴀ"));
        return android.support.v4.media.session.b.a(sb, this.f58905g, ProtectedSandApp.s("ﴁ"));
    }
}
