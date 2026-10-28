package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: NestedScrollingParentHelper.java */
/* loaded from: classes3.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    private int f27084a;

    /* renamed from: b, reason: collision with root package name */
    private int f27085b;

    public c1(@androidx.annotation.o0 ViewGroup viewGroup) {
    }

    public int a() {
        return this.f27084a | this.f27085b;
    }

    public void b(@androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i4) {
        c(view, view2, i4, 0);
    }

    public void c(@androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i4, int i5) {
        if (i5 == 1) {
            this.f27085b = i4;
        } else {
            this.f27084a = i4;
        }
    }

    public void d(@androidx.annotation.o0 View view) {
        e(view, 0);
    }

    public void e(@androidx.annotation.o0 View view, int i4) {
        if (i4 == 1) {
            this.f27085b = 0;
        } else {
            this.f27084a = 0;
        }
    }
}
