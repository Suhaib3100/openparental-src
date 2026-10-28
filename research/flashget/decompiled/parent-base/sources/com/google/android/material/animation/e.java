package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.WeakHashMap;

/* compiled from: DrawableAlphaProperty.java */
/* loaded from: classes6.dex */
public class e extends Property<Drawable, Integer> {

    /* renamed from: b, reason: collision with root package name */
    public static final Property<Drawable, Integer> f52473b = new e();

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Drawable, Integer> f52474a;

    private e() {
        super(Integer.class, ProtectedSandApp.s("\uf13d"));
        this.f52474a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    @q0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(@o0 Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@o0 Drawable drawable, @o0 Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
