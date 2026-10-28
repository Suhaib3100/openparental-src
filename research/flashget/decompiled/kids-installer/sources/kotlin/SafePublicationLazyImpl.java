package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LazyJVM.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000 \u0013*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0013B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0088\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "final", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.b1, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class SafePublicationLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    public static final a f23061r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f23062s = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, ProtectedSandApp.s("㜮"));

    /* renamed from: o, reason: collision with root package name */
    @d5.e
    private volatile q3.a<? extends T> f23063o;

    /* renamed from: p, reason: collision with root package name */
    @d5.e
    private volatile Object f23064p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final Object f23065q;

    /* compiled from: LazyJVM.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R^\u0010\u0003\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001 \u0006*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/SafePublicationLazyImpl$Companion;", "", "()V", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/SafePublicationLazyImpl;", "kotlin.jvm.PlatformType", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.b1$a */
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public SafePublicationLazyImpl(@d5.d q3.a<? extends T> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("㜯"));
        this.f23063o = aVar;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f23336a;
        this.f23064p = uninitialized_value;
        this.f23065q = uninitialized_value;
    }

    private final Object a() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T t5 = (T) this.f23064p;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f23336a;
        if (t5 != uninitialized_value) {
            return t5;
        }
        q3.a<? extends T> aVar = this.f23063o;
        if (aVar != null) {
            T n5 = aVar.n();
            if (androidx.concurrent.futures.d.a(f23062s, this, uninitialized_value, n5)) {
                this.f23063o = null;
                return n5;
            }
        }
        return (T) this.f23064p;
    }

    @Override // kotlin.Lazy
    public boolean l() {
        return this.f23064p != UNINITIALIZED_VALUE.f23336a;
    }

    @d5.d
    public String toString() {
        return l() ? String.valueOf(getValue()) : ProtectedSandApp.s("㜰");
    }
}
