package o0;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.x0;
import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import i0.i;
import kotlin.Metadata;

/* compiled from: FloatingTextActionModeCallback.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0019\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lo0/a;", "Landroid/view/ActionMode$Callback2;", "Lo0/d;", "callback", "<init>", "(Lo0/d;)V", "Landroid/view/ActionMode;", "mode", "Landroid/view/MenuItem;", "item", "", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "Landroid/view/Menu;", "menu", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "Lkotlin/k2;", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "outRect", "onGetContentRect", "(Landroid/view/ActionMode;Landroid/view/View;Landroid/graphics/Rect;)V", "a", "Lo0/d;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(23)
/* loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f83734b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final d callback;

    public a(@l d dVar) {
        this.callback = dVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(@m ActionMode mode, @m MenuItem item) {
        return this.callback.i(mode, item);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@m ActionMode mode, @m Menu menu) {
        return this.callback.j(mode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(@m ActionMode mode) {
        this.callback.k();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(@m ActionMode mode, @m View view, @m Rect outRect) {
        i rect = this.callback.getRect();
        if (outRect != null) {
            outRect.set((int) rect.t(), (int) rect.getTop(), (int) rect.x(), (int) rect.j());
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(@m ActionMode mode, @m Menu menu) {
        return this.callback.l(mode, menu);
    }
}
