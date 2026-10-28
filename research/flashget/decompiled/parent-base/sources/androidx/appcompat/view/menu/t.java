package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.appcompat.view.menu.h;

/* compiled from: SubMenuBuilder.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class t extends h implements SubMenu {
    private h Q;
    private k R;

    public t(Context context, h hVar, k kVar) {
        super(context);
        this.Q = hVar;
        this.R = kVar;
    }

    @Override // androidx.appcompat.view.menu.h
    public h G() {
        return this.Q.G();
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean I() {
        return this.Q.I();
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean J() {
        return this.Q.J();
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean K() {
        return this.Q.K();
    }

    @Override // androidx.appcompat.view.menu.h
    public void X(h.a aVar) {
        this.Q.X(aVar);
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean g(k kVar) {
        return this.Q.g(kVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.R;
    }

    @Override // androidx.appcompat.view.menu.h
    boolean i(@o0 h hVar, @o0 MenuItem menuItem) {
        return super.i(hVar, menuItem) || this.Q.i(hVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.h
    public void j0(boolean z4) {
        this.Q.j0(z4);
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean n(k kVar) {
        return this.Q.n(kVar);
    }

    public Menu n0() {
        return this.Q;
    }

    @Override // androidx.appcompat.view.menu.h, c1.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.Q.setGroupDividerEnabled(z4);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.c0(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.f0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.g0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.R.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.Q.setQwertyMode(z4);
    }

    @Override // androidx.appcompat.view.menu.h
    public String w() {
        k kVar = this.R;
        int itemId = kVar != null ? kVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return android.support.v4.media.a.a("android:menu:actionviewstates:", itemId);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i4) {
        return (SubMenu) super.b0(i4);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i4) {
        return (SubMenu) super.e0(i4);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i4) {
        this.R.setIcon(i4);
        return this;
    }
}
