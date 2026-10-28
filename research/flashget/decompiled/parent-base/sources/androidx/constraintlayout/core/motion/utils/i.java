package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.w;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: KeyCycleOscillator.java */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: h, reason: collision with root package name */
    private static final String f22226h = "KeyCycleOscillator";

    /* renamed from: a, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.c f22227a;

    /* renamed from: b, reason: collision with root package name */
    private c f22228b;

    /* renamed from: c, reason: collision with root package name */
    private String f22229c;

    /* renamed from: d, reason: collision with root package name */
    private int f22230d = 0;

    /* renamed from: e, reason: collision with root package name */
    private String f22231e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f22232f = 0;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<g> f22233g = new ArrayList<>();

    /* compiled from: KeyCycleOscillator.java */
    class a implements Comparator<g> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            return Integer.compare(gVar.f22257a, gVar2.f22257a);
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    private static class b extends i {

        /* renamed from: i, reason: collision with root package name */
        String f22235i;

        /* renamed from: j, reason: collision with root package name */
        int f22236j;

        public b(String str) {
            this.f22235i = str;
            this.f22236j = w.c.a(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.i
        public void h(androidx.constraintlayout.core.motion.f fVar, float f4) {
            fVar.c(this.f22236j, a(f4));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    static class c {

        /* renamed from: q, reason: collision with root package name */
        static final int f22237q = -1;

        /* renamed from: r, reason: collision with root package name */
        private static final String f22238r = "CycleOscillator";

        /* renamed from: a, reason: collision with root package name */
        private final int f22239a;

        /* renamed from: b, reason: collision with root package name */
        m f22240b;

        /* renamed from: c, reason: collision with root package name */
        private final int f22241c;

        /* renamed from: d, reason: collision with root package name */
        private final int f22242d;

        /* renamed from: e, reason: collision with root package name */
        private final int f22243e;

        /* renamed from: f, reason: collision with root package name */
        float[] f22244f;

        /* renamed from: g, reason: collision with root package name */
        double[] f22245g;

        /* renamed from: h, reason: collision with root package name */
        float[] f22246h;

        /* renamed from: i, reason: collision with root package name */
        float[] f22247i;

        /* renamed from: j, reason: collision with root package name */
        float[] f22248j;

        /* renamed from: k, reason: collision with root package name */
        float[] f22249k;

        /* renamed from: l, reason: collision with root package name */
        int f22250l;

        /* renamed from: m, reason: collision with root package name */
        androidx.constraintlayout.core.motion.utils.c f22251m;

        /* renamed from: n, reason: collision with root package name */
        double[] f22252n;

        /* renamed from: o, reason: collision with root package name */
        double[] f22253o;

        /* renamed from: p, reason: collision with root package name */
        float f22254p;

        c(int i4, String str, int i5, int i6) {
            m mVar = new m();
            this.f22240b = mVar;
            this.f22241c = 0;
            this.f22242d = 1;
            this.f22243e = 2;
            this.f22250l = i4;
            this.f22239a = i5;
            mVar.g(i4, str);
            this.f22244f = new float[i6];
            this.f22245g = new double[i6];
            this.f22246h = new float[i6];
            this.f22247i = new float[i6];
            this.f22248j = new float[i6];
            this.f22249k = new float[i6];
        }

        public double a() {
            return this.f22252n[1];
        }

        public double b(float f4) {
            androidx.constraintlayout.core.motion.utils.c cVar = this.f22251m;
            if (cVar != null) {
                double d5 = f4;
                cVar.g(d5, this.f22253o);
                this.f22251m.d(d5, this.f22252n);
            } else {
                double[] dArr = this.f22253o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d6 = f4;
            double e4 = this.f22240b.e(d6, this.f22252n[1]);
            double d7 = this.f22240b.d(d6, this.f22252n[1], this.f22253o[1]);
            double[] dArr2 = this.f22253o;
            return (d7 * this.f22252n[2]) + (e4 * dArr2[2]) + dArr2[0];
        }

        public double c(float f4) {
            androidx.constraintlayout.core.motion.utils.c cVar = this.f22251m;
            if (cVar != null) {
                cVar.d(f4, this.f22252n);
            } else {
                double[] dArr = this.f22252n;
                dArr[0] = this.f22247i[0];
                dArr[1] = this.f22248j[0];
                dArr[2] = this.f22244f[0];
            }
            double[] dArr2 = this.f22252n;
            return (this.f22240b.e(f4, dArr2[1]) * this.f22252n[2]) + dArr2[0];
        }

        public void d(int i4, int i5, float f4, float f5, float f6, float f7) {
            this.f22245g[i4] = i5 / 100.0d;
            this.f22246h[i4] = f4;
            this.f22247i[i4] = f5;
            this.f22248j[i4] = f6;
            this.f22244f[i4] = f7;
        }

        public void e(float f4) {
            this.f22254p = f4;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f22245g.length, 3);
            float[] fArr = this.f22244f;
            this.f22252n = new double[fArr.length + 2];
            this.f22253o = new double[fArr.length + 2];
            if (this.f22245g[0] > com.google.firebase.remoteconfig.p.f60679p) {
                this.f22240b.a(com.google.firebase.remoteconfig.p.f60679p, this.f22246h[0]);
            }
            double[] dArr2 = this.f22245g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f22240b.a(1.0d, this.f22246h[length]);
            }
            for (int i4 = 0; i4 < dArr.length; i4++) {
                double[] dArr3 = dArr[i4];
                dArr3[0] = this.f22247i[i4];
                dArr3[1] = this.f22248j[i4];
                dArr3[2] = this.f22244f[i4];
                this.f22240b.a(this.f22245g[i4], this.f22246h[i4]);
            }
            this.f22240b.f();
            double[] dArr4 = this.f22245g;
            if (dArr4.length > 1) {
                this.f22251m = androidx.constraintlayout.core.motion.utils.c.a(0, dArr4, dArr);
            } else {
                this.f22251m = null;
            }
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    private static class d {
        private d() {
        }

        private static int a(int[] iArr, float[] fArr, int i4, int i5) {
            int i6 = iArr[i5];
            int i7 = i4;
            while (i4 < i5) {
                if (iArr[i4] <= i6) {
                    c(iArr, fArr, i7, i4);
                    i7++;
                }
                i4++;
            }
            c(iArr, fArr, i7, i5);
            return i7;
        }

        static void b(int[] iArr, float[] fArr, int i4, int i5) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i5;
            iArr2[1] = i4;
            int i6 = 2;
            while (i6 > 0) {
                int i7 = iArr2[i6 - 1];
                int i10 = i6 - 2;
                int i11 = iArr2[i10];
                if (i7 < i11) {
                    int a5 = a(iArr, fArr, i7, i11);
                    iArr2[i10] = a5 - 1;
                    iArr2[i6 - 1] = i7;
                    int i12 = i6 + 1;
                    iArr2[i6] = i11;
                    i6 += 2;
                    iArr2[i12] = a5 + 1;
                } else {
                    i6 = i10;
                }
            }
        }

        private static void c(int[] iArr, float[] fArr, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float f4 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = f4;
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    private static class e {
        private e() {
        }

        private static int a(int[] iArr, float[] fArr, float[] fArr2, int i4, int i5) {
            int i6 = iArr[i5];
            int i7 = i4;
            while (i4 < i5) {
                if (iArr[i4] <= i6) {
                    c(iArr, fArr, fArr2, i7, i4);
                    i7++;
                }
                i4++;
            }
            c(iArr, fArr, fArr2, i7, i5);
            return i7;
        }

        static void b(int[] iArr, float[] fArr, float[] fArr2, int i4, int i5) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i5;
            iArr2[1] = i4;
            int i6 = 2;
            while (i6 > 0) {
                int i7 = iArr2[i6 - 1];
                int i10 = i6 - 2;
                int i11 = iArr2[i10];
                if (i7 < i11) {
                    int a5 = a(iArr, fArr, fArr2, i7, i11);
                    iArr2[i10] = a5 - 1;
                    iArr2[i6 - 1] = i7;
                    int i12 = i6 + 1;
                    iArr2[i6] = i11;
                    i6 += 2;
                    iArr2[i12] = a5 + 1;
                } else {
                    i6 = i10;
                }
            }
        }

        private static void c(int[] iArr, float[] fArr, float[] fArr2, int i4, int i5) {
            int i6 = iArr[i4];
            iArr[i4] = iArr[i5];
            iArr[i5] = i6;
            float f4 = fArr[i4];
            fArr[i4] = fArr[i5];
            fArr[i5] = f4;
            float f5 = fArr2[i4];
            fArr2[i4] = fArr2[i5];
            fArr2[i5] = f5;
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    public static class f extends i {

        /* renamed from: i, reason: collision with root package name */
        String f22255i;

        /* renamed from: j, reason: collision with root package name */
        int f22256j;

        public f(String str) {
            this.f22255i = str;
            this.f22256j = w.c.a(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.i
        public void h(androidx.constraintlayout.core.motion.f fVar, float f4) {
            fVar.c(this.f22256j, a(f4));
        }

        public void l(androidx.constraintlayout.core.motion.f fVar, float f4, double d5, double d6) {
            fVar.R(a(f4) + ((float) Math.toDegrees(Math.atan2(d6, d5))));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    static class g {

        /* renamed from: a, reason: collision with root package name */
        int f22257a;

        /* renamed from: b, reason: collision with root package name */
        float f22258b;

        /* renamed from: c, reason: collision with root package name */
        float f22259c;

        /* renamed from: d, reason: collision with root package name */
        float f22260d;

        /* renamed from: e, reason: collision with root package name */
        float f22261e;

        public g(int i4, float f4, float f5, float f6, float f7) {
            this.f22257a = i4;
            this.f22258b = f7;
            this.f22259c = f5;
            this.f22260d = f4;
            this.f22261e = f6;
        }
    }

    public static i d(String str) {
        return str.equals("pathRotate") ? new f(str) : new b(str);
    }

    public float a(float f4) {
        return (float) this.f22228b.c(f4);
    }

    public androidx.constraintlayout.core.motion.utils.c b() {
        return this.f22227a;
    }

    public float c(float f4) {
        return (float) this.f22228b.b(f4);
    }

    protected void e(Object obj) {
    }

    public void f(int i4, int i5, String str, int i6, float f4, float f5, float f6, float f7) {
        this.f22233g.add(new g(i4, f4, f5, f6, f7));
        if (i6 != -1) {
            this.f22232f = i6;
        }
        this.f22230d = i5;
        this.f22231e = str;
    }

    public void g(int i4, int i5, String str, int i6, float f4, float f5, float f6, float f7, Object obj) {
        this.f22233g.add(new g(i4, f4, f5, f6, f7));
        if (i6 != -1) {
            this.f22232f = i6;
        }
        this.f22230d = i5;
        e(obj);
        this.f22231e = str;
    }

    public void h(androidx.constraintlayout.core.motion.f fVar, float f4) {
    }

    public void i(String str) {
        this.f22229c = str;
    }

    public void j(float f4) {
        int size = this.f22233g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f22233g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f22228b = new c(this.f22230d, this.f22231e, this.f22232f, size);
        Iterator<g> it = this.f22233g.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            g next = it.next();
            float f5 = next.f22260d;
            dArr[i4] = f5 * 0.01d;
            double[] dArr3 = dArr2[i4];
            float f6 = next.f22258b;
            dArr3[0] = f6;
            float f7 = next.f22259c;
            dArr3[1] = f7;
            float f10 = next.f22261e;
            dArr3[2] = f10;
            this.f22228b.d(i4, next.f22257a, f5, f7, f10, f6);
            i4++;
            dArr2 = dArr2;
        }
        this.f22228b.e(f4);
        this.f22227a = androidx.constraintlayout.core.motion.utils.c.a(0, dArr, dArr2);
    }

    public boolean k() {
        return this.f22232f == 1;
    }

    public String toString() {
        String str = this.f22229c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<g> it = this.f22233g.iterator();
        while (it.hasNext()) {
            g next = it.next();
            StringBuilder a5 = androidx.constraintlayout.core.e.a(str, "[");
            a5.append(next.f22257a);
            a5.append(" , ");
            a5.append(decimalFormat.format(next.f22258b));
            a5.append("] ");
            str = a5.toString();
        }
        return str;
    }
}
