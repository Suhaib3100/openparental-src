package com.google.common.net;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.net.InetAddress;
import java.text.ParseException;

/* compiled from: HostSpecifier.java */
@a
@d9.c
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f57259a;

    private c(String str) {
        this.f57259a = str;
    }

    @f9.a
    public static c a(String str) throws ParseException {
        try {
            return b(str);
        } catch (IllegalArgumentException e4) {
            String valueOf = String.valueOf(str);
            int length = valueOf.length();
            String s4 = ProtectedSandApp.s("\uf734");
            ParseException parseException = new ParseException(length != 0 ? s4.concat(valueOf) : new String(s4), 0);
            parseException.initCause(e4);
            throw parseException;
        }
    }

    public static c b(String str) {
        InetAddress inetAddress;
        b c5 = b.c(str);
        l0.d(!c5.h());
        String d5 = c5.d();
        try {
            inetAddress = e.g(d5);
        } catch (IllegalArgumentException unused) {
            inetAddress = null;
        }
        if (inetAddress != null) {
            return new c(e.O(inetAddress));
        }
        f d6 = f.d(d5);
        if (d6.f()) {
            return new c(d6.toString());
        }
        String valueOf = String.valueOf(d5);
        int length = valueOf.length();
        String s4 = ProtectedSandApp.s("\uf735");
        throw new IllegalArgumentException(length != 0 ? s4.concat(valueOf) : new String(s4));
    }

    public static boolean c(String str) {
        try {
            b(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean equals(@zc.a Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f57259a.equals(((c) obj).f57259a);
        }
        return false;
    }

    public int hashCode() {
        return this.f57259a.hashCode();
    }

    public String toString() {
        return this.f57259a;
    }
}
