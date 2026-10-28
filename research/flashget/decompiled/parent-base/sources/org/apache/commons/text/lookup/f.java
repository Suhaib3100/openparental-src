package org.apache.commons.text.lookup;

import java.util.Date;

/* compiled from: DateStringLookup.java */
/* loaded from: classes3.dex */
final class f extends a {

    /* renamed from: c, reason: collision with root package name */
    static final f f86518c = new f();

    private f() {
    }

    private String g(long j4, String str) {
        org.apache.commons.lang3.time.g C;
        if (str != null) {
            try {
                C = org.apache.commons.lang3.time.g.C(str);
            } catch (Exception e4) {
                throw l.b(e4, "Invalid date format: [%s]", str);
            }
        } else {
            C = null;
        }
        if (C == null) {
            C = org.apache.commons.lang3.time.g.B();
        }
        return C.k(new Date(j4));
    }

    @Override // org.apache.commons.text.lookup.t
    public String lookup(String str) {
        return g(System.currentTimeMillis(), str);
    }
}
