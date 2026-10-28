package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.c1;
import androidx.annotation.o0;

/* compiled from: NavigationMenu.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class f extends androidx.appcompat.view.menu.h {
    public f(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    @o0
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        androidx.appcompat.view.menu.k kVar = (androidx.appcompat.view.menu.k) a(i4, i5, i6, charSequence);
        h hVar = new h(x(), (androidx.appcompat.view.menu.h) this, kVar);
        kVar.A(hVar);
        return hVar;
    }
}
