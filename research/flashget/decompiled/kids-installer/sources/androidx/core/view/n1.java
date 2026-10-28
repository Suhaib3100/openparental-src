package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: NestedScrollingParentHelper.java */
/* loaded from: classes.dex */
public class n1 {

    /* renamed from: a, reason: collision with root package name */
    private int f5601a;

    /* renamed from: b, reason: collision with root package name */
    private int f5602b;

    public n1(@androidx.annotation.o0 ViewGroup viewGroup) {
    }

    public int a() {
        return this.f5601a | this.f5602b;
    }

    public void b(@androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i5) {
        c(view, view2, i5, 0);
    }

    public void c(@androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i5, int i6) {
        if (i6 == 1) {
            this.f5602b = i5;
        } else {
            this.f5601a = i5;
        }
    }

    public void d(@androidx.annotation.o0 View view) {
        e(view, 0);
    }

    public void e(@androidx.annotation.o0 View view, int i5) {
        if (i5 == 1) {
            this.f5602b = 0;
        } else {
            this.f5601a = 0;
        }
    }
}
