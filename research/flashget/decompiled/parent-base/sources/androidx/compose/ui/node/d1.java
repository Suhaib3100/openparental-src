package androidx.compose.ui.node;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: NodeChain.kt */
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u000b*\u0001\u0012\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/q$c;", "prev", "next", "", "d", "(Landroidx/compose/ui/q$c;Landroidx/compose/ui/q$c;)I", "Landroidx/compose/ui/q$d;", "T", "Landroidx/compose/ui/node/y0;", "node", "Lkotlin/k2;", "f", "(Landroidx/compose/ui/node/y0;Landroidx/compose/ui/q$d;)V", "Landroidx/compose/ui/q;", "Landroidx/compose/runtime/collection/g;", "result", "e", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/collection/g;)Landroidx/compose/runtime/collection/g;", "androidx/compose/ui/node/d1$a", "a", "Landroidx/compose/ui/node/d1$a;", "SentinelHead", "b", "I", "ActionReplace", "c", "ActionUpdate", "ActionReuse", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,862:1\n1188#2:863\n1#3:864\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n*L\n831#1:863\n*E\n"})
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final a f19222a;

    /* renamed from: b, reason: collision with root package name */
    private static final int f19223b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f19224c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f19225d = 2;

    /* compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/node/d1$a", "Landroidx/compose/ui/q$d;", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends q.d {
        a() {
        }

        @fg.l
        public String toString() {
            return "<Head>";
        }
    }

    /* compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/q$c;", "element", "", "a", "(Landroidx/compose/ui/q$c;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<q.c, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.collection.g<q.c> f19226b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.runtime.collection.g<q.c> gVar) {
            super(1);
            this.f19226b = gVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l q.c cVar) {
            this.f19226b.b(cVar);
            return Boolean.TRUE;
        }
    }

    static {
        a aVar = new a();
        aVar.o7(-1);
        f19222a = aVar;
    }

    public static final int d(@fg.l q.c cVar, @fg.l q.c cVar2) {
        if (kotlin.jvm.internal.l0.g(cVar, cVar2)) {
            return 2;
        }
        return (androidx.compose.ui.b.a(cVar, cVar2) || ((cVar instanceof ForceUpdateElement) && androidx.compose.ui.b.a(((ForceUpdateElement) cVar).s(), cVar2))) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.runtime.collection.g<q.c> e(androidx.compose.ui.q qVar, androidx.compose.runtime.collection.g<q.c> gVar) {
        int size = gVar.getSize();
        if (size < 16) {
            size = 16;
        }
        androidx.compose.runtime.collection.g gVar2 = new androidx.compose.runtime.collection.g(new androidx.compose.ui.q[size], 0);
        gVar2.b(qVar);
        b bVar = null;
        while (gVar2.V()) {
            androidx.compose.ui.q qVar2 = (androidx.compose.ui.q) androidx.compose.foundation.gestures.i.a(gVar2, 1);
            if (qVar2 instanceof androidx.compose.ui.g) {
                androidx.compose.ui.g gVar3 = (androidx.compose.ui.g) qVar2;
                gVar2.b(gVar3.getInner());
                gVar2.b(gVar3.getOuter());
            } else if (qVar2 instanceof q.c) {
                gVar.b(qVar2);
            } else {
                if (bVar == null) {
                    bVar = new b(gVar);
                }
                qVar2.Z(bVar);
                bVar = bVar;
            }
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends q.d> void f(y0<T> y0Var, q.d dVar) {
        kotlin.jvm.internal.l0.n(dVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        y0Var.m(dVar);
    }
}
