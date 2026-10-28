package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;

/* compiled from: Lazy.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0019"}, d2 = {"Lkotlin/l2;", "T", "Lkotlin/b0;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(Lld/a;)V", "", "a", "()Ljava/lang/Object;", "", "p", "()Z", "", "toString", "()Ljava/lang/String;", "b", "Lld/a;", "c", "Ljava/lang/Object;", "_value", "getValue", "value", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class l2<T> implements b0<T>, Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.a<? extends T> initializer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object _value;

    public l2(@fg.l ld.a<? extends T> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("敽\u0001"));
        this.initializer = aVar;
        this._value = e2.f75087a;
    }

    private final Object a() {
        return new x(getValue());
    }

    @Override // kotlin.b0
    public T getValue() {
        if (this._value == e2.f75087a) {
            ld.a<? extends T> aVar = this.initializer;
            kotlin.jvm.internal.l0.m(aVar);
            this._value = aVar.invoke();
            this.initializer = null;
        }
        return (T) this._value;
    }

    @Override // kotlin.b0
    public boolean p() {
        return this._value != e2.f75087a;
    }

    @fg.l
    public String toString() {
        return p() ? String.valueOf(getValue()) : ProtectedSandApp.s("敾\u0001");
    }
}
