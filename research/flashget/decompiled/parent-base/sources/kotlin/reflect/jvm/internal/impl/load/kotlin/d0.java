package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: TypeMappingMode.kt */
/* loaded from: classes7.dex */
public final class d0 {

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    public static final a f76835k = new a();

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d0 f76836l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d0 f76837m;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d0 f76838n;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d0 f76839o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d0 f76840p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d0 f76841q;

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d0 f76842r;

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d0 f76843s;

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final d0 f76844t;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f76845a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f76846b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f76847c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f76848d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f76849e;

    /* renamed from: f, reason: collision with root package name */
    @fg.m
    private final d0 f76850f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f76851g;

    /* renamed from: h, reason: collision with root package name */
    @fg.m
    private final d0 f76852h;

    /* renamed from: i, reason: collision with root package name */
    @fg.m
    private final d0 f76853i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f76854j;

    /* compiled from: TypeMappingMode.kt */
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: TypeMappingMode.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76855a;

        static {
            int[] iArr = new int[x1.values().length];
            try {
                iArr[x1.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x1.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f76855a = iArr;
        }
    }

    static {
        kotlin.jvm.internal.w wVar = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        d0 d0Var = null;
        boolean z10 = false;
        d0 d0Var2 = null;
        d0 d0Var3 = null;
        boolean z11 = false;
        d0 d0Var4 = new d0(z4, false, z5, z6, z7, d0Var, z10, d0Var2, d0Var3, z11, 1023, wVar);
        f76836l = d0Var4;
        kotlin.jvm.internal.w wVar2 = null;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        d0 d0Var5 = null;
        d0 d0Var6 = null;
        boolean z18 = true;
        d0 d0Var7 = new d0(z12, z13, z14, z15, z16, null, z17, d0Var5, d0Var6, z18, 511, wVar2);
        f76837m = d0Var7;
        f76838n = new d0(z4, true, z5, z6, z7, d0Var, z10, d0Var2, d0Var3, z11, 1021, wVar);
        int i4 = 988;
        f76839o = new d0(z4, false, z5, z6, z7, d0Var4, z10, d0Var2, d0Var3, z11, i4, wVar);
        f76840p = new d0(z12, z13, z14, z15, z16, d0Var7, z17, d0Var5, d0Var6, z18, 476, wVar2);
        f76841q = new d0(z4, true, z5, z6, z7, d0Var4, z10, d0Var2, d0Var3, z11, i4, wVar);
        boolean z19 = false;
        boolean z20 = true;
        f76842r = new d0(z4, z19, z5, z20, z7, d0Var4, z10, d0Var2, d0Var3, z11, 983, wVar);
        f76843s = new d0(z4, z19, z5, z20, z7, d0Var4, z10, d0Var2, d0Var3, z11, 919, wVar);
        f76844t = new d0(z4, z19, true, false, z7, d0Var4, z10, d0Var2, d0Var3, z11, 984, wVar);
    }

    public d0() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    public final boolean a() {
        return this.f76851g;
    }

    public final boolean b() {
        return this.f76854j;
    }

    public final boolean c() {
        return this.f76846b;
    }

    public final boolean d() {
        return this.f76845a;
    }

    public final boolean e() {
        return this.f76847c;
    }

    @fg.l
    public final d0 f(@fg.l x1 x1Var, boolean z4) {
        l0.p(x1Var, ProtectedSandApp.s("玥\u0001"));
        if (!z4 || !this.f76847c) {
            int i4 = b.f76855a[x1Var.ordinal()];
            if (i4 == 1) {
                d0 d0Var = this.f76852h;
                if (d0Var != null) {
                    return d0Var;
                }
            } else if (i4 != 2) {
                d0 d0Var2 = this.f76850f;
                if (d0Var2 != null) {
                    return d0Var2;
                }
            } else {
                d0 d0Var3 = this.f76853i;
                if (d0Var3 != null) {
                    return d0Var3;
                }
            }
        }
        return this;
    }

    @fg.l
    public final d0 g() {
        return new d0(this.f76845a, true, this.f76847c, this.f76848d, this.f76849e, this.f76850f, this.f76851g, this.f76852h, this.f76853i, false, 512, null);
    }

    public d0(boolean z4, boolean z5, boolean z6, boolean z7, boolean z10, @fg.m d0 d0Var, boolean z11, @fg.m d0 d0Var2, @fg.m d0 d0Var3, boolean z12) {
        this.f76845a = z4;
        this.f76846b = z5;
        this.f76847c = z6;
        this.f76848d = z7;
        this.f76849e = z10;
        this.f76850f = d0Var;
        this.f76851g = z11;
        this.f76852h = d0Var2;
        this.f76853i = d0Var3;
        this.f76854j = z12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ d0(boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, kotlin.reflect.jvm.internal.impl.load.kotlin.d0 r17, boolean r18, kotlin.reflect.jvm.internal.impl.load.kotlin.d0 r19, kotlin.reflect.jvm.internal.impl.load.kotlin.d0 r20, boolean r21, int r22, kotlin.jvm.internal.w r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 1
            if (r1 == 0) goto L9
            r1 = r2
            goto La
        L9:
            r1 = r12
        La:
            r3 = r0 & 2
            if (r3 == 0) goto L10
            r3 = r2
            goto L11
        L10:
            r3 = r13
        L11:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L18
            r4 = r5
            goto L19
        L18:
            r4 = r14
        L19:
            r6 = r0 & 8
            if (r6 == 0) goto L1f
            r6 = r5
            goto L20
        L1f:
            r6 = r15
        L20:
            r7 = r0 & 16
            if (r7 == 0) goto L26
            r7 = r5
            goto L28
        L26:
            r7 = r16
        L28:
            r8 = r0 & 32
            if (r8 == 0) goto L2e
            r8 = 0
            goto L30
        L2e:
            r8 = r17
        L30:
            r9 = r0 & 64
            if (r9 == 0) goto L35
            goto L37
        L35:
            r2 = r18
        L37:
            r9 = r0 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L3d
            r9 = r8
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L45
            r10 = r8
            goto L47
        L45:
            r10 = r20
        L47:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r5 = r21
        L4e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r2
            r20 = r9
            r21 = r10
            r22 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.d0.<init>(boolean, boolean, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.load.kotlin.d0, boolean, kotlin.reflect.jvm.internal.impl.load.kotlin.d0, kotlin.reflect.jvm.internal.impl.load.kotlin.d0, boolean, int, kotlin.jvm.internal.w):void");
    }
}
