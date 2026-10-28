package com.tencent.liteav.sdkcommon;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;

/* loaded from: classes7.dex */
final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final g f72054a;

    /* renamed from: b, reason: collision with root package name */
    private final Button f72055b;

    private j(g gVar, Button button) {
        this.f72054a = gVar;
        this.f72055b = button;
    }

    public static View.OnClickListener a(g gVar, Button button) {
        return new j(gVar, button);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g gVar = this.f72054a;
        boolean z4 = gVar.f72043m;
        if (z4) {
            WindowManager.LayoutParams layoutParams = gVar.f72032b;
            int i4 = gVar.f72044n;
            layoutParams.height = i4;
            int i5 = layoutParams.y;
            int i6 = i4 + i5;
            int i7 = gVar.f72031a.heightPixels;
            if (i6 > i7) {
                layoutParams.height = i7 - i5;
            }
        } else {
            gVar.f72032b.height = gVar.f72044n / 2;
        }
        gVar.f72043m = !z4;
        gVar.f72036f.updateViewLayout(gVar.f72037g, gVar.f72032b);
        ViewGroup.LayoutParams layoutParams2 = gVar.f72041k.getLayoutParams();
        layoutParams2.height = gVar.b();
        gVar.f72041k.setLayoutParams(layoutParams2);
        gVar.f72034d.post(l.a(gVar));
    }
}
