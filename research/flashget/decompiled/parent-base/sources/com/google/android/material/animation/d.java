package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import s8.a;

/* compiled from: ChildrenAlphaProperty.java */
/* loaded from: classes6.dex */
public class d extends Property<ViewGroup, Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final Property<ViewGroup, Float> f52472a = new d(ProtectedSandApp.s("\uf13c"));

    private d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @o0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(@o0 ViewGroup viewGroup) {
        Float f4 = (Float) viewGroup.getTag(a.h.f90994c3);
        return f4 != null ? f4 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@o0 ViewGroup viewGroup, @o0 Float f4) {
        float floatValue = f4.floatValue();
        viewGroup.setTag(a.h.f90994c3, f4);
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            viewGroup.getChildAt(i4).setAlpha(floatValue);
        }
    }
}
