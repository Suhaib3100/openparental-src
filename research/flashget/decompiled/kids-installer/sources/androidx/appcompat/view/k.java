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
import androidx.annotation.x0;
import java.util.List;

/* compiled from: WindowCallbackWrapper.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class k implements Window.Callback {

    /* renamed from: o, reason: collision with root package name */
    final Window.Callback f602o;

    public k(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f602o = callback;
    }

    public final Window.Callback a() {
        return this.f602o;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f602o.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f602o.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f602o.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f602o.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f602o.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f602o.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f602o.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f602o.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f602o.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f602o.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i5, Menu menu) {
        return this.f602o.onCreatePanelMenu(i5, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i5) {
        return this.f602o.onCreatePanelView(i5);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f602o.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        return this.f602o.onMenuItemSelected(i5, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i5, Menu menu) {
        return this.f602o.onMenuOpened(i5, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i5, Menu menu) {
        this.f602o.onPanelClosed(i5, menu);
    }

    @Override // android.view.Window.Callback
    @x0(26)
    public void onPointerCaptureChanged(boolean z5) {
        this.f602o.onPointerCaptureChanged(z5);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i5, View view, Menu menu) {
        return this.f602o.onPreparePanel(i5, view, menu);
    }

    @Override // android.view.Window.Callback
    @x0(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i5) {
        this.f602o.onProvideKeyboardShortcuts(list, menu, i5);
    }

    @Override // android.view.Window.Callback
    @x0(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f602o.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f602o.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z5) {
        this.f602o.onWindowFocusChanged(z5);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f602o.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f602o.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    @x0(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i5) {
        return this.f602o.onWindowStartingActionMode(callback, i5);
    }
}
