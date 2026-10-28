package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.c1;

/* compiled from: SubMenuWrapperICS.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class u extends q implements SubMenu {

    /* renamed from: p, reason: collision with root package name */
    private final c1.c f1329p;

    u(Context context, c1.c cVar) {
        super(context, cVar);
        this.f1329p = cVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f1329p.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return e(this.f1329p.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i4) {
        this.f1329p.setHeaderIcon(i4);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i4) {
        this.f1329p.setHeaderTitle(i4);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f1329p.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i4) {
        this.f1329p.setIcon(i4);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1329p.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1329p.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1329p.setIcon(drawable);
        return this;
    }
}
