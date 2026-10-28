package com.google.firebase.heartbeatinfo;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: AutoValue_HeartBeatResult.java */
/* loaded from: classes3.dex */
final class a extends s {

    /* renamed from: a, reason: collision with root package name */
    private final String f16651a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f16652b;

    a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("⪂"));
        }
        this.f16651a = str;
        if (list == null) {
            throw new NullPointerException(ProtectedSandApp.s("⪁"));
        }
        this.f16652b = list;
    }

    @Override // com.google.firebase.heartbeatinfo.s
    public List<String> b() {
        return this.f16652b;
    }

    @Override // com.google.firebase.heartbeatinfo.s
    public String c() {
        return this.f16651a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f16651a.equals(sVar.c()) && this.f16652b.equals(sVar.b());
    }

    public int hashCode() {
        return ((this.f16651a.hashCode() ^ 1000003) * 1000003) ^ this.f16652b.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("⪃") + this.f16651a + ProtectedSandApp.s("⪄") + this.f16652b + ProtectedSandApp.s("⪅");
    }
}
