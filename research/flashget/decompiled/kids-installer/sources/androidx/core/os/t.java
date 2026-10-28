package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.x0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.l0;
import kotlin.text.Typography;

/* compiled from: PersistableBundle.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lkotlin/q0;", "", "", "pairs", "Landroid/os/PersistableBundle;", "a", "([Lkotlin/q0;)Landroid/os/PersistableBundle;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class t {
    @x0(21)
    @d5.d
    public static final PersistableBundle a(@d5.d Pair<String, ? extends Object>... pairs) {
        l0.p(pairs, "pairs");
        PersistableBundle persistableBundle = new PersistableBundle(pairs.length);
        int length = pairs.length;
        int i5 = 0;
        while (i5 < length) {
            Pair<String, ? extends Object> pair = pairs[i5];
            i5++;
            String a6 = pair.a();
            Object b6 = pair.b();
            if (b6 == null) {
                persistableBundle.putString(a6, null);
            } else if (b6 instanceof Boolean) {
                persistableBundle.putBoolean(a6, ((Boolean) b6).booleanValue());
            } else if (b6 instanceof Double) {
                persistableBundle.putDouble(a6, ((Number) b6).doubleValue());
            } else if (b6 instanceof Integer) {
                persistableBundle.putInt(a6, ((Number) b6).intValue());
            } else if (b6 instanceof Long) {
                persistableBundle.putLong(a6, ((Number) b6).longValue());
            } else if (b6 instanceof String) {
                persistableBundle.putString(a6, (String) b6);
            } else if (b6 instanceof boolean[]) {
                persistableBundle.putBooleanArray(a6, (boolean[]) b6);
            } else if (b6 instanceof double[]) {
                persistableBundle.putDoubleArray(a6, (double[]) b6);
            } else if (b6 instanceof int[]) {
                persistableBundle.putIntArray(a6, (int[]) b6);
            } else if (b6 instanceof long[]) {
                persistableBundle.putLongArray(a6, (long[]) b6);
            } else {
                if (!(b6 instanceof Object[])) {
                    throw new IllegalArgumentException("Illegal value type " + ((Object) b6.getClass().getCanonicalName()) + " for key \"" + a6 + Typography.f27126b);
                }
                Class<?> componentType = b6.getClass().getComponentType();
                l0.m(componentType);
                if (!String.class.isAssignableFrom(componentType)) {
                    throw new IllegalArgumentException("Illegal value array type " + ((Object) componentType.getCanonicalName()) + " for key \"" + a6 + Typography.f27126b);
                }
                persistableBundle.putStringArray(a6, (String[]) b6);
            }
        }
        return persistableBundle;
    }
}
