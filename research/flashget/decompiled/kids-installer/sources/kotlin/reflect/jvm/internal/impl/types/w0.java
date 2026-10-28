package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes5.dex */
public final class w0 {

    /* compiled from: StarProjectionImpl.kt */
    /* loaded from: classes6.dex */
    public static final class a extends i1 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<h1> f26558d;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends h1> list) {
            this.f26558d = list;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.i1
        @d5.e
        public l1 k(@d5.d h1 h1Var) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("覩"));
            if (!this.f26558d.contains(h1Var)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h1Var.b();
            kotlin.jvm.internal.l0.n(b6, ProtectedSandApp.s("親"));
            return t1.s((kotlin.reflect.jvm.internal.impl.descriptors.f1) b6);
        }
    }

    private static final h0 a(List<? extends h1> list, List<? extends h0> list2, kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
        Object B2;
        q1 g5 = q1.g(new a(list));
        B2 = kotlin.collections.j0.B2(list2);
        h0 p5 = g5.p((h0) B2, x1.OUT_VARIANCE);
        if (p5 == null) {
            p5 = hVar.y();
        }
        kotlin.jvm.internal.l0.o(p5, ProtectedSandApp.s("塕"));
        return p5;
    }

    @d5.d
    public static final h0 b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var) {
        int b02;
        int b03;
        kotlin.jvm.internal.l0.p(f1Var, ProtectedSandApp.s("塖"));
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = f1Var.b();
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("塗"));
        boolean z5 = b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.i;
        String s5 = ProtectedSandApp.s("塘");
        String s6 = ProtectedSandApp.s("塙");
        if (z5) {
            List<kotlin.reflect.jvm.internal.impl.descriptors.f1> r5 = ((kotlin.reflect.jvm.internal.impl.descriptors.i) b6).m().r();
            kotlin.jvm.internal.l0.o(r5, ProtectedSandApp.s("塚"));
            b03 = kotlin.collections.b0.b0(r5, 10);
            ArrayList arrayList = new ArrayList(b03);
            Iterator<T> it = r5.iterator();
            while (it.hasNext()) {
                h1 m5 = ((kotlin.reflect.jvm.internal.impl.descriptors.f1) it.next()).m();
                kotlin.jvm.internal.l0.o(m5, s5);
                arrayList.add(m5);
            }
            List<h0> upperBounds = f1Var.getUpperBounds();
            kotlin.jvm.internal.l0.o(upperBounds, s6);
            return a(arrayList, upperBounds, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(f1Var));
        }
        if (!(b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.z)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("塜"));
        }
        List<kotlin.reflect.jvm.internal.impl.descriptors.f1> typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.z) b6).getTypeParameters();
        kotlin.jvm.internal.l0.o(typeParameters, ProtectedSandApp.s("塛"));
        b02 = kotlin.collections.b0.b0(typeParameters, 10);
        ArrayList arrayList2 = new ArrayList(b02);
        Iterator<T> it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            h1 m6 = ((kotlin.reflect.jvm.internal.impl.descriptors.f1) it2.next()).m();
            kotlin.jvm.internal.l0.o(m6, s5);
            arrayList2.add(m6);
        }
        List<h0> upperBounds2 = f1Var.getUpperBounds();
        kotlin.jvm.internal.l0.o(upperBounds2, s6);
        return a(arrayList2, upperBounds2, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(f1Var));
    }
}
