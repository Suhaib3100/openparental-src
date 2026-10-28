package kotlin.coroutines.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;

/* compiled from: ContinuationImpl.kt */
@c1(version = "1.3")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004B!\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/coroutines/jvm/internal/o;", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/jvm/internal/e0;", "", "Lkotlin/coroutines/jvm/internal/n;", "", "arity", "Lkotlin/coroutines/d;", "completion", "<init>", "(ILkotlin/coroutines/d;)V", "(I)V", "", "toString", "()Ljava/lang/String;", "I", "getArity", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class o extends d implements e0<Object>, n {
    private final int arity;

    public o(int i4, @fg.m kotlin.coroutines.d<Object> dVar) {
        super(dVar);
        this.arity = i4;
    }

    @Override // kotlin.jvm.internal.e0
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @fg.l
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String w4 = l1.w(this);
        l0.o(w4, ProtectedSandApp.s("捀\u0001"));
        return w4;
    }

    public o(int i4) {
        this(i4, null);
    }
}
