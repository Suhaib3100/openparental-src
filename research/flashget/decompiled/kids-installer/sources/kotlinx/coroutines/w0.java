package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* compiled from: CoroutineStart.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ^\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u00022'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/w0;", "", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "completion", "Lkotlin/m2;", "invoke", "(Lq3/l;Lkotlin/coroutines/d;)V", "R", "Lkotlin/Function2;", "Lkotlin/u;", "receiver", "(Lq3/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public enum w0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: CoroutineStart.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29055a;

        static {
            int[] iArr = new int[w0.values().length];
            iArr[w0.DEFAULT.ordinal()] = 1;
            iArr[w0.ATOMIC.ordinal()] = 2;
            iArr[w0.UNDISPATCHED.ordinal()] = 3;
            iArr[w0.LAZY.ordinal()] = 4;
            f29055a = iArr;
        }
    }

    @i2
    public static /* synthetic */ void isLazy$annotations() {
    }

    @i2
    public final <T> void invoke(@d5.d q3.l<? super Continuation<? super T>, ? extends Object> block, @d5.d Continuation<? super T> completion) {
        int i5 = a.f29055a[ordinal()];
        if (i5 == 1) {
            q4.a.d(block, completion);
            return;
        }
        if (i5 == 2) {
            kotlin.coroutines.f.h(block, completion);
        } else if (i5 == 3) {
            q4.b.a(block, completion);
        } else if (i5 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    @i2
    public final <R, T> void invoke(@d5.d q3.p<? super R, ? super Continuation<? super T>, ? extends Object> block, R receiver, @d5.d Continuation<? super T> completion) {
        int i5 = a.f29055a[ordinal()];
        if (i5 == 1) {
            q4.a.f(block, receiver, completion, null, 4, null);
            return;
        }
        if (i5 == 2) {
            kotlin.coroutines.f.i(block, receiver, completion);
        } else if (i5 == 3) {
            q4.b.b(block, receiver, completion);
        } else if (i5 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
