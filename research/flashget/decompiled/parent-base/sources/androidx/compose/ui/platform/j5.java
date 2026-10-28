package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import kotlin.Metadata;

/* compiled from: AndroidTextToolbar.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/j5;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/view/ActionMode$Callback;", "actionModeCallback", "", "type", "Landroid/view/ActionMode;", "b", "(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;", "actionMode", "Lkotlin/k2;", "a", "(Landroid/view/ActionMode;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(23)
/* loaded from: classes.dex */
public final class j5 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final j5 f19953a = new j5();

    /* renamed from: b, reason: collision with root package name */
    public static final int f19954b = 0;

    private j5() {
    }

    @androidx.annotation.u
    @androidx.annotation.x0(23)
    public final void a(@fg.l ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    @androidx.annotation.u
    @fg.m
    @androidx.annotation.x0(23)
    public final ActionMode b(@fg.l View view, @fg.l ActionMode.Callback actionModeCallback, int type) {
        return view.startActionMode(actionModeCallback, type);
    }
}
