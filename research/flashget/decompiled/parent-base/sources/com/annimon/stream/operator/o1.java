package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;
import java.util.Arrays;

/* compiled from: LongSorted.java */
/* loaded from: classes3.dex */
public class o1 extends e.c {

    /* renamed from: e, reason: collision with root package name */
    private final g.c f41716e;

    /* renamed from: f, reason: collision with root package name */
    private int f41717f = 0;

    /* renamed from: g, reason: collision with root package name */
    private long[] f41718g;

    public o1(g.c cVar) {
        this.f41716e = cVar;
    }

    @Override // com.annimon.stream.iterator.e.c
    protected void c() {
        if (!this.f41527d) {
            long[] e4 = com.annimon.stream.internal.c.e(this.f41716e);
            this.f41718g = e4;
            Arrays.sort(e4);
        }
        int i4 = this.f41717f;
        long[] jArr = this.f41718g;
        boolean z4 = i4 < jArr.length;
        this.f41526c = z4;
        if (z4) {
            this.f41717f = i4 + 1;
            this.f41525b = jArr[i4];
        }
    }
}
