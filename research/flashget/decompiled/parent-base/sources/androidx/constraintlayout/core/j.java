package androidx.constraintlayout.core;

import androidx.compose.material3.j4;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: SolverVariable.java */
/* loaded from: classes.dex */
public class j implements Comparable<j> {
    public static final int A = 6;
    public static final int B = 7;
    public static final int C = 8;
    private static int D = 1;
    private static int E = 1;
    private static int F = 1;
    private static int G = 1;
    private static int H = 1;
    static final int I = 9;

    /* renamed from: s, reason: collision with root package name */
    private static final boolean f21903s = false;

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f21904t = false;

    /* renamed from: u, reason: collision with root package name */
    public static final int f21905u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f21906v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f21907w = 2;

    /* renamed from: x, reason: collision with root package name */
    public static final int f21908x = 3;

    /* renamed from: y, reason: collision with root package name */
    public static final int f21909y = 4;

    /* renamed from: z, reason: collision with root package name */
    public static final int f21910z = 5;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21911b;

    /* renamed from: c, reason: collision with root package name */
    private String f21912c;

    /* renamed from: d, reason: collision with root package name */
    public int f21913d;

    /* renamed from: e, reason: collision with root package name */
    int f21914e;

    /* renamed from: f, reason: collision with root package name */
    public int f21915f;

    /* renamed from: g, reason: collision with root package name */
    public float f21916g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21917h;

    /* renamed from: i, reason: collision with root package name */
    float[] f21918i;

    /* renamed from: j, reason: collision with root package name */
    float[] f21919j;

    /* renamed from: k, reason: collision with root package name */
    b f21920k;

    /* renamed from: l, reason: collision with root package name */
    androidx.constraintlayout.core.b[] f21921l;

    /* renamed from: m, reason: collision with root package name */
    int f21922m;

    /* renamed from: n, reason: collision with root package name */
    public int f21923n;

    /* renamed from: o, reason: collision with root package name */
    boolean f21924o;

    /* renamed from: p, reason: collision with root package name */
    int f21925p;

    /* renamed from: q, reason: collision with root package name */
    float f21926q;

    /* renamed from: r, reason: collision with root package name */
    HashSet<androidx.constraintlayout.core.b> f21927r;

    /* compiled from: SolverVariable.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21928a;

        static {
            int[] iArr = new int[b.values().length];
            f21928a = iArr;
            try {
                iArr[b.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21928a[b.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21928a[b.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21928a[b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21928a[b.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: SolverVariable.java */
    public enum b {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public j(String str, b bVar) {
        this.f21913d = -1;
        this.f21914e = -1;
        this.f21915f = 0;
        this.f21917h = false;
        this.f21918i = new float[9];
        this.f21919j = new float[9];
        this.f21921l = new androidx.constraintlayout.core.b[16];
        this.f21922m = 0;
        this.f21923n = 0;
        this.f21924o = false;
        this.f21925p = -1;
        this.f21926q = 0.0f;
        this.f21927r = null;
        this.f21912c = str;
        this.f21920k = bVar;
    }

    private static String d(b bVar, String str) {
        if (str != null) {
            StringBuilder a5 = j4.a(str);
            a5.append(E);
            return a5.toString();
        }
        int i4 = a.f21928a[bVar.ordinal()];
        if (i4 == 1) {
            StringBuilder sb = new StringBuilder("U");
            int i5 = F + 1;
            F = i5;
            sb.append(i5);
            return sb.toString();
        }
        if (i4 == 2) {
            StringBuilder sb2 = new StringBuilder("C");
            int i6 = G + 1;
            G = i6;
            sb2.append(i6);
            return sb2.toString();
        }
        if (i4 == 3) {
            StringBuilder sb3 = new StringBuilder("S");
            int i7 = D + 1;
            D = i7;
            sb3.append(i7);
            return sb3.toString();
        }
        if (i4 == 4) {
            StringBuilder sb4 = new StringBuilder("e");
            int i10 = E + 1;
            E = i10;
            sb4.append(i10);
            return sb4.toString();
        }
        if (i4 != 5) {
            throw new AssertionError(bVar.name());
        }
        StringBuilder sb5 = new StringBuilder("V");
        int i11 = H + 1;
        H = i11;
        sb5.append(i11);
        return sb5.toString();
    }

    static void e() {
        E++;
    }

    public final void a(androidx.constraintlayout.core.b bVar) {
        int i4 = 0;
        while (true) {
            int i5 = this.f21922m;
            if (i4 >= i5) {
                androidx.constraintlayout.core.b[] bVarArr = this.f21921l;
                if (i5 >= bVarArr.length) {
                    this.f21921l = (androidx.constraintlayout.core.b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                androidx.constraintlayout.core.b[] bVarArr2 = this.f21921l;
                int i6 = this.f21922m;
                bVarArr2[i6] = bVar;
                this.f21922m = i6 + 1;
                return;
            }
            if (this.f21921l[i4] == bVar) {
                return;
            } else {
                i4++;
            }
        }
    }

    void b() {
        for (int i4 = 0; i4 < 9; i4++) {
            this.f21918i[i4] = 0.0f;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(j jVar) {
        return this.f21913d - jVar.f21913d;
    }

    public final void f(androidx.constraintlayout.core.b bVar) {
        int i4 = this.f21922m;
        int i5 = 0;
        while (i5 < i4) {
            if (this.f21921l[i5] == bVar) {
                while (i5 < i4 - 1) {
                    androidx.constraintlayout.core.b[] bVarArr = this.f21921l;
                    int i6 = i5 + 1;
                    bVarArr[i5] = bVarArr[i6];
                    i5 = i6;
                }
                this.f21922m--;
                return;
            }
            i5++;
        }
    }

    public void g() {
        this.f21912c = null;
        this.f21920k = b.UNKNOWN;
        this.f21915f = 0;
        this.f21913d = -1;
        this.f21914e = -1;
        this.f21916g = 0.0f;
        this.f21917h = false;
        this.f21924o = false;
        this.f21925p = -1;
        this.f21926q = 0.0f;
        int i4 = this.f21922m;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f21921l[i5] = null;
        }
        this.f21922m = 0;
        this.f21923n = 0;
        this.f21911b = false;
        Arrays.fill(this.f21919j, 0.0f);
    }

    public String getName() {
        return this.f21912c;
    }

    public void h(f fVar, float f4) {
        this.f21916g = f4;
        this.f21917h = true;
        this.f21924o = false;
        this.f21925p = -1;
        this.f21926q = 0.0f;
        int i4 = this.f21922m;
        this.f21914e = -1;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f21921l[i5].a(fVar, this, false);
        }
        this.f21922m = 0;
    }

    public void i(String str) {
        this.f21912c = str;
    }

    public void j(f fVar, j jVar, float f4) {
        this.f21924o = true;
        this.f21925p = jVar.f21913d;
        this.f21926q = f4;
        int i4 = this.f21922m;
        this.f21914e = -1;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f21921l[i5].G(fVar, this, false);
        }
        this.f21922m = 0;
        fVar.z();
    }

    public void k(b bVar, String str) {
        this.f21920k = bVar;
    }

    String l() {
        String str = this + "[";
        int i4 = 0;
        boolean z4 = false;
        boolean z5 = true;
        while (i4 < this.f21918i.length) {
            StringBuilder a5 = j4.a(str);
            a5.append(this.f21918i[i4]);
            String sb = a5.toString();
            float[] fArr = this.f21918i;
            float f4 = fArr[i4];
            if (f4 > 0.0f) {
                z4 = false;
            } else if (f4 < 0.0f) {
                z4 = true;
            }
            if (f4 != 0.0f) {
                z5 = false;
            }
            str = i4 < fArr.length - 1 ? androidx.compose.runtime.changelist.j.a(sb, ", ") : androidx.compose.runtime.changelist.j.a(sb, "] ");
            i4++;
        }
        if (z4) {
            str = androidx.compose.runtime.changelist.j.a(str, " (-)");
        }
        return z5 ? androidx.compose.runtime.changelist.j.a(str, " (*)") : str;
    }

    public final void m(f fVar, androidx.constraintlayout.core.b bVar) {
        int i4 = this.f21922m;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f21921l[i5].c(fVar, bVar, false);
        }
        this.f21922m = 0;
    }

    public String toString() {
        if (this.f21912c != null) {
            return "" + this.f21912c;
        }
        return "" + this.f21913d;
    }

    public j(b bVar, String str) {
        this.f21913d = -1;
        this.f21914e = -1;
        this.f21915f = 0;
        this.f21917h = false;
        this.f21918i = new float[9];
        this.f21919j = new float[9];
        this.f21921l = new androidx.constraintlayout.core.b[16];
        this.f21922m = 0;
        this.f21923n = 0;
        this.f21924o = false;
        this.f21925p = -1;
        this.f21926q = 0.0f;
        this.f21927r = null;
        this.f21920k = bVar;
    }
}
