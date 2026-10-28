package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.c1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class NavigationMenuView extends RecyclerView implements androidx.appcompat.view.menu.p {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.view.menu.p
    public void a(androidx.appcompat.view.menu.h hVar) {
    }

    @Override // androidx.appcompat.view.menu.p
    public int d() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
