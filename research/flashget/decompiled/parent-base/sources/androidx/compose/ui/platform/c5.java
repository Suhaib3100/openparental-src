package androidx.compose.ui.platform;

import android.view.RenderNode;
import kotlin.Metadata;

/* compiled from: RenderNodeApi23.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/c5;", "", "<init>", "()V", "Landroid/view/RenderNode;", "renderNode", "", "a", "(Landroid/view/RenderNode;)I", "target", "Lkotlin/k2;", "c", "(Landroid/view/RenderNode;I)V", "b", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(28)
/* loaded from: classes.dex */
final class c5 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final c5 f19789a = new c5();

    private c5() {
    }

    @androidx.annotation.u
    public final int a(@fg.l RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    @androidx.annotation.u
    public final int b(@fg.l RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    @androidx.annotation.u
    public final void c(@fg.l RenderNode renderNode, int target) {
        renderNode.setAmbientShadowColor(target);
    }

    @androidx.annotation.u
    public final void d(@fg.l RenderNode renderNode, int target) {
        renderNode.setSpotShadowColor(target);
    }
}
