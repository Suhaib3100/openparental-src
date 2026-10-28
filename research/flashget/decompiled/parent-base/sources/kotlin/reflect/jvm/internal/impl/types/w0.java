package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: StarProjectionImpl.kt */
@kotlin.jvm.internal.r1({"SMAP\nStarProjectionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StarProjectionImpl.kt\norg/jetbrains/kotlin/types/StarProjectionImplKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1549#2:102\n1620#2,3:103\n1549#2:106\n1620#2,3:107\n*S KotlinDebug\n*F\n+ 1 StarProjectionImpl.kt\norg/jetbrains/kotlin/types/StarProjectionImplKt\n*L\n66#1:102\n66#1:103,3\n73#1:106\n73#1:107,3\n*E\n"})
/* loaded from: classes7.dex */
public final class w0 {

    /* compiled from: StarProjectionImpl.kt */
    public static final class a extends i1 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<h1> f78567d;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends h1> list) {
            this.f78567d = list;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.i1
        @fg.m
        public l1 k(@fg.l h1 h1Var) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("肆\u0001"));
            if (!this.f78567d.contains(h1Var)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h1Var.c();
            kotlin.jvm.internal.l0.n(c5, ProtectedSandApp.s("肇\u0001"));
            return t1.s((kotlin.reflect.jvm.internal.impl.descriptors.f1) c5);
        }
    }

    private static final h0 a(List<? extends h1> list, List<? extends h0> list2, kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
        h0 p4 = q1.g(new a(list)).p((h0) kotlin.collections.w.B2(list2), x1.OUT_VARIANCE);
        if (p4 == null) {
            p4 = hVar.y();
        }
        kotlin.jvm.internal.l0.m(p4);
        return p4;
    }

    @fg.l
    public static final h0 b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var) {
        kotlin.jvm.internal.l0.p(f1Var, ProtectedSandApp.s("肈\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = f1Var.c();
        kotlin.jvm.internal.l0.o(c5, ProtectedSandApp.s("肉\u0001"));
        boolean z4 = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i;
        String s4 = ProtectedSandApp.s("肊\u0001");
        String s5 = ProtectedSandApp.s("肋\u0001");
        if (z4) {
            List<kotlin.reflect.jvm.internal.impl.descriptors.f1> parameters = ((kotlin.reflect.jvm.internal.impl.descriptors.i) c5).j().getParameters();
            kotlin.jvm.internal.l0.o(parameters, ProtectedSandApp.s("肌\u0001"));
            List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list = parameters;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                h1 j4 = ((kotlin.reflect.jvm.internal.impl.descriptors.f1) it.next()).j();
                kotlin.jvm.internal.l0.o(j4, s5);
                arrayList.add(j4);
            }
            List<h0> upperBounds = f1Var.getUpperBounds();
            kotlin.jvm.internal.l0.o(upperBounds, s4);
            return a(arrayList, upperBounds, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(f1Var));
        }
        if (!(c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.z)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("肎\u0001"));
        }
        List<kotlin.reflect.jvm.internal.impl.descriptors.f1> typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.z) c5).getTypeParameters();
        kotlin.jvm.internal.l0.o(typeParameters, ProtectedSandApp.s("肍\u0001"));
        List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            h1 j5 = ((kotlin.reflect.jvm.internal.impl.descriptors.f1) it2.next()).j();
            kotlin.jvm.internal.l0.o(j5, s5);
            arrayList2.add(j5);
        }
        List<h0> upperBounds2 = f1Var.getUpperBounds();
        kotlin.jvm.internal.l0.o(upperBounds2, s4);
        return a(arrayList2, upperBounds2, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(f1Var));
    }
}
