package androidx.content.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.i;
import androidx.content.fragment.NavHostFragment;
import androidx.content.fragment.m;
import androidx.content.i1;
import androidx.core.view.x1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.view.InterfaceC1423e0;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.c0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: AbstractListDetailFragment.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001f\u0010\u001dR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0011\u0010.\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00100\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b/\u0010\u0017¨\u00062"}, d2 = {"Landroidx/navigation/fragment/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/k2;", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "r", "Landroidx/navigation/fragment/NavHostFragment;", "q", "()Landroidx/navigation/fragment/NavHostFragment;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "s", "onViewStateRestored", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroidx/activity/c0;", "b", "Landroidx/activity/c0;", "onBackPressedCallback", "c", "Landroidx/navigation/fragment/NavHostFragment;", "_detailPaneNavHostFragment", "", "d", "I", "graphId", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "p", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "o", "detailPaneNavHostFragment", "a", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a extends Fragment {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private c0 onBackPressedCallback;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private NavHostFragment _detailPaneNavHostFragment;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int graphId;

    /* compiled from: AbstractListDetailFragment.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/navigation/fragment/a$a;", "Landroidx/activity/c0;", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout$e;", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "<init>", "(Landroidx/slidingpanelayout/widget/SlidingPaneLayout;)V", "Lkotlin/k2;", "handleOnBackPressed", "()V", "Landroid/view/View;", "panel", "", "slideOffset", "c", "(Landroid/view/View;F)V", "a", "(Landroid/view/View;)V", "b", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.navigation.fragment.a$a, reason: collision with other inner class name */
    private static final class C0516a extends c0 implements SlidingPaneLayout.e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final SlidingPaneLayout slidingPaneLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0516a(@l SlidingPaneLayout slidingPaneLayout) {
            super(true);
            l0.p(slidingPaneLayout, "slidingPaneLayout");
            this.slidingPaneLayout = slidingPaneLayout;
            slidingPaneLayout.a(this);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void a(@l View panel) {
            l0.p(panel, "panel");
            setEnabled(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void b(@l View panel) {
            l0.p(panel, "panel");
            setEnabled(false);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.e
        public void c(@l View panel, float slideOffset) {
            l0.p(panel, "panel");
        }

        @Override // androidx.view.c0
        public void handleOnBackPressed() {
            this.slidingPaneLayout.d();
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011¸\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lkotlin/k2;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "androidx/core/view/f2$e", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SlidingPaneLayout f31091c;

        public b(SlidingPaneLayout slidingPaneLayout) {
            this.f31091c = slidingPaneLayout;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@l View view, int left, int top2, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            l0.q(view, "view");
            view.removeOnLayoutChangeListener(this);
            c0 c0Var = a.this.onBackPressedCallback;
            l0.m(c0Var);
            c0Var.setEnabled(this.f31091c.t() && this.f31091c.isOpen());
        }
    }

    @l
    public final NavHostFragment o() {
        NavHostFragment navHostFragment = this._detailPaneNavHostFragment;
        if (navHostFragment != null) {
            if (navHostFragment != null) {
                return navHostFragment;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        }
        throw new IllegalStateException(("Fragment " + this + " was called before onCreateView().").toString());
    }

    @Override // androidx.fragment.app.Fragment
    @l
    @i
    public final View onCreateView(@l LayoutInflater inflater, @m ViewGroup container, @m Bundle savedInstanceState) {
        NavHostFragment q4;
        l0.p(inflater, "inflater");
        if (savedInstanceState != null) {
            this.graphId = savedInstanceState.getInt("android-support-nav:fragment:graphId");
        }
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(inflater.getContext(), null);
        slidingPaneLayout.setId(m.c.f31118c);
        View r4 = r(inflater, slidingPaneLayout, savedInstanceState);
        if (!l0.g(r4, slidingPaneLayout) && !l0.g(r4.getParent(), slidingPaneLayout)) {
            slidingPaneLayout.addView(r4);
        }
        Context context = inflater.getContext();
        l0.o(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i4 = m.c.f31117b;
        fragmentContainerView.setId(i4);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(inflater.getContext().getResources().getDimensionPixelSize(m.b.f31115a), -1);
        layoutParams.f34049a = 1.0f;
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        Fragment r02 = getChildFragmentManager().r0(i4);
        if (r02 != null) {
            q4 = (NavHostFragment) r02;
        } else {
            q4 = q();
            FragmentManager childFragmentManager = getChildFragmentManager();
            l0.o(childFragmentManager, "childFragmentManager");
            androidx.fragment.app.l0 u4 = childFragmentManager.u();
            l0.o(u4, "beginTransaction()");
            u4.R(true);
            u4.g(i4, q4);
            u4.r();
        }
        this._detailPaneNavHostFragment = q4;
        this.onBackPressedCallback = new C0516a(slidingPaneLayout);
        if (!x1.Y0(slidingPaneLayout) || slidingPaneLayout.isLayoutRequested()) {
            slidingPaneLayout.addOnLayoutChangeListener(new b(slidingPaneLayout));
        } else {
            c0 c0Var = this.onBackPressedCallback;
            l0.m(c0Var);
            c0Var.setEnabled(slidingPaneLayout.t() && slidingPaneLayout.isOpen());
        }
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        InterfaceC1423e0 viewLifecycleOwner = getViewLifecycleOwner();
        c0 c0Var2 = this.onBackPressedCallback;
        l0.m(c0Var2);
        onBackPressedDispatcher.i(viewLifecycleOwner, c0Var2);
        return slidingPaneLayout;
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
    }

    @Override // androidx.fragment.app.Fragment
    @i
    public void onSaveInstanceState(@l Bundle outState) {
        l0.p(outState, "outState");
        super.onSaveInstanceState(outState);
        int i4 = this.graphId;
        if (i4 != 0) {
            outState.putInt("android-support-nav:fragment:graphId", i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @i
    public final void onViewCreated(@l View view, @fg.m Bundle savedInstanceState) {
        l0.p(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View listPaneView = ((SlidingPaneLayout) requireView()).getChildAt(0);
        l0.o(listPaneView, "listPaneView");
        s(listPaneView, savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    @i
    public void onViewStateRestored(@fg.m Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        c0 c0Var = this.onBackPressedCallback;
        l0.m(c0Var);
        c0Var.setEnabled(((SlidingPaneLayout) requireView()).t() && ((SlidingPaneLayout) requireView()).isOpen());
    }

    @l
    public final SlidingPaneLayout p() {
        return (SlidingPaneLayout) requireView();
    }

    @l
    public NavHostFragment q() {
        int i4 = this.graphId;
        return i4 != 0 ? NavHostFragment.Companion.c(NavHostFragment.INSTANCE, i4, null, 2, null) : new NavHostFragment();
    }

    @l
    public abstract View r(@l LayoutInflater inflater, @fg.m ViewGroup container, @fg.m Bundle savedInstanceState);

    public void s(@l View view, @fg.m Bundle savedInstanceState) {
        l0.p(view, "view");
    }
}
