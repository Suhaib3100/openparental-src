package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import n1.a;

/* compiled from: ChildrenAlphaProperty.java */
/* loaded from: classes2.dex */
public class d extends Property<ViewGroup, Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final Property<ViewGroup, Float> f12784a = new d(ProtectedSandApp.s("ᇹ"));

    private d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @o0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(@o0 ViewGroup viewGroup) {
        Float f6 = (Float) viewGroup.getTag(a.h.f29696c3);
        return f6 != null ? f6 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@o0 ViewGroup viewGroup, @o0 Float f6) {
        float floatValue = f6.floatValue();
        viewGroup.setTag(a.h.f29696c3, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            viewGroup.getChildAt(i5).setAlpha(floatValue);
        }
    }
}
