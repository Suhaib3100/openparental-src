package com.devspark.progressfragment;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.devspark.progressfragment.b;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: SherlockGridFragment.java */
/* loaded from: classes3.dex */
public class c extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    private final Handler f48366b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f48367c = new a();

    /* renamed from: d, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f48368d = new b();

    /* renamed from: e, reason: collision with root package name */
    private ListAdapter f48369e;

    /* renamed from: f, reason: collision with root package name */
    private GridView f48370f;

    /* renamed from: g, reason: collision with root package name */
    private View f48371g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f48372h;

    /* renamed from: i, reason: collision with root package name */
    private View f48373i;

    /* renamed from: j, reason: collision with root package name */
    private View f48374j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f48375k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f48376l;

    /* compiled from: SherlockGridFragment.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f48370f.focusableViewAvailable(c.this.f48370f);
        }
    }

    /* compiled from: SherlockGridFragment.java */
    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            c.this.t((GridView) adapterView, view, i4, j4);
        }
    }

    private void o() {
        if (this.f48370f != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ᔩ"));
        }
        if (view instanceof GridView) {
            this.f48370f = (GridView) view;
        } else {
            View findViewById = view.findViewById(R.id.empty);
            if (findViewById == null) {
                this.f48372h.setVisibility(8);
            } else if (findViewById instanceof TextView) {
                this.f48372h = (TextView) findViewById;
            } else {
                this.f48371g = findViewById;
            }
            this.f48373i = view.findViewById(b.g.f48004p0);
            this.f48374j = view.findViewById(b.g.T);
            View findViewById2 = view.findViewById(b.g.S);
            if (!(findViewById2 instanceof GridView)) {
                throw new RuntimeException(ProtectedSandApp.s("ᔨ"));
            }
            GridView gridView = (GridView) findViewById2;
            this.f48370f = gridView;
            if (gridView == null) {
                throw new RuntimeException(ProtectedSandApp.s("ᔧ"));
            }
            View view2 = this.f48371g;
            if (view2 != null) {
                gridView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.f48375k;
                if (charSequence != null) {
                    this.f48372h.setText(charSequence);
                    this.f48370f.setEmptyView(this.f48372h);
                }
            }
        }
        this.f48376l = true;
        this.f48370f.setOnItemClickListener(this.f48368d);
        ListAdapter listAdapter = this.f48369e;
        if (listAdapter != null) {
            this.f48369e = null;
            v(listAdapter);
        } else if (this.f48373i != null) {
            x(false, false);
        }
        this.f48366b.post(this.f48367c);
    }

    private void x(boolean z4, boolean z5) {
        o();
        View view = this.f48373i;
        if (view == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ᔪ"));
        }
        if (this.f48376l == z4) {
            return;
        }
        this.f48376l = z4;
        if (z4) {
            if (z5) {
                view.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.fade_out));
                this.f48374j.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.f48374j.clearAnimation();
            }
            this.f48373i.setVisibility(8);
            this.f48374j.setVisibility(0);
            return;
        }
        if (z5) {
            view.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in));
            this.f48374j.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f48374j.clearAnimation();
        }
        this.f48373i.setVisibility(0);
        this.f48374j.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(b.i.D, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f48366b.removeCallbacks(this.f48367c);
        this.f48370f = null;
        this.f48376l = false;
        this.f48374j = null;
        this.f48373i = null;
        this.f48371g = null;
        this.f48372h = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        o();
    }

    public ListAdapter p() {
        return this.f48369e;
    }

    public GridView q() {
        o();
        return this.f48370f;
    }

    public long r() {
        o();
        return this.f48370f.getSelectedItemId();
    }

    public int s() {
        o();
        return this.f48370f.getSelectedItemPosition();
    }

    public void t(GridView gridView, View view, int i4, long j4) {
    }

    public void u(CharSequence charSequence) {
        o();
        TextView textView = this.f48372h;
        if (textView == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ᔪ"));
        }
        textView.setText(charSequence);
        if (this.f48375k == null) {
            this.f48370f.setEmptyView(this.f48372h);
        }
        this.f48375k = charSequence;
    }

    public void v(ListAdapter listAdapter) {
        boolean z4 = this.f48369e != null;
        this.f48369e = listAdapter;
        GridView gridView = this.f48370f;
        if (gridView != null) {
            gridView.setAdapter(listAdapter);
            if (this.f48376l || z4) {
                return;
            }
            x(true, getView().getWindowToken() != null);
        }
    }

    public void w(boolean z4) {
        x(z4, true);
    }

    public void y(boolean z4) {
        x(z4, false);
    }

    public void z(int i4) {
        o();
        this.f48370f.setSelection(i4);
    }
}
