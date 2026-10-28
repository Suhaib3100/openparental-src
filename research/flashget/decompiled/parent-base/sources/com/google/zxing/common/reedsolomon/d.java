package com.google.zxing.common.reedsolomon;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ReedSolomonEncoder.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final a f62829a;

    /* renamed from: b, reason: collision with root package name */
    private final List<b> f62830b;

    public d(a aVar) {
        this.f62829a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f62830b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    private b a(int i4) {
        if (i4 >= this.f62830b.size()) {
            b bVar = (b) androidx.appcompat.view.menu.d.a(this.f62830b, 1);
            for (int size = this.f62830b.size(); size <= i4; size++) {
                a aVar = this.f62829a;
                bVar = bVar.i(new b(aVar, new int[]{1, aVar.c(aVar.d() + (size - 1))}));
                this.f62830b.add(bVar);
            }
        }
        return this.f62830b.get(i4);
    }

    public void b(int[] iArr, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ੳ\u0001"));
        }
        int length = iArr.length - i4;
        if (length <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ੲ\u0001"));
        }
        b a5 = a(i4);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] e4 = new b(this.f62829a, iArr2).j(i4, 1).b(a5)[1].e();
        int length2 = i4 - e4.length;
        for (int i5 = 0; i5 < length2; i5++) {
            iArr[length + i5] = 0;
        }
        System.arraycopy(e4, 0, iArr, length + length2, e4.length);
    }
}
