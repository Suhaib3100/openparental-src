package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.drawscope.f;
import androidx.compose.ui.graphics.e2;
import fg.l;
import fg.m;
import i0.n;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: ColorPainter.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R \u0010'\u001a\u00020%8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b#\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/painter/d;", "Landroidx/compose/ui/graphics/painter/e;", "Landroidx/compose/ui/graphics/d2;", "color", "<init>", "(JLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "k", "(Landroidx/compose/ui/graphics/drawscope/f;)V", "", "alpha", "", "a", "(F)Z", "Landroidx/compose/ui/graphics/e2;", "colorFilter", "b", "(Landroidx/compose/ui/graphics/e2;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "g", "J", "l", "()J", "h", "F", "i", "Landroidx/compose/ui/graphics/e2;", "Li0/n;", "j", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long color;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @m
    private e2 colorFilter;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long intrinsicSize;

    public /* synthetic */ d(long j4, w wVar) {
        this(j4);
    }

    @Override // androidx.compose.ui.graphics.painter.e
    protected boolean a(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    protected boolean b(@m e2 colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof d) && d2.y(this.color, ((d) other).color);
    }

    public int hashCode() {
        return d2.K(this.color);
    }

    @Override // androidx.compose.ui.graphics.painter.e
    /* renamed from: i, reason: from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }

    @Override // androidx.compose.ui.graphics.painter.e
    protected void k(@l f fVar) {
        f.t5(fVar, this.color, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
    }

    /* renamed from: l, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    @l
    public String toString() {
        return "ColorPainter(color=" + ((Object) d2.L(this.color)) + ')';
    }

    private d(long j4) {
        this.color = j4;
        this.alpha = 1.0f;
        n.INSTANCE.getClass();
        this.intrinsicSize = n.f74172d;
    }
}
