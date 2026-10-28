package androidx.content.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.c1;
import androidx.annotation.i;
import androidx.annotation.n0;
import androidx.content.b1;
import androidx.content.d1;
import androidx.content.fragment.i;
import androidx.content.fragment.m;
import androidx.content.i1;
import androidx.content.p0;
import androidx.content.q0;
import androidx.content.u;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import fg.l;
import fg.m;
import kd.j;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.k2;

/* compiled from: NavHostFragment.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000e\b\u0016\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001DB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001aH\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\"2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b&\u0010'J)\u0010*\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\nH\u0017¢\u0006\u0004\b-\u0010\rJ\u000f\u0010.\u001a\u00020\u0007H\u0016¢\u0006\u0004\b.\u0010\u0004R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010@\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/p0;", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/k2;", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/navigation/q0;", "navHostController", "u", "(Landroidx/navigation/q0;)V", "Landroidx/navigation/u;", "navController", "t", "(Landroidx/navigation/u;)V", "", "isPrimaryNavigationFragment", "onPrimaryNavigationFragmentChanged", "(Z)V", "Landroidx/navigation/c1;", "Landroidx/navigation/fragment/i$b;", "q", "()Landroidx/navigation/c1;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/util/AttributeSet;", "attrs", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onDestroyView", "b", "Landroidx/navigation/q0;", "c", "Ljava/lang/Boolean;", "isPrimaryBeforeOnCreate", "d", "Landroid/view/View;", "viewParent", "", "e", "I", "graphId", "f", "Z", "defaultNavHost", "s", "()I", "containerId", "m", "()Landroidx/navigation/u;", "g", "a", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class NavHostFragment extends Fragment implements p0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private q0 navHostController;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private Boolean isPrimaryBeforeOnCreate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private View viewParent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int graphId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean defaultNavHost;

    /* renamed from: h, reason: collision with root package name */
    @l
    @c1({c1.a.LIBRARY_GROUP})
    public static final String f31077h = "android-support-nav:fragment:graphId";

    /* renamed from: i, reason: collision with root package name */
    @l
    @c1({c1.a.LIBRARY_GROUP})
    public static final String f31078i = "android-support-nav:fragment:startDestinationArgs";

    /* renamed from: j, reason: collision with root package name */
    @l
    private static final String f31079j = "android-support-nav:fragment:navControllerState";

    /* renamed from: k, reason: collision with root package name */
    @l
    private static final String f31080k = "android-support-nav:fragment:defaultHost";

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: NavHostFragment.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment$a;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/navigation/u;", "d", "(Landroidx/fragment/app/Fragment;)Landroidx/navigation/u;", "", "graphResId", "Landroid/os/Bundle;", "startDestinationArgs", "Landroidx/navigation/fragment/NavHostFragment;", "b", "(ILandroid/os/Bundle;)Landroidx/navigation/fragment/NavHostFragment;", "", "KEY_DEFAULT_NAV_HOST", "Ljava/lang/String;", "KEY_GRAPH_ID", "KEY_NAV_CONTROLLER_STATE", "KEY_START_DESTINATION_ARGS", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.navigation.fragment.NavHostFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ NavHostFragment c(Companion companion, int i4, Bundle bundle, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                bundle = null;
            }
            return companion.b(i4, bundle);
        }

        @l
        @j
        @n
        public final NavHostFragment a(@n0 int i4) {
            return c(this, i4, null, 2, null);
        }

        @l
        @j
        @n
        public final NavHostFragment b(@n0 int graphResId, @m Bundle startDestinationArgs) {
            Bundle bundle;
            if (graphResId != 0) {
                bundle = new Bundle();
                bundle.putInt("android-support-nav:fragment:graphId", graphResId);
            } else {
                bundle = null;
            }
            if (startDestinationArgs != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android-support-nav:fragment:startDestinationArgs", startDestinationArgs);
            }
            NavHostFragment navHostFragment = new NavHostFragment();
            if (bundle != null) {
                navHostFragment.setArguments(bundle);
            }
            return navHostFragment;
        }

        @l
        @n
        public final u d(@l Fragment fragment) {
            Dialog dialog;
            Window window;
            l0.p(fragment, "fragment");
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
                if (fragment2 instanceof NavHostFragment) {
                    q0 q0Var = ((NavHostFragment) fragment2).navHostController;
                    if (q0Var != null) {
                        return q0Var;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
                Fragment N0 = fragment2.getParentFragmentManager().N0();
                if (N0 instanceof NavHostFragment) {
                    q0 q0Var2 = ((NavHostFragment) N0).navHostController;
                    if (q0Var2 != null) {
                        return q0Var2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return b1.k(view);
            }
            View view2 = null;
            e eVar = fragment instanceof e ? (e) fragment : null;
            if (eVar != null && (dialog = eVar.getDialog()) != null && (window = dialog.getWindow()) != null) {
                view2 = window.getDecorView();
            }
            if (view2 != null) {
                return b1.k(view2);
            }
            throw new IllegalStateException(f.a("Fragment ", fragment, " does not have a NavController set"));
        }

        public Companion(w wVar) {
        }
    }

    @l
    @j
    @n
    public static final NavHostFragment o(@n0 int i4) {
        Companion companion = INSTANCE;
        companion.getClass();
        return Companion.c(companion, i4, null, 2, null);
    }

    @l
    @j
    @n
    public static final NavHostFragment p(@n0 int i4, @m Bundle bundle) {
        return INSTANCE.b(i4, bundle);
    }

    @l
    @n
    public static final u r(@l Fragment fragment) {
        return INSTANCE.d(fragment);
    }

    private final int s() {
        int id2 = getId();
        return (id2 == 0 || id2 == -1) ? m.c.f31116a : id2;
    }

    @Override // androidx.content.p0
    @l
    public final u m() {
        q0 q0Var = this.navHostController;
        if (q0Var == null) {
            throw new IllegalStateException("NavController is not available before onCreate()");
        }
        if (q0Var != null) {
            return q0Var;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavHostController");
    }

    @Override // androidx.fragment.app.Fragment
    @i
    public void onAttach(@l Context context) {
        l0.p(context, "context");
        super.onAttach(context);
        if (this.defaultNavHost) {
            getParentFragmentManager().u().Q(this).r();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@fg.m android.os.Bundle r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.requireContext()
            java.lang.String r1 = "requireContext()"
            kotlin.jvm.internal.l0.o(r0, r1)
            androidx.navigation.q0 r1 = new androidx.navigation.q0
            r1.<init>(r0)
            r6.navHostController = r1
            kotlin.jvm.internal.l0.m(r1)
            r1.Q0(r6)
        L16:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L3e
            boolean r1 = r0 instanceof androidx.view.f0
            if (r1 == 0) goto L32
            androidx.navigation.q0 r1 = r6.navHostController
            kotlin.jvm.internal.l0.m(r1)
            androidx.activity.f0 r0 = (androidx.view.f0) r0
            androidx.activity.OnBackPressedDispatcher r0 = r0.getOnBackPressedDispatcher()
            java.lang.String r2 = "context as OnBackPressed…).onBackPressedDispatcher"
            kotlin.jvm.internal.l0.o(r0, r2)
            r1.S0(r0)
            goto L3e
        L32:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            java.lang.String r1 = "context.baseContext"
            kotlin.jvm.internal.l0.o(r0, r1)
            goto L16
        L3e:
            androidx.navigation.q0 r0 = r6.navHostController
            kotlin.jvm.internal.l0.m(r0)
            java.lang.Boolean r1 = r6.isPrimaryBeforeOnCreate
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L5b
            if (r1 == 0) goto L53
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L5b
            r1 = r2
            goto L5c
        L53:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            r7.<init>(r0)
            throw r7
        L5b:
            r1 = r3
        L5c:
            r0.x(r1)
            r0 = 0
            r6.isPrimaryBeforeOnCreate = r0
            androidx.navigation.q0 r1 = r6.navHostController
            kotlin.jvm.internal.l0.m(r1)
            androidx.lifecycle.n1 r4 = r6.getViewModelStore()
            java.lang.String r5 = "viewModelStore"
            kotlin.jvm.internal.l0.o(r4, r5)
            r1.T0(r4)
            androidx.navigation.q0 r1 = r6.navHostController
            kotlin.jvm.internal.l0.m(r1)
            r6.u(r1)
            java.lang.String r1 = "android-support-nav:fragment:graphId"
            if (r7 == 0) goto La5
            java.lang.String r4 = "android-support-nav:fragment:navControllerState"
            android.os.Bundle r4 = r7.getBundle(r4)
            java.lang.String r5 = "android-support-nav:fragment:defaultHost"
            boolean r5 = r7.getBoolean(r5, r3)
            if (r5 == 0) goto L9e
            r6.defaultNavHost = r2
            androidx.fragment.app.FragmentManager r2 = r6.getParentFragmentManager()
            androidx.fragment.app.l0 r2 = r2.u()
            androidx.fragment.app.l0 r2 = r2.Q(r6)
            r2.r()
        L9e:
            int r2 = r7.getInt(r1)
            r6.graphId = r2
            goto La6
        La5:
            r4 = r0
        La6:
            if (r4 == 0) goto Lb0
            androidx.navigation.q0 r2 = r6.navHostController
            kotlin.jvm.internal.l0.m(r2)
            r2.I0(r4)
        Lb0:
            int r2 = r6.graphId
            if (r2 == 0) goto Lbf
            androidx.navigation.q0 r0 = r6.navHostController
            kotlin.jvm.internal.l0.m(r0)
            int r1 = r6.graphId
            r0.L0(r1)
            goto Ldd
        Lbf:
            android.os.Bundle r2 = r6.getArguments()
            if (r2 != 0) goto Lc6
            goto Lca
        Lc6:
            int r3 = r2.getInt(r1)
        Lca:
            if (r2 != 0) goto Lcd
            goto Ld3
        Lcd:
            java.lang.String r0 = "android-support-nav:fragment:startDestinationArgs"
            android.os.Bundle r0 = r2.getBundle(r0)
        Ld3:
            if (r3 == 0) goto Ldd
            androidx.navigation.q0 r1 = r6.navHostController
            kotlin.jvm.internal.l0.m(r1)
            r1.M0(r3, r0)
        Ldd:
            super.onCreate(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.fragment.NavHostFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    @fg.m
    public View onCreateView(@l LayoutInflater inflater, @fg.m ViewGroup container, @fg.m Bundle savedInstanceState) {
        l0.p(inflater, "inflater");
        Context context = inflater.getContext();
        l0.o(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(s());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.viewParent;
        if (view != null && b1.k(view) == this.navHostController) {
            b1.n(view, null);
        }
        this.viewParent = null;
    }

    @Override // androidx.fragment.app.Fragment
    @i
    public void onInflate(@l Context context, @l AttributeSet attrs, @fg.m Bundle savedInstanceState) {
        l0.p(context, "context");
        l0.p(attrs, "attrs");
        super.onInflate(context, attrs, savedInstanceState);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, i1.c.f31151g);
        l0.o(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(i1.c.f31152h, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        k2 k2Var = k2.f75408a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attrs, m.d.f31123e);
        l0.o(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(m.d.f31124f, false)) {
            this.defaultNavHost = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    @i
    public void onPrimaryNavigationFragmentChanged(boolean isPrimaryNavigationFragment) {
        q0 q0Var = this.navHostController;
        if (q0Var == null) {
            this.isPrimaryBeforeOnCreate = Boolean.valueOf(isPrimaryNavigationFragment);
        } else {
            if (q0Var == null) {
                return;
            }
            q0Var.x(isPrimaryNavigationFragment);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @i
    public void onSaveInstanceState(@l Bundle outState) {
        l0.p(outState, "outState");
        super.onSaveInstanceState(outState);
        q0 q0Var = this.navHostController;
        l0.m(q0Var);
        Bundle K0 = q0Var.K0();
        if (K0 != null) {
            outState.putBundle("android-support-nav:fragment:navControllerState", K0);
        }
        if (this.defaultNavHost) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i4 = this.graphId;
        if (i4 != 0) {
            outState.putInt("android-support-nav:fragment:graphId", i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view, @fg.m Bundle savedInstanceState) {
        l0.p(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        b1.n(view, this.navHostController);
        if (view.getParent() != null) {
            Object parent = view.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            View view2 = (View) parent;
            this.viewParent = view2;
            l0.m(view2);
            if (view2.getId() == getId()) {
                View view3 = this.viewParent;
                l0.m(view3);
                b1.n(view3, this.navHostController);
            }
        }
    }

    @l
    @k(message = "Use {@link #onCreateNavController(NavController)}")
    protected androidx.content.c1<? extends i.b> q() {
        Context requireContext = requireContext();
        l0.o(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        l0.o(childFragmentManager, "childFragmentManager");
        return new i(requireContext, childFragmentManager, s());
    }

    @androidx.annotation.i
    @k(message = "Override {@link #onCreateNavHostController(NavHostController)} to gain\n      access to the full {@link NavHostController} that is created by this NavHostFragment.")
    protected void t(@l u navController) {
        l0.p(navController, "navController");
        d1 d1Var = navController.get_navigatorProvider();
        Context requireContext = requireContext();
        l0.o(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        l0.o(childFragmentManager, "childFragmentManager");
        d1Var.b(new d(requireContext, childFragmentManager));
        navController.get_navigatorProvider().b(q());
    }

    @androidx.annotation.i
    protected void u(@l q0 navHostController) {
        l0.p(navHostController, "navHostController");
        t(navHostController);
    }
}
