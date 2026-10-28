package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RequestManagerFragment.java */
@Deprecated
/* loaded from: classes.dex */
public class o extends Fragment {

    /* renamed from: u, reason: collision with root package name */
    private static final String f11909u = ProtectedSandApp.s("ǯ");

    /* renamed from: o, reason: collision with root package name */
    private final com.bumptech.glide.manager.a f11910o;

    /* renamed from: p, reason: collision with root package name */
    private final r f11911p;

    /* renamed from: q, reason: collision with root package name */
    private final Set<o> f11912q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private com.bumptech.glide.l f11913r;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private o f11914s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private Fragment f11915t;

    /* compiled from: RequestManagerFragment.java */
    /* loaded from: classes3.dex */
    private class a implements r {
        a() {
        }

        @Override // com.bumptech.glide.manager.r
        @o0
        public Set<com.bumptech.glide.l> a() {
            Set<o> b6 = o.this.b();
            HashSet hashSet = new HashSet(b6.size());
            for (o oVar : b6) {
                if (oVar.e() != null) {
                    hashSet.add(oVar.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + ProtectedSandApp.s("ᶒ") + o.this + ProtectedSandApp.s("ᶓ");
        }
    }

    public o() {
        this(new com.bumptech.glide.manager.a());
    }

    private void a(o oVar) {
        this.f11912q.add(oVar);
    }

    @q0
    @TargetApi(17)
    private Fragment d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f11915t;
    }

    @TargetApi(17)
    private boolean g(@o0 Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void h(@o0 Activity activity) {
        l();
        o q5 = com.bumptech.glide.b.e(activity).o().q(activity);
        this.f11914s = q5;
        if (equals(q5)) {
            return;
        }
        this.f11914s.a(this);
    }

    private void i(o oVar) {
        this.f11912q.remove(oVar);
    }

    private void l() {
        o oVar = this.f11914s;
        if (oVar != null) {
            oVar.i(this);
            this.f11914s = null;
        }
    }

    @o0
    @TargetApi(17)
    Set<o> b() {
        if (equals(this.f11914s)) {
            return Collections.unmodifiableSet(this.f11912q);
        }
        if (this.f11914s == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (o oVar : this.f11914s.b()) {
            if (g(oVar.getParentFragment())) {
                hashSet.add(oVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @o0
    com.bumptech.glide.manager.a c() {
        return this.f11910o;
    }

    @q0
    public com.bumptech.glide.l e() {
        return this.f11913r;
    }

    @o0
    public r f() {
        return this.f11911p;
    }

    void j(@q0 Fragment fragment) {
        this.f11915t = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        h(fragment.getActivity());
    }

    public void k(@q0 com.bumptech.glide.l lVar) {
        this.f11913r = lVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException unused) {
            Log.isLoggable(ProtectedSandApp.s("Ǭ"), 5);
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f11910o.c();
        l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f11910o.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f11910o.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + ProtectedSandApp.s("ǭ") + d() + ProtectedSandApp.s("Ǯ");
    }

    @SuppressLint({"ValidFragment"})
    @m1
    o(@o0 com.bumptech.glide.manager.a aVar) {
        this.f11911p = new a();
        this.f11912q = new HashSet();
        this.f11910o = aVar;
    }
}
