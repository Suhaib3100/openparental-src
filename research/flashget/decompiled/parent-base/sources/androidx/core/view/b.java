package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.c1;

/* compiled from: ActionProvider.java */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    private static final String f27072d = "ActionProvider(support)";

    /* renamed from: a, reason: collision with root package name */
    private final Context f27073a;

    /* renamed from: b, reason: collision with root package name */
    private a f27074b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0438b f27075c;

    /* compiled from: ActionProvider.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        void b(boolean z4);
    }

    /* compiled from: ActionProvider.java */
    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0438b {
        void onActionProviderVisibilityChanged(boolean z4);
    }

    public b(@androidx.annotation.o0 Context context) {
        this.f27073a = context;
    }

    @androidx.annotation.o0
    public Context a() {
        return this.f27073a;
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
        if (this.f27075c == null || !h()) {
            return;
        }
        this.f27075c.onActionProviderVisibilityChanged(c());
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void j() {
        this.f27075c = null;
        this.f27074b = null;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void k(@androidx.annotation.q0 a aVar) {
        this.f27074b = aVar;
    }

    public void l(@androidx.annotation.q0 InterfaceC0438b interfaceC0438b) {
        this.f27075c = interfaceC0438b;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void m(boolean z4) {
        a aVar = this.f27074b;
        if (aVar != null) {
            aVar.b(z4);
        }
    }
}
