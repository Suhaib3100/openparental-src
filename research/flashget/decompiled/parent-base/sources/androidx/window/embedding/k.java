package androidx.window.embedding;

import androidx.window.embedding.l;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: EmbeddingCompat.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/window/embedding/k;", "Landroidx/window/embedding/l;", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "embeddingExtension", "Landroidx/window/embedding/i;", "adapter", "<init>", "(Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;Landroidx/window/embedding/i;)V", "()V", "", "Landroidx/window/embedding/m;", "rules", "Lkotlin/k2;", "a", "(Ljava/util/Set;)V", "Landroidx/window/embedding/l$a;", "embeddingCallback", "b", "(Landroidx/window/embedding/l$a;)V", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "Landroidx/window/embedding/i;", "c", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f35729d = true;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ActivityEmbeddingComponent embeddingExtension;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i adapter;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final String f35730e = "EmbeddingCompat";

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: EmbeddingCompat.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/window/embedding/k$a;", "", "<init>", "()V", "", "b", "()Ljava/lang/Integer;", "", "c", "()Z", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "a", "()Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.window.embedding.k$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final ActivityEmbeddingComponent a() {
            if (!c()) {
                return new o();
            }
            ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
            return activityEmbeddingComponent == null ? new o() : activityEmbeddingComponent;
        }

        @fg.m
        public final Integer b() {
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public final boolean c() {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return false;
            }
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public k(@fg.l ActivityEmbeddingComponent embeddingExtension, @fg.l i adapter) {
        l0.p(embeddingExtension, "embeddingExtension");
        l0.p(adapter, "adapter");
        this.embeddingExtension = embeddingExtension;
        this.adapter = adapter;
    }

    @Override // androidx.window.embedding.l
    public void a(@fg.l Set<? extends m> rules) {
        l0.p(rules, "rules");
        this.embeddingExtension.setEmbeddingRules(this.adapter.j(rules));
    }

    @Override // androidx.window.embedding.l
    public void b(@fg.l l.a embeddingCallback) {
        l0.p(embeddingCallback, "embeddingCallback");
        this.embeddingExtension.setSplitInfoCallback(new n(embeddingCallback, this.adapter));
    }

    public k() {
        this(INSTANCE.a(), new i());
    }
}
