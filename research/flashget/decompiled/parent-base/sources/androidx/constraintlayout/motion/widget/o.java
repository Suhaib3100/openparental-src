package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.compose.material3.j4;
import androidx.constraintlayout.motion.utils.c;
import androidx.constraintlayout.motion.utils.d;
import androidx.constraintlayout.motion.utils.f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: MotionController.java */
/* loaded from: classes.dex */
public class o {
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 3;
    public static final int R = 4;
    public static final int S = 5;
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;
    public static final int X = 4;
    public static final int Y = 5;
    public static final int Z = 6;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f23489a0 = 1;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f23490b0 = 2;

    /* renamed from: c0, reason: collision with root package name */
    private static final String f23491c0 = "MotionController";

    /* renamed from: d0, reason: collision with root package name */
    private static final boolean f23492d0 = false;

    /* renamed from: e0, reason: collision with root package name */
    private static final boolean f23493e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    static final int f23494f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    static final int f23495g0 = 1;

    /* renamed from: h0, reason: collision with root package name */
    static final int f23496h0 = 2;

    /* renamed from: i0, reason: collision with root package name */
    static final int f23497i0 = 3;

    /* renamed from: j0, reason: collision with root package name */
    static final int f23498j0 = 4;

    /* renamed from: k0, reason: collision with root package name */
    static final int f23499k0 = 5;

    /* renamed from: l0, reason: collision with root package name */
    private static final int f23500l0 = -1;

    /* renamed from: m0, reason: collision with root package name */
    private static final int f23501m0 = -2;

    /* renamed from: n0, reason: collision with root package name */
    private static final int f23502n0 = -3;
    private HashMap<String, androidx.constraintlayout.motion.utils.f> B;
    private HashMap<String, androidx.constraintlayout.motion.utils.d> C;
    private HashMap<String, androidx.constraintlayout.motion.utils.c> D;
    private m[] E;
    private int F;
    private int G;
    private View H;
    private int I;
    private float J;
    private Interpolator K;
    private boolean L;
    String[] M;

    /* renamed from: b, reason: collision with root package name */
    View f23504b;

    /* renamed from: c, reason: collision with root package name */
    int f23505c;

    /* renamed from: e, reason: collision with root package name */
    String f23507e;

    /* renamed from: k, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.c[] f23513k;

    /* renamed from: l, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.c f23514l;

    /* renamed from: p, reason: collision with root package name */
    float f23518p;

    /* renamed from: q, reason: collision with root package name */
    float f23519q;

    /* renamed from: r, reason: collision with root package name */
    private int[] f23520r;

    /* renamed from: s, reason: collision with root package name */
    private double[] f23521s;

    /* renamed from: t, reason: collision with root package name */
    private double[] f23522t;

    /* renamed from: u, reason: collision with root package name */
    private String[] f23523u;

    /* renamed from: v, reason: collision with root package name */
    private int[] f23524v;

    /* renamed from: a, reason: collision with root package name */
    Rect f23503a = new Rect();

    /* renamed from: d, reason: collision with root package name */
    boolean f23506d = false;

    /* renamed from: f, reason: collision with root package name */
    private int f23508f = -1;

    /* renamed from: g, reason: collision with root package name */
    private r f23509g = new r();

    /* renamed from: h, reason: collision with root package name */
    private r f23510h = new r();

    /* renamed from: i, reason: collision with root package name */
    private n f23511i = new n();

    /* renamed from: j, reason: collision with root package name */
    private n f23512j = new n();

    /* renamed from: m, reason: collision with root package name */
    float f23515m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    float f23516n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    float f23517o = 1.0f;

    /* renamed from: w, reason: collision with root package name */
    private int f23525w = 4;

    /* renamed from: x, reason: collision with root package name */
    private float[] f23526x = new float[4];

    /* renamed from: y, reason: collision with root package name */
    private ArrayList<r> f23527y = new ArrayList<>();

    /* renamed from: z, reason: collision with root package name */
    private float[] f23528z = new float[1];
    private ArrayList<f> A = new ArrayList<>();

    /* compiled from: MotionController.java */
    class a implements Interpolator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.e f23529a;

        a(final androidx.constraintlayout.core.motion.utils.e val$easing) {
            this.f23529a = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v4) {
            return (float) this.f23529a.a(v4);
        }
    }

    o(View view) {
        int i4 = f.f23308f;
        this.F = i4;
        this.G = i4;
        this.H = null;
        this.I = i4;
        this.J = Float.NaN;
        this.K = null;
        this.L = false;
        Z(view);
    }

    private float D() {
        char c5;
        float f4;
        float[] fArr = new float[2];
        float f5 = 1.0f / 99;
        double d5 = 0.0d;
        double d6 = 0.0d;
        float f6 = 0.0f;
        int i4 = 0;
        while (i4 < 100) {
            float f7 = i4 * f5;
            double d7 = f7;
            androidx.constraintlayout.core.motion.utils.e eVar = this.f23509g.f23536b;
            Iterator<r> it = this.f23527y.iterator();
            float f10 = Float.NaN;
            float f11 = 0.0f;
            while (it.hasNext()) {
                r next = it.next();
                androidx.constraintlayout.core.motion.utils.e eVar2 = next.f23536b;
                if (eVar2 != null) {
                    float f12 = next.f23538d;
                    if (f12 < f7) {
                        eVar = eVar2;
                        f11 = f12;
                    } else if (Float.isNaN(f10)) {
                        f10 = next.f23538d;
                    }
                }
            }
            if (eVar != null) {
                if (Float.isNaN(f10)) {
                    f10 = 1.0f;
                }
                d7 = (((float) eVar.a((f7 - f11) / r17)) * (f10 - f11)) + f11;
            }
            this.f23513k[0].d(d7, this.f23521s);
            float f13 = f6;
            int i5 = i4;
            this.f23509g.h(d7, this.f23520r, this.f23521s, fArr, 0);
            if (i5 > 0) {
                c5 = 0;
                f4 = (float) (Math.hypot(d6 - fArr[1], d5 - fArr[0]) + f13);
            } else {
                c5 = 0;
                f4 = f13;
            }
            d5 = fArr[c5];
            i4 = i5 + 1;
            f6 = f4;
            d6 = fArr[1];
        }
        return f6;
    }

    private void K(r point) {
        if (Collections.binarySearch(this.f23527y, point) == 0) {
            float f4 = point.f23539e;
        }
        this.f23527y.add((-r0) - 1, point);
    }

    private void O(r motionPaths) {
        motionPaths.s((int) this.f23504b.getX(), (int) this.f23504b.getY(), this.f23504b.getWidth(), this.f23504b.getHeight());
    }

    private float j(float position, float[] velocity) {
        float f4 = 0.0f;
        if (velocity != null) {
            velocity[0] = 1.0f;
        } else {
            float f5 = this.f23517o;
            if (f5 != 1.0d) {
                float f6 = this.f23516n;
                if (position < f6) {
                    position = 0.0f;
                }
                if (position > f6 && position < 1.0d) {
                    position = Math.min((position - f6) * f5, 1.0f);
                }
            }
        }
        androidx.constraintlayout.core.motion.utils.e eVar = this.f23509g.f23536b;
        Iterator<r> it = this.f23527y.iterator();
        float f7 = Float.NaN;
        while (it.hasNext()) {
            r next = it.next();
            androidx.constraintlayout.core.motion.utils.e eVar2 = next.f23536b;
            if (eVar2 != null) {
                float f10 = next.f23538d;
                if (f10 < position) {
                    eVar = eVar2;
                    f4 = f10;
                } else if (Float.isNaN(f7)) {
                    f7 = next.f23538d;
                }
            }
        }
        if (eVar != null) {
            float f11 = (Float.isNaN(f7) ? 1.0f : f7) - f4;
            double d5 = (position - f4) / f11;
            position = (((float) eVar.a(d5)) * f11) + f4;
            if (velocity != null) {
                velocity[0] = (float) eVar.b(d5);
            }
        }
        return position;
    }

    private static Interpolator v(Context context, int type, String interpolatorString, int id2) {
        if (type == -2) {
            return AnimationUtils.loadInterpolator(context, id2);
        }
        if (type == -1) {
            return new a(androidx.constraintlayout.core.motion.utils.e.c(interpolatorString));
        }
        if (type == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (type == 1) {
            return new AccelerateInterpolator();
        }
        if (type == 2) {
            return new DecelerateInterpolator();
        }
        if (type == 4) {
            return new BounceInterpolator();
        }
        if (type != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    double[] A(double position) {
        this.f23513k[0].d(position, this.f23521s);
        androidx.constraintlayout.core.motion.utils.c cVar = this.f23514l;
        if (cVar != null) {
            double[] dArr = this.f23521s;
            if (dArr.length > 0) {
                cVar.d(position, dArr);
            }
        }
        return this.f23521s;
    }

    k B(int layoutWidth, int layoutHeight, float x4, float y4) {
        RectF rectF = new RectF();
        r rVar = this.f23509g;
        float f4 = rVar.f23540f;
        rectF.left = f4;
        float f5 = rVar.f23541g;
        rectF.top = f5;
        rectF.right = f4 + rVar.f23542h;
        rectF.bottom = f5 + rVar.f23543i;
        RectF rectF2 = new RectF();
        r rVar2 = this.f23510h;
        float f6 = rVar2.f23540f;
        rectF2.left = f6;
        float f7 = rVar2.f23541g;
        rectF2.top = f7;
        rectF2.right = f6 + rVar2.f23542h;
        rectF2.bottom = f7 + rVar2.f23543i;
        Iterator<f> it = this.A.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (next instanceof k) {
                k kVar = (k) next;
                if (kVar.r(layoutWidth, layoutHeight, rectF, rectF2, x4, y4)) {
                    return kVar;
                }
            }
        }
        return null;
    }

    void C(float position, int width, int height, float locationX, float locationY, float[] mAnchorDpDt) {
        float j4 = j(position, this.f23528z);
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap = this.C;
        androidx.constraintlayout.motion.utils.d dVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap2 = this.C;
        androidx.constraintlayout.motion.utils.d dVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap3 = this.C;
        androidx.constraintlayout.motion.utils.d dVar3 = hashMap3 == null ? null : hashMap3.get("rotation");
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap4 = this.C;
        androidx.constraintlayout.motion.utils.d dVar4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap5 = this.C;
        androidx.constraintlayout.motion.utils.d dVar5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap6 = this.D;
        androidx.constraintlayout.motion.utils.c cVar = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap7 = this.D;
        androidx.constraintlayout.motion.utils.c cVar2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap8 = this.D;
        androidx.constraintlayout.motion.utils.c cVar3 = hashMap8 == null ? null : hashMap8.get("rotation");
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap9 = this.D;
        androidx.constraintlayout.motion.utils.c cVar4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap10 = this.D;
        androidx.constraintlayout.motion.utils.c cVar5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
        androidx.constraintlayout.core.motion.utils.y yVar = new androidx.constraintlayout.core.motion.utils.y();
        yVar.b();
        yVar.d(dVar3, j4);
        yVar.h(dVar, dVar2, j4);
        yVar.f(dVar4, dVar5, j4);
        yVar.c(cVar3, j4);
        yVar.g(cVar, cVar2, j4);
        yVar.e(cVar4, cVar5, j4);
        androidx.constraintlayout.core.motion.utils.c cVar6 = this.f23514l;
        if (cVar6 != null) {
            double[] dArr = this.f23521s;
            if (dArr.length > 0) {
                double d5 = j4;
                cVar6.d(d5, dArr);
                this.f23514l.g(d5, this.f23522t);
                this.f23509g.t(locationX, locationY, mAnchorDpDt, this.f23520r, this.f23522t, this.f23521s);
            }
            yVar.a(locationX, locationY, width, height, mAnchorDpDt);
            return;
        }
        int i4 = 0;
        if (this.f23513k == null) {
            r rVar = this.f23510h;
            float f4 = rVar.f23540f;
            r rVar2 = this.f23509g;
            float f5 = f4 - rVar2.f23540f;
            androidx.constraintlayout.motion.utils.c cVar7 = cVar5;
            float f6 = rVar.f23541g - rVar2.f23541g;
            androidx.constraintlayout.motion.utils.c cVar8 = cVar4;
            float f7 = rVar.f23542h - rVar2.f23542h;
            float f10 = (rVar.f23543i - rVar2.f23543i) + f6;
            mAnchorDpDt[0] = ((f7 + f5) * locationX) + ((1.0f - locationX) * f5);
            mAnchorDpDt[1] = (f10 * locationY) + ((1.0f - locationY) * f6);
            yVar.b();
            yVar.d(dVar3, j4);
            yVar.h(dVar, dVar2, j4);
            yVar.f(dVar4, dVar5, j4);
            yVar.c(cVar3, j4);
            yVar.g(cVar, cVar2, j4);
            yVar.e(cVar8, cVar7, j4);
            yVar.a(locationX, locationY, width, height, mAnchorDpDt);
            return;
        }
        double j5 = j(j4, this.f23528z);
        this.f23513k[0].g(j5, this.f23522t);
        this.f23513k[0].d(j5, this.f23521s);
        float f11 = this.f23528z[0];
        while (true) {
            double[] dArr2 = this.f23522t;
            if (i4 >= dArr2.length) {
                this.f23509g.t(locationX, locationY, mAnchorDpDt, this.f23520r, dArr2, this.f23521s);
                yVar.a(locationX, locationY, width, height, mAnchorDpDt);
                return;
            } else {
                dArr2[i4] = dArr2[i4] * f11;
                i4++;
            }
        }
    }

    public float E() {
        return this.f23509g.f23543i;
    }

    public float F() {
        return this.f23509g.f23542h;
    }

    public float G() {
        return this.f23509g.f23540f;
    }

    public float H() {
        return this.f23509g.f23541g;
    }

    public int I() {
        return this.G;
    }

    public View J() {
        return this.f23504b;
    }

    boolean L(View child, float global_position, long time, androidx.constraintlayout.core.motion.utils.h keyCache) {
        f.d dVar;
        boolean z4;
        int i4;
        double d5;
        float j4 = j(global_position, null);
        int i5 = this.I;
        if (i5 != f.f23308f) {
            float f4 = 1.0f / i5;
            float floor = ((float) Math.floor(j4 / f4)) * f4;
            float f5 = (j4 % f4) / f4;
            if (!Float.isNaN(this.J)) {
                f5 = (f5 + this.J) % 1.0f;
            }
            Interpolator interpolator = this.K;
            j4 = ((interpolator != null ? interpolator.getInterpolation(f5) : ((double) f5) > 0.5d ? 1.0f : 0.0f) * f4) + floor;
        }
        float f6 = j4;
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap = this.C;
        if (hashMap != null) {
            Iterator<androidx.constraintlayout.motion.utils.d> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().m(child, f6);
            }
        }
        HashMap<String, androidx.constraintlayout.motion.utils.f> hashMap2 = this.B;
        if (hashMap2 != null) {
            f.d dVar2 = null;
            boolean z5 = false;
            for (androidx.constraintlayout.motion.utils.f fVar : hashMap2.values()) {
                if (fVar instanceof f.d) {
                    dVar2 = (f.d) fVar;
                } else {
                    z5 |= fVar.j(child, f6, time, keyCache);
                }
            }
            z4 = z5;
            dVar = dVar2;
        } else {
            dVar = null;
            z4 = false;
        }
        androidx.constraintlayout.core.motion.utils.c[] cVarArr = this.f23513k;
        if (cVarArr != null) {
            double d6 = f6;
            cVarArr[0].d(d6, this.f23521s);
            this.f23513k[0].g(d6, this.f23522t);
            androidx.constraintlayout.core.motion.utils.c cVar = this.f23514l;
            if (cVar != null) {
                double[] dArr = this.f23521s;
                if (dArr.length > 0) {
                    cVar.d(d6, dArr);
                    this.f23514l.g(d6, this.f23522t);
                }
            }
            if (this.L) {
                d5 = d6;
            } else {
                d5 = d6;
                this.f23509g.u(f6, child, this.f23520r, this.f23521s, this.f23522t, null, this.f23506d);
                this.f23506d = false;
            }
            if (this.G != f.f23308f) {
                if (this.H == null) {
                    this.H = ((View) child.getParent()).findViewById(this.G);
                }
                if (this.H != null) {
                    float bottom = (this.H.getBottom() + r1.getTop()) / 2.0f;
                    float right = (this.H.getRight() + this.H.getLeft()) / 2.0f;
                    if (child.getRight() - child.getLeft() > 0 && child.getBottom() - child.getTop() > 0) {
                        child.setPivotX(right - child.getLeft());
                        child.setPivotY(bottom - child.getTop());
                    }
                }
            }
            HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap3 = this.C;
            if (hashMap3 != null) {
                for (androidx.constraintlayout.motion.utils.d dVar3 : hashMap3.values()) {
                    if (dVar3 instanceof d.C0393d) {
                        double[] dArr2 = this.f23522t;
                        if (dArr2.length > 1) {
                            ((d.C0393d) dVar3).n(child, f6, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.f23522t;
                i4 = 1;
                z4 |= dVar.k(child, keyCache, f6, time, dArr3[0], dArr3[1]);
            } else {
                i4 = 1;
            }
            int i6 = i4;
            while (true) {
                androidx.constraintlayout.core.motion.utils.c[] cVarArr2 = this.f23513k;
                if (i6 >= cVarArr2.length) {
                    break;
                }
                cVarArr2[i6].e(d5, this.f23526x);
                androidx.constraintlayout.motion.utils.a.b(this.f23509g.f23550p.get(this.f23523u[i6 - 1]), child, this.f23526x);
                i6++;
            }
            n nVar = this.f23511i;
            if (nVar.f23465c == 0) {
                if (f6 <= 0.0f) {
                    child.setVisibility(nVar.f23466d);
                } else if (f6 >= 1.0f) {
                    child.setVisibility(this.f23512j.f23466d);
                } else if (this.f23512j.f23466d != nVar.f23466d) {
                    child.setVisibility(0);
                }
            }
            if (this.E != null) {
                int i7 = 0;
                while (true) {
                    m[] mVarArr = this.E;
                    if (i7 >= mVarArr.length) {
                        break;
                    }
                    mVarArr[i7].A(f6, child);
                    i7++;
                }
            }
        } else {
            i4 = 1;
            r rVar = this.f23509g;
            float f7 = rVar.f23540f;
            r rVar2 = this.f23510h;
            float a5 = androidx.appcompat.graphics.drawable.d.a(rVar2.f23540f, f7, f6, f7);
            float f10 = rVar.f23541g;
            float a6 = androidx.appcompat.graphics.drawable.d.a(rVar2.f23541g, f10, f6, f10);
            float f11 = rVar.f23542h;
            float f12 = rVar2.f23542h;
            float a7 = androidx.appcompat.graphics.drawable.d.a(f12, f11, f6, f11);
            float f13 = rVar.f23543i;
            float f14 = rVar2.f23543i;
            float f15 = a5 + 0.5f;
            int i10 = (int) f15;
            float f16 = a6 + 0.5f;
            int i11 = (int) f16;
            int i12 = (int) (f15 + a7);
            int a8 = (int) (f16 + androidx.appcompat.graphics.drawable.d.a(f14, f13, f6, f13));
            int i13 = i12 - i10;
            int i14 = a8 - i11;
            if (f12 != f11 || f14 != f13 || this.f23506d) {
                child.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                this.f23506d = false;
            }
            child.layout(i10, i11, i12, a8);
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap4 = this.D;
        if (hashMap4 != null) {
            for (androidx.constraintlayout.motion.utils.c cVar2 : hashMap4.values()) {
                if (cVar2 instanceof c.d) {
                    double[] dArr4 = this.f23522t;
                    ((c.d) cVar2).n(child, f6, dArr4[0], dArr4[i4]);
                } else {
                    cVar2.m(child, f6);
                }
            }
        }
        return z4;
    }

    String M() {
        return this.f23504b.getContext().getResources().getResourceEntryName(this.f23504b.getId());
    }

    void N(View view, k key, float x4, float y4, String[] attribute, float[] value) {
        RectF rectF = new RectF();
        r rVar = this.f23509g;
        float f4 = rVar.f23540f;
        rectF.left = f4;
        float f5 = rVar.f23541g;
        rectF.top = f5;
        rectF.right = f4 + rVar.f23542h;
        rectF.bottom = f5 + rVar.f23543i;
        RectF rectF2 = new RectF();
        r rVar2 = this.f23510h;
        float f6 = rVar2.f23540f;
        rectF2.left = f6;
        float f7 = rVar2.f23541g;
        rectF2.top = f7;
        rectF2.right = f6 + rVar2.f23542h;
        rectF2.bottom = f7 + rVar2.f23543i;
        key.s(view, rectF, rectF2, x4, y4, attribute, value);
    }

    public void P() {
        this.f23506d = true;
    }

    void Q(Rect rect, Rect out, int rotation, int preHeight, int preWidth) {
        if (rotation == 1) {
            int i4 = rect.left + rect.right;
            out.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            out.top = preWidth - ((rect.height() + i4) / 2);
            out.right = rect.width() + out.left;
            out.bottom = rect.height() + out.top;
            return;
        }
        if (rotation == 2) {
            int i5 = rect.left + rect.right;
            out.left = preHeight - ((rect.width() + (rect.top + rect.bottom)) / 2);
            out.top = (i5 - rect.height()) / 2;
            out.right = rect.width() + out.left;
            out.bottom = rect.height() + out.top;
            return;
        }
        if (rotation == 3) {
            int i6 = rect.left + rect.right;
            out.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            out.top = preWidth - ((rect.height() + i6) / 2);
            out.right = rect.width() + out.left;
            out.bottom = rect.height() + out.top;
            return;
        }
        if (rotation != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        out.left = preHeight - ((rect.width() + (rect.bottom + rect.top)) / 2);
        out.top = (i7 - rect.height()) / 2;
        out.right = rect.width() + out.left;
        out.bottom = rect.height() + out.top;
    }

    void R(View v4) {
        r rVar = this.f23509g;
        rVar.f23538d = 0.0f;
        rVar.f23539e = 0.0f;
        this.L = true;
        rVar.s(v4.getX(), v4.getY(), v4.getWidth(), v4.getHeight());
        this.f23510h.s(v4.getX(), v4.getY(), v4.getWidth(), v4.getHeight());
        this.f23511i.o(v4);
        this.f23512j.o(v4);
    }

    public void S(int debugMode) {
        this.f23509g.f23537c = debugMode;
    }

    void T(Rect cw, androidx.constraintlayout.widget.d constraintSet, int parentWidth, int parentHeight) {
        int i4 = constraintSet.f24040d;
        if (i4 != 0) {
            Q(cw, this.f23503a, i4, parentWidth, parentHeight);
            cw = this.f23503a;
        }
        r rVar = this.f23510h;
        rVar.f23538d = 1.0f;
        rVar.f23539e = 1.0f;
        O(rVar);
        this.f23510h.s(cw.left, cw.top, cw.width(), cw.height());
        this.f23510h.a(constraintSet.q0(this.f23505c));
        this.f23512j.n(cw, constraintSet, i4, this.f23505c);
    }

    public void U(int arc) {
        this.F = arc;
    }

    void V(View v4) {
        r rVar = this.f23509g;
        rVar.f23538d = 0.0f;
        rVar.f23539e = 0.0f;
        rVar.s(v4.getX(), v4.getY(), v4.getWidth(), v4.getHeight());
        this.f23511i.o(v4);
    }

    void W(Rect cw, androidx.constraintlayout.widget.d constraintSet, int parentWidth, int parentHeight) {
        int i4 = constraintSet.f24040d;
        if (i4 != 0) {
            Q(cw, this.f23503a, i4, parentWidth, parentHeight);
        }
        r rVar = this.f23509g;
        rVar.f23538d = 0.0f;
        rVar.f23539e = 0.0f;
        O(rVar);
        this.f23509g.s(cw.left, cw.top, cw.width(), cw.height());
        d.a q02 = constraintSet.q0(this.f23505c);
        this.f23509g.a(q02);
        this.f23515m = q02.f24047d.f24164g;
        this.f23511i.n(cw, constraintSet, i4, this.f23505c);
        this.G = q02.f24049f.f24197i;
        d.c cVar = q02.f24047d;
        this.I = cVar.f24168k;
        this.J = cVar.f24167j;
        Context context = this.f23504b.getContext();
        d.c cVar2 = q02.f24047d;
        this.K = v(context, cVar2.f24170m, cVar2.f24169l, cVar2.f24171n);
    }

    public void X(androidx.constraintlayout.motion.utils.e rect, View v4, int rotation, int preWidth, int preHeight) {
        r rVar = this.f23509g;
        rVar.f23538d = 0.0f;
        rVar.f23539e = 0.0f;
        Rect rect2 = new Rect();
        if (rotation == 1) {
            int i4 = rect.f23151b + rect.f23153d;
            rect2.left = ((rect.f23152c + rect.f23154e) - rect.c()) / 2;
            rect2.top = preWidth - ((rect.b() + i4) / 2);
            rect2.right = rect.c() + rect2.left;
            rect2.bottom = rect.b() + rect2.top;
        } else if (rotation == 2) {
            int i5 = rect.f23151b + rect.f23153d;
            rect2.left = preHeight - ((rect.c() + (rect.f23152c + rect.f23154e)) / 2);
            rect2.top = (i5 - rect.b()) / 2;
            rect2.right = rect.c() + rect2.left;
            rect2.bottom = rect.b() + rect2.top;
        }
        this.f23509g.s(rect2.left, rect2.top, rect2.width(), rect2.height());
        this.f23511i.m(rect2, v4, rotation, rect.f23150a);
    }

    public void Y(int transformPivotTarget) {
        this.G = transformPivotTarget;
        this.H = null;
    }

    public void Z(View view) {
        this.f23504b = view;
        this.f23505c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.f23507e = ((ConstraintLayout.LayoutParams) layoutParams).a();
        }
    }

    public void a(f key) {
        this.A.add(key);
    }

    public void a0(int parentWidth, int parentHeight, float transitionDuration, long currentTime) {
        ArrayList arrayList;
        String[] strArr;
        double[][] dArr;
        androidx.constraintlayout.widget.a aVar;
        androidx.constraintlayout.motion.utils.f i4;
        androidx.constraintlayout.widget.a aVar2;
        Integer num;
        androidx.constraintlayout.motion.utils.d l4;
        androidx.constraintlayout.widget.a aVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i5 = this.F;
        if (i5 != f.f23308f) {
            this.f23509g.f23546l = i5;
        }
        this.f23511i.f(this.f23512j, hashSet2);
        ArrayList<f> arrayList2 = this.A;
        if (arrayList2 != null) {
            Iterator<f> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                f next = it.next();
                if (next instanceof j) {
                    j jVar = (j) next;
                    K(new r(parentWidth, parentHeight, jVar, this.f23509g, this.f23510h));
                    int i6 = jVar.D;
                    if (i6 != f.f23308f) {
                        this.f23508f = i6;
                    }
                } else if (next instanceof h) {
                    next.d(hashSet3);
                } else if (next instanceof l) {
                    next.d(hashSet);
                } else if (next instanceof m) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((m) next);
                } else {
                    next.i(hashMap);
                    next.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.E = (m[]) arrayList.toArray(new m[0]);
        }
        char c5 = 1;
        if (!hashSet2.isEmpty()) {
            this.C = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[1];
                    Iterator<f> it3 = this.A.iterator();
                    while (it3.hasNext()) {
                        f next3 = it3.next();
                        HashMap<String, androidx.constraintlayout.widget.a> hashMap2 = next3.f23333e;
                        if (hashMap2 != null && (aVar3 = hashMap2.get(str)) != null) {
                            sparseArray.append(next3.f23329a, aVar3);
                        }
                    }
                    l4 = new d.b(next2, sparseArray);
                } else {
                    l4 = androidx.constraintlayout.motion.utils.d.l(next2);
                }
                if (l4 != null) {
                    l4.i(next2);
                    this.C.put(next2, l4);
                }
            }
            ArrayList<f> arrayList3 = this.A;
            if (arrayList3 != null) {
                Iterator<f> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    f next4 = it4.next();
                    if (next4 instanceof g) {
                        next4.a(this.C);
                    }
                }
            }
            this.f23511i.a(this.C, 0);
            this.f23512j.a(this.C, 100);
            for (String str2 : this.C.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                androidx.constraintlayout.motion.utils.d dVar = this.C.get(str2);
                if (dVar != null) {
                    dVar.j(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.B == null) {
                this.B = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.B.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<f> it6 = this.A.iterator();
                        while (it6.hasNext()) {
                            f next6 = it6.next();
                            HashMap<String, androidx.constraintlayout.widget.a> hashMap3 = next6.f23333e;
                            if (hashMap3 != null && (aVar2 = hashMap3.get(str3)) != null) {
                                sparseArray2.append(next6.f23329a, aVar2);
                            }
                        }
                        i4 = androidx.constraintlayout.motion.utils.f.h(next5, sparseArray2);
                    } else {
                        i4 = androidx.constraintlayout.motion.utils.f.i(next5, currentTime);
                    }
                    if (i4 != null) {
                        i4.e(next5);
                        this.B.put(next5, i4);
                    }
                }
            }
            ArrayList<f> arrayList4 = this.A;
            if (arrayList4 != null) {
                Iterator<f> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    f next7 = it7.next();
                    if (next7 instanceof l) {
                        ((l) next7).W(this.B);
                    }
                }
            }
            for (String str4 : this.B.keySet()) {
                this.B.get(str4).f(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int size = this.f23527y.size();
        int i7 = size + 2;
        r[] rVarArr = new r[i7];
        rVarArr[0] = this.f23509g;
        rVarArr[size + 1] = this.f23510h;
        if (this.f23527y.size() > 0 && this.f23508f == -1) {
            this.f23508f = 0;
        }
        Iterator<r> it8 = this.f23527y.iterator();
        int i10 = 1;
        while (it8.hasNext()) {
            rVarArr[i10] = it8.next();
            i10++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.f23510h.f23550p.keySet()) {
            if (this.f23509g.f23550p.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f23523u = strArr2;
        this.f23524v = new int[strArr2.length];
        int i11 = 0;
        while (true) {
            strArr = this.f23523u;
            if (i11 >= strArr.length) {
                break;
            }
            String str6 = strArr[i11];
            this.f23524v[i11] = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= i7) {
                    break;
                }
                if (rVarArr[i12].f23550p.containsKey(str6) && (aVar = rVarArr[i12].f23550p.get(str6)) != null) {
                    int[] iArr = this.f23524v;
                    iArr[i11] = aVar.p() + iArr[i11];
                    break;
                }
                i12++;
            }
            i11++;
        }
        boolean z4 = rVarArr[0].f23546l != f.f23308f;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i13 = 1; i13 < i7; i13++) {
            rVarArr[i13].e(rVarArr[i13 - 1], zArr, this.f23523u, z4);
        }
        int i14 = 0;
        for (int i15 = 1; i15 < length; i15++) {
            if (zArr[i15]) {
                i14++;
            }
        }
        this.f23520r = new int[i14];
        int i16 = 2;
        int max = Math.max(2, i14);
        this.f23521s = new double[max];
        this.f23522t = new double[max];
        int i17 = 0;
        for (int i18 = 1; i18 < length; i18++) {
            if (zArr[i18]) {
                this.f23520r[i17] = i18;
                i17++;
            }
        }
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i7, this.f23520r.length);
        double[] dArr3 = new double[i7];
        for (int i19 = 0; i19 < i7; i19++) {
            rVarArr[i19].f(dArr2[i19], this.f23520r);
            dArr3[i19] = rVarArr[i19].f23538d;
        }
        int i20 = 0;
        while (true) {
            int[] iArr2 = this.f23520r;
            if (i20 >= iArr2.length) {
                break;
            }
            if (iArr2[i20] < r.G.length) {
                String a5 = android.support.v4.media.c.a(new StringBuilder(), r.G[this.f23520r[i20]], " [");
                for (int i21 = 0; i21 < i7; i21++) {
                    StringBuilder a6 = j4.a(a5);
                    a6.append(dArr2[i21][i20]);
                    a5 = a6.toString();
                }
            }
            i20++;
        }
        this.f23513k = new androidx.constraintlayout.core.motion.utils.c[this.f23523u.length + 1];
        int i22 = 0;
        while (true) {
            String[] strArr3 = this.f23523u;
            if (i22 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i22];
            int i23 = 0;
            int i24 = 0;
            double[] dArr4 = null;
            double[][] dArr5 = null;
            while (i23 < i7) {
                if (rVarArr[i23].n(str7)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i7];
                        int[] iArr3 = new int[i16];
                        iArr3[c5] = rVarArr[i23].l(str7);
                        iArr3[0] = i7;
                        dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr3);
                    }
                    r rVar = rVarArr[i23];
                    dArr = dArr2;
                    dArr4[i24] = rVar.f23538d;
                    rVar.k(str7, dArr5[i24], 0);
                    i24++;
                } else {
                    dArr = dArr2;
                }
                i23++;
                dArr2 = dArr;
                i16 = 2;
                c5 = 1;
            }
            i22++;
            this.f23513k[i22] = androidx.constraintlayout.core.motion.utils.c.a(this.f23508f, Arrays.copyOf(dArr4, i24), (double[][]) Arrays.copyOf(dArr5, i24));
            dArr2 = dArr2;
            i16 = 2;
            c5 = 1;
        }
        this.f23513k[0] = androidx.constraintlayout.core.motion.utils.c.a(this.f23508f, dArr3, dArr2);
        if (rVarArr[0].f23546l != f.f23308f) {
            int[] iArr4 = new int[i7];
            double[] dArr6 = new double[i7];
            double[][] dArr7 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i7, 2);
            for (int i25 = 0; i25 < i7; i25++) {
                iArr4[i25] = rVarArr[i25].f23546l;
                dArr6[i25] = r9.f23538d;
                double[] dArr8 = dArr7[i25];
                dArr8[0] = r9.f23540f;
                dArr8[1] = r9.f23541g;
            }
            this.f23514l = new androidx.constraintlayout.core.motion.utils.b(iArr4, dArr6, dArr7);
        }
        this.D = new HashMap<>();
        if (this.A != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f4 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                androidx.constraintlayout.motion.utils.c l5 = androidx.constraintlayout.motion.utils.c.l(next8);
                if (l5 != null) {
                    if (l5.k() && Float.isNaN(f4)) {
                        f4 = D();
                    }
                    l5.i(next8);
                    this.D.put(next8, l5);
                }
            }
            Iterator<f> it10 = this.A.iterator();
            while (it10.hasNext()) {
                f next9 = it10.next();
                if (next9 instanceof h) {
                    ((h) next9).a0(this.D);
                }
            }
            Iterator<androidx.constraintlayout.motion.utils.c> it11 = this.D.values().iterator();
            while (it11.hasNext()) {
                it11.next().j(f4);
            }
        }
    }

    void b(ArrayList<f> list) {
        this.A.addAll(list);
    }

    public void b0(o motionController) {
        this.f23509g.v(motionController, motionController.f23509g);
        this.f23510h.v(motionController, motionController.f23510h);
    }

    void c(float[] bounds, int pointCount) {
        float f4 = 1.0f / (pointCount - 1);
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap = this.C;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap2 = this.C;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap3 = this.D;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap4 = this.D;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i4 = 0; i4 < pointCount; i4++) {
            float f5 = i4 * f4;
            float f6 = this.f23517o;
            float f7 = 0.0f;
            if (f6 != 1.0f) {
                float f10 = this.f23516n;
                if (f5 < f10) {
                    f5 = 0.0f;
                }
                if (f5 > f10 && f5 < 1.0d) {
                    f5 = Math.min((f5 - f10) * f6, 1.0f);
                }
            }
            double d5 = f5;
            androidx.constraintlayout.core.motion.utils.e eVar = this.f23509g.f23536b;
            Iterator<r> it = this.f23527y.iterator();
            float f11 = Float.NaN;
            while (it.hasNext()) {
                r next = it.next();
                androidx.constraintlayout.core.motion.utils.e eVar2 = next.f23536b;
                if (eVar2 != null) {
                    float f12 = next.f23538d;
                    if (f12 < f5) {
                        eVar = eVar2;
                        f7 = f12;
                    } else if (Float.isNaN(f11)) {
                        f11 = next.f23538d;
                    }
                }
            }
            if (eVar != null) {
                if (Float.isNaN(f11)) {
                    f11 = 1.0f;
                }
                d5 = (((float) eVar.a((f5 - f7) / r12)) * (f11 - f7)) + f7;
            }
            this.f23513k[0].d(d5, this.f23521s);
            androidx.constraintlayout.core.motion.utils.c cVar = this.f23514l;
            if (cVar != null) {
                double[] dArr = this.f23521s;
                if (dArr.length > 0) {
                    cVar.d(d5, dArr);
                }
            }
            this.f23509g.g(this.f23520r, this.f23521s, bounds, i4 * 2);
        }
    }

    int d(float[] keyBounds, int[] mode) {
        if (keyBounds == null) {
            return 0;
        }
        double[] h4 = this.f23513k[0].h();
        if (mode != null) {
            Iterator<r> it = this.f23527y.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                mode[i4] = it.next().f23551q;
                i4++;
            }
        }
        int i5 = 0;
        for (double d5 : h4) {
            this.f23513k[0].d(d5, this.f23521s);
            this.f23509g.g(this.f23520r, this.f23521s, keyBounds, i5);
            i5 += 2;
        }
        return i5 / 2;
    }

    int e(float[] keyFrames, int[] mode) {
        if (keyFrames == null) {
            return 0;
        }
        double[] h4 = this.f23513k[0].h();
        if (mode != null) {
            Iterator<r> it = this.f23527y.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                mode[i4] = it.next().f23551q;
                i4++;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < h4.length; i6++) {
            this.f23513k[0].d(h4[i6], this.f23521s);
            this.f23509g.h(h4[i6], this.f23520r, this.f23521s, keyFrames, i5);
            i5 += 2;
        }
        return i5 / 2;
    }

    void f(float[] points, int pointCount) {
        double d5;
        float f4 = 1.0f;
        float f5 = 1.0f / (pointCount - 1);
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap = this.C;
        androidx.constraintlayout.motion.utils.d dVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap2 = this.C;
        androidx.constraintlayout.motion.utils.d dVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap3 = this.D;
        androidx.constraintlayout.motion.utils.c cVar = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap4 = this.D;
        androidx.constraintlayout.motion.utils.c cVar2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i4 = 0;
        while (i4 < pointCount) {
            float f6 = i4 * f5;
            float f7 = this.f23517o;
            float f10 = 0.0f;
            if (f7 != f4) {
                float f11 = this.f23516n;
                if (f6 < f11) {
                    f6 = 0.0f;
                }
                if (f6 > f11 && f6 < 1.0d) {
                    f6 = Math.min((f6 - f11) * f7, f4);
                }
            }
            float f12 = f6;
            double d6 = f12;
            androidx.constraintlayout.core.motion.utils.e eVar = this.f23509g.f23536b;
            Iterator<r> it = this.f23527y.iterator();
            float f13 = Float.NaN;
            while (it.hasNext()) {
                r next = it.next();
                androidx.constraintlayout.core.motion.utils.e eVar2 = next.f23536b;
                double d7 = d6;
                if (eVar2 != null) {
                    float f14 = next.f23538d;
                    if (f14 < f12) {
                        f10 = f14;
                        eVar = eVar2;
                    } else if (Float.isNaN(f13)) {
                        f13 = next.f23538d;
                    }
                }
                d6 = d7;
            }
            double d10 = d6;
            if (eVar != null) {
                if (Float.isNaN(f13)) {
                    f13 = 1.0f;
                }
                d5 = (((float) eVar.a((f12 - f10) / r16)) * (f13 - f10)) + f10;
            } else {
                d5 = d10;
            }
            this.f23513k[0].d(d5, this.f23521s);
            androidx.constraintlayout.core.motion.utils.c cVar3 = this.f23514l;
            if (cVar3 != null) {
                double[] dArr = this.f23521s;
                if (dArr.length > 0) {
                    cVar3.d(d5, dArr);
                }
            }
            int i5 = i4 * 2;
            int i6 = i4;
            this.f23509g.h(d5, this.f23520r, this.f23521s, points, i5);
            if (cVar != null) {
                points[i5] = cVar.a(f12) + points[i5];
            } else if (dVar != null) {
                points[i5] = dVar.a(f12) + points[i5];
            }
            if (cVar2 != null) {
                int i7 = i5 + 1;
                points[i7] = cVar2.a(f12) + points[i7];
            } else if (dVar2 != null) {
                int i10 = i5 + 1;
                points[i10] = dVar2.a(f12) + points[i10];
            }
            i4 = i6 + 1;
            f4 = 1.0f;
        }
    }

    void g(float p4, float[] path, int offset) {
        this.f23513k[0].d(j(p4, null), this.f23521s);
        this.f23509g.m(this.f23520r, this.f23521s, path, offset);
    }

    void h(float[] path, int pointCount) {
        float f4 = 1.0f / (pointCount - 1);
        for (int i4 = 0; i4 < pointCount; i4++) {
            this.f23513k[0].d(j(i4 * f4, null), this.f23521s);
            this.f23509g.m(this.f23520r, this.f23521s, path, i4 * 8);
        }
    }

    void i(boolean start) {
        if (!"button".equals(c.k(this.f23504b)) || this.E == null) {
            return;
        }
        int i4 = 0;
        while (true) {
            m[] mVarArr = this.E;
            if (i4 >= mVarArr.length) {
                return;
            }
            mVarArr[i4].A(start ? -100.0f : 100.0f, this.f23504b);
            i4++;
        }
    }

    public int k() {
        return this.f23509g.f23547m;
    }

    int l(String attributeType, float[] points, int pointCount) {
        androidx.constraintlayout.motion.utils.d dVar = this.C.get(attributeType);
        if (dVar == null) {
            return -1;
        }
        for (int i4 = 0; i4 < points.length; i4++) {
            points[i4] = dVar.a(i4 / (points.length - 1));
        }
        return points.length;
    }

    public void m(double p4, float[] pos, float[] vel) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f23513k[0].d(p4, dArr);
        this.f23513k[0].g(p4, dArr2);
        Arrays.fill(vel, 0.0f);
        this.f23509g.i(p4, this.f23520r, dArr, pos, dArr2, vel);
    }

    public float n() {
        return this.f23518p;
    }

    public float o() {
        return this.f23519q;
    }

    void p(float position, float locationX, float locationY, float[] mAnchorDpDt) {
        double[] dArr;
        float j4 = j(position, this.f23528z);
        androidx.constraintlayout.core.motion.utils.c[] cVarArr = this.f23513k;
        int i4 = 0;
        if (cVarArr == null) {
            r rVar = this.f23510h;
            float f4 = rVar.f23540f;
            r rVar2 = this.f23509g;
            float f5 = f4 - rVar2.f23540f;
            float f6 = rVar.f23541g - rVar2.f23541g;
            float f7 = rVar.f23542h - rVar2.f23542h;
            float f10 = (rVar.f23543i - rVar2.f23543i) + f6;
            mAnchorDpDt[0] = ((f7 + f5) * locationX) + ((1.0f - locationX) * f5);
            mAnchorDpDt[1] = (f10 * locationY) + ((1.0f - locationY) * f6);
            return;
        }
        double d5 = j4;
        cVarArr[0].g(d5, this.f23522t);
        this.f23513k[0].d(d5, this.f23521s);
        float f11 = this.f23528z[0];
        while (true) {
            dArr = this.f23522t;
            if (i4 >= dArr.length) {
                break;
            }
            dArr[i4] = dArr[i4] * f11;
            i4++;
        }
        androidx.constraintlayout.core.motion.utils.c cVar = this.f23514l;
        if (cVar == null) {
            this.f23509g.t(locationX, locationY, mAnchorDpDt, this.f23520r, dArr, this.f23521s);
            return;
        }
        double[] dArr2 = this.f23521s;
        if (dArr2.length > 0) {
            cVar.d(d5, dArr2);
            this.f23514l.g(d5, this.f23522t);
            this.f23509g.t(locationX, locationY, mAnchorDpDt, this.f23520r, this.f23522t, this.f23521s);
        }
    }

    public int q() {
        int i4 = this.f23509g.f23537c;
        Iterator<r> it = this.f23527y.iterator();
        while (it.hasNext()) {
            i4 = Math.max(i4, it.next().f23537c);
        }
        return Math.max(i4, this.f23510h.f23537c);
    }

    public float r() {
        return this.f23510h.f23543i;
    }

    public float s() {
        return this.f23510h.f23542h;
    }

    public float t() {
        return this.f23510h.f23540f;
    }

    public String toString() {
        return " start: x: " + this.f23509g.f23540f + " y: " + this.f23509g.f23541g + " end: x: " + this.f23510h.f23540f + " y: " + this.f23510h.f23541g;
    }

    public float u() {
        return this.f23510h.f23541g;
    }

    r w(int i4) {
        return this.f23527y.get(i4);
    }

    public int x(int type, int[] info) {
        float[] fArr = new float[2];
        Iterator<f> it = this.A.iterator();
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            f next = it.next();
            int i6 = next.f23332d;
            if (i6 == type || type != -1) {
                info[i5] = 0;
                info[i5 + 1] = i6;
                int i7 = next.f23329a;
                info[i5 + 2] = i7;
                double d5 = i7 / 100.0f;
                this.f23513k[0].d(d5, this.f23521s);
                this.f23509g.h(d5, this.f23520r, this.f23521s, fArr, 0);
                info[i5 + 3] = Float.floatToIntBits(fArr[0]);
                int i10 = i5 + 4;
                info[i10] = Float.floatToIntBits(fArr[1]);
                if (next instanceof j) {
                    j jVar = (j) next;
                    info[i5 + 5] = jVar.O;
                    info[i5 + 6] = Float.floatToIntBits(jVar.K);
                    i10 = i5 + 7;
                    info[i10] = Float.floatToIntBits(jVar.L);
                }
                int i11 = i10 + 1;
                info[i5] = i11 - i5;
                i4++;
                i5 = i11;
            }
        }
        return i4;
    }

    float y(int type, float x4, float y4) {
        r rVar = this.f23510h;
        float f4 = rVar.f23540f;
        r rVar2 = this.f23509g;
        float f5 = rVar2.f23540f;
        float f6 = f4 - f5;
        float f7 = rVar.f23541g;
        float f10 = rVar2.f23541g;
        float f11 = f7 - f10;
        float f12 = (rVar2.f23542h / 2.0f) + f5;
        float f13 = (rVar2.f23543i / 2.0f) + f10;
        float hypot = (float) Math.hypot(f6, f11);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f14 = x4 - f12;
        float f15 = y4 - f13;
        if (((float) Math.hypot(f14, f15)) == 0.0f) {
            return 0.0f;
        }
        float f16 = (f15 * f11) + (f14 * f6);
        if (type == 0) {
            return f16 / hypot;
        }
        if (type == 1) {
            return (float) Math.sqrt((hypot * hypot) - (f16 * f16));
        }
        if (type == 2) {
            return f14 / f6;
        }
        if (type == 3) {
            return f15 / f6;
        }
        if (type == 4) {
            return f14 / f11;
        }
        if (type != 5) {
            return 0.0f;
        }
        return f15 / f11;
    }

    public int z(int[] type, float[] pos) {
        Iterator<f> it = this.A.iterator();
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            f next = it.next();
            int i6 = next.f23329a;
            type[i4] = (next.f23332d * 1000) + i6;
            double d5 = i6 / 100.0f;
            this.f23513k[0].d(d5, this.f23521s);
            this.f23509g.h(d5, this.f23520r, this.f23521s, pos, i5);
            i5 += 2;
            i4++;
        }
        return i4;
    }
}
