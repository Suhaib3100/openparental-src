package com.google.firebase.crashlytics.internal.common;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.common.e0;

/* compiled from: AutoValue_InstallIdProvider_InstallIds.java */
/* loaded from: classes3.dex */
final class c extends e0.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f15565a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15566b;

    c(String str, @androidx.annotation.q0 String str2) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("⠊"));
        }
        this.f15565a = str;
        this.f15566b = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.common.e0.a
    @androidx.annotation.o0
    public String c() {
        return this.f15565a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.e0.a
    @androidx.annotation.q0
    public String d() {
        return this.f15566b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0.a)) {
            return false;
        }
        e0.a aVar = (e0.a) obj;
        if (this.f15565a.equals(aVar.c())) {
            String str = this.f15566b;
            if (str == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f15565a.hashCode() ^ 1000003) * 1000003;
        String str = this.f15566b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⠋"));
        sb.append(this.f15565a);
        sb.append(ProtectedSandApp.s("⠌"));
        return androidx.concurrent.futures.a.a(sb, this.f15566b, ProtectedSandApp.s("⠍"));
    }
}
