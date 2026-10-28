package androidx.work.multiprocess;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.work.u;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* compiled from: RemoteWorkContinuation.java */
/* loaded from: classes3.dex */
public abstract class d {
    @c1({c1.a.LIBRARY_GROUP})
    protected d() {
    }

    @o0
    public static d a(@o0 List<d> continuations) {
        return continuations.get(0).b(continuations);
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    protected abstract d b(@o0 List<d> continuations);

    @o0
    public abstract ListenableFuture<Void> c();

    @o0
    public final d d(@o0 u work) {
        return e(Collections.singletonList(work));
    }

    @o0
    public abstract d e(@o0 List<u> work);
}
