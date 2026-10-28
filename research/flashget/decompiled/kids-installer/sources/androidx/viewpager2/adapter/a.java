package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import androidx.core.view.y1;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentViewHolder.java */
/* loaded from: classes3.dex */
public final class a extends RecyclerView.d0 {
    private a(@o0 FrameLayout frameLayout) {
        super(frameLayout);
    }

    @o0
    static a R(@o0 ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(y1.D());
        frameLayout.setSaveEnabled(false);
        return new a(frameLayout);
    }

    @o0
    FrameLayout S() {
        return (FrameLayout) this.f9003a;
    }
}
