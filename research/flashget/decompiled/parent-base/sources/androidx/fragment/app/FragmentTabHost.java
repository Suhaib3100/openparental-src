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
import java.util.ArrayList;

@Deprecated
/* loaded from: classes3.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f29856b;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f29857c;

    /* renamed from: d, reason: collision with root package name */
    private Context f29858d;

    /* renamed from: e, reason: collision with root package name */
    private FragmentManager f29859e;

    /* renamed from: f, reason: collision with root package name */
    private int f29860f;

    /* renamed from: g, reason: collision with root package name */
    private TabHost.OnTabChangeListener f29861g;

    /* renamed from: h, reason: collision with root package name */
    private b f29862h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f29863i;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        String f29864b;

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
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
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
            return android.support.v4.media.c.a(sb, this.f29864b, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeString(this.f29864b);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f29864b = parcel.readString();
        }
    }

    static class a implements TabHost.TabContentFactory {

        /* renamed from: a, reason: collision with root package name */
        private final Context f29865a;

        public a(Context context) {
            this.f29865a = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.f29865a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        final String f29866a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.o0
        final Class<?> f29867b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        final Bundle f29868c;

        /* renamed from: d, reason: collision with root package name */
        Fragment f29869d;

        b(@androidx.annotation.o0 String str, @androidx.annotation.o0 Class<?> cls, @androidx.annotation.q0 Bundle bundle) {
            this.f29866a = str;
            this.f29867b = cls;
            this.f29868c = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(@androidx.annotation.o0 Context context) {
        super(context, null);
        this.f29856b = new ArrayList<>();
        f(context, null);
    }

    @androidx.annotation.q0
    private l0 b(@androidx.annotation.q0 String str, @androidx.annotation.q0 l0 l0Var) {
        Fragment fragment;
        b e4 = e(str);
        if (this.f29862h != e4) {
            if (l0Var == null) {
                l0Var = this.f29859e.u();
            }
            b bVar = this.f29862h;
            if (bVar != null && (fragment = bVar.f29869d) != null) {
                l0Var.w(fragment);
            }
            if (e4 != null) {
                Fragment fragment2 = e4.f29869d;
                if (fragment2 == null) {
                    Fragment instantiate = this.f29859e.G0().instantiate(this.f29858d.getClassLoader(), e4.f29867b.getName());
                    e4.f29869d = instantiate;
                    instantiate.setArguments(e4.f29868c);
                    l0Var.h(this.f29860f, e4.f29869d, e4.f29866a);
                } else {
                    l0Var.q(fragment2);
                }
            }
            this.f29862h = e4;
        }
        return l0Var;
    }

    private void c() {
        if (this.f29857c == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f29860f);
            this.f29857c = frameLayout;
            if (frameLayout != null) {
                return;
            }
            throw new IllegalStateException("No tab content FrameLayout found for id " + this.f29860f);
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
            this.f29857c = frameLayout2;
            frameLayout2.setId(this.f29860f);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @androidx.annotation.q0
    private b e(String str) {
        int size = this.f29856b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = this.f29856b.get(i4);
            if (bVar.f29866a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    private void f(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f29860f = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void a(@androidx.annotation.o0 TabHost.TabSpec tabSpec, @androidx.annotation.o0 Class<?> cls, @androidx.annotation.q0 Bundle bundle) {
        tabSpec.setContent(new a(this.f29858d));
        String tag = tabSpec.getTag();
        b bVar = new b(tag, cls, bundle);
        if (this.f29863i) {
            Fragment s02 = this.f29859e.s0(tag);
            bVar.f29869d = s02;
            if (s02 != null && !s02.isDetached()) {
                l0 u4 = this.f29859e.u();
                u4.w(bVar.f29869d);
                u4.r();
            }
        }
        this.f29856b.add(bVar);
        addTab(tabSpec);
    }

    @Deprecated
    public void g(@androidx.annotation.o0 Context context, @androidx.annotation.o0 FragmentManager fragmentManager) {
        d(context);
        super.setup();
        this.f29858d = context;
        this.f29859e = fragmentManager;
        c();
    }

    @Deprecated
    public void h(@androidx.annotation.o0 Context context, @androidx.annotation.o0 FragmentManager fragmentManager, int i4) {
        d(context);
        super.setup();
        this.f29858d = context;
        this.f29859e = fragmentManager;
        this.f29860f = i4;
        c();
        this.f29857c.setId(i4);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f29856b.size();
        l0 l0Var = null;
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = this.f29856b.get(i4);
            Fragment s02 = this.f29859e.s0(bVar.f29866a);
            bVar.f29869d = s02;
            if (s02 != null && !s02.isDetached()) {
                if (bVar.f29866a.equals(currentTabTag)) {
                    this.f29862h = bVar;
                } else {
                    if (l0Var == null) {
                        l0Var = this.f29859e.u();
                    }
                    l0Var.w(bVar.f29869d);
                }
            }
        }
        this.f29863i = true;
        l0 b5 = b(currentTabTag, l0Var);
        if (b5 != null) {
            b5.r();
            this.f29859e.n0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29863i = false;
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
        setCurrentTabByTag(savedState.f29864b);
    }

    @Override // android.view.View
    @androidx.annotation.o0
    @Deprecated
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f29864b = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@androidx.annotation.q0 String str) {
        l0 b5;
        if (this.f29863i && (b5 = b(str, null)) != null) {
            b5.r();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f29861g;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@androidx.annotation.q0 TabHost.OnTabChangeListener onTabChangeListener) {
        this.f29861g = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public FragmentTabHost(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29856b = new ArrayList<>();
        f(context, attributeSet);
    }
}
