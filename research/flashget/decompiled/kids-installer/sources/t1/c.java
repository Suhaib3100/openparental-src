package t1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.d0;
import androidx.annotation.o0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: ExpandableWidgetHelper.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final View f33443a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f33444b = false;

    /* renamed from: c, reason: collision with root package name */
    @d0
    private int f33445c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public c(b bVar) {
        this.f33443a = (View) bVar;
    }

    private void a() {
        ViewParent parent = this.f33443a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).q(this.f33443a);
        }
    }

    @d0
    public int b() {
        return this.f33445c;
    }

    public boolean c() {
        return this.f33444b;
    }

    public void d(@o0 Bundle bundle) {
        this.f33444b = bundle.getBoolean(ProtectedSandApp.s("᭲"), false);
        this.f33445c = bundle.getInt(ProtectedSandApp.s("᭳"), 0);
        if (this.f33444b) {
            a();
        }
    }

    @o0
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(ProtectedSandApp.s("᭴"), this.f33444b);
        bundle.putInt(ProtectedSandApp.s("᭵"), this.f33445c);
        return bundle;
    }

    public boolean f(boolean z5) {
        if (this.f33444b == z5) {
            return false;
        }
        this.f33444b = z5;
        a();
        return true;
    }

    public void g(@d0 int i5) {
        this.f33445c = i5;
    }
}
