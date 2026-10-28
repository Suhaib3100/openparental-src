package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: UsingToStringOrdering.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
final class h7 extends e5<Object> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    static final h7 f55811d = new h7();

    /* renamed from: e, reason: collision with root package name */
    private static final long f55812e = 0;

    private h7() {
    }

    private Object y0() {
        return f55811d;
    }

    @Override // com.google.common.collect.e5, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public String toString() {
        return ProtectedSandApp.s("\uf4d3");
    }
}
