package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.a3;

/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
abstract class c {

    /* renamed from: l, reason: collision with root package name */
    final Context f1186l;

    /* renamed from: m, reason: collision with root package name */
    private a3<c1.b, MenuItem> f1187m;

    /* renamed from: n, reason: collision with root package name */
    private a3<c1.c, SubMenu> f1188n;

    c(Context context) {
        this.f1186l = context;
    }

    final MenuItem e(MenuItem menuItem) {
        if (!(menuItem instanceof c1.b)) {
            return menuItem;
        }
        c1.b bVar = (c1.b) menuItem;
        if (this.f1187m == null) {
            this.f1187m = new a3<>();
        }
        MenuItem menuItem2 = this.f1187m.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        l lVar = new l(this.f1186l, bVar);
        this.f1187m.put(bVar, lVar);
        return lVar;
    }

    final SubMenu f(SubMenu subMenu) {
        if (!(subMenu instanceof c1.c)) {
            return subMenu;
        }
        c1.c cVar = (c1.c) subMenu;
        if (this.f1188n == null) {
            this.f1188n = new a3<>();
        }
        SubMenu subMenu2 = this.f1188n.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        u uVar = new u(this.f1186l, cVar);
        this.f1188n.put(cVar, uVar);
        return uVar;
    }

    final void g() {
        a3<c1.b, MenuItem> a3Var = this.f1187m;
        if (a3Var != null) {
            a3Var.clear();
        }
        a3<c1.c, SubMenu> a3Var2 = this.f1188n;
        if (a3Var2 != null) {
            a3Var2.clear();
        }
    }

    final void h(int i4) {
        if (this.f1187m == null) {
            return;
        }
        int i5 = 0;
        while (i5 < this.f1187m.getSize()) {
            if (this.f1187m.keyAt(i5).getGroupId() == i4) {
                this.f1187m.removeAt(i5);
                i5--;
            }
            i5++;
        }
    }

    final void i(int i4) {
        if (this.f1187m == null) {
            return;
        }
        for (int i5 = 0; i5 < this.f1187m.getSize(); i5++) {
            if (this.f1187m.keyAt(i5).getItemId() == i4) {
                this.f1187m.removeAt(i5);
                return;
            }
        }
    }
}
