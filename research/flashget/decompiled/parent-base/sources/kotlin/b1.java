package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LazyJVM.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u0000 \u001b*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\nB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001c"}, d2 = {"Lkotlin/b1;", "T", "Lkotlin/b0;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(Lld/a;)V", "", "a", "()Ljava/lang/Object;", "", "p", "()Z", "", "toString", "()Ljava/lang/String;", "b", "Lld/a;", "c", "Ljava/lang/Object;", "_value", "d", "final", "getValue", "value", "e", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class b1<T> implements b0<T>, Serializable {

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<b1<?>, Object> f74821f = AtomicReferenceFieldUpdater.newUpdater(b1.class, Object.class, ProtectedSandApp.s("悃\u0001"));

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private volatile ld.a<? extends T> initializer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private volatile Object _value;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object final;

    public b1(@fg.l ld.a<? extends T> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("悄\u0001"));
        this.initializer = aVar;
        e2 e2Var = e2.f75087a;
        this._value = e2Var;
        this.final = e2Var;
    }

    private final Object a() {
        return new x(getValue());
    }

    @Override // kotlin.b0
    public T getValue() {
        T t4 = (T) this._value;
        e2 e2Var = e2.f75087a;
        if (t4 != e2Var) {
            return t4;
        }
        ld.a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (androidx.concurrent.futures.c.a(f74821f, this, e2Var, invoke)) {
                this.initializer = null;
                return invoke;
            }
        }
        return (T) this._value;
    }

    @Override // kotlin.b0
    public boolean p() {
        return this._value != e2.f75087a;
    }

    @fg.l
    public String toString() {
        return p() ? String.valueOf(getValue()) : ProtectedSandApp.s("悅\u0001");
    }
}
