package kotlin.reflect.jvm.internal.impl.resolve;

import a0.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: overridingUtils.kt */
@r1({"SMAP\noverridingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1620#2,3:85\n847#2,2:88\n*S KotlinDebug\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n*L\n40#1:85,3\n72#1:88,2\n*E\n"})
/* loaded from: classes7.dex */
public final class n {

    /* JADX INFO: Add missing generic type declarations: [H] */
    /* compiled from: overridingUtils.kt */
    static final class a<H> extends n0 implements ld.l<H, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.utils.g<H> f77952b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.utils.g<H> gVar) {
            super(1);
            this.f77952b = gVar;
        }

        public final void a(H h4) {
            kotlin.reflect.jvm.internal.impl.utils.g<H> gVar = this.f77952b;
            l0.m(h4);
            gVar.add(h4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
            a(obj);
            return k2.f75408a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final <H> Collection<H> a(@fg.l Collection<? extends H> collection, @fg.l ld.l<? super H, ? extends kotlin.reflect.jvm.internal.impl.descriptors.a> lVar) {
        l0.p(collection, ProtectedSandApp.s("穰\u0001"));
        l0.p(lVar, ProtectedSandApp.s("穱\u0001"));
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        kotlin.reflect.jvm.internal.impl.utils.g a5 = kotlin.reflect.jvm.internal.impl.utils.g.f78687d.a();
        while (!linkedList.isEmpty()) {
            Object B2 = w.B2(linkedList);
            kotlin.reflect.jvm.internal.impl.utils.g a6 = kotlin.reflect.jvm.internal.impl.utils.g.f78687d.a();
            Collection<b0> p4 = l.p(B2, linkedList, lVar, new a(a6));
            l0.o(p4, ProtectedSandApp.s("穲\u0001"));
            if (p4.size() == 1 && a6.isEmpty()) {
                Object f5 = w.f5(p4);
                l0.o(f5, ProtectedSandApp.s("穳\u0001"));
                a5.add(f5);
            } else {
                b0 b0Var = (Object) l.L(p4, lVar);
                l0.o(b0Var, ProtectedSandApp.s("穴\u0001"));
                kotlin.reflect.jvm.internal.impl.descriptors.a invoke = lVar.invoke(b0Var);
                for (b0 b0Var2 : p4) {
                    l0.m(b0Var2);
                    if (!l.B(invoke, lVar.invoke(b0Var2))) {
                        a6.add(b0Var2);
                    }
                }
                if (!a6.isEmpty()) {
                    a5.addAll(a6);
                }
                a5.add(b0Var);
            }
        }
        return a5;
    }
}
