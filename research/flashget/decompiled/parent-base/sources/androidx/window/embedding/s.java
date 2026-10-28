package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: SplitController.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0003J1\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00072\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Landroidx/window/embedding/s;", "", "<init>", "()V", "", "Landroidx/window/embedding/m;", "staticRules", "Lkotlin/k2;", "m", "(Ljava/util/Set;)V", "h", "()Ljava/util/Set;", "rule", "k", "(Landroidx/window/embedding/m;)V", "n", "f", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/e;", "", "Landroidx/window/embedding/t;", "consumer", "e", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/e;)V", "l", "(Landroidx/core/util/e;)V", "", "j", "()Z", "Landroidx/window/embedding/j;", "a", "Landroidx/window/embedding/j;", "embeddingBackend", "b", "Ljava/util/Set;", "staticSplitRules", "c", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    @fg.m
    private static volatile s f35755d;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f35757f = false;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j embeddingBackend;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Set<? extends m> staticSplitRules;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final ReentrantLock f35756e = new ReentrantLock();

    /* compiled from: SplitController.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/window/embedding/s$a;", "", "<init>", "()V", "Landroidx/window/embedding/s;", "a", "()Landroidx/window/embedding/s;", "Landroid/content/Context;", "context", "", "staticRuleResourceId", "Lkotlin/k2;", "b", "(Landroid/content/Context;I)V", "globalInstance", "Landroidx/window/embedding/s;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "sDebug", "Z", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.window.embedding.s$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final s a() {
            if (s.f35755d == null) {
                ReentrantLock reentrantLock = s.f35756e;
                reentrantLock.lock();
                try {
                    if (s.f35755d == null) {
                        Companion companion = s.INSTANCE;
                        s.f35755d = new s(null);
                    }
                    k2 k2Var = k2.f75408a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            s sVar = s.f35755d;
            l0.m(sVar);
            return sVar;
        }

        @kd.n
        public final void b(@fg.l Context context, int staticRuleResourceId) {
            l0.p(context, "context");
            Set<m> g4 = new y().g(context, staticRuleResourceId);
            s a5 = a();
            if (g4 == null) {
                g4 = kotlin.collections.l0.f74939b;
            }
            a5.m(g4);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ s(kotlin.jvm.internal.w wVar) {
        this();
    }

    @fg.l
    @kd.n
    public static final s g() {
        return INSTANCE.a();
    }

    @kd.n
    public static final void i(@fg.l Context context, int i4) {
        INSTANCE.b(context, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Set<? extends m> staticRules) {
        this.staticSplitRules = staticRules;
        this.embeddingBackend.a(staticRules);
    }

    public final void e(@fg.l Activity activity, @fg.l Executor executor, @fg.l androidx.core.util.e<List<t>> consumer) {
        l0.p(activity, "activity");
        l0.p(executor, "executor");
        l0.p(consumer, "consumer");
        this.embeddingBackend.c(activity, executor, consumer);
    }

    public final void f() {
        this.embeddingBackend.a(this.staticSplitRules);
    }

    @fg.l
    public final Set<m> h() {
        return kotlin.collections.w.a6(this.embeddingBackend.b());
    }

    public final boolean j() {
        return this.embeddingBackend.f();
    }

    public final void k(@fg.l m rule) {
        l0.p(rule, "rule");
        this.embeddingBackend.d(rule);
    }

    public final void l(@fg.l androidx.core.util.e<List<t>> consumer) {
        l0.p(consumer, "consumer");
        this.embeddingBackend.e(consumer);
    }

    public final void n(@fg.l m rule) {
        l0.p(rule, "rule");
        this.embeddingBackend.g(rule);
    }

    private s() {
        this.embeddingBackend = p.INSTANCE.a();
        this.staticSplitRules = kotlin.collections.l0.f74939b;
    }
}
