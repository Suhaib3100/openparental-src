package com.lxj.xpopup.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lxj.xpopup.b;
import com.lxj.xpopup.util.h;

/* loaded from: classes6.dex */
public class VerticalRecyclerView extends RecyclerView {
    public VerticalRecyclerView(@o0 Context context) {
        this(context, null);
    }

    public void b(Boolean isDark) {
        a aVar = new a(getContext(), 1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(getResources().getColor(isDark.booleanValue() ? b.e.f68307d : b.e.f68312e));
        gradientDrawable.setSize(10, h.p(getContext(), 0.5f));
        aVar.f(gradientDrawable);
        addItemDecoration(aVar);
    }

    public VerticalRecyclerView(@o0 Context context, @q0 AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public VerticalRecyclerView(@o0 Context context, @q0 AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setLayoutManager(new LinearLayoutManager(getContext()));
    }
}
