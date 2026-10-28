package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: CacheByClass.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/f;", "V", "Lkotlin/reflect/jvm/internal/a;", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "<init>", "(Lld/l;)V", "key", "b", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/k2;", "a", "()V", "Lkotlin/reflect/jvm/internal/g;", "Lkotlin/reflect/jvm/internal/g;", "classValue", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nCacheByClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ClassValueCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* loaded from: classes7.dex */
final class f<V> extends a<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private volatile g<V> classValue;

    public f(@fg.l ld.l<? super Class<?>, ? extends V> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("杜\u0001"));
        this.classValue = new g<>(lVar);
    }

    @Override // kotlin.reflect.jvm.internal.a
    public void a() {
        this.classValue = this.classValue.b();
    }

    @Override // kotlin.reflect.jvm.internal.a
    public V b(@fg.l Class<?> key) {
        Object obj;
        Object obj2;
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("杝\u0001"));
        g<V> gVar = this.classValue;
        obj = gVar.get(key);
        V v4 = (V) ((SoftReference) obj).get();
        if (v4 != null) {
            return v4;
        }
        gVar.remove(key);
        obj2 = gVar.get(key);
        V v5 = (V) ((SoftReference) obj2).get();
        return v5 != null ? v5 : gVar.compute.invoke(key);
    }
}
