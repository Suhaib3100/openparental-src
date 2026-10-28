package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: Bundle.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "Lkotlin/q0;", "", "", "pairs", "Landroid/os/Bundle;", "b", "([Lkotlin/q0;)Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {
    @fg.l
    public static final Bundle a() {
        return new Bundle(0);
    }

    @fg.l
    public static final Bundle b(@fg.l kotlin.q0<String, ? extends Object>... q0VarArr) {
        Bundle bundle = new Bundle(q0VarArr.length);
        for (kotlin.q0<String, ? extends Object> q0Var : q0VarArr) {
            String a5 = q0Var.a();
            Object b5 = q0Var.b();
            if (b5 == null) {
                bundle.putString(a5, null);
            } else if (b5 instanceof Boolean) {
                bundle.putBoolean(a5, ((Boolean) b5).booleanValue());
            } else if (b5 instanceof Byte) {
                bundle.putByte(a5, ((Number) b5).byteValue());
            } else if (b5 instanceof Character) {
                bundle.putChar(a5, ((Character) b5).charValue());
            } else if (b5 instanceof Double) {
                bundle.putDouble(a5, ((Number) b5).doubleValue());
            } else if (b5 instanceof Float) {
                bundle.putFloat(a5, ((Number) b5).floatValue());
            } else if (b5 instanceof Integer) {
                bundle.putInt(a5, ((Number) b5).intValue());
            } else if (b5 instanceof Long) {
                bundle.putLong(a5, ((Number) b5).longValue());
            } else if (b5 instanceof Short) {
                bundle.putShort(a5, ((Number) b5).shortValue());
            } else if (b5 instanceof Bundle) {
                bundle.putBundle(a5, (Bundle) b5);
            } else if (b5 instanceof CharSequence) {
                bundle.putCharSequence(a5, (CharSequence) b5);
            } else if (b5 instanceof Parcelable) {
                bundle.putParcelable(a5, (Parcelable) b5);
            } else if (b5 instanceof boolean[]) {
                bundle.putBooleanArray(a5, (boolean[]) b5);
            } else if (b5 instanceof byte[]) {
                bundle.putByteArray(a5, (byte[]) b5);
            } else if (b5 instanceof char[]) {
                bundle.putCharArray(a5, (char[]) b5);
            } else if (b5 instanceof double[]) {
                bundle.putDoubleArray(a5, (double[]) b5);
            } else if (b5 instanceof float[]) {
                bundle.putFloatArray(a5, (float[]) b5);
            } else if (b5 instanceof int[]) {
                bundle.putIntArray(a5, (int[]) b5);
            } else if (b5 instanceof long[]) {
                bundle.putLongArray(a5, (long[]) b5);
            } else if (b5 instanceof short[]) {
                bundle.putShortArray(a5, (short[]) b5);
            } else if (b5 instanceof Object[]) {
                Class<?> componentType = b5.getClass().getComponentType();
                kotlin.jvm.internal.l0.m(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    kotlin.jvm.internal.l0.n(b5, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(a5, (Parcelable[]) b5);
                } else if (String.class.isAssignableFrom(componentType)) {
                    kotlin.jvm.internal.l0.n(b5, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(a5, (String[]) b5);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    kotlin.jvm.internal.l0.n(b5, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(a5, (CharSequence[]) b5);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + a5 + kotlin.text.m0.quote);
                    }
                    bundle.putSerializable(a5, (Serializable) b5);
                }
            } else if (b5 instanceof Serializable) {
                bundle.putSerializable(a5, (Serializable) b5);
            } else if (b5 instanceof IBinder) {
                bundle.putBinder(a5, (IBinder) b5);
            } else if (b5 instanceof Size) {
                c.a(bundle, a5, (Size) b5);
            } else {
                if (!(b5 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + b5.getClass().getCanonicalName() + " for key \"" + a5 + kotlin.text.m0.quote);
                }
                c.b(bundle, a5, (SizeF) b5);
            }
        }
        return bundle;
    }
}
