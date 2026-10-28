package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.c1;
import androidx.appcompat.widget.d0;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements d0 {

    /* renamed from: b, reason: collision with root package name */
    private d0.a f1534b;

    public FitWindowsLinearLayout(@androidx.annotation.o0 Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.d0
    public void a(d0.a aVar) {
        this.f1534b = aVar;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        d0.a aVar = this.f1534b;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public FitWindowsLinearLayout(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
