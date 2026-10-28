package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: LazyJVM.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0088\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "lock", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "_value", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.j1, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class SynchronizedLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: o, reason: collision with root package name */
    @d5.e
    private q3.a<? extends T> f23512o;

    /* renamed from: p, reason: collision with root package name */
    @d5.e
    private volatile Object f23513p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final Object f23514q;

    public SynchronizedLazyImpl(@d5.d q3.a<? extends T> aVar, @d5.e Object obj) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("䄹"));
        this.f23512o = aVar;
        this.f23513p = UNINITIALIZED_VALUE.f23336a;
        this.f23514q = obj == null ? this : obj;
    }

    private final Object a() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T t5;
        T t6 = (T) this.f23513p;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.f23336a;
        if (t6 != uninitialized_value) {
            return t6;
        }
        synchronized (this.f23514q) {
            t5 = (T) this.f23513p;
            if (t5 == uninitialized_value) {
                q3.a<? extends T> aVar = this.f23512o;
                kotlin.jvm.internal.l0.m(aVar);
                t5 = aVar.n();
                this.f23513p = t5;
                this.f23512o = null;
            }
        }
        return t5;
    }

    @Override // kotlin.Lazy
    public boolean l() {
        return this.f23513p != UNINITIALIZED_VALUE.f23336a;
    }

    @d5.d
    public String toString() {
        return l() ? String.valueOf(getValue()) : ProtectedSandApp.s("䄺");
    }

    public /* synthetic */ SynchronizedLazyImpl(q3.a aVar, Object obj, int i5, kotlin.jvm.internal.w wVar) {
        this(aVar, (i5 & 2) != 0 ? null : obj);
    }
}
