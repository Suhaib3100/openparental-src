package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.appcompat.view.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: NavigationBarMenu.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public final class b extends h {

    @o0
    private final Class<?> Q;
    private final int R;

    public b(@o0 Context context, @o0 Class<?> cls, int i4) {
        super(context);
        this.Q = cls;
        this.R = i4;
    }

    @Override // androidx.appcompat.view.menu.h
    @o0
    protected MenuItem a(int i4, int i5, int i6, @o0 CharSequence charSequence) {
        if (size() + 1 > this.R) {
            String simpleName = this.Q.getSimpleName();
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.a.a(g.a(ProtectedSandApp.s("\uf1f4"), simpleName, ProtectedSandApp.s("\uf1f5")), this.R, ProtectedSandApp.s("\uf1f6"), simpleName, ProtectedSandApp.s("\uf1f7")));
        }
        m0();
        MenuItem a5 = super.a(i4, i5, i6, charSequence);
        if (a5 instanceof k) {
            ((k) a5).w(true);
        }
        l0();
        return a5;
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    @o0
    public SubMenu addSubMenu(int i4, int i5, int i6, @o0 CharSequence charSequence) {
        throw new UnsupportedOperationException(this.Q.getSimpleName().concat(ProtectedSandApp.s("\uf1f8")));
    }

    public int n0() {
        return this.R;
    }
}
