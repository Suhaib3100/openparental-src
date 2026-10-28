package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.w;
import androidx.constraintlayout.core.state.h;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: ConstraintReference.java */
/* loaded from: classes.dex */
public class a implements e {

    /* renamed from: a, reason: collision with root package name */
    private Object f22629a;

    /* renamed from: a0, reason: collision with root package name */
    private float f22630a0;

    /* renamed from: b, reason: collision with root package name */
    final h f22631b;

    /* renamed from: b0, reason: collision with root package name */
    private float f22632b0;

    /* renamed from: d0, reason: collision with root package name */
    androidx.constraintlayout.core.state.b f22636d0;

    /* renamed from: e0, reason: collision with root package name */
    androidx.constraintlayout.core.state.b f22638e0;

    /* renamed from: f0, reason: collision with root package name */
    private Object f22640f0;

    /* renamed from: g0, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.e f22642g0;

    /* renamed from: h0, reason: collision with root package name */
    private HashMap<String, Integer> f22644h0;

    /* renamed from: i0, reason: collision with root package name */
    private HashMap<String, Float> f22646i0;

    /* renamed from: c, reason: collision with root package name */
    String f22633c = null;

    /* renamed from: d, reason: collision with root package name */
    androidx.constraintlayout.core.state.helpers.e f22635d = null;

    /* renamed from: e, reason: collision with root package name */
    int f22637e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f22639f = 0;

    /* renamed from: g, reason: collision with root package name */
    float f22641g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    float f22643h = -1.0f;

    /* renamed from: i, reason: collision with root package name */
    float f22645i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    float f22647j = 0.5f;

    /* renamed from: k, reason: collision with root package name */
    protected int f22648k = 0;

    /* renamed from: l, reason: collision with root package name */
    protected int f22649l = 0;

    /* renamed from: m, reason: collision with root package name */
    protected int f22650m = 0;

    /* renamed from: n, reason: collision with root package name */
    protected int f22651n = 0;

    /* renamed from: o, reason: collision with root package name */
    protected int f22652o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected int f22653p = 0;

    /* renamed from: q, reason: collision with root package name */
    protected int f22654q = 0;

    /* renamed from: r, reason: collision with root package name */
    protected int f22655r = 0;

    /* renamed from: s, reason: collision with root package name */
    protected int f22656s = 0;

    /* renamed from: t, reason: collision with root package name */
    protected int f22657t = 0;

    /* renamed from: u, reason: collision with root package name */
    protected int f22658u = 0;

    /* renamed from: v, reason: collision with root package name */
    protected int f22659v = 0;

    /* renamed from: w, reason: collision with root package name */
    int f22660w = 0;

    /* renamed from: x, reason: collision with root package name */
    int f22661x = 0;

    /* renamed from: y, reason: collision with root package name */
    float f22662y = Float.NaN;

    /* renamed from: z, reason: collision with root package name */
    float f22663z = Float.NaN;
    float A = Float.NaN;
    float B = Float.NaN;
    float C = Float.NaN;
    float D = Float.NaN;
    float E = Float.NaN;
    float F = Float.NaN;
    float G = Float.NaN;
    float H = Float.NaN;
    float I = Float.NaN;
    int J = 0;
    protected Object K = null;
    protected Object L = null;
    protected Object M = null;
    protected Object N = null;
    protected Object O = null;
    protected Object P = null;
    protected Object Q = null;
    protected Object R = null;
    protected Object S = null;
    protected Object T = null;
    protected Object U = null;
    protected Object V = null;
    Object W = null;
    Object X = null;
    Object Y = null;
    Object Z = null;

    /* renamed from: c0, reason: collision with root package name */
    h.c f22634c0 = null;

    /* compiled from: ConstraintReference.java */
    /* renamed from: androidx.constraintlayout.core.state.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0388a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22664a;

        static {
            int[] iArr = new int[h.c.values().length];
            f22664a = iArr;
            try {
                iArr[h.c.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22664a[h.c.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22664a[h.c.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22664a[h.c.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22664a[h.c.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22664a[h.c.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22664a[h.c.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22664a[h.c.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22664a[h.c.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22664a[h.c.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22664a[h.c.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22664a[h.c.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22664a[h.c.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22664a[h.c.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22664a[h.c.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22664a[h.c.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22664a[h.c.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22664a[h.c.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* compiled from: ConstraintReference.java */
    public interface b {
        a a(h hVar);
    }

    /* compiled from: ConstraintReference.java */
    static class c extends Exception {

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f22665b;

        public c(ArrayList<String> arrayList) {
            this.f22665b = arrayList;
        }

        public ArrayList<String> a() {
            return this.f22665b;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IncorrectConstraintException: " + this.f22665b.toString();
        }
    }

    public a(h hVar) {
        Object obj = androidx.constraintlayout.core.state.b.f22667j;
        this.f22636d0 = androidx.constraintlayout.core.state.b.b(obj);
        this.f22638e0 = androidx.constraintlayout.core.state.b.b(obj);
        this.f22644h0 = new HashMap<>();
        this.f22646i0 = new HashMap<>();
        this.f22631b = hVar;
    }

    private Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof a) ? this.f22631b.r(obj) : obj;
    }

    private androidx.constraintlayout.core.widgets.e O(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).a();
        }
        return null;
    }

    private void h(androidx.constraintlayout.core.widgets.e eVar, Object obj, h.c cVar) {
        androidx.constraintlayout.core.widgets.e O = O(obj);
        if (O == null) {
        }
        int[] iArr = C0388a.f22664a;
        int i4 = iArr[cVar.ordinal()];
        switch (iArr[cVar.ordinal()]) {
            case 1:
                d.b bVar = d.b.LEFT;
                eVar.r(bVar).b(O.r(bVar), this.f22648k, this.f22654q, false);
                break;
            case 2:
                eVar.r(d.b.LEFT).b(O.r(d.b.RIGHT), this.f22648k, this.f22654q, false);
                break;
            case 3:
                eVar.r(d.b.RIGHT).b(O.r(d.b.LEFT), this.f22649l, this.f22655r, false);
                break;
            case 4:
                d.b bVar2 = d.b.RIGHT;
                eVar.r(bVar2).b(O.r(bVar2), this.f22649l, this.f22655r, false);
                break;
            case 5:
                d.b bVar3 = d.b.LEFT;
                eVar.r(bVar3).b(O.r(bVar3), this.f22650m, this.f22656s, false);
                break;
            case 6:
                eVar.r(d.b.LEFT).b(O.r(d.b.RIGHT), this.f22650m, this.f22656s, false);
                break;
            case 7:
                eVar.r(d.b.RIGHT).b(O.r(d.b.LEFT), this.f22651n, this.f22657t, false);
                break;
            case 8:
                d.b bVar4 = d.b.RIGHT;
                eVar.r(bVar4).b(O.r(bVar4), this.f22651n, this.f22657t, false);
                break;
            case 9:
                d.b bVar5 = d.b.TOP;
                eVar.r(bVar5).b(O.r(bVar5), this.f22652o, this.f22658u, false);
                break;
            case 10:
                eVar.r(d.b.TOP).b(O.r(d.b.BOTTOM), this.f22652o, this.f22658u, false);
                break;
            case 11:
                eVar.r(d.b.BOTTOM).b(O.r(d.b.TOP), this.f22653p, this.f22659v, false);
                break;
            case 12:
                d.b bVar6 = d.b.BOTTOM;
                eVar.r(bVar6).b(O.r(bVar6), this.f22653p, this.f22659v, false);
                break;
            case 13:
                eVar.v0(d.b.BASELINE, O, d.b.BOTTOM, this.f22660w, this.f22661x);
                break;
            case 14:
                eVar.v0(d.b.BASELINE, O, d.b.TOP, this.f22660w, this.f22661x);
                break;
            case 15:
                d.b bVar7 = d.b.BASELINE;
                eVar.v0(bVar7, O, bVar7, this.f22660w, this.f22661x);
                break;
            case 16:
                eVar.m(O, this.f22630a0, (int) this.f22632b0);
                break;
        }
    }

    private void x() {
        this.K = B(this.K);
        this.L = B(this.L);
        this.M = B(this.M);
        this.N = B(this.N);
        this.O = B(this.O);
        this.P = B(this.P);
        this.Q = B(this.Q);
        this.R = B(this.R);
        this.S = B(this.S);
        this.T = B(this.T);
        this.U = B(this.U);
        this.V = B(this.V);
        this.W = B(this.W);
        this.X = B(this.X);
        this.Y = B(this.Y);
    }

    public a A(Object obj) {
        this.f22634c0 = h.c.END_TO_START;
        this.Q = obj;
        return this;
    }

    public a A0(Object obj) {
        this.f22634c0 = h.c.START_TO_START;
        this.O = obj;
        return this;
    }

    public a B0() {
        if (this.S != null) {
            this.f22634c0 = h.c.TOP_TO_TOP;
        } else {
            this.f22634c0 = h.c.TOP_TO_BOTTOM;
        }
        return this;
    }

    public float C() {
        return this.G;
    }

    public a C0(Object obj) {
        this.f22634c0 = h.c.TOP_TO_BOTTOM;
        this.T = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.b D() {
        return this.f22638e0;
    }

    public a D0(Object obj) {
        this.f22634c0 = h.c.TOP_TO_TOP;
        this.S = obj;
        return this;
    }

    public int E() {
        return this.f22637e;
    }

    public a E0(float f4) {
        this.D = f4;
        return this;
    }

    public float F() {
        return this.f22641g;
    }

    public a F0(float f4) {
        this.E = f4;
        return this;
    }

    public float G() {
        return this.f22662y;
    }

    public a G0(float f4) {
        this.F = f4;
        return this;
    }

    public float H() {
        return this.f22663z;
    }

    public void H0() throws c {
        ArrayList arrayList = new ArrayList();
        if (this.K != null && this.L != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.M != null && this.N != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.O != null && this.P != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.Q != null && this.R != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.K != null || this.L != null || this.M != null || this.N != null) && (this.O != null || this.P != null || this.Q != null || this.R != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new c(arrayList);
        }
    }

    public float I() {
        return this.A;
    }

    public a I0(float f4) {
        this.f22647j = f4;
        return this;
    }

    public float J() {
        return this.B;
    }

    public a J0(int i4) {
        this.J = i4;
        return this;
    }

    public float K() {
        return this.C;
    }

    public a K0(androidx.constraintlayout.core.state.b bVar) {
        return x0(bVar);
    }

    public float L() {
        return this.H;
    }

    public float M() {
        return this.I;
    }

    public String N() {
        return this.f22633c;
    }

    public float P() {
        return this.D;
    }

    public float Q() {
        return this.E;
    }

    public float R() {
        return this.F;
    }

    public int S(int i4) {
        return this.f22639f;
    }

    public float T() {
        return this.f22643h;
    }

    public Object U() {
        return this.f22640f0;
    }

    public androidx.constraintlayout.core.state.b V() {
        return this.f22636d0;
    }

    public a W(androidx.constraintlayout.core.state.b bVar) {
        return q0(bVar);
    }

    public a X(float f4) {
        this.f22645i = f4;
        return this;
    }

    public a Y() {
        if (this.K != null) {
            this.f22634c0 = h.c.LEFT_TO_LEFT;
        } else {
            this.f22634c0 = h.c.LEFT_TO_RIGHT;
        }
        return this;
    }

    public a Z(Object obj) {
        this.f22634c0 = h.c.LEFT_TO_LEFT;
        this.K = obj;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.e
    public androidx.constraintlayout.core.widgets.e a() {
        if (this.f22642g0 == null) {
            androidx.constraintlayout.core.widgets.e w4 = w();
            this.f22642g0 = w4;
            w4.h1(this.f22640f0);
        }
        return this.f22642g0;
    }

    public a a0(Object obj) {
        this.f22634c0 = h.c.LEFT_TO_RIGHT;
        this.L = obj;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.e
    public void apply() {
        if (this.f22642g0 == null) {
            return;
        }
        androidx.constraintlayout.core.state.helpers.e eVar = this.f22635d;
        if (eVar != null) {
            eVar.apply();
        }
        this.f22636d0.j(this.f22631b, this.f22642g0, 0);
        this.f22638e0.j(this.f22631b, this.f22642g0, 1);
        x();
        h(this.f22642g0, this.K, h.c.LEFT_TO_LEFT);
        h(this.f22642g0, this.L, h.c.LEFT_TO_RIGHT);
        h(this.f22642g0, this.M, h.c.RIGHT_TO_LEFT);
        h(this.f22642g0, this.N, h.c.RIGHT_TO_RIGHT);
        h(this.f22642g0, this.O, h.c.START_TO_START);
        h(this.f22642g0, this.P, h.c.START_TO_END);
        h(this.f22642g0, this.Q, h.c.END_TO_START);
        h(this.f22642g0, this.R, h.c.END_TO_END);
        h(this.f22642g0, this.S, h.c.TOP_TO_TOP);
        h(this.f22642g0, this.T, h.c.TOP_TO_BOTTOM);
        h(this.f22642g0, this.U, h.c.BOTTOM_TO_TOP);
        h(this.f22642g0, this.V, h.c.BOTTOM_TO_BOTTOM);
        h(this.f22642g0, this.W, h.c.BASELINE_TO_BASELINE);
        h(this.f22642g0, this.X, h.c.BASELINE_TO_TOP);
        h(this.f22642g0, this.Y, h.c.BASELINE_TO_BOTTOM);
        h(this.f22642g0, this.Z, h.c.CIRCULAR_CONSTRAINT);
        int i4 = this.f22637e;
        if (i4 != 0) {
            this.f22642g0.B1(i4);
        }
        int i5 = this.f22639f;
        if (i5 != 0) {
            this.f22642g0.W1(i5);
        }
        float f4 = this.f22641g;
        if (f4 != -1.0f) {
            this.f22642g0.F1(f4);
        }
        float f5 = this.f22643h;
        if (f5 != -1.0f) {
            this.f22642g0.a2(f5);
        }
        this.f22642g0.A1(this.f22645i);
        this.f22642g0.V1(this.f22647j);
        androidx.constraintlayout.core.widgets.e eVar2 = this.f22642g0;
        r rVar = eVar2.f22959n;
        rVar.f22756f = this.f22662y;
        rVar.f22757g = this.f22663z;
        rVar.f22758h = this.A;
        rVar.f22759i = this.B;
        rVar.f22760j = this.C;
        rVar.f22761k = this.D;
        rVar.f22762l = this.E;
        rVar.f22763m = this.F;
        rVar.f22764n = this.H;
        rVar.f22765o = this.I;
        rVar.f22766p = this.G;
        int i6 = this.J;
        rVar.f22768r = i6;
        eVar2.b2(i6);
        HashMap<String, Integer> hashMap = this.f22644h0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                this.f22642g0.f22959n.w(str, w.b.f22440l, this.f22644h0.get(str).intValue());
            }
        }
        HashMap<String, Float> hashMap2 = this.f22646i0;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                this.f22642g0.f22959n.v(str2, w.b.f22439k, this.f22646i0.get(str2).floatValue());
            }
        }
    }

    @Override // androidx.constraintlayout.core.state.e
    public void b(androidx.constraintlayout.core.widgets.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f22642g0 = eVar;
        eVar.h1(this.f22640f0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a b0(int i4) {
        h.c cVar = this.f22634c0;
        if (cVar != null) {
            switch (C0388a.f22664a[cVar.ordinal()]) {
                case 1:
                case 2:
                    this.f22648k = i4;
                    break;
                case 3:
                case 4:
                    this.f22649l = i4;
                    break;
                case 5:
                case 6:
                    this.f22650m = i4;
                    break;
                case 7:
                case 8:
                    this.f22651n = i4;
                    break;
                case 9:
                case 10:
                    this.f22652o = i4;
                    break;
                case 11:
                case 12:
                    this.f22653p = i4;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f22660w = i4;
                    break;
                case 16:
                    this.f22632b0 = i4;
                    break;
            }
        } else {
            this.f22648k = i4;
            this.f22649l = i4;
            this.f22650m = i4;
            this.f22651n = i4;
            this.f22652o = i4;
            this.f22653p = i4;
        }
        return this;
    }

    @Override // androidx.constraintlayout.core.state.e
    public void c(Object obj) {
        this.f22629a = obj;
    }

    public a c0(Object obj) {
        return b0(this.f22631b.f(obj));
    }

    @Override // androidx.constraintlayout.core.state.e
    public androidx.constraintlayout.core.state.helpers.e d() {
        return this.f22635d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a d0(int i4) {
        h.c cVar = this.f22634c0;
        if (cVar != null) {
            switch (C0388a.f22664a[cVar.ordinal()]) {
                case 1:
                case 2:
                    this.f22654q = i4;
                    break;
                case 3:
                case 4:
                    this.f22655r = i4;
                    break;
                case 5:
                case 6:
                    this.f22656s = i4;
                    break;
                case 7:
                case 8:
                    this.f22657t = i4;
                    break;
                case 9:
                case 10:
                    this.f22658u = i4;
                    break;
                case 11:
                case 12:
                    this.f22659v = i4;
                    break;
                case 13:
                case 14:
                case 15:
                    this.f22661x = i4;
                    break;
            }
        } else {
            this.f22654q = i4;
            this.f22655r = i4;
            this.f22656s = i4;
            this.f22657t = i4;
            this.f22658u = i4;
            this.f22659v = i4;
        }
        return this;
    }

    public void e(String str, int i4) {
        this.f22644h0.put(str, Integer.valueOf(i4));
    }

    public a e0(Object obj) {
        return d0(this.f22631b.f(obj));
    }

    public void f(String str, float f4) {
        if (this.f22646i0 == null) {
            this.f22646i0 = new HashMap<>();
        }
        this.f22646i0.put(str, Float.valueOf(f4));
    }

    public a f0(float f4) {
        this.f22662y = f4;
        return this;
    }

    public a g(float f4) {
        this.G = f4;
        return this;
    }

    public a g0(float f4) {
        this.f22663z = f4;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.e
    public Object getKey() {
        return this.f22629a;
    }

    public a h0() {
        if (this.M != null) {
            this.f22634c0 = h.c.RIGHT_TO_LEFT;
        } else {
            this.f22634c0 = h.c.RIGHT_TO_RIGHT;
        }
        return this;
    }

    public a i() {
        this.f22634c0 = h.c.BASELINE_TO_BASELINE;
        return this;
    }

    public a i0(Object obj) {
        this.f22634c0 = h.c.RIGHT_TO_LEFT;
        this.M = obj;
        return this;
    }

    public a j(Object obj) {
        this.f22634c0 = h.c.BASELINE_TO_BASELINE;
        this.W = obj;
        return this;
    }

    public a j0(Object obj) {
        this.f22634c0 = h.c.RIGHT_TO_RIGHT;
        this.N = obj;
        return this;
    }

    public a k(Object obj) {
        this.f22634c0 = h.c.BASELINE_TO_BOTTOM;
        this.Y = obj;
        return this;
    }

    public a k0(float f4) {
        this.A = f4;
        return this;
    }

    public a l(Object obj) {
        this.f22634c0 = h.c.BASELINE_TO_TOP;
        this.X = obj;
        return this;
    }

    public a l0(float f4) {
        this.B = f4;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a m(float f4) {
        h.c cVar = this.f22634c0;
        if (cVar == null) {
            return this;
        }
        int i4 = C0388a.f22664a[cVar.ordinal()];
        if (i4 != 17) {
            if (i4 != 18) {
                switch (i4) {
                }
            }
            this.f22647j = f4;
            return this;
        }
        this.f22645i = f4;
        return this;
    }

    public a m0(float f4) {
        this.C = f4;
        return this;
    }

    public a n() {
        if (this.U != null) {
            this.f22634c0 = h.c.BOTTOM_TO_TOP;
        } else {
            this.f22634c0 = h.c.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public a n0(float f4) {
        this.H = f4;
        return this;
    }

    public a o(Object obj) {
        this.f22634c0 = h.c.BOTTOM_TO_BOTTOM;
        this.V = obj;
        return this;
    }

    public a o0(float f4) {
        this.I = f4;
        return this;
    }

    public a p(Object obj) {
        this.f22634c0 = h.c.BOTTOM_TO_TOP;
        this.U = obj;
        return this;
    }

    public void p0(androidx.constraintlayout.core.state.helpers.e eVar) {
        this.f22635d = eVar;
        if (eVar != null) {
            b(eVar.a());
        }
    }

    public a q(Object obj) {
        Object B = B(obj);
        this.O = B;
        this.R = B;
        this.f22634c0 = h.c.CENTER_HORIZONTALLY;
        this.f22645i = 0.5f;
        return this;
    }

    public a q0(androidx.constraintlayout.core.state.b bVar) {
        this.f22638e0 = bVar;
        return this;
    }

    public a r(Object obj) {
        Object B = B(obj);
        this.S = B;
        this.V = B;
        this.f22634c0 = h.c.CENTER_VERTICALLY;
        this.f22647j = 0.5f;
        return this;
    }

    public void r0(int i4) {
        this.f22637e = i4;
    }

    public a s(Object obj, float f4, float f5) {
        this.Z = B(obj);
        this.f22630a0 = f4;
        this.f22632b0 = f5;
        this.f22634c0 = h.c.CIRCULAR_CONSTRAINT;
        return this;
    }

    public void s0(float f4) {
        this.f22641g = f4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a t() {
        h.c cVar = this.f22634c0;
        if (cVar != null) {
            switch (C0388a.f22664a[cVar.ordinal()]) {
                case 1:
                case 2:
                    this.K = null;
                    this.L = null;
                    this.f22648k = 0;
                    this.f22654q = 0;
                    break;
                case 3:
                case 4:
                    this.M = null;
                    this.N = null;
                    this.f22649l = 0;
                    this.f22655r = 0;
                    break;
                case 5:
                case 6:
                    this.O = null;
                    this.P = null;
                    this.f22650m = 0;
                    this.f22656s = 0;
                    break;
                case 7:
                case 8:
                    this.Q = null;
                    this.R = null;
                    this.f22651n = 0;
                    this.f22657t = 0;
                    break;
                case 9:
                case 10:
                    this.S = null;
                    this.T = null;
                    this.f22652o = 0;
                    this.f22658u = 0;
                    break;
                case 11:
                case 12:
                    this.U = null;
                    this.V = null;
                    this.f22653p = 0;
                    this.f22659v = 0;
                    break;
                case 15:
                    this.W = null;
                    break;
                case 16:
                    this.Z = null;
                    break;
            }
        } else {
            this.K = null;
            this.L = null;
            this.f22648k = 0;
            this.M = null;
            this.N = null;
            this.f22649l = 0;
            this.O = null;
            this.P = null;
            this.f22650m = 0;
            this.Q = null;
            this.R = null;
            this.f22651n = 0;
            this.S = null;
            this.T = null;
            this.f22652o = 0;
            this.U = null;
            this.V = null;
            this.f22653p = 0;
            this.W = null;
            this.Z = null;
            this.f22645i = 0.5f;
            this.f22647j = 0.5f;
            this.f22654q = 0;
            this.f22655r = 0;
            this.f22656s = 0;
            this.f22657t = 0;
            this.f22658u = 0;
            this.f22659v = 0;
        }
        return this;
    }

    public void t0(String str) {
        this.f22633c = str;
    }

    public a u() {
        y0().t();
        y().t();
        Y().t();
        h0().t();
        return this;
    }

    public void u0(int i4) {
        this.f22639f = i4;
    }

    public a v() {
        B0().t();
        i().t();
        n().t();
        return this;
    }

    public void v0(float f4) {
        this.f22643h = f4;
    }

    public androidx.constraintlayout.core.widgets.e w() {
        return new androidx.constraintlayout.core.widgets.e(0, 0, V().n(), D().n());
    }

    public void w0(Object obj) {
        this.f22640f0 = obj;
        androidx.constraintlayout.core.widgets.e eVar = this.f22642g0;
        if (eVar != null) {
            eVar.h1(obj);
        }
    }

    public a x0(androidx.constraintlayout.core.state.b bVar) {
        this.f22636d0 = bVar;
        return this;
    }

    public a y() {
        if (this.Q != null) {
            this.f22634c0 = h.c.END_TO_START;
        } else {
            this.f22634c0 = h.c.END_TO_END;
        }
        return this;
    }

    public a y0() {
        if (this.O != null) {
            this.f22634c0 = h.c.START_TO_START;
        } else {
            this.f22634c0 = h.c.START_TO_END;
        }
        return this;
    }

    public a z(Object obj) {
        this.f22634c0 = h.c.END_TO_END;
        this.R = obj;
        return this;
    }

    public a z0(Object obj) {
        this.f22634c0 = h.c.START_TO_END;
        this.P = obj;
        return this;
    }
}
