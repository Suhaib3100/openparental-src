package androidx.view;

import fg.l;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.r0;

/* compiled from: ViewModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/f;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlin/coroutines/g;)V", "Lkotlin/k2;", "close", "()V", "b", "Lkotlin/coroutines/g;", "q", "()Lkotlin/coroutines/g;", "coroutineContext", "lifecycle-viewmodel-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1424f implements Closeable, r0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final g coroutineContext;

    public C1424f(@l g context) {
        l0.p(context, "context");
        this.coroutineContext = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p2.i(this.coroutineContext, null, 1, null);
    }

    @Override // kotlinx.coroutines.r0
    @l
    /* renamed from: q, reason: from getter */
    public g getCoroutineContext() {
        return this.coroutineContext;
    }
}
