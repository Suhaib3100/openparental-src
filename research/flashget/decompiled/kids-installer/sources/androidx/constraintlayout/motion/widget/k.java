package androidx.constraintlayout.motion.widget;

import android.annotation.TargetApi;
import android.view.View;
import androidx.constraintlayout.widget.a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: KeyCycleOscillator.java */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: h, reason: collision with root package name */
    private static final String f1872h = "KeyCycleOscillator";

    /* renamed from: a, reason: collision with root package name */
    private androidx.constraintlayout.motion.utils.b f1873a;

    /* renamed from: b, reason: collision with root package name */
    private d f1874b;

    /* renamed from: c, reason: collision with root package name */
    protected androidx.constraintlayout.widget.a f1875c;

    /* renamed from: d, reason: collision with root package name */
    private String f1876d;

    /* renamed from: e, reason: collision with root package name */
    private int f1877e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1878f = 0;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<r> f1879g = new ArrayList<>();

    /* compiled from: KeyCycleOscillator.java */
    class a implements Comparator<r> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(r rVar, r rVar2) {
            return Integer.compare(rVar.f1898a, rVar2.f1898a);
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes2.dex */
    static class b extends k {
        b() {
        }

        @Override // androidx.constraintlayout.motion.widget.k
        public void g(View view, float f6) {
            view.setAlpha(a(f6));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes2.dex */
    static class c extends k {

        /* renamed from: i, reason: collision with root package name */
        float[] f1881i = new float[1];

        c() {
        }

        @Override // androidx.constraintlayout.motion.widget.k
        public void g(View view, float f6) {
            this.f1881i[0] = a(f6);
            this.f1875c.m(view, this.f1881i);
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    static class d {

        /* renamed from: n, reason: collision with root package name */
        static final int f1882n = -1;

        /* renamed from: o, reason: collision with root package name */
        private static final String f1883o = "CycleOscillator";

        /* renamed from: a, reason: collision with root package name */
        private final int f1884a;

        /* renamed from: c, reason: collision with root package name */
        float[] f1886c;

        /* renamed from: d, reason: collision with root package name */
        double[] f1887d;

        /* renamed from: e, reason: collision with root package name */
        float[] f1888e;

        /* renamed from: f, reason: collision with root package name */
        float[] f1889f;

        /* renamed from: g, reason: collision with root package name */
        float[] f1890g;

        /* renamed from: h, reason: collision with root package name */
        int f1891h;

        /* renamed from: i, reason: collision with root package name */
        androidx.constraintlayout.motion.utils.b f1892i;

        /* renamed from: j, reason: collision with root package name */
        double[] f1893j;

        /* renamed from: k, reason: collision with root package name */
        double[] f1894k;

        /* renamed from: l, reason: collision with root package name */
        float f1895l;

        /* renamed from: b, reason: collision with root package name */
        androidx.constraintlayout.motion.utils.g f1885b = new androidx.constraintlayout.motion.utils.g();

        /* renamed from: m, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f1896m = new HashMap<>();

        d(int i5, int i6, int i7) {
            this.f1891h = i5;
            this.f1884a = i6;
            this.f1885b.g(i5);
            this.f1886c = new float[i7];
            this.f1887d = new double[i7];
            this.f1888e = new float[i7];
            this.f1889f = new float[i7];
            this.f1890g = new float[i7];
        }

        private androidx.constraintlayout.widget.a a(String str, a.b bVar) {
            if (!this.f1896m.containsKey(str)) {
                androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a(str, bVar);
                this.f1896m.put(str, aVar);
                return aVar;
            }
            androidx.constraintlayout.widget.a aVar2 = this.f1896m.get(str);
            if (aVar2.d() == bVar) {
                return aVar2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar2.d().name());
        }

        public double b(float f6) {
            androidx.constraintlayout.motion.utils.b bVar = this.f1892i;
            if (bVar != null) {
                double d6 = f6;
                bVar.g(d6, this.f1894k);
                this.f1892i.d(d6, this.f1893j);
            } else {
                double[] dArr = this.f1894k;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
            }
            double d7 = f6;
            double e6 = this.f1885b.e(d7);
            double d8 = this.f1885b.d(d7);
            double[] dArr2 = this.f1894k;
            return (d8 * this.f1893j[1]) + (e6 * dArr2[1]) + dArr2[0];
        }

        public double c(float f6) {
            androidx.constraintlayout.motion.utils.b bVar = this.f1892i;
            if (bVar != null) {
                bVar.d(f6, this.f1893j);
            } else {
                double[] dArr = this.f1893j;
                dArr[0] = this.f1889f[0];
                dArr[1] = this.f1886c[0];
            }
            return (this.f1885b.e(f6) * this.f1893j[1]) + this.f1893j[0];
        }

        public void d(int i5, int i6, float f6, float f7, float f8) {
            this.f1887d[i5] = i6 / 100.0d;
            this.f1888e[i5] = f6;
            this.f1889f[i5] = f7;
            this.f1886c[i5] = f8;
        }

        public void e(float f6) {
            this.f1895l = f6;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f1887d.length, 2);
            float[] fArr = this.f1886c;
            this.f1893j = new double[fArr.length + 1];
            this.f1894k = new double[fArr.length + 1];
            if (this.f1887d[0] > com.google.firebase.remoteconfig.p.f18289o) {
                this.f1885b.a(com.google.firebase.remoteconfig.p.f18289o, this.f1888e[0]);
            }
            double[] dArr2 = this.f1887d;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f1885b.a(1.0d, this.f1888e[length]);
            }
            for (int i5 = 0; i5 < dArr.length; i5++) {
                dArr[i5][0] = this.f1889f[i5];
                int i6 = 0;
                while (true) {
                    if (i6 < this.f1886c.length) {
                        dArr[i6][1] = r4[i6];
                        i6++;
                    }
                }
                this.f1885b.a(this.f1887d[i5], this.f1888e[i5]);
            }
            this.f1885b.f();
            double[] dArr3 = this.f1887d;
            if (dArr3.length > 1) {
                this.f1892i = androidx.constraintlayout.motion.utils.b.a(0, dArr3, dArr);
            } else {
                this.f1892i = null;
            }
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes2.dex */
    static class e extends k {
        e() {
        }

        @Override // androidx.constraintlayout.motion.widget.k
        public void g(View view, float f6) {
            view.setElevation(a(f6));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    private static class f {
        private f() {
        }

        private static int a(int[] iArr, float[] fArr, int i5, int i6) {
            int i7 = iArr[i6];
            int i8 = i5;
            while (i5 < i6) {
                if (iArr[i5] <= i7) {
                    c(iArr, fArr, i8, i5);
                    i8++;
                }
                i5++;
            }
            c(iArr, fArr, i8, i6);
            return i8;
        }

        static void b(int[] iArr, float[] fArr, int i5, int i6) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i6;
            iArr2[1] = i5;
            int i7 = 2;
            while (i7 > 0) {
                int i8 = i7 - 1;
                int i9 = iArr2[i8];
                i7 = i8 - 1;
                int i10 = iArr2[i7];
                if (i9 < i10) {
                    int a6 = a(iArr, fArr, i9, i10);
                    int i11 = i7 + 1;
                    iArr2[i7] = a6 - 1;
                    int i12 = i11 + 1;
                    iArr2[i11] = i9;
                    int i13 = i12 + 1;
                    iArr2[i12] = i10;
                    i7 = i13 + 1;
                    iArr2[i13] = a6 + 1;
                }
            }
        }

        private static void c(int[] iArr, float[] fArr, int i5, int i6) {
            int i7 = iArr[i5];
            iArr[i5] = iArr[i6];
            iArr[i6] = i7;
            float f6 = fArr[i5];
            fArr[i5] = fArr[i6];
            fArr[i6] = f6;
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    private static class g {
        private g() {
        }

        private static int a(int[] iArr, float[] fArr, float[] fArr2, int i5, int i6) {
            int i7 = iArr[i6];
            int i8 = i5;
            while (i5 < i6) {
                if (iArr[i5] <= i7) {
                    c(iArr, fArr, fArr2, i8, i5);
                    i8++;
                }
                i5++;
            }
            c(iArr, fArr, fArr2, i8, i6);
            return i8;
        }

        static void b(int[] iArr, float[] fArr, float[] fArr2, int i5, int i6) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i6;
            iArr2[1] = i5;
            int i7 = 2;
            while (i7 > 0) {
                int i8 = i7 - 1;
                int i9 = iArr2[i8];
                i7 = i8 - 1;
                int i10 = iArr2[i7];
                if (i9 < i10) {
                    int a6 = a(iArr, fArr, fArr2, i9, i10);
                    int i11 = i7 + 1;
                    iArr2[i7] = a6 - 1;
                    int i12 = i11 + 1;
                    iArr2[i11] = i9;
                    int i13 = i12 + 1;
                    iArr2[i12] = i10;
                    i7 = i13 + 1;
                    iArr2[i13] = a6 + 1;
                }
            }
        }

        private static void c(int[] iArr, float[] fArr, float[] fArr2, int i5, int i6) {
            int i7 = iArr[i5];
            iArr[i5] = iArr[i6];
            iArr[i6] = i7;
            float f6 = fArr[i5];
            fArr[i5] = fArr[i6];
            fArr[i6] = f6;
            float f7 = fArr2[i5];
            fArr2[i5] = fArr2[i6];
            fArr2[i6] = f7;
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes2.dex */
    static class h extends k {
        h() {
        }

        @Override // androidx.constraintlayout.motion.widget.k
        public void g(View view, float f6) {
        }

        public void k(View view, float f6, double d6, double d7) {
            view.setRotation(a(f6) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes2.dex */
    static class i extends k {

        /* renamed from: i, reason: collision with root package name */
        boolean f1897i = false;

        i() {
        }

        @Override // androidx.constraintlayout.motion.widget.k
        public void g(View view, float f6) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).l1(a(f6));
                return;
            }
            if (this.f1897i) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f1897i = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f6)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes2.dex */
    static class j extends k {
        j() {
        }

        @Override // androidx.constraintlayout.motion.widget.k
        public void g(View view, float f6) {
            view.setRotation(a(f6));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* renamed from: androidx.constraintlayout.motion.widget.k$k, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0018k extends k {
        C0018k() {
        }

        @Override // androidx.constraintlayout.motion.widget.k
        public void g(View view, float f6) {
            view.setRotationX(a(f6));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes2.dex */
    static class l extends k {
        l() {
        }

        @Override // androidx.constraintlayout.motion.widget.k
        public void g(View view, float f6) {
            view.setRotationY(a(f6));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes2.dex */
    static class m extends k {
        m() {
        }

        @Override // androidx.constraintlayout.motion.widget.k
        public void g(View view, float f6) {
            view.setScaleX(a(f6));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes2.dex */
    static class n extends k {
        n() {
        }

        @Override // androidx.constraintlayout.motion.widget.k
        public void g(View view, float f6) {
            view.setScaleY(a(f6));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes2.dex */
    static class o extends k {
        o() {
        }

        @Override // androidx.constraintlayout.motion.widget.k
        public void g(View view, float f6) {
            view.setTranslationX(a(f6));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes2.dex */
    static class p extends k {
        p() {
        }

        @Override // androidx.constraintlayout.motion.widget.k
        public void g(View view, float f6) {
            view.setTranslationY(a(f6));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    /* loaded from: classes2.dex */
    static class q extends k {
        q() {
        }

        @Override // androidx.constraintlayout.motion.widget.k
        public void g(View view, float f6) {
            view.setTranslationZ(a(f6));
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    static class r {

        /* renamed from: a, reason: collision with root package name */
        int f1898a;

        /* renamed from: b, reason: collision with root package name */
        float f1899b;

        /* renamed from: c, reason: collision with root package name */
        float f1900c;

        /* renamed from: d, reason: collision with root package name */
        float f1901d;

        public r(int i5, float f6, float f7, float f8) {
            this.f1898a = i5;
            this.f1899b = f8;
            this.f1900c = f7;
            this.f1901d = f6;
        }
    }

    static k d(String str) {
        if (str.startsWith("CUSTOM")) {
            return new c();
        }
        switch (str) {
            case "rotationX":
                return new C0018k();
            case "rotationY":
                return new l();
            case "translationX":
                return new o();
            case "translationY":
                return new p();
            case "translationZ":
                return new q();
            case "progress":
                return new i();
            case "scaleX":
                return new m();
            case "scaleY":
                return new n();
            case "waveVariesBy":
                return new b();
            case "rotation":
                return new j();
            case "elevation":
                return new e();
            case "transitionPathRotate":
                return new h();
            case "alpha":
                return new b();
            case "waveOffset":
                return new b();
            default:
                return null;
        }
    }

    public float a(float f6) {
        return (float) this.f1874b.c(f6);
    }

    public androidx.constraintlayout.motion.utils.b b() {
        return this.f1873a;
    }

    public float c(float f6) {
        return (float) this.f1874b.b(f6);
    }

    public void e(int i5, int i6, int i7, float f6, float f7, float f8) {
        this.f1879g.add(new r(i5, f6, f7, f8));
        if (i7 != -1) {
            this.f1878f = i7;
        }
        this.f1877e = i6;
    }

    public void f(int i5, int i6, int i7, float f6, float f7, float f8, androidx.constraintlayout.widget.a aVar) {
        this.f1879g.add(new r(i5, f6, f7, f8));
        if (i7 != -1) {
            this.f1878f = i7;
        }
        this.f1877e = i6;
        this.f1875c = aVar;
    }

    public abstract void g(View view, float f6);

    public void h(String str) {
        this.f1876d = str;
    }

    @TargetApi(19)
    public void i(float f6) {
        int size = this.f1879g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f1879g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
        this.f1874b = new d(this.f1877e, this.f1878f, size);
        Iterator<r> it = this.f1879g.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            r next = it.next();
            float f7 = next.f1901d;
            dArr[i5] = f7 * 0.01d;
            double[] dArr3 = dArr2[i5];
            float f8 = next.f1899b;
            dArr3[0] = f8;
            float f9 = next.f1900c;
            dArr3[1] = f9;
            this.f1874b.d(i5, next.f1898a, f7, f9, f8);
            i5++;
        }
        this.f1874b.e(f6);
        this.f1873a = androidx.constraintlayout.motion.utils.b.a(0, dArr, dArr2);
    }

    public boolean j() {
        return this.f1878f == 1;
    }

    public String toString() {
        String str = this.f1876d;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<r> it = this.f1879g.iterator();
        while (it.hasNext()) {
            r next = it.next();
            StringBuilder a6 = androidx.constraintlayout.motion.widget.c.a(str, "[");
            a6.append(next.f1898a);
            a6.append(" , ");
            a6.append(decimalFormat.format(next.f1899b));
            a6.append("] ");
            str = a6.toString();
        }
        return str;
    }
}
