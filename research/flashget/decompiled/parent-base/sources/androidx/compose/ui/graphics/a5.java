package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import kotlin.Metadata;

/* compiled from: AndroidRenderEffect.android.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/a5;", "Landroidx/compose/ui/graphics/s5;", "renderEffect", "Li0/f;", "offset", "<init>", "(Landroidx/compose/ui/graphics/s5;JLkotlin/jvm/internal/w;)V", "Landroid/graphics/RenderEffect;", "b", "()Landroid/graphics/RenderEffect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/s5;", "c", "J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a5 extends s5 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final s5 renderEffect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long offset;

    public /* synthetic */ a5(s5 s5Var, long j4, kotlin.jvm.internal.w wVar) {
        this(s5Var, j4);
    }

    @Override // androidx.compose.ui.graphics.s5
    @fg.l
    @androidx.annotation.x0(31)
    /* renamed from: b */
    protected RenderEffect getAndroidRenderEffect() {
        return y5.f18482a.b(this.renderEffect, this.offset);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) other;
        return kotlin.jvm.internal.l0.g(this.renderEffect, a5Var.renderEffect) && i0.f.l(this.offset, a5Var.offset);
    }

    public int hashCode() {
        s5 s5Var = this.renderEffect;
        return i0.f.s(this.offset) + ((s5Var != null ? s5Var.hashCode() : 0) * 31);
    }

    @fg.l
    public String toString() {
        return "OffsetEffect(renderEffect=" + this.renderEffect + ", offset=" + ((Object) i0.f.y(this.offset)) + ')';
    }

    private a5(s5 s5Var, long j4) {
        super(null);
        this.renderEffect = s5Var;
        this.offset = j4;
    }
}
