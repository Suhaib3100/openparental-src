package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r1;

/* compiled from: typeParameterUtils.kt */
@r1({"SMAP\ntypeParameterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n+ 2 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n15#2,2:101\n1549#3:103\n1620#3,3:104\n*S KotlinDebug\n*F\n+ 1 typeParameterUtils.kt\norg/jetbrains/kotlin/descriptors/TypeParameterUtilsKt\n*L\n37#1:101,2\n42#1:103\n42#1:104,3\n*E\n"})
/* loaded from: classes7.dex */
public final class g1 {

    /* compiled from: typeParameterUtils.kt */
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<m, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f75934b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l m mVar) {
            kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("殈\u0001"));
            return Boolean.valueOf(mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.a);
        }
    }

    /* compiled from: typeParameterUtils.kt */
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<m, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f75935b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l m mVar) {
            kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("殉\u0001"));
            return Boolean.valueOf(!(mVar instanceof l));
        }
    }

    /* compiled from: typeParameterUtils.kt */
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<m, kotlin.sequences.m<? extends f1>> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f75936b = new c(1);

        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.sequences.m<f1> invoke(@fg.l m mVar) {
            kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("殊\u0001"));
            List<f1> typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.a) mVar).getTypeParameters();
            kotlin.jvm.internal.l0.o(typeParameters, ProtectedSandApp.s("残\u0001"));
            return kotlin.collections.w.A1(typeParameters);
        }
    }

    @fg.m
    public static final s0 a(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("殌\u0001"));
        h c5 = h0Var.O0().c();
        return b(h0Var, c5 instanceof i ? (i) c5 : null, 0);
    }

    private static final s0 b(kotlin.reflect.jvm.internal.impl.types.h0 h0Var, i iVar, int i4) {
        if (iVar == null || kotlin.reflect.jvm.internal.impl.types.error.k.m(iVar)) {
            return null;
        }
        int size = iVar.s().size() + i4;
        if (iVar.n()) {
            List<kotlin.reflect.jvm.internal.impl.types.l1> subList = h0Var.M0().subList(i4, size);
            m c5 = iVar.c();
            return new s0(iVar, subList, b(h0Var, c5 instanceof i ? (i) c5 : null, size));
        }
        if (size != h0Var.M0().size()) {
            kotlin.reflect.jvm.internal.impl.resolve.f.E(iVar);
        }
        return new s0(iVar, h0Var.M0().subList(i4, h0Var.M0().size()), null);
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.c c(f1 f1Var, m mVar, int i4) {
        return new kotlin.reflect.jvm.internal.impl.descriptors.c(f1Var, mVar, i4);
    }

    @fg.l
    public static final List<f1> d(@fg.l i iVar) {
        List<f1> list;
        m mVar;
        kotlin.reflect.jvm.internal.impl.types.h1 j4;
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("殌\u0001"));
        List<f1> s4 = iVar.s();
        String s5 = ProtectedSandApp.s("殍\u0001");
        kotlin.jvm.internal.l0.o(s4, s5);
        if (!iVar.n() && !(iVar.c() instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            return s4;
        }
        List c32 = kotlin.sequences.p.c3(kotlin.sequences.p.H0(kotlin.sequences.p.p0(kotlin.sequences.p.Z2(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.r(iVar), a.f75934b), b.f75935b), c.f75936b));
        Iterator<m> it = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.r(iVar).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                mVar = null;
                break;
            }
            mVar = it.next();
            if (mVar instanceof e) {
                break;
            }
        }
        e eVar = (e) mVar;
        if (eVar != null && (j4 = eVar.j()) != null) {
            list = j4.getParameters();
        }
        if (list == null) {
            list = kotlin.collections.j0.f74919b;
        }
        if (c32.isEmpty() && list.isEmpty()) {
            List<f1> s6 = iVar.s();
            kotlin.jvm.internal.l0.o(s6, s5);
            return s6;
        }
        List<f1> D4 = kotlin.collections.w.D4(c32, list);
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(D4, 10));
        for (f1 f1Var : D4) {
            kotlin.jvm.internal.l0.m(f1Var);
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.c(f1Var, iVar, s4.size()));
        }
        return kotlin.collections.w.D4(s4, arrayList);
    }
}
