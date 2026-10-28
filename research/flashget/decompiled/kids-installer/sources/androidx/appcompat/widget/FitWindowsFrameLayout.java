package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.appcompat.widget.g0;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class FitWindowsFrameLayout extends FrameLayout implements g0 {

    /* renamed from: o, reason: collision with root package name */
    private g0.a f937o;

    public FitWindowsFrameLayout(@androidx.annotation.o0 Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.g0
    public void a(g0.a aVar) {
        this.f937o = aVar;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        g0.a aVar = this.f937o;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public FitWindowsFrameLayout(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
