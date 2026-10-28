package com.google.android.datatransport;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: Encoding.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f12250a;

    private c(@o0 String str) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("\u08e2"));
        }
        this.f12250a = str;
    }

    public static c b(@o0 String str) {
        return new c(str);
    }

    public String a() {
        return this.f12250a;
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f12250a.equals(((c) obj).f12250a);
        }
        return false;
    }

    public int hashCode() {
        return this.f12250a.hashCode() ^ 1000003;
    }

    @o0
    public String toString() {
        return androidx.concurrent.futures.a.a(new StringBuilder(ProtectedSandApp.s("ࣣ")), this.f12250a, ProtectedSandApp.s("ࣤ"));
    }
}
