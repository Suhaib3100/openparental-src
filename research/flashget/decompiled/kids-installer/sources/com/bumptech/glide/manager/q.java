package com.bumptech.glide.manager;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.c;
import com.bumptech.glide.load.resource.bitmap.b0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes.dex */
public class q implements Handler.Callback {

    /* renamed from: l, reason: collision with root package name */
    private static final int f11919l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f11920m = 2;

    /* renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.l f11923a;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f11926d;

    /* renamed from: e, reason: collision with root package name */
    private final b f11927e;

    /* renamed from: i, reason: collision with root package name */
    private final k f11931i;

    /* renamed from: j, reason: collision with root package name */
    @m1
    static final String f11917j = ProtectedSandApp.s("ǰ");

    /* renamed from: k, reason: collision with root package name */
    private static final String f11918k = ProtectedSandApp.s("Ǳ");

    /* renamed from: n, reason: collision with root package name */
    private static final String f11921n = ProtectedSandApp.s("ǲ");

    /* renamed from: o, reason: collision with root package name */
    private static final b f11922o = new a();

    /* renamed from: b, reason: collision with root package name */
    @m1
    final Map<FragmentManager, o> f11924b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    @m1
    final Map<androidx.fragment.app.FragmentManager, t> f11925c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final androidx.collection.a<View, Fragment> f11928f = new androidx.collection.a<>();

    /* renamed from: g, reason: collision with root package name */
    private final androidx.collection.a<View, android.app.Fragment> f11929g = new androidx.collection.a<>();

    /* renamed from: h, reason: collision with root package name */
    private final Bundle f11930h = new Bundle();

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes3.dex */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.manager.q.b
        @o0
        public com.bumptech.glide.l a(@o0 com.bumptech.glide.b bVar, @o0 l lVar, @o0 r rVar, @o0 Context context) {
            return new com.bumptech.glide.l(bVar, lVar, rVar, context);
        }
    }

    /* compiled from: RequestManagerRetriever.java */
    public interface b {
        @o0
        com.bumptech.glide.l a(@o0 com.bumptech.glide.b bVar, @o0 l lVar, @o0 r rVar, @o0 Context context);
    }

    public q(@q0 b bVar, com.bumptech.glide.e eVar) {
        this.f11927e = bVar == null ? f11922o : bVar;
        this.f11926d = new Handler(Looper.getMainLooper(), this);
        this.f11931i = b(eVar);
    }

    @TargetApi(17)
    private static void a(@o0 Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ǳ"));
        }
    }

    private static k b(com.bumptech.glide.e eVar) {
        return (b0.f11680i && b0.f11679h) ? eVar.b(c.f.class) ? new i() : new j() : new g();
    }

    @q0
    private static Activity c(@o0 Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(26)
    @Deprecated
    private void d(@o0 FragmentManager fragmentManager, @o0 androidx.collection.a<View, android.app.Fragment> aVar) {
        List<android.app.Fragment> fragments;
        if (Build.VERSION.SDK_INT < 26) {
            e(fragmentManager, aVar);
            return;
        }
        fragments = fragmentManager.getFragments();
        for (android.app.Fragment fragment : fragments) {
            if (fragment.getView() != null) {
                aVar.put(fragment.getView(), fragment);
                d(fragment.getChildFragmentManager(), aVar);
            }
        }
    }

    @Deprecated
    private void e(@o0 FragmentManager fragmentManager, @o0 androidx.collection.a<View, android.app.Fragment> aVar) {
        android.app.Fragment fragment;
        int i5 = 0;
        while (true) {
            Bundle bundle = this.f11930h;
            int i6 = i5 + 1;
            String s5 = ProtectedSandApp.s("Ǵ");
            bundle.putInt(s5, i5);
            try {
                fragment = fragmentManager.getFragment(this.f11930h, s5);
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                aVar.put(fragment.getView(), fragment);
                d(fragment.getChildFragmentManager(), aVar);
            }
            i5 = i6;
        }
    }

    private static void f(@q0 Collection<Fragment> collection, @o0 Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                f(fragment.getChildFragmentManager().I0(), map);
            }
        }
    }

    @q0
    @Deprecated
    private android.app.Fragment g(@o0 View view, @o0 Activity activity) {
        this.f11929g.clear();
        d(activity.getFragmentManager(), this.f11929g);
        View findViewById = activity.findViewById(R.id.content);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f11929g.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f11929g.clear();
        return fragment;
    }

    @q0
    private Fragment h(@o0 View view, @o0 FragmentActivity fragmentActivity) {
        this.f11928f.clear();
        f(fragmentActivity.Y().I0(), this.f11928f);
        View findViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f11928f.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f11928f.clear();
        return fragment;
    }

    @o0
    @Deprecated
    private com.bumptech.glide.l i(@o0 Context context, @o0 FragmentManager fragmentManager, @q0 android.app.Fragment fragment, boolean z5) {
        o r5 = r(fragmentManager, fragment);
        com.bumptech.glide.l e6 = r5.e();
        if (e6 == null) {
            e6 = this.f11927e.a(com.bumptech.glide.b.e(context), r5.c(), r5.f(), context);
            if (z5) {
                e6.onStart();
            }
            r5.k(e6);
        }
        return e6;
    }

    @o0
    private com.bumptech.glide.l p(@o0 Context context) {
        if (this.f11923a == null) {
            synchronized (this) {
                if (this.f11923a == null) {
                    this.f11923a = this.f11927e.a(com.bumptech.glide.b.e(context.getApplicationContext()), new com.bumptech.glide.manager.b(), new h(), context.getApplicationContext());
                }
            }
        }
        return this.f11923a;
    }

    @o0
    private o r(@o0 FragmentManager fragmentManager, @q0 android.app.Fragment fragment) {
        String s5 = ProtectedSandApp.s("ǵ");
        o oVar = (o) fragmentManager.findFragmentByTag(s5);
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = this.f11924b.get(fragmentManager);
        if (oVar2 != null) {
            return oVar2;
        }
        o oVar3 = new o();
        oVar3.j(fragment);
        this.f11924b.put(fragmentManager, oVar3);
        fragmentManager.beginTransaction().add(oVar3, s5).commitAllowingStateLoss();
        this.f11926d.obtainMessage(1, fragmentManager).sendToTarget();
        return oVar3;
    }

    @o0
    private t t(@o0 androidx.fragment.app.FragmentManager fragmentManager, @q0 Fragment fragment) {
        String s5 = ProtectedSandApp.s("Ƕ");
        t tVar = (t) fragmentManager.s0(s5);
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = this.f11925c.get(fragmentManager);
        if (tVar2 != null) {
            return tVar2;
        }
        t tVar3 = new t();
        tVar3.m(fragment);
        this.f11925c.put(fragmentManager, tVar3);
        fragmentManager.u().g(tVar3, s5).n();
        this.f11926d.obtainMessage(2, fragmentManager).sendToTarget();
        return tVar3;
    }

    private static boolean u(Context context) {
        Activity c6 = c(context);
        return c6 == null || !c6.isFinishing();
    }

    @o0
    private com.bumptech.glide.l v(@o0 Context context, @o0 androidx.fragment.app.FragmentManager fragmentManager, @q0 Fragment fragment, boolean z5) {
        t t5 = t(fragmentManager, fragment);
        com.bumptech.glide.l f6 = t5.f();
        if (f6 == null) {
            f6 = this.f11927e.a(com.bumptech.glide.b.e(context), t5.d(), t5.h(), context);
            if (z5) {
                f6.onStart();
            }
            t5.n(f6);
        }
        return f6;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        ComponentCallbacks remove;
        Object obj2;
        ComponentCallbacks componentCallbacks;
        int i5 = message.what;
        boolean z5 = true;
        if (i5 == 1) {
            obj = (FragmentManager) message.obj;
            remove = this.f11924b.remove(obj);
        } else {
            if (i5 != 2) {
                componentCallbacks = null;
                z5 = false;
                obj2 = null;
                if (z5 && componentCallbacks == null && Log.isLoggable(ProtectedSandApp.s("Ƿ"), 5)) {
                    Objects.toString(obj2);
                }
                return z5;
            }
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            remove = this.f11925c.remove(obj);
        }
        ComponentCallbacks componentCallbacks2 = remove;
        obj2 = obj;
        componentCallbacks = componentCallbacks2;
        if (z5) {
            Objects.toString(obj2);
        }
        return z5;
    }

    @o0
    public com.bumptech.glide.l j(@o0 Activity activity) {
        if (com.bumptech.glide.util.n.t()) {
            return l(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return o((FragmentActivity) activity);
        }
        a(activity);
        this.f11931i.a(activity);
        return i(activity, activity.getFragmentManager(), null, u(activity));
    }

    @o0
    @TargetApi(17)
    @Deprecated
    public com.bumptech.glide.l k(@o0 android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ǹ"));
        }
        if (com.bumptech.glide.util.n.t()) {
            return l(fragment.getActivity().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f11931i.a(fragment.getActivity());
        }
        return i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @o0
    public com.bumptech.glide.l l(@o0 Context context) {
        if (context == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ǹ"));
        }
        if (com.bumptech.glide.util.n.u() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return o((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return j((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return l(contextWrapper.getBaseContext());
                }
            }
        }
        return p(context);
    }

    @o0
    public com.bumptech.glide.l m(@o0 View view) {
        if (com.bumptech.glide.util.n.t()) {
            return l(view.getContext().getApplicationContext());
        }
        com.bumptech.glide.util.l.d(view);
        com.bumptech.glide.util.l.e(view.getContext(), ProtectedSandApp.s("Ǻ"));
        Activity c6 = c(view.getContext());
        if (c6 == null) {
            return l(view.getContext().getApplicationContext());
        }
        if (!(c6 instanceof FragmentActivity)) {
            android.app.Fragment g5 = g(view, c6);
            return g5 == null ? j(c6) : k(g5);
        }
        FragmentActivity fragmentActivity = (FragmentActivity) c6;
        Fragment h5 = h(view, fragmentActivity);
        return h5 != null ? n(h5) : o(fragmentActivity);
    }

    @o0
    public com.bumptech.glide.l n(@o0 Fragment fragment) {
        com.bumptech.glide.util.l.e(fragment.getContext(), ProtectedSandApp.s("ǻ"));
        if (com.bumptech.glide.util.n.t()) {
            return l(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f11931i.a(fragment.getActivity());
        }
        return v(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @o0
    public com.bumptech.glide.l o(@o0 FragmentActivity fragmentActivity) {
        if (com.bumptech.glide.util.n.t()) {
            return l(fragmentActivity.getApplicationContext());
        }
        a(fragmentActivity);
        this.f11931i.a(fragmentActivity);
        return v(fragmentActivity, fragmentActivity.Y(), null, u(fragmentActivity));
    }

    @o0
    @Deprecated
    o q(Activity activity) {
        return r(activity.getFragmentManager(), null);
    }

    @o0
    t s(androidx.fragment.app.FragmentManager fragmentManager) {
        return t(fragmentManager, null);
    }
}
