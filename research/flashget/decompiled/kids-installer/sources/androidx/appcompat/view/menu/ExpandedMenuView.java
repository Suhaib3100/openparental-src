package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.z0;

@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class ExpandedMenuView extends ListView implements g.b, o, AdapterView.OnItemClickListener {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f611q = {R.attr.background, R.attr.divider};

    /* renamed from: o, reason: collision with root package name */
    private g f612o;

    /* renamed from: p, reason: collision with root package name */
    private int f613p;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(j jVar) {
        return this.f612o.O(jVar, 0);
    }

    @Override // androidx.appcompat.view.menu.o
    public void e(g gVar) {
        this.f612o = gVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public int h() {
        return this.f613p;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i5, long j5) {
        a((j) getAdapter().getItem(i5));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        z0 G = z0.G(context, attributeSet, f611q, i5, 0);
        if (G.C(0)) {
            setBackgroundDrawable(G.h(0));
        }
        if (G.C(1)) {
            setDivider(G.h(1));
        }
        G.I();
    }
}
