package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.k2;

/* compiled from: AbstractTypeChecker.kt */
@kotlin.jvm.internal.r1({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n1#2:836\n*E\n"})
/* loaded from: classes7.dex */
public class g1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f78446a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f78447b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f78448c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final ce.q f78449d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final i f78450e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final j f78451f;

    /* renamed from: g, reason: collision with root package name */
    private int f78452g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f78453h;

    /* renamed from: i, reason: collision with root package name */
    @fg.m
    private ArrayDeque<ce.j> f78454i;

    /* renamed from: j, reason: collision with root package name */
    @fg.m
    private Set<ce.j> f78455j;

    /* compiled from: AbstractTypeChecker.kt */
    public interface a {

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.g1$a$a, reason: collision with other inner class name */
        public static final class C1192a implements a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f78456a;

            @Override // kotlin.reflect.jvm.internal.impl.types.g1.a
            public void a(@fg.l ld.a<Boolean> aVar) {
                kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("缷\u0001"));
                if (this.f78456a) {
                    return;
                }
                this.f78456a = aVar.invoke().booleanValue();
            }

            public final boolean b() {
                return this.f78456a;
            }
        }

        void a(@fg.l ld.a<Boolean> aVar);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractTypeChecker.kt */
    public static final class b {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b CHECK_ONLY_LOWER = new b(ProtectedSandApp.s("缸\u0001"), 0);
        public static final b CHECK_SUBTYPE_AND_LOWER = new b(ProtectedSandApp.s("缹\u0001"), 1);
        public static final b SKIP_LOWER = new b(ProtectedSandApp.s("缺\u0001"), 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{CHECK_ONLY_LOWER, CHECK_SUBTYPE_AND_LOWER, SKIP_LOWER};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        private b(String str, int i4) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
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
        @kotlin.jvm.internal.r1({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState$SupertypesPolicy$LowerIfFlexible\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n1#2:836\n*E\n"})
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            public static final b f78457a = new b(null);

            private b() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.g1.c
            @fg.l
            public ce.j a(@fg.l g1 g1Var, @fg.l ce.i iVar) {
                kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("缻\u0001"));
                kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("缼\u0001"));
                return g1Var.j().c0(iVar);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.g1$c$c, reason: collision with other inner class name */
        public static final class C1193c extends c {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            public static final C1193c f78458a = new C1193c(null);

            private C1193c() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.g1.c
            public /* bridge */ /* synthetic */ ce.j a(g1 g1Var, ce.i iVar) {
                return (ce.j) b(g1Var, iVar);
            }

            @fg.l
            public Void b(@fg.l g1 g1Var, @fg.l ce.i iVar) {
                kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("缽\u0001"));
                kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("缾\u0001"));
                throw new UnsupportedOperationException(ProtectedSandApp.s("缿\u0001"));
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        @kotlin.jvm.internal.r1({"SMAP\nAbstractTypeChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeChecker.kt\norg/jetbrains/kotlin/types/TypeCheckerState$SupertypesPolicy$UpperIfFlexible\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,835:1\n1#2:836\n*E\n"})
        public static final class d extends c {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            public static final d f78459a = new d(null);

            private d() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.g1.c
            @fg.l
            public ce.j a(@fg.l g1 g1Var, @fg.l ce.i iVar) {
                kotlin.jvm.internal.l0.p(g1Var, ProtectedSandApp.s("罀\u0001"));
                kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("罁\u0001"));
                return g1Var.j().V(iVar);
            }
        }

        public /* synthetic */ c(kotlin.jvm.internal.w wVar) {
            this();
        }

        @fg.l
        public abstract ce.j a(@fg.l g1 g1Var, @fg.l ce.i iVar);

        private c() {
        }
    }

    public g1(boolean z4, boolean z5, boolean z6, @fg.l ce.q qVar, @fg.l i iVar, @fg.l j jVar) {
        kotlin.jvm.internal.l0.p(qVar, ProtectedSandApp.s("穚\u0001"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("穛\u0001"));
        kotlin.jvm.internal.l0.p(jVar, ProtectedSandApp.s("穜\u0001"));
        this.f78446a = z4;
        this.f78447b = z5;
        this.f78448c = z6;
        this.f78449d = qVar;
        this.f78450e = iVar;
        this.f78451f = jVar;
    }

    public static /* synthetic */ Boolean d(g1 g1Var, ce.i iVar, ce.i iVar2, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("穝\u0001"));
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return g1Var.c(iVar, iVar2, z4);
    }

    @fg.m
    public Boolean c(@fg.l ce.i iVar, @fg.l ce.i iVar2, boolean z4) {
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("穞\u0001"));
        kotlin.jvm.internal.l0.p(iVar2, ProtectedSandApp.s("穟\u0001"));
        return null;
    }

    public final void e() {
        ArrayDeque<ce.j> arrayDeque = this.f78454i;
        kotlin.jvm.internal.l0.m(arrayDeque);
        arrayDeque.clear();
        Set<ce.j> set = this.f78455j;
        kotlin.jvm.internal.l0.m(set);
        set.clear();
        this.f78453h = false;
    }

    public boolean f(@fg.l ce.i iVar, @fg.l ce.i iVar2) {
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("穞\u0001"));
        kotlin.jvm.internal.l0.p(iVar2, ProtectedSandApp.s("穟\u0001"));
        return true;
    }

    @fg.l
    public b g(@fg.l ce.j jVar, @fg.l ce.d dVar) {
        kotlin.jvm.internal.l0.p(jVar, ProtectedSandApp.s("穞\u0001"));
        kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("穟\u0001"));
        return b.CHECK_SUBTYPE_AND_LOWER;
    }

    @fg.m
    public final ArrayDeque<ce.j> h() {
        return this.f78454i;
    }

    @fg.m
    public final Set<ce.j> i() {
        return this.f78455j;
    }

    @fg.l
    public final ce.q j() {
        return this.f78449d;
    }

    public final void k() {
        this.f78453h = true;
        if (this.f78454i == null) {
            this.f78454i = new ArrayDeque<>(4);
        }
        if (this.f78455j == null) {
            this.f78455j = kotlin.reflect.jvm.internal.impl.utils.g.f78687d.a();
        }
    }

    public final boolean l(@fg.l ce.i iVar) {
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("穠\u0001"));
        return this.f78448c && this.f78449d.Y(iVar);
    }

    public final boolean m() {
        return this.f78446a;
    }

    public final boolean n() {
        return this.f78447b;
    }

    @fg.l
    public final ce.i o(@fg.l ce.i iVar) {
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("穠\u0001"));
        return this.f78450e.a(iVar);
    }

    @fg.l
    public final ce.i p(@fg.l ce.i iVar) {
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("穠\u0001"));
        return this.f78451f.a(iVar);
    }

    public boolean q(@fg.l ld.l<? super a, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("穡\u0001"));
        a.C1192a c1192a = new a.C1192a();
        lVar.invoke(c1192a);
        return c1192a.b();
    }
}
