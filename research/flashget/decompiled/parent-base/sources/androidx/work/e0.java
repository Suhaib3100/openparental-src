package androidx.work;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.view.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* compiled from: WorkContinuation.java */
/* loaded from: classes3.dex */
public abstract class e0 {
    @o0
    public static e0 a(@o0 List<e0> continuations) {
        return continuations.get(0).b(continuations);
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    protected abstract e0 b(@o0 List<e0> continuations);

    @o0
    public abstract w c();

    @o0
    public abstract ListenableFuture<List<f0>> d();

    @o0
    public abstract LiveData<List<f0>> e();

    @o0
    public final e0 f(@o0 u work) {
        return g(Collections.singletonList(work));
    }

    @o0
    public abstract e0 g(@o0 List<u> work);
}
