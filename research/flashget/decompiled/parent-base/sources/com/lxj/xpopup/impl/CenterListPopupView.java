package com.lxj.xpopup.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.core.view.f0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lxj.easyadapter.g;
import com.lxj.easyadapter.i;
import com.lxj.xpopup.b;
import com.lxj.xpopup.c;
import com.lxj.xpopup.core.CenterPopupView;
import com.lxj.xpopup.util.h;
import com.lxj.xpopup.widget.CheckView;
import com.lxj.xpopup.widget.VerticalRecyclerView;
import gb.g;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class CenterListPopupView extends CenterPopupView {
    TextView A;
    CharSequence B;
    String[] C;
    int[] D;
    private g E;
    int F;

    /* renamed from: z, reason: collision with root package name */
    RecyclerView f69659z;

    class a extends com.lxj.easyadapter.b<String> {
        a(List arg0, int arg1) {
            super(arg0, arg1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lxj.easyadapter.b
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public void H(@o0 i holder, @o0 String s4, int position) {
            int i4 = b.h.o6;
            holder.c(i4, s4);
            ImageView imageView = (ImageView) holder.getViewOrNull(b.h.f68690o2);
            int[] iArr = CenterListPopupView.this.D;
            if (iArr == null || iArr.length <= position) {
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else if (imageView != null) {
                imageView.setVisibility(0);
                imageView.setBackgroundResource(CenterListPopupView.this.D[position]);
            }
            if (((CenterPopupView) CenterListPopupView.this).f69584x == 0) {
                if (CenterListPopupView.this.f69527b.G) {
                    ((TextView) holder.getView(i4)).setTextColor(CenterListPopupView.this.getResources().getColor(b.e.f68321g));
                } else {
                    ((TextView) holder.getView(i4)).setTextColor(CenterListPopupView.this.getResources().getColor(b.e.f68297b));
                }
            }
            if (CenterListPopupView.this.F == -1) {
                int i5 = b.h.J0;
                if (holder.getViewOrNull(i5) != null) {
                    holder.getView(i5).setVisibility(8);
                }
                ((TextView) holder.getView(i4)).setGravity(17);
                return;
            }
            int i6 = b.h.J0;
            if (holder.getViewOrNull(i6) != null) {
                holder.getView(i6).setVisibility(position != CenterListPopupView.this.F ? 8 : 0);
                ((CheckView) holder.getView(i6)).a(c.d());
            }
            TextView textView = (TextView) holder.getView(i4);
            CenterListPopupView centerListPopupView = CenterListPopupView.this;
            textView.setTextColor(position == centerListPopupView.F ? c.d() : centerListPopupView.getResources().getColor(b.e.f68317f));
            ((TextView) holder.getView(i4)).setGravity(h.H(CenterListPopupView.this.getContext()) ? f0.f27130c : f0.f27129b);
        }
    }

    class b extends g.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.lxj.easyadapter.b f69661a;

        b(final com.lxj.easyadapter.b val$adapter) {
            this.f69661a = val$adapter;
        }

        @Override // com.lxj.easyadapter.g.c, com.lxj.easyadapter.g.b
        public void b(View view, RecyclerView.e0 holder, int position) {
            if (CenterListPopupView.this.E != null && position >= 0 && position < this.f69661a.getData().size()) {
                CenterListPopupView.this.E.a(position, (String) this.f69661a.getData().get(position));
            }
            CenterListPopupView centerListPopupView = CenterListPopupView.this;
            if (centerListPopupView.F != -1) {
                centerListPopupView.F = position;
                this.f69661a.notifyDataSetChanged();
            }
            if (CenterListPopupView.this.f69527b.f69625c.booleanValue()) {
                CenterListPopupView.this.t();
            }
        }
    }

    public CenterListPopupView(@o0 Context context, int bindLayoutId, int bindItemLayoutId) {
        super(context);
        this.F = -1;
        this.f69583w = bindLayoutId;
        this.f69584x = bindItemLayoutId;
        o0();
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected int I() {
        int i4 = this.f69583w;
        return i4 == 0 ? b.k.f68808i : i4;
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected int M() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            return 0;
        }
        int i4 = bVar.f69632j;
        return i4 == 0 ? super.M() : i4;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        RecyclerView recyclerView = (RecyclerView) findViewById(b.h.n4);
        this.f69659z = recyclerView;
        if (this.f69583w != 0) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        TextView textView = (TextView) findViewById(b.h.p6);
        this.A = textView;
        if (textView != null) {
            if (TextUtils.isEmpty(this.B)) {
                this.A.setVisibility(8);
                int i4 = b.h.E6;
                if (findViewById(i4) != null) {
                    findViewById(i4).setVisibility(8);
                }
            } else {
                this.A.setText(this.B);
            }
        }
        List asList = Arrays.asList(this.C);
        int i5 = this.f69584x;
        if (i5 == 0) {
            i5 = b.k.f68787b;
        }
        a aVar = new a(asList, i5);
        aVar.F(new b(aVar));
        this.f69659z.setAdapter(aVar);
        p0();
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected void h() {
        super.h();
        ((VerticalRecyclerView) this.f69659z).b(Boolean.TRUE);
        this.A.setTextColor(getResources().getColor(b.e.f68321g));
        findViewById(b.h.E6).setBackgroundColor(getResources().getColor(b.e.f68307d));
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected void i() {
        super.i();
        ((VerticalRecyclerView) this.f69659z).b(Boolean.FALSE);
        this.A.setTextColor(getResources().getColor(b.e.f68297b));
        findViewById(b.h.E6).setBackgroundColor(getResources().getColor(b.e.f68312e));
    }

    public CenterListPopupView s0(int position) {
        this.F = position;
        RecyclerView recyclerView = this.f69659z;
        if (recyclerView != null && recyclerView.getAdapter() != null) {
            this.f69659z.getAdapter().notifyDataSetChanged();
        }
        return this;
    }

    public CenterListPopupView t0(gb.g selectListener) {
        this.E = selectListener;
        return this;
    }

    public CenterListPopupView u0(CharSequence title, String[] data, int[] iconIds) {
        this.B = title;
        this.C = data;
        this.D = iconIds;
        return this;
    }
}
