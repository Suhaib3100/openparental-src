package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.l;

/* compiled from: TypeSubstitutor.java */
/* loaded from: classes7.dex */
public class q1 {

    /* renamed from: b, reason: collision with root package name */
    public static final q1 f78532b = g(o1.f78521b);

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f78533c = false;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final o1 f78534a;

    /* compiled from: TypeSubstitutor.java */
    static class a implements ld.l<kotlin.reflect.jvm.internal.impl.name.c, Boolean> {
        a() {
        }

        private static /* synthetic */ void a(int i4) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("翎\u0001"), ProtectedSandApp.s("翍\u0001"), ProtectedSandApp.s("翋\u0001"), ProtectedSandApp.s("翌\u0001")));
        }

        @Override // ld.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
            if (cVar == null) {
                a(0);
            }
            return Boolean.valueOf(!cVar.equals(l.a.Q));
        }
    }

    /* compiled from: TypeSubstitutor.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f78535a;

        static {
            int[] iArr = new int[d.values().length];
            f78535a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78535a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78535a[d.NO_CONFLICT.ordinal()] = 3;
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

    protected q1(@fg.l o1 o1Var) {
        if (o1Var == null) {
            a(7);
        }
        this.f78534a = o1Var;
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

    private static void b(int i4, l1 l1Var, o1 o1Var) {
        if (i4 <= 100) {
            return;
        }
        throw new IllegalStateException(ProtectedSandApp.s("翰\u0001") + o(l1Var) + ProtectedSandApp.s("翱\u0001") + o(o1Var));
    }

    @fg.l
    public static x1 c(@fg.l x1 x1Var, @fg.l l1 l1Var) {
        if (x1Var == null) {
            a(35);
        }
        if (l1Var == null) {
            a(36);
        }
        if (!l1Var.b()) {
            return d(x1Var, l1Var.c());
        }
        x1 x1Var2 = x1.OUT_VARIANCE;
        if (x1Var2 == null) {
            a(37);
        }
        return x1Var2;
    }

    @fg.l
    public static x1 d(@fg.l x1 x1Var, @fg.l x1 x1Var2) {
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
        throw new AssertionError(ProtectedSandApp.s("翲\u0001") + x1Var + ProtectedSandApp.s("翳\u0001") + x1Var2 + ProtectedSandApp.s("翴\u0001"));
    }

    private static d e(x1 x1Var, x1 x1Var2) {
        x1 x1Var3 = x1.IN_VARIANCE;
        return (x1Var == x1Var3 && x1Var2 == x1.OUT_VARIANCE) ? d.OUT_IN_IN_POSITION : (x1Var == x1.OUT_VARIANCE && x1Var2 == x1Var3) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    @fg.l
    public static q1 f(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(6);
        }
        return g(i1.i(h0Var.O0(), h0Var.M0()));
    }

    @fg.l
    public static q1 g(@fg.l o1 o1Var) {
        if (o1Var == null) {
            a(0);
        }
        return new q1(o1Var);
    }

    @fg.l
    public static q1 h(@fg.l o1 o1Var, @fg.l o1 o1Var2) {
        if (o1Var == null) {
            a(3);
        }
        if (o1Var2 == null) {
            a(4);
        }
        return g(v.i(o1Var, o1Var2));
    }

    @fg.l
    private static kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (gVar == null) {
            a(33);
        }
        return !gVar.o3(l.a.Q) ? gVar : new kotlin.reflect.jvm.internal.impl.descriptors.annotations.l(gVar, new a());
    }

    @fg.l
    private static l1 l(@fg.l h0 h0Var, @fg.l l1 l1Var, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, @fg.l l1 l1Var2) {
        if (h0Var == null) {
            a(26);
        }
        if (l1Var == null) {
            a(27);
        }
        if (l1Var2 == null) {
            a(28);
        }
        if (!h0Var.getAnnotations().o3(l.a.Q)) {
            if (l1Var == null) {
                a(29);
            }
            return l1Var;
        }
        h1 O0 = l1Var.getType().O0();
        if (!(O0 instanceof kotlin.reflect.jvm.internal.impl.types.checker.j)) {
            return l1Var;
        }
        l1 projection = ((kotlin.reflect.jvm.internal.impl.types.checker.j) O0).getProjection();
        x1 c5 = projection.c();
        d e4 = e(l1Var2.c(), c5);
        d dVar = d.OUT_IN_IN_POSITION;
        return e4 == dVar ? new n1(projection.getType()) : f1Var == null ? l1Var : e(f1Var.o(), c5) == dVar ? new n1(projection.getType()) : l1Var;
    }

    private static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (kotlin.reflect.jvm.internal.impl.utils.d.a(th)) {
                throw th;
            }
            return ProtectedSandApp.s("翵\u0001") + th + ProtectedSandApp.s("翶\u0001");
        }
    }

    private l1 r(l1 l1Var, int i4) throws c {
        h0 type = l1Var.getType();
        x1 c5 = l1Var.c();
        if (type.O0().c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) {
            return l1Var;
        }
        p0 b5 = t0.b(type);
        h0 p4 = b5 != null ? m().p(b5, x1.INVARIANT) : null;
        h0 b6 = p1.b(type, s(type.O0().getParameters(), type.M0(), i4), this.f78534a.d(type.getAnnotations()));
        if ((b6 instanceof p0) && (p4 instanceof p0)) {
            b6 = t0.j((p0) b6, (p0) p4);
        }
        return new n1(c5, b6);
    }

    private List<l1> s(List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list, List<l1> list2, int i4) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z4 = false;
        for (int i5 = 0; i5 < list.size(); i5++) {
            kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var = list.get(i5);
            l1 l1Var = list2.get(i5);
            l1 u4 = u(l1Var, f1Var, i4 + 1);
            int i6 = b.f78535a[e(f1Var.o(), u4.c()).ordinal()];
            if (i6 == 1 || i6 == 2) {
                u4 = t1.s(f1Var);
            } else if (i6 == 3) {
                x1 o4 = f1Var.o();
                x1 x1Var = x1.INVARIANT;
                if (o4 != x1Var && !u4.b()) {
                    u4 = new n1(x1Var, u4.getType());
                }
            }
            if (u4 != l1Var) {
                z4 = true;
            }
            arrayList.add(u4);
        }
        return !z4 ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    private l1 u(@fg.l l1 l1Var, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var, int i4) throws c {
        if (l1Var == null) {
            a(18);
        }
        b(i4, l1Var, this.f78534a);
        if (l1Var.b()) {
            return l1Var;
        }
        h0 type = l1Var.getType();
        if (type instanceof u1) {
            u1 u1Var = (u1) type;
            w1 I0 = u1Var.I0();
            h0 j02 = u1Var.j0();
            l1 u4 = u(new n1(l1Var.c(), I0), f1Var, i4 + 1);
            return u4.b() ? u4 : new n1(u4.c(), v1.d(u4.getType().R0(), p(j02, l1Var.c())));
        }
        if (!x.a(type) && !(type.R0() instanceof o0)) {
            l1 e4 = this.f78534a.e(type);
            l1 l4 = e4 != null ? l(type, e4, f1Var, l1Var) : null;
            x1 c5 = l1Var.c();
            if (l4 == null && e0.b(type) && !f1.b(type)) {
                b0 a5 = e0.a(type);
                int i5 = i4 + 1;
                l1 u5 = u(new n1(c5, a5.W0()), f1Var, i5);
                l1 u6 = u(new n1(c5, a5.X0()), f1Var, i5);
                return (u5.getType() == a5.W0() && u6.getType() == a5.X0()) ? l1Var : new n1(u5.c(), i0.d(p1.a(u5.getType()), p1.a(u6.getType())));
            }
            if (!kotlin.reflect.jvm.internal.impl.builtins.h.n0(type) && !j0.a(type)) {
                if (l4 != null) {
                    d e5 = e(c5, l4.c());
                    if (!kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.d(type)) {
                        int i6 = b.f78535a[e5.ordinal()];
                        if (i6 == 1) {
                            throw new c(ProtectedSandApp.s("翷\u0001"));
                        }
                        if (i6 == 2) {
                            return new n1(x1.OUT_VARIANCE, type.O0().p().I());
                        }
                    }
                    o a6 = f1.a(type);
                    if (l4.b()) {
                        return l4;
                    }
                    h0 l02 = a6 != null ? a6.l0(l4.getType()) : t1.q(l4.getType(), type.P0());
                    if (!type.getAnnotations().isEmpty()) {
                        l02 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.x(l02, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.k(l02.getAnnotations(), i(this.f78534a.d(type.getAnnotations()))));
                    }
                    if (e5 == d.NO_CONFLICT) {
                        c5 = d(c5, l4.c());
                    }
                    return new n1(c5, l02);
                }
                l1Var = r(l1Var, i4);
                if (l1Var == null) {
                    a(25);
                }
            }
        }
        return l1Var;
    }

    @fg.l
    public o1 j() {
        o1 o1Var = this.f78534a;
        if (o1Var == null) {
            a(8);
        }
        return o1Var;
    }

    public boolean k() {
        return this.f78534a.f();
    }

    @fg.l
    public q1 m() {
        o1 o1Var = this.f78534a;
        return ((o1Var instanceof f0) && o1Var.b()) ? new q1(new f0(((f0) this.f78534a).j(), ((f0) this.f78534a).i(), false)) : this;
    }

    @fg.l
    public h0 n(@fg.l h0 h0Var, @fg.l x1 x1Var) {
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
        } catch (c e4) {
            kotlin.reflect.jvm.internal.impl.types.error.h d5 = kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNABLE_TO_SUBSTITUTE_TYPE, e4.getMessage());
            if (d5 == null) {
                a(13);
            }
            return d5;
        }
    }

    @fg.m
    public h0 p(@fg.l h0 h0Var, @fg.l x1 x1Var) {
        if (h0Var == null) {
            a(14);
        }
        if (x1Var == null) {
            a(15);
        }
        l1 q4 = q(new n1(x1Var, j().g(h0Var, x1Var)));
        if (q4 == null) {
            return null;
        }
        return q4.getType();
    }

    @fg.m
    public l1 q(@fg.l l1 l1Var) {
        if (l1Var == null) {
            a(16);
        }
        l1 t4 = t(l1Var);
        return (this.f78534a.a() || this.f78534a.b()) ? kotlin.reflect.jvm.internal.impl.types.typesApproximation.b.c(t4, this.f78534a.b()) : t4;
    }

    @fg.m
    public l1 t(@fg.l l1 l1Var) {
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
