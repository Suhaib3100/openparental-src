package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\tR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/r1;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "Lkotlin/u;", "layerBlock", "<init>", "(Lld/l;)V", "z7", "()V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "", "toString", "()Ljava/lang/String;", "p", "Lld/l;", "y7", "()Lld/l;", "A7", "", "b7", "()Z", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/BlockGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,672:1\n72#2:673\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/BlockGraphicsLayerModifier\n*L\n568#1:673\n*E\n"})
/* loaded from: classes.dex */
final class r1 extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super q4, kotlin.k2> layerBlock;

    /* compiled from: GraphicsLayerModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f18011b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r1 f18012c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.i1 i1Var, r1 r1Var) {
            super(1);
            this.f18011b = i1Var;
            this.f18012c = r1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.u(aVar, this.f18011b, 0, 0, 0.0f, this.f18012c.y7(), 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public r1(@fg.l ld.l<? super q4, kotlin.k2> lVar) {
        this.layerBlock = lVar;
    }

    public final void A7(@fg.l ld.l<? super q4, kotlin.k2> lVar) {
        this.layerBlock = lVar;
    }

    @Override // androidx.compose.ui.q.d
    public boolean b7() {
        return false;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(j4);
        return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new a(m02, this), 4, null);
    }

    @fg.l
    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.layerBlock + ')';
    }

    @fg.l
    public final ld.l<q4, kotlin.k2> y7() {
        return this.layerBlock;
    }

    public final void z7() {
        androidx.compose.ui.node.e1 wrapped = androidx.compose.ui.node.k.m(this, 2).getWrapped();
        if (wrapped != null) {
            wrapped.o5(this.layerBlock, true);
        }
    }
}
