package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;
import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/j0;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/compose/ui/input/pointer/w;", "icon", "Lkotlin/k2;", "a", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(24)
/* loaded from: classes.dex */
final class j0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final j0 f19949a = new j0();

    private j0() {
    }

    @androidx.annotation.u
    @androidx.annotation.x0(24)
    public final void a(@fg.l View view, @fg.m androidx.compose.ui.input.pointer.w icon) {
        PointerIcon pointerIcon = icon instanceof androidx.compose.ui.input.pointer.a ? ((androidx.compose.ui.input.pointer.a) icon).getPointerIcon() : icon instanceof androidx.compose.ui.input.pointer.b ? PointerIcon.getSystemIcon(view.getContext(), ((androidx.compose.ui.input.pointer.b) icon).getType()) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (kotlin.jvm.internal.l0.g(view.getPointerIcon(), pointerIcon)) {
            return;
        }
        view.setPointerIcon(pointerIcon);
    }
}
