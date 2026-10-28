package androidx.window.embedding;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: EmbeddingInterfaceCompat.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/window/embedding/l;", "", "", "Landroidx/window/embedding/m;", "rules", "Lkotlin/k2;", "a", "(Ljava/util/Set;)V", "Landroidx/window/embedding/l$a;", "embeddingCallback", "b", "(Landroidx/window/embedding/l$a;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface l {

    /* compiled from: EmbeddingInterfaceCompat.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/window/embedding/l$a;", "", "", "Landroidx/window/embedding/t;", "splitInfo", "Lkotlin/k2;", "a", "(Ljava/util/List;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface a {
        void a(@fg.l List<t> splitInfo);
    }

    void a(@fg.l Set<? extends m> rules);

    void b(@fg.l a embeddingCallback);
}
