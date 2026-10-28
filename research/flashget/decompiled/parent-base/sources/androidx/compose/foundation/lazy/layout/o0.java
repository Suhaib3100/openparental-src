package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: LazyLayoutItemContentFactory.kt */
@x4
@kd.g
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00028\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/layout/o0;", "T", "", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "g", "(Ljava/lang/Object;)Ljava/lang/String;", "", "f", "(Ljava/lang/Object;)I", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class o0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ o0(Object obj) {
        this.value = obj;
    }

    public static final /* synthetic */ o0 a(Object obj) {
        return new o0(obj);
    }

    @fg.l
    public static <T> Object b(T t4) {
        return t4;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof o0) && kotlin.jvm.internal.l0.g(obj, ((o0) obj2).value);
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.l0.g(obj, obj2);
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String g(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public final T e() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return c(this.value, obj);
    }

    /* renamed from: h, reason: from getter */
    public final /* synthetic */ Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return f(this.value);
    }

    public String toString() {
        return g(this.value);
    }
}
