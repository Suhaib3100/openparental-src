package y8;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.d0;
import androidx.annotation.o0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ExpandableWidgetHelper.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final View f93291a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f93292b = false;

    /* renamed from: c, reason: collision with root package name */
    @d0
    private int f93293c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public c(b bVar) {
        this.f93291a = (View) bVar;
    }

    private void a() {
        ViewParent parent = this.f93291a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).p(this.f93291a);
        }
    }

    @d0
    public int b() {
        return this.f93293c;
    }

    public boolean c() {
        return this.f93292b;
    }

    public void d(@o0 Bundle bundle) {
        this.f93292b = bundle.getBoolean(ProtectedSandApp.s("㣛\u0001"), false);
        this.f93293c = bundle.getInt(ProtectedSandApp.s("㣜\u0001"), 0);
        if (this.f93292b) {
            a();
        }
    }

    @o0
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(ProtectedSandApp.s("㣛\u0001"), this.f93292b);
        bundle.putInt(ProtectedSandApp.s("㣜\u0001"), this.f93293c);
        return bundle;
    }

    public boolean f(boolean z4) {
        if (this.f93292b == z4) {
            return false;
        }
        this.f93292b = z4;
        a();
        return true;
    }

    public void g(@d0 int i4) {
        this.f93293c = i4;
    }
}
