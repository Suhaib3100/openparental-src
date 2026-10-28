package org.minidns.dnslabel;

/* compiled from: ReservedLdhLabel.java */
/* loaded from: classes4.dex */
public class h extends c {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ boolean f87163j = false;

    protected h(String str) {
        super(str);
    }

    public static boolean p(String str) {
        if (c.o(str)) {
            return q(str);
        }
        return false;
    }

    static boolean q(String str) {
        return str.length() >= 4 && str.charAt(2) == '-' && str.charAt(3) == '-';
    }
}
