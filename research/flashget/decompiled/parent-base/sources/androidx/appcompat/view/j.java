package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.c1;
import androidx.annotation.u;
import androidx.annotation.x0;
import java.util.List;

/* compiled from: WindowCallbackWrapper.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class j implements Window.Callback {

    /* renamed from: b, reason: collision with root package name */
    final Window.Callback f1125b;

    /* compiled from: WindowCallbackWrapper.java */
    @x0(23)
    static class a {
        private a() {
        }

        @u
        static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        @u
        static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i4) {
            return callback.onWindowStartingActionMode(callback2, i4);
        }
    }

    /* compiled from: WindowCallbackWrapper.java */
    @x0(24)
    static class b {
        private b() {
        }

        @u
        static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i4) {
            callback.onProvideKeyboardShortcuts(list, menu, i4);
        }
    }

    /* compiled from: WindowCallbackWrapper.java */
    @x0(26)
    static class c {
        private c() {
        }

        @u
        static void a(Window.Callback callback, boolean z4) {
            callback.onPointerCaptureChanged(z4);
        }
    }

    public j(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f1125b = callback;
    }

    public final Window.Callback a() {
        return this.f1125b;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1125b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1125b.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f1125b.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1125b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1125b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1125b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f1125b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f1125b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f1125b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f1125b.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i4, Menu menu) {
        return this.f1125b.onCreatePanelMenu(i4, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i4) {
        return this.f1125b.onCreatePanelView(i4);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f1125b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        return this.f1125b.onMenuItemSelected(i4, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i4, Menu menu) {
        return this.f1125b.onMenuOpened(i4, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        this.f1125b.onPanelClosed(i4, menu);
    }

    @Override // android.view.Window.Callback
    @x0(26)
    public void onPointerCaptureChanged(boolean z4) {
        c.a(this.f1125b, z4);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i4, View view, Menu menu) {
        return this.f1125b.onPreparePanel(i4, view, menu);
    }

    @Override // android.view.Window.Callback
    @x0(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i4) {
        b.a(this.f1125b, list, menu, i4);
    }

    @Override // android.view.Window.Callback
    @x0(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f1125b, searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1125b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z4) {
        this.f1125b.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f1125b.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f1125b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    @x0(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
        return a.b(this.f1125b, callback, i4);
    }
}
