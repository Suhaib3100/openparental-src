package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.C0536c;
import android.view.ComponentActivity;
import android.view.InterfaceC0538e;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.OnBackPressedDispatcher;
import android.view.View;
import android.view.Window;
import android.view.h1;
import android.view.i1;
import android.view.result.ActivityResultRegistry;
import android.view.t;
import androidx.annotation.q0;
import androidx.core.app.b;
import androidx.core.app.f5;
import androidx.core.app.m4;
import androidx.core.app.v3;
import androidx.core.app.x3;
import androidx.core.view.e1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public class FragmentActivity extends ComponentActivity implements b.i, b.k {
    static final String L = "android:support:lifecycle";
    final k G;
    final android.view.c0 H;
    boolean I;
    boolean J;
    boolean K;

    class a extends m<FragmentActivity> implements androidx.core.content.m, androidx.core.content.n, v3, x3, i1, android.view.h, android.view.result.d, InterfaceC0538e, x, androidx.core.view.l0 {
        public a() {
            super(FragmentActivity.this);
        }

        @Override // androidx.core.content.n
        public void A(@androidx.annotation.o0 androidx.core.util.c<Integer> cVar) {
            FragmentActivity.this.A(cVar);
        }

        @Override // androidx.core.view.l0
        public void C(@androidx.annotation.o0 e1 e1Var, @androidx.annotation.o0 android.view.a0 a0Var, @androidx.annotation.o0 t.c cVar) {
            FragmentActivity.this.C(e1Var, a0Var, cVar);
        }

        @Override // androidx.core.view.l0
        public void D(@androidx.annotation.o0 e1 e1Var) {
            FragmentActivity.this.D(e1Var);
        }

        @Override // androidx.core.view.l0
        public void E() {
            FragmentActivity.this.invalidateOptionsMenu();
        }

        @Override // androidx.core.app.v3
        public void F(@androidx.annotation.o0 androidx.core.util.c<androidx.core.app.y> cVar) {
            FragmentActivity.this.F(cVar);
        }

        @Override // androidx.fragment.app.m
        public void H() {
            E();
        }

        @Override // androidx.fragment.app.m
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public FragmentActivity o() {
            return FragmentActivity.this;
        }

        @Override // androidx.core.view.l0
        public void a(@androidx.annotation.o0 e1 e1Var, @androidx.annotation.o0 android.view.a0 a0Var) {
            FragmentActivity.this.a(e1Var, a0Var);
        }

        @Override // androidx.fragment.app.x
        public void b(@androidx.annotation.o0 FragmentManager fragmentManager, @androidx.annotation.o0 Fragment fragment) {
            FragmentActivity.this.h0(fragment);
        }

        @Override // androidx.fragment.app.m, androidx.fragment.app.j
        @q0
        public View d(int i5) {
            return FragmentActivity.this.findViewById(i5);
        }

        @Override // androidx.core.view.l0
        public void e(@androidx.annotation.o0 e1 e1Var) {
            FragmentActivity.this.e(e1Var);
        }

        @Override // androidx.fragment.app.m, androidx.fragment.app.j
        public boolean f() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // android.view.h
        @androidx.annotation.o0
        public OnBackPressedDispatcher g() {
            return FragmentActivity.this.g();
        }

        @Override // android.view.a0
        @androidx.annotation.o0
        public android.view.t getLifecycle() {
            return FragmentActivity.this.H;
        }

        @Override // android.view.InterfaceC0538e
        @androidx.annotation.o0
        public C0536c getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // android.view.i1
        @androidx.annotation.o0
        public h1 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.core.content.m
        public void h(@androidx.annotation.o0 androidx.core.util.c<Configuration> cVar) {
            FragmentActivity.this.h(cVar);
        }

        @Override // androidx.fragment.app.m
        public void l(@androidx.annotation.o0 String str, @q0 FileDescriptor fileDescriptor, @androidx.annotation.o0 PrintWriter printWriter, @q0 String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.core.app.x3
        public void m(@androidx.annotation.o0 androidx.core.util.c<m4> cVar) {
            FragmentActivity.this.m(cVar);
        }

        @Override // androidx.core.content.n
        public void n(@androidx.annotation.o0 androidx.core.util.c<Integer> cVar) {
            FragmentActivity.this.n(cVar);
        }

        @Override // androidx.fragment.app.m
        @androidx.annotation.o0
        public LayoutInflater p() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.core.app.x3
        public void q(@androidx.annotation.o0 androidx.core.util.c<m4> cVar) {
            FragmentActivity.this.q(cVar);
        }

        @Override // android.view.result.d
        @androidx.annotation.o0
        public ActivityResultRegistry r() {
            return FragmentActivity.this.r();
        }

        @Override // androidx.core.app.v3
        public void s(@androidx.annotation.o0 androidx.core.util.c<androidx.core.app.y> cVar) {
            FragmentActivity.this.s(cVar);
        }

        @Override // androidx.fragment.app.m
        public int t() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.m
        public boolean u() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // androidx.core.content.m
        public void w(@androidx.annotation.o0 androidx.core.util.c<Configuration> cVar) {
            FragmentActivity.this.w(cVar);
        }

        @Override // androidx.fragment.app.m
        public boolean x(@androidx.annotation.o0 Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.m
        public boolean y(@androidx.annotation.o0 String str) {
            return androidx.core.app.b.M(FragmentActivity.this, str);
        }
    }

    public FragmentActivity() {
        this.G = k.b(new a());
        this.H = new android.view.c0(this);
        this.K = true;
        a0();
    }

    private void a0() {
        getSavedStateRegistry().j("android:support:lifecycle", new C0536c.InterfaceC0117c() { // from class: androidx.fragment.app.e
            @Override // android.view.C0536c.InterfaceC0117c
            public final Bundle a() {
                Bundle b02;
                b02 = FragmentActivity.this.b0();
                return b02;
            }
        });
        h(new androidx.core.util.c() { // from class: androidx.fragment.app.f
            @Override // androidx.core.util.c
            public final void accept(Object obj) {
                FragmentActivity.this.c0((Configuration) obj);
            }
        });
        B(new androidx.core.util.c() { // from class: androidx.fragment.app.g
            @Override // androidx.core.util.c
            public final void accept(Object obj) {
                FragmentActivity.this.d0((Intent) obj);
            }
        });
        f(new a.c() { // from class: androidx.fragment.app.h
            @Override // a.c
            public final void a(Context context) {
                FragmentActivity.this.e0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle b0() {
        f0();
        this.H.j(t.b.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(Configuration configuration) {
        this.G.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(Intent intent) {
        this.G.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(Context context) {
        this.G.a(null);
    }

    private static boolean g0(FragmentManager fragmentManager, t.c cVar) {
        boolean z5 = false;
        for (Fragment fragment : fragmentManager.I0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z5 |= g0(fragment.getChildFragmentManager(), cVar);
                }
                j0 j0Var = fragment.mViewLifecycleOwner;
                if (j0Var != null && j0Var.getLifecycle().b().isAtLeast(t.c.STARTED)) {
                    fragment.mViewLifecycleOwner.f(cVar);
                    z5 = true;
                }
                if (fragment.mLifecycleRegistry.b().isAtLeast(t.c.STARTED)) {
                    fragment.mLifecycleRegistry.q(cVar);
                    z5 = true;
                }
            }
        }
        return z5;
    }

    @q0
    final View X(@q0 View view, @androidx.annotation.o0 String str, @androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        return this.G.G(view, str, context, attributeSet);
    }

    @androidx.annotation.o0
    public FragmentManager Y() {
        return this.G.D();
    }

    @androidx.annotation.o0
    @Deprecated
    public androidx.loader.app.a Z() {
        return androidx.loader.app.a.d(this);
    }

    @Override // androidx.core.app.b.k
    @Deprecated
    public final void b(int i5) {
    }

    @Override // android.app.Activity
    public void dump(@androidx.annotation.o0 String str, @q0 FileDescriptor fileDescriptor, @androidx.annotation.o0 PrintWriter printWriter, @q0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (I(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.I);
            printWriter.print(" mResumed=");
            printWriter.print(this.J);
            printWriter.print(" mStopped=");
            printWriter.print(this.K);
            if (getApplication() != null) {
                androidx.loader.app.a.d(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.G.D().e0(str, fileDescriptor, printWriter, strArr);
        }
    }

    void f0() {
        while (g0(Y(), t.c.CREATED)) {
        }
    }

    @androidx.annotation.l0
    @Deprecated
    public void h0(@androidx.annotation.o0 Fragment fragment) {
    }

    protected void i0() {
        this.H.j(t.b.ON_RESUME);
        this.G.r();
    }

    public void j0(@q0 f5 f5Var) {
        androidx.core.app.b.I(this, f5Var);
    }

    public void k0(@q0 f5 f5Var) {
        androidx.core.app.b.J(this, f5Var);
    }

    public void l0(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i5) {
        m0(fragment, intent, i5, null);
    }

    public void m0(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i5, @q0 Bundle bundle) {
        if (i5 == -1) {
            androidx.core.app.b.N(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i5, bundle);
        }
    }

    @Deprecated
    public void n0(@androidx.annotation.o0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i5, @q0 Intent intent, int i6, int i7, int i8, @q0 Bundle bundle) throws IntentSender.SendIntentException {
        if (i5 == -1) {
            androidx.core.app.b.O(this, intentSender, i5, intent, i6, i7, i8, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8, bundle);
        }
    }

    public void o0() {
        androidx.core.app.b.x(this);
    }

    @Override // android.view.ComponentActivity, android.app.Activity
    @androidx.annotation.i
    protected void onActivityResult(int i5, int i6, @q0 Intent intent) {
        this.G.F();
        super.onActivityResult(i5, i6, intent);
    }

    @Override // android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        this.H.j(t.b.ON_CREATE);
        this.G.f();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @q0
    public View onCreateView(@q0 View view, @androidx.annotation.o0 String str, @androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        View X = X(view, str, context, attributeSet);
        return X == null ? super.onCreateView(view, str, context, attributeSet) : X;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.G.h();
        this.H.j(t.b.ON_DESTROY);
    }

    @Override // android.view.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, @androidx.annotation.o0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        if (i5 == 6) {
            return this.G.e(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.J = false;
        this.G.n();
        this.H.j(t.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        i0();
    }

    @Override // android.view.ComponentActivity, android.app.Activity
    @androidx.annotation.i
    public void onRequestPermissionsResult(int i5, @androidx.annotation.o0 String[] strArr, @androidx.annotation.o0 int[] iArr) {
        this.G.F();
        super.onRequestPermissionsResult(i5, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.G.F();
        super.onResume();
        this.J = true;
        this.G.z();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.G.F();
        super.onStart();
        this.K = false;
        if (!this.I) {
            this.I = true;
            this.G.c();
        }
        this.G.z();
        this.H.j(t.b.ON_START);
        this.G.s();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.G.F();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.K = true;
        f0();
        this.G.t();
        this.H.j(t.b.ON_STOP);
    }

    @Deprecated
    public void p0() {
        invalidateOptionsMenu();
    }

    public void q0() {
        androidx.core.app.b.D(this);
    }

    public void r0() {
        androidx.core.app.b.P(this);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @q0
    public View onCreateView(@androidx.annotation.o0 String str, @androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        View X = X(null, str, context, attributeSet);
        return X == null ? super.onCreateView(str, context, attributeSet) : X;
    }

    @androidx.annotation.o
    public FragmentActivity(@androidx.annotation.j0 int i5) {
        super(i5);
        this.G = k.b(new a());
        this.H = new android.view.c0(this);
        this.K = true;
        a0();
    }
}
