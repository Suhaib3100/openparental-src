package org.minidns.dnslabel;

/* compiled from: NonReservedLdhLabel.java */
/* loaded from: classes4.dex */
public final class f extends c {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ boolean f87162j = false;

    protected f(String str) {
        super(str);
    }

    public static boolean p(String str) {
        if (c.o(str)) {
            return q(str);
        }
        return false;
    }

    static boolean q(String str) {
        return !h.q(str);
    }
}
