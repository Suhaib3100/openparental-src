package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.c1;

/* compiled from: SubMenuWrapperICS.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
class u extends p implements SubMenu {

    /* renamed from: p, reason: collision with root package name */
    private final m.c f771p;

    u(Context context, m.c cVar) {
        super(context, cVar);
        this.f771p = cVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f771p.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return e(this.f771p.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i5) {
        this.f771p.setHeaderIcon(i5);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i5) {
        this.f771p.setHeaderTitle(i5);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f771p.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i5) {
        this.f771p.setIcon(i5);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f771p.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f771p.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f771p.setIcon(drawable);
        return this;
    }
}
