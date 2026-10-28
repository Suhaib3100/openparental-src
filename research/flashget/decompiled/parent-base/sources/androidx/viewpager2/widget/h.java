package androidx.viewpager2.widget;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.view.View;
import androidx.annotation.o0;
import androidx.core.view.d1;
import androidx.core.view.j3;
import androidx.core.view.x1;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: WindowInsetsApplier.java */
/* loaded from: classes3.dex */
public final class h implements d1 {
    private h() {
    }

    private j3 b(@o0 j3 j3Var) {
        j3 j3Var2 = j3.f27272c;
        return j3Var2.J() != null ? j3Var2 : j3Var.c().b();
    }

    public static boolean c(@o0 ViewPager2 viewPager2) {
        ApplicationInfo applicationInfo = viewPager2.getContext().getApplicationInfo();
        if (Build.VERSION.SDK_INT >= 30 && applicationInfo.targetSdkVersion >= 30) {
            return false;
        }
        x1.k2(viewPager2, new h());
        return true;
    }

    @Override // androidx.core.view.d1
    @o0
    public j3 a(@o0 View view, @o0 j3 j3Var) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        j3 k12 = x1.k1(viewPager2, j3Var);
        if (k12.A()) {
            return k12;
        }
        RecyclerView recyclerView = viewPager2.f35614k;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            x1.p(recyclerView.getChildAt(i4), new j3(k12));
        }
        return b(k12);
    }
}
