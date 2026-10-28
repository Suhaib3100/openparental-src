package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.widget.t0;
import androidx.core.content.d;
import com.google.android.material.internal.n;
import com.google.android.material.navigation.NavigationBarView;
import s8.a;

/* loaded from: classes6.dex */
public class BottomNavigationView extends NavigationBarView {

    /* renamed from: n, reason: collision with root package name */
    static final int f52748n = 5;

    @Deprecated
    public interface a extends NavigationBarView.d {
    }

    @Deprecated
    public interface b extends NavigationBarView.e {
    }

    public BottomNavigationView(@o0 Context context) {
        this(context, null);
    }

    private void M(@o0 Context context) {
        View view = new View(context);
        view.setBackgroundColor(d.getColor(context, a.e.U));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(a.f.Z0)));
        addView(view);
    }

    private boolean R() {
        return false;
    }

    public boolean N() {
        return ((com.google.android.material.bottomnavigation.b) s()).Q();
    }

    public void O(boolean z4) {
        com.google.android.material.bottomnavigation.b bVar = (com.google.android.material.bottomnavigation.b) s();
        if (bVar.Q() != z4) {
            bVar.R(z4);
            u().k(false);
        }
    }

    @Deprecated
    public void P(@q0 a aVar) {
        J(aVar);
    }

    @Deprecated
    public void Q(@q0 b bVar) {
        K(bVar);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @c1({c1.a.LIBRARY_GROUP})
    @o0
    protected com.google.android.material.navigation.c e(@o0 Context context) {
        return new com.google.android.material.bottomnavigation.b(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int p() {
        return 5;
    }

    public BottomNavigationView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.L0);
    }

    public BottomNavigationView(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, a.n.f91447ta);
    }

    public BottomNavigationView(@o0 Context context, @q0 AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        t0 k4 = n.k(getContext(), attributeSet, a.o.z4, i4, i5, new int[0]);
        O(k4.a(a.o.A4, true));
        k4.I();
    }
}
