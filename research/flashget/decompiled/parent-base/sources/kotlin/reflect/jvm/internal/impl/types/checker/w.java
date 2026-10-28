package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.e0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.t0;
import kotlin.reflect.jvm.internal.impl.types.w1;
import kotlin.reflect.jvm.internal.impl.types.x0;

/* compiled from: IntersectionType.kt */
@r1({"SMAP\nIntersectionType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/TypeIntersector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1549#2:184\n1620#2,2:185\n1622#2:188\n1789#2,3:189\n1620#2,3:192\n1549#2:195\n1620#2,3:196\n2661#2,7:199\n1747#2,3:206\n1#3:187\n*S KotlinDebug\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/TypeIntersector\n*L\n80#1:184\n80#1:185,2\n80#1:188\n87#1:189,3\n98#1:192,3\n104#1:195\n104#1:196,3\n104#1:199,7\n137#1:206,3\n*E\n"})
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final w f78382a = new w();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntersectionType.kt */
    private static final class a {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACCEPT_NULL;
        public static final a NOT_NULL;
        public static final a START;
        public static final a UNKNOWN;

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.w$a$a, reason: collision with other inner class name */
        static final class C1191a extends a {
            C1191a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.w.a
            @fg.l
            public a combine(@fg.l w1 w1Var) {
                l0.p(w1Var, ProtectedSandApp.s("緆\u0001"));
                return getResultNullability(w1Var);
            }
        }

        /* compiled from: IntersectionType.kt */
        static final class b extends a {
            b(String str, int i4) {
                super(str, i4, null);
            }

            @fg.l
            public b a(@fg.l w1 w1Var) {
                l0.p(w1Var, ProtectedSandApp.s("緇\u0001"));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.w.a
            public a combine(w1 w1Var) {
                l0.p(w1Var, ProtectedSandApp.s("緇\u0001"));
                return this;
            }
        }

        /* compiled from: IntersectionType.kt */
        static final class c extends a {
            c(String str, int i4) {
                super(str, i4, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.w.a
            @fg.l
            public a combine(@fg.l w1 w1Var) {
                l0.p(w1Var, ProtectedSandApp.s("緈\u0001"));
                return getResultNullability(w1Var);
            }
        }

        /* compiled from: IntersectionType.kt */
        static final class d extends a {
            d(String str, int i4) {
                super(str, i4, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.w.a
            @fg.l
            public a combine(@fg.l w1 w1Var) {
                l0.p(w1Var, ProtectedSandApp.s("緉\u0001"));
                a resultNullability = getResultNullability(w1Var);
                return resultNullability == a.ACCEPT_NULL ? this : resultNullability;
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
        }

        static {
            kotlin.jvm.internal.w wVar = null;
            START = new c(ProtectedSandApp.s("緁\u0001"), 0, wVar);
            ACCEPT_NULL = new C1191a(ProtectedSandApp.s("緂\u0001"), 1, wVar);
            UNKNOWN = new d(ProtectedSandApp.s("緃\u0001"), 2, wVar);
            NOT_NULL = new b(ProtectedSandApp.s("緄\u0001"), 3, wVar);
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        public /* synthetic */ a(String str, int i4, kotlin.jvm.internal.w wVar) {
            this(str, i4);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @fg.l
        public abstract a combine(@fg.l w1 w1Var);

        @fg.l
        protected final a getResultNullability(@fg.l w1 w1Var) {
            l0.p(w1Var, ProtectedSandApp.s("緅\u0001"));
            return w1Var.P0() ? ACCEPT_NULL : ((w1Var instanceof kotlin.reflect.jvm.internal.impl.types.q) && (((kotlin.reflect.jvm.internal.impl.types.q) w1Var).a1() instanceof x0)) ? NOT_NULL : w1Var instanceof x0 ? UNKNOWN : o.f78375a.a(w1Var) ? NOT_NULL : UNKNOWN;
        }

        private a(String str, int i4) {
        }
    }

    /* compiled from: IntersectionType.kt */
    static final class b extends n0 implements ld.a<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set<p0> f78383b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Set<? extends p0> set) {
            super(0);
            this.f78383b = set;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ProtectedSandApp.s("緊\u0001") + kotlin.collections.w.m3(this.f78383b, null, null, null, 0, null, null, 63, null);
        }
    }

    /* compiled from: IntersectionType.kt */
    /* synthetic */ class c extends g0 implements ld.p<h0, h0, Boolean> {
        c(Object obj) {
            super(2, obj);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l h0 h0Var, @fg.l h0 h0Var2) {
            l0.p(h0Var, ProtectedSandApp.s("緋\u0001"));
            l0.p(h0Var2, ProtectedSandApp.s("緌\u0001"));
            return Boolean.valueOf(((w) this.receiver).e(h0Var, h0Var2));
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("緍\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return l1.d(w.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("緎\u0001");
        }
    }

    /* compiled from: IntersectionType.kt */
    /* synthetic */ class d extends g0 implements ld.p<h0, h0, Boolean> {
        d(Object obj) {
            super(2, obj);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l h0 h0Var, @fg.l h0 h0Var2) {
            l0.p(h0Var, ProtectedSandApp.s("総\u0001"));
            l0.p(h0Var2, ProtectedSandApp.s("緐\u0001"));
            return Boolean.valueOf(((m) this.receiver).b(h0Var, h0Var2));
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("緑\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return l1.d(m.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("緒\u0001");
        }
    }

    private w() {
    }

    private final Collection<p0> b(Collection<? extends p0> collection, ld.p<? super p0, ? super p0, Boolean> pVar) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        l0.o(it, ProtectedSandApp.s("緓\u0001"));
        while (it.hasNext()) {
            p0 p0Var = (p0) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    p0 p0Var2 = (p0) it2.next();
                    if (p0Var2 != p0Var) {
                        l0.m(p0Var2);
                        l0.m(p0Var);
                        if (pVar.invoke(p0Var2, p0Var).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final p0 d(Set<? extends p0> set) {
        if (set.size() == 1) {
            return (p0) kotlin.collections.w.f5(set);
        }
        new b(set);
        Set<? extends p0> set2 = set;
        Collection<p0> b5 = b(set2, new c(2, this));
        b5.isEmpty();
        p0 b6 = kotlin.reflect.jvm.internal.impl.resolve.constants.n.f77882f.b(b5);
        if (b6 != null) {
            return b6;
        }
        Collection<p0> b7 = b(b5, new d(2, l.f78369b.a()));
        b7.isEmpty();
        return b7.size() < 2 ? (p0) kotlin.collections.w.f5(b7) : new kotlin.reflect.jvm.internal.impl.types.g0(set2).f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(h0 h0Var, h0 h0Var2) {
        m a5 = l.f78369b.a();
        return a5.d(h0Var, h0Var2) && !a5.d(h0Var2, h0Var);
    }

    @fg.l
    public final p0 c(@fg.l List<? extends p0> list) {
        l0.p(list, ProtectedSandApp.s("緔\u0001"));
        list.size();
        ArrayList<p0> arrayList = new ArrayList();
        for (p0 p0Var : list) {
            if (p0Var.O0() instanceof kotlin.reflect.jvm.internal.impl.types.g0) {
                Collection<h0> j4 = p0Var.O0().j();
                l0.o(j4, ProtectedSandApp.s("緕\u0001"));
                Collection<h0> collection = j4;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(collection, 10));
                for (h0 h0Var : collection) {
                    l0.m(h0Var);
                    p0 d5 = e0.d(h0Var);
                    if (p0Var.P0()) {
                        d5 = d5.V0(true);
                    }
                    arrayList2.add(d5);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(p0Var);
            }
        }
        a aVar = a.START;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVar = aVar.combine((w1) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (p0 p0Var2 : arrayList) {
            if (aVar == a.NOT_NULL) {
                if (p0Var2 instanceof i) {
                    p0Var2 = t0.k((i) p0Var2);
                }
                p0Var2 = t0.i(p0Var2, false, 1, null);
            }
            linkedHashSet.add(p0Var2);
        }
        List<? extends p0> list2 = list;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.w.b0(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((p0) it2.next()).N0());
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("緖\u0001"));
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((d1) next).m((d1) it3.next());
        }
        return d(linkedHashSet).U0((d1) next);
    }
}
