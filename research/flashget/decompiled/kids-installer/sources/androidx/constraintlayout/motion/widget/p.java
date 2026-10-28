package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.f;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: KeyTrigger.java */
/* loaded from: classes2.dex */
public class p extends f {
    static final String S = "KeyTrigger";
    private static final String T = "KeyTrigger";
    public static final int U = 5;
    private int A;
    private String B;
    private String C;
    private int D;
    private int E;
    private View F;
    float G;
    private boolean H;
    private boolean I;
    private boolean J;
    private float K;
    private Method L;
    private Method M;
    private Method N;
    private float O;
    private boolean P;
    RectF Q;
    RectF R;

    /* renamed from: y, reason: collision with root package name */
    private int f1943y = -1;

    /* renamed from: z, reason: collision with root package name */
    private String f1944z = null;

    /* compiled from: KeyTrigger.java */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f1945a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f1946b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f1947c = 4;

        /* renamed from: d, reason: collision with root package name */
        private static final int f1948d = 5;

        /* renamed from: e, reason: collision with root package name */
        private static final int f1949e = 6;

        /* renamed from: f, reason: collision with root package name */
        private static final int f1950f = 7;

        /* renamed from: g, reason: collision with root package name */
        private static final int f1951g = 8;

        /* renamed from: h, reason: collision with root package name */
        private static final int f1952h = 9;

        /* renamed from: i, reason: collision with root package name */
        private static final int f1953i = 10;

        /* renamed from: j, reason: collision with root package name */
        private static final int f1954j = 11;

        /* renamed from: k, reason: collision with root package name */
        private static SparseIntArray f1955k;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1955k = sparseIntArray;
            sparseIntArray.append(f.m.Fc, 8);
            f1955k.append(f.m.Jc, 4);
            f1955k.append(f.m.Kc, 1);
            f1955k.append(f.m.Lc, 2);
            f1955k.append(f.m.Gc, 7);
            f1955k.append(f.m.Mc, 6);
            f1955k.append(f.m.Oc, 5);
            f1955k.append(f.m.Ic, 9);
            f1955k.append(f.m.Hc, 10);
            f1955k.append(f.m.Nc, 11);
        }

        private a() {
        }

        public static void a(p pVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArray.getIndex(i5);
                switch (f1955k.get(index)) {
                    case 1:
                        pVar.B = typedArray.getString(index);
                        continue;
                    case 2:
                        pVar.C = typedArray.getString(index);
                        continue;
                    case 4:
                        pVar.f1944z = typedArray.getString(index);
                        continue;
                    case 5:
                        pVar.G = typedArray.getFloat(index, pVar.G);
                        continue;
                    case 6:
                        pVar.D = typedArray.getResourceId(index, pVar.D);
                        continue;
                    case 7:
                        if (MotionLayout.f1701s1) {
                            int resourceId = typedArray.getResourceId(index, pVar.f1823b);
                            pVar.f1823b = resourceId;
                            if (resourceId == -1) {
                                pVar.f1824c = typedArray.getString(index);
                                break;
                            } else {
                                continue;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            pVar.f1824c = typedArray.getString(index);
                            break;
                        } else {
                            pVar.f1823b = typedArray.getResourceId(index, pVar.f1823b);
                            break;
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, pVar.f1822a);
                        pVar.f1822a = integer;
                        pVar.K = (integer + 0.5f) / 100.0f;
                        continue;
                    case 9:
                        pVar.E = typedArray.getResourceId(index, pVar.E);
                        continue;
                    case 10:
                        pVar.P = typedArray.getBoolean(index, pVar.P);
                        continue;
                    case 11:
                        pVar.A = typedArray.getResourceId(index, pVar.A);
                        break;
                }
                Integer.toHexString(index);
                f1955k.get(index);
            }
        }
    }

    public p() {
        int i5 = f.f1803f;
        this.A = i5;
        this.B = null;
        this.C = null;
        this.D = i5;
        this.E = i5;
        this.F = null;
        this.G = 0.1f;
        this.H = true;
        this.I = true;
        this.J = true;
        this.K = Float.NaN;
        this.P = false;
        this.Q = new RectF();
        this.R = new RectF();
        this.f1825d = 5;
        this.f1826e = new HashMap<>();
    }

    private void x(RectF rectF, View view, boolean z5) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z5) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, x> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void b(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void c(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, f.m.Ec), context);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(String str, Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(float r9, android.view.View r10) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.p.v(float, android.view.View):void");
    }

    int w() {
        return this.f1943y;
    }
}
