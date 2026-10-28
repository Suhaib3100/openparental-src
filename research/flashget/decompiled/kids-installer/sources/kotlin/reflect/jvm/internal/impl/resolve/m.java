package kotlin.reflect.jvm.internal.impl.resolve;

import a0.c;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: overridingUtils.kt */
/* loaded from: classes5.dex */
public final class m {

    /* JADX INFO: Add missing generic type declarations: [H] */
    /* compiled from: overridingUtils.kt */
    /* loaded from: classes6.dex */
    static final class a<H> extends Lambda implements q3.l<H, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.utils.f<H> f25969p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.utils.f<H> fVar) {
            super(1);
            this.f25969p = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Object obj) {
            a(obj);
            return m2.f23662a;
        }

        public final void a(H h5) {
            kotlin.reflect.jvm.internal.impl.utils.f<H> fVar = this.f25969p;
            l0.o(h5, ProtectedSandApp.s("蚬"));
            fVar.add(h5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public static final <H> Collection<H> a(@d5.d Collection<? extends H> collection, @d5.d q3.l<? super H, ? extends kotlin.reflect.jvm.internal.impl.descriptors.a> lVar) {
        Object B2;
        Object f52;
        l0.p(collection, ProtectedSandApp.s("匴"));
        l0.p(lVar, ProtectedSandApp.s("匵"));
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        kotlin.reflect.jvm.internal.impl.utils.f a6 = kotlin.reflect.jvm.internal.impl.utils.f.f26679q.a();
        while (!linkedList.isEmpty()) {
            B2 = j0.B2(linkedList);
            kotlin.reflect.jvm.internal.impl.utils.f a7 = kotlin.reflect.jvm.internal.impl.utils.f.f26679q.a();
            Collection<c.C0000c> p5 = k.p(B2, linkedList, lVar, new a(a7));
            l0.o(p5, ProtectedSandApp.s("匶"));
            if (p5.size() == 1 && a7.isEmpty()) {
                f52 = j0.f5(p5);
                l0.o(f52, ProtectedSandApp.s("匷"));
                a6.add(f52);
            } else {
                c.C0000c c0000c = (Object) k.L(p5, lVar);
                l0.o(c0000c, ProtectedSandApp.s("匸"));
                kotlin.reflect.jvm.internal.impl.descriptors.a N = lVar.N(c0000c);
                for (c.C0000c c0000c2 : p5) {
                    l0.o(c0000c2, ProtectedSandApp.s("匹"));
                    if (!k.B(N, lVar.N(c0000c2))) {
                        a7.add(c0000c2);
                    }
                }
                if (!a7.isEmpty()) {
                    a6.addAll(a7);
                }
                a6.add(c0000c);
            }
        }
        return a6;
    }
}
