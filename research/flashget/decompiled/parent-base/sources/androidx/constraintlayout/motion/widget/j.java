package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material3.f4;
import androidx.constraintlayout.widget.g;
import java.util.HashMap;

/* compiled from: KeyPosition.java */
/* loaded from: classes.dex */
public class j extends k {
    public static final int T = 2;
    public static final int U = 1;
    public static final int V = 0;

    /* renamed from: d0, reason: collision with root package name */
    static final int f23395d0 = 2;
    String F = null;
    int G = f.f23308f;
    int H = 0;
    float I = Float.NaN;
    float J = Float.NaN;
    float K = Float.NaN;
    float L = Float.NaN;
    float M = Float.NaN;
    float N = Float.NaN;
    int O = 0;
    private float P = Float.NaN;
    private float Q = Float.NaN;
    private static final String R = "KeyPosition";
    static final String S = "KeyPosition";
    public static final String W = "transitionEasing";
    public static final String X = "drawPath";
    public static final String Y = "percentWidth";
    public static final String Z = "percentHeight";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f23394c0 = "percentY";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f23393b0 = "percentX";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f23392a0 = "sizePercent";

    /* compiled from: KeyPosition.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f23396a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f23397b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f23398c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final int f23399d = 4;

        /* renamed from: e, reason: collision with root package name */
        private static final int f23400e = 5;

        /* renamed from: f, reason: collision with root package name */
        private static final int f23401f = 6;

        /* renamed from: g, reason: collision with root package name */
        private static final int f23402g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final int f23403h = 8;

        /* renamed from: i, reason: collision with root package name */
        private static final int f23404i = 9;

        /* renamed from: j, reason: collision with root package name */
        private static final int f23405j = 10;

        /* renamed from: k, reason: collision with root package name */
        private static final int f23406k = 11;

        /* renamed from: l, reason: collision with root package name */
        private static final int f23407l = 12;

        /* renamed from: m, reason: collision with root package name */
        private static SparseIntArray f23408m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f23408m = sparseIntArray;
            sparseIntArray.append(g.m.Hf, 1);
            f23408m.append(g.m.Ff, 2);
            f23408m.append(g.m.Of, 3);
            f23408m.append(g.m.Df, 4);
            f23408m.append(g.m.Ef, 5);
            f23408m.append(g.m.Lf, 6);
            f23408m.append(g.m.Mf, 7);
            f23408m.append(g.m.Gf, 9);
            f23408m.append(g.m.Nf, 8);
            f23408m.append(g.m.Kf, 11);
            f23408m.append(g.m.Jf, 12);
            f23408m.append(g.m.If, 10);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(j c5, TypedArray a5) {
            int indexCount = a5.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = a5.getIndex(i4);
                switch (f23408m.get(index)) {
                    case 1:
                        if (MotionLayout.l4) {
                            int resourceId = a5.getResourceId(index, c5.f23330b);
                            c5.f23330b = resourceId;
                            if (resourceId == -1) {
                                c5.f23331c = a5.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (a5.peekValue(index).type == 3) {
                            c5.f23331c = a5.getString(index);
                            break;
                        } else {
                            c5.f23330b = a5.getResourceId(index, c5.f23330b);
                            break;
                        }
                    case 2:
                        c5.f23329a = a5.getInt(index, c5.f23329a);
                        break;
                    case 3:
                        if (a5.peekValue(index).type == 3) {
                            c5.F = a5.getString(index);
                            break;
                        } else {
                            c5.F = androidx.constraintlayout.core.motion.utils.e.f22203o[a5.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        c5.D = a5.getInteger(index, c5.D);
                        break;
                    case 5:
                        c5.H = a5.getInt(index, c5.H);
                        break;
                    case 6:
                        c5.K = a5.getFloat(index, c5.K);
                        break;
                    case 7:
                        c5.L = a5.getFloat(index, c5.L);
                        break;
                    case 8:
                        float f4 = a5.getFloat(index, c5.J);
                        c5.I = f4;
                        c5.J = f4;
                        break;
                    case 9:
                        c5.O = a5.getInt(index, c5.O);
                        break;
                    case 10:
                        c5.G = a5.getInt(index, c5.G);
                        break;
                    case 11:
                        c5.I = a5.getFloat(index, c5.I);
                        break;
                    case 12:
                        c5.J = a5.getFloat(index, c5.J);
                        break;
                    default:
                        Integer.toHexString(index);
                        f23408m.get(index);
                        break;
                }
            }
            int i5 = c5.f23329a;
        }
    }

    public j() {
        this.f23332d = 2;
    }

    private void t(float start_x, float start_y, float end_x, float end_y) {
        float f4 = end_x - start_x;
        float f5 = end_y - start_y;
        float f6 = Float.isNaN(this.K) ? 0.0f : this.K;
        float f7 = Float.isNaN(this.N) ? 0.0f : this.N;
        float f10 = Float.isNaN(this.L) ? 0.0f : this.L;
        this.P = (int) (((Float.isNaN(this.M) ? 0.0f : this.M) * f5) + (f6 * f4) + start_x);
        this.Q = (int) ((f5 * f10) + (f4 * f7) + start_y);
    }

    private void u(float start_x, float start_y, float end_x, float end_y) {
        float f4 = end_x - start_x;
        float f5 = end_y - start_y;
        float f6 = this.K;
        float f7 = (f4 * f6) + start_x;
        float f10 = this.L;
        this.P = ((-f5) * f10) + f7;
        this.Q = (f4 * f10) + (f5 * f6) + start_y;
    }

    private void v(int layoutWidth, int layoutHeight) {
        float f4 = this.K;
        float f5 = 0;
        this.P = (layoutWidth * f4) + f5;
        this.Q = (layoutHeight * f4) + f5;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> splines) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* renamed from: b */
    public f clone() {
        return new j().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f src) {
        super.c(src);
        j jVar = (j) src;
        this.F = jVar.F;
        this.G = jVar.G;
        this.H = jVar.H;
        this.I = jVar.I;
        this.J = Float.NaN;
        this.K = jVar.K;
        this.L = jVar.L;
        this.M = jVar.M;
        this.N = jVar.N;
        this.P = jVar.P;
        this.Q = jVar.Q;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(Context context, AttributeSet attrs) {
        a.b(this, context.obtainStyledAttributes(attrs, g.m.Cf));
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String tag, Object value) {
        tag.getClass();
        switch (tag) {
            case "transitionEasing":
                this.F = value.toString();
                break;
            case "percentWidth":
                this.I = m(value);
                break;
            case "percentHeight":
                this.J = m(value);
                break;
            case "drawPath":
                this.H = n(value);
                break;
            case "sizePercent":
                float m4 = m(value);
                this.I = m4;
                this.J = m4;
                break;
            case "percentX":
                this.K = m(value);
                break;
            case "percentY":
                this.L = m(value);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.k
    void o(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y) {
        int i4 = this.O;
        if (i4 == 1) {
            u(start_x, start_y, end_x, end_y);
        } else if (i4 != 2) {
            t(start_x, start_y, end_x, end_y);
        } else {
            v(layoutWidth, layoutHeight);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.k
    float p() {
        return this.P;
    }

    @Override // androidx.constraintlayout.motion.widget.k
    float q() {
        return this.Q;
    }

    @Override // androidx.constraintlayout.motion.widget.k
    public boolean r(int layoutWidth, int layoutHeight, RectF start, RectF end, float x4, float y4) {
        o(layoutWidth, layoutHeight, start.centerX(), start.centerY(), end.centerX(), end.centerY());
        return Math.abs(x4 - this.P) < 20.0f && Math.abs(y4 - this.Q) < 20.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.k
    public void s(View view, RectF start, RectF end, float x4, float y4, String[] attribute, float[] value) {
        int i4 = this.O;
        if (i4 == 1) {
            x(start, end, x4, y4, attribute, value);
        } else if (i4 != 2) {
            w(start, end, x4, y4, attribute, value);
        } else {
            y(view, start, end, x4, y4, attribute, value);
        }
    }

    void w(RectF start, RectF end, float x4, float y4, String[] attribute, float[] value) {
        float centerX = start.centerX();
        float centerY = start.centerY();
        float centerX2 = end.centerX() - centerX;
        float centerY2 = end.centerY() - centerY;
        String str = attribute[0];
        if (str == null) {
            attribute[0] = "percentX";
            value[0] = (x4 - centerX) / centerX2;
            attribute[1] = "percentY";
            value[1] = (y4 - centerY) / centerY2;
            return;
        }
        if ("percentX".equals(str)) {
            value[0] = (x4 - centerX) / centerX2;
            value[1] = (y4 - centerY) / centerY2;
        } else {
            value[1] = (x4 - centerX) / centerX2;
            value[0] = (y4 - centerY) / centerY2;
        }
    }

    void x(RectF start, RectF end, float x4, float y4, String[] attribute, float[] value) {
        float centerX = start.centerX();
        float centerY = start.centerY();
        float centerX2 = end.centerX() - centerX;
        float centerY2 = end.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            value[0] = 0.0f;
            value[1] = 0.0f;
            return;
        }
        float f4 = centerX2 / hypot;
        float f5 = centerY2 / hypot;
        float f6 = y4 - centerY;
        float f7 = x4 - centerX;
        float a5 = f4.a(f7, f5, f4 * f6, hypot);
        float f10 = ((f5 * f6) + (f4 * f7)) / hypot;
        String str = attribute[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                value[0] = f10;
                value[1] = a5;
                return;
            }
            return;
        }
        attribute[0] = "percentX";
        attribute[1] = "percentY";
        value[0] = f10;
        value[1] = a5;
    }

    void y(View view, RectF start, RectF end, float x4, float y4, String[] attribute, float[] value) {
        start.centerX();
        start.centerY();
        end.centerX();
        end.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = attribute[0];
        if (str == null) {
            attribute[0] = "percentX";
            value[0] = x4 / width;
            attribute[1] = "percentY";
            value[1] = y4 / height;
            return;
        }
        if ("percentX".equals(str)) {
            value[0] = x4 / width;
            value[1] = y4 / height;
        } else {
            value[1] = x4 / width;
            value[0] = y4 / height;
        }
    }

    public void z(int type) {
        this.O = type;
    }
}
