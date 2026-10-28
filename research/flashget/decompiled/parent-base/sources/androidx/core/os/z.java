package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.x0;
import kotlin.Metadata;

/* compiled from: PersistableBundle.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/core/os/z;", "", "<init>", "()V", "", "capacity", "Landroid/os/PersistableBundle;", "a", "(I)Landroid/os/PersistableBundle;", "persistableBundle", "", "key", "value", "Lkotlin/k2;", "b", "(Landroid/os/PersistableBundle;Ljava/lang/String;Ljava/lang/Object;)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(21)
/* loaded from: classes3.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final z f26558a = new z();

    private z() {
    }

    @fg.l
    @kd.n
    public static final PersistableBundle a(int capacity) {
        return new PersistableBundle(capacity);
    }

    @kd.n
    public static final void b(@fg.l PersistableBundle persistableBundle, @fg.m String key, @fg.m Object value) {
        if (value == null) {
            persistableBundle.putString(key, null);
            return;
        }
        if (value instanceof Boolean) {
            a0.a(persistableBundle, key, ((Boolean) value).booleanValue());
            return;
        }
        if (value instanceof Double) {
            persistableBundle.putDouble(key, ((Number) value).doubleValue());
            return;
        }
        if (value instanceof Integer) {
            persistableBundle.putInt(key, ((Number) value).intValue());
            return;
        }
        if (value instanceof Long) {
            persistableBundle.putLong(key, ((Number) value).longValue());
            return;
        }
        if (value instanceof String) {
            persistableBundle.putString(key, (String) value);
            return;
        }
        if (value instanceof PersistableBundle) {
            persistableBundle.putPersistableBundle(key, (PersistableBundle) value);
            return;
        }
        if (value instanceof boolean[]) {
            a0.b(persistableBundle, key, (boolean[]) value);
            return;
        }
        if (value instanceof double[]) {
            persistableBundle.putDoubleArray(key, (double[]) value);
            return;
        }
        if (value instanceof int[]) {
            persistableBundle.putIntArray(key, (int[]) value);
            return;
        }
        if (value instanceof long[]) {
            persistableBundle.putLongArray(key, (long[]) value);
            return;
        }
        if (!(value instanceof Object[])) {
            throw new IllegalArgumentException("Unsupported value type " + value.getClass().getCanonicalName() + " for key \"" + key + kotlin.text.m0.quote);
        }
        Class<?> componentType = value.getClass().getComponentType();
        kotlin.jvm.internal.l0.m(componentType);
        if (String.class.isAssignableFrom(componentType)) {
            kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            persistableBundle.putStringArray(key, (String[]) value);
            return;
        }
        throw new IllegalArgumentException("Unsupported value array type " + componentType.getCanonicalName() + " for key \"" + key + kotlin.text.m0.quote);
    }
}
