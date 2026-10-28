package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;
import java.util.Arrays;

/* compiled from: IntSorted.java */
/* loaded from: classes3.dex */
public class r0 extends e.b {

    /* renamed from: e, reason: collision with root package name */
    private final g.b f41744e;

    /* renamed from: f, reason: collision with root package name */
    private int f41745f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int[] f41746g;

    public r0(g.b bVar) {
        this.f41744e = bVar;
    }

    @Override // com.annimon.stream.iterator.e.b
    protected void c() {
        if (!this.f41524d) {
            int[] c5 = com.annimon.stream.internal.c.c(this.f41744e);
            this.f41746g = c5;
            Arrays.sort(c5);
        }
        int i4 = this.f41745f;
        int[] iArr = this.f41746g;
        boolean z4 = i4 < iArr.length;
        this.f41523c = z4;
        if (z4) {
            this.f41745f = i4 + 1;
            this.f41522b = iArr[i4];
        }
    }
}
