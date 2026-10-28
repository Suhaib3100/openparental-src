package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.j0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.v1;
import kotlin.reflect.jvm.internal.impl.types.w1;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: KotlinTypePreparator.kt */
@r1({"SMAP\nKotlinTypePreparator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypePreparator.kt\norg/jetbrains/kotlin/types/checker/KotlinTypePreparator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 5 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt$transformComponents$1\n*L\n1#1,76:1\n1#2:77\n1549#3:78\n1620#3,3:79\n1549#3:82\n1620#3,3:83\n1549#3:92\n1620#3,2:93\n1622#3:101\n98#4,6:86\n104#4:95\n105#4,4:97\n112#4,7:102\n99#5:96\n*S KotlinDebug\n*F\n+ 1 KotlinTypePreparator.kt\norg/jetbrains/kotlin/types/checker/KotlinTypePreparator\n*L\n27#1:78\n27#1:79,3\n37#1:82\n37#1:83,3\n48#1:92\n48#1:93,2\n48#1:101\n48#1:86,6\n48#1:95\n48#1:97,4\n48#1:102,7\n48#1:96\n*E\n"})
/* loaded from: classes7.dex */
public abstract class f extends kotlin.reflect.jvm.internal.impl.types.i {

    /* compiled from: KotlinTypePreparator.kt */
    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f78350a = new a();

        private a() {
        }
    }

    /* compiled from: KotlinTypePreparator.kt */
    /* synthetic */ class b extends g0 implements ld.l<ce.i, w1> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final w1 invoke(@fg.l ce.i iVar) {
            l0.p(iVar, ProtectedSandApp.s("絧\u0001"));
            return ((f) this.receiver).a(iVar);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @fg.l
        public final String getName() {
            return ProtectedSandApp.s("絨\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final kotlin.reflect.h getOwner() {
            return l1.d(f.class);
        }

        @Override // kotlin.jvm.internal.q
        @fg.l
        public final String getSignature() {
            return ProtectedSandApp.s("絩\u0001");
        }
    }

    private final p0 c(p0 p0Var) {
        h0 type;
        h1 O0 = p0Var.O0();
        kotlin.reflect.jvm.internal.impl.types.g0 g0Var = null;
        r3 = null;
        w1 w1Var = null;
        if (O0 instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c) {
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c cVar = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c) O0;
            kotlin.reflect.jvm.internal.impl.types.l1 projection = cVar.getProjection();
            if (projection.c() != x1.IN_VARIANCE) {
                projection = null;
            }
            if (projection != null && (type = projection.getType()) != null) {
                w1Var = type.R0();
            }
            w1 w1Var2 = w1Var;
            if (cVar.f() == null) {
                kotlin.reflect.jvm.internal.impl.types.l1 projection2 = cVar.getProjection();
                Collection<h0> j4 = cVar.j();
                ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(j4, 10));
                Iterator<T> it = j4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((h0) it.next()).R0());
                }
                cVar.h(new j(projection2, arrayList, null, 4, null));
            }
            ce.b bVar = ce.b.FOR_SUBTYPING;
            j f4 = cVar.f();
            l0.m(f4);
            return new i(bVar, f4, w1Var2, p0Var.N0(), p0Var.P0(), false, 32, null);
        }
        boolean z4 = false;
        if (O0 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.p) {
            Collection<h0> j5 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.p) O0).j();
            ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(j5, 10));
            Iterator<T> it2 = j5.iterator();
            while (it2.hasNext()) {
                h0 p4 = t1.p((h0) it2.next(), p0Var.P0());
                l0.o(p4, ProtectedSandApp.s("絤\u0001"));
                arrayList2.add(p4);
            }
            return i0.m(p0Var.N0(), new kotlin.reflect.jvm.internal.impl.types.g0(arrayList2), j0.f74919b, false, p0Var.q());
        }
        if (!(O0 instanceof kotlin.reflect.jvm.internal.impl.types.g0) || !p0Var.P0()) {
            return p0Var;
        }
        kotlin.reflect.jvm.internal.impl.types.g0 g0Var2 = (kotlin.reflect.jvm.internal.impl.types.g0) O0;
        Collection<h0> j6 = g0Var2.j();
        ArrayList arrayList3 = new ArrayList(kotlin.collections.w.b0(j6, 10));
        Iterator<T> it3 = j6.iterator();
        while (it3.hasNext()) {
            arrayList3.add(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.w((h0) it3.next()));
            z4 = true;
        }
        if (z4) {
            h0 g4 = g0Var2.g();
            g0Var = new kotlin.reflect.jvm.internal.impl.types.g0(arrayList3).l(g4 != null ? kotlin.reflect.jvm.internal.impl.types.typeUtil.a.w(g4) : null);
        }
        if (g0Var != null) {
            g0Var2 = g0Var;
        }
        return g0Var2.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i
    @fg.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public w1 a(@fg.l ce.i iVar) {
        w1 d5;
        l0.p(iVar, ProtectedSandApp.s("絥\u0001"));
        if (!(iVar instanceof h0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("給\u0001"));
        }
        w1 R0 = ((h0) iVar).R0();
        if (R0 instanceof p0) {
            d5 = c((p0) R0);
        } else {
            if (!(R0 instanceof b0)) {
                throw new NoWhenBranchMatchedException();
            }
            b0 b0Var = (b0) R0;
            p0 c5 = c(b0Var.W0());
            p0 c6 = c(b0Var.X0());
            d5 = (c5 == b0Var.W0() && c6 == b0Var.X0()) ? R0 : i0.d(c5, c6);
        }
        return v1.c(d5, R0, new b(1, this));
    }
}
