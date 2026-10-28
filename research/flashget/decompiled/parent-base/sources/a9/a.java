package a9;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.f;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.d;
import s8.a;

/* compiled from: MaterialThemeOverlay.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f188a = {R.attr.theme, a.c.Je};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f189b = {a.c.O9};

    private a() {
    }

    @h1
    private static int a(@o0 Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f188a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @h1
    private static int b(@o0 Context context, @q0 AttributeSet attributeSet, @f int i4, @h1 int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f189b, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @o0
    public static Context c(@o0 Context context, @q0 AttributeSet attributeSet, @f int i4, @h1 int i5) {
        int b5 = b(context, attributeSet, i4, i5);
        boolean z4 = (context instanceof d) && ((d) context).c() == b5;
        if (b5 == 0 || z4) {
            return context;
        }
        d dVar = new d(context, b5);
        int a5 = a(context, attributeSet);
        if (a5 != 0) {
            dVar.getTheme().applyStyle(a5, true);
        }
        return dVar;
    }
}
