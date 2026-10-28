package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.s;

/* compiled from: Scene.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private Context f10072a;

    /* renamed from: b, reason: collision with root package name */
    private int f10073b;

    /* renamed from: c, reason: collision with root package name */
    private ViewGroup f10074c;

    /* renamed from: d, reason: collision with root package name */
    private View f10075d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f10076e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f10077f;

    public u(@androidx.annotation.o0 ViewGroup viewGroup) {
        this.f10073b = -1;
        this.f10074c = viewGroup;
    }

    @androidx.annotation.q0
    public static u c(@androidx.annotation.o0 ViewGroup viewGroup) {
        return (u) viewGroup.getTag(s.e.H);
    }

    @androidx.annotation.o0
    public static u d(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.j0 int i5, @androidx.annotation.o0 Context context) {
        int i6 = s.e.K;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i6);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i6, sparseArray);
        }
        u uVar = (u) sparseArray.get(i5);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(viewGroup, i5, context);
        sparseArray.put(i5, uVar2);
        return uVar2;
    }

    static void g(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 u uVar) {
        viewGroup.setTag(s.e.H, uVar);
    }

    public void a() {
        if (this.f10073b > 0 || this.f10075d != null) {
            e().removeAllViews();
            if (this.f10073b > 0) {
                LayoutInflater.from(this.f10072a).inflate(this.f10073b, this.f10074c);
            } else {
                this.f10074c.addView(this.f10075d);
            }
        }
        Runnable runnable = this.f10076e;
        if (runnable != null) {
            runnable.run();
        }
        g(this.f10074c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f10074c) != this || (runnable = this.f10077f) == null) {
            return;
        }
        runnable.run();
    }

    @androidx.annotation.o0
    public ViewGroup e() {
        return this.f10074c;
    }

    boolean f() {
        return this.f10073b > 0;
    }

    public void h(@androidx.annotation.q0 Runnable runnable) {
        this.f10076e = runnable;
    }

    public void i(@androidx.annotation.q0 Runnable runnable) {
        this.f10077f = runnable;
    }

    private u(ViewGroup viewGroup, int i5, Context context) {
        this.f10072a = context;
        this.f10074c = viewGroup;
        this.f10073b = i5;
    }

    public u(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.o0 View view) {
        this.f10073b = -1;
        this.f10074c = viewGroup;
        this.f10075d = view;
    }
}
