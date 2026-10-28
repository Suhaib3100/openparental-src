package kotlin.reflect.jvm.internal.impl.resolve.constants;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c0;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
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
@r1({"SMAP\nIntegerLiteralTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1726#2,3:182\n1747#2,3:185\n*S KotlinDebug\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor\n*L\n132#1:182,3\n176#1:185,3\n*E\n"})
/* loaded from: classes7.dex */
public final class n implements h1 {

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    public static final a f77882f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final long f77883a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final h0 f77884b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final Set<kotlin.reflect.jvm.internal.impl.types.h0> f77885c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final p0 f77886d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final kotlin.b0 f77887e;

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    @r1({"SMAP\nIntegerLiteralTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n2661#2,7:182\n*S KotlinDebug\n*F\n+ 1 IntegerLiteralTypeConstructor.kt\norg/jetbrains/kotlin/resolve/constants/IntegerLiteralTypeConstructor$Companion\n*L\n40#1:182,7\n*E\n"})
    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: IntegerLiteralTypeConstructor.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.n$a$a, reason: collision with other inner class name */
        private static final class EnumC1176a {
            private static final /* synthetic */ kotlin.enums.a $ENTRIES;
            private static final /* synthetic */ EnumC1176a[] $VALUES;
            public static final EnumC1176a COMMON_SUPER_TYPE = new EnumC1176a(ProtectedSandApp.s("磀\u0001"), 0);
            public static final EnumC1176a INTERSECTION_TYPE = new EnumC1176a(ProtectedSandApp.s("磁\u0001"), 1);

            private static final /* synthetic */ EnumC1176a[] $values() {
                return new EnumC1176a[]{COMMON_SUPER_TYPE, INTERSECTION_TYPE};
            }

            static {
                EnumC1176a[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.c.c($values);
            }

            private EnumC1176a(String str, int i4) {
            }

            public static EnumC1176a valueOf(String str) {
                return (EnumC1176a) Enum.valueOf(EnumC1176a.class, str);
            }

            public static EnumC1176a[] values() {
                return (EnumC1176a[]) $VALUES.clone();
            }
        }

        /* compiled from: IntegerLiteralTypeConstructor.kt */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f77888a;

            static {
                int[] iArr = new int[EnumC1176a.values().length];
                try {
                    iArr[EnumC1176a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1176a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f77888a = iArr;
            }
        }

        private a() {
        }

        private final p0 a(Collection<? extends p0> collection, EnumC1176a enumC1176a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("磂\u0001"));
            }
            Object next = it.next();
            while (it.hasNext()) {
                p0 p0Var = (p0) it.next();
                next = n.f77882f.e((p0) next, p0Var, enumC1176a);
            }
            return (p0) next;
        }

        private final p0 c(n nVar, n nVar2, EnumC1176a enumC1176a) {
            Set i32;
            int i4 = b.f77888a[enumC1176a.ordinal()];
            if (i4 == 1) {
                i32 = kotlin.collections.w.i3(nVar.i(), nVar2.i());
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i32 = kotlin.collections.w.c6(nVar.i(), nVar2.i());
            }
            n nVar3 = new n(nVar.f77883a, nVar.f77884b, i32, null);
            d1.f78389c.getClass();
            return i0.e(d1.f78390d, nVar3, false);
        }

        private final p0 d(n nVar, p0 p0Var) {
            if (nVar.i().contains(p0Var)) {
                return p0Var;
            }
            return null;
        }

        private final p0 e(p0 p0Var, p0 p0Var2, EnumC1176a enumC1176a) {
            if (p0Var == null || p0Var2 == null) {
                return null;
            }
            h1 O0 = p0Var.O0();
            h1 O02 = p0Var2.O0();
            boolean z4 = O0 instanceof n;
            if (z4 && (O02 instanceof n)) {
                return c((n) O0, (n) O02, enumC1176a);
            }
            if (z4) {
                return d((n) O0, p0Var2);
            }
            if (O02 instanceof n) {
                return d((n) O02, p0Var);
            }
            return null;
        }

        @fg.m
        public final p0 b(@fg.l Collection<? extends p0> collection) {
            l0.p(collection, ProtectedSandApp.s("磃\u0001"));
            return a(collection, EnumC1176a.INTERSECTION_TYPE);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    static final class b extends n0 implements ld.a<List<p0>> {
        b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<p0> invoke() {
            p0 r4 = n.this.p().x().r();
            l0.o(r4, ProtectedSandApp.s("磄\u0001"));
            List<p0> S = kotlin.collections.w.S(p1.f(r4, kotlin.collections.w.k(new n1(x1.IN_VARIANCE, n.this.f77886d)), null, 2, null));
            if (!n.this.l()) {
                S.add(n.this.p().L());
            }
            return S;
        }
    }

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    static final class c extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.types.h0, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f77890b = new c(1);

        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("磅\u0001"));
            return h0Var.toString();
        }
    }

    public /* synthetic */ n(long j4, h0 h0Var, Set set, kotlin.jvm.internal.w wVar) {
        this(j4, h0Var, set);
    }

    private final List<kotlin.reflect.jvm.internal.impl.types.h0> k() {
        return (List) this.f77887e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        Collection<kotlin.reflect.jvm.internal.impl.types.h0> a5 = t.a(this.f77884b);
        if ((a5 instanceof Collection) && a5.isEmpty()) {
            return true;
        }
        Iterator<T> it = a5.iterator();
        while (it.hasNext()) {
            if (this.f77885c.contains((kotlin.reflect.jvm.internal.impl.types.h0) it.next())) {
                return false;
            }
        }
        return true;
    }

    private final String m() {
        return f3.a(new StringBuilder(ProtectedSandApp.s("磆\u0001")), kotlin.collections.w.m3(this.f77885c, ProtectedSandApp.s("磇\u0001"), null, null, 0, null, c.f77890b, 30, null), ']');
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public h1 a(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("磈\u0001"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.h c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    public boolean d() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public List<f1> getParameters() {
        return j0.f74919b;
    }

    @fg.l
    public final Set<kotlin.reflect.jvm.internal.impl.types.h0> i() {
        return this.f77885c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.types.h0> j() {
        return k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h1
    @fg.l
    public kotlin.reflect.jvm.internal.impl.builtins.h p() {
        return this.f77884b.p();
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("磉\u0001") + m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n(long j4, h0 h0Var, Set<? extends kotlin.reflect.jvm.internal.impl.types.h0> set) {
        d1.f78389c.getClass();
        this.f77886d = i0.e(d1.f78390d, this, false);
        this.f77887e = c0.c(new b());
        this.f77883a = j4;
        this.f77884b = h0Var;
        this.f77885c = set;
    }
}
