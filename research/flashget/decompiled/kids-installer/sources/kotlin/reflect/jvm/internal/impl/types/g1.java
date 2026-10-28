package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.m2;

/* compiled from: AbstractTypeChecker.kt */
/* loaded from: classes5.dex */
public class g1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26437a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26438b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26439c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final h4.r f26440d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private final i f26441e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private final j f26442f;

    /* renamed from: g, reason: collision with root package name */
    private int f26443g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26444h;

    /* renamed from: i, reason: collision with root package name */
    @d5.e
    private ArrayDeque<h4.k> f26445i;

    /* renamed from: j, reason: collision with root package name */
    @d5.e
    private Set<h4.k> f26446j;

    /* compiled from: AbstractTypeChecker.kt */
    public interface a {

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.g1$a$a, reason: collision with other inner class name */
        public static final class C0388a implements a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f26447a;

            @Override // kotlin.reflect.jvm.internal.impl.types.g1.a
            public void a(@d5.d q3.a<Boolean> aVar) {
                kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("圈"));
                if (this.f26447a) {
                    return;
                }
                this.f26447a = aVar.n().booleanValue();
            }

            public final boolean b() {
                return this.f26447a;
            }
        }

        void a(@d5.d q3.a<Boolean> aVar);
    }

    /* compiled from: AbstractTypeChecker.kt */
    public enum b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* compiled from: AbstractTypeChecker.kt */
    public static abstract class c {

        /* compiled from: AbstractTypeChecker.kt */
        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            public static final b f26448a = new b();

            private b() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.g1.c
            @d5.d
            public h4.k a(@d5.d g1 g1Var, @d5.d h4.i iVar) {
                kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("圌"));
                kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("圍"));
                return g1Var.j().t0(iVar);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.g1$c$c, reason: collision with other inner class name */
        public static final class C0389c extends c {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            public static final C0389c f26449a = new C0389c();

            private C0389c() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.g1.c
            public /* bridge */ /* synthetic */ h4.k a(g1 g1Var, h4.i iVar) {
                return (h4.k) b(g1Var, iVar);
            }

            @d5.d
            public Void b(@d5.d g1 g1Var, @d5.d h4.i iVar) {
                kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("圎"));
                kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("圏"));
                throw new UnsupportedOperationException(ProtectedSandApp.s("圐"));
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        public static final class d extends c {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            public static final d f26450a = new d();

            private d() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.g1.c
            @d5.d
            public h4.k a(@d5.d g1 g1Var, @d5.d h4.i iVar) {
                kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("圑"));
                kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("園"));
                return g1Var.j().u(iVar);
            }
        }

        public /* synthetic */ c(kotlin.jvm.internal.w wVar) {
            this();
        }

        @d5.d
        public abstract h4.k a(@d5.d g1 g1Var, @d5.d h4.i iVar);

        private c() {
        }
    }

    public g1(boolean z5, boolean z6, boolean z7, @d5.d h4.r rVar, @d5.d i iVar, @d5.d j jVar) {
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("匣"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("匤"));
        kotlin.jvm.internal.l0.p(jVar, ProtectedSandApp.s("匥"));
        this.f26437a = z5;
        this.f26438b = z6;
        this.f26439c = z7;
        this.f26440d = rVar;
        this.f26441e = iVar;
        this.f26442f = jVar;
    }

    public static /* synthetic */ Boolean d(g1 g1Var, h4.i iVar, h4.i iVar2, boolean z5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("匦"));
        }
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        return g1Var.c(iVar, iVar2, z5);
    }

    @d5.e
    public Boolean c(@d5.d h4.i iVar, @d5.d h4.i iVar2, boolean z5) {
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("匧"));
        kotlin.jvm.internal.l0.p(iVar2, ProtectedSandApp.s("匨"));
        return null;
    }

    public final void e() {
        ArrayDeque<h4.k> arrayDeque = this.f26445i;
        kotlin.jvm.internal.l0.m(arrayDeque);
        arrayDeque.clear();
        Set<h4.k> set = this.f26446j;
        kotlin.jvm.internal.l0.m(set);
        set.clear();
        this.f26444h = false;
    }

    public boolean f(@d5.d h4.i iVar, @d5.d h4.i iVar2) {
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("匩"));
        kotlin.jvm.internal.l0.p(iVar2, ProtectedSandApp.s("匪"));
        return true;
    }

    @d5.d
    public b g(@d5.d h4.k kVar, @d5.d h4.d dVar) {
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("匫"));
        kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("匬"));
        return b.CHECK_SUBTYPE_AND_LOWER;
    }

    @d5.e
    public final ArrayDeque<h4.k> h() {
        return this.f26445i;
    }

    @d5.e
    public final Set<h4.k> i() {
        return this.f26446j;
    }

    @d5.d
    public final h4.r j() {
        return this.f26440d;
    }

    public final void k() {
        this.f26444h = true;
        if (this.f26445i == null) {
            this.f26445i = new ArrayDeque<>(4);
        }
        if (this.f26446j == null) {
            this.f26446j = kotlin.reflect.jvm.internal.impl.utils.f.f26679q.a();
        }
    }

    public final boolean l(@d5.d h4.i iVar) {
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("匭"));
        return this.f26439c && this.f26440d.w(iVar);
    }

    public final boolean m() {
        return this.f26437a;
    }

    public final boolean n() {
        return this.f26438b;
    }

    @d5.d
    public final h4.i o(@d5.d h4.i iVar) {
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("匮"));
        return this.f26441e.a(iVar);
    }

    @d5.d
    public final h4.i p(@d5.d h4.i iVar) {
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("匯"));
        return this.f26442f.a(iVar);
    }

    public boolean q(@d5.d q3.l<? super a, m2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("匰"));
        a.C0388a c0388a = new a.C0388a();
        lVar.N(c0388a);
        return c0388a.b();
    }
}
