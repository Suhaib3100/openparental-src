package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.C0536c;
import android.view.C0539f;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.j1;
import android.view.l1;
import androidx.annotation.d0;
import androidx.annotation.h1;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.app.a;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f1;
import androidx.core.app.g5;
import androidx.core.app.z;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes4.dex */
public class AppCompatActivity extends FragmentActivity implements d, g5.b, a.c {
    private static final String O = "androidx:appcompat";
    private e M;
    private Resources N;

    /* loaded from: classes2.dex */
    class a implements C0536c.InterfaceC0117c {
        a() {
        }

        @Override // android.view.C0536c.InterfaceC0117c
        @o0
        public Bundle a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.s0().D(bundle);
            return bundle;
        }
    }

    /* loaded from: classes2.dex */
    class b implements a.c {
        b() {
        }

        @Override // a.c
        public void a(@o0 Context context) {
            e s02 = AppCompatActivity.this.s0();
            s02.u();
            s02.z(AppCompatActivity.this.getSavedStateRegistry().b("androidx:appcompat"));
        }
    }

    public AppCompatActivity() {
        u0();
    }

    private boolean A0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    private void P() {
        j1.b(getWindow().getDecorView(), this);
        l1.b(getWindow().getDecorView(), this);
        C0539f.b(getWindow().getDecorView(), this);
    }

    private void u0() {
        getSavedStateRegistry().j("androidx:appcompat", new a());
        f(new b());
    }

    public void B0(@q0 Toolbar toolbar) {
        s0().Q(toolbar);
    }

    @Deprecated
    public void C0(int i5) {
    }

    @Deprecated
    public void D0(boolean z5) {
    }

    @Deprecated
    public void E0(boolean z5) {
    }

    @Deprecated
    public void F0(boolean z5) {
    }

    @q0
    public androidx.appcompat.view.b G0(@o0 b.a aVar) {
        return s0().T(aVar);
    }

    public void H0(@o0 Intent intent) {
        z.g(this, intent);
    }

    public boolean I0(int i5) {
        return s0().I(i5);
    }

    public boolean J0(@o0 Intent intent) {
        return z.h(this, intent);
    }

    @Override // android.view.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        P();
        s0().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(s0().h(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar t02 = t0();
        if (getWindow().hasFeature(0)) {
            if (t02 == null || !t02.k()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar t02 = t0();
        if (keyCode == 82 && t02 != null && t02.K(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@d0 int i5) {
        return (T) s0().n(i5);
    }

    @Override // android.app.Activity
    @o0
    public MenuInflater getMenuInflater() {
        return s0().r();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.N == null && f1.c()) {
            this.N = new f1(this, super.getResources());
        }
        Resources resources = this.N;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.appcompat.app.d
    @androidx.annotation.i
    public void i(@o0 androidx.appcompat.view.b bVar) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        s0().v();
    }

    @Override // androidx.appcompat.app.a.c
    @q0
    public a.b j() {
        return s0().p();
    }

    @Override // androidx.appcompat.app.d
    @androidx.annotation.i
    public void l(@o0 androidx.appcompat.view.b bVar) {
    }

    @Override // android.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@o0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.N != null) {
            this.N.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        s0().y(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        y0();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        s0().A();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i5, KeyEvent keyEvent) {
        if (A0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i5, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i5, @o0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        ActionBar t02 = t0();
        if (menuItem.getItemId() != 16908332 || t02 == null || (t02.o() & 4) == 0) {
            return false;
        }
        return z0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i5, Menu menu) {
        return super.onMenuOpened(i5, menu);
    }

    @Override // android.view.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i5, @o0 Menu menu) {
        super.onPanelClosed(i5, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(@q0 Bundle bundle) {
        super.onPostCreate(bundle);
        s0().B(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        s0().C();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        s0().E();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        s0().F();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i5) {
        super.onTitleChanged(charSequence, i5);
        s0().S(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar t02 = t0();
        if (getWindow().hasFeature(0)) {
            if (t02 == null || !t02.L()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void p0() {
        s0().v();
    }

    @o0
    public e s0() {
        if (this.M == null) {
            this.M = e.i(this, this);
        }
        return this.M;
    }

    @Override // android.view.ComponentActivity, android.app.Activity
    public void setContentView(@j0 int i5) {
        P();
        s0().K(i5);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@h1 int i5) {
        super.setTheme(i5);
        s0().R(i5);
    }

    @Override // androidx.core.app.g5.b
    @q0
    public Intent t() {
        return z.a(this);
    }

    @q0
    public ActionBar t0() {
        return s0().s();
    }

    @Override // androidx.appcompat.app.d
    @q0
    public androidx.appcompat.view.b v(@o0 b.a aVar) {
        return null;
    }

    public void v0(@o0 g5 g5Var) {
        g5Var.g(this);
    }

    protected void w0(int i5) {
    }

    public void x0(@o0 g5 g5Var) {
    }

    @Deprecated
    public void y0() {
    }

    public boolean z0() {
        Intent t5 = t();
        if (t5 == null) {
            return false;
        }
        if (!J0(t5)) {
            H0(t5);
            return true;
        }
        g5 o5 = g5.o(this);
        v0(o5);
        x0(o5);
        o5.y(null);
        try {
            androidx.core.app.b.w(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @androidx.annotation.o
    public AppCompatActivity(@j0 int i5) {
        super(i5);
        u0();
    }

    @Override // android.view.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        P();
        s0().L(view);
    }

    @Override // android.view.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        P();
        s0().M(view, layoutParams);
    }
}
