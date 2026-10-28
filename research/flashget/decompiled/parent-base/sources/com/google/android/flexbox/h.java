package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FlexboxHelper.java */
/* loaded from: classes5.dex */
class h {

    /* renamed from: f, reason: collision with root package name */
    private static final int f52440f = 10;

    /* renamed from: g, reason: collision with root package name */
    private static final long f52441g = 4294967295L;

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f52442h = false;

    /* renamed from: a, reason: collision with root package name */
    private final d f52443a;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f52444b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    int[] f52445c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    long[] f52446d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private long[] f52447e;

    /* compiled from: FlexboxHelper.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        List<f> f52448a;

        /* renamed from: b, reason: collision with root package name */
        int f52449b;

        a() {
        }

        void a() {
            this.f52448a = null;
            this.f52449b = 0;
        }
    }

    /* compiled from: FlexboxHelper.java */
    private static class b implements Comparable<b> {

        /* renamed from: b, reason: collision with root package name */
        int f52450b;

        /* renamed from: c, reason: collision with root package name */
        int f52451c;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@o0 b bVar) {
            int i4 = this.f52451c;
            int i5 = bVar.f52451c;
            return i4 != i5 ? i4 - i5 : this.f52450b - bVar.f52450b;
        }

        @o0
        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("웇"));
            sb.append(this.f52451c);
            sb.append(ProtectedSandApp.s("웈"));
            return androidx.view.e.a(sb, this.f52450b, '}');
        }

        private b() {
        }
    }

    h(d dVar) {
        this.f52443a = dVar;
    }

    private int A(int i4, FlexItem flexItem, int i5) {
        d dVar = this.f52443a;
        int f4 = dVar.f(i4, dVar.getPaddingLeft() + this.f52443a.getPaddingRight() + flexItem.M2() + flexItem.s3() + i5, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(f4);
        return size > flexItem.getMaxWidth() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(f4)) : size < flexItem.G() ? View.MeasureSpec.makeMeasureSpec(flexItem.G(), View.MeasureSpec.getMode(f4)) : f4;
    }

    private int B(FlexItem flexItem, boolean z4) {
        return z4 ? flexItem.I2() : flexItem.s3();
    }

    private int C(FlexItem flexItem, boolean z4) {
        return z4 ? flexItem.s3() : flexItem.I2();
    }

    private int D(FlexItem flexItem, boolean z4) {
        return z4 ? flexItem.u0() : flexItem.M2();
    }

    private int E(FlexItem flexItem, boolean z4) {
        return z4 ? flexItem.M2() : flexItem.u0();
    }

    private int F(FlexItem flexItem, boolean z4) {
        return z4 ? flexItem.getHeight() : flexItem.getWidth();
    }

    private int G(FlexItem flexItem, boolean z4) {
        return z4 ? flexItem.getWidth() : flexItem.getHeight();
    }

    private int H(boolean z4) {
        return z4 ? this.f52443a.getPaddingBottom() : this.f52443a.getPaddingEnd();
    }

    private int I(boolean z4) {
        return z4 ? this.f52443a.getPaddingEnd() : this.f52443a.getPaddingBottom();
    }

    private int J(boolean z4) {
        return z4 ? this.f52443a.getPaddingTop() : this.f52443a.getPaddingStart();
    }

    private int K(boolean z4) {
        return z4 ? this.f52443a.getPaddingStart() : this.f52443a.getPaddingTop();
    }

    private int L(View view, boolean z4) {
        return z4 ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private int M(View view, boolean z4) {
        return z4 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private boolean N(int i4, int i5, f fVar) {
        return i4 == i5 - 1 && fVar.d() != 0;
    }

    private boolean P(View view, int i4, int i5, int i6, int i7, FlexItem flexItem, int i10, int i11, int i12) {
        if (this.f52443a.q() == 0) {
            return false;
        }
        if (flexItem.y1()) {
            return true;
        }
        if (i4 == 0) {
            return false;
        }
        int d5 = this.f52443a.d();
        if (d5 != -1 && d5 <= i12 + 1) {
            return false;
        }
        int x4 = this.f52443a.x(view, i10, i11);
        if (x4 > 0) {
            i7 += x4;
        }
        return i5 < i6 + i7;
    }

    private void T(int i4, int i5, f fVar, int i6, int i7, boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13 = fVar.f52423e;
        float f4 = fVar.f52429k;
        float f5 = 0.0f;
        if (f4 <= 0.0f || i6 > i13) {
            return;
        }
        float f6 = (i13 - i6) / f4;
        fVar.f52423e = i7 + fVar.f52424f;
        if (!z4) {
            fVar.f52425g = Integer.MIN_VALUE;
        }
        int i14 = 0;
        boolean z5 = false;
        int i15 = 0;
        float f7 = 0.0f;
        while (i14 < fVar.f52426h) {
            int i16 = fVar.f52433o + i14;
            View t4 = this.f52443a.t(i16);
            if (t4 == null || t4.getVisibility() == 8) {
                i10 = i13;
                i11 = i14;
            } else {
                FlexItem flexItem = (FlexItem) t4.getLayoutParams();
                int c5 = this.f52443a.c();
                if (c5 == 0 || c5 == 1) {
                    i10 = i13;
                    int i17 = i14;
                    int measuredWidth = t4.getMeasuredWidth();
                    long[] jArr = this.f52447e;
                    if (jArr != null) {
                        measuredWidth = y(jArr[i16]);
                    }
                    int measuredHeight = t4.getMeasuredHeight();
                    long[] jArr2 = this.f52447e;
                    if (jArr2 != null) {
                        measuredHeight = x(jArr2[i16]);
                    }
                    if (this.f52444b[i16] || flexItem.m() <= 0.0f) {
                        i11 = i17;
                    } else {
                        float m4 = measuredWidth - (flexItem.m() * f6);
                        i11 = i17;
                        if (i11 == fVar.f52426h - 1) {
                            m4 += f7;
                            f7 = 0.0f;
                        }
                        int round = Math.round(m4);
                        if (round < flexItem.G()) {
                            round = flexItem.G();
                            this.f52444b[i16] = true;
                            fVar.f52429k -= flexItem.m();
                            z5 = true;
                        } else {
                            float f10 = (m4 - round) + f7;
                            double d5 = f10;
                            if (d5 > 1.0d) {
                                round++;
                                f10 -= 1.0f;
                            } else if (d5 < -1.0d) {
                                round--;
                                f10 += 1.0f;
                            }
                            f7 = f10;
                        }
                        int z6 = z(i5, flexItem, fVar.f52431m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        t4.measure(makeMeasureSpec, z6);
                        int measuredWidth2 = t4.getMeasuredWidth();
                        int measuredHeight2 = t4.getMeasuredHeight();
                        Z(i16, makeMeasureSpec, z6, t4);
                        this.f52443a.v(i16, t4);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i15, measuredHeight + flexItem.u0() + flexItem.I2() + this.f52443a.p(t4));
                    fVar.f52423e = measuredWidth + flexItem.M2() + flexItem.s3() + fVar.f52423e;
                    i12 = max;
                } else {
                    int measuredHeight3 = t4.getMeasuredHeight();
                    long[] jArr3 = this.f52447e;
                    if (jArr3 != null) {
                        measuredHeight3 = x(jArr3[i16]);
                    }
                    int measuredWidth3 = t4.getMeasuredWidth();
                    long[] jArr4 = this.f52447e;
                    if (jArr4 != null) {
                        measuredWidth3 = y(jArr4[i16]);
                    }
                    if (this.f52444b[i16] || flexItem.m() <= f5) {
                        i10 = i13;
                        i11 = i14;
                    } else {
                        float m5 = measuredHeight3 - (flexItem.m() * f6);
                        if (i14 == fVar.f52426h - 1) {
                            m5 += f7;
                            f7 = f5;
                        }
                        int round2 = Math.round(m5);
                        if (round2 < flexItem.u3()) {
                            round2 = flexItem.u3();
                            this.f52444b[i16] = true;
                            fVar.f52429k -= flexItem.m();
                            i10 = i13;
                            i11 = i14;
                            z5 = true;
                        } else {
                            float f11 = (m5 - round2) + f7;
                            i10 = i13;
                            i11 = i14;
                            double d6 = f11;
                            if (d6 > 1.0d) {
                                round2++;
                                f11 -= 1.0f;
                            } else if (d6 < -1.0d) {
                                round2--;
                                f11 += 1.0f;
                            }
                            f7 = f11;
                        }
                        int A = A(i4, flexItem, fVar.f52431m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        t4.measure(A, makeMeasureSpec2);
                        measuredWidth3 = t4.getMeasuredWidth();
                        int measuredHeight4 = t4.getMeasuredHeight();
                        Z(i16, A, makeMeasureSpec2, t4);
                        this.f52443a.v(i16, t4);
                        measuredHeight3 = measuredHeight4;
                    }
                    i12 = Math.max(i15, measuredWidth3 + flexItem.M2() + flexItem.s3() + this.f52443a.p(t4));
                    fVar.f52423e = measuredHeight3 + flexItem.u0() + flexItem.I2() + fVar.f52423e;
                }
                fVar.f52425g = Math.max(fVar.f52425g, i12);
                i15 = i12;
            }
            i14 = i11 + 1;
            i13 = i10;
            f5 = 0.0f;
        }
        int i18 = i13;
        if (!z5 || i18 == fVar.f52423e) {
            return;
        }
        T(i4, i5, fVar, i6, i7, true);
    }

    private int[] U(int i4, List<b> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i4];
        int i5 = 0;
        for (b bVar : list) {
            int i6 = bVar.f52450b;
            iArr[i5] = i6;
            sparseIntArray.append(i6, bVar.f52451c);
            i5++;
        }
        return iArr;
    }

    private void V(View view, int i4, int i5) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i4 - flexItem.M2()) - flexItem.s3()) - this.f52443a.p(view), flexItem.G()), flexItem.getMaxWidth());
        long[] jArr = this.f52447e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? x(jArr[i5]) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        Z(i5, makeMeasureSpec2, makeMeasureSpec, view);
        this.f52443a.v(i5, view);
    }

    private void W(View view, int i4, int i5) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i4 - flexItem.u0()) - flexItem.I2()) - this.f52443a.p(view), flexItem.u3()), flexItem.getMaxHeight());
        long[] jArr = this.f52447e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? y(jArr[i5]) : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        Z(i5, makeMeasureSpec, makeMeasureSpec2, view);
        this.f52443a.v(i5, view);
    }

    private void Z(int i4, int i5, int i6, View view) {
        long[] jArr = this.f52446d;
        if (jArr != null) {
            jArr[i4] = S(i5, i6);
        }
        long[] jArr2 = this.f52447e;
        if (jArr2 != null) {
            jArr2[i4] = S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void a(List<f> list, f fVar, int i4, int i5) {
        fVar.f52431m = i5;
        this.f52443a.r(fVar);
        fVar.f52434p = i4;
        list.add(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.G()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.G()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.getMaxWidth()
            if (r1 <= r3) goto L26
            int r1 = r0.getMaxWidth()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.u3()
            if (r2 >= r5) goto L32
            int r2 = r0.u3()
            goto L3e
        L32:
            int r5 = r0.getMaxHeight()
            if (r2 <= r5) goto L3d
            int r2 = r0.getMaxHeight()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.Z(r8, r1, r0, r7)
            com.google.android.flexbox.d r0 = r6.f52443a
            r0.v(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.h.i(android.view.View, int):void");
    }

    private List<f> k(List<f> list, int i4, int i5) {
        int i6 = (i4 - i5) / 2;
        ArrayList arrayList = new ArrayList();
        f fVar = new f();
        fVar.f52425g = i6;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (i7 == 0) {
                arrayList.add(fVar);
            }
            arrayList.add(list.get(i7));
            if (i7 == list.size() - 1) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    @o0
    private List<b> l(int i4) {
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            FlexItem flexItem = (FlexItem) this.f52443a.h(i5).getLayoutParams();
            b bVar = new b();
            bVar.f52451c = flexItem.getOrder();
            bVar.f52450b = i5;
            arrayList.add(bVar);
        }
        return arrayList;
    }

    private void r(int i4) {
        boolean[] zArr = this.f52444b;
        if (zArr == null) {
            this.f52444b = new boolean[Math.max(i4, 10)];
        } else if (zArr.length < i4) {
            this.f52444b = new boolean[Math.max(zArr.length * 2, i4)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void v(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int G = flexItem.G();
        int u32 = flexItem.u3();
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
        int minimumHeight = buttonDrawable != null ? buttonDrawable.getMinimumHeight() : 0;
        if (G == -1) {
            G = minimumWidth;
        }
        flexItem.H2(G);
        if (u32 == -1) {
            u32 = minimumHeight;
        }
        flexItem.U0(u32);
    }

    private void w(int i4, int i5, f fVar, int i6, int i7, boolean z4) {
        int i10;
        int i11;
        int i12;
        double d5;
        int i13;
        double d6;
        float f4 = fVar.f52428j;
        float f5 = 0.0f;
        if (f4 <= 0.0f || i6 < (i10 = fVar.f52423e)) {
            return;
        }
        float f6 = (i6 - i10) / f4;
        fVar.f52423e = i7 + fVar.f52424f;
        if (!z4) {
            fVar.f52425g = Integer.MIN_VALUE;
        }
        int i14 = 0;
        boolean z5 = false;
        int i15 = 0;
        float f7 = 0.0f;
        while (i14 < fVar.f52426h) {
            int i16 = fVar.f52433o + i14;
            View t4 = this.f52443a.t(i16);
            if (t4 == null || t4.getVisibility() == 8) {
                i11 = i10;
            } else {
                FlexItem flexItem = (FlexItem) t4.getLayoutParams();
                int c5 = this.f52443a.c();
                if (c5 == 0 || c5 == 1) {
                    int i17 = i10;
                    int measuredWidth = t4.getMeasuredWidth();
                    long[] jArr = this.f52447e;
                    if (jArr != null) {
                        measuredWidth = y(jArr[i16]);
                    }
                    int measuredHeight = t4.getMeasuredHeight();
                    long[] jArr2 = this.f52447e;
                    i11 = i17;
                    if (jArr2 != null) {
                        measuredHeight = x(jArr2[i16]);
                    }
                    if (!this.f52444b[i16] && flexItem.d1() > 0.0f) {
                        float d12 = (flexItem.d1() * f6) + measuredWidth;
                        if (i14 == fVar.f52426h - 1) {
                            d12 += f7;
                            f7 = 0.0f;
                        }
                        int round = Math.round(d12);
                        if (round > flexItem.getMaxWidth()) {
                            round = flexItem.getMaxWidth();
                            this.f52444b[i16] = true;
                            fVar.f52428j -= flexItem.d1();
                            z5 = true;
                        } else {
                            float f10 = (d12 - round) + f7;
                            double d7 = f10;
                            if (d7 > 1.0d) {
                                round++;
                                d5 = d7 - 1.0d;
                            } else {
                                if (d7 < -1.0d) {
                                    round--;
                                    d5 = d7 + 1.0d;
                                }
                                f7 = f10;
                            }
                            f10 = (float) d5;
                            f7 = f10;
                        }
                        int z6 = z(i5, flexItem, fVar.f52431m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        t4.measure(makeMeasureSpec, z6);
                        int measuredWidth2 = t4.getMeasuredWidth();
                        int measuredHeight2 = t4.getMeasuredHeight();
                        Z(i16, makeMeasureSpec, z6, t4);
                        this.f52443a.v(i16, t4);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i15, measuredHeight + flexItem.u0() + flexItem.I2() + this.f52443a.p(t4));
                    fVar.f52423e = measuredWidth + flexItem.M2() + flexItem.s3() + fVar.f52423e;
                    i12 = max;
                } else {
                    int measuredHeight3 = t4.getMeasuredHeight();
                    long[] jArr3 = this.f52447e;
                    if (jArr3 != null) {
                        measuredHeight3 = x(jArr3[i16]);
                    }
                    int measuredWidth3 = t4.getMeasuredWidth();
                    long[] jArr4 = this.f52447e;
                    if (jArr4 != null) {
                        measuredWidth3 = y(jArr4[i16]);
                    }
                    if (this.f52444b[i16] || flexItem.d1() <= f5) {
                        i13 = i10;
                    } else {
                        float d13 = (flexItem.d1() * f6) + measuredHeight3;
                        if (i14 == fVar.f52426h - 1) {
                            d13 += f7;
                            f7 = f5;
                        }
                        int round2 = Math.round(d13);
                        if (round2 > flexItem.getMaxHeight()) {
                            round2 = flexItem.getMaxHeight();
                            this.f52444b[i16] = true;
                            fVar.f52428j -= flexItem.d1();
                            i13 = i10;
                            z5 = true;
                        } else {
                            float f11 = (d13 - round2) + f7;
                            i13 = i10;
                            double d10 = f11;
                            if (d10 > 1.0d) {
                                round2++;
                                d6 = d10 - 1.0d;
                            } else if (d10 < -1.0d) {
                                round2--;
                                d6 = d10 + 1.0d;
                            } else {
                                f7 = f11;
                            }
                            f7 = (float) d6;
                        }
                        int A = A(i4, flexItem, fVar.f52431m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        t4.measure(A, makeMeasureSpec2);
                        measuredWidth3 = t4.getMeasuredWidth();
                        int measuredHeight4 = t4.getMeasuredHeight();
                        Z(i16, A, makeMeasureSpec2, t4);
                        this.f52443a.v(i16, t4);
                        measuredHeight3 = measuredHeight4;
                    }
                    i12 = Math.max(i15, measuredWidth3 + flexItem.M2() + flexItem.s3() + this.f52443a.p(t4));
                    fVar.f52423e = measuredHeight3 + flexItem.u0() + flexItem.I2() + fVar.f52423e;
                    i11 = i13;
                }
                fVar.f52425g = Math.max(fVar.f52425g, i12);
                i15 = i12;
            }
            i14++;
            i10 = i11;
            f5 = 0.0f;
        }
        int i18 = i10;
        if (!z5 || i18 == fVar.f52423e) {
            return;
        }
        w(i4, i5, fVar, i6, i7, true);
    }

    private int z(int i4, FlexItem flexItem, int i5) {
        d dVar = this.f52443a;
        int j4 = dVar.j(i4, dVar.getPaddingTop() + this.f52443a.getPaddingBottom() + flexItem.u0() + flexItem.I2() + i5, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(j4);
        return size > flexItem.getMaxHeight() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), View.MeasureSpec.getMode(j4)) : size < flexItem.u3() ? View.MeasureSpec.makeMeasureSpec(flexItem.u3(), View.MeasureSpec.getMode(j4)) : j4;
    }

    boolean O(SparseIntArray sparseIntArray) {
        int a5 = this.f52443a.a();
        if (sparseIntArray.size() != a5) {
            return true;
        }
        for (int i4 = 0; i4 < a5; i4++) {
            View h4 = this.f52443a.h(i4);
            if (h4 != null && ((FlexItem) h4.getLayoutParams()).getOrder() != sparseIntArray.get(i4)) {
                return true;
            }
        }
        return false;
    }

    void Q(View view, f fVar, int i4, int i5, int i6, int i7) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int u4 = this.f52443a.u();
        if (flexItem.l() != -1) {
            u4 = flexItem.l();
        }
        int i10 = fVar.f52425g;
        if (u4 != 0) {
            if (u4 == 1) {
                if (this.f52443a.q() != 2) {
                    int i11 = i5 + i10;
                    view.layout(i4, (i11 - view.getMeasuredHeight()) - flexItem.I2(), i6, i11 - flexItem.I2());
                    return;
                } else {
                    view.layout(i4, view.getMeasuredHeight() + (i5 - i10) + flexItem.u0(), i6, view.getMeasuredHeight() + (i7 - i10) + flexItem.u0());
                    return;
                }
            }
            if (u4 == 2) {
                int measuredHeight = (((i10 - view.getMeasuredHeight()) + flexItem.u0()) - flexItem.I2()) / 2;
                if (this.f52443a.q() != 2) {
                    int i12 = i5 + measuredHeight;
                    view.layout(i4, i12, i6, view.getMeasuredHeight() + i12);
                    return;
                } else {
                    int i13 = i5 - measuredHeight;
                    view.layout(i4, i13, i6, view.getMeasuredHeight() + i13);
                    return;
                }
            }
            if (u4 == 3) {
                if (this.f52443a.q() != 2) {
                    int max = Math.max(fVar.f52430l - view.getBaseline(), flexItem.u0());
                    view.layout(i4, i5 + max, i6, i7 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (fVar.f52430l - view.getMeasuredHeight()), flexItem.I2());
                    view.layout(i4, i5 - max2, i6, i7 - max2);
                    return;
                }
            }
            if (u4 != 4) {
                return;
            }
        }
        if (this.f52443a.q() != 2) {
            view.layout(i4, i5 + flexItem.u0(), i6, i7 + flexItem.u0());
        } else {
            view.layout(i4, i5 - flexItem.I2(), i6, i7 - flexItem.I2());
        }
    }

    void R(View view, f fVar, boolean z4, int i4, int i5, int i6, int i7) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int u4 = this.f52443a.u();
        if (flexItem.l() != -1) {
            u4 = flexItem.l();
        }
        int i10 = fVar.f52425g;
        if (u4 != 0) {
            if (u4 == 1) {
                if (!z4) {
                    view.layout(((i4 + i10) - view.getMeasuredWidth()) - flexItem.s3(), i5, ((i6 + i10) - view.getMeasuredWidth()) - flexItem.s3(), i7);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i4 - i10) + flexItem.M2(), i5, view.getMeasuredWidth() + (i6 - i10) + flexItem.M2(), i7);
                return;
            }
            if (u4 == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i10 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z4) {
                    view.layout(i4 - marginStart, i5, i6 - marginStart, i7);
                    return;
                } else {
                    view.layout(i4 + marginStart, i5, i6 + marginStart, i7);
                    return;
                }
            }
            if (u4 != 3 && u4 != 4) {
                return;
            }
        }
        if (z4) {
            view.layout(i4 - flexItem.s3(), i5, i6 - flexItem.s3(), i7);
        } else {
            view.layout(i4 + flexItem.M2(), i5, i6 + flexItem.M2(), i7);
        }
    }

    @m1
    long S(int i4, int i5) {
        return (i4 & f52441g) | (i5 << 32);
    }

    void X() {
        Y(0);
    }

    void Y(int i4) {
        View t4;
        if (i4 >= this.f52443a.a()) {
            return;
        }
        int c5 = this.f52443a.c();
        int u4 = this.f52443a.u();
        String s4 = ProtectedSandApp.s("웉");
        if (u4 != 4) {
            for (f fVar : this.f52443a.i()) {
                for (Integer num : fVar.f52432n) {
                    View t5 = this.f52443a.t(num.intValue());
                    if (c5 == 0 || c5 == 1) {
                        W(t5, fVar.f52425g, num.intValue());
                    } else {
                        if (c5 != 2 && c5 != 3) {
                            throw new IllegalArgumentException(android.support.v4.media.a.a(s4, c5));
                        }
                        V(t5, fVar.f52425g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f52445c;
        List<f> i5 = this.f52443a.i();
        int size = i5.size();
        for (int i6 = iArr != null ? iArr[i4] : 0; i6 < size; i6++) {
            f fVar2 = i5.get(i6);
            int i7 = fVar2.f52426h;
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = fVar2.f52433o + i10;
                if (i10 < this.f52443a.a() && (t4 = this.f52443a.t(i11)) != null && t4.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) t4.getLayoutParams();
                    if (flexItem.l() == -1 || flexItem.l() == 4) {
                        if (c5 == 0 || c5 == 1) {
                            W(t4, fVar2.f52425g, i11);
                        } else {
                            if (c5 != 2 && c5 != 3) {
                                throw new IllegalArgumentException(android.support.v4.media.a.a(s4, c5));
                            }
                            V(t4, fVar2.f52425g, i11);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(a aVar, int i4, int i5, int i6, int i7, int i10, @q0 List<f> list) {
        int i11;
        a aVar2;
        int i12;
        int i13;
        int i14;
        List<f> list2;
        int i15;
        View view;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = i4;
        int i25 = i5;
        int i26 = i10;
        boolean A = this.f52443a.A();
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        List<f> arrayList = list == null ? new ArrayList() : list;
        aVar.f52448a = arrayList;
        int i27 = i26 == -1 ? 1 : 0;
        int K = K(A);
        int I = I(A);
        int J = J(A);
        int H = H(A);
        f fVar = new f();
        int i28 = i7;
        fVar.f52433o = i28;
        int i29 = I + K;
        fVar.f52423e = i29;
        int a5 = this.f52443a.a();
        int i30 = i27;
        int i31 = Integer.MIN_VALUE;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        while (true) {
            if (i28 >= a5) {
                i11 = i33;
                aVar2 = aVar;
                break;
            }
            View t4 = this.f52443a.t(i28);
            if (t4 != null) {
                if (t4.getVisibility() != 8) {
                    if (t4 instanceof CompoundButton) {
                        v((CompoundButton) t4);
                    }
                    FlexItem flexItem = (FlexItem) t4.getLayoutParams();
                    int i35 = a5;
                    if (flexItem.l() == 4) {
                        fVar.f52432n.add(Integer.valueOf(i28));
                    }
                    int G = G(flexItem, A);
                    if (flexItem.k1() != -1.0f && mode == 1073741824) {
                        G = Math.round(size * flexItem.k1());
                    }
                    if (A) {
                        int f4 = this.f52443a.f(i24, i29 + E(flexItem, true) + C(flexItem, true), G);
                        i12 = size;
                        i13 = mode;
                        int j4 = this.f52443a.j(i25, J + H + D(flexItem, true) + B(flexItem, true) + i32, F(flexItem, true));
                        t4.measure(f4, j4);
                        Z(i28, f4, j4, t4);
                        i14 = f4;
                    } else {
                        i12 = size;
                        i13 = mode;
                        int f5 = this.f52443a.f(i25, J + H + D(flexItem, false) + B(flexItem, false) + i32, F(flexItem, false));
                        int j5 = this.f52443a.j(i24, E(flexItem, false) + i29 + C(flexItem, false), G);
                        t4.measure(f5, j5);
                        Z(i28, f5, j5, t4);
                        i14 = j5;
                    }
                    this.f52443a.v(i28, t4);
                    i(t4, i28);
                    i33 = View.combineMeasuredStates(i33, t4.getMeasuredState());
                    int i36 = i32;
                    int i37 = i29;
                    f fVar2 = fVar;
                    int i38 = i28;
                    list2 = arrayList;
                    int i39 = i14;
                    if (P(t4, i13, i12, fVar.f52423e, C(flexItem, A) + M(t4, A) + E(flexItem, A), flexItem, i38, i34, arrayList.size())) {
                        i28 = i38;
                        if (fVar2.d() > 0) {
                            a(list2, fVar2, i28 > 0 ? i28 - 1 : 0, i36);
                            i32 = fVar2.f52425g + i36;
                        } else {
                            i32 = i36;
                        }
                        if (!A) {
                            i15 = i5;
                            view = t4;
                            i16 = -1;
                            if (flexItem.getWidth() == -1) {
                                d dVar = this.f52443a;
                                view.measure(dVar.f(i15, dVar.getPaddingLeft() + this.f52443a.getPaddingRight() + flexItem.M2() + flexItem.s3() + i32, flexItem.getWidth()), i39);
                                i(view, i28);
                            }
                        } else if (flexItem.getHeight() == -1) {
                            d dVar2 = this.f52443a;
                            i15 = i5;
                            i16 = -1;
                            view = t4;
                            view.measure(i39, dVar2.j(i15, dVar2.getPaddingTop() + this.f52443a.getPaddingBottom() + flexItem.u0() + flexItem.I2() + i32, flexItem.getHeight()));
                            i(view, i28);
                        } else {
                            i15 = i5;
                            view = t4;
                            i16 = -1;
                        }
                        fVar = new f();
                        i18 = 1;
                        fVar.f52426h = 1;
                        i17 = i37;
                        fVar.f52423e = i17;
                        fVar.f52433o = i28;
                        i20 = Integer.MIN_VALUE;
                        i19 = 0;
                    } else {
                        i15 = i5;
                        i28 = i38;
                        view = t4;
                        i16 = -1;
                        fVar = fVar2;
                        i17 = i37;
                        i18 = 1;
                        fVar.f52426h++;
                        i19 = i34 + 1;
                        i32 = i36;
                        i20 = i31;
                    }
                    fVar.f52435q = (fVar.f52435q ? 1 : 0) | (flexItem.d1() != 0.0f ? i18 : 0);
                    fVar.f52436r = (fVar.f52436r ? 1 : 0) | (flexItem.m() != 0.0f ? i18 : 0);
                    int[] iArr = this.f52445c;
                    if (iArr != null) {
                        iArr[i28] = list2.size();
                    }
                    fVar.f52423e = M(view, A) + E(flexItem, A) + C(flexItem, A) + fVar.f52423e;
                    fVar.f52428j += flexItem.d1();
                    fVar.f52429k += flexItem.m();
                    this.f52443a.b(view, i28, i19, fVar);
                    int max = Math.max(i20, L(view, A) + D(flexItem, A) + B(flexItem, A) + this.f52443a.p(view));
                    fVar.f52425g = Math.max(fVar.f52425g, max);
                    if (A) {
                        if (this.f52443a.q() != 2) {
                            fVar.f52430l = Math.max(fVar.f52430l, view.getBaseline() + flexItem.u0());
                        } else {
                            fVar.f52430l = Math.max(fVar.f52430l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.I2());
                        }
                    }
                    i21 = i35;
                    if (N(i28, i21, fVar)) {
                        a(list2, fVar, i28, i32);
                        i32 += fVar.f52425g;
                    }
                    i22 = i10;
                    if (i22 == i16 || list2.size() <= 0 || ((f) androidx.appcompat.view.menu.d.a(list2, i18)).f52434p < i22 || i28 < i22 || i30 != 0) {
                        i23 = i6;
                    } else {
                        i32 = -fVar.a();
                        i23 = i6;
                        i30 = i18;
                    }
                    if (i32 > i23 && i30 != 0) {
                        aVar2 = aVar;
                        i11 = i33;
                        break;
                    }
                    i34 = i19;
                    i31 = max;
                    i28++;
                    i24 = i4;
                    a5 = i21;
                    i25 = i15;
                    i29 = i17;
                    arrayList = list2;
                    size = i12;
                    mode = i13;
                    i26 = i22;
                } else {
                    fVar.f52427i++;
                    fVar.f52426h++;
                    if (N(i28, a5, fVar)) {
                        a(arrayList, fVar, i28, i32);
                    }
                }
            } else if (N(i28, a5, fVar)) {
                a(arrayList, fVar, i28, i32);
            }
            i12 = size;
            i13 = mode;
            i15 = i25;
            i22 = i26;
            i17 = i29;
            list2 = arrayList;
            i21 = a5;
            i28++;
            i24 = i4;
            a5 = i21;
            i25 = i15;
            i29 = i17;
            arrayList = list2;
            size = i12;
            mode = i13;
            i26 = i22;
        }
        aVar2.f52449b = i11;
    }

    void c(a aVar, int i4, int i5) {
        b(aVar, i4, i5, Integer.MAX_VALUE, 0, -1, null);
    }

    void d(a aVar, int i4, int i5, int i6, int i7, @q0 List<f> list) {
        b(aVar, i4, i5, i6, i7, -1, list);
    }

    void e(a aVar, int i4, int i5, int i6, int i7, List<f> list) {
        b(aVar, i4, i5, i6, 0, i7, list);
    }

    void f(a aVar, int i4, int i5) {
        b(aVar, i5, i4, Integer.MAX_VALUE, 0, -1, null);
    }

    void g(a aVar, int i4, int i5, int i6, int i7, @q0 List<f> list) {
        b(aVar, i5, i4, i6, i7, -1, list);
    }

    void h(a aVar, int i4, int i5, int i6, int i7, List<f> list) {
        b(aVar, i5, i4, i6, 0, i7, list);
    }

    void j(List<f> list, int i4) {
        int i5 = this.f52445c[i4];
        if (i5 == -1) {
            i5 = 0;
        }
        if (list.size() > i5) {
            list.subList(i5, list.size()).clear();
        }
        int[] iArr = this.f52445c;
        int length = iArr.length - 1;
        if (i4 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i4, length, -1);
        }
        long[] jArr = this.f52446d;
        int length2 = jArr.length - 1;
        if (i4 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i4, length2, 0L);
        }
    }

    int[] m(SparseIntArray sparseIntArray) {
        int a5 = this.f52443a.a();
        return U(a5, l(a5), sparseIntArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] n(View view, int i4, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int a5 = this.f52443a.a();
        List<b> l4 = l(a5);
        b bVar = new b();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            bVar.f52451c = 1;
        } else {
            bVar.f52451c = ((FlexItem) layoutParams).getOrder();
        }
        if (i4 == -1 || i4 == a5) {
            bVar.f52450b = a5;
        } else if (i4 < this.f52443a.a()) {
            bVar.f52450b = i4;
            while (i4 < a5) {
                l4.get(i4).f52450b++;
                i4++;
            }
        } else {
            bVar.f52450b = a5;
        }
        l4.add(bVar);
        return U(a5 + 1, l4, sparseIntArray);
    }

    void o(int i4, int i5, int i6) {
        int i7;
        int i10;
        int c5 = this.f52443a.c();
        if (c5 == 0 || c5 == 1) {
            int mode = View.MeasureSpec.getMode(i5);
            int size = View.MeasureSpec.getSize(i5);
            i7 = mode;
            i10 = size;
        } else {
            if (c5 != 2 && c5 != 3) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("웉"), c5));
            }
            i7 = View.MeasureSpec.getMode(i4);
            i10 = View.MeasureSpec.getSize(i4);
        }
        List<f> i11 = this.f52443a.i();
        if (i7 == 1073741824) {
            int w4 = this.f52443a.w() + i6;
            int i12 = 0;
            if (i11.size() == 1) {
                i11.get(0).f52425g = i10 - i6;
                return;
            }
            if (i11.size() >= 2) {
                int k4 = this.f52443a.k();
                if (k4 == 1) {
                    int i13 = i10 - w4;
                    f fVar = new f();
                    fVar.f52425g = i13;
                    i11.add(0, fVar);
                    return;
                }
                if (k4 == 2) {
                    this.f52443a.z(k(i11, i10, w4));
                    return;
                }
                if (k4 == 3) {
                    if (w4 >= i10) {
                        return;
                    }
                    float size2 = (i10 - w4) / (i11.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = i11.size();
                    float f4 = 0.0f;
                    while (i12 < size3) {
                        arrayList.add(i11.get(i12));
                        if (i12 != i11.size() - 1) {
                            f fVar2 = new f();
                            if (i12 == i11.size() - 2) {
                                fVar2.f52425g = Math.round(f4 + size2);
                                f4 = 0.0f;
                            } else {
                                fVar2.f52425g = Math.round(size2);
                            }
                            int i14 = fVar2.f52425g;
                            float f5 = (size2 - i14) + f4;
                            if (f5 > 1.0f) {
                                fVar2.f52425g = i14 + 1;
                                f5 -= 1.0f;
                            } else if (f5 < -1.0f) {
                                fVar2.f52425g = i14 - 1;
                                f5 += 1.0f;
                            }
                            f4 = f5;
                            arrayList.add(fVar2);
                        }
                        i12++;
                    }
                    this.f52443a.z(arrayList);
                    return;
                }
                if (k4 == 4) {
                    if (w4 >= i10) {
                        this.f52443a.z(k(i11, i10, w4));
                        return;
                    }
                    int size4 = (i10 - w4) / (i11.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    f fVar3 = new f();
                    fVar3.f52425g = size4;
                    for (f fVar4 : i11) {
                        arrayList2.add(fVar3);
                        arrayList2.add(fVar4);
                        arrayList2.add(fVar3);
                    }
                    this.f52443a.z(arrayList2);
                    return;
                }
                if (k4 == 5 && w4 < i10) {
                    float size5 = (i10 - w4) / i11.size();
                    int size6 = i11.size();
                    float f6 = 0.0f;
                    while (i12 < size6) {
                        f fVar5 = i11.get(i12);
                        float f7 = fVar5.f52425g + size5;
                        if (i12 == i11.size() - 1) {
                            f7 += f6;
                            f6 = 0.0f;
                        }
                        int round = Math.round(f7);
                        float f10 = (f7 - round) + f6;
                        if (f10 > 1.0f) {
                            round++;
                            f10 -= 1.0f;
                        } else if (f10 < -1.0f) {
                            round--;
                            f10 += 1.0f;
                        }
                        f6 = f10;
                        fVar5.f52425g = round;
                        i12++;
                    }
                }
            }
        }
    }

    void p(int i4, int i5) {
        q(i4, i5, 0);
    }

    void q(int i4, int i5, int i6) {
        int size;
        int paddingLeft;
        int paddingRight;
        r(this.f52443a.a());
        if (i6 >= this.f52443a.a()) {
            return;
        }
        int c5 = this.f52443a.c();
        int c6 = this.f52443a.c();
        if (c6 == 0 || c6 == 1) {
            int mode = View.MeasureSpec.getMode(i4);
            size = View.MeasureSpec.getSize(i4);
            int e4 = this.f52443a.e();
            if (mode != 1073741824) {
                size = Math.min(e4, size);
            }
            paddingLeft = this.f52443a.getPaddingLeft();
            paddingRight = this.f52443a.getPaddingRight();
        } else {
            if (c6 != 2 && c6 != 3) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("웉"), c5));
            }
            int mode2 = View.MeasureSpec.getMode(i5);
            size = View.MeasureSpec.getSize(i5);
            if (mode2 != 1073741824) {
                size = this.f52443a.e();
            }
            paddingLeft = this.f52443a.getPaddingTop();
            paddingRight = this.f52443a.getPaddingBottom();
        }
        int i7 = paddingLeft + paddingRight;
        int[] iArr = this.f52445c;
        List<f> i10 = this.f52443a.i();
        int size2 = i10.size();
        for (int i11 = iArr != null ? iArr[i6] : 0; i11 < size2; i11++) {
            f fVar = i10.get(i11);
            int i12 = fVar.f52423e;
            if (i12 < size && fVar.f52435q) {
                w(i4, i5, fVar, size, i7, false);
            } else if (i12 > size && fVar.f52436r) {
                T(i4, i5, fVar, size, i7, false);
            }
        }
    }

    void s(int i4) {
        int[] iArr = this.f52445c;
        if (iArr == null) {
            this.f52445c = new int[Math.max(i4, 10)];
        } else if (iArr.length < i4) {
            this.f52445c = Arrays.copyOf(this.f52445c, Math.max(iArr.length * 2, i4));
        }
    }

    void t(int i4) {
        long[] jArr = this.f52446d;
        if (jArr == null) {
            this.f52446d = new long[Math.max(i4, 10)];
        } else if (jArr.length < i4) {
            this.f52446d = Arrays.copyOf(this.f52446d, Math.max(jArr.length * 2, i4));
        }
    }

    void u(int i4) {
        long[] jArr = this.f52447e;
        if (jArr == null) {
            this.f52447e = new long[Math.max(i4, 10)];
        } else if (jArr.length < i4) {
            this.f52447e = Arrays.copyOf(this.f52447e, Math.max(jArr.length * 2, i4));
        }
    }

    int x(long j4) {
        return (int) (j4 >> 32);
    }

    int y(long j4) {
        return (int) j4;
    }
}
