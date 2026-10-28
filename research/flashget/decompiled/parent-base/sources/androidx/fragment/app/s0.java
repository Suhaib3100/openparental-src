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

/* compiled from: ListFragment.java */
/* loaded from: classes3.dex */
public class s0 extends Fragment {

    /* renamed from: m, reason: collision with root package name */
    static final int f30070m = 16711681;

    /* renamed from: n, reason: collision with root package name */
    static final int f30071n = 16711682;

    /* renamed from: o, reason: collision with root package name */
    static final int f30072o = 16711683;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f30073b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f30074c = new a();

    /* renamed from: d, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f30075d = new b();

    /* renamed from: e, reason: collision with root package name */
    ListAdapter f30076e;

    /* renamed from: f, reason: collision with root package name */
    ListView f30077f;

    /* renamed from: g, reason: collision with root package name */
    View f30078g;

    /* renamed from: h, reason: collision with root package name */
    TextView f30079h;

    /* renamed from: i, reason: collision with root package name */
    View f30080i;

    /* renamed from: j, reason: collision with root package name */
    View f30081j;

    /* renamed from: k, reason: collision with root package name */
    CharSequence f30082k;

    /* renamed from: l, reason: collision with root package name */
    boolean f30083l;

    /* compiled from: ListFragment.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = s0.this.f30077f;
            listView.focusableViewAvailable(listView);
        }
    }

    /* compiled from: ListFragment.java */
    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            s0.this.s((ListView) adapterView, view, i4, j4);
        }
    }

    private void n() {
        if (this.f30077f != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f30077f = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(f30070m);
            this.f30079h = textView;
            if (textView == null) {
                this.f30078g = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f30080i = view.findViewById(f30071n);
            this.f30081j = view.findViewById(f30072o);
            View findViewById = view.findViewById(R.id.list);
            if (!(findViewById instanceof ListView)) {
                if (findViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) findViewById;
            this.f30077f = listView;
            View view2 = this.f30078g;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.f30082k;
                if (charSequence != null) {
                    this.f30079h.setText(charSequence);
                    this.f30077f.setEmptyView(this.f30079h);
                }
            }
        }
        this.f30083l = true;
        this.f30077f.setOnItemClickListener(this.f30075d);
        ListAdapter listAdapter = this.f30076e;
        if (listAdapter != null) {
            this.f30076e = null;
            v(listAdapter);
        } else if (this.f30080i != null) {
            x(false, false);
        }
        this.f30073b.post(this.f30074c);
    }

    private void x(boolean z4, boolean z5) {
        n();
        View view = this.f30080i;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f30083l == z4) {
            return;
        }
        this.f30083l = z4;
        if (z4) {
            if (z5) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.f30081j.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.f30081j.clearAnimation();
            }
            this.f30080i.setVisibility(8);
            this.f30081j.setVisibility(0);
            return;
        }
        if (z5) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            this.f30081j.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f30081j.clearAnimation();
        }
        this.f30080i.setVisibility(0);
        this.f30081j.setVisibility(8);
    }

    @androidx.annotation.q0
    public ListAdapter o() {
        return this.f30076e;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.q0
    public View onCreateView(@androidx.annotation.o0 LayoutInflater layoutInflater, @androidx.annotation.q0 ViewGroup viewGroup, @androidx.annotation.q0 Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(f30071n);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(f30072o);
        TextView textView = new TextView(requireContext);
        textView.setId(f30070m);
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
        this.f30073b.removeCallbacks(this.f30074c);
        this.f30077f = null;
        this.f30083l = false;
        this.f30081j = null;
        this.f30080i = null;
        this.f30078g = null;
        this.f30079h = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@androidx.annotation.o0 View view, @androidx.annotation.q0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        n();
    }

    @androidx.annotation.o0
    public ListView p() {
        n();
        return this.f30077f;
    }

    public long q() {
        n();
        return this.f30077f.getSelectedItemId();
    }

    public int r() {
        n();
        return this.f30077f.getSelectedItemPosition();
    }

    public void s(@androidx.annotation.o0 ListView listView, @androidx.annotation.o0 View view, int i4, long j4) {
    }

    @androidx.annotation.o0
    public final ListAdapter t() {
        ListAdapter o4 = o();
        if (o4 != null) {
            return o4;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void u(@androidx.annotation.q0 CharSequence charSequence) {
        n();
        TextView textView = this.f30079h;
        if (textView == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.f30082k == null) {
            this.f30077f.setEmptyView(this.f30079h);
        }
        this.f30082k = charSequence;
    }

    public void v(@androidx.annotation.q0 ListAdapter listAdapter) {
        boolean z4 = this.f30076e != null;
        this.f30076e = listAdapter;
        ListView listView = this.f30077f;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f30083l || z4) {
                return;
            }
            x(true, requireView().getWindowToken() != null);
        }
    }

    public void w(boolean z4) {
        x(z4, true);
    }

    public void y(boolean z4) {
        x(z4, false);
    }

    public void z(int i4) {
        n();
        this.f30077f.setSelection(i4);
    }
}
