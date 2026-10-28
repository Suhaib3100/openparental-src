package androidx.work;

import android.content.Context;
import androidx.annotation.o0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* compiled from: ProgressUpdater.java */
/* loaded from: classes3.dex */
public interface b0 {
    @o0
    ListenableFuture<Void> a(@o0 Context context, @o0 UUID id2, @o0 f data);
}
