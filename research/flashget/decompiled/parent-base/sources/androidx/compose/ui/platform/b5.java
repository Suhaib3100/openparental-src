package androidx.compose.ui.platform;

import android.view.RenderNode;
import kotlin.Metadata;

/* compiled from: RenderNodeApi23.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/b5;", "", "<init>", "()V", "Landroid/view/RenderNode;", "renderNode", "Lkotlin/k2;", "a", "(Landroid/view/RenderNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(24)
/* loaded from: classes.dex */
final class b5 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final b5 f19778a = new b5();

    private b5() {
    }

    @androidx.annotation.u
    public final void a(@fg.l RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
