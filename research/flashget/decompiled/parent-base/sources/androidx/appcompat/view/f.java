package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.c1;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.q;
import androidx.collection.a3;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f1070a;

    /* renamed from: b, reason: collision with root package name */
    final b f1071b;

    /* compiled from: SupportActionModeWrapper.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f1072a;

        /* renamed from: b, reason: collision with root package name */
        final Context f1073b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f> f1074c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        final a3<Menu, Menu> f1075d = new a3<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f1073b = context;
            this.f1072a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f1075d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            q qVar = new q(this.f1073b, (c1.a) menu);
            this.f1075d.put(menu, qVar);
            return qVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f1072a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f1072a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f1072a.onActionItemClicked(e(bVar), new l(this.f1073b, (c1.b) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f1072a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f1074c.size();
            for (int i4 = 0; i4 < size; i4++) {
                f fVar = this.f1074c.get(i4);
                if (fVar != null && fVar.f1071b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f1073b, bVar);
            this.f1074c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f1070a = context;
        this.f1071b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f1071b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f1071b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new q(this.f1070a, (c1.a) this.f1071b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f1071b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f1071b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f1071b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f1071b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f1071b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f1071b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f1071b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f1071b.n(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f1071b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f1071b.q(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f1071b.s(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z4) {
        this.f1071b.t(z4);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i4) {
        this.f1071b.o(i4);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i4) {
        this.f1071b.r(i4);
    }
}
