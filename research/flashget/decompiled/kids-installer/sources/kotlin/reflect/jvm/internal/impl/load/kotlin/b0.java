package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.core.view.s1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: TypeMappingMode.kt */
/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: k, reason: collision with root package name */
    @d5.d
    public static final a f24955k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final b0 f24956l;

    /* renamed from: m, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final b0 f24957m;

    /* renamed from: n, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final b0 f24958n;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final b0 f24959o;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final b0 f24960p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final b0 f24961q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final b0 f24962r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final b0 f24963s;

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final b0 f24964t;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24965a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24966b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24967c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f24968d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24969e;

    /* renamed from: f, reason: collision with root package name */
    @d5.e
    private final b0 f24970f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24971g;

    /* renamed from: h, reason: collision with root package name */
    @d5.e
    private final b0 f24972h;

    /* renamed from: i, reason: collision with root package name */
    @d5.e
    private final b0 f24973i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f24974j;

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
        public static final /* synthetic */ int[] f24975a;

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
            f24975a = iArr;
        }
    }

    static {
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        b0 b0Var = null;
        boolean z9 = false;
        b0 b0Var2 = null;
        b0 b0Var3 = null;
        boolean z10 = false;
        kotlin.jvm.internal.w wVar = null;
        b0 b0Var4 = new b0(z5, false, z6, z7, z8, b0Var, z9, b0Var2, b0Var3, z10, 1023, wVar);
        f24956l = b0Var4;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        b0 b0Var5 = null;
        b0 b0Var6 = null;
        boolean z17 = true;
        kotlin.jvm.internal.w wVar2 = null;
        b0 b0Var7 = new b0(z11, z12, z13, z14, z15, null, z16, b0Var5, b0Var6, z17, androidx.core.app.s.f4170u, wVar2);
        f24957m = b0Var7;
        f24958n = new b0(z5, true, z6, z7, z8, b0Var, z9, b0Var2, b0Var3, z10, s1.f5682w, wVar);
        int i5 = 988;
        f24959o = new b0(z5, false, z6, z7, z8, b0Var4, z9, b0Var2, b0Var3, z10, i5, wVar);
        f24960p = new b0(z11, z12, z13, z14, z15, b0Var7, z16, b0Var5, b0Var6, z17, 476, wVar2);
        f24961q = new b0(z5, true, z6, z7, z8, b0Var4, z9, b0Var2, b0Var3, z10, i5, wVar);
        boolean z18 = false;
        boolean z19 = true;
        f24962r = new b0(z5, z18, z6, z19, z8, b0Var4, z9, b0Var2, b0Var3, z10, 983, wVar);
        f24963s = new b0(z5, z18, z6, z19, z8, b0Var4, z9, b0Var2, b0Var3, z10, 919, wVar);
        f24964t = new b0(z5, z18, true, false, z8, b0Var4, z9, b0Var2, b0Var3, z10, 984, wVar);
    }

    public b0() {
        this(false, false, false, false, false, null, false, null, null, false, 1023, null);
    }

    public final boolean a() {
        return this.f24971g;
    }

    public final boolean b() {
        return this.f24974j;
    }

    public final boolean c() {
        return this.f24966b;
    }

    public final boolean d() {
        return this.f24965a;
    }

    public final boolean e() {
        return this.f24967c;
    }

    @d5.d
    public final b0 f(@d5.d x1 x1Var, boolean z5) {
        l0.p(x1Var, ProtectedSandApp.s("䮟"));
        if (!z5 || !this.f24967c) {
            int i5 = b.f24975a[x1Var.ordinal()];
            if (i5 == 1) {
                b0 b0Var = this.f24972h;
                if (b0Var != null) {
                    return b0Var;
                }
            } else if (i5 != 2) {
                b0 b0Var2 = this.f24970f;
                if (b0Var2 != null) {
                    return b0Var2;
                }
            } else {
                b0 b0Var3 = this.f24973i;
                if (b0Var3 != null) {
                    return b0Var3;
                }
            }
        }
        return this;
    }

    @d5.d
    public final b0 g() {
        return new b0(this.f24965a, true, this.f24967c, this.f24968d, this.f24969e, this.f24970f, this.f24971g, this.f24972h, this.f24973i, false, 512, null);
    }

    public b0(boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, @d5.e b0 b0Var, boolean z10, @d5.e b0 b0Var2, @d5.e b0 b0Var3, boolean z11) {
        this.f24965a = z5;
        this.f24966b = z6;
        this.f24967c = z7;
        this.f24968d = z8;
        this.f24969e = z9;
        this.f24970f = b0Var;
        this.f24971g = z10;
        this.f24972h = b0Var2;
        this.f24973i = b0Var3;
        this.f24974j = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ b0(boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, kotlin.reflect.jvm.internal.impl.load.kotlin.b0 r17, boolean r18, kotlin.reflect.jvm.internal.impl.load.kotlin.b0 r19, kotlin.reflect.jvm.internal.impl.load.kotlin.b0 r20, boolean r21, int r22, kotlin.jvm.internal.w r23) {
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.b0.<init>(boolean, boolean, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.load.kotlin.b0, boolean, kotlin.reflect.jvm.internal.impl.load.kotlin.b0, kotlin.reflect.jvm.internal.impl.load.kotlin.b0, boolean, int, kotlin.jvm.internal.w):void");
    }
}
