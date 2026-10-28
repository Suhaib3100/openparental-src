package com.lxj.xpopup.impl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lxj.easyadapter.g;
import com.lxj.easyadapter.i;
import com.lxj.xpopup.b;
import com.lxj.xpopup.core.AttachPopupView;
import com.lxj.xpopup.util.h;
import com.lxj.xpopup.widget.VerticalRecyclerView;
import gb.g;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class AttachListPopupView extends AttachPopupView {
    RecyclerView F;
    protected int G;
    protected int H;
    protected int I;
    String[] J;
    int[] K;
    private g L;

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
            int[] iArr = AttachListPopupView.this.K;
            if (iArr == null || iArr.length <= position) {
                h.T(imageView, false);
            } else if (imageView != null) {
                h.T(imageView, true);
                imageView.setBackgroundResource(AttachListPopupView.this.K[position]);
            }
            AttachListPopupView attachListPopupView = AttachListPopupView.this;
            if (attachListPopupView.H == 0) {
                if (attachListPopupView.f69527b.G) {
                    ((TextView) holder.getView(i4)).setTextColor(AttachListPopupView.this.getResources().getColor(b.e.f68321g));
                } else {
                    ((TextView) holder.getView(i4)).setTextColor(AttachListPopupView.this.getResources().getColor(b.e.f68297b));
                }
                ((LinearLayout) holder.getView(b.h.f68657i)).setGravity(AttachListPopupView.this.I);
            }
        }
    }

    class b extends g.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.lxj.easyadapter.b f69650a;

        b(final com.lxj.easyadapter.b val$adapter) {
            this.f69650a = val$adapter;
        }

        @Override // com.lxj.easyadapter.g.c, com.lxj.easyadapter.g.b
        public void b(View view, RecyclerView.e0 holder, int position) {
            if (AttachListPopupView.this.L != null) {
                AttachListPopupView.this.L.a(position, (String) this.f69650a.getData().get(position));
            }
            if (AttachListPopupView.this.f69527b.f69625c.booleanValue()) {
                AttachListPopupView.this.t();
            }
        }
    }

    public AttachListPopupView(@o0 Context context, int bindLayoutId, int bindItemLayoutId) {
        super(context);
        this.I = 17;
        this.G = bindLayoutId;
        this.H = bindItemLayoutId;
        o0();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected int I() {
        int i4 = this.G;
        return i4 == 0 ? b.k.f68790c : i4;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        RecyclerView recyclerView = (RecyclerView) findViewById(b.h.n4);
        this.F = recyclerView;
        if (this.G != 0) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        List asList = Arrays.asList(this.J);
        int i4 = this.H;
        if (i4 == 0) {
            i4 = b.k.f68784a;
        }
        a aVar = new a(asList, i4);
        aVar.F(new b(aVar));
        this.F.setAdapter(aVar);
        u0();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void h() {
        ((VerticalRecyclerView) this.F).b(Boolean.TRUE);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void i() {
        ((VerticalRecyclerView) this.F).b(Boolean.FALSE);
    }

    protected void u0() {
        if (this.G == 0) {
            if (this.f69527b.G) {
                h();
            } else {
                i();
            }
            this.f69517x.setBackground(h.m(getResources().getColor(this.f69527b.G ? b.e.f68297b : b.e.f68302c), this.f69527b.f69636n));
        }
    }

    public AttachListPopupView v0(int gravity) {
        this.I = gravity;
        return this;
    }

    public AttachListPopupView w0(gb.g selectListener) {
        this.L = selectListener;
        return this;
    }

    public AttachListPopupView x0(String[] data, int[] iconIds) {
        this.J = data;
        this.K = iconIds;
        return this;
    }
}
