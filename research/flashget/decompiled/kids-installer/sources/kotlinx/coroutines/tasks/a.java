package kotlinx.coroutines.tasks;

import d5.d;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/tasks/a;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "r", "Lkotlin/m2;", "execute", "<init>", "()V", "kotlinx-coroutines-play-services"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class a implements Executor {

    /* renamed from: o, reason: collision with root package name */
    @d
    public static final a f29009o = new a();

    private a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(@d Runnable runnable) {
        runnable.run();
    }
}
