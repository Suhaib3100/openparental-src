package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import androidx.annotation.o0;

/* compiled from: ArgbEvaluatorCompat.java */
/* loaded from: classes6.dex */
public class c implements TypeEvaluator<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private static final c f52471a = new c();

    @o0
    public static c b() {
        return f52471a;
    }

    @Override // android.animation.TypeEvaluator
    @o0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer evaluate(float f4, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f5 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float f6 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float a5 = androidx.appcompat.graphics.drawable.d.a(f6, f5, f4, f5);
        float a6 = androidx.appcompat.graphics.drawable.d.a(pow4, pow, f4, pow);
        float a7 = androidx.appcompat.graphics.drawable.d.a(pow5, pow2, f4, pow2);
        float a8 = androidx.appcompat.graphics.drawable.d.a(pow6, pow3, f4, pow3);
        float pow7 = ((float) Math.pow(a6, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(a7, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(a8, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(a5 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
