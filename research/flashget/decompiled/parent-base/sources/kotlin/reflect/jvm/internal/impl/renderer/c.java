package kotlin.reflect.jvm.internal.impl.renderer;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.renderer.b;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.l1;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final k f77792a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final c f77793b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final c f77794c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final c f77795d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final c f77796e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final c f77797f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final c f77798g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final c f77799h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final c f77800i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final c f77801j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final c f77802k;

    /* compiled from: DescriptorRenderer.kt */
    static final class a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.renderer.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f77803b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("眊\u0001"));
            fVar.c(false);
            fVar.m(kotlin.collections.l0.f74939b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    static final class b extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.renderer.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f77804b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("看\u0001"));
            fVar.c(false);
            fVar.m(kotlin.collections.l0.f74939b);
            fVar.e(true);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.c$c, reason: collision with other inner class name */
    static final class C1172c extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.renderer.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1172c f77805b = new C1172c(1);

        C1172c() {
            super(1);
        }

        public final void a(@fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("県\u0001"));
            fVar.c(false);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    static final class d extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.renderer.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f77806b = new d(1);

        d() {
            super(1);
        }

        public final void a(@fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("眍\u0001"));
            fVar.m(kotlin.collections.l0.f74939b);
            fVar.o(b.C1171b.f77790a);
            fVar.b(kotlin.reflect.jvm.internal.impl.renderer.k.ONLY_NON_SYNTHESIZED);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    static final class e extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.renderer.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f77807b = new e(1);

        e() {
            super(1);
        }

        public final void a(@fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("眎\u0001"));
            fVar.p(true);
            fVar.o(b.a.f77789a);
            fVar.m(kotlin.reflect.jvm.internal.impl.renderer.e.ALL);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    static final class f extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.renderer.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f77808b = new f(1);

        f() {
            super(1);
        }

        public final void a(@fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("眏\u0001"));
            fVar.m(kotlin.reflect.jvm.internal.impl.renderer.e.ALL_EXCEPT_ANNOTATIONS);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    static final class g extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.renderer.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f77809b = new g(1);

        g() {
            super(1);
        }

        public final void a(@fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("眐\u0001"));
            fVar.m(kotlin.reflect.jvm.internal.impl.renderer.e.ALL);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    static final class h extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.renderer.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f77810b = new h(1);

        h() {
            super(1);
        }

        public final void a(@fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("眑\u0001"));
            fVar.g(m.HTML);
            fVar.m(kotlin.reflect.jvm.internal.impl.renderer.e.ALL);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    static final class i extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.renderer.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f77811b = new i(1);

        i() {
            super(1);
        }

        public final void a(@fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("眒\u0001"));
            fVar.c(false);
            fVar.m(kotlin.collections.l0.f74939b);
            fVar.o(b.C1171b.f77790a);
            fVar.r(true);
            fVar.b(kotlin.reflect.jvm.internal.impl.renderer.k.NONE);
            fVar.f(true);
            fVar.q(true);
            fVar.e(true);
            fVar.a(true);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    static final class j extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.renderer.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f77812b = new j(1);

        j() {
            super(1);
        }

        public final void a(@fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("眓\u0001"));
            fVar.o(b.C1171b.f77790a);
            fVar.b(kotlin.reflect.jvm.internal.impl.renderer.k.ONLY_NON_SYNTHESIZED);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    public static final class k {

        /* compiled from: DescriptorRenderer.kt */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f77813a;

            static {
                int[] iArr = new int[kotlin.reflect.jvm.internal.impl.descriptors.f.values().length];
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.descriptors.f.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f77813a = iArr;
            }
        }

        private k() {
        }

        @fg.l
        public final String a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("眔\u0001"));
            if (iVar instanceof e1) {
                return ProtectedSandApp.s("眕\u0001");
            }
            if (!(iVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                throw new AssertionError(ProtectedSandApp.s("眝\u0001") + iVar);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) iVar;
            if (eVar.e0()) {
                return ProtectedSandApp.s("眖\u0001");
            }
            switch (a.f77813a[eVar.b().ordinal()]) {
                case 1:
                    return ProtectedSandApp.s("眜\u0001");
                case 2:
                    return ProtectedSandApp.s("眛\u0001");
                case 3:
                    return ProtectedSandApp.s("眚\u0001");
                case 4:
                    return ProtectedSandApp.s("眙\u0001");
                case 5:
                    return ProtectedSandApp.s("眘\u0001");
                case 6:
                    return ProtectedSandApp.s("眗\u0001");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        @fg.l
        public final c b(@fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.renderer.f, k2> lVar) {
            l0.p(lVar, ProtectedSandApp.s("眞\u0001"));
            kotlin.reflect.jvm.internal.impl.renderer.g gVar = new kotlin.reflect.jvm.internal.impl.renderer.g();
            lVar.invoke(gVar);
            gVar.o0();
            return new kotlin.reflect.jvm.internal.impl.renderer.d(gVar);
        }

        public k(w wVar) {
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    public interface l {

        /* compiled from: DescriptorRenderer.kt */
        public static final class a implements l {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            public static final a f77814a = new a();

            private a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.c.l
            public void a(@fg.l j1 j1Var, int i4, int i5, @fg.l StringBuilder sb) {
                l0.p(j1Var, ProtectedSandApp.s("真\u0001"));
                l0.p(sb, ProtectedSandApp.s("眠\u0001"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.c.l
            public void b(int i4, @fg.l StringBuilder sb) {
                l0.p(sb, ProtectedSandApp.s("眠\u0001"));
                sb.append(ProtectedSandApp.s("眡\u0001"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.c.l
            public void c(@fg.l j1 j1Var, int i4, int i5, @fg.l StringBuilder sb) {
                l0.p(j1Var, ProtectedSandApp.s("真\u0001"));
                l0.p(sb, ProtectedSandApp.s("眠\u0001"));
                if (i4 != i5 - 1) {
                    sb.append(ProtectedSandApp.s("眢\u0001"));
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.c.l
            public void d(int i4, @fg.l StringBuilder sb) {
                l0.p(sb, ProtectedSandApp.s("眠\u0001"));
                sb.append(ProtectedSandApp.s("眣\u0001"));
            }
        }

        void a(@fg.l j1 j1Var, int i4, int i5, @fg.l StringBuilder sb);

        void b(int i4, @fg.l StringBuilder sb);

        void c(@fg.l j1 j1Var, int i4, int i5, @fg.l StringBuilder sb);

        void d(int i4, @fg.l StringBuilder sb);
    }

    static {
        k kVar = new k();
        f77792a = kVar;
        f77793b = kVar.b(C1172c.f77805b);
        f77794c = kVar.b(a.f77803b);
        f77795d = kVar.b(b.f77804b);
        f77796e = kVar.b(d.f77806b);
        f77797f = kVar.b(i.f77811b);
        f77798g = kVar.b(f.f77808b);
        f77799h = kVar.b(g.f77809b);
        f77800i = kVar.b(j.f77812b);
        f77801j = kVar.b(e.f77807b);
        f77802k = kVar.b(h.f77810b);
    }

    public static /* synthetic */ String u(c cVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar2, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("眤\u0001"));
        }
        if ((i4 & 2) != 0) {
            eVar = null;
        }
        return cVar.t(cVar2, eVar);
    }

    @fg.l
    public final c A(@fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.renderer.f, k2> lVar) {
        l0.p(lVar, ProtectedSandApp.s("眥\u0001"));
        l0.n(this, ProtectedSandApp.s("眦\u0001"));
        kotlin.reflect.jvm.internal.impl.renderer.g s4 = ((kotlin.reflect.jvm.internal.impl.renderer.d) this).h0().s();
        lVar.invoke(s4);
        s4.o0();
        return new kotlin.reflect.jvm.internal.impl.renderer.d(s4);
    }

    @fg.l
    public abstract String s(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar);

    @fg.l
    public abstract String t(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar);

    @fg.l
    public abstract String v(@fg.l String str, @fg.l String str2, @fg.l kotlin.reflect.jvm.internal.impl.builtins.h hVar);

    @fg.l
    public abstract String w(@fg.l kotlin.reflect.jvm.internal.impl.name.d dVar);

    @fg.l
    public abstract String x(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, boolean z4);

    @fg.l
    public abstract String y(@fg.l h0 h0Var);

    @fg.l
    public abstract String z(@fg.l l1 l1Var);
}
