package com.airbnb.lottie.parser;

import android.graphics.Color;
import androidx.collection.x2;
import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GradientColorParser.java */
/* loaded from: classes3.dex */
public class o implements n0<com.airbnb.lottie.model.content.d> {

    /* renamed from: a, reason: collision with root package name */
    private int f39309a;

    public o(int i4) {
        this.f39309a = i4;
    }

    private void b(com.airbnb.lottie.model.content.d dVar, List<Float> list) {
        int i4 = this.f39309a * 4;
        if (list.size() <= i4) {
            return;
        }
        int size = (list.size() - i4) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i5 = 0;
        while (i4 < list.size()) {
            if (i4 % 2 == 0) {
                dArr[i5] = list.get(i4).floatValue();
            } else {
                dArr2[i5] = list.get(i4).floatValue();
                i5++;
            }
            i4++;
        }
        for (int i6 = 0; i6 < dVar.c(); i6++) {
            int i7 = dVar.a()[i6];
            dVar.a()[i6] = Color.argb(c(dVar.b()[i6], dArr, dArr2), Color.red(i7), Color.green(i7), Color.blue(i7));
        }
    }

    @androidx.annotation.g0(from = 0, to = x2.f2460d)
    private int c(double d5, double[] dArr, double[] dArr2) {
        double d6;
        int i4 = 1;
        while (true) {
            if (i4 >= dArr.length) {
                d6 = dArr2[dArr2.length - 1];
                break;
            }
            int i5 = i4 - 1;
            double d7 = dArr[i5];
            double d10 = dArr[i4];
            if (d10 >= d5) {
                d6 = com.airbnb.lottie.utils.i.j(dArr2[i5], dArr2[i4], com.airbnb.lottie.utils.i.b((d5 - d7) / (d10 - d7), com.google.firebase.remoteconfig.p.f60679p, 1.0d));
                break;
            }
            i4++;
        }
        return (int) (d6 * 255.0d);
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.d a(com.airbnb.lottie.parser.moshi.c cVar, float f4) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z4 = cVar.n() == c.b.BEGIN_ARRAY;
        if (z4) {
            cVar.b();
        }
        while (cVar.f()) {
            arrayList.add(Float.valueOf((float) cVar.h()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f39309a = 2;
        }
        if (z4) {
            cVar.d();
        }
        if (this.f39309a == -1) {
            this.f39309a = arrayList.size() / 4;
        }
        int i4 = this.f39309a;
        float[] fArr = new float[i4];
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f39309a * 4; i7++) {
            int i10 = i7 / 4;
            double floatValue = ((Float) arrayList.get(i7)).floatValue();
            int i11 = i7 % 4;
            if (i11 == 0) {
                if (i10 > 0) {
                    float f5 = (float) floatValue;
                    if (fArr[i10 - 1] >= f5) {
                        fArr[i10] = f5 + 0.01f;
                    }
                }
                fArr[i10] = (float) floatValue;
            } else if (i11 == 1) {
                i5 = (int) (floatValue * 255.0d);
            } else if (i11 == 2) {
                i6 = (int) (floatValue * 255.0d);
            } else if (i11 == 3) {
                iArr[i10] = Color.argb(255, i5, i6, (int) (floatValue * 255.0d));
            }
        }
        com.airbnb.lottie.model.content.d dVar = new com.airbnb.lottie.model.content.d(fArr, iArr);
        b(dVar, arrayList);
        return dVar;
    }
}
