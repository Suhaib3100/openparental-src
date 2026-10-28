package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.unit.w;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: DrawModifier.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\r\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\r\u0010\u000bR\"\u0010\u0015\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010 \u001a\u00020\u001d8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010&R\u0014\u0010)\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/draw/g;", "Landroidx/compose/ui/unit/d;", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "Lkotlin/u;", "block", "Landroidx/compose/ui/draw/m;", "l", "(Lld/l;)Landroidx/compose/ui/draw/m;", "Landroidx/compose/ui/graphics/drawscope/c;", "p", "Landroidx/compose/ui/draw/d;", "b", "Landroidx/compose/ui/draw/d;", "a", "()Landroidx/compose/ui/draw/d;", "q", "(Landroidx/compose/ui/draw/d;)V", "cacheParams", "c", "Landroidx/compose/ui/draw/m;", "f", "()Landroidx/compose/ui/draw/m;", "t", "(Landroidx/compose/ui/draw/m;)V", "drawResult", "Li0/n;", "e", "()J", "size", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "layoutDirection", "", "()F", "density", "U", "fontScale", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n1#2:313\n*E\n"})
/* loaded from: classes.dex */
public final class g implements androidx.compose.ui.unit.d {

    /* renamed from: d, reason: collision with root package name */
    public static final int f17441d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private d cacheParams = o.f17450b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private m drawResult;

    /* compiled from: DrawModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<androidx.compose.ui.graphics.drawscope.c, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.graphics.drawscope.f, k2> f17444b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> lVar) {
            super(1);
            this.f17444b = lVar;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
            this.f17444b.invoke(cVar);
            cVar.G6();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.graphics.drawscope.c cVar) {
            a(cVar);
            return k2.f75408a;
        }
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: U */
    public float getFontScale() {
        return this.cacheParams.b().getFontScale();
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final d getCacheParams() {
        return this.cacheParams;
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: b */
    public float getDensity() {
        return this.cacheParams.b().getDensity();
    }

    public final long e() {
        return this.cacheParams.e();
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final m getDrawResult() {
        return this.drawResult;
    }

    @fg.l
    public final w getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    @fg.l
    public final m l(@fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> block) {
        return p(new a(block));
    }

    @fg.l
    public final m p(@fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.c, k2> block) {
        m mVar = new m(block);
        this.drawResult = mVar;
        return mVar;
    }

    public final void q(@fg.l d dVar) {
        this.cacheParams = dVar;
    }

    public final void t(@fg.m m mVar) {
        this.drawResult = mVar;
    }
}
