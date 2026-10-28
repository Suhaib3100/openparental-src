package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.m2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.y2;

/* compiled from: MainDispatchers.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b(\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001b\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\r2\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016J\u001e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lkotlinx/coroutines/internal/g0;", "Lkotlinx/coroutines/y2;", "Lkotlinx/coroutines/e1;", "", "O0", "Lkotlin/coroutines/g;", "context", "", "B0", "", "parallelism", "Lkotlinx/coroutines/o0;", "E0", "", "time", "e0", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/p1;", "b0", "N0", "Lkotlinx/coroutines/q;", "Lkotlin/m2;", "continuation", "R0", "", "toString", "", "q", "Ljava/lang/Throwable;", "cause", "r", "Ljava/lang/String;", "errorHint", "J0", "()Lkotlinx/coroutines/y2;", "immediate", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class g0 extends y2 implements e1 {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final Throwable cause;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final String errorHint;

    public /* synthetic */ g0(Throwable th, String str, int i5, kotlin.jvm.internal.w wVar) {
        this(th, (i5 & 2) != 0 ? null : str);
    }

    private final Void O0() {
        String str;
        if (this.cause == null) {
            f0.e();
            throw new KotlinNothingValueException();
        }
        String str2 = this.errorHint;
        if (str2 == null || (str = ProtectedSandApp.s("鄲").concat(str2)) == null) {
            str = "";
        }
        throw new IllegalStateException(ProtectedSandApp.s("鄳").concat(str), this.cause);
    }

    @Override // kotlinx.coroutines.o0
    public boolean B0(@d5.d CoroutineContext context) {
        O0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.y2, kotlinx.coroutines.o0
    @d5.d
    public kotlinx.coroutines.o0 E0(int parallelism) {
        O0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.y2
    @d5.d
    public y2 J0() {
        return this;
    }

    @Override // kotlinx.coroutines.o0
    @d5.d
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public Void y0(@d5.d CoroutineContext context, @d5.d Runnable block) {
        O0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.e1
    @d5.d
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public Void g(long timeMillis, @d5.d kotlinx.coroutines.q<? super m2> continuation) {
        O0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.e1
    @d5.d
    public p1 b0(long timeMillis, @d5.d Runnable block, @d5.d CoroutineContext context) {
        O0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.e1
    @d5.e
    public Object e0(long j5, @d5.d Continuation<?> continuation) {
        O0();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.y2, kotlinx.coroutines.o0
    @d5.d
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("鄴"));
        if (this.cause != null) {
            str = ProtectedSandApp.s("鄵") + this.cause;
        } else {
            str = "";
        }
        return c1.c.a(sb, str, ']');
    }

    public g0(@d5.e Throwable th, @d5.e String str) {
        this.cause = th;
        this.errorHint = str;
    }
}
