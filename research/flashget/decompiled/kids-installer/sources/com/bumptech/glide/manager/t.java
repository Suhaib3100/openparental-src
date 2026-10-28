package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SupportRequestManagerFragment.java */
/* loaded from: classes3.dex */
public class t extends Fragment {

    /* renamed from: u, reason: collision with root package name */
    private static final String f11936u = ProtectedSandApp.s("ᶙ");

    /* renamed from: o, reason: collision with root package name */
    private final com.bumptech.glide.manager.a f11937o;

    /* renamed from: p, reason: collision with root package name */
    private final r f11938p;

    /* renamed from: q, reason: collision with root package name */
    private final Set<t> f11939q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private t f11940r;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private com.bumptech.glide.l f11941s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private Fragment f11942t;

    /* compiled from: SupportRequestManagerFragment.java */
    private class a implements r {
        a() {
        }

        @Override // com.bumptech.glide.manager.r
        @o0
        public Set<com.bumptech.glide.l> a() {
            Set<t> b6 = t.this.b();
            HashSet hashSet = new HashSet(b6.size());
            for (t tVar : b6) {
                if (tVar.f() != null) {
                    hashSet.add(tVar.f());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + ProtectedSandApp.s("ᶔ") + t.this + ProtectedSandApp.s("ᶕ");
        }
    }

    public t() {
        this(new com.bumptech.glide.manager.a());
    }

    private void a(t tVar) {
        this.f11939q.add(tVar);
    }

    @q0
    private Fragment e() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f11942t;
    }

    @q0
    private static FragmentManager i(@o0 Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    private boolean j(@o0 Fragment fragment) {
        Fragment e6 = e();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(e6)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void k(@o0 Context context, @o0 FragmentManager fragmentManager) {
        o();
        t s5 = com.bumptech.glide.b.e(context).o().s(fragmentManager);
        this.f11940r = s5;
        if (equals(s5)) {
            return;
        }
        this.f11940r.a(this);
    }

    private void l(t tVar) {
        this.f11939q.remove(tVar);
    }

    private void o() {
        t tVar = this.f11940r;
        if (tVar != null) {
            tVar.l(this);
            this.f11940r = null;
        }
    }

    @o0
    Set<t> b() {
        t tVar = this.f11940r;
        if (tVar == null) {
            return Collections.emptySet();
        }
        if (equals(tVar)) {
            return Collections.unmodifiableSet(this.f11939q);
        }
        HashSet hashSet = new HashSet();
        for (t tVar2 : this.f11940r.b()) {
            if (j(tVar2.e())) {
                hashSet.add(tVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @o0
    com.bumptech.glide.manager.a d() {
        return this.f11937o;
    }

    @q0
    public com.bumptech.glide.l f() {
        return this.f11941s;
    }

    @o0
    public r h() {
        return this.f11938p;
    }

    void m(@q0 Fragment fragment) {
        FragmentManager i5;
        this.f11942t = fragment;
        if (fragment == null || fragment.getContext() == null || (i5 = i(fragment)) == null) {
            return;
        }
        k(fragment.getContext(), i5);
    }

    public void n(@q0 com.bumptech.glide.l lVar) {
        this.f11941s = lVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager i5 = i(this);
        String s5 = ProtectedSandApp.s("ᶖ");
        if (i5 == null) {
            Log.isLoggable(s5, 5);
            return;
        }
        try {
            k(getContext(), i5);
        } catch (IllegalStateException unused) {
            Log.isLoggable(s5, 5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f11937o.c();
        o();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f11942t = null;
        o();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f11937o.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f11937o.e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + ProtectedSandApp.s("ᶗ") + e() + ProtectedSandApp.s("ᶘ");
    }

    @SuppressLint({"ValidFragment"})
    @m1
    public t(@o0 com.bumptech.glide.manager.a aVar) {
        this.f11938p = new a();
        this.f11939q = new HashSet();
        this.f11937o = aVar;
    }
}
