package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: LazyJVM.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001a\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\f¨\u0006\u001b"}, d2 = {"Lkotlin/j1;", "T", "Lkotlin/b0;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "", "lock", "<init>", "(Lld/a;Ljava/lang/Object;)V", "a", "()Ljava/lang/Object;", "", "p", "()Z", "", "toString", "()Ljava/lang/String;", "b", "Lld/a;", "c", "Ljava/lang/Object;", "_value", "d", "getValue", "value", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class j1<T> implements b0<T>, Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.a<? extends T> initializer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private volatile Object _value;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object lock;

    public j1(@fg.l ld.a<? extends T> aVar, @fg.m Object obj) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("擌\u0001"));
        this.initializer = aVar;
        this._value = e2.f75087a;
        this.lock = obj == null ? this : obj;
    }

    private final Object a() {
        return new x(getValue());
    }

    @Override // kotlin.b0
    public T getValue() {
        T t4;
        T t5 = (T) this._value;
        e2 e2Var = e2.f75087a;
        if (t5 != e2Var) {
            return t5;
        }
        synchronized (this.lock) {
            t4 = (T) this._value;
            if (t4 == e2Var) {
                ld.a<? extends T> aVar = this.initializer;
                kotlin.jvm.internal.l0.m(aVar);
                t4 = aVar.invoke();
                this._value = t4;
                this.initializer = null;
            }
        }
        return t4;
    }

    @Override // kotlin.b0
    public boolean p() {
        return this._value != e2.f75087a;
    }

    @fg.l
    public String toString() {
        return p() ? String.valueOf(getValue()) : ProtectedSandApp.s("操\u0001");
    }

    public /* synthetic */ j1(ld.a aVar, Object obj, int i4, kotlin.jvm.internal.w wVar) {
        this(aVar, (i4 & 2) != 0 ? null : obj);
    }
}
