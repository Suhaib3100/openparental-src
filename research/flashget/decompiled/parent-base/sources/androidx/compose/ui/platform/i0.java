package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/i0;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/view/translation/ViewTranslationCallback;", "translationCallback", "Lkotlin/k2;", "b", "(Landroid/view/View;Landroid/view/translation/ViewTranslationCallback;)V", "a", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(31)
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final i0 f19935a = new i0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f19936b = 0;

    private i0() {
    }

    @androidx.annotation.u
    @androidx.annotation.x0(31)
    public final void a(@fg.l View view) {
        view.clearViewTranslationCallback();
    }

    @androidx.annotation.u
    @androidx.annotation.x0(31)
    public final void b(@fg.l View view, @fg.l ViewTranslationCallback translationCallback) {
        view.setViewTranslationCallback(translationCallback);
    }
}
