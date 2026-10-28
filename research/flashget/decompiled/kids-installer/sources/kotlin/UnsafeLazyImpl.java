package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: Lazy.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0088\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lkotlin/UnsafeLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.n2, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class UnsafeLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: o, reason: collision with root package name */
    @d5.e
    private q3.a<? extends T> f23672o;

    /* renamed from: p, reason: collision with root package name */
    @d5.e
    private Object f23673p;

    public UnsafeLazyImpl(@d5.d q3.a<? extends T> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("䆤"));
        this.f23672o = aVar;
        this.f23673p = UNINITIALIZED_VALUE.f23336a;
    }

    private final Object a() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.Lazy
    public T getValue() {
        if (this.f23673p == UNINITIALIZED_VALUE.f23336a) {
            q3.a<? extends T> aVar = this.f23672o;
            kotlin.jvm.internal.l0.m(aVar);
            this.f23673p = aVar.n();
            this.f23672o = null;
        }
        return (T) this.f23673p;
    }

    @Override // kotlin.Lazy
    public boolean l() {
        return this.f23673p != UNINITIALIZED_VALUE.f23336a;
    }

    @d5.d
    public String toString() {
        return l() ? String.valueOf(getValue()) : ProtectedSandApp.s("䆥");
    }
}
