package com.scwang.smart.refresh.layout.util;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import qc.e;

/* compiled from: DesignUtil.java */
/* loaded from: classes6.dex */
public class a {

    /* compiled from: DesignUtil.java */
    /* renamed from: com.scwang.smart.refresh.layout.util.a$a, reason: collision with other inner class name */
    static class C0991a implements AppBarLayout.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ sc.a f70700a;

        C0991a(sc.a aVar) {
            this.f70700a = aVar;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.d, com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, int i4) {
            this.f70700a.a(i4 >= 0, appBarLayout.q() + i4 <= 0);
        }
    }

    public static void a(View view, e eVar, sc.a aVar) {
        try {
            if (view instanceof CoordinatorLayout) {
                eVar.n().W(false);
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        ((AppBarLayout) childAt).c(new C0991a(aVar));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
