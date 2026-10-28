package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes7.dex */
public final class q extends g<b> {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final a f77894b = new a();

    /* compiled from: constantValues.kt */
    public static final class a {
        private a() {
        }

        @fg.m
        public final g<?> a(@fg.l h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("磌\u0001"));
            if (j0.a(h0Var)) {
                return null;
            }
            h0 h0Var2 = h0Var;
            int i4 = 0;
            while (kotlin.reflect.jvm.internal.impl.builtins.h.c0(h0Var2)) {
                h0Var2 = ((l1) kotlin.collections.w.h5(h0Var2.M0())).getType();
                l0.o(h0Var2, ProtectedSandApp.s("磍\u0001"));
                i4++;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var2.O0().c();
            if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                kotlin.reflect.jvm.internal.impl.name.b k4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(c5);
                return k4 == null ? new q(new b.a(h0Var)) : new q(k4, i4);
            }
            if (!(c5 instanceof f1)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.f75840b.l());
            l0.o(m4, ProtectedSandApp.s("磎\u0001"));
            return new q(m4, 0);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: constantValues.kt */
    public static abstract class b {

        /* compiled from: constantValues.kt */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            private final h0 f77895a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@fg.l h0 h0Var) {
                super(null);
                l0.p(h0Var, ProtectedSandApp.s("磏\u0001"));
                this.f77895a = h0Var;
            }

            @fg.l
            public final h0 a() {
                return this.f77895a;
            }

            public boolean equals(@fg.m Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && l0.g(this.f77895a, ((a) obj).f77895a);
            }

            public int hashCode() {
                return this.f77895a.hashCode();
            }

            @fg.l
            public String toString() {
                return ProtectedSandApp.s("磐\u0001") + this.f77895a + ')';
            }
        }

        /* compiled from: constantValues.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.q$b$b, reason: collision with other inner class name */
        public static final class C1177b extends b {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            private final f f77896a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1177b(@fg.l f fVar) {
                super(null);
                l0.p(fVar, ProtectedSandApp.s("磑\u0001"));
                this.f77896a = fVar;
            }

            public final int a() {
                return this.f77896a.c();
            }

            @fg.l
            public final kotlin.reflect.jvm.internal.impl.name.b b() {
                return this.f77896a.d();
            }

            @fg.l
            public final f c() {
                return this.f77896a;
            }

            public boolean equals(@fg.m Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1177b) && l0.g(this.f77896a, ((C1177b) obj).f77896a);
            }

            public int hashCode() {
                return this.f77896a.hashCode();
            }

            @fg.l
            public String toString() {
                return ProtectedSandApp.s("磒\u0001") + this.f77896a + ')';
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.w wVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@fg.l b bVar) {
        super(bVar);
        l0.p(bVar, ProtectedSandApp.s("磔\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @fg.l
    public h0 a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("磕\u0001"));
        d1.f78389c.getClass();
        d1 d1Var = d1.f78390d;
        kotlin.reflect.jvm.internal.impl.descriptors.e E = h0Var.p().E();
        l0.o(E, ProtectedSandApp.s("磖\u0001"));
        return i0.g(d1Var, E, kotlin.collections.w.k(new n1(c(h0Var))));
    }

    @fg.l
    public final h0 c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("磕\u0001"));
        b b5 = b();
        if (b5 instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (!(b5 instanceof b.C1177b)) {
            throw new NoWhenBranchMatchedException();
        }
        f c5 = ((b.C1177b) b()).c();
        kotlin.reflect.jvm.internal.impl.name.b a5 = c5.a();
        int b6 = c5.b();
        kotlin.reflect.jvm.internal.impl.descriptors.e a6 = kotlin.reflect.jvm.internal.impl.descriptors.y.a(h0Var, a5);
        if (a6 == null) {
            kotlin.reflect.jvm.internal.impl.types.error.j jVar = kotlin.reflect.jvm.internal.impl.types.error.j.UNRESOLVED_KCLASS_CONSTANT_VALUE;
            String bVar = a5.toString();
            l0.o(bVar, ProtectedSandApp.s("磗\u0001"));
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(jVar, bVar, String.valueOf(b6));
        }
        p0 r4 = a6.r();
        l0.o(r4, ProtectedSandApp.s("磘\u0001"));
        h0 y4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.y(r4);
        for (int i4 = 0; i4 < b6; i4++) {
            y4 = h0Var.p().l(x1.INVARIANT, y4);
            l0.o(y4, ProtectedSandApp.s("磙\u0001"));
        }
        return y4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@fg.l f fVar) {
        this(new b.C1177b(fVar));
        l0.p(fVar, ProtectedSandApp.s("磔\u0001"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar, int i4) {
        this(new f(bVar, i4));
        l0.p(bVar, ProtectedSandApp.s("磓\u0001"));
    }
}
