package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.annotation.q0;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList<b> f8131o;

    /* renamed from: p, reason: collision with root package name */
    private FrameLayout f8132p;

    /* renamed from: q, reason: collision with root package name */
    private Context f8133q;

    /* renamed from: r, reason: collision with root package name */
    private FragmentManager f8134r;

    /* renamed from: s, reason: collision with root package name */
    private int f8135s;

    /* renamed from: t, reason: collision with root package name */
    private TabHost.OnTabChangeListener f8136t;

    /* renamed from: u, reason: collision with root package name */
    private b f8137u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f8138v;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        String f8139o;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @androidx.annotation.o0
        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            return androidx.concurrent.futures.a.a(sb, this.f8139o, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeString(this.f8139o);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f8139o = parcel.readString();
        }
    }

    static class a implements TabHost.TabContentFactory {

        /* renamed from: a, reason: collision with root package name */
        private final Context f8140a;

        public a(Context context) {
            this.f8140a = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.f8140a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        final String f8141a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.o0
        final Class<?> f8142b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        final Bundle f8143c;

        /* renamed from: d, reason: collision with root package name */
        Fragment f8144d;

        b(@androidx.annotation.o0 String str, @androidx.annotation.o0 Class<?> cls, @q0 Bundle bundle) {
            this.f8141a = str;
            this.f8142b = cls;
            this.f8143c = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(@androidx.annotation.o0 Context context) {
        super(context, null);
        this.f8131o = new ArrayList<>();
        f(context, null);
    }

    @q0
    private f0 b(@q0 String str, @q0 f0 f0Var) {
        Fragment fragment;
        b e6 = e(str);
        if (this.f8137u != e6) {
            if (f0Var == null) {
                f0Var = this.f8134r.u();
            }
            b bVar = this.f8137u;
            if (bVar != null && (fragment = bVar.f8144d) != null) {
                f0Var.r(fragment);
            }
            if (e6 != null) {
                Fragment fragment2 = e6.f8144d;
                if (fragment2 == null) {
                    Fragment a6 = this.f8134r.G0().a(this.f8133q.getClassLoader(), e6.f8142b.getName());
                    e6.f8144d = a6;
                    a6.setArguments(e6.f8143c);
                    f0Var.c(this.f8135s, e6.f8144d, e6.f8141a);
                } else {
                    f0Var.l(fragment2);
                }
            }
            this.f8137u = e6;
        }
        return f0Var;
    }

    private void c() {
        if (this.f8132p == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f8135s);
            this.f8132p = frameLayout;
            if (frameLayout != null) {
                return;
            }
            throw new IllegalStateException("No tab content FrameLayout found for id " + this.f8135s);
        }
    }

    private void d(Context context) {
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f8132p = frameLayout2;
            frameLayout2.setId(this.f8135s);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @q0
    private b e(String str) {
        int size = this.f8131o.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f8131o.get(i5);
            if (bVar.f8141a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    private void f(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f8135s = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void a(@androidx.annotation.o0 TabHost.TabSpec tabSpec, @androidx.annotation.o0 Class<?> cls, @q0 Bundle bundle) {
        tabSpec.setContent(new a(this.f8133q));
        String tag = tabSpec.getTag();
        b bVar = new b(tag, cls, bundle);
        if (this.f8138v) {
            Fragment s02 = this.f8134r.s0(tag);
            bVar.f8144d = s02;
            if (s02 != null && !s02.isDetached()) {
                f0 u5 = this.f8134r.u();
                u5.r(bVar.f8144d);
                u5.m();
            }
        }
        this.f8131o.add(bVar);
        addTab(tabSpec);
    }

    @Deprecated
    public void g(@androidx.annotation.o0 Context context, @androidx.annotation.o0 FragmentManager fragmentManager) {
        d(context);
        super.setup();
        this.f8133q = context;
        this.f8134r = fragmentManager;
        c();
    }

    @Deprecated
    public void h(@androidx.annotation.o0 Context context, @androidx.annotation.o0 FragmentManager fragmentManager, int i5) {
        d(context);
        super.setup();
        this.f8133q = context;
        this.f8134r = fragmentManager;
        this.f8135s = i5;
        c();
        this.f8132p.setId(i5);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f8131o.size();
        f0 f0Var = null;
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f8131o.get(i5);
            Fragment s02 = this.f8134r.s0(bVar.f8141a);
            bVar.f8144d = s02;
            if (s02 != null && !s02.isDetached()) {
                if (bVar.f8141a.equals(currentTabTag)) {
                    this.f8137u = bVar;
                } else {
                    if (f0Var == null) {
                        f0Var = this.f8134r.u();
                    }
                    f0Var.r(bVar.f8144d);
                }
            }
        }
        this.f8138v = true;
        f0 b6 = b(currentTabTag, f0Var);
        if (b6 != null) {
            b6.m();
            this.f8134r.n0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8138v = false;
    }

    @Override // android.view.View
    @Deprecated
    protected void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f8139o);
    }

    @Override // android.view.View
    @androidx.annotation.o0
    @Deprecated
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f8139o = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@q0 String str) {
        f0 b6;
        if (this.f8138v && (b6 = b(str, null)) != null) {
            b6.m();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f8136t;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@q0 TabHost.OnTabChangeListener onTabChangeListener) {
        this.f8136t = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public FragmentTabHost(@androidx.annotation.o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8131o = new ArrayList<>();
        f(context, attributeSet);
    }
}
