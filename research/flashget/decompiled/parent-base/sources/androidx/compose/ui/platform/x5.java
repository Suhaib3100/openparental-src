package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

/* compiled from: ViewLayer.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/x5;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "target", "Lkotlin/k2;", "a", "(Landroid/view/View;I)V", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(28)
/* loaded from: classes.dex */
final class x5 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final x5 f20212a = new x5();

    private x5() {
    }

    @androidx.annotation.u
    public final void a(@fg.l View view, int target) {
        view.setOutlineAmbientShadowColor(target);
    }

    @androidx.annotation.u
    public final void b(@fg.l View view, int target) {
        view.setOutlineSpotShadowColor(target);
    }
}
