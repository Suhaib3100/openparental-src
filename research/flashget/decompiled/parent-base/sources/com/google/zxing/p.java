package com.google.zxing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ResultPoint.java */
/* loaded from: classes6.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final float f63164a;

    /* renamed from: b, reason: collision with root package name */
    private final float f63165b;

    public p(float f4, float f5) {
        this.f63164a = f4;
        this.f63165b = f5;
    }

    private static float a(p pVar, p pVar2, p pVar3) {
        float f4 = pVar2.f63164a;
        float f5 = pVar2.f63165b;
        return ((pVar.f63165b - f5) * (pVar3.f63164a - f4)) - ((pVar.f63164a - f4) * (pVar3.f63165b - f5));
    }

    public static float b(p pVar, p pVar2) {
        return pa.a.a(pVar.f63164a, pVar.f63165b, pVar2.f63164a, pVar2.f63165b);
    }

    public static void e(p[] pVarArr) {
        p pVar;
        p pVar2;
        p pVar3;
        float b5 = b(pVarArr[0], pVarArr[1]);
        float b6 = b(pVarArr[1], pVarArr[2]);
        float b7 = b(pVarArr[0], pVarArr[2]);
        if (b6 >= b5 && b6 >= b7) {
            pVar = pVarArr[0];
            pVar2 = pVarArr[1];
            pVar3 = pVarArr[2];
        } else if (b7 < b6 || b7 < b5) {
            pVar = pVarArr[2];
            pVar2 = pVarArr[0];
            pVar3 = pVarArr[1];
        } else {
            pVar = pVarArr[1];
            pVar2 = pVarArr[0];
            pVar3 = pVarArr[2];
        }
        if (a(pVar2, pVar, pVar3) < 0.0f) {
            p pVar4 = pVar3;
            pVar3 = pVar2;
            pVar2 = pVar4;
        }
        pVarArr[0] = pVar2;
        pVarArr[1] = pVar;
        pVarArr[2] = pVar3;
    }

    public final float c() {
        return this.f63164a;
    }

    public final float d() {
        return this.f63165b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f63164a == pVar.f63164a && this.f63165b == pVar.f63165b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f63165b) + (Float.floatToIntBits(this.f63164a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ఈ\u0001"));
        sb.append(this.f63164a);
        sb.append(',');
        return androidx.compose.animation.b.a(sb, this.f63165b, ')');
    }
}
