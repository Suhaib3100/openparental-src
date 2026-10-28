package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.SoftReference;
import kotlin.Metadata;

/* compiled from: CacheByClass.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\f\u0010\rR$\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00028\u00000\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/g;", "V", "Ljava/lang/ClassValue;", "Ljava/lang/ref/SoftReference;", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "<init>", "(Lld/l;)V", "type", "a", "(Ljava/lang/Class;)Ljava/lang/ref/SoftReference;", "b", "()Lkotlin/reflect/jvm/internal/g;", "Lld/l;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class g<V> extends ClassValue<SoftReference<V>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final ld.l<Class<?>, V> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@fg.l ld.l<? super Class<?>, ? extends V> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("束\u0001"));
        this.compute = lVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ClassValue
    @fg.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SoftReference<V> computeValue(@fg.l Class<?> type) {
        kotlin.jvm.internal.l0.p(type, ProtectedSandApp.s("杠\u0001"));
        return new SoftReference<>(this.compute.invoke(type));
    }

    @fg.l
    public final g<V> b() {
        return new g<>(this.compute);
    }
}
