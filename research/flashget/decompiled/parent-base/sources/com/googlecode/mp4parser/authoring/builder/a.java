package com.googlecode.mp4parser.authoring.builder;

import com.googlecode.mp4parser.authoring.h;
import com.googlecode.mp4parser.util.l;
import java.util.Arrays;

/* compiled from: BetterFragmenter.java */
/* loaded from: classes6.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private double f63388a;

    public a(double d5) {
        this.f63388a = d5;
    }

    @Override // com.googlecode.mp4parser.authoring.builder.d
    public long[] a(h hVar) {
        int i4;
        double k4 = hVar.u2().k();
        long j4 = (long) (this.f63388a * k4);
        long[] jArr = new long[0];
        long[] z02 = hVar.z0();
        long[] S2 = hVar.S2();
        long j5 = 2;
        if (z02 == null) {
            long[] jArr2 = {1};
            double d5 = 0.0d;
            for (int i5 = 1; i5 < S2.length; i5++) {
                double d6 = (S2[i5] / k4) + d5;
                if (d6 >= this.f63388a) {
                    if (i5 > 0) {
                        jArr2 = l.c(jArr2, i5 + 1);
                    }
                    d5 = 0.0d;
                } else {
                    d5 = d6;
                }
            }
            if (d5 < this.f63388a && jArr2.length > 1) {
                jArr2[jArr2.length - 1] = (((S2.length + 1) - jArr2[jArr2.length - 2]) / 2) + jArr2[jArr2.length - 2];
            }
            return jArr2;
        }
        int length = z02.length;
        long[] jArr3 = new long[length];
        long duration = hVar.getDuration();
        long j6 = 0;
        int i6 = 0;
        long j7 = 0;
        while (i6 < S2.length) {
            int binarySearch = Arrays.binarySearch(z02, i6 + 1);
            if (binarySearch >= 0) {
                jArr3[binarySearch] = j7;
            }
            j7 += S2[i6];
            i6++;
            j5 = 2;
        }
        int i7 = 0;
        while (true) {
            i4 = length - 1;
            if (i7 >= i4) {
                break;
            }
            long j10 = jArr3[i7];
            int i10 = i7 + 1;
            long j11 = jArr3[i10];
            if (j6 <= j11 && Math.abs(j10 - j6) < Math.abs(j11 - j6)) {
                jArr = l.c(jArr, z02[i7]);
                j6 = jArr3[i7] + j4;
            }
            i7 = i10;
        }
        return duration - jArr3[i4] > j4 / j5 ? l.c(jArr, z02[i4]) : jArr;
    }
}
