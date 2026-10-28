package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.c1;

/* compiled from: MenuWrapperICS.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class p extends c implements Menu {

    /* renamed from: o, reason: collision with root package name */
    private final m.a f757o;

    public p(Context context, m.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f757o = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return e(this.f757o.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i5, int i6, int i7, ComponentName componentName, Intent[] intentArr, Intent intent, int i8, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f757o.addIntentOptions(i5, i6, i7, componentName, intentArr, intent, i8, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i9 = 0; i9 < length; i9++) {
                menuItemArr[i9] = e(menuItemArr2[i9]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return f(this.f757o.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        g();
        this.f757o.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f757o.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i5) {
        return e(this.f757o.findItem(i5));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i5) {
        return e(this.f757o.getItem(i5));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f757o.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i5, KeyEvent keyEvent) {
        return this.f757o.isShortcutKey(i5, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i5, int i6) {
        return this.f757o.performIdentifierAction(i5, i6);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i5, KeyEvent keyEvent, int i6) {
        return this.f757o.performShortcut(i5, keyEvent, i6);
    }

    @Override // android.view.Menu
    public void removeGroup(int i5) {
        h(i5);
        this.f757o.removeGroup(i5);
    }

    @Override // android.view.Menu
    public void removeItem(int i5) {
        i(i5);
        this.f757o.removeItem(i5);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i5, boolean z5, boolean z6) {
        this.f757o.setGroupCheckable(i5, z5, z6);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i5, boolean z5) {
        this.f757o.setGroupEnabled(i5, z5);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i5, boolean z5) {
        this.f757o.setGroupVisible(i5, z5);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.f757o.setQwertyMode(z5);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f757o.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i5) {
        return e(this.f757o.add(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5) {
        return f(this.f757o.addSubMenu(i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i5, int i6, int i7, CharSequence charSequence) {
        return e(this.f757o.add(i5, i6, i7, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5, int i6, int i7, CharSequence charSequence) {
        return f(this.f757o.addSubMenu(i5, i6, i7, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i5, int i6, int i7, int i8) {
        return e(this.f757o.add(i5, i6, i7, i8));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5, int i6, int i7, int i8) {
        return f(this.f757o.addSubMenu(i5, i6, i7, i8));
    }
}
