package com.bumptech.glide.manager;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.load.resource.bitmap.c0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Map;

/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes3.dex */
public class o implements Handler.Callback {

    /* renamed from: g, reason: collision with root package name */
    @m1
    static final String f44696g = ProtectedSandApp.s("ਲ");

    /* renamed from: h, reason: collision with root package name */
    private static final b f44697h = new a();

    /* renamed from: b, reason: collision with root package name */
    private volatile com.bumptech.glide.n f44698b;

    /* renamed from: c, reason: collision with root package name */
    private final b f44699c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.collection.a<View, Fragment> f44700d = new androidx.collection.a<>();

    /* renamed from: e, reason: collision with root package name */
    private final i f44701e;

    /* renamed from: f, reason: collision with root package name */
    private final l f44702f;

    /* compiled from: RequestManagerRetriever.java */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.manager.o.b
        @o0
        public com.bumptech.glide.n a(@o0 com.bumptech.glide.c cVar, @o0 j jVar, @o0 p pVar, @o0 Context context) {
            return new com.bumptech.glide.n(cVar, jVar, pVar, context);
        }
    }

    /* compiled from: RequestManagerRetriever.java */
    public interface b {
        @o0
        com.bumptech.glide.n a(@o0 com.bumptech.glide.c cVar, @o0 j jVar, @o0 p pVar, @o0 Context context);
    }

    public o(@q0 b bVar) {
        bVar = bVar == null ? f44697h : bVar;
        this.f44699c = bVar;
        this.f44702f = new l(bVar);
        this.f44701e = b();
    }

    @TargetApi(17)
    private static void a(@o0 Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ਲ਼"));
        }
    }

    private static i b() {
        return (c0.f44441g && c0.f44440f) ? new h() : new f();
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

    private static void d(@q0 Collection<Fragment> collection, @o0 Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                d(fragment.getChildFragmentManager().I0(), map);
            }
        }
    }

    @q0
    private Fragment e(@o0 View view, @o0 FragmentActivity fragmentActivity) {
        this.f44700d.clear();
        d(fragmentActivity.getSupportFragmentManager().I0(), this.f44700d);
        View findViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f44700d.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f44700d.clear();
        return fragment;
    }

    @o0
    private com.bumptech.glide.n l(@o0 Context context) {
        if (this.f44698b == null) {
            synchronized (this) {
                try {
                    if (this.f44698b == null) {
                        this.f44698b = this.f44699c.a(com.bumptech.glide.c.e(context.getApplicationContext()), new com.bumptech.glide.manager.a(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f44698b;
    }

    private static boolean m(Context context) {
        Activity c5 = c(context);
        return c5 == null || !c5.isFinishing();
    }

    @o0
    @Deprecated
    public com.bumptech.glide.n f(@o0 Activity activity) {
        return h(activity.getApplicationContext());
    }

    @o0
    @TargetApi(17)
    @Deprecated
    public com.bumptech.glide.n g(@o0 android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            return h(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\u0a34"));
    }

    @o0
    public com.bumptech.glide.n h(@o0 Context context) {
        if (context == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ਵ"));
        }
        if (com.bumptech.glide.util.o.v() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return k((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return h(contextWrapper.getBaseContext());
                }
            }
        }
        return l(context);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    @o0
    public com.bumptech.glide.n i(@o0 View view) {
        if (com.bumptech.glide.util.o.u()) {
            return h(view.getContext().getApplicationContext());
        }
        com.bumptech.glide.util.m.e(view);
        com.bumptech.glide.util.m.f(view.getContext(), ProtectedSandApp.s("ਸ਼"));
        Activity c5 = c(view.getContext());
        if (c5 == null) {
            return h(view.getContext().getApplicationContext());
        }
        if (!(c5 instanceof FragmentActivity)) {
            return h(view.getContext().getApplicationContext());
        }
        FragmentActivity fragmentActivity = (FragmentActivity) c5;
        Fragment e4 = e(view, fragmentActivity);
        return e4 != null ? j(e4) : k(fragmentActivity);
    }

    @o0
    public com.bumptech.glide.n j(@o0 Fragment fragment) {
        com.bumptech.glide.util.m.f(fragment.getContext(), ProtectedSandApp.s("\u0a37"));
        if (com.bumptech.glide.util.o.u()) {
            return h(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f44701e.a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f44702f.b(context, com.bumptech.glide.c.e(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @o0
    public com.bumptech.glide.n k(@o0 FragmentActivity fragmentActivity) {
        if (com.bumptech.glide.util.o.u()) {
            return h(fragmentActivity.getApplicationContext());
        }
        a(fragmentActivity);
        this.f44701e.a(fragmentActivity);
        boolean m4 = m(fragmentActivity);
        return this.f44702f.b(fragmentActivity, com.bumptech.glide.c.e(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), m4);
    }
}
