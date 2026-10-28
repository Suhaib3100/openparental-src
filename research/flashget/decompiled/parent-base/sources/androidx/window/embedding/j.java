package androidx.window.embedding;

import android.app.Activity;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: EmbeddingBackend.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H&¢\u0006\u0004\b\r\u0010\fJ3\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H&¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/window/embedding/j;", "", "", "Landroidx/window/embedding/m;", "rules", "Lkotlin/k2;", "a", "(Ljava/util/Set;)V", "b", "()Ljava/util/Set;", "rule", "d", "(Landroidx/window/embedding/m;)V", "g", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/e;", "", "Landroidx/window/embedding/t;", "callback", "c", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/e;)V", "consumer", "e", "(Landroidx/core/util/e;)V", "", "f", "()Z", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface j {
    void a(@fg.l Set<? extends m> rules);

    @fg.l
    Set<m> b();

    void c(@fg.l Activity activity, @fg.l Executor executor, @fg.l androidx.core.util.e<List<t>> callback);

    void d(@fg.l m rule);

    void e(@fg.l androidx.core.util.e<List<t>> consumer);

    boolean f();

    void g(@fg.l m rule);
}
