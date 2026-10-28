package androidx.work;

import androidx.annotation.c1;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DirectExecutor.kt */
@c1({c1.a.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/work/i;", "", "Ljava/util/concurrent/Executor;", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/Runnable;", "command", "Lkotlin/k2;", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "INSTANCE", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public enum i implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(@fg.l Runnable command) {
        l0.p(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    @fg.l
    public String toString() {
        return "DirectExecutor";
    }
}
