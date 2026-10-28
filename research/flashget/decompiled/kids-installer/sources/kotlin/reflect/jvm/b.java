package kotlin.reflect.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.l;
import kotlin.reflect.jvm.internal.n0;
import p3.i;

/* compiled from: KCallablesJvm.kt */
@i(name = "KCallablesJvm")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\",\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/reflect/c;", "", "value", "a", "(Lkotlin/reflect/c;)Z", "b", "(Lkotlin/reflect/c;Z)V", "isAccessible", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class b {
    public static final boolean a(@d5.d KCallable<?> kCallable) {
        kotlin.reflect.jvm.internal.calls.e<?> B0;
        l0.p(kCallable, ProtectedSandApp.s("䌵"));
        if (kCallable instanceof KMutableProperty) {
            KProperty kProperty = (KProperty) kCallable;
            Field c6 = e.c(kProperty);
            if (!(c6 != null ? c6.isAccessible() : true)) {
                return false;
            }
            Method d6 = e.d(kProperty);
            if (!(d6 != null ? d6.isAccessible() : true)) {
                return false;
            }
            Method f6 = e.f((KMutableProperty) kCallable);
            if (!(f6 != null ? f6.isAccessible() : true)) {
                return false;
            }
        } else if (kCallable instanceof KProperty) {
            KProperty kProperty2 = (KProperty) kCallable;
            Field c7 = e.c(kProperty2);
            if (!(c7 != null ? c7.isAccessible() : true)) {
                return false;
            }
            Method d7 = e.d(kProperty2);
            if (!(d7 != null ? d7.isAccessible() : true)) {
                return false;
            }
        } else if (kCallable instanceof KProperty.c) {
            Field c8 = e.c(((KProperty.c) kCallable).s0());
            if (!(c8 != null ? c8.isAccessible() : true)) {
                return false;
            }
            Method e6 = e.e((KFunction) kCallable);
            if (!(e6 != null ? e6.isAccessible() : true)) {
                return false;
            }
        } else if (kCallable instanceof KMutableProperty.b) {
            Field c9 = e.c(((KMutableProperty.b) kCallable).s0());
            if (!(c9 != null ? c9.isAccessible() : true)) {
                return false;
            }
            Method e7 = e.e((KFunction) kCallable);
            if (!(e7 != null ? e7.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(kCallable instanceof KFunction)) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("䌶") + kCallable + ProtectedSandApp.s("䌷") + kCallable.getClass() + ')');
            }
            KFunction kFunction = (KFunction) kCallable;
            Method e8 = e.e(kFunction);
            if (!(e8 != null ? e8.isAccessible() : true)) {
                return false;
            }
            l<?> b6 = n0.b(kCallable);
            Object b7 = (b6 == null || (B0 = b6.B0()) == null) ? null : B0.b();
            AccessibleObject accessibleObject = b7 instanceof AccessibleObject ? (AccessibleObject) b7 : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            Constructor a6 = e.a(kFunction);
            if (!(a6 != null ? a6.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final void b(@d5.d KCallable<?> kCallable, boolean z5) {
        kotlin.reflect.jvm.internal.calls.e<?> B0;
        l0.p(kCallable, ProtectedSandApp.s("䌸"));
        if (kCallable instanceof KMutableProperty) {
            KProperty kProperty = (KProperty) kCallable;
            Field c6 = e.c(kProperty);
            if (c6 != null) {
                c6.setAccessible(z5);
            }
            Method d6 = e.d(kProperty);
            if (d6 != null) {
                d6.setAccessible(z5);
            }
            Method f6 = e.f((KMutableProperty) kCallable);
            if (f6 == null) {
                return;
            }
            f6.setAccessible(z5);
            return;
        }
        if (kCallable instanceof KProperty) {
            KProperty kProperty2 = (KProperty) kCallable;
            Field c7 = e.c(kProperty2);
            if (c7 != null) {
                c7.setAccessible(z5);
            }
            Method d7 = e.d(kProperty2);
            if (d7 == null) {
                return;
            }
            d7.setAccessible(z5);
            return;
        }
        if (kCallable instanceof KProperty.c) {
            Field c8 = e.c(((KProperty.c) kCallable).s0());
            if (c8 != null) {
                c8.setAccessible(z5);
            }
            Method e6 = e.e((KFunction) kCallable);
            if (e6 == null) {
                return;
            }
            e6.setAccessible(z5);
            return;
        }
        if (kCallable instanceof KMutableProperty.b) {
            Field c9 = e.c(((KMutableProperty.b) kCallable).s0());
            if (c9 != null) {
                c9.setAccessible(z5);
            }
            Method e7 = e.e((KFunction) kCallable);
            if (e7 == null) {
                return;
            }
            e7.setAccessible(z5);
            return;
        }
        if (!(kCallable instanceof KFunction)) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("䌹") + kCallable + ProtectedSandApp.s("䌺") + kCallable.getClass() + ')');
        }
        KFunction kFunction = (KFunction) kCallable;
        Method e8 = e.e(kFunction);
        if (e8 != null) {
            e8.setAccessible(z5);
        }
        l<?> b6 = n0.b(kCallable);
        Object b7 = (b6 == null || (B0 = b6.B0()) == null) ? null : B0.b();
        AccessibleObject accessibleObject = b7 instanceof AccessibleObject ? (AccessibleObject) b7 : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        Constructor a6 = e.a(kFunction);
        if (a6 == null) {
            return;
        }
        a6.setAccessible(z5);
    }
}
