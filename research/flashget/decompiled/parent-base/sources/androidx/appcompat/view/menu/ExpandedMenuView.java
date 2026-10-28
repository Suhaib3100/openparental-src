package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.t0;

@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements h.b, p, AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f1140d = {R.attr.background, R.attr.divider};

    /* renamed from: b, reason: collision with root package name */
    private h f1141b;

    /* renamed from: c, reason: collision with root package name */
    private int f1142c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.p
    public void a(h hVar) {
        this.f1141b = hVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public int d() {
        return this.f1142c;
    }

    @Override // androidx.appcompat.view.menu.h.b
    public boolean f(k kVar) {
        return this.f1141b.O(kVar, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        f((k) getAdapter().getItem(i4));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        t0 G = t0.G(context, attributeSet, f1140d, i4, 0);
        if (G.C(0)) {
            setBackgroundDrawable(G.h(0));
        }
        if (G.C(1)) {
            setDivider(G.h(1));
        }
        G.I();
    }
}
