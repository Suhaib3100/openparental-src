package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.ref.SoftReference;
import kotlin.Metadata;

/* compiled from: CacheByClass.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001f\u0012\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0014J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000R$\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/e;", "V", "Ljava/lang/ClassValue;", "Ljava/lang/ref/SoftReference;", "Ljava/lang/Class;", "type", "a", "b", "Lkotlin/Function1;", "Lq3/l;", "compute", "<init>", "(Lq3/l;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
final class e<V> extends ClassValue<SoftReference<V>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final q3.l<Class<?>, V> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@d5.d q3.l<? super Class<?>, ? extends V> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("䎽"));
        this.compute = lVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ClassValue
    @d5.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SoftReference<V> computeValue(@d5.d Class<?> type) {
        kotlin.jvm.internal.l0.p(type, ProtectedSandApp.s("䎾"));
        return new SoftReference<>(this.compute.N(type));
    }

    @d5.d
    public final e<V> b() {
        return new e<>(this.compute);
    }
}
