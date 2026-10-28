package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.c1;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.p;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f547a;

    /* renamed from: b, reason: collision with root package name */
    final b f548b;

    /* compiled from: SupportActionModeWrapper.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes2.dex */
    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f549a;

        /* renamed from: b, reason: collision with root package name */
        final Context f550b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f> f551c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        final androidx.collection.i<Menu, Menu> f552d = new androidx.collection.i<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f550b = context;
            this.f549a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f552d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            p pVar = new p(this.f550b, (m.a) menu);
            this.f552d.put(menu, pVar);
            return pVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f549a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f549a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f549a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f549a.onActionItemClicked(e(bVar), new androidx.appcompat.view.menu.k(this.f550b, (m.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f551c.size();
            for (int i5 = 0; i5 < size; i5++) {
                f fVar = this.f551c.get(i5);
                if (fVar != null && fVar.f548b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f550b, bVar);
            this.f551c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f547a = context;
        this.f548b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f548b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f548b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new p(this.f547a, (m.a) this.f548b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f548b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f548b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f548b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f548b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f548b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f548b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f548b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f548b.n(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f548b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f548b.q(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f548b.s(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z5) {
        this.f548b.t(z5);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i5) {
        this.f548b.o(i5);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i5) {
        this.f548b.r(i5);
    }
}
