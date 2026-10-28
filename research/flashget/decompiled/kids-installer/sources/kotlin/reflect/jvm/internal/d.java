package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: CacheByClass.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0005\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/d;", "V", "Lkotlin/reflect/jvm/internal/a;", "Ljava/lang/Class;", "key", "b", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/m2;", "a", "Lkotlin/reflect/jvm/internal/e;", "Lkotlin/reflect/jvm/internal/e;", "classValue", "Lkotlin/Function1;", "compute", "<init>", "(Lq3/l;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
final class d<V> extends a<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private volatile e<V> classValue;

    public d(@d5.d q3.l<? super Class<?>, ? extends V> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("䎺"));
        this.classValue = new e<>(lVar);
    }

    @Override // kotlin.reflect.jvm.internal.a
    public void a() {
        this.classValue = this.classValue.b();
    }

    @Override // kotlin.reflect.jvm.internal.a
    public V b(@d5.d Class<?> key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("䎻"));
        e<V> eVar = this.classValue;
        V v5 = eVar.get(key).get();
        if (v5 != null) {
            return v5;
        }
        eVar.remove(key);
        V v6 = eVar.get(key).get();
        return v6 != null ? v6 : eVar.compute.N(key);
    }
}
