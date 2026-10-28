package com.google.firebase.platforminfo;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AutoValue_LibraryVersion.java */
/* loaded from: classes6.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f60364a;

    /* renamed from: b, reason: collision with root package name */
    private final String f60365b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("̥\u0001"));
        }
        this.f60364a = str;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("̤\u0001"));
        }
        this.f60365b = str2;
    }

    @Override // com.google.firebase.platforminfo.f
    @zc.g
    public String b() {
        return this.f60364a;
    }

    @Override // com.google.firebase.platforminfo.f
    @zc.g
    public String c() {
        return this.f60365b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f60364a.equals(fVar.b()) && this.f60365b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f60364a.hashCode() ^ 1000003) * 1000003) ^ this.f60365b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("̦\u0001"));
        sb.append(this.f60364a);
        sb.append(ProtectedSandApp.s("̧\u0001"));
        return android.support.v4.media.c.a(sb, this.f60365b, ProtectedSandApp.s("̨\u0001"));
    }
}
