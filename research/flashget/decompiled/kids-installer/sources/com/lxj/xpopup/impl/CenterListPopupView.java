package com.lxj.xpopup.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.core.view.d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c3.g;
import com.lxj.easyadapter.g;
import com.lxj.easyadapter.i;
import com.lxj.xpopup.b;
import com.lxj.xpopup.c;
import com.lxj.xpopup.core.CenterPopupView;
import com.lxj.xpopup.util.h;
import com.lxj.xpopup.widget.CheckView;
import com.lxj.xpopup.widget.VerticalRecyclerView;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class CenterListPopupView extends CenterPopupView {
    RecyclerView M;
    TextView N;
    CharSequence O;
    String[] P;
    int[] Q;
    private g R;
    int S;

    class a extends com.lxj.easyadapter.b<String> {
        a(List arg0, int arg1) {
            super(arg0, arg1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lxj.easyadapter.b
        /* renamed from: t0, reason: merged with bridge method [inline-methods] */
        public void p0(@o0 i holder, @o0 String s5, int position) {
            int i5 = b.h.o6;
            holder.V(i5, s5);
            ImageView imageView = (ImageView) holder.T(b.h.f20483o2);
            int[] iArr = CenterListPopupView.this.Q;
            if (iArr == null || iArr.length <= position) {
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else if (imageView != null) {
                imageView.setVisibility(0);
                imageView.setBackgroundResource(CenterListPopupView.this.Q[position]);
            }
            if (((CenterPopupView) CenterListPopupView.this).K == 0) {
                if (CenterListPopupView.this.f21074o.G) {
                    ((TextView) holder.S(i5)).setTextColor(CenterListPopupView.this.getResources().getColor(b.e.f20070g));
                } else {
                    ((TextView) holder.S(i5)).setTextColor(CenterListPopupView.this.getResources().getColor(b.e.f20046b));
                }
            }
            if (CenterListPopupView.this.S == -1) {
                int i6 = b.h.J0;
                if (holder.T(i6) != null) {
                    holder.S(i6).setVisibility(8);
                }
                ((TextView) holder.S(i5)).setGravity(17);
                return;
            }
            int i7 = b.h.J0;
            if (holder.T(i7) != null) {
                holder.S(i7).setVisibility(position != CenterListPopupView.this.S ? 8 : 0);
                ((CheckView) holder.S(i7)).a(c.d());
            }
            TextView textView = (TextView) holder.S(i5);
            CenterListPopupView centerListPopupView = CenterListPopupView.this;
            textView.setTextColor(position == centerListPopupView.S ? c.d() : centerListPopupView.getResources().getColor(b.e.f20066f));
            ((TextView) holder.S(i5)).setGravity(h.H(CenterListPopupView.this.getContext()) ? d0.f5465c : d0.f5464b);
        }
    }

    class b extends g.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.lxj.easyadapter.b f21185a;

        b(final com.lxj.easyadapter.b val$adapter) {
            this.f21185a = val$adapter;
        }

        @Override // com.lxj.easyadapter.g.c, com.lxj.easyadapter.g.b
        public void a(View view, RecyclerView.d0 holder, int position) {
            if (CenterListPopupView.this.R != null && position >= 0 && position < this.f21185a.T().size()) {
                CenterListPopupView.this.R.a(position, (String) this.f21185a.T().get(position));
            }
            CenterListPopupView centerListPopupView = CenterListPopupView.this;
            if (centerListPopupView.S != -1) {
                centerListPopupView.S = position;
                this.f21185a.m();
            }
            if (CenterListPopupView.this.f21074o.f21151c.booleanValue()) {
                CenterListPopupView.this.x();
            }
        }
    }

    public CenterListPopupView(@o0 Context context, int bindLayoutId, int bindItemLayoutId) {
        super(context);
        this.S = -1;
        this.J = bindLayoutId;
        this.K = bindItemLayoutId;
        s0();
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected int M() {
        int i5 = this.J;
        return i5 == 0 ? b.k.f20613i : i5;
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected int Q() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return 0;
        }
        int i5 = bVar.f21158j;
        return i5 == 0 ? super.Q() : i5;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void h0() {
        RecyclerView recyclerView = (RecyclerView) findViewById(b.h.f20479n4);
        this.M = recyclerView;
        if (this.J != 0) {
            recyclerView.g2(new LinearLayoutManager(getContext()));
        }
        TextView textView = (TextView) findViewById(b.h.p6);
        this.N = textView;
        if (textView != null) {
            if (TextUtils.isEmpty(this.O)) {
                this.N.setVisibility(8);
                int i5 = b.h.E6;
                if (findViewById(i5) != null) {
                    findViewById(i5).setVisibility(8);
                }
            } else {
                this.N.setText(this.O);
            }
        }
        List asList = Arrays.asList(this.P);
        int i6 = this.K;
        if (i6 == 0) {
            i6 = b.k.f20592b;
        }
        a aVar = new a(asList, i6);
        aVar.n0(new b(aVar));
        this.M.X1(aVar);
        t0();
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected void n() {
        super.n();
        ((VerticalRecyclerView) this.M).B2(Boolean.TRUE);
        this.N.setTextColor(getResources().getColor(b.e.f20070g));
        findViewById(b.h.E6).setBackgroundColor(getResources().getColor(b.e.f20056d));
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected void o() {
        super.o();
        ((VerticalRecyclerView) this.M).B2(Boolean.FALSE);
        this.N.setTextColor(getResources().getColor(b.e.f20046b));
        findViewById(b.h.E6).setBackgroundColor(getResources().getColor(b.e.f20061e));
    }

    public CenterListPopupView w0(int position) {
        this.S = position;
        return this;
    }

    public CenterListPopupView x0(c3.g selectListener) {
        this.R = selectListener;
        return this;
    }

    public CenterListPopupView y0(CharSequence title, String[] data, int[] iconIds) {
        this.O = title;
        this.P = data;
        this.Q = iconIds;
        return this;
    }
}
