package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.x;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.o;

/* compiled from: JvmBuiltIns.kt */
@r1({"SMAP\nJvmBuiltIns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltIns.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
/* loaded from: classes7.dex */
public final class f extends kotlin.reflect.jvm.internal.impl.builtins.h {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ o<Object>[] f75766l = {l1.u(new g1(l1.d(f.class), ProtectedSandApp.s("楣\u0001"), ProtectedSandApp.s("楤\u0001")))};

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private final a f75767i;

    /* renamed from: j, reason: collision with root package name */
    @fg.m
    private ld.a<b> f75768j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f75769k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JvmBuiltIns.kt */
    public static final class a {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FROM_DEPENDENCIES = new a(ProtectedSandApp.s("楝\u0001"), 0);
        public static final a FROM_CLASS_LOADER = new a(ProtectedSandApp.s("楞\u0001"), 1);
        public static final a FALLBACK = new a(ProtectedSandApp.s("楟\u0001"), 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{FROM_DEPENDENCIES, FROM_CLASS_LOADER, FALLBACK};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        private a(String str, int i4) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        private final h0 f75770a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f75771b;

        public b(@fg.l h0 h0Var, boolean z4) {
            l0.p(h0Var, ProtectedSandApp.s("楠\u0001"));
            this.f75770a = h0Var;
            this.f75771b = z4;
        }

        @fg.l
        public final h0 a() {
            return this.f75770a;
        }

        public final boolean b() {
            return this.f75771b;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75772a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75772a = iArr;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    static final class d extends n0 implements ld.a<i> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f75774c;

        /* compiled from: JvmBuiltIns.kt */
        @r1({"SMAP\nJvmBuiltIns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltIns.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$customizer$2$1\n+ 2 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n*L\n1#1,103:1\n19#2:104\n*S KotlinDebug\n*F\n+ 1 JvmBuiltIns.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$customizer$2$1\n*L\n80#1:104\n*E\n"})
        static final class a extends n0 implements ld.a<b> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f75775b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.f75775b = fVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b invoke() {
                ld.a aVar = this.f75775b.f75768j;
                if (aVar == null) {
                    throw new AssertionError(ProtectedSandApp.s("楡\u0001"));
                }
                b bVar = (b) aVar.invoke();
                this.f75775b.f75768j = null;
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(0);
            this.f75774c = nVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke() {
            x r4 = f.this.r();
            l0.o(r4, ProtectedSandApp.s("楢\u0001"));
            return new i(r4, this.f75774c, new a(f.this));
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    static final class e extends n0 implements ld.a<b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f75776b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f75777c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h0 h0Var, boolean z4) {
            super(0);
            this.f75776b = h0Var;
            this.f75777c = z4;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(this.f75776b, this.f75777c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@fg.l n nVar, @fg.l a aVar) {
        super(nVar);
        l0.p(nVar, ProtectedSandApp.s("楥\u0001"));
        l0.p(aVar, ProtectedSandApp.s("楦\u0001"));
        this.f75767i = aVar;
        this.f75769k = nVar.h(new d(nVar));
        int i4 = c.f75772a[aVar.ordinal()];
        if (i4 == 2) {
            f(false);
        } else {
            if (i4 != 3) {
                return;
            }
            f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.h
    @fg.l
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public List<rd.b> v() {
        Iterable<rd.b> v4 = super.v();
        l0.o(v4, ProtectedSandApp.s("楧\u0001"));
        n U = U();
        l0.o(U, ProtectedSandApp.s("楨\u0001"));
        x r4 = r();
        l0.o(r4, ProtectedSandApp.s("楩\u0001"));
        return w.A4(v4, new kotlin.reflect.jvm.internal.impl.builtins.jvm.e(U, r4, null, 4, null));
    }

    @fg.l
    public final i I0() {
        return (i) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f75769k, this, f75766l[0]);
    }

    public final void J0(@fg.l h0 h0Var, boolean z4) {
        l0.p(h0Var, ProtectedSandApp.s("楪\u0001"));
        K0(new e(h0Var, z4));
    }

    public final void K0(@fg.l ld.a<b> aVar) {
        l0.p(aVar, ProtectedSandApp.s("楫\u0001"));
        this.f75768j = aVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.h
    @fg.l
    protected rd.c M() {
        return I0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.h
    @fg.l
    protected rd.a g() {
        return I0();
    }
}
