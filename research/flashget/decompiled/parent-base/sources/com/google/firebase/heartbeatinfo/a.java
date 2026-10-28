package com.google.firebase.heartbeatinfo;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: AutoValue_HeartBeatResult.java */
/* loaded from: classes6.dex */
final class a extends r {

    /* renamed from: a, reason: collision with root package name */
    private final String f59672a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f59673b;

    a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("o\u0001"));
        }
        this.f59672a = str;
        if (list == null) {
            throw new NullPointerException(ProtectedSandApp.s("n\u0001"));
        }
        this.f59673b = list;
    }

    @Override // com.google.firebase.heartbeatinfo.r
    public List<String> b() {
        return this.f59673b;
    }

    @Override // com.google.firebase.heartbeatinfo.r
    public String c() {
        return this.f59672a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f59672a.equals(rVar.c()) && this.f59673b.equals(rVar.b());
    }

    public int hashCode() {
        return ((this.f59672a.hashCode() ^ 1000003) * 1000003) ^ this.f59673b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("p\u0001"));
        sb.append(this.f59672a);
        sb.append(ProtectedSandApp.s("q\u0001"));
        return androidx.privacysandbox.ads.adservices.measurement.d.a(sb, this.f59673b, ProtectedSandApp.s("r\u0001"));
    }
}
