package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.c1;

/* compiled from: ActionProvider.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    private static final String f5423d = "ActionProvider(support)";

    /* renamed from: a, reason: collision with root package name */
    private final Context f5424a;

    /* renamed from: b, reason: collision with root package name */
    private a f5425b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0056b f5426c;

    /* compiled from: ActionProvider.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        void a(boolean z5);
    }

    /* compiled from: ActionProvider.java */
    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0056b {
        void onActionProviderVisibilityChanged(boolean z5);
    }

    public b(@androidx.annotation.o0 Context context) {
        this.f5424a = context;
    }

    @androidx.annotation.o0
    public Context a() {
        return this.f5424a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    @androidx.annotation.o0
    public abstract View d();

    @androidx.annotation.o0
    public View e(@androidx.annotation.o0 MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public void g(@androidx.annotation.o0 SubMenu subMenu) {
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if (this.f5426c == null || !h()) {
            return;
        }
        this.f5426c.onActionProviderVisibilityChanged(c());
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void j() {
        this.f5426c = null;
        this.f5425b = null;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void k(@androidx.annotation.q0 a aVar) {
        this.f5425b = aVar;
    }

    public void l(@androidx.annotation.q0 InterfaceC0056b interfaceC0056b) {
        InterfaceC0056b interfaceC0056b2 = this.f5426c;
        this.f5426c = interfaceC0056b;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void m(boolean z5) {
        a aVar = this.f5425b;
        if (aVar != null) {
            aVar.a(z5);
        }
    }
}
