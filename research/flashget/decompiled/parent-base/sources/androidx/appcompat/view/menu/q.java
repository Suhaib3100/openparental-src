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
/* loaded from: classes.dex */
public class q extends c implements Menu {

    /* renamed from: o, reason: collision with root package name */
    private final c1.a f1305o;

    public q(Context context, c1.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f1305o = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return e(this.f1305o.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f1305o.addIntentOptions(i4, i5, i6, componentName, intentArr, intent, i7, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                menuItemArr[i10] = e(menuItemArr2[i10]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return f(this.f1305o.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        g();
        this.f1305o.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f1305o.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i4) {
        return e(this.f1305o.findItem(i4));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i4) {
        return e(this.f1305o.getItem(i4));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f1305o.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return this.f1305o.isShortcutKey(i4, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i4, int i5) {
        return this.f1305o.performIdentifierAction(i4, i5);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        return this.f1305o.performShortcut(i4, keyEvent, i5);
    }

    @Override // android.view.Menu
    public void removeGroup(int i4) {
        h(i4);
        this.f1305o.removeGroup(i4);
    }

    @Override // android.view.Menu
    public void removeItem(int i4) {
        i(i4);
        this.f1305o.removeItem(i4);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i4, boolean z4, boolean z5) {
        this.f1305o.setGroupCheckable(i4, z4, z5);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i4, boolean z4) {
        this.f1305o.setGroupEnabled(i4, z4);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i4, boolean z4) {
        this.f1305o.setGroupVisible(i4, z4);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f1305o.setQwertyMode(z4);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1305o.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i4) {
        return e(this.f1305o.add(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4) {
        return f(this.f1305o.addSubMenu(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return e(this.f1305o.add(i4, i5, i6, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        return f(this.f1305o.addSubMenu(i4, i5, i6, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, int i7) {
        return e(this.f1305o.add(i4, i5, i6, i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return f(this.f1305o.addSubMenu(i4, i5, i6, i7));
    }
}
