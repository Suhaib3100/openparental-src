package androidx.compose.ui.draw;

import androidx.compose.ui.node.k1;
import androidx.compose.ui.node.l1;
import androidx.compose.ui.q;
import androidx.compose.ui.unit.v;
import androidx.compose.ui.unit.w;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B(\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0013\u0010\u0015\u001a\u00020\u000f*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bRL\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t2\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010/\u001a\u00020,8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/ui/draw/f;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/draw/e;", "Landroidx/compose/ui/node/k1;", "Landroidx/compose/ui/draw/d;", "Landroidx/compose/ui/draw/g;", "cacheDrawScope", "Lkotlin/Function1;", "Landroidx/compose/ui/draw/m;", "Lkotlin/u;", "block", "<init>", "(Landroidx/compose/ui/draw/g;Lld/l;)V", "z7", "()Landroidx/compose/ui/draw/m;", "Lkotlin/k2;", "P4", "()V", "d2", "A3", "Landroidx/compose/ui/graphics/drawscope/c;", "E", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "p", "Landroidx/compose/ui/draw/g;", "", "q", "Z", "isCacheValid", "value", "r", "Lld/l;", "y7", "()Lld/l;", "A7", "(Lld/l;)V", "Landroidx/compose/ui/unit/d;", "b", "()Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "layoutDirection", "Li0/n;", "e", "()J", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawModifierNodeImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,312:1\n84#2:313\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawModifierNodeImpl\n*L\n190#1:313\n*E\n"})
/* loaded from: classes.dex */
final class f extends q.d implements e, k1, d {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g cacheDrawScope;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isCacheValid;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super g, m> block;

    /* compiled from: DrawModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f17440c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.f17440c = gVar;
        }

        public final void a() {
            f.this.y7().invoke(this.f17440c);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    public f(@fg.l g gVar, @fg.l ld.l<? super g, m> lVar) {
        this.cacheDrawScope = gVar;
        this.block = lVar;
        gVar.q(this);
    }

    private final m z7() {
        if (!this.isCacheValid) {
            g gVar = this.cacheDrawScope;
            gVar.t(null);
            l1.a(this, new a(gVar));
            if (gVar.getDrawResult() == null) {
                throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?");
            }
            this.isCacheValid = true;
        }
        m drawResult = this.cacheDrawScope.getDrawResult();
        l0.m(drawResult);
        return drawResult;
    }

    @Override // androidx.compose.ui.draw.e
    public void A3() {
        this.isCacheValid = false;
        this.cacheDrawScope.t(null);
        androidx.compose.ui.node.r.a(this);
    }

    public final void A7(@fg.l ld.l<? super g, m> lVar) {
        this.block = lVar;
        A3();
    }

    @Override // androidx.compose.ui.node.q
    public void E(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
        z7().a().invoke(cVar);
    }

    @Override // androidx.compose.ui.node.q
    public void P4() {
        A3();
    }

    @Override // androidx.compose.ui.draw.d
    @fg.l
    public androidx.compose.ui.unit.d b() {
        return androidx.compose.ui.node.k.n(this);
    }

    @Override // androidx.compose.ui.node.k1
    public void d2() {
        A3();
    }

    @Override // androidx.compose.ui.draw.d
    public long e() {
        return v.f(androidx.compose.ui.node.k.m(this, 128).c());
    }

    @Override // androidx.compose.ui.draw.d
    @fg.l
    public w getLayoutDirection() {
        return androidx.compose.ui.node.k.o(this);
    }

    @fg.l
    public final ld.l<g, m> y7() {
        return this.block;
    }
}
