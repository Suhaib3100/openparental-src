package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import kotlin.Metadata;

/* compiled from: AndroidRenderEffect.android.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/b1;", "Landroidx/compose/ui/graphics/s5;", "Landroid/graphics/RenderEffect;", "androidRenderEffect", "<init>", "(Landroid/graphics/RenderEffect;)V", "b", "()Landroid/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "d", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b1 extends s5 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final RenderEffect androidRenderEffect;

    public b1(@fg.l RenderEffect renderEffect) {
        super(null);
        this.androidRenderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.s5
    @fg.l
    /* renamed from: b, reason: from getter */
    protected RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }

    @fg.l
    public final RenderEffect d() {
        return this.androidRenderEffect;
    }
}
