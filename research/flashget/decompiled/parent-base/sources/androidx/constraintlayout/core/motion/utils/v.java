package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* compiled from: TypedBundle.java */
/* loaded from: classes.dex */
public class v {

    /* renamed from: m, reason: collision with root package name */
    private static final int f22380m = 4;

    /* renamed from: n, reason: collision with root package name */
    private static final int f22381n = 10;

    /* renamed from: o, reason: collision with root package name */
    private static final int f22382o = 10;

    /* renamed from: p, reason: collision with root package name */
    private static final int f22383p = 5;

    /* renamed from: a, reason: collision with root package name */
    int[] f22384a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    int[] f22385b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    int f22386c = 0;

    /* renamed from: d, reason: collision with root package name */
    int[] f22387d = new int[10];

    /* renamed from: e, reason: collision with root package name */
    float[] f22388e = new float[10];

    /* renamed from: f, reason: collision with root package name */
    int f22389f = 0;

    /* renamed from: g, reason: collision with root package name */
    int[] f22390g = new int[5];

    /* renamed from: h, reason: collision with root package name */
    String[] f22391h = new String[5];

    /* renamed from: i, reason: collision with root package name */
    int f22392i = 0;

    /* renamed from: j, reason: collision with root package name */
    int[] f22393j = new int[4];

    /* renamed from: k, reason: collision with root package name */
    boolean[] f22394k = new boolean[4];

    /* renamed from: l, reason: collision with root package name */
    int f22395l = 0;

    public void a(int i4, float f4) {
        int i5 = this.f22389f;
        int[] iArr = this.f22387d;
        if (i5 >= iArr.length) {
            this.f22387d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f22388e;
            this.f22388e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f22387d;
        int i6 = this.f22389f;
        iArr2[i6] = i4;
        float[] fArr2 = this.f22388e;
        this.f22389f = i6 + 1;
        fArr2[i6] = f4;
    }

    public void b(int i4, int i5) {
        int i6 = this.f22386c;
        int[] iArr = this.f22384a;
        if (i6 >= iArr.length) {
            this.f22384a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f22385b;
            this.f22385b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f22384a;
        int i7 = this.f22386c;
        iArr3[i7] = i4;
        int[] iArr4 = this.f22385b;
        this.f22386c = i7 + 1;
        iArr4[i7] = i5;
    }

    public void c(int i4, String str) {
        int i5 = this.f22392i;
        int[] iArr = this.f22390g;
        if (i5 >= iArr.length) {
            this.f22390g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f22391h;
            this.f22391h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f22390g;
        int i6 = this.f22392i;
        iArr2[i6] = i4;
        String[] strArr2 = this.f22391h;
        this.f22392i = i6 + 1;
        strArr2[i6] = str;
    }

    public void d(int i4, boolean z4) {
        int i5 = this.f22395l;
        int[] iArr = this.f22393j;
        if (i5 >= iArr.length) {
            this.f22393j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f22394k;
            this.f22394k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f22393j;
        int i6 = this.f22395l;
        iArr2[i6] = i4;
        boolean[] zArr2 = this.f22394k;
        this.f22395l = i6 + 1;
        zArr2[i6] = z4;
    }

    public void e(int i4, String str) {
        if (str != null) {
            c(i4, str);
        }
    }

    public void f(v vVar) {
        for (int i4 = 0; i4 < this.f22386c; i4++) {
            vVar.b(this.f22384a[i4], this.f22385b[i4]);
        }
        for (int i5 = 0; i5 < this.f22389f; i5++) {
            vVar.a(this.f22387d[i5], this.f22388e[i5]);
        }
        for (int i6 = 0; i6 < this.f22392i; i6++) {
            vVar.c(this.f22390g[i6], this.f22391h[i6]);
        }
        for (int i7 = 0; i7 < this.f22395l; i7++) {
            vVar.d(this.f22393j[i7], this.f22394k[i7]);
        }
    }

    public void g(w wVar) {
        for (int i4 = 0; i4 < this.f22386c; i4++) {
            wVar.b(this.f22384a[i4], this.f22385b[i4]);
        }
        for (int i5 = 0; i5 < this.f22389f; i5++) {
            wVar.c(this.f22387d[i5], this.f22388e[i5]);
        }
        for (int i6 = 0; i6 < this.f22392i; i6++) {
            wVar.e(this.f22390g[i6], this.f22391h[i6]);
        }
        for (int i7 = 0; i7 < this.f22395l; i7++) {
            wVar.d(this.f22393j[i7], this.f22394k[i7]);
        }
    }

    public void h() {
        this.f22395l = 0;
        this.f22392i = 0;
        this.f22389f = 0;
        this.f22386c = 0;
    }

    public int i(int i4) {
        for (int i5 = 0; i5 < this.f22386c; i5++) {
            if (this.f22384a[i5] == i4) {
                return this.f22385b[i5];
            }
        }
        return -1;
    }
}
