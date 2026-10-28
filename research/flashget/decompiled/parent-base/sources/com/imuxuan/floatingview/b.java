package com.imuxuan.floatingview;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.v;
import com.imuxuan.floatingview.f;

/* compiled from: EnFloatingView.java */
/* loaded from: classes6.dex */
public class b extends FloatingMagnetView {

    /* renamed from: p, reason: collision with root package name */
    private final ImageView f64143p;

    public b(@o0 Context context) {
        this(context, f.i.A);
    }

    public void q(@v int i4) {
        this.f64143p.setImageResource(i4);
    }

    public b(@o0 Context context, @j0 int i4) {
        super(context, null);
        View.inflate(context, i4, this);
        this.f64143p = (ImageView) findViewById(f.g.N);
    }
}
