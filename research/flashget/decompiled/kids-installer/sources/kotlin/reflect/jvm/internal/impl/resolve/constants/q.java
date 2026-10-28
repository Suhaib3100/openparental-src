package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: constantValues.kt */
/* loaded from: classes5.dex */
public final class q extends g<b> {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    public static final a f25918b = new a(null);

    /* compiled from: constantValues.kt */
    public static final class a {
        private a() {
        }

        @d5.e
        public final g<?> a(@d5.d h0 h0Var) {
            Object h5;
            l0.p(h0Var, ProtectedSandApp.s("冏"));
            if (j0.a(h0Var)) {
                return null;
            }
            h0 h0Var2 = h0Var;
            int i5 = 0;
            while (kotlin.reflect.jvm.internal.impl.builtins.h.c0(h0Var2)) {
                h5 = kotlin.collections.j0.h5(h0Var2.S0());
                h0Var2 = ((l1) h5).getType();
                l0.o(h0Var2, ProtectedSandApp.s("冐"));
                i5++;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var2.U0().b();
            if (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                kotlin.reflect.jvm.internal.impl.name.b k5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(b6);
                return k5 == null ? new q(new b.a(h0Var)) : new q(k5, i5);
            }
            if (!(b6 instanceof f1)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.f24043b.l());
            l0.o(m5, ProtectedSandApp.s("冑"));
            return new q(m5, 0);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: constantValues.kt */
    public static abstract class b {

        /* compiled from: constantValues.kt */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            private final h0 f25919a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@d5.d h0 h0Var) {
                super(null);
                l0.p(h0Var, ProtectedSandApp.s("冒"));
                this.f25919a = h0Var;
            }

            @d5.d
            public final h0 a() {
                return this.f25919a;
            }

            public boolean equals(@d5.e Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && l0.g(this.f25919a, ((a) obj).f25919a);
            }

            public int hashCode() {
                return this.f25919a.hashCode();
            }

            @d5.d
            public String toString() {
                return ProtectedSandApp.s("冓") + this.f25919a + ')';
            }
        }

        /* compiled from: constantValues.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.q$b$b, reason: collision with other inner class name */
        public static final class C0373b extends b {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            private final f f25920a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0373b(@d5.d f fVar) {
                super(null);
                l0.p(fVar, ProtectedSandApp.s("冔"));
                this.f25920a = fVar;
            }

            public final int a() {
                return this.f25920a.c();
            }

            @d5.d
            public final kotlin.reflect.jvm.internal.impl.name.b b() {
                return this.f25920a.d();
            }

            @d5.d
            public final f c() {
                return this.f25920a;
            }

            public boolean equals(@d5.e Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0373b) && l0.g(this.f25920a, ((C0373b) obj).f25920a);
            }

            public int hashCode() {
                return this.f25920a.hashCode();
            }

            @d5.d
            public String toString() {
                return ProtectedSandApp.s("冕") + this.f25920a + ')';
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.w wVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@d5.d b bVar) {
        super(bVar);
        l0.p(bVar, ProtectedSandApp.s("冘"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @d5.d
    public h0 a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
        List k5;
        l0.p(h0Var, ProtectedSandApp.s("写"));
        d1.f26381p.getClass();
        d1 d1Var = d1.f26382q;
        kotlin.reflect.jvm.internal.impl.descriptors.e E = h0Var.A().E();
        l0.o(E, ProtectedSandApp.s("冚"));
        k5 = kotlin.collections.z.k(new n1(c(h0Var)));
        return i0.g(d1Var, E, k5);
    }

    @d5.d
    public final h0 c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("军"));
        b b6 = b();
        if (b6 instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (!(b6 instanceof b.C0373b)) {
            throw new NoWhenBranchMatchedException();
        }
        f c6 = ((b.C0373b) b()).c();
        kotlin.reflect.jvm.internal.impl.name.b a6 = c6.a();
        int b7 = c6.b();
        kotlin.reflect.jvm.internal.impl.descriptors.e a7 = kotlin.reflect.jvm.internal.impl.descriptors.y.a(h0Var, a6);
        if (a7 == null) {
            kotlin.reflect.jvm.internal.impl.types.error.j jVar = kotlin.reflect.jvm.internal.impl.types.error.j.UNRESOLVED_KCLASS_CONSTANT_VALUE;
            String bVar = a6.toString();
            l0.o(bVar, ProtectedSandApp.s("农"));
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(jVar, bVar, String.valueOf(b7));
        }
        p0 E = a7.E();
        l0.o(E, ProtectedSandApp.s("冝"));
        h0 w5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.w(E);
        for (int i5 = 0; i5 < b7; i5++) {
            w5 = h0Var.A().l(x1.INVARIANT, w5);
            l0.o(w5, ProtectedSandApp.s("冞"));
        }
        return w5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@d5.d f fVar) {
        this(new b.C0373b(fVar));
        l0.p(fVar, ProtectedSandApp.s("冗"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@d5.d kotlin.reflect.jvm.internal.impl.name.b bVar, int i5) {
        this(new f(bVar, i5));
        l0.p(bVar, ProtectedSandApp.s("冖"));
    }
}
