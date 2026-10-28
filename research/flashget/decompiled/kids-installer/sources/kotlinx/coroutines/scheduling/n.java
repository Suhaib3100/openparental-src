package kotlinx.coroutines.scheduling;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlinx.coroutines.z0;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/scheduling/n;", "Lkotlinx/coroutines/scheduling/k;", "Lkotlin/m2;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "q", "Ljava/lang/Runnable;", "block", "", "submissionTime", "Lkotlinx/coroutines/scheduling/l;", "taskContext", "<init>", "(Ljava/lang/Runnable;JLkotlinx/coroutines/scheduling/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class n extends k {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final Runnable block;

    public n(@d5.d Runnable runnable, long j5, @d5.d l lVar) {
        super(j5, lVar);
        this.block = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.block.run();
        } finally {
            this.taskContext.r();
        }
    }

    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("幅"));
        sb.append(z0.a(this.block));
        sb.append('@');
        sb.append(z0.b(this.block));
        String s5 = ProtectedSandApp.s("幆");
        sb.append(s5);
        sb.append(this.submissionTime);
        sb.append(s5);
        sb.append(this.taskContext);
        sb.append(']');
        return sb.toString();
    }
}
