package com.bumptech.glide.manager;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.x0;
import com.bumptech.glide.load.resource.bitmap.c0;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: FirstFrameWaiter.java */
@x0(26)
/* loaded from: classes3.dex */
final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    final Set<Activity> f44683a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f44684b;

    /* compiled from: FirstFrameWaiter.java */
    class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f44685b;

        /* compiled from: FirstFrameWaiter.java */
        /* renamed from: com.bumptech.glide.manager.h$a$a, reason: collision with other inner class name */
        class RunnableC0750a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f44687b;

            RunnableC0750a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f44687b = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                c0.c().i();
                h.this.f44684b = true;
                h.b(a.this.f44685b, this.f44687b);
                h.this.f44683a.clear();
            }
        }

        a(View view) {
            this.f44685b = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            com.bumptech.glide.util.o.y(new RunnableC0750a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // com.bumptech.glide.manager.i
    public void a(Activity activity) {
        if (!this.f44684b && this.f44683a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
