package android.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.C0536c;
import android.view.C0537d;
import android.view.C0539f;
import android.view.InterfaceC0538e;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.a0;
import android.view.c0;
import android.view.f1;
import android.view.h1;
import android.view.i1;
import android.view.j1;
import android.view.l1;
import android.view.result.ActivityResultRegistry;
import android.view.result.IntentSenderRequest;
import android.view.s;
import android.view.t;
import android.view.t0;
import android.view.w;
import android.view.w0;
import androidx.annotation.j0;
import androidx.annotation.o;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.app.i;
import androidx.core.app.m4;
import androidx.core.app.v3;
import androidx.core.app.w3;
import androidx.core.app.x3;
import androidx.core.app.y;
import androidx.core.content.m;
import androidx.core.content.n;
import androidx.core.view.e1;
import androidx.core.view.l0;
import androidx.core.view.o0;
import b.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC0540a;
import kotlin.C0542e;

/* loaded from: classes3.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements a.a, a0, i1, s, InterfaceC0538e, h, android.view.result.d, android.view.result.b, m, n, w3, v3, x3, l0 {
    private static final String F = "android:support:activity-result";
    private final CopyOnWriteArrayList<androidx.core.util.c<Configuration>> A;
    private final CopyOnWriteArrayList<androidx.core.util.c<Integer>> B;
    private final CopyOnWriteArrayList<androidx.core.util.c<Intent>> C;
    private final CopyOnWriteArrayList<androidx.core.util.c<y>> D;
    private final CopyOnWriteArrayList<androidx.core.util.c<m4>> E;

    /* renamed from: q, reason: collision with root package name */
    final a.b f50q;

    /* renamed from: r, reason: collision with root package name */
    private final o0 f51r;

    /* renamed from: s, reason: collision with root package name */
    private final c0 f52s;

    /* renamed from: t, reason: collision with root package name */
    final C0537d f53t;

    /* renamed from: u, reason: collision with root package name */
    private h1 f54u;

    /* renamed from: v, reason: collision with root package name */
    private f1.b f55v;

    /* renamed from: w, reason: collision with root package name */
    private final OnBackPressedDispatcher f56w;

    /* renamed from: x, reason: collision with root package name */
    @j0
    private int f57x;

    /* renamed from: y, reason: collision with root package name */
    private final AtomicInteger f58y;

    /* renamed from: z, reason: collision with root package name */
    private final ActivityResultRegistry f59z;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e6) {
                if (!TextUtils.equals(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e6;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    class b extends ActivityResultRegistry {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ int f65o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ a.C0126a f66p;

            a(int i5, a.C0126a c0126a) {
                this.f65o = i5;
                this.f66p = c0126a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f65o, this.f66p.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0002b implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ int f68o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f69p;

            RunnableC0002b(int i5, IntentSender.SendIntentException sendIntentException) {
                this.f68o = i5;
                this.f69p = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f68o, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f69p));
            }
        }

        b() {
        }

        @Override // android.view.result.ActivityResultRegistry
        public <I, O> void f(int i5, @androidx.annotation.o0 b.a<I, O> aVar, I i6, @q0 i iVar) {
            Bundle l5;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0126a<O> b6 = aVar.b(componentActivity, i6);
            if (b6 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i5, b6));
                return;
            }
            Intent a6 = aVar.a(componentActivity, i6);
            if (a6.getExtras() != null && a6.getExtras().getClassLoader() == null) {
                a6.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a6.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                l5 = bundleExtra;
            } else {
                l5 = iVar != null ? iVar.l() : null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a6.getAction())) {
                String[] stringArrayExtra = a6.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.G(componentActivity, stringArrayExtra, i5);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a6.getAction())) {
                androidx.core.app.b.N(componentActivity, a6, i5, l5);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a6.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                androidx.core.app.b.O(componentActivity, intentSenderRequest.d(), i5, intentSenderRequest.a(), intentSenderRequest.b(), intentSenderRequest.c(), 0, l5);
            } catch (IntentSender.SendIntentException e6) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0002b(i5, e6));
            }
        }
    }

    @x0(19)
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        Object f71a;

        /* renamed from: b, reason: collision with root package name */
        h1 f72b;

        d() {
        }
    }

    public ComponentActivity() {
        this.f50q = new a.b();
        this.f51r = new o0(new Runnable() { // from class: androidx.activity.b
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.E();
            }
        });
        this.f52s = new c0(this);
        C0537d a6 = C0537d.a(this);
        this.f53t = a6;
        this.f56w = new OnBackPressedDispatcher(new a());
        this.f58y = new AtomicInteger();
        this.f59z = new b();
        this.A = new CopyOnWriteArrayList<>();
        this.B = new CopyOnWriteArrayList<>();
        this.C = new CopyOnWriteArrayList<>();
        this.D = new CopyOnWriteArrayList<>();
        this.E = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new w() { // from class: androidx.activity.ComponentActivity.3
            @Override // android.view.w
            public void h(@androidx.annotation.o0 a0 a0Var, @androidx.annotation.o0 t.b bVar) {
                if (bVar == t.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().a(new w() { // from class: androidx.activity.ComponentActivity.4
            @Override // android.view.w
            public void h(@androidx.annotation.o0 a0 a0Var, @androidx.annotation.o0 t.b bVar) {
                if (bVar == t.b.ON_DESTROY) {
                    ComponentActivity.this.f50q.b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().a();
                }
            }
        });
        getLifecycle().a(new w() { // from class: androidx.activity.ComponentActivity.5
            @Override // android.view.w
            public void h(@androidx.annotation.o0 a0 a0Var, @androidx.annotation.o0 t.b bVar) {
                ComponentActivity.this.N();
                ComponentActivity.this.getLifecycle().c(this);
            }
        });
        a6.c();
        t0.c(this);
        getSavedStateRegistry().j("android:support:activity-result", new C0536c.InterfaceC0117c() { // from class: androidx.activity.c
            @Override // android.view.C0536c.InterfaceC0117c
            public final Bundle a() {
                Bundle Q;
                Q = ComponentActivity.this.Q();
                return Q;
            }
        });
        f(new a.c() { // from class: androidx.activity.d
            @Override // a.c
            public final void a(Context context) {
                ComponentActivity.this.R(context);
            }
        });
    }

    private void P() {
        j1.b(getWindow().getDecorView(), this);
        l1.b(getWindow().getDecorView(), this);
        C0539f.b(getWindow().getDecorView(), this);
        View.b(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle Q() {
        Bundle bundle = new Bundle();
        this.f59z.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(Context context) {
        Bundle b6 = getSavedStateRegistry().b("android:support:activity-result");
        if (b6 != null) {
            this.f59z.g(b6);
        }
    }

    @Override // androidx.core.content.n
    public final void A(@androidx.annotation.o0 androidx.core.util.c<Integer> cVar) {
        this.B.add(cVar);
    }

    @Override // androidx.core.app.w3
    public final void B(@androidx.annotation.o0 androidx.core.util.c<Intent> cVar) {
        this.C.add(cVar);
    }

    @Override // androidx.core.view.l0
    @SuppressLint({"LambdaLast"})
    public void C(@androidx.annotation.o0 e1 e1Var, @androidx.annotation.o0 a0 a0Var, @androidx.annotation.o0 t.c cVar) {
        this.f51r.e(e1Var, a0Var, cVar);
    }

    @Override // androidx.core.view.l0
    public void D(@androidx.annotation.o0 e1 e1Var) {
        this.f51r.c(e1Var);
    }

    @Override // androidx.core.view.l0
    public void E() {
        invalidateOptionsMenu();
    }

    @Override // androidx.core.app.v3
    public final void F(@androidx.annotation.o0 androidx.core.util.c<y> cVar) {
        this.D.remove(cVar);
    }

    void N() {
        if (this.f54u == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.f54u = dVar.f72b;
            }
            if (this.f54u == null) {
                this.f54u = new h1();
            }
        }
    }

    @q0
    @Deprecated
    public Object O() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.f71a;
        }
        return null;
    }

    @q0
    @Deprecated
    public Object S() {
        return null;
    }

    @Override // androidx.core.view.l0
    public void a(@androidx.annotation.o0 e1 e1Var, @androidx.annotation.o0 a0 a0Var) {
        this.f51r.d(e1Var, a0Var);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        P();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.l0
    public void e(@androidx.annotation.o0 e1 e1Var) {
        this.f51r.l(e1Var);
    }

    @Override // a.a
    public final void f(@androidx.annotation.o0 a.c cVar) {
        this.f50q.a(cVar);
    }

    @Override // android.view.h
    @androidx.annotation.o0
    /* renamed from: g */
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f56w;
    }

    @Override // android.view.s
    @androidx.annotation.i
    @androidx.annotation.o0
    public AbstractC0540a getDefaultViewModelCreationExtras() {
        C0542e c0542e = new C0542e();
        if (getApplication() != null) {
            c0542e.c(f1.a.f8548i, getApplication());
        }
        c0542e.c(t0.f8663c, this);
        c0542e.c(t0.f8664d, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c0542e.c(t0.f8665e, getIntent().getExtras());
        }
        return c0542e;
    }

    @Override // android.view.s
    @androidx.annotation.o0
    public f1.b getDefaultViewModelProviderFactory() {
        if (this.f55v == null) {
            this.f55v = new w0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f55v;
    }

    @Override // androidx.core.app.ComponentActivity, android.view.a0
    @androidx.annotation.o0
    public t getLifecycle() {
        return this.f52s;
    }

    @Override // android.view.InterfaceC0538e
    @androidx.annotation.o0
    public final C0536c getSavedStateRegistry() {
        return this.f53t.getSavedStateRegistry();
    }

    @Override // android.view.i1
    @androidx.annotation.o0
    public h1 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        N();
        return this.f54u;
    }

    @Override // androidx.core.content.m
    public final void h(@androidx.annotation.o0 androidx.core.util.c<Configuration> cVar) {
        this.A.add(cVar);
    }

    @Override // androidx.core.app.x3
    public final void m(@androidx.annotation.o0 androidx.core.util.c<m4> cVar) {
        this.E.remove(cVar);
    }

    @Override // androidx.core.content.n
    public final void n(@androidx.annotation.o0 androidx.core.util.c<Integer> cVar) {
        this.B.remove(cVar);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @Deprecated
    protected void onActivityResult(int i5, int i6, @q0 Intent intent) {
        if (this.f59z.b(i5, i6, intent)) {
            return;
        }
        super.onActivityResult(i5, i6, intent);
    }

    @Override // android.app.Activity
    @androidx.annotation.l0
    public void onBackPressed() {
        this.f56w.e();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @androidx.annotation.i
    public void onConfigurationChanged(@androidx.annotation.o0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<androidx.core.util.c<Configuration>> it = this.A.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@q0 Bundle bundle) {
        this.f53t.d(bundle);
        this.f50q.c(this);
        super.onCreate(bundle);
        q0.g(this);
        int i5 = this.f57x;
        if (i5 != 0) {
            setContentView(i5);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i5, @androidx.annotation.o0 Menu menu) {
        if (i5 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i5, menu);
        this.f51r.h(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, @androidx.annotation.o0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        if (i5 == 0) {
            return this.f51r.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    public void onMultiWindowModeChanged(boolean z5) {
        Iterator<androidx.core.util.c<y>> it = this.D.iterator();
        while (it.hasNext()) {
            it.next().accept(new y(z5));
        }
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    protected void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<androidx.core.util.c<Intent>> it = this.C.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i5, @androidx.annotation.o0 Menu menu) {
        this.f51r.i(menu);
        super.onPanelClosed(i5, menu);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    public void onPictureInPictureModeChanged(boolean z5) {
        Iterator<androidx.core.util.c<m4>> it = this.E.iterator();
        while (it.hasNext()) {
            it.next().accept(new m4(z5));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i5, @q0 View view, @androidx.annotation.o0 Menu menu) {
        if (i5 != 0) {
            return true;
        }
        super.onPreparePanel(i5, view, menu);
        this.f51r.k(menu);
        return true;
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @Deprecated
    public void onRequestPermissionsResult(int i5, @androidx.annotation.o0 String[] strArr, @androidx.annotation.o0 int[] iArr) {
        if (this.f59z.b(i5, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i5, strArr, iArr);
    }

    @Override // android.app.Activity
    @q0
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object S = S();
        h1 h1Var = this.f54u;
        if (h1Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            h1Var = dVar.f72b;
        }
        if (h1Var == null && S == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f71a = S;
        dVar2.f72b = h1Var;
        return dVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @androidx.annotation.i
    protected void onSaveInstanceState(@androidx.annotation.o0 Bundle bundle) {
        t lifecycle = getLifecycle();
        if (lifecycle instanceof c0) {
            ((c0) lifecycle).q(t.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f53t.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @androidx.annotation.i
    public void onTrimMemory(int i5) {
        super.onTrimMemory(i5);
        Iterator<androidx.core.util.c<Integer>> it = this.B.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i5));
        }
    }

    @Override // a.a
    @q0
    public Context p() {
        return this.f50q.d();
    }

    @Override // androidx.core.app.x3
    public final void q(@androidx.annotation.o0 androidx.core.util.c<m4> cVar) {
        this.E.add(cVar);
    }

    @Override // android.view.result.d
    @androidx.annotation.o0
    public final ActivityResultRegistry r() {
        return this.f59z;
    }

    @Override // android.view.result.b
    @androidx.annotation.o0
    public final <I, O> android.view.result.c<I> registerForActivityResult(@androidx.annotation.o0 b.a<I, O> aVar, @androidx.annotation.o0 ActivityResultRegistry activityResultRegistry, @androidx.annotation.o0 android.view.result.a<O> aVar2) {
        return activityResultRegistry.i("activity_rq#" + this.f58y.getAndIncrement(), this, aVar, aVar2);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (androidx.tracing.b.h()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.core.app.v3
    public final void s(@androidx.annotation.o0 androidx.core.util.c<y> cVar) {
        this.D.add(cVar);
    }

    @Override // android.app.Activity
    public void setContentView(@j0 int i5) {
        P();
        super.setContentView(i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i5) {
        super.startActivityForResult(intent, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i5, @q0 Intent intent, int i6, int i7, int i8) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8);
    }

    @Override // androidx.core.app.w3
    public final void u(@androidx.annotation.o0 androidx.core.util.c<Intent> cVar) {
        this.C.remove(cVar);
    }

    @Override // androidx.core.content.m
    public final void w(@androidx.annotation.o0 androidx.core.util.c<Configuration> cVar) {
        this.A.remove(cVar);
    }

    @Override // a.a
    public final void z(@androidx.annotation.o0 a.c cVar) {
        this.f50q.e(cVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i5, @q0 Bundle bundle) {
        super.startActivityForResult(intent, i5, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i5, @q0 Intent intent, int i6, int i7, int i8, @q0 Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i5, intent, i6, i7, i8, bundle);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @x0(api = 26)
    public void onMultiWindowModeChanged(boolean z5, @androidx.annotation.o0 Configuration configuration) {
        Iterator<androidx.core.util.c<y>> it = this.D.iterator();
        while (it.hasNext()) {
            it.next().accept(new y(z5, configuration));
        }
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @x0(api = 26)
    public void onPictureInPictureModeChanged(boolean z5, @androidx.annotation.o0 Configuration configuration) {
        Iterator<androidx.core.util.c<m4>> it = this.E.iterator();
        while (it.hasNext()) {
            it.next().accept(new m4(z5, configuration));
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        P();
        super.setContentView(view);
    }

    @Override // android.view.result.b
    @androidx.annotation.o0
    public final <I, O> android.view.result.c<I> registerForActivityResult(@androidx.annotation.o0 b.a<I, O> aVar, @androidx.annotation.o0 android.view.result.a<O> aVar2) {
        return registerForActivityResult(aVar, this.f59z, aVar2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        P();
        super.setContentView(view, layoutParams);
    }

    @o
    public ComponentActivity(@j0 int i5) {
        this();
        this.f57x = i5;
    }
}
