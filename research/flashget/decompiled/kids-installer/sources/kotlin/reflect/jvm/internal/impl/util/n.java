package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.util.a;

/* compiled from: ArrayMapOwner.kt */
/* loaded from: classes5.dex */
public final class n<K, V, T extends V> extends a.AbstractC0394a<K, V, T> implements ReadOnlyProperty<a<K, V>, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@d5.d KClass<? extends K> kClass, int i5) {
        super(kClass, i5);
        l0.p(kClass, ProtectedSandApp.s("増"));
    }

    @Override // kotlin.properties.ReadOnlyProperty
    @d5.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public T a(@d5.d a<K, V> aVar, @d5.d KProperty<?> kProperty) {
        l0.p(aVar, ProtectedSandApp.s("墘"));
        l0.p(kProperty, ProtectedSandApp.s("墙"));
        return c(aVar);
    }
}
