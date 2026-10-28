package kotlinx.coroutines.internal;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.b1;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.v2;

/* compiled from: MainDispatchers.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010#\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lkotlinx/coroutines/internal/f0;", "Lkotlinx/coroutines/v2;", "Lkotlinx/coroutines/b1;", "", "cause", "", "errorHint", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "", "n1", "()Ljava/lang/Void;", "Lkotlin/coroutines/g;", "context", "", "c1", "(Lkotlin/coroutines/g;)Z", "", "parallelism", "Lkotlinx/coroutines/m0;", "e1", "(I)Lkotlinx/coroutines/m0;", "", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/m1;", "q", "(JLjava/lang/Runnable;Lkotlin/coroutines/g;)Lkotlinx/coroutines/m1;", "l1", "(Lkotlin/coroutines/g;Ljava/lang/Runnable;)Ljava/lang/Void;", "Lkotlinx/coroutines/p;", "Lkotlin/k2;", "continuation", "t1", "(JLkotlinx/coroutines/p;)Ljava/lang/Void;", "toString", "()Ljava/lang/String;", "d", "Ljava/lang/Throwable;", "e", "Ljava/lang/String;", "j1", "()Lkotlinx/coroutines/v2;", "immediate", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MissingMainCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: classes7.dex */
final class f0 extends v2 implements kotlinx.coroutines.b1 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Throwable cause;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String errorHint;

    public /* synthetic */ f0(Throwable th, String str, int i4, kotlin.jvm.internal.w wVar) {
        this(th, (i4 & 2) != 0 ? null : str);
    }

    private final Void n1() {
        String str;
        if (this.cause == null) {
            e0.e();
            throw new KotlinNothingValueException();
        }
        String str2 = this.errorHint;
        if (str2 == null || (str = ProtectedSandApp.s("蟞\u0001").concat(str2)) == null) {
            str = "";
        }
        throw new IllegalStateException(ProtectedSandApp.s("蟟\u0001").concat(str), this.cause);
    }

    @Override // kotlinx.coroutines.m0
    public boolean c1(@fg.l kotlin.coroutines.g context) {
        n1();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.v2, kotlinx.coroutines.m0
    @fg.l
    public kotlinx.coroutines.m0 e1(int parallelism) {
        n1();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.v2
    @fg.l
    public v2 j1() {
        return this;
    }

    @Override // kotlinx.coroutines.m0
    @fg.l
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public Void S0(@fg.l kotlin.coroutines.g context, @fg.l Runnable block) {
        n1();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.b1
    @fg.l
    public m1 q(long timeMillis, @fg.l Runnable block, @fg.l kotlin.coroutines.g context) {
        n1();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.b1
    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object q0(long j4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        return b1.a.a(this, j4, dVar);
    }

    @Override // kotlinx.coroutines.b1
    @fg.l
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public Void a(long timeMillis, @fg.l kotlinx.coroutines.p<? super k2> continuation) {
        n1();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.coroutines.v2, kotlinx.coroutines.m0
    @fg.l
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("蟠\u0001"));
        if (this.cause != null) {
            str = ProtectedSandApp.s("蟡\u0001") + this.cause;
        } else {
            str = "";
        }
        return f3.a(sb, str, ']');
    }

    public f0(@fg.m Throwable th, @fg.m String str) {
        this.cause = th;
        this.errorHint = str;
    }
}
