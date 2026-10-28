package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.c1;
import androidx.annotation.o0;

/* compiled from: NavigationMenu.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class f extends androidx.appcompat.view.menu.g {
    public f(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    @o0
    public SubMenu addSubMenu(int i5, int i6, int i7, CharSequence charSequence) {
        androidx.appcompat.view.menu.j jVar = (androidx.appcompat.view.menu.j) a(i5, i6, i7, charSequence);
        h hVar = new h(x(), this, jVar);
        jVar.A(hVar);
        return hVar;
    }
}
