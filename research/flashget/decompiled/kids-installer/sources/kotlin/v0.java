package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.internal.InlineOnly;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;

/* compiled from: PropertyReferenceDelegates.kt */
@Metadata(d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0087\n¢\u0006\u0002\u0010\u0007\u001a>\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00010\t2\u0006\u0010\u0003\u001a\u0002H\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0087\n¢\u0006\u0002\u0010\n\u001a<\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000e\u001a\u0002H\u0001H\u0087\n¢\u0006\u0002\u0010\u000f\u001aF\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00010\u00102\u0006\u0010\u0003\u001a\u0002H\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u000e\u001a\u0002H\u0001H\u0087\n¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"getValue", "V", "Lkotlin/reflect/KProperty0;", "thisRef", "", "property", "Lkotlin/reflect/KProperty;", "(Lkotlin/reflect/KProperty0;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "T", "Lkotlin/reflect/KProperty1;", "(Lkotlin/reflect/KProperty1;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "Lkotlin/reflect/KMutableProperty0;", "value", "(Lkotlin/reflect/KMutableProperty0;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Lkotlin/reflect/KMutableProperty1;", "(Lkotlin/reflect/KMutableProperty1;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class v0 {
    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> V a(KProperty0<? extends V> kProperty0, Object obj, KProperty<?> kProperty) {
        kotlin.jvm.internal.l0.p(kProperty0, ProtectedSandApp.s("屫"));
        kotlin.jvm.internal.l0.p(kProperty, ProtectedSandApp.s("屬"));
        return kProperty0.get();
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <T, V> V b(KProperty1<T, ? extends V> kProperty1, T t5, KProperty<?> kProperty) {
        kotlin.jvm.internal.l0.p(kProperty1, ProtectedSandApp.s("屭"));
        kotlin.jvm.internal.l0.p(kProperty, ProtectedSandApp.s("屮"));
        return kProperty1.get(t5);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <V> void c(KMutableProperty0<V> kMutableProperty0, Object obj, KProperty<?> kProperty, V v5) {
        kotlin.jvm.internal.l0.p(kMutableProperty0, ProtectedSandApp.s("屯"));
        kotlin.jvm.internal.l0.p(kProperty, ProtectedSandApp.s("屰"));
        kMutableProperty0.set(v5);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final <T, V> void d(KMutableProperty1<T, V> kMutableProperty1, T t5, KProperty<?> kProperty, V v5) {
        kotlin.jvm.internal.l0.p(kMutableProperty1, ProtectedSandApp.s("山"));
        kotlin.jvm.internal.l0.p(kProperty, ProtectedSandApp.s("屲"));
        kMutableProperty1.c0(t5, v5);
    }
}
