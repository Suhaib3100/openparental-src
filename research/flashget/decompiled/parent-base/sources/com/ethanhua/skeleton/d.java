package com.ethanhua.skeleton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ethanhua.skeleton.b;

/* compiled from: ShimmerViewHolder.java */
/* loaded from: classes3.dex */
public class d extends RecyclerView.e0 {
    public d(LayoutInflater layoutInflater, ViewGroup viewGroup, int i4) {
        super(layoutInflater.inflate(b.i.B, viewGroup, false));
        ViewGroup viewGroup2 = (ViewGroup) this.itemView;
        View inflate = layoutInflater.inflate(i4, viewGroup2, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams != null) {
            viewGroup2.setLayoutParams(layoutParams);
        }
        viewGroup2.addView(inflate);
    }
}
