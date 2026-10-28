package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.annotation.c1;

/* compiled from: ArgbEvaluator.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class f implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    private static final f f35341a = new f();

    public static f a() {
        return f35341a;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f4, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f5 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
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
