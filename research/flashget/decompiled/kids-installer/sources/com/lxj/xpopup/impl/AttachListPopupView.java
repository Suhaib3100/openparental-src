package com.lxj.xpopup.impl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c3.g;
import com.lxj.easyadapter.g;
import com.lxj.easyadapter.i;
import com.lxj.xpopup.b;
import com.lxj.xpopup.core.AttachPopupView;
import com.lxj.xpopup.util.h;
import com.lxj.xpopup.widget.VerticalRecyclerView;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class AttachListPopupView extends AttachPopupView {
    RecyclerView S;
    protected int T;
    protected int U;
    protected int V;
    String[] W;

    /* renamed from: a0, reason: collision with root package name */
    int[] f21175a0;

    /* renamed from: b0, reason: collision with root package name */
    private g f21176b0;

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
            int[] iArr = AttachListPopupView.this.f21175a0;
            if (iArr == null || iArr.length <= position) {
                h.T(imageView, false);
            } else if (imageView != null) {
                h.T(imageView, true);
                imageView.setBackgroundResource(AttachListPopupView.this.f21175a0[position]);
            }
            AttachListPopupView attachListPopupView = AttachListPopupView.this;
            if (attachListPopupView.U == 0) {
                if (attachListPopupView.f21074o.G) {
                    ((TextView) holder.S(i5)).setTextColor(AttachListPopupView.this.getResources().getColor(b.e.f20070g));
                } else {
                    ((TextView) holder.S(i5)).setTextColor(AttachListPopupView.this.getResources().getColor(b.e.f20046b));
                }
                ((LinearLayout) holder.S(b.h.f20444i)).setGravity(AttachListPopupView.this.V);
            }
        }
    }

    class b extends g.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.lxj.easyadapter.b f21178a;

        b(final com.lxj.easyadapter.b val$adapter) {
            this.f21178a = val$adapter;
        }

        @Override // com.lxj.easyadapter.g.c, com.lxj.easyadapter.g.b
        public void a(View view, RecyclerView.d0 holder, int position) {
            if (AttachListPopupView.this.f21176b0 != null) {
                AttachListPopupView.this.f21176b0.a(position, (String) this.f21178a.T().get(position));
            }
            if (AttachListPopupView.this.f21074o.f21151c.booleanValue()) {
                AttachListPopupView.this.x();
            }
        }
    }

    public AttachListPopupView(@o0 Context context, int bindLayoutId, int bindItemLayoutId) {
        super(context);
        this.V = 17;
        this.T = bindLayoutId;
        this.U = bindItemLayoutId;
        s0();
    }

    public AttachListPopupView A0(c3.g selectListener) {
        this.f21176b0 = selectListener;
        return this;
    }

    public AttachListPopupView B0(String[] data, int[] iconIds) {
        this.W = data;
        this.f21175a0 = iconIds;
        return this;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected int M() {
        int i5 = this.T;
        return i5 == 0 ? b.k.f20595c : i5;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void h0() {
        RecyclerView recyclerView = (RecyclerView) findViewById(b.h.f20479n4);
        this.S = recyclerView;
        if (this.T != 0) {
            recyclerView.g2(new LinearLayoutManager(getContext()));
        }
        List asList = Arrays.asList(this.W);
        int i5 = this.U;
        if (i5 == 0) {
            i5 = b.k.f20589a;
        }
        a aVar = new a(asList, i5);
        aVar.n0(new b(aVar));
        this.S.X1(aVar);
        y0();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void n() {
        ((VerticalRecyclerView) this.S).B2(Boolean.TRUE);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void o() {
        ((VerticalRecyclerView) this.S).B2(Boolean.FALSE);
    }

    protected void y0() {
        if (this.T == 0) {
            if (this.f21074o.G) {
                n();
            } else {
                o();
            }
            this.K.setBackground(h.m(getResources().getColor(this.f21074o.G ? b.e.f20046b : b.e.f20051c), this.f21074o.f21162n));
        }
    }

    public AttachListPopupView z0(int gravity) {
        this.V = gravity;
        return this;
    }
}
