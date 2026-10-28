package com.google.firebase.platforminfo;

import com.flashget.kidsdownloader.ProtectedSandApp;
import javax.annotation.Nonnull;

/* compiled from: AutoValue_LibraryVersion.java */
/* loaded from: classes3.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f17694a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17695b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("⬛"));
        }
        this.f17694a = str;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("⬚"));
        }
        this.f17695b = str2;
    }

    @Override // com.google.firebase.platforminfo.f
    @Nonnull
    public String b() {
        return this.f17694a;
    }

    @Override // com.google.firebase.platforminfo.f
    @Nonnull
    public String c() {
        return this.f17695b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f17694a.equals(fVar.b()) && this.f17695b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f17694a.hashCode() ^ 1000003) * 1000003) ^ this.f17695b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⬜"));
        sb.append(this.f17694a);
        sb.append(ProtectedSandApp.s("⬝"));
        return androidx.concurrent.futures.a.a(sb, this.f17695b, ProtectedSandApp.s("⬞"));
    }
}
