package com.lxj.xpopup.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.core.view.f0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.easyadapter.g;
import com.lxj.easyadapter.i;
import com.lxj.xpopup.b;
import com.lxj.xpopup.core.BottomPopupView;
import com.lxj.xpopup.util.h;
import com.lxj.xpopup.widget.CheckView;
import com.lxj.xpopup.widget.VerticalRecyclerView;
import gb.g;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class BottomListPopupView extends BottomPopupView {
    View A;
    protected int B;
    protected int C;
    CharSequence D;
    String[] E;
    int[] F;
    private g G;
    int H;

    /* renamed from: x, reason: collision with root package name */
    RecyclerView f69652x;

    /* renamed from: y, reason: collision with root package name */
    TextView f69653y;

    /* renamed from: z, reason: collision with root package name */
    TextView f69654z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v4) {
            BottomListPopupView.this.t();
        }
    }

    class b extends com.lxj.easyadapter.b<String> {
        b(List arg0, int arg1) {
            super(arg0, arg1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lxj.easyadapter.b
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public void H(@o0 i holder, @o0 String s4, int position) {
            int i4 = b.h.o6;
            holder.c(i4, s4);
            ImageView imageView = (ImageView) holder.getViewOrNull(b.h.f68690o2);
            int[] iArr = BottomListPopupView.this.F;
            if (iArr == null || iArr.length <= position) {
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else if (imageView != null) {
                imageView.setVisibility(0);
                imageView.setBackgroundResource(BottomListPopupView.this.F[position]);
            }
            BottomListPopupView bottomListPopupView = BottomListPopupView.this;
            if (bottomListPopupView.C == 0) {
                if (bottomListPopupView.f69527b.G) {
                    ((TextView) holder.getView(i4)).setTextColor(BottomListPopupView.this.getResources().getColor(b.e.f68321g));
                } else {
                    ((TextView) holder.getView(i4)).setTextColor(BottomListPopupView.this.getResources().getColor(b.e.f68297b));
                }
            }
            if (BottomListPopupView.this.H == -1) {
                int i5 = b.h.J0;
                if (holder.getViewOrNull(i5) != null) {
                    holder.getView(i5).setVisibility(8);
                }
                ((TextView) holder.getView(i4)).setGravity(17);
                return;
            }
            int i6 = b.h.J0;
            if (holder.getViewOrNull(i6) != null) {
                holder.getView(i6).setVisibility(position != BottomListPopupView.this.H ? 8 : 0);
                ((CheckView) holder.getView(i6)).a(com.lxj.xpopup.c.d());
            }
            TextView textView = (TextView) holder.getView(i4);
            BottomListPopupView bottomListPopupView2 = BottomListPopupView.this;
            textView.setTextColor(position == bottomListPopupView2.H ? com.lxj.xpopup.c.d() : bottomListPopupView2.getResources().getColor(b.e.f68317f));
            ((TextView) holder.getView(i4)).setGravity(h.H(BottomListPopupView.this.getContext()) ? f0.f27130c : f0.f27129b);
        }
    }

    class c extends g.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.lxj.easyadapter.b f69657a;

        c(final com.lxj.easyadapter.b val$adapter) {
            this.f69657a = val$adapter;
        }

        @Override // com.lxj.easyadapter.g.c, com.lxj.easyadapter.g.b
        public void b(View view, RecyclerView.e0 holder, int position) {
            if (BottomListPopupView.this.G != null) {
                BottomListPopupView.this.G.a(position, (String) this.f69657a.getData().get(position));
            }
            BottomListPopupView bottomListPopupView = BottomListPopupView.this;
            if (bottomListPopupView.H != -1) {
                bottomListPopupView.H = position;
                this.f69657a.notifyDataSetChanged();
            }
            if (BottomListPopupView.this.f69527b.f69625c.booleanValue()) {
                BottomListPopupView.this.t();
            }
        }
    }

    public BottomListPopupView(@o0 Context context, int bindLayoutId, int bindItemLayoutId) {
        super(context);
        this.H = -1;
        this.B = bindLayoutId;
        this.C = bindItemLayoutId;
        o0();
    }

    @Override // com.lxj.xpopup.core.BottomPopupView, com.lxj.xpopup.core.BasePopupView
    protected int I() {
        int i4 = this.B;
        return i4 == 0 ? b.k.f68796e : i4;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        RecyclerView recyclerView = (RecyclerView) findViewById(b.h.n4);
        this.f69652x = recyclerView;
        if (this.B != 0) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        this.f69653y = (TextView) findViewById(b.h.p6);
        this.f69654z = (TextView) findViewById(b.h.j6);
        this.A = findViewById(b.h.A6);
        TextView textView = this.f69654z;
        if (textView != null) {
            textView.setOnClickListener(new a());
        }
        if (this.f69653y != null) {
            if (TextUtils.isEmpty(this.D)) {
                this.f69653y.setVisibility(8);
                int i4 = b.h.E6;
                if (findViewById(i4) != null) {
                    findViewById(i4).setVisibility(8);
                }
            } else {
                this.f69653y.setText(this.D);
            }
        }
        List asList = Arrays.asList(this.E);
        int i5 = this.C;
        if (i5 == 0) {
            i5 = b.k.f68787b;
        }
        b bVar = new b(asList, i5);
        bVar.F(new c(bVar));
        this.f69652x.setAdapter(bVar);
        q0();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void h() {
        ((VerticalRecyclerView) this.f69652x).b(Boolean.TRUE);
        TextView textView = this.f69653y;
        Resources resources = getResources();
        int i4 = b.e.f68321g;
        textView.setTextColor(resources.getColor(i4));
        TextView textView2 = this.f69654z;
        if (textView2 != null) {
            textView2.setTextColor(getResources().getColor(i4));
        }
        findViewById(b.h.E6).setBackgroundColor(getResources().getColor(b.e.f68307d));
        View view = this.A;
        if (view != null) {
            view.setBackgroundColor(Color.parseColor(ProtectedSandApp.s("ម\u0001")));
        }
        View R = R();
        int color = getResources().getColor(b.e.f68297b);
        float f4 = this.f69527b.f69636n;
        R.setBackground(h.n(color, f4, f4, 0.0f, 0.0f));
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void i() {
        ((VerticalRecyclerView) this.f69652x).b(Boolean.FALSE);
        TextView textView = this.f69653y;
        Resources resources = getResources();
        int i4 = b.e.f68297b;
        textView.setTextColor(resources.getColor(i4));
        TextView textView2 = this.f69654z;
        if (textView2 != null) {
            textView2.setTextColor(getResources().getColor(i4));
        }
        findViewById(b.h.E6).setBackgroundColor(getResources().getColor(b.e.f68312e));
        View view = this.A;
        if (view != null) {
            view.setBackgroundColor(getResources().getColor(b.e.f68321g));
        }
        View R = R();
        int color = getResources().getColor(b.e.f68302c);
        float f4 = this.f69527b.f69636n;
        R.setBackground(h.n(color, f4, f4, 0.0f, 0.0f));
    }

    protected void q0() {
        if (this.B == 0) {
            if (this.f69527b.G) {
                h();
            } else {
                i();
            }
        }
    }

    public BottomListPopupView r0(int position) {
        this.H = position;
        return this;
    }

    public BottomListPopupView s0(gb.g selectListener) {
        this.G = selectListener;
        return this;
    }

    public BottomListPopupView t0(CharSequence title, String[] data, int[] iconIds) {
        this.D = title;
        this.E = data;
        this.F = iconIds;
        return this;
    }
}
