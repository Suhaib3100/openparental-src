package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.q0;

/* compiled from: ListFragment.java */
/* loaded from: classes3.dex */
public class k0 extends Fragment {
    static final int A = 16711682;
    static final int B = 16711683;

    /* renamed from: z, reason: collision with root package name */
    static final int f8303z = 16711681;

    /* renamed from: o, reason: collision with root package name */
    private final Handler f8304o = new Handler();

    /* renamed from: p, reason: collision with root package name */
    private final Runnable f8305p = new a();

    /* renamed from: q, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f8306q = new b();

    /* renamed from: r, reason: collision with root package name */
    ListAdapter f8307r;

    /* renamed from: s, reason: collision with root package name */
    ListView f8308s;

    /* renamed from: t, reason: collision with root package name */
    View f8309t;

    /* renamed from: u, reason: collision with root package name */
    TextView f8310u;

    /* renamed from: v, reason: collision with root package name */
    View f8311v;

    /* renamed from: w, reason: collision with root package name */
    View f8312w;

    /* renamed from: x, reason: collision with root package name */
    CharSequence f8313x;

    /* renamed from: y, reason: collision with root package name */
    boolean f8314y;

    /* compiled from: ListFragment.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = k0.this.f8308s;
            listView.focusableViewAvailable(listView);
        }
    }

    /* compiled from: ListFragment.java */
    /* loaded from: classes.dex */
    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
            k0.this.h((ListView) adapterView, view, i5, j5);
        }
    }

    private void a() {
        if (this.f8308s != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f8308s = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(f8303z);
            this.f8310u = textView;
            if (textView == null) {
                this.f8309t = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f8311v = view.findViewById(A);
            this.f8312w = view.findViewById(B);
            View findViewById = view.findViewById(R.id.list);
            if (!(findViewById instanceof ListView)) {
                if (findViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) findViewById;
            this.f8308s = listView;
            View view2 = this.f8309t;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.f8313x;
                if (charSequence != null) {
                    this.f8310u.setText(charSequence);
                    this.f8308s.setEmptyView(this.f8310u);
                }
            }
        }
        this.f8314y = true;
        this.f8308s.setOnItemClickListener(this.f8306q);
        ListAdapter listAdapter = this.f8307r;
        if (listAdapter != null) {
            this.f8307r = null;
            k(listAdapter);
        } else if (this.f8311v != null) {
            m(false, false);
        }
        this.f8304o.post(this.f8305p);
    }

    private void m(boolean z5, boolean z6) {
        a();
        View view = this.f8311v;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f8314y == z5) {
            return;
        }
        this.f8314y = z5;
        if (z5) {
            if (z6) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.f8312w.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.f8312w.clearAnimation();
            }
            this.f8311v.setVisibility(8);
            this.f8312w.setVisibility(0);
            return;
        }
        if (z6) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            this.f8312w.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f8312w.clearAnimation();
        }
        this.f8311v.setVisibility(0);
        this.f8312w.setVisibility(8);
    }

    @q0
    public ListAdapter b() {
        return this.f8307r;
    }

    @androidx.annotation.o0
    public ListView d() {
        a();
        return this.f8308s;
    }

    public long e() {
        a();
        return this.f8308s.getSelectedItemId();
    }

    public int f() {
        a();
        return this.f8308s.getSelectedItemPosition();
    }

    public void h(@androidx.annotation.o0 ListView listView, @androidx.annotation.o0 View view, int i5, long j5) {
    }

    @androidx.annotation.o0
    public final ListAdapter i() {
        ListAdapter b6 = b();
        if (b6 != null) {
            return b6;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void j(@q0 CharSequence charSequence) {
        a();
        TextView textView = this.f8310u;
        if (textView == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.f8313x == null) {
            this.f8308s.setEmptyView(this.f8310u);
        }
        this.f8313x = charSequence;
    }

    public void k(@q0 ListAdapter listAdapter) {
        boolean z5 = this.f8307r != null;
        this.f8307r = listAdapter;
        ListView listView = this.f8308s;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f8314y || z5) {
                return;
            }
            m(true, requireView().getWindowToken() != null);
        }
    }

    public void l(boolean z5) {
        m(z5, true);
    }

    public void n(boolean z5) {
        m(z5, false);
    }

    public void o(int i5) {
        a();
        this.f8308s.setSelection(i5);
    }

    @Override // androidx.fragment.app.Fragment
    @q0
    public View onCreateView(@androidx.annotation.o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(A);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(B);
        TextView textView = new TextView(requireContext);
        textView.setId(f8303z);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f8304o.removeCallbacks(this.f8305p);
        this.f8308s = null;
        this.f8314y = false;
        this.f8312w = null;
        this.f8311v = null;
        this.f8309t = null;
        this.f8310u = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@androidx.annotation.o0 View view, @q0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        a();
    }
}
