package androidx.compose.ui.node;

import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: BackwardsCompatNode.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\" \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/c;", "", "e", "(Landroidx/compose/ui/node/c;)Z", "androidx/compose/ui/node/d$a", "a", "Landroidx/compose/ui/node/d$a;", "DetachedModifierLocalReadScope", "Lkotlin/Function1;", "Lkotlin/k2;", "b", "Lld/l;", "onDrawCacheReadsChanged", "c", "updateModifierLocalConsumer", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final a f19216a = new a();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final ld.l<androidx.compose.ui.node.c, k2> f19217b = b.f19219b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final ld.l<androidx.compose.ui.node.c, k2> f19218c = c.f19220b;

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R$\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"androidx/compose/ui/node/d$a", "Landroidx/compose/ui/modifier/n;", "T", "Landroidx/compose/ui/modifier/c;", "v", "(Landroidx/compose/ui/modifier/c;)Ljava/lang/Object;", "current", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements androidx.compose.ui.modifier.n {
        a() {
        }

        @Override // androidx.compose.ui.modifier.n
        public <T> T v(@fg.l androidx.compose.ui.modifier.c<T> cVar) {
            return cVar.a().invoke();
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/c;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.c, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f19219b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.node.c cVar) {
            cVar.C7();
        }

        @Override // ld.l
        public k2 invoke(androidx.compose.ui.node.c cVar) {
            cVar.C7();
            return k2.f75408a;
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/c;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.c, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f19220b = new c(1);

        c() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.node.c cVar) {
            cVar.H7();
        }

        @Override // ld.l
        public k2 invoke(androidx.compose.ui.node.c cVar) {
            cVar.H7();
            return k2.f75408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(androidx.compose.ui.node.c cVar) {
        q.d tail = k.p(cVar).getNodes().getTail();
        kotlin.jvm.internal.l0.n(tail, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((b2) tail).getAttachHasBeenRun();
    }
}
