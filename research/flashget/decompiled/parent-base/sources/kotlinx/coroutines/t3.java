package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Timeout.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/t3;", "U", "T", "Lkotlinx/coroutines/internal/o0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "time", "Lkotlin/coroutines/d;", "uCont", "<init>", "(JLkotlin/coroutines/d;)V", "Lkotlin/k2;", "run", "()V", "", "x1", "()Ljava/lang/String;", "f", "J", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class t3<U, T extends U> extends kotlinx.coroutines.internal.o0<T> implements Runnable {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final long time;

    public t3(long j4, @fg.l kotlin.coroutines.d<? super U> dVar) {
        super(dVar.getF75269b(), dVar);
        this.time = j4;
    }

    @Override // java.lang.Runnable
    public void run() {
        F0(u3.a(this.time, c1.d(getF75269b()), this));
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.r2
    @fg.l
    public String x1() {
        StringBuilder sb = new StringBuilder();
        sb.append(w0.a(this));
        sb.append(ProtectedSandApp.s("裿\u0001"));
        return androidx.collection.y0.a(sb, this.time, ')');
    }
}
