package com.googlecode.mp4parser.authoring.builder;

import com.google.firebase.remoteconfig.p;
import com.googlecode.mp4parser.authoring.h;
import com.googlecode.mp4parser.util.l;
import java.util.Arrays;

/* compiled from: DefaultFragmenterImpl.java */
/* loaded from: classes6.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private double f63389a;

    public c(double d5) {
        this.f63389a = d5;
    }

    @Override // com.googlecode.mp4parser.authoring.builder.d
    public long[] a(h hVar) {
        long[] jArr = {1};
        long[] S2 = hVar.S2();
        long[] z02 = hVar.z0();
        long k4 = hVar.u2().k();
        double d5 = p.f60679p;
        for (int i4 = 0; i4 < S2.length; i4++) {
            double d6 = (S2[i4] / k4) + d5;
            if (d6 < this.f63389a || (z02 != null && Arrays.binarySearch(z02, i4 + 1) < 0)) {
                d5 = d6;
            } else {
                if (i4 > 0) {
                    jArr = l.c(jArr, i4 + 1);
                }
                d5 = p.f60679p;
            }
        }
        if (d5 >= this.f63389a || jArr.length <= 1) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length - 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length - 1);
        return jArr2;
    }
}
