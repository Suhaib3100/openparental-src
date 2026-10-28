package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: NavigationBarMenu.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class b extends g {

    @o0
    private final Class<?> Q;
    private final int R;

    public b(@o0 Context context, @o0 Class<?> cls, int i5) {
        super(context);
        this.Q = cls;
        this.R = i5;
    }

    @Override // androidx.appcompat.view.menu.g
    @o0
    protected MenuItem a(int i5, int i6, int i7, @o0 CharSequence charSequence) {
        if (size() + 1 <= this.R) {
            m0();
            MenuItem a6 = super.a(i5, i6, i7, charSequence);
            if (a6 instanceof j) {
                ((j) a6).w(true);
            }
            l0();
            return a6;
        }
        String simpleName = this.Q.getSimpleName();
        StringBuilder a7 = androidx.appcompat.view.g.a(ProtectedSandApp.s("✊"), simpleName, ProtectedSandApp.s("✋"));
        a7.append(this.R);
        a7.append(ProtectedSandApp.s("✌"));
        a7.append(simpleName);
        a7.append(ProtectedSandApp.s("✍"));
        throw new IllegalArgumentException(a7.toString());
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    @o0
    public SubMenu addSubMenu(int i5, int i6, int i7, @o0 CharSequence charSequence) {
        throw new UnsupportedOperationException(this.Q.getSimpleName().concat(ProtectedSandApp.s("✎")));
    }

    public int n0() {
        return this.R;
    }
}
