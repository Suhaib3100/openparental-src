package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.j0;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.p1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: IntegerLiteralTypeConstructor.kt */
/* loaded from: classes6.dex */
public final class n implements h1 {

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    public static final a f25906f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f25907a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final h0 f25908b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final Set<kotlin.reflect.jvm.internal.impl.types.h0> f25909c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final p0 f25910d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final Lazy f25911e;

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* compiled from: IntegerLiteralTypeConstructor.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.n$a$a, reason: collision with other inner class name */
        private enum EnumC0372a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* compiled from: IntegerLiteralTypeConstructor.kt */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25912a;

            static {
                int[] iArr = new int[EnumC0372a.values().length];
                try {
                    iArr[EnumC0372a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0372a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f25912a = iArr;
            }
        }

        private a() {
        }

        private final p0 a(Collection<? extends p0> collection, EnumC0372a enumC0372a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("再"));
            }
            Object next = it.next();
            while (it.hasNext()) {
                p0 p0Var = (p0) it.next();
                next = n.f25906f.e((p0) next, p0Var, enumC0372a);
            }
            return (p0) next;
        }

        private final p0 c(n nVar, n nVar2, EnumC0372a enumC0372a) {
            Set i32;
            int i5 = b.f25912a[enumC0372a.ordinal()];
            if (i5 == 1) {
                i32 = j0.i3(nVar.j(), nVar2.j());
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i32 = j0.c6(nVar.j(), nVar2.j());
            }
            n nVar3 = new n(nVar.f25907a, nVar.f25908b, i32, null);
            d1.f26381p.getClass();
            return i0.e(d1.f26382q, nVar3, false);
        }

        private final p0 d(n nVar, p0 p0Var) {
            if (nVar.j().contains(p0Var)) {
                return p0Var;
            }
            return null;
        }

        private final p0 e(p0 p0Var, p0 p0Var2, EnumC0372a enumC0372a) {
            if (p0Var == null || p0Var2 == null) {
                return null;
            }
            h1 U0 = p0Var.U0();
            h1 U02 = p0Var2.U0();
            boolean z5 = U0 instanceof n;
            if (z5 && (U02 instanceof n)) {
                return c((n) U0, (n) U02, enumC0372a);
            }
            if (z5) {
                return d((n) U0, p0Var2);
            }
            if (U02 instanceof n) {
                return d((n) U02, p0Var);
            }
            return null;
        }

        @d5.e
        public final p0 b(@d5.d Collection<? extends p0> collection) {
            l0.p(collection, ProtectedSandApp.s("冎"));
            return a(collection, EnumC0372a.INTERSECTION_TYPE);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    static final class b extends Lambda implements q3.a<List<p0>> {
        b() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<p0> n() {
            List k5;
            List<p0> S;
            p0 E = n.this.A().x().E();
            l0.o(E, ProtectedSandApp.s("虪"));
            k5 = kotlin.collections.z.k(new n1(x1.IN_VARIANCE, n.this.f25910d));
            S = kotlin.collections.a0.S(p1.f(E, k5, null, 2, null));
            if (!n.this.l()) {
                S.add(n.this.A().L());
            }
            return S;
        }
    }

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    static final class c extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.types.h0, CharSequence> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f25914p = new c();

        c() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("虫"));
            return h0Var.toString();
        }
    }

    public /* synthetic */ n(long j5, h0 h0Var, Set set, kotlin.jvm.internal.w wVar) {
        this(j5, h0Var, set);
    }

    private final List<kotlin.reflect.jvm.internal.impl.types.h0> k() {
        return (List) this.f25911e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        Collection<kotlin.reflect.jvm.internal.impl.types.h0> a6 = t.a(this.f25908b);
        if ((a6 instanceof Collection) && a6.isEmpty()) {
            return true;
        }
        Iterator<T> it = a6.iterator();
        while (it.hasNext()) {
            if (!(!this.f25909c.contains((kotlin.reflect.jvm.internal.impl.types.h0) it.next()))) {
                return false;
            }
        }
        return true;
    }

    private final String n() {
        String m32;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("虬"));
        m32 = j0.m3(this.f25909c, ProtectedSandApp.s("虭"), null, null, 0, null, c.f25914p, 30, null);
        return c1.c.a(sb, m32, ']');
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public kotlin.reflect.jvm.internal.impl.builtins.h A() {
        return this.f25908b.A();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public h1 a(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("虮"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.h b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean d() {
        return false;
    }

    @d5.d
    public final Set<kotlin.reflect.jvm.internal.impl.types.h0> j() {
        return this.f25909c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.types.h0> m() {
        return k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @d5.d
    public List<f1> r() {
        return EmptyList.f23167o;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("虯") + n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n(long j5, h0 h0Var, Set<? extends kotlin.reflect.jvm.internal.impl.types.h0> set) {
        Lazy c6;
        d1.f26381p.getClass();
        this.f25910d = i0.e(d1.f26382q, this, false);
        c6 = d0.c(new b());
        this.f25911e = c6;
        this.f25907a = j5;
        this.f25908b = h0Var;
        this.f25909c = set;
    }
}
