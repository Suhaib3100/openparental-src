package com.google.firebase.heartbeatinfo;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AutoValue_SdkHeartBeatResult.java */
/* loaded from: classes6.dex */
final class b extends s {

    /* renamed from: b, reason: collision with root package name */
    private final String f59674b;

    /* renamed from: c, reason: collision with root package name */
    private final long f59675c;

    b(String str, long j4) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("s\u0001"));
        }
        this.f59674b = str;
        this.f59675c = j4;
    }

    @Override // com.google.firebase.heartbeatinfo.s
    public long c() {
        return this.f59675c;
    }

    @Override // com.google.firebase.heartbeatinfo.s
    public String d() {
        return this.f59674b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f59674b.equals(sVar.d()) && this.f59675c == sVar.c();
    }

    public int hashCode() {
        int hashCode = (this.f59674b.hashCode() ^ 1000003) * 1000003;
        long j4 = this.f59675c;
        return hashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("t\u0001"));
        sb.append(this.f59674b);
        sb.append(ProtectedSandApp.s("u\u0001"));
        return android.support.v4.media.session.b.a(sb, this.f59675c, ProtectedSandApp.s("v\u0001"));
    }
}
