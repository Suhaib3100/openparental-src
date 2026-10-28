package com.google.android.datatransport;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Encoding.java */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f51936a;

    private e(@o0 String str) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("얇"));
        }
        this.f51936a = str;
    }

    public static e b(@o0 String str) {
        return new e(str);
    }

    public String a() {
        return this.f51936a;
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f51936a.equals(((e) obj).f51936a);
        }
        return false;
    }

    public int hashCode() {
        return this.f51936a.hashCode() ^ 1000003;
    }

    @o0
    public String toString() {
        return android.support.v4.media.c.a(new StringBuilder(ProtectedSandApp.s("얈")), this.f51936a, ProtectedSandApp.s("얉"));
    }
}
