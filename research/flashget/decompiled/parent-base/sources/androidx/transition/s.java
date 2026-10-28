package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.q;

/* compiled from: Scene.java */
/* loaded from: classes3.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private Context f35197a;

    /* renamed from: b, reason: collision with root package name */
    private int f35198b;

    /* renamed from: c, reason: collision with root package name */
    private ViewGroup f35199c;

    /* renamed from: d, reason: collision with root package name */
    private View f35200d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f35201e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f35202f;

    public s(@androidx.annotation.o0 ViewGroup viewGroup) {
        this.f35198b = -1;
        this.f35199c = viewGroup;
    }

    @androidx.annotation.q0
    public static s c(@androidx.annotation.o0 ViewGroup viewGroup) {
        return (s) viewGroup.getTag(q.g.R1);
    }

    @androidx.annotation.o0
    public static s d(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.j0 int i4, @androidx.annotation.o0 Context context) {
        int i5 = q.g.U1;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i5);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i5, sparseArray);
        }
        s sVar = (s) sparseArray.get(i4);
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(viewGroup, i4, context);
        sparseArray.put(i4, sVar2);
        return sVar2;
    }

    static void g(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 s sVar) {
        viewGroup.setTag(q.g.R1, sVar);
    }

    public void a() {
        if (this.f35198b > 0 || this.f35200d != null) {
            e().removeAllViews();
            if (this.f35198b > 0) {
                LayoutInflater.from(this.f35197a).inflate(this.f35198b, this.f35199c);
            } else {
                this.f35199c.addView(this.f35200d);
            }
        }
        Runnable runnable = this.f35201e;
        if (runnable != null) {
            runnable.run();
        }
        g(this.f35199c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f35199c) != this || (runnable = this.f35202f) == null) {
            return;
        }
        runnable.run();
    }

    @androidx.annotation.o0
    public ViewGroup e() {
        return this.f35199c;
    }

    boolean f() {
        return this.f35198b > 0;
    }

    public void h(@androidx.annotation.q0 Runnable runnable) {
        this.f35201e = runnable;
    }

    public void i(@androidx.annotation.q0 Runnable runnable) {
        this.f35202f = runnable;
    }

    private s(ViewGroup viewGroup, int i4, Context context) {
        this.f35197a = context;
        this.f35199c = viewGroup;
        this.f35198b = i4;
    }

    public s(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.o0 View view) {
        this.f35198b = -1;
        this.f35199c = viewGroup;
        this.f35200d = view;
    }
}
