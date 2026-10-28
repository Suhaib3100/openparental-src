package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
abstract class c {

    /* renamed from: l, reason: collision with root package name */
    final Context f651l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.collection.i<m.b, MenuItem> f652m;

    /* renamed from: n, reason: collision with root package name */
    private androidx.collection.i<m.c, SubMenu> f653n;

    c(Context context) {
        this.f651l = context;
    }

    final MenuItem e(MenuItem menuItem) {
        if (!(menuItem instanceof m.b)) {
            return menuItem;
        }
        m.b bVar = (m.b) menuItem;
        if (this.f652m == null) {
            this.f652m = new androidx.collection.i<>();
        }
        MenuItem menuItem2 = this.f652m.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        k kVar = new k(this.f651l, bVar);
        this.f652m.put(bVar, kVar);
        return kVar;
    }

    final SubMenu f(SubMenu subMenu) {
        if (!(subMenu instanceof m.c)) {
            return subMenu;
        }
        m.c cVar = (m.c) subMenu;
        if (this.f653n == null) {
            this.f653n = new androidx.collection.i<>();
        }
        SubMenu subMenu2 = this.f653n.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        u uVar = new u(this.f651l, cVar);
        this.f653n.put(cVar, uVar);
        return uVar;
    }

    final void g() {
        androidx.collection.i<m.b, MenuItem> iVar = this.f652m;
        if (iVar != null) {
            iVar.clear();
        }
        androidx.collection.i<m.c, SubMenu> iVar2 = this.f653n;
        if (iVar2 != null) {
            iVar2.clear();
        }
    }

    final void h(int i5) {
        if (this.f652m == null) {
            return;
        }
        int i6 = 0;
        while (i6 < this.f652m.size()) {
            if (this.f652m.l(i6).getGroupId() == i5) {
                this.f652m.n(i6);
                i6--;
            }
            i6++;
        }
    }

    final void i(int i5) {
        if (this.f652m == null) {
            return;
        }
        for (int i6 = 0; i6 < this.f652m.size(); i6++) {
            if (this.f652m.l(i6).getItemId() == i5) {
                this.f652m.n(i6);
                return;
            }
        }
    }
}
