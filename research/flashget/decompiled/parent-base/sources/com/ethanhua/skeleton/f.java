package com.ethanhua.skeleton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.g0;
import androidx.recyclerview.widget.RecyclerView;
import io.supercharge.shimmerlayout.ShimmerLayout;

/* compiled from: SkeletonAdapter.java */
/* loaded from: classes3.dex */
public class f extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: b, reason: collision with root package name */
    private int f49100b;

    /* renamed from: c, reason: collision with root package name */
    private int f49101c;

    /* renamed from: d, reason: collision with root package name */
    private int f49102d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f49103e;

    /* renamed from: f, reason: collision with root package name */
    private int f49104f;

    /* renamed from: g, reason: collision with root package name */
    private int f49105g;

    /* compiled from: SkeletonAdapter.java */
    class a extends RecyclerView.e0 {
        a(View view) {
            super(view);
        }
    }

    public void d(int i4) {
        this.f49100b = i4;
    }

    public void e(int i4) {
        this.f49101c = i4;
    }

    public void f(@g0(from = 0, to = 30) int i4) {
        this.f49105g = i4;
    }

    public void g(int i4) {
        this.f49102d = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f49100b;
    }

    public void h(int i4) {
        this.f49104f = i4;
    }

    public void i(boolean z4) {
        this.f49103e = z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i4) {
        if (this.f49103e) {
            ShimmerLayout shimmerLayout = (ShimmerLayout) e0Var.itemView;
            shimmerLayout.u(this.f49104f);
            shimmerLayout.t(this.f49105g);
            shimmerLayout.v(this.f49102d);
            shimmerLayout.w();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        return this.f49103e ? new d(from, viewGroup, this.f49101c) : new a(from.inflate(this.f49101c, viewGroup, false));
    }
}
