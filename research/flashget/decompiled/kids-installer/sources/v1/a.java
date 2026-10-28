package v1;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.f;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.d;
import n1.a;

/* compiled from: MaterialThemeOverlay.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f33891a = {R.attr.theme, a.c.Ke};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f33892b = {a.c.P9};

    private a() {
    }

    @h1
    private static int a(@o0 Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f33891a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @h1
    private static int b(@o0 Context context, @q0 AttributeSet attributeSet, @f int i5, @h1 int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f33892b, i5, i6);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @o0
    public static Context c(@o0 Context context, @q0 AttributeSet attributeSet, @f int i5, @h1 int i6) {
        int b6 = b(context, attributeSet, i5, i6);
        boolean z5 = (context instanceof d) && ((d) context).c() == b6;
        if (b6 == 0 || z5) {
            return context;
        }
        d dVar = new d(context, b6);
        int a6 = a(context, attributeSet);
        if (a6 != 0) {
            dVar.getTheme().applyStyle(a6, true);
        }
        return dVar;
    }
}
