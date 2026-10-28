package androidx.content.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.content.f0;
import androidx.content.u;
import androidx.content.ui.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import fg.l;
import fg.m;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import kd.j;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: NavigationUI.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b!\u0010\"J1\u0010%\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b%\u0010&J1\u0010'\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00182\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\u00182\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b-\u0010.J\u001d\u00102\u001a\b\u0012\u0002\b\u0003\u0018\u0001012\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\u00182\u0006\u00105\u001a\u0002042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b6\u00107J'\u00108\u001a\u00020\u00182\u0006\u00105\u001a\u0002042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b8\u00109J\u001d\u0010=\u001a\u00020\b*\u00020:2\b\b\u0001\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b=\u0010>J#\u0010A\u001a\u00020\b*\u00020:2\u000e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0?H\u0001¢\u0006\u0004\bA\u0010B¨\u0006C"}, d2 = {"Landroidx/navigation/ui/q;", "", "<init>", "()V", "Landroid/view/MenuItem;", "item", "Landroidx/navigation/u;", "navController", "", "l", "(Landroid/view/MenuItem;Landroidx/navigation/u;)Z", "saveState", "m", "(Landroid/view/MenuItem;Landroidx/navigation/u;Z)Z", "Landroidx/customview/widget/c;", "openableLayout", "j", "(Landroidx/navigation/u;Landroidx/customview/widget/c;)Z", "Landroidx/navigation/ui/d;", "configuration", "k", "(Landroidx/navigation/u;Landroidx/navigation/ui/d;)Z", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lkotlin/k2;", "o", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/navigation/u;Landroidx/customview/widget/c;)V", "p", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/navigation/u;Landroidx/navigation/ui/d;)V", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "s", "(Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/u;Landroidx/customview/widget/c;)V", "t", "(Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/u;Landroidx/navigation/ui/d;)V", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbarLayout", "v", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/u;Landroidx/customview/widget/c;)V", "w", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout;Landroidx/appcompat/widget/Toolbar;Landroidx/navigation/u;Landroidx/navigation/ui/d;)V", "Lcom/google/android/material/navigation/NavigationView;", "navigationView", "z", "(Lcom/google/android/material/navigation/NavigationView;Landroidx/navigation/u;)V", "A", "(Lcom/google/android/material/navigation/NavigationView;Landroidx/navigation/u;Z)V", "Landroid/view/View;", "view", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "g", "(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lcom/google/android/material/navigation/NavigationBarView;", "navigationBarView", "x", "(Lcom/google/android/material/navigation/NavigationBarView;Landroidx/navigation/u;)V", "y", "(Lcom/google/android/material/navigation/NavigationBarView;Landroidx/navigation/u;Z)V", "Landroidx/navigation/f0;", "", "destId", "h", "(Landroidx/navigation/f0;I)Z", "", "destinationIds", "i", "(Landroidx/navigation/f0;Ljava/util/Set;)Z", "navigation-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final q f31349a = new q();

    /* compiled from: NavigationUI.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/navigation/ui/q$a", "Landroidx/navigation/u$c;", "Landroidx/navigation/u;", "controller", "Landroidx/navigation/f0;", "destination", "Landroid/os/Bundle;", "arguments", "Lkotlin/k2;", "a", "(Landroidx/navigation/u;Landroidx/navigation/f0;Landroid/os/Bundle;)V", "navigation-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a implements u.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference<NavigationBarView> f31350a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f31351b;

        a(WeakReference<NavigationBarView> weakReference, u uVar) {
            this.f31350a = weakReference;
            this.f31351b = uVar;
        }

        @Override // androidx.navigation.u.c
        public void a(@l u controller, @l f0 destination, @m Bundle arguments) {
            l0.p(controller, "controller");
            l0.p(destination, "destination");
            NavigationBarView navigationBarView = this.f31350a.get();
            if (navigationBarView == null) {
                this.f31351b.H0(this);
                return;
            }
            Menu q4 = navigationBarView.q();
            l0.o(q4, "view.menu");
            int size = q4.size();
            for (int i4 = 0; i4 < size; i4++) {
                MenuItem item = q4.getItem(i4);
                l0.h(item, "getItem(index)");
                if (q.h(destination, item.getItemId())) {
                    item.setChecked(true);
                }
            }
        }
    }

    /* compiled from: NavigationUI.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/navigation/ui/q$b", "Landroidx/navigation/u$c;", "Landroidx/navigation/u;", "controller", "Landroidx/navigation/f0;", "destination", "Landroid/os/Bundle;", "arguments", "Lkotlin/k2;", "a", "(Landroidx/navigation/u;Landroidx/navigation/f0;Landroid/os/Bundle;)V", "navigation-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class b implements u.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference<NavigationView> f31352a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f31353b;

        b(WeakReference<NavigationView> weakReference, u uVar) {
            this.f31352a = weakReference;
            this.f31353b = uVar;
        }

        @Override // androidx.navigation.u.c
        public void a(@l u controller, @l f0 destination, @m Bundle arguments) {
            l0.p(controller, "controller");
            l0.p(destination, "destination");
            NavigationView navigationView = this.f31352a.get();
            if (navigationView == null) {
                this.f31353b.H0(this);
                return;
            }
            Menu s4 = navigationView.s();
            l0.o(s4, "view.menu");
            int size = s4.size();
            for (int i4 = 0; i4 < size; i4++) {
                MenuItem item = s4.getItem(i4);
                l0.h(item, "getItem(index)");
                item.setChecked(q.h(destination, item.getItemId()));
            }
        }
    }

    /* compiled from: NavigationUI.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/navigation/ui/q$c", "Landroidx/navigation/u$c;", "Landroidx/navigation/u;", "controller", "Landroidx/navigation/f0;", "destination", "Landroid/os/Bundle;", "arguments", "Lkotlin/k2;", "a", "(Landroidx/navigation/u;Landroidx/navigation/f0;Landroid/os/Bundle;)V", "navigation-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class c implements u.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference<NavigationView> f31354a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f31355b;

        c(WeakReference<NavigationView> weakReference, u uVar) {
            this.f31354a = weakReference;
            this.f31355b = uVar;
        }

        @Override // androidx.navigation.u.c
        public void a(@l u controller, @l f0 destination, @m Bundle arguments) {
            l0.p(controller, "controller");
            l0.p(destination, "destination");
            NavigationView navigationView = this.f31354a.get();
            if (navigationView == null) {
                this.f31355b.H0(this);
                return;
            }
            Menu s4 = navigationView.s();
            l0.o(s4, "view.menu");
            int size = s4.size();
            for (int i4 = 0; i4 < size; i4++) {
                MenuItem item = s4.getItem(i4);
                l0.h(item, "getItem(index)");
                item.setChecked(q.h(destination, item.getItemId()));
            }
        }
    }

    /* compiled from: NavigationUI.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/navigation/ui/q$d", "Landroidx/navigation/u$c;", "Landroidx/navigation/u;", "controller", "Landroidx/navigation/f0;", "destination", "Landroid/os/Bundle;", "arguments", "Lkotlin/k2;", "a", "(Landroidx/navigation/u;Landroidx/navigation/f0;Landroid/os/Bundle;)V", "navigation-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class d implements u.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference<NavigationBarView> f31356a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f31357b;

        d(WeakReference<NavigationBarView> weakReference, u uVar) {
            this.f31356a = weakReference;
            this.f31357b = uVar;
        }

        @Override // androidx.navigation.u.c
        public void a(@l u controller, @l f0 destination, @m Bundle arguments) {
            l0.p(controller, "controller");
            l0.p(destination, "destination");
            NavigationBarView navigationBarView = this.f31356a.get();
            if (navigationBarView == null) {
                this.f31357b.H0(this);
                return;
            }
            Menu q4 = navigationBarView.q();
            l0.o(q4, "view.menu");
            int size = q4.size();
            for (int i4 = 0; i4 < size; i4++) {
                MenuItem item = q4.getItem(i4);
                l0.h(item, "getItem(index)");
                if (q.h(destination, item.getItemId())) {
                    item.setChecked(true);
                }
            }
        }
    }

    private q() {
    }

    @n
    @r
    public static final void A(@l final NavigationView navigationView, @l final u navController, final boolean saveState) {
        l0.p(navigationView, "navigationView");
        l0.p(navController, "navController");
        if (saveState) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
        }
        navigationView.L(new NavigationView.c() { // from class: androidx.navigation.ui.m
            @Override // com.google.android.material.navigation.NavigationView.c
            public final boolean a(MenuItem menuItem) {
                boolean G;
                G = q.G(u.this, saveState, navigationView, menuItem);
                return G;
            }
        });
        navController.q(new c(new WeakReference(navigationView), navController));
    }

    public static /* synthetic */ void B(Toolbar toolbar, u uVar, androidx.content.ui.d dVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            dVar = new d.a(uVar.K()).a();
        }
        t(toolbar, uVar, dVar);
    }

    public static /* synthetic */ void C(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, u uVar, androidx.content.ui.d dVar, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            dVar = new d.a(uVar.K()).a();
        }
        w(collapsingToolbarLayout, toolbar, uVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(u navController, androidx.content.ui.d configuration, View view) {
        l0.p(navController, "$navController");
        l0.p(configuration, "$configuration");
        k(navController, configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(u navController, androidx.content.ui.d configuration, View view) {
        l0.p(navController, "$navController");
        l0.p(configuration, "$configuration");
        k(navController, configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(u navController, NavigationView navigationView, MenuItem item) {
        l0.p(navController, "$navController");
        l0.p(navigationView, "$navigationView");
        l0.p(item, "item");
        boolean l4 = l(item, navController);
        if (l4) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof androidx.customview.widget.c) {
                ((androidx.customview.widget.c) parent).close();
            } else {
                BottomSheetBehavior<?> g4 = g(navigationView);
                if (g4 != null) {
                    g4.K0(5);
                }
            }
        }
        return l4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G(u navController, boolean z4, NavigationView navigationView, MenuItem item) {
        l0.p(navController, "$navController");
        l0.p(navigationView, "$navigationView");
        l0.p(item, "item");
        boolean m4 = m(item, navController, z4);
        if (m4) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof androidx.customview.widget.c) {
                ((androidx.customview.widget.c) parent).close();
            } else {
                BottomSheetBehavior<?> g4 = g(navigationView);
                if (g4 != null) {
                    g4.K0(5);
                }
            }
        }
        return m4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(u navController, MenuItem item) {
        l0.p(navController, "$navController");
        l0.p(item, "item");
        return l(item, navController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I(u navController, boolean z4, MenuItem item) {
        l0.p(navController, "$navController");
        l0.p(item, "item");
        return m(item, navController, z4);
    }

    @m
    @n
    @c1({c1.a.LIBRARY_GROUP})
    public static final BottomSheetBehavior<?> g(@l View view) {
        l0.p(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.Behavior f4 = ((CoordinatorLayout.f) layoutParams).f();
            if (f4 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f4;
            }
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return g((View) parent);
        }
        return null;
    }

    @n
    public static final boolean h(@l f0 f0Var, @d0 int i4) {
        l0.p(f0Var, "<this>");
        Iterator<f0> it = f0.INSTANCE.c(f0Var).iterator();
        while (it.hasNext()) {
            if (it.next().getId() == i4) {
                return true;
            }
        }
        return false;
    }

    @n
    public static final boolean i(@l f0 f0Var, @l Set<Integer> destinationIds) {
        l0.p(f0Var, "<this>");
        l0.p(destinationIds, "destinationIds");
        Iterator<f0> it = f0.INSTANCE.c(f0Var).iterator();
        while (it.hasNext()) {
            if (destinationIds.contains(Integer.valueOf(it.next().getId()))) {
                return true;
            }
        }
        return false;
    }

    @n
    public static final boolean j(@l u navController, @m androidx.customview.widget.c openableLayout) {
        l0.p(navController, "navController");
        return k(navController, new d.a(navController.K()).d(openableLayout).a());
    }

    @n
    public static final boolean k(@l u navController, @l androidx.content.ui.d configuration) {
        l0.p(navController, "navController");
        l0.p(configuration, "configuration");
        androidx.customview.widget.c openableLayout = configuration.getOpenableLayout();
        f0 I = navController.I();
        Set<Integer> d5 = configuration.d();
        if (openableLayout != null && I != null && i(I, d5)) {
            openableLayout.open();
            return true;
        }
        if (navController.r0()) {
            return true;
        }
        d.b fallbackOnNavigateUpListener = configuration.getFallbackOnNavigateUpListener();
        if (fallbackOnNavigateUpListener == null) {
            return false;
        }
        return fallbackOnNavigateUpListener.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        if (h(r6, r5.getItemId()) == true) goto L15;
     */
    @kd.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean l(@fg.l android.view.MenuItem r5, @fg.l androidx.content.u r6) {
        /*
            java.lang.String r0 = "item"
            kotlin.jvm.internal.l0.p(r5, r0)
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.l0.p(r6, r0)
            androidx.navigation.t0$a r0 = new androidx.navigation.t0$a
            r0.<init>()
            r1 = 1
            androidx.navigation.t0$a r0 = r0.d(r1)
            androidx.navigation.t0$a r0 = r0.m(r1)
            androidx.navigation.f0 r2 = r6.I()
            kotlin.jvm.internal.l0.m(r2)
            androidx.navigation.j0 r2 = r2.getParent()
            kotlin.jvm.internal.l0.m(r2)
            int r3 = r5.getItemId()
            androidx.navigation.f0 r2 = r2.g0(r3, r1)
            boolean r2 = r2 instanceof androidx.navigation.d.b
            if (r2 == 0) goto L4a
            int r2 = androidx.navigation.ui.t.a.f31358a
            androidx.navigation.t0$a r2 = r0.b(r2)
            int r3 = androidx.navigation.ui.t.a.f31359b
            androidx.navigation.t0$a r2 = r2.c(r3)
            int r3 = androidx.navigation.ui.t.a.f31360c
            androidx.navigation.t0$a r2 = r2.e(r3)
            int r3 = androidx.navigation.ui.t.a.f31361d
            r2.f(r3)
            goto L61
        L4a:
            int r2 = androidx.navigation.ui.t.b.f31362a
            androidx.navigation.t0$a r2 = r0.b(r2)
            int r3 = androidx.navigation.ui.t.b.f31363b
            androidx.navigation.t0$a r2 = r2.c(r3)
            int r3 = androidx.navigation.ui.t.b.f31364c
            androidx.navigation.t0$a r2 = r2.e(r3)
            int r3 = androidx.navigation.ui.t.b.f31365d
            r2.f(r3)
        L61:
            int r2 = r5.getOrder()
            r3 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r3
            r3 = 0
            if (r2 != 0) goto L7c
            androidx.navigation.j0$a r2 = androidx.content.j0.INSTANCE
            androidx.navigation.j0 r4 = r6.K()
            androidx.navigation.f0 r2 = r2.a(r4)
            int r2 = r2.getId()
            r0.h(r2, r3, r1)
        L7c:
            androidx.navigation.t0 r0 = r0.a()
            int r2 = r5.getItemId()     // Catch: java.lang.IllegalArgumentException -> L9b
            r4 = 0
            r6.Y(r2, r4, r0)     // Catch: java.lang.IllegalArgumentException -> L9b
            androidx.navigation.f0 r6 = r6.I()     // Catch: java.lang.IllegalArgumentException -> L9b
            if (r6 != 0) goto L90
        L8e:
            r1 = r3
            goto L9a
        L90:
            int r5 = r5.getItemId()     // Catch: java.lang.IllegalArgumentException -> L9b
            boolean r5 = h(r6, r5)     // Catch: java.lang.IllegalArgumentException -> L9b
            if (r5 != r1) goto L8e
        L9a:
            r3 = r1
        L9b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.ui.q.l(android.view.MenuItem, androidx.navigation.u):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
    
        if (h(r8, r7.getItemId()) == true) goto L17;
     */
    @kd.n
    @androidx.content.ui.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m(@fg.l android.view.MenuItem r7, @fg.l androidx.content.u r8, boolean r9) {
        /*
            java.lang.String r0 = "item"
            kotlin.jvm.internal.l0.p(r7, r0)
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.l0.p(r8, r0)
            if (r9 != 0) goto L9f
            androidx.navigation.t0$a r9 = new androidx.navigation.t0$a
            r9.<init>()
            r0 = 1
            androidx.navigation.t0$a r9 = r9.d(r0)
            androidx.navigation.f0 r1 = r8.I()
            kotlin.jvm.internal.l0.m(r1)
            androidx.navigation.j0 r1 = r1.getParent()
            kotlin.jvm.internal.l0.m(r1)
            int r2 = r7.getItemId()
            androidx.navigation.f0 r1 = r1.g0(r2, r0)
            boolean r1 = r1 instanceof androidx.navigation.d.b
            if (r1 == 0) goto L48
            int r1 = androidx.navigation.ui.t.a.f31358a
            androidx.navigation.t0$a r1 = r9.b(r1)
            int r2 = androidx.navigation.ui.t.a.f31359b
            androidx.navigation.t0$a r1 = r1.c(r2)
            int r2 = androidx.navigation.ui.t.a.f31360c
            androidx.navigation.t0$a r1 = r1.e(r2)
            int r2 = androidx.navigation.ui.t.a.f31361d
            r1.f(r2)
            goto L5f
        L48:
            int r1 = androidx.navigation.ui.t.b.f31362a
            androidx.navigation.t0$a r1 = r9.b(r1)
            int r2 = androidx.navigation.ui.t.b.f31363b
            androidx.navigation.t0$a r1 = r1.c(r2)
            int r2 = androidx.navigation.ui.t.b.f31364c
            androidx.navigation.t0$a r1 = r1.e(r2)
            int r2 = androidx.navigation.ui.t.b.f31365d
            r1.f(r2)
        L5f:
            int r1 = r7.getOrder()
            r2 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 & r2
            if (r1 != 0) goto L7e
            androidx.navigation.j0$a r1 = androidx.content.j0.INSTANCE
            androidx.navigation.j0 r2 = r8.K()
            androidx.navigation.f0 r1 = r1.a(r2)
            int r2 = r1.getId()
            r5 = 4
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r9
            androidx.navigation.t0.a.k(r1, r2, r3, r4, r5, r6)
        L7e:
            androidx.navigation.t0 r9 = r9.a()
            r1 = 0
            int r2 = r7.getItemId()     // Catch: java.lang.IllegalArgumentException -> L9e
            r3 = 0
            r8.Y(r2, r3, r9)     // Catch: java.lang.IllegalArgumentException -> L9e
            androidx.navigation.f0 r8 = r8.I()     // Catch: java.lang.IllegalArgumentException -> L9e
            if (r8 != 0) goto L93
        L91:
            r0 = r1
            goto L9d
        L93:
            int r7 = r7.getItemId()     // Catch: java.lang.IllegalArgumentException -> L9e
            boolean r7 = h(r8, r7)     // Catch: java.lang.IllegalArgumentException -> L9e
            if (r7 != r0) goto L91
        L9d:
            r1 = r0
        L9e:
            return r1
        L9f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.ui.q.m(android.view.MenuItem, androidx.navigation.u, boolean):boolean");
    }

    @j
    @n
    public static final void n(@l AppCompatActivity activity, @l u navController) {
        l0.p(activity, "activity");
        l0.p(navController, "navController");
        q(activity, navController, null, 4, null);
    }

    @n
    public static final void o(@l AppCompatActivity activity, @l u navController, @m androidx.customview.widget.c openableLayout) {
        l0.p(activity, "activity");
        l0.p(navController, "navController");
        p(activity, navController, new d.a(navController.K()).d(openableLayout).a());
    }

    @j
    @n
    public static final void p(@l AppCompatActivity activity, @l u navController, @l androidx.content.ui.d configuration) {
        l0.p(activity, "activity");
        l0.p(navController, "navController");
        l0.p(configuration, "configuration");
        navController.q(new androidx.content.ui.b(activity, configuration));
    }

    public static /* synthetic */ void q(AppCompatActivity appCompatActivity, u uVar, androidx.content.ui.d dVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            dVar = new d.a(uVar.K()).a();
        }
        p(appCompatActivity, uVar, dVar);
    }

    @j
    @n
    public static final void r(@l Toolbar toolbar, @l u navController) {
        l0.p(toolbar, "toolbar");
        l0.p(navController, "navController");
        B(toolbar, navController, null, 4, null);
    }

    @n
    public static final void s(@l Toolbar toolbar, @l u navController, @m androidx.customview.widget.c openableLayout) {
        l0.p(toolbar, "toolbar");
        l0.p(navController, "navController");
        t(toolbar, navController, new d.a(navController.K()).d(openableLayout).a());
    }

    @j
    @n
    public static final void t(@l Toolbar toolbar, @l final u navController, @l final androidx.content.ui.d configuration) {
        l0.p(toolbar, "toolbar");
        l0.p(navController, "navController");
        l0.p(configuration, "configuration");
        navController.q(new v(toolbar, configuration));
        toolbar.M0(new View.OnClickListener() { // from class: androidx.navigation.ui.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.D(u.this, configuration, view);
            }
        });
    }

    @j
    @n
    public static final void u(@l CollapsingToolbarLayout collapsingToolbarLayout, @l Toolbar toolbar, @l u navController) {
        l0.p(collapsingToolbarLayout, "collapsingToolbarLayout");
        l0.p(toolbar, "toolbar");
        l0.p(navController, "navController");
        C(collapsingToolbarLayout, toolbar, navController, null, 8, null);
    }

    @n
    public static final void v(@l CollapsingToolbarLayout collapsingToolbarLayout, @l Toolbar toolbar, @l u navController, @m androidx.customview.widget.c openableLayout) {
        l0.p(collapsingToolbarLayout, "collapsingToolbarLayout");
        l0.p(toolbar, "toolbar");
        l0.p(navController, "navController");
        w(collapsingToolbarLayout, toolbar, navController, new d.a(navController.K()).d(openableLayout).a());
    }

    @j
    @n
    public static final void w(@l CollapsingToolbarLayout collapsingToolbarLayout, @l Toolbar toolbar, @l final u navController, @l final androidx.content.ui.d configuration) {
        l0.p(collapsingToolbarLayout, "collapsingToolbarLayout");
        l0.p(toolbar, "toolbar");
        l0.p(navController, "navController");
        l0.p(configuration, "configuration");
        navController.q(new h(collapsingToolbarLayout, toolbar, configuration));
        toolbar.M0(new View.OnClickListener() { // from class: androidx.navigation.ui.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.E(u.this, configuration, view);
            }
        });
    }

    @n
    public static final void x(@l NavigationBarView navigationBarView, @l final u navController) {
        l0.p(navigationBarView, "navigationBarView");
        l0.p(navController, "navController");
        navigationBarView.K(new NavigationBarView.e() { // from class: androidx.navigation.ui.o
            @Override // com.google.android.material.navigation.NavigationBarView.e
            public final boolean a(MenuItem menuItem) {
                boolean H;
                H = q.H(u.this, menuItem);
                return H;
            }
        });
        navController.q(new d(new WeakReference(navigationBarView), navController));
    }

    @n
    @r
    public static final void y(@l NavigationBarView navigationBarView, @l final u navController, final boolean saveState) {
        l0.p(navigationBarView, "navigationBarView");
        l0.p(navController, "navController");
        if (saveState) {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default");
        }
        navigationBarView.K(new NavigationBarView.e() { // from class: androidx.navigation.ui.k
            @Override // com.google.android.material.navigation.NavigationBarView.e
            public final boolean a(MenuItem menuItem) {
                boolean I;
                I = q.I(u.this, saveState, menuItem);
                return I;
            }
        });
        navController.q(new a(new WeakReference(navigationBarView), navController));
    }

    @n
    public static final void z(@l final NavigationView navigationView, @l final u navController) {
        l0.p(navigationView, "navigationView");
        l0.p(navController, "navController");
        navigationView.L(new NavigationView.c() { // from class: androidx.navigation.ui.p
            @Override // com.google.android.material.navigation.NavigationView.c
            public final boolean a(MenuItem menuItem) {
                boolean F;
                F = q.F(u.this, navigationView, menuItem);
                return F;
            }
        });
        navController.q(new b(new WeakReference(navigationView), navController));
    }
}
