package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.embedding.l;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: EmbeddingTranslatingCallback.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/window/embedding/n;", "Ljava/util/function/Consumer;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "Landroidx/window/embedding/l$a;", "callback", "Landroidx/window/embedding/i;", "adapter", "<init>", "(Landroidx/window/embedding/l$a;Landroidx/window/embedding/i;)V", "splitInfoList", "Lkotlin/k2;", "a", "(Ljava/util/List;)V", "b", "Landroidx/window/embedding/l$a;", "c", "Landroidx/window/embedding/i;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"NewApi"})
/* loaded from: classes3.dex */
public final class n implements Consumer<List<? extends SplitInfo>> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l.a callback;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i adapter;

    public n(@fg.l l.a callback, @fg.l i adapter) {
        l0.p(callback, "callback");
        l0.p(adapter, "adapter");
        this.callback = callback;
        this.adapter = adapter;
    }

    @Override // java.util.function.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(@fg.l List<? extends SplitInfo> splitInfoList) {
        l0.p(splitInfoList, "splitInfoList");
        this.callback.a(this.adapter.i(splitInfoList));
    }
}
