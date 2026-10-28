package org.minidns.dnslabel;

/* compiled from: LdhLabel.java */
/* loaded from: classes4.dex */
public abstract class c extends DnsLabel {

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f87161i = false;

    protected c(String str) {
        super(str);
    }

    protected static c n(String str) {
        return h.p(str) ? j.s(str) ? j.n(str) : new h(str) : new f(str);
    }

    public static boolean o(String str) {
        if (str.isEmpty() || d.o(str)) {
            return false;
        }
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt < '0' || charAt > '9') && charAt != '-'))) {
                return false;
            }
        }
        return true;
    }
}
