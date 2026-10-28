package com.lxj.xpopup.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.core.view.d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c3.g;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.easyadapter.g;
import com.lxj.easyadapter.i;
import com.lxj.xpopup.b;
import com.lxj.xpopup.core.BottomPopupView;
import com.lxj.xpopup.util.h;
import com.lxj.xpopup.widget.CheckView;
import com.lxj.xpopup.widget.VerticalRecyclerView;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class BottomListPopupView extends BottomPopupView {
    RecyclerView K;
    TextView L;
    TextView M;
    View N;
    protected int O;
    protected int P;
    CharSequence Q;
    String[] R;
    int[] S;
    private g T;
    int U;

    /* loaded from: classes5.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v5) {
            BottomListPopupView.this.x();
        }
    }

    class b extends com.lxj.easyadapter.b<String> {
        b(List arg0, int arg1) {
            super(arg0, arg1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lxj.easyadapter.b
        /* renamed from: t0, reason: merged with bridge method [inline-methods] */
        public void p0(@o0 i holder, @o0 String s5, int position) {
            int i5 = b.h.o6;
            holder.V(i5, s5);
            ImageView imageView = (ImageView) holder.T(b.h.f20483o2);
            int[] iArr = BottomListPopupView.this.S;
            if (iArr == null || iArr.length <= position) {
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else if (imageView != null) {
                imageView.setVisibility(0);
                imageView.setBackgroundResource(BottomListPopupView.this.S[position]);
            }
            BottomListPopupView bottomListPopupView = BottomListPopupView.this;
            if (bottomListPopupView.P == 0) {
                if (bottomListPopupView.f21074o.G) {
                    ((TextView) holder.S(i5)).setTextColor(BottomListPopupView.this.getResources().getColor(b.e.f20070g));
                } else {
                    ((TextView) holder.S(i5)).setTextColor(BottomListPopupView.this.getResources().getColor(b.e.f20046b));
                }
            }
            if (BottomListPopupView.this.U == -1) {
                int i6 = b.h.J0;
                if (holder.T(i6) != null) {
                    holder.S(i6).setVisibility(8);
                }
                ((TextView) holder.S(i5)).setGravity(17);
                return;
            }
            int i7 = b.h.J0;
            if (holder.T(i7) != null) {
                holder.S(i7).setVisibility(position != BottomListPopupView.this.U ? 8 : 0);
                ((CheckView) holder.S(i7)).a(com.lxj.xpopup.c.d());
            }
            TextView textView = (TextView) holder.S(i5);
            BottomListPopupView bottomListPopupView2 = BottomListPopupView.this;
            textView.setTextColor(position == bottomListPopupView2.U ? com.lxj.xpopup.c.d() : bottomListPopupView2.getResources().getColor(b.e.f20066f));
            ((TextView) holder.S(i5)).setGravity(h.H(BottomListPopupView.this.getContext()) ? d0.f5465c : d0.f5464b);
        }
    }

    class c extends g.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.lxj.easyadapter.b f21182a;

        c(final com.lxj.easyadapter.b val$adapter) {
            this.f21182a = val$adapter;
        }

        @Override // com.lxj.easyadapter.g.c, com.lxj.easyadapter.g.b
        public void a(View view, RecyclerView.d0 holder, int position) {
            if (BottomListPopupView.this.T != null) {
                BottomListPopupView.this.T.a(position, (String) this.f21182a.T().get(position));
            }
            BottomListPopupView bottomListPopupView = BottomListPopupView.this;
            if (bottomListPopupView.U != -1) {
                bottomListPopupView.U = position;
                this.f21182a.m();
            }
            if (BottomListPopupView.this.f21074o.f21151c.booleanValue()) {
                BottomListPopupView.this.x();
            }
        }
    }

    public BottomListPopupView(@o0 Context context, int bindLayoutId, int bindItemLayoutId) {
        super(context);
        this.U = -1;
        this.O = bindLayoutId;
        this.P = bindItemLayoutId;
        s0();
    }

    @Override // com.lxj.xpopup.core.BottomPopupView, com.lxj.xpopup.core.BasePopupView
    protected int M() {
        int i5 = this.O;
        return i5 == 0 ? b.k.f20601e : i5;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void h0() {
        RecyclerView recyclerView = (RecyclerView) findViewById(b.h.f20479n4);
        this.K = recyclerView;
        if (this.O != 0) {
            recyclerView.g2(new LinearLayoutManager(getContext()));
        }
        this.L = (TextView) findViewById(b.h.p6);
        this.M = (TextView) findViewById(b.h.j6);
        this.N = findViewById(b.h.A6);
        TextView textView = this.M;
        if (textView != null) {
            textView.setOnClickListener(new a());
        }
        if (this.L != null) {
            if (TextUtils.isEmpty(this.Q)) {
                this.L.setVisibility(8);
                int i5 = b.h.E6;
                if (findViewById(i5) != null) {
                    findViewById(i5).setVisibility(8);
                }
            } else {
                this.L.setText(this.Q);
            }
        }
        List asList = Arrays.asList(this.R);
        int i6 = this.P;
        if (i6 == 0) {
            i6 = b.k.f20592b;
        }
        b bVar = new b(asList, i6);
        bVar.n0(new c(bVar));
        this.K.X1(bVar);
        u0();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void n() {
        ((VerticalRecyclerView) this.K).B2(Boolean.TRUE);
        TextView textView = this.L;
        Resources resources = getResources();
        int i5 = b.e.f20070g;
        textView.setTextColor(resources.getColor(i5));
        TextView textView2 = this.M;
        if (textView2 != null) {
            textView2.setTextColor(getResources().getColor(i5));
        }
        findViewById(b.h.E6).setBackgroundColor(getResources().getColor(b.e.f20056d));
        View view = this.N;
        if (view != null) {
            view.setBackgroundColor(Color.parseColor(ProtectedSandApp.s("歲")));
        }
        View V = V();
        int color = getResources().getColor(b.e.f20046b);
        float f6 = this.f21074o.f21162n;
        V.setBackground(h.n(color, f6, f6, 0.0f, 0.0f));
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void o() {
        ((VerticalRecyclerView) this.K).B2(Boolean.FALSE);
        TextView textView = this.L;
        Resources resources = getResources();
        int i5 = b.e.f20046b;
        textView.setTextColor(resources.getColor(i5));
        TextView textView2 = this.M;
        if (textView2 != null) {
            textView2.setTextColor(getResources().getColor(i5));
        }
        findViewById(b.h.E6).setBackgroundColor(getResources().getColor(b.e.f20061e));
        View view = this.N;
        if (view != null) {
            view.setBackgroundColor(getResources().getColor(b.e.f20070g));
        }
        View V = V();
        int color = getResources().getColor(b.e.f20051c);
        float f6 = this.f21074o.f21162n;
        V.setBackground(h.n(color, f6, f6, 0.0f, 0.0f));
    }

    protected void u0() {
        if (this.O == 0) {
            if (this.f21074o.G) {
                n();
            } else {
                o();
            }
        }
    }

    public BottomListPopupView v0(int position) {
        this.U = position;
        return this;
    }

    public BottomListPopupView w0(c3.g selectListener) {
        this.T = selectListener;
        return this;
    }

    public BottomListPopupView x0(CharSequence title, String[] data, int[] iconIds) {
        this.Q = title;
        this.R = data;
        this.S = iconIds;
        return this;
    }
}
