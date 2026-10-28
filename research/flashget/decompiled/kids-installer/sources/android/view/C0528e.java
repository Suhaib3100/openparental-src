package android.view;

import d5.d;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.s2;
import kotlinx.coroutines.u0;

/* compiled from: ViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/e;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "close", "Lkotlin/coroutines/g;", "o", "Lkotlin/coroutines/g;", "b0", "()Lkotlin/coroutines/g;", "coroutineContext", "context", "<init>", "(Lkotlin/coroutines/g;)V", "lifecycle-viewmodel-ktx_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0528e implements Closeable, u0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d
    private final CoroutineContext coroutineContext;

    public C0528e(@d CoroutineContext context) {
        l0.p(context, "context");
        this.coroutineContext = context;
    }

    @Override // kotlinx.coroutines.u0
    @d
    /* renamed from: b0, reason: from getter */
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        s2.i(this.coroutineContext, null, 1, null);
    }
}
