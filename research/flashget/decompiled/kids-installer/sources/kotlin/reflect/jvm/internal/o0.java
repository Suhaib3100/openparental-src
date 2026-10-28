package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: moduleByClassLoader.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u000b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/o0;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ClassLoader;", "a", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "ref", "b", "I", "getIdentityHashCode", "()I", "identityHashCode", "c", "Ljava/lang/ClassLoader;", "getTemporaryStrongRef", "()Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "temporaryStrongRef", "classLoader", "<init>", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
final class o0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final WeakReference<ClassLoader> ref;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int identityHashCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private ClassLoader temporaryStrongRef;

    public o0(@d5.d ClassLoader classLoader) {
        kotlin.jvm.internal.l0.p(classLoader, ProtectedSandApp.s("姡"));
        this.ref = new WeakReference<>(classLoader);
        this.identityHashCode = System.identityHashCode(classLoader);
        this.temporaryStrongRef = classLoader;
    }

    public final void a(@d5.e ClassLoader classLoader) {
        this.temporaryStrongRef = classLoader;
    }

    public boolean equals(@d5.e Object other) {
        return (other instanceof o0) && this.ref.get() == ((o0) other).ref.get();
    }

    /* renamed from: hashCode, reason: from getter */
    public int getIdentityHashCode() {
        return this.identityHashCode;
    }

    @d5.d
    public String toString() {
        String obj;
        ClassLoader classLoader = this.ref.get();
        return (classLoader == null || (obj = classLoader.toString()) == null) ? ProtectedSandApp.s("姢") : obj;
    }
}
