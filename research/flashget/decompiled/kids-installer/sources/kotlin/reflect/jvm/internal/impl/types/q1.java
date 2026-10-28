package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.l;

/* compiled from: TypeSubstitutor.java */
/* loaded from: classes5.dex */
public class q1 {

    /* renamed from: b, reason: collision with root package name */
    public static final q1 f26523b = g(o1.f26512b);

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f26524c = false;

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final o1 f26525a;

    /* compiled from: TypeSubstitutor.java */
    /* loaded from: classes6.dex */
    static class a implements q3.l<kotlin.reflect.jvm.internal.impl.name.c, Boolean> {
        a() {
        }

        private static /* synthetic */ void a(int i5) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("覂"), ProtectedSandApp.s("西"), ProtectedSandApp.s("覀"), ProtectedSandApp.s("要")));
        }

        @Override // q3.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean N(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
            if (cVar == null) {
                a(0);
            }
            return Boolean.valueOf(!cVar.equals(l.a.Q));
        }
    }

    /* compiled from: TypeSubstitutor.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26526a;

        static {
            int[] iArr = new int[d.values().length];
            f26526a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26526a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26526a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: TypeSubstitutor.java */
    private static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* compiled from: TypeSubstitutor.java */
    private enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected q1(@d5.d o1 o1Var) {
        if (o1Var == null) {
            a(7);
        }
        this.f26525a = o1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0043 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0025 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.q1.a(int):void");
    }

    private static void b(int i5, l1 l1Var, o1 o1Var) {
        if (i5 <= 100) {
            return;
        }
        throw new IllegalStateException(ProtectedSandApp.s("垳") + o(l1Var) + ProtectedSandApp.s("垴") + o(o1Var));
    }

    @d5.d
    public static x1 c(@d5.d x1 x1Var, @d5.d l1 l1Var) {
        if (x1Var == null) {
            a(35);
        }
        if (l1Var == null) {
            a(36);
        }
        if (!l1Var.c()) {
            return d(x1Var, l1Var.b());
        }
        x1 x1Var2 = x1.OUT_VARIANCE;
        if (x1Var2 == null) {
            a(37);
        }
        return x1Var2;
    }

    @d5.d
    public static x1 d(@d5.d x1 x1Var, @d5.d x1 x1Var2) {
        if (x1Var == null) {
            a(38);
        }
        if (x1Var2 == null) {
            a(39);
        }
        x1 x1Var3 = x1.INVARIANT;
        if (x1Var == x1Var3) {
            if (x1Var2 == null) {
                a(40);
            }
            return x1Var2;
        }
        if (x1Var2 == x1Var3) {
            if (x1Var == null) {
                a(41);
            }
            return x1Var;
        }
        if (x1Var == x1Var2) {
            if (x1Var2 == null) {
                a(42);
            }
            return x1Var2;
        }
        throw new AssertionError(ProtectedSandApp.s("垵") + x1Var + ProtectedSandApp.s("垶") + x1Var2 + ProtectedSandApp.s("垷"));
    }

    private static d e(x1 x1Var, x1 x1Var2) {
        x1 x1Var3 = x1.IN_VARIANCE;
        return (x1Var == x1Var3 && x1Var2 == x1.OUT_VARIANCE) ? d.OUT_IN_IN_POSITION : (x1Var == x1.OUT_VARIANCE && x1Var2 == x1Var3) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    @d5.d
    public static q1 f(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(6);
        }
        return g(i1.i(h0Var.U0(), h0Var.S0()));
    }

    @d5.d
    public static q1 g(@d5.d o1 o1Var) {
        if (o1Var == null) {
            a(0);
        }
        return new q1(o1Var);
    }

    @d5.d
    public static q1 h(@d5.d o1 o1Var, @d5.d o1 o1Var2) {
        if (o1Var == null) {
            a(3);
        }
        if (o1Var2 == null) {
            a(4);
        }
        return g(v.i(o1Var, o1Var2));
    }

    @d5.d
    private static kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (gVar == null) {
            a(33);
        }
        return !gVar.O0(l.a.Q) ? gVar : new kotlin.reflect.jvm.internal.impl.descriptors.annotations.l(gVar, new a());
    }

    @d5.d
    private static l1 l(@d5.d h0 h0Var, @d5.d l1 l1Var, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, @d5.d l1 l1Var2) {
        if (h0Var == null) {
            a(26);
        }
        if (l1Var == null) {
            a(27);
        }
        if (l1Var2 == null) {
            a(28);
        }
        if (!h0Var.getAnnotations().O0(l.a.Q)) {
            if (l1Var == null) {
                a(29);
            }
            return l1Var;
        }
        h1 U0 = l1Var.getType().U0();
        if (!(U0 instanceof kotlin.reflect.jvm.internal.impl.types.checker.j)) {
            return l1Var;
        }
        l1 e6 = ((kotlin.reflect.jvm.internal.impl.types.checker.j) U0).e();
        x1 b6 = e6.b();
        d e7 = e(l1Var2.b(), b6);
        d dVar = d.OUT_IN_IN_POSITION;
        return e7 == dVar ? new n1(e6.getType()) : f1Var == null ? l1Var : e(f1Var.z(), b6) == dVar ? new n1(e6.getType()) : l1Var;
    }

    private static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (kotlin.reflect.jvm.internal.impl.utils.c.a(th)) {
                throw th;
            }
            return ProtectedSandApp.s("垸") + th + ProtectedSandApp.s("垹");
        }
    }

    private l1 r(l1 l1Var, int i5) throws c {
        h0 type = l1Var.getType();
        x1 b6 = l1Var.b();
        if (type.U0().b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) {
            return l1Var;
        }
        p0 b7 = t0.b(type);
        h0 p5 = b7 != null ? m().p(b7, x1.INVARIANT) : null;
        h0 b8 = p1.b(type, s(type.U0().r(), type.S0(), i5), this.f26525a.d(type.getAnnotations()));
        if ((b8 instanceof p0) && (p5 instanceof p0)) {
            b8 = t0.j((p0) b8, (p0) p5);
        }
        return new n1(b6, b8);
    }

    private List<l1> s(List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list, List<l1> list2, int i5) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z5 = false;
        for (int i6 = 0; i6 < list.size(); i6++) {
            kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var = list.get(i6);
            l1 l1Var = list2.get(i6);
            l1 u5 = u(l1Var, f1Var, i5 + 1);
            int i7 = b.f26526a[e(f1Var.z(), u5.b()).ordinal()];
            if (i7 == 1 || i7 == 2) {
                u5 = t1.s(f1Var);
            } else if (i7 == 3) {
                x1 z6 = f1Var.z();
                x1 x1Var = x1.INVARIANT;
                if (z6 != x1Var && !u5.c()) {
                    u5 = new n1(x1Var, u5.getType());
                }
            }
            if (u5 != l1Var) {
                z5 = true;
            }
            arrayList.add(u5);
        }
        return !z5 ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    private l1 u(@d5.d l1 l1Var, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, int i5) throws c {
        if (l1Var == null) {
            a(18);
        }
        b(i5, l1Var, this.f26525a);
        if (l1Var.c()) {
            return l1Var;
        }
        h0 type = l1Var.getType();
        if (type instanceof u1) {
            u1 u1Var = (u1) type;
            w1 M0 = u1Var.M0();
            h0 Q = u1Var.Q();
            l1 u5 = u(new n1(l1Var.b(), M0), f1Var, i5 + 1);
            return u5.c() ? u5 : new n1(u5.b(), v1.d(u5.getType().X0(), p(Q, l1Var.b())));
        }
        if (!x.a(type) && !(type.X0() instanceof o0)) {
            l1 e6 = this.f26525a.e(type);
            l1 l5 = e6 != null ? l(type, e6, f1Var, l1Var) : null;
            x1 b6 = l1Var.b();
            if (l5 == null && e0.b(type) && !f1.b(type)) {
                b0 a6 = e0.a(type);
                int i6 = i5 + 1;
                l1 u6 = u(new n1(b6, a6.c1()), f1Var, i6);
                l1 u7 = u(new n1(b6, a6.d1()), f1Var, i6);
                return (u6.getType() == a6.c1() && u7.getType() == a6.d1()) ? l1Var : new n1(u6.b(), i0.d(p1.a(u6.getType()), p1.a(u7.getType())));
            }
            if (!kotlin.reflect.jvm.internal.impl.builtins.h.m0(type) && !j0.a(type)) {
                if (l5 != null) {
                    d e7 = e(b6, l5.b());
                    if (!kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.d(type)) {
                        int i7 = b.f26526a[e7.ordinal()];
                        if (i7 == 1) {
                            throw new c(ProtectedSandApp.s("垺"));
                        }
                        if (i7 == 2) {
                            return new n1(x1.OUT_VARIANCE, type.U0().A().I());
                        }
                    }
                    o a7 = f1.a(type);
                    if (l5.c()) {
                        return l5;
                    }
                    h0 S = a7 != null ? a7.S(l5.getType()) : t1.q(l5.getType(), type.V0());
                    if (!type.getAnnotations().isEmpty()) {
                        S = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.v(S, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k(S.getAnnotations(), i(this.f26525a.d(type.getAnnotations()))));
                    }
                    if (e7 == d.NO_CONFLICT) {
                        b6 = d(b6, l5.b());
                    }
                    return new n1(b6, S);
                }
                l1Var = r(l1Var, i5);
                if (l1Var == null) {
                    a(25);
                }
            }
        }
        return l1Var;
    }

    @d5.d
    public o1 j() {
        o1 o1Var = this.f26525a;
        if (o1Var == null) {
            a(8);
        }
        return o1Var;
    }

    public boolean k() {
        return this.f26525a.f();
    }

    @d5.d
    public q1 m() {
        o1 o1Var = this.f26525a;
        return ((o1Var instanceof f0) && o1Var.b()) ? new q1(new f0(((f0) this.f26525a).j(), ((f0) this.f26525a).i(), false)) : this;
    }

    @d5.d
    public h0 n(@d5.d h0 h0Var, @d5.d x1 x1Var) {
        if (h0Var == null) {
            a(9);
        }
        if (x1Var == null) {
            a(10);
        }
        if (k()) {
            if (h0Var == null) {
                a(11);
            }
            return h0Var;
        }
        try {
            h0 type = u(new n1(x1Var, h0Var), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e6) {
            kotlin.reflect.jvm.internal.impl.types.error.h d6 = kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNABLE_TO_SUBSTITUTE_TYPE, e6.getMessage());
            if (d6 == null) {
                a(13);
            }
            return d6;
        }
    }

    @d5.e
    public h0 p(@d5.d h0 h0Var, @d5.d x1 x1Var) {
        if (h0Var == null) {
            a(14);
        }
        if (x1Var == null) {
            a(15);
        }
        l1 q5 = q(new n1(x1Var, j().g(h0Var, x1Var)));
        if (q5 == null) {
            return null;
        }
        return q5.getType();
    }

    @d5.e
    public l1 q(@d5.d l1 l1Var) {
        if (l1Var == null) {
            a(16);
        }
        l1 t5 = t(l1Var);
        return (this.f26525a.a() || this.f26525a.b()) ? kotlin.reflect.jvm.internal.impl.types.typesApproximation.b.c(t5, this.f26525a.b()) : t5;
    }

    @d5.e
    public l1 t(@d5.d l1 l1Var) {
        if (l1Var == null) {
            a(17);
        }
        if (k()) {
            return l1Var;
        }
        try {
            return u(l1Var, null, 0);
        } catch (c unused) {
            return null;
        }
    }
}
