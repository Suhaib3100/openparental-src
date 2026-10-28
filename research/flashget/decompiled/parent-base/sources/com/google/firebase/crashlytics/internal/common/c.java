package com.google.firebase.crashlytics.internal.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.common.o0;

/* compiled from: AutoValue_InstallIdProvider_InstallIds.java */
/* loaded from: classes6.dex */
final class c extends o0.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f58632a;

    /* renamed from: b, reason: collision with root package name */
    private final String f58633b;

    /* renamed from: c, reason: collision with root package name */
    private final String f58634c;

    c(String str, @androidx.annotation.q0 String str2, @androidx.annotation.q0 String str3) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("ﯯ"));
        }
        this.f58632a = str;
        this.f58633b = str2;
        this.f58634c = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.common.o0.a
    @androidx.annotation.o0
    public String c() {
        return this.f58632a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.o0.a
    @androidx.annotation.q0
    public String d() {
        return this.f58634c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.o0.a
    @androidx.annotation.q0
    public String e() {
        return this.f58633b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0.a)) {
            return false;
        }
        o0.a aVar = (o0.a) obj;
        if (this.f58632a.equals(aVar.c()) && ((str = this.f58633b) != null ? str.equals(aVar.e()) : aVar.e() == null)) {
            String str2 = this.f58634c;
            if (str2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f58632a.hashCode() ^ 1000003) * 1000003;
        String str = this.f58633b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f58634c;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ﯰ"));
        sb.append(this.f58632a);
        sb.append(ProtectedSandApp.s("ﯱ"));
        sb.append(this.f58633b);
        sb.append(ProtectedSandApp.s("ﯲ"));
        return android.support.v4.media.c.a(sb, this.f58634c, ProtectedSandApp.s("ﯳ"));
    }
}
