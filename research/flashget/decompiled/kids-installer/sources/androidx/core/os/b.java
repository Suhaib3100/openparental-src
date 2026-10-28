package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.l0;
import kotlin.text.Typography;

/* compiled from: Bundle.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lkotlin/q0;", "", "", "pairs", "Landroid/os/Bundle;", "a", "([Lkotlin/q0;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class b {
    @d5.d
    public static final Bundle a(@d5.d Pair<String, ? extends Object>... pairs) {
        l0.p(pairs, "pairs");
        Bundle bundle = new Bundle(pairs.length);
        int length = pairs.length;
        int i5 = 0;
        while (i5 < length) {
            Pair<String, ? extends Object> pair = pairs[i5];
            i5++;
            String a6 = pair.a();
            Object b6 = pair.b();
            if (b6 == null) {
                bundle.putString(a6, null);
            } else if (b6 instanceof Boolean) {
                bundle.putBoolean(a6, ((Boolean) b6).booleanValue());
            } else if (b6 instanceof Byte) {
                bundle.putByte(a6, ((Number) b6).byteValue());
            } else if (b6 instanceof Character) {
                bundle.putChar(a6, ((Character) b6).charValue());
            } else if (b6 instanceof Double) {
                bundle.putDouble(a6, ((Number) b6).doubleValue());
            } else if (b6 instanceof Float) {
                bundle.putFloat(a6, ((Number) b6).floatValue());
            } else if (b6 instanceof Integer) {
                bundle.putInt(a6, ((Number) b6).intValue());
            } else if (b6 instanceof Long) {
                bundle.putLong(a6, ((Number) b6).longValue());
            } else if (b6 instanceof Short) {
                bundle.putShort(a6, ((Number) b6).shortValue());
            } else if (b6 instanceof Bundle) {
                bundle.putBundle(a6, (Bundle) b6);
            } else if (b6 instanceof CharSequence) {
                bundle.putCharSequence(a6, (CharSequence) b6);
            } else if (b6 instanceof Parcelable) {
                bundle.putParcelable(a6, (Parcelable) b6);
            } else if (b6 instanceof boolean[]) {
                bundle.putBooleanArray(a6, (boolean[]) b6);
            } else if (b6 instanceof byte[]) {
                bundle.putByteArray(a6, (byte[]) b6);
            } else if (b6 instanceof char[]) {
                bundle.putCharArray(a6, (char[]) b6);
            } else if (b6 instanceof double[]) {
                bundle.putDoubleArray(a6, (double[]) b6);
            } else if (b6 instanceof float[]) {
                bundle.putFloatArray(a6, (float[]) b6);
            } else if (b6 instanceof int[]) {
                bundle.putIntArray(a6, (int[]) b6);
            } else if (b6 instanceof long[]) {
                bundle.putLongArray(a6, (long[]) b6);
            } else if (b6 instanceof short[]) {
                bundle.putShortArray(a6, (short[]) b6);
            } else if (b6 instanceof Object[]) {
                Class<?> componentType = b6.getClass().getComponentType();
                l0.m(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(a6, (Parcelable[]) b6);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(a6, (String[]) b6);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(a6, (CharSequence[]) b6);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + ((Object) componentType.getCanonicalName()) + " for key \"" + a6 + Typography.f27126b);
                    }
                    bundle.putSerializable(a6, (Serializable) b6);
                }
            } else if (b6 instanceof Serializable) {
                bundle.putSerializable(a6, (Serializable) b6);
            } else if (b6 instanceof IBinder) {
                bundle.putBinder(a6, (IBinder) b6);
            } else if (b6 instanceof Size) {
                bundle.putSize(a6, (Size) b6);
            } else {
                if (!(b6 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + ((Object) b6.getClass().getCanonicalName()) + " for key \"" + a6 + Typography.f27126b);
                }
                bundle.putSizeF(a6, (SizeF) b6);
            }
        }
        return bundle;
    }
}
