package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CoroutineStart.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ^\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u00042'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e¢\u0006\u0002\b\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/t0;", "", "<init>", "(Ljava/lang/String;I)V", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "completion", "Lkotlin/k2;", "invoke", "(Lld/l;Lkotlin/coroutines/d;)V", "R", "Lkotlin/Function2;", "Lkotlin/u;", "receiver", "(Lld/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum t0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: CoroutineStart.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81148a;

        static {
            int[] iArr = new int[t0.values().length];
            try {
                iArr[t0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t0.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t0.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f81148a = iArr;
        }
    }

    @f2
    public static /* synthetic */ void isLazy$annotations() {
    }

    @f2
    public final <T> void invoke(@fg.l ld.l<? super kotlin.coroutines.d<? super T>, ? extends Object> block, @fg.l kotlin.coroutines.d<? super T> completion) {
        int i4 = a.f81148a[ordinal()];
        if (i4 == 1) {
            me.a.d(block, completion);
            return;
        }
        if (i4 == 2) {
            kotlin.coroutines.f.h(block, completion);
        } else if (i4 == 3) {
            me.b.a(block, completion);
        } else if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    @f2
    public final <R, T> void invoke(@fg.l ld.p<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> block, R receiver, @fg.l kotlin.coroutines.d<? super T> completion) {
        int i4 = a.f81148a[ordinal()];
        if (i4 == 1) {
            me.a.f(block, receiver, completion, null, 4, null);
            return;
        }
        if (i4 == 2) {
            kotlin.coroutines.f.i(block, receiver, completion);
        } else if (i4 == 3) {
            me.b.b(block, receiver, completion);
        } else if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
