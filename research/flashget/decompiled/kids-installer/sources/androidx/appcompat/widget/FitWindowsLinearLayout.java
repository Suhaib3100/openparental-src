package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.c1;
import androidx.appcompat.widget.g0;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class FitWindowsLinearLayout extends LinearLayout implements g0 {

    /* renamed from: o, reason: collision with root package name */
    private g0.a f938o;

    public FitWindowsLinearLayout(@androidx.annotation.o0 Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.g0
    public void a(g0.a aVar) {
        this.f938o = aVar;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        g0.a aVar = this.f938o;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public FitWindowsLinearLayout(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
