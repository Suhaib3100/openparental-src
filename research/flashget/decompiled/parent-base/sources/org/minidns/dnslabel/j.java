package org.minidns.dnslabel;

import java.util.Locale;

/* compiled from: XnLabel.java */
/* loaded from: classes4.dex */
public abstract class j extends h {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ boolean f87164k = false;

    protected j(String str) {
        super(str);
    }

    protected static c n(String str) {
        return str.equals(hg.c.c(str)) ? new b(str) : new a(str);
    }

    public static boolean r(String str) {
        if (c.o(str)) {
            return s(str);
        }
        return false;
    }

    static boolean s(String str) {
        return str.substring(0, 2).toLowerCase(Locale.US).equals("xn");
    }
}
