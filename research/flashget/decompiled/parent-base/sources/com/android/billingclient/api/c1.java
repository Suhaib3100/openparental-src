package com.android.billingclient.api;

import java.util.List;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@t6
/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    private final List<t0> f40322a;

    /* renamed from: b, reason: collision with root package name */
    private final List<e1> f40323b;

    c1(List<t0> list, List<e1> list2) {
        this.f40322a = list;
        this.f40323b = list2;
    }

    @androidx.annotation.o0
    public static c1 a(@androidx.annotation.o0 List<t0> list, @androidx.annotation.o0 List<e1> list2) {
        return new c1(list, list2);
    }

    @t6
    @androidx.annotation.o0
    public List<t0> b() {
        return this.f40322a;
    }

    @t6
    @androidx.annotation.o0
    public List<e1> c() {
        return this.f40323b;
    }
}
