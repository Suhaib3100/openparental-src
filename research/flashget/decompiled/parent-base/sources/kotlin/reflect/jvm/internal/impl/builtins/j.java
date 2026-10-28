package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.w;
import kotlin.f0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.v0;

/* compiled from: ReflectionTypes.kt */
@r1({"SMAP\nReflectionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1549#2:226\n1620#2,3:227\n*S KotlinDebug\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes\n*L\n94#1:226\n94#1:227,3\n*E\n"})
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final k0 f75718a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final b0 f75719b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final a f75720c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final a f75721d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final a f75722e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final a f75723f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private final a f75724g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final a f75725h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private final a f75726i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private final a f75727j;

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f75717l = {l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("椞\u0001"), ProtectedSandApp.s("椟\u0001"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("椠\u0001"), ProtectedSandApp.s("椡\u0001"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("椢\u0001"), ProtectedSandApp.s("椣\u0001"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("椤\u0001"), ProtectedSandApp.s("椥\u0001"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("椦\u0001"), ProtectedSandApp.s("椧\u0001"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("椨\u0001"), ProtectedSandApp.s("椩\u0001"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("椪\u0001"), ProtectedSandApp.s("椫\u0001"))), l1.u(new g1(l1.d(j.class), ProtectedSandApp.s("椬\u0001"), ProtectedSandApp.s("椭\u0001")))};

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    public static final b f75716k = new b();

    /* compiled from: ReflectionTypes.kt */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f75728a;

        public a(int i4) {
            this.f75728a = i4;
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.descriptors.e a(@fg.l j jVar, @fg.l kotlin.reflect.o<?> oVar) {
            l0.p(jVar, ProtectedSandApp.s("椙\u0001"));
            l0.p(oVar, ProtectedSandApp.s("椚\u0001"));
            return jVar.b(de.a.a(oVar.getName()), this.f75728a);
        }
    }

    /* compiled from: ReflectionTypes.kt */
    @r1({"SMAP\nReflectionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1747#2,3:226\n*S KotlinDebug\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes$Companion\n*L\n122#1:226,3\n*E\n"})
    public static final class b {
        private b() {
        }

        @fg.m
        public final h0 a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("椛\u0001"));
            kotlin.reflect.jvm.internal.impl.descriptors.e a5 = y.a(h0Var, l.a.f75879u0);
            if (a5 == null) {
                return null;
            }
            d1.f78389c.getClass();
            d1 d1Var = d1.f78390d;
            List<f1> parameters = a5.j().getParameters();
            l0.o(parameters, ProtectedSandApp.s("検\u0001"));
            Object h5 = w.h5(parameters);
            l0.o(h5, ProtectedSandApp.s("椝\u0001"));
            return i0.g(d1Var, a5, w.k(new v0((f1) h5)));
        }

        public b(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: ReflectionTypes.kt */
    static final class c extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.h0 f75729b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var) {
            super(0);
            this.f75729b = h0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h invoke() {
            return this.f75729b.n0(l.f75833v).q();
        }
    }

    public j(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var, @fg.l k0 k0Var) {
        l0.p(h0Var, ProtectedSandApp.s("椮\u0001"));
        l0.p(k0Var, ProtectedSandApp.s("椯\u0001"));
        this.f75718a = k0Var;
        this.f75719b = c0.b(f0.PUBLICATION, new c(h0Var));
        this.f75720c = new a(1);
        this.f75721d = new a(1);
        this.f75722e = new a(1);
        this.f75723f = new a(2);
        this.f75724g = new a(3);
        this.f75725h = new a(1);
        this.f75726i = new a(2);
        this.f75727j = new a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.e b(String str, int i4) {
        kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(str);
        l0.o(f4, ProtectedSandApp.s("椰\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h f5 = d().f(f4, ud.d.FROM_REFLECTION);
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = f5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) f5 : null;
        return eVar == null ? this.f75718a.d(new kotlin.reflect.jvm.internal.impl.name.b(l.f75833v, f4), w.k(Integer.valueOf(i4))) : eVar;
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h d() {
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.h) this.f75719b.getValue();
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.e c() {
        return this.f75720c.a(this, f75717l[0]);
    }
}
