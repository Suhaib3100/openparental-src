package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;
import java.util.Arrays;

/* compiled from: DoubleSorted.java */
/* loaded from: classes3.dex */
public class t extends e.a {

    /* renamed from: e, reason: collision with root package name */
    private final g.a f41765e;

    /* renamed from: f, reason: collision with root package name */
    private int f41766f = 0;

    /* renamed from: g, reason: collision with root package name */
    private double[] f41767g;

    public t(g.a aVar) {
        this.f41765e = aVar;
    }

    @Override // com.annimon.stream.iterator.e.a
    protected void c() {
        if (!this.f41521d) {
            double[] b5 = com.annimon.stream.internal.c.b(this.f41765e);
            this.f41767g = b5;
            Arrays.sort(b5);
        }
        int i4 = this.f41766f;
        double[] dArr = this.f41767g;
        boolean z4 = i4 < dArr.length;
        this.f41520c = z4;
        if (z4) {
            this.f41766f = i4 + 1;
            this.f41519b = dArr[i4];
        }
    }
}
