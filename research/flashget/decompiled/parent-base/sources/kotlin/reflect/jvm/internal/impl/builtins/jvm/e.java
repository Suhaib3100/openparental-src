package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.o;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* loaded from: classes7.dex */
public final class e implements rd.b {

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.f f75758g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.b f75759h;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final h0 f75760a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final ld.l<h0, kotlin.reflect.jvm.internal.impl.descriptors.m> f75761b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f75762c;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f75756e = {l1.u(new g1(l1.d(e.class), ProtectedSandApp.s("楓\u0001"), ProtectedSandApp.s("楔\u0001")))};

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    public static final b f75755d = new b();

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.c f75757f = kotlin.reflect.jvm.internal.impl.builtins.l.f75836y;

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    @r1({"SMAP\nJvmBuiltInClassDescriptorFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltInClassDescriptorFactory.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInClassDescriptorFactory$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n800#2,11:58\n*S KotlinDebug\n*F\n+ 1 JvmBuiltInClassDescriptorFactory.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInClassDescriptorFactory$1\n*L\n23#1:58,11\n*E\n"})
    static final class a extends n0 implements ld.l<h0, kotlin.reflect.jvm.internal.impl.builtins.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f75763b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.builtins.b invoke(@fg.l h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("楒\u0001"));
            List<kotlin.reflect.jvm.internal.impl.descriptors.l0> k02 = h0Var.n0(e.f75757f).k0();
            ArrayList arrayList = new ArrayList();
            for (Object obj : k02) {
                if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.b) {
                    arrayList.add(obj);
                }
            }
            return (kotlin.reflect.jvm.internal.impl.builtins.b) w.B2(arrayList);
        }
    }

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class b {
        private b() {
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.name.b a() {
            return e.f75759h;
        }

        public b(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    static final class c extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.descriptors.impl.h> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f75765c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f75765c = nVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.descriptors.impl.h invoke() {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.h hVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.h((kotlin.reflect.jvm.internal.impl.descriptors.m) e.this.f75761b.invoke(e.this.f75760a), e.f75758g, e0.ABSTRACT, kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE, w.k(e.this.f75760a.p().i()), a1.f75900a, false, this.f75765c);
            hVar.L0(new kotlin.reflect.jvm.internal.impl.builtins.jvm.a(this.f75765c, hVar), kotlin.collections.l0.f74939b, null);
            return hVar;
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.d dVar = l.a.f75844d;
        kotlin.reflect.jvm.internal.impl.name.f i4 = dVar.i();
        l0.o(i4, ProtectedSandApp.s("楕\u0001"));
        f75758g = i4;
        kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(dVar.l());
        l0.o(m4, ProtectedSandApp.s("楖\u0001"));
        f75759h = m4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@fg.l n nVar, @fg.l h0 h0Var, @fg.l ld.l<? super h0, ? extends kotlin.reflect.jvm.internal.impl.descriptors.m> lVar) {
        l0.p(nVar, ProtectedSandApp.s("楗\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("楘\u0001"));
        l0.p(lVar, ProtectedSandApp.s("楙\u0001"));
        this.f75760a = h0Var;
        this.f75761b = lVar;
        this.f75762c = nVar.h(new c(nVar));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.h i() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.impl.h) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f75762c, this, f75756e[0]);
    }

    @Override // rd.b
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> a(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("楚\u0001"));
        return l0.g(cVar, f75757f) ? kotlin.collections.l1.f(i()) : kotlin.collections.l0.f74939b;
    }

    @Override // rd.b
    public boolean b(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(cVar, ProtectedSandApp.s("楚\u0001"));
        l0.p(fVar, ProtectedSandApp.s("楛\u0001"));
        return l0.g(fVar, f75758g) && l0.g(cVar, f75757f);
    }

    @Override // rd.b
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.e c(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("楜\u0001"));
        if (l0.g(bVar, f75759h)) {
            return i();
        }
        return null;
    }

    public /* synthetic */ e(n nVar, h0 h0Var, ld.l lVar, int i4, kotlin.jvm.internal.w wVar) {
        this(nVar, h0Var, (i4 & 4) != 0 ? a.f75763b : lVar);
    }
}
