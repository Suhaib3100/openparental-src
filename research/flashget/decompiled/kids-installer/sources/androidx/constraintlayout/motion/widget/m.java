package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.f;
import java.util.HashMap;

/* compiled from: KeyPosition.java */
/* loaded from: classes3.dex */
public class m extends n {
    public static final int O = 2;
    public static final int P = 1;
    public static final int Q = 0;
    static final int R = 2;
    String A = null;
    int B = f.f1803f;
    int C = 0;
    float D = Float.NaN;
    float E = Float.NaN;
    float F = Float.NaN;
    float G = Float.NaN;
    float H = Float.NaN;
    float I = Float.NaN;
    int J = 0;
    private float K = Float.NaN;
    private float L = Float.NaN;
    private static final String S = "percentY";
    private static final String T = "percentX";
    private static final String M = "KeyPosition";
    static final String N = "KeyPosition";

    /* compiled from: KeyPosition.java */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f1906a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f1907b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f1908c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final int f1909d = 4;

        /* renamed from: e, reason: collision with root package name */
        private static final int f1910e = 5;

        /* renamed from: f, reason: collision with root package name */
        private static final int f1911f = 6;

        /* renamed from: g, reason: collision with root package name */
        private static final int f1912g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final int f1913h = 8;

        /* renamed from: i, reason: collision with root package name */
        private static final int f1914i = 9;

        /* renamed from: j, reason: collision with root package name */
        private static final int f1915j = 10;

        /* renamed from: k, reason: collision with root package name */
        private static final int f1916k = 11;

        /* renamed from: l, reason: collision with root package name */
        private static final int f1917l = 12;

        /* renamed from: m, reason: collision with root package name */
        private static SparseIntArray f1918m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1918m = sparseIntArray;
            sparseIntArray.append(f.m.bc, 1);
            f1918m.append(f.m.Zb, 2);
            f1918m.append(f.m.ic, 3);
            f1918m.append(f.m.Xb, 4);
            f1918m.append(f.m.Yb, 5);
            f1918m.append(f.m.fc, 6);
            f1918m.append(f.m.gc, 7);
            f1918m.append(f.m.ac, 9);
            f1918m.append(f.m.hc, 8);
            f1918m.append(f.m.ec, 11);
            f1918m.append(f.m.dc, 12);
            f1918m.append(f.m.cc, 10);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(m mVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArray.getIndex(i5);
                switch (f1918m.get(index)) {
                    case 1:
                        if (MotionLayout.f1701s1) {
                            int resourceId = typedArray.getResourceId(index, mVar.f1823b);
                            mVar.f1823b = resourceId;
                            if (resourceId == -1) {
                                mVar.f1824c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            mVar.f1824c = typedArray.getString(index);
                            break;
                        } else {
                            mVar.f1823b = typedArray.getResourceId(index, mVar.f1823b);
                            break;
                        }
                    case 2:
                        mVar.f1822a = typedArray.getInt(index, mVar.f1822a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            mVar.A = typedArray.getString(index);
                            break;
                        } else {
                            mVar.A = androidx.constraintlayout.motion.utils.c.f1627k[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        mVar.f1920y = typedArray.getInteger(index, mVar.f1920y);
                        break;
                    case 5:
                        mVar.C = typedArray.getInt(index, mVar.C);
                        break;
                    case 6:
                        mVar.F = typedArray.getFloat(index, mVar.F);
                        break;
                    case 7:
                        mVar.G = typedArray.getFloat(index, mVar.G);
                        break;
                    case 8:
                        float f6 = typedArray.getFloat(index, mVar.E);
                        mVar.D = f6;
                        mVar.E = f6;
                        break;
                    case 9:
                        mVar.J = typedArray.getInt(index, mVar.J);
                        break;
                    case 10:
                        mVar.B = typedArray.getInt(index, mVar.B);
                        break;
                    case 11:
                        mVar.D = typedArray.getFloat(index, mVar.D);
                        break;
                    case 12:
                        mVar.E = typedArray.getFloat(index, mVar.E);
                        break;
                    default:
                        Integer.toHexString(index);
                        f1918m.get(index);
                        break;
                }
            }
            int i6 = mVar.f1822a;
        }
    }

    public m() {
        this.f1825d = 2;
    }

    private void o(float f6, float f7, float f8, float f9) {
        float f10 = f8 - f6;
        float f11 = f9 - f7;
        float f12 = Float.isNaN(this.F) ? 0.0f : this.F;
        float f13 = Float.isNaN(this.I) ? 0.0f : this.I;
        float f14 = Float.isNaN(this.G) ? 0.0f : this.G;
        this.K = (int) (((Float.isNaN(this.H) ? 0.0f : this.H) * f11) + (f12 * f10) + f6);
        this.L = (int) ((f11 * f14) + (f10 * f13) + f7);
    }

    private void p(float f6, float f7, float f8, float f9) {
        float f10 = f8 - f6;
        float f11 = f9 - f7;
        float f12 = this.F;
        float f13 = (f10 * f12) + f6;
        float f14 = this.G;
        this.K = ((-f11) * f14) + f13;
        this.L = (f10 * f14) + (f11 * f12) + f7;
    }

    private void q(int i5, int i6) {
        float f6 = this.F;
        float f7 = 0;
        this.K = ((i5 - 0) * f6) + f7;
        this.L = ((i6 - 0) * f6) + f7;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, x> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void c(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, f.m.Wb));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "transitionEasing":
                this.A = obj.toString();
                break;
            case "percentWidth":
                this.D = h(obj);
                break;
            case "percentHeight":
                this.E = h(obj);
                break;
            case "drawPath":
                this.C = i(obj);
                break;
            case "sizePercent":
                float h5 = h(obj);
                this.D = h5;
                this.E = h5;
                break;
            case "percentX":
                this.F = h(obj);
                break;
            case "percentY":
                this.G = h(obj);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.n
    void j(int i5, int i6, float f6, float f7, float f8, float f9) {
        int i7 = this.J;
        if (i7 == 1) {
            p(f6, f7, f8, f9);
        } else if (i7 != 2) {
            o(f6, f7, f8, f9);
        } else {
            q(i5, i6);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.n
    float k() {
        return this.K;
    }

    @Override // androidx.constraintlayout.motion.widget.n
    float l() {
        return this.L;
    }

    @Override // androidx.constraintlayout.motion.widget.n
    public boolean m(int i5, int i6, RectF rectF, RectF rectF2, float f6, float f7) {
        j(i5, i6, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        return Math.abs(f6 - this.K) < 20.0f && Math.abs(f7 - this.L) < 20.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.n
    public void n(View view, RectF rectF, RectF rectF2, float f6, float f7, String[] strArr, float[] fArr) {
        int i5 = this.J;
        if (i5 == 1) {
            s(rectF, rectF2, f6, f7, strArr, fArr);
        } else if (i5 != 2) {
            r(rectF, rectF2, f6, f7, strArr, fArr);
        } else {
            t(view, rectF, rectF2, f6, f7, strArr, fArr);
        }
    }

    void r(RectF rectF, RectF rectF2, float f6, float f7, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f6 - centerX) / centerX2;
            strArr[1] = "percentY";
            fArr[1] = (f7 - centerY) / centerY2;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = (f6 - centerX) / centerX2;
            fArr[1] = (f7 - centerY) / centerY2;
        } else {
            fArr[1] = (f6 - centerX) / centerX2;
            fArr[0] = (f7 - centerY) / centerY2;
        }
    }

    void s(RectF rectF, RectF rectF2, float f6, float f7, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f8 = centerX2 / hypot;
        float f9 = centerY2 / hypot;
        float f10 = f7 - centerY;
        float f11 = f6 - centerX;
        float f12 = ((f8 * f10) - (f11 * f9)) / hypot;
        float f13 = ((f9 * f10) + (f8 * f11)) / hypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f13;
                fArr[1] = f12;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f13;
        fArr[1] = f12;
    }

    void t(View view, RectF rectF, RectF rectF2, float f6, float f7, String[] strArr, float[] fArr) {
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = f6 / width;
            strArr[1] = "percentY";
            fArr[1] = f7 / height;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = f6 / width;
            fArr[1] = f7 / height;
        } else {
            fArr[1] = f6 / width;
            fArr[0] = f7 / height;
        }
    }
}
