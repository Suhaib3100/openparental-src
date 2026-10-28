package com.ethanhua.skeleton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.g0;
import androidx.annotation.j0;
import androidx.annotation.n;
import com.ethanhua.skeleton.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import io.supercharge.shimmerlayout.ShimmerLayout;

/* compiled from: ViewSkeletonScreen.java */
/* loaded from: classes3.dex */
public class i implements g {

    /* renamed from: h, reason: collision with root package name */
    private static final String f49116h = ProtectedSandApp.s("ᔵ");

    /* renamed from: a, reason: collision with root package name */
    private final h f49117a;

    /* renamed from: b, reason: collision with root package name */
    private final View f49118b;

    /* renamed from: c, reason: collision with root package name */
    private final int f49119c;

    /* renamed from: d, reason: collision with root package name */
    private final int f49120d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f49121e;

    /* renamed from: f, reason: collision with root package name */
    private final int f49122f;

    /* renamed from: g, reason: collision with root package name */
    private final int f49123g;

    /* compiled from: ViewSkeletonScreen.java */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShimmerLayout f49124b;

        a(ShimmerLayout shimmerLayout) {
            this.f49124b = shimmerLayout;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f49124b.w();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f49124b.x();
        }
    }

    /* compiled from: ViewSkeletonScreen.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final View f49126a;

        /* renamed from: b, reason: collision with root package name */
        private int f49127b;

        /* renamed from: d, reason: collision with root package name */
        private int f49129d;

        /* renamed from: c, reason: collision with root package name */
        private boolean f49128c = true;

        /* renamed from: e, reason: collision with root package name */
        private int f49130e = 1000;

        /* renamed from: f, reason: collision with root package name */
        private int f49131f = 20;

        public b(View view) {
            this.f49126a = view;
            this.f49129d = androidx.core.content.d.getColor(view.getContext(), b.d.f48597y0);
        }

        public b g(@g0(from = 0, to = 30) int i4) {
            this.f49131f = i4;
            return this;
        }

        public b h(@n int i4) {
            this.f49129d = androidx.core.content.d.getColor(this.f49126a.getContext(), i4);
            return this;
        }

        public b i(int i4) {
            this.f49130e = i4;
            return this;
        }

        public b j(@j0 int i4) {
            this.f49127b = i4;
            return this;
        }

        public b k(boolean z4) {
            this.f49128c = z4;
            return this;
        }

        public i l() {
            i iVar = new i(this, null);
            iVar.b();
            return iVar;
        }
    }

    /* synthetic */ i(b bVar, a aVar) {
        this(bVar);
    }

    private ShimmerLayout c(ViewGroup viewGroup) {
        ShimmerLayout shimmerLayout = (ShimmerLayout) LayoutInflater.from(this.f49118b.getContext()).inflate(b.i.B, viewGroup, false);
        shimmerLayout.v(this.f49120d);
        shimmerLayout.t(this.f49123g);
        shimmerLayout.u(this.f49122f);
        View inflate = LayoutInflater.from(this.f49118b.getContext()).inflate(this.f49119c, (ViewGroup) shimmerLayout, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams != null) {
            shimmerLayout.setLayoutParams(layoutParams);
        }
        shimmerLayout.addView(inflate);
        shimmerLayout.addOnAttachStateChangeListener(new a(shimmerLayout));
        shimmerLayout.w();
        return shimmerLayout;
    }

    private View d() {
        ViewParent parent = this.f49118b.getParent();
        if (parent == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        return this.f49121e ? c(viewGroup) : LayoutInflater.from(this.f49118b.getContext()).inflate(this.f49119c, viewGroup, false);
    }

    @Override // com.ethanhua.skeleton.g
    public void a() {
        if (this.f49117a.c() instanceof ShimmerLayout) {
            ((ShimmerLayout) this.f49117a.c()).x();
        }
        this.f49117a.g();
    }

    @Override // com.ethanhua.skeleton.g
    public void b() {
        View d5 = d();
        if (d5 != null) {
            this.f49117a.f(d5);
        }
    }

    private i(b bVar) {
        this.f49118b = bVar.f49126a;
        this.f49119c = bVar.f49127b;
        this.f49121e = bVar.f49128c;
        this.f49122f = bVar.f49130e;
        this.f49123g = bVar.f49131f;
        this.f49120d = bVar.f49129d;
        this.f49117a = new h(bVar.f49126a);
    }
}
