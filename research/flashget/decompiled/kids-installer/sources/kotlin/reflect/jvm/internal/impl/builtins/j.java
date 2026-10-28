package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.j0;
import kotlin.collections.z;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.w;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.v0;

/* compiled from: ReflectionTypes.kt */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final k0 f23926a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Lazy f23927b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final a f23928c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final a f23929d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final a f23930e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private final a f23931f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private final a f23932g;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    private final a f23933h;

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    private final a f23934i;

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    private final a f23935j;

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f23925l = {l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("䔊"), ProtectedSandApp.s("䔋"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("䔌"), ProtectedSandApp.s("䔍"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("䔎"), ProtectedSandApp.s("䔏"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("䔐"), ProtectedSandApp.s("䔑"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("䔒"), ProtectedSandApp.s("䔓"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("䔔"), ProtectedSandApp.s("䔕"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("䔖"), ProtectedSandApp.s("䔗"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("䔘"), ProtectedSandApp.s("䔙")))};

    /* renamed from: k, reason: collision with root package name */
    @d5.d
    public static final b f23924k = new b(null);

    /* compiled from: ReflectionTypes.kt */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f23936a;

        public a(int i5) {
            this.f23936a = i5;
        }

        @d5.d
        public final kotlin.reflect.jvm.internal.impl.descriptors.e a(@d5.d j jVar, @d5.d KProperty<?> kProperty) {
            l0.p(jVar, ProtectedSandApp.s("䔅"));
            l0.p(kProperty, ProtectedSandApp.s("䔆"));
            return jVar.b(i4.a.a(kProperty.getName()), this.f23936a);
        }
    }

    /* compiled from: ReflectionTypes.kt */
    public static final class b {
        private b() {
        }

        @d5.e
        public final h0 a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
            Object h5;
            List k5;
            l0.p(h0Var, ProtectedSandApp.s("䔇"));
            kotlin.reflect.jvm.internal.impl.descriptors.e a6 = y.a(h0Var, l.a.f24078s0);
            if (a6 == null) {
                return null;
            }
            d1.f26381p.getClass();
            d1 d1Var = d1.f26382q;
            List<f1> r5 = a6.m().r();
            l0.o(r5, ProtectedSandApp.s("䔈"));
            h5 = j0.h5(r5);
            l0.o(h5, ProtectedSandApp.s("䔉"));
            k5 = z.k(new v0((f1) h5));
            return i0.g(d1Var, a6, k5);
        }

        public b(w wVar) {
        }
    }

    /* compiled from: ReflectionTypes.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.h0 f23937p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
            super(0);
            this.f23937p = h0Var;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h n() {
            return this.f23937p.V(l.f24032r).C();
        }
    }

    public j(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var, @d5.d k0 k0Var) {
        Lazy b6;
        l0.p(h0Var, ProtectedSandApp.s("䔚"));
        l0.p(k0Var, ProtectedSandApp.s("䔛"));
        this.f23926a = k0Var;
        b6 = d0.b(LazyThreadSafetyMode.PUBLICATION, new c(h0Var));
        this.f23927b = b6;
        this.f23928c = new a(1);
        this.f23929d = new a(1);
        this.f23930e = new a(1);
        this.f23931f = new a(2);
        this.f23932g = new a(3);
        this.f23933h = new a(1);
        this.f23934i = new a(2);
        this.f23935j = new a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e b(String str, int i5) {
        List<Integer> k5;
        kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(str);
        l0.o(p5, ProtectedSandApp.s("䔜"));
        kotlin.reflect.jvm.internal.impl.descriptors.h h5 = d().h(p5, z3.d.FROM_REFLECTION);
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = h5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) h5 : null;
        if (eVar != null) {
            return eVar;
        }
        k0 k0Var = this.f23926a;
        kotlin.reflect.jvm.internal.impl.name.b bVar = new kotlin.reflect.jvm.internal.impl.name.b(l.f24032r, p5);
        k5 = z.k(Integer.valueOf(i5));
        return k0Var.d(bVar, k5);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h d() {
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h) this.f23927b.getValue();
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.e c() {
        return this.f23928c.a(this, f23925l[0]);
    }
}
