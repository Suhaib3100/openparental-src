package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

/* compiled from: ViewLayer.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/z5;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/compose/ui/graphics/s5;", "target", "Lkotlin/k2;", "a", "(Landroid/view/View;Landroidx/compose/ui/graphics/s5;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(31)
/* loaded from: classes.dex */
final class z5 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final z5 f20242a = new z5();

    private z5() {
    }

    @androidx.annotation.u
    public final void a(@fg.l View view, @fg.m androidx.compose.ui.graphics.s5 target) {
        view.setRenderEffect(target != null ? target.a() : null);
    }
}
