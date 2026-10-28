package androidx.viewpager2.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import androidx.core.view.x1;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentViewHolder.java */
/* loaded from: classes3.dex */
public final class a extends RecyclerView.e0 {
    private a(@o0 FrameLayout frameLayout) {
        super(frameLayout);
    }

    @o0
    static a a(@o0 ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(x1.D());
        frameLayout.setSaveEnabled(false);
        return new a((View) frameLayout);
    }

    @o0
    FrameLayout b() {
        return (FrameLayout) this.itemView;
    }
}
