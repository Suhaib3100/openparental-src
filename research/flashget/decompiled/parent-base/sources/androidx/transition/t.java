package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* compiled from: SidePropagation.java */
/* loaded from: classes3.dex */
public class t extends b1 {

    /* renamed from: d, reason: collision with root package name */
    private float f35203d = 3.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f35204e = 80;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0012, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001d, code lost:
    
        if (androidx.core.view.x1.c0(r6) == 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (androidx.core.view.x1.c0(r6) == 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        r0 = 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int h(android.view.View r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
        /*
            r5 = this;
            int r0 = r5.f35204e
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r2 = 1
            r3 = 3
            r4 = 5
            if (r0 != r1) goto L14
            int r6 = androidx.core.view.x1.c0(r6)
            if (r6 != r2) goto L12
        L10:
            r0 = r4
            goto L20
        L12:
            r0 = r3
            goto L20
        L14:
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r1) goto L20
            int r6 = androidx.core.view.x1.c0(r6)
            if (r6 != r2) goto L10
            goto L12
        L20:
            if (r0 == r3) goto L46
            if (r0 == r4) goto L3e
            r6 = 48
            if (r0 == r6) goto L36
            r6 = 80
            if (r0 == r6) goto L2e
            r6 = 0
            goto L4d
        L2e:
            int r8 = r8 - r12
            int r9 = r9 - r7
            int r6 = java.lang.Math.abs(r9)
            int r6 = r6 + r8
            goto L4d
        L36:
            int r14 = r14 - r8
            int r9 = r9 - r7
            int r6 = java.lang.Math.abs(r9)
            int r6 = r6 + r14
            goto L4d
        L3e:
            int r7 = r7 - r11
            int r10 = r10 - r8
            int r6 = java.lang.Math.abs(r10)
            int r6 = r6 + r7
            goto L4d
        L46:
            int r13 = r13 - r7
            int r10 = r10 - r8
            int r6 = java.lang.Math.abs(r10)
            int r6 = r6 + r13
        L4d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.t.h(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    private int i(ViewGroup viewGroup) {
        int i4 = this.f35204e;
        return (i4 == 3 || i4 == 5 || i4 == 8388611 || i4 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    @Override // androidx.transition.y
    public long c(ViewGroup viewGroup, Transition transition, b0 b0Var, b0 b0Var2) {
        int i4;
        int i5;
        int i6;
        b0 b0Var3 = b0Var;
        if (b0Var3 == null && b0Var2 == null) {
            return 0L;
        }
        Rect K = transition.K();
        if (b0Var2 == null || e(b0Var3) == 0) {
            i4 = -1;
        } else {
            b0Var3 = b0Var2;
            i4 = 1;
        }
        int f4 = f(b0Var3);
        int g4 = g(b0Var3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
        int width = viewGroup.getWidth() + round;
        int height = viewGroup.getHeight() + round2;
        if (K != null) {
            i5 = K.centerX();
            i6 = K.centerY();
        } else {
            i5 = (round + width) / 2;
            i6 = (round2 + height) / 2;
        }
        float h4 = h(viewGroup, f4, g4, i5, i6, round, round2, width, height) / i(viewGroup);
        long J = transition.J();
        if (J < 0) {
            J = 300;
        }
        return Math.round(((J * i4) / this.f35203d) * h4);
    }

    public void j(float f4) {
        if (f4 == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f35203d = f4;
    }

    public void k(int i4) {
        this.f35204e = i4;
    }
}
