package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.h1;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.app.a;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d1;
import androidx.core.app.x0;
import androidx.fragment.app.FragmentActivity;
import androidx.view.C1412m0;
import androidx.view.C1442q1;
import androidx.view.C1446s1;
import androidx.view.C1459c;
import androidx.view.C1463g;

/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements d, x0.a, a.c {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private g mDelegate;
    private Resources mResources;

    class a implements C1459c.InterfaceC0615c {
        a() {
        }

        @Override // androidx.view.C1459c.InterfaceC0615c
        @o0
        public Bundle a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.getDelegate().Q(bundle);
            return bundle;
        }
    }

    class b implements androidx.view.contextaware.d {
        b() {
        }

        @Override // androidx.view.contextaware.d
        public void a(@o0 Context context) {
            g delegate = AppCompatActivity.this.getDelegate();
            delegate.E();
            delegate.M(AppCompatActivity.this.getSavedStateRegistry().b("androidx:appcompat"));
        }
    }

    public AppCompatActivity() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().j("androidx:appcompat", new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        C1442q1.b(getWindow().getDecorView(), this);
        C1446s1.b(getWindow().getDecorView(), this);
        C1463g.b(getWindow().getDecorView(), this);
        C1412m0.b(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().f(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().m(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.l()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.L(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(@androidx.annotation.d0 int i4) {
        return (T) getDelegate().s(i4);
    }

    @o0
    public g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = g.n(this, this);
        }
        return this.mDelegate;
    }

    @Override // androidx.appcompat.app.a.c
    @q0
    public a.b getDrawerToggleDelegate() {
        return getDelegate().w();
    }

    @Override // android.app.Activity
    @o0
    public MenuInflater getMenuInflater() {
        return getDelegate().z();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && d1.d()) {
            this.mResources = new d1(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    @q0
    public ActionBar getSupportActionBar() {
        return getDelegate().C();
    }

    @Override // androidx.core.app.x0.a
    @q0
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.x.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().F();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@o0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().L(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(@o0 x0 x0Var) {
        x0Var.f(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().N();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    protected void onLocalesChanged(@o0 androidx.core.os.p pVar) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, @o0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.p() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i4, Menu menu) {
        return super.onMenuOpened(i4, menu);
    }

    protected void onNightModeChanged(int i4) {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i4, @o0 Menu menu) {
        super.onPanelClosed(i4, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(@q0 Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().O(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().P();
    }

    public void onPrepareSupportNavigateUpTaskStack(@o0 x0 x0Var) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().R();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().S();
    }

    @Override // androidx.appcompat.app.d
    @androidx.annotation.i
    public void onSupportActionModeFinished(@o0 androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    @androidx.annotation.i
    public void onSupportActionModeStarted(@o0 androidx.appcompat.view.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        x0 j4 = x0.j(this);
        onCreateSupportNavigateUpTaskStack(j4);
        onPrepareSupportNavigateUpTaskStack(j4);
        j4.x(null);
        try {
            androidx.core.app.b.b(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i4) {
        super.onTitleChanged(charSequence, i4);
        getDelegate().j0(charSequence);
    }

    @Override // androidx.appcompat.app.d
    @q0
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(@o0 b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.M()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(@j0 int i4) {
        initViewTreeOwners();
        getDelegate().Z(i4);
    }

    public void setSupportActionBar(@q0 Toolbar toolbar) {
        getDelegate().h0(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i4) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z4) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z4) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z4) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(@h1 int i4) {
        super.setTheme(i4);
        getDelegate().i0(i4);
    }

    @q0
    public androidx.appcompat.view.b startSupportActionMode(@o0 b.a aVar) {
        return getDelegate().k0(aVar);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().F();
    }

    public void supportNavigateUpTo(@o0 Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i4) {
        return getDelegate().V(i4);
    }

    public boolean supportShouldUpRecreateTask(@o0 Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @androidx.annotation.o
    public AppCompatActivity(@j0 int i4) {
        super(i4);
        initDelegate();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().a0(view);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().b0(view, layoutParams);
    }
}
