package androidx.window.embedding;

import android.app.Activity;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.window.embedding.k;
import androidx.window.embedding.l;
import androidx.window.embedding.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: ExtensionEmbeddingBackend.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0003\f\b\u001aB\u0013\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J3\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u00020\u000b2\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0005R&\u0010-\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u0018\u00100\u001a\u00060.R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0007018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102¨\u00064"}, d2 = {"Landroidx/window/embedding/p;", "Landroidx/window/embedding/j;", "Landroidx/window/embedding/l;", "embeddingExtension", "<init>", "(Landroidx/window/embedding/l;)V", "", "Landroidx/window/embedding/m;", "b", "()Ljava/util/Set;", "rules", "Lkotlin/k2;", "a", "(Ljava/util/Set;)V", "rule", "d", "(Landroidx/window/embedding/m;)V", "g", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/e;", "", "Landroidx/window/embedding/t;", "callback", "c", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/e;)V", "consumer", "e", "(Landroidx/core/util/e;)V", "", "f", "()Z", "Landroidx/window/embedding/l;", "k", "()Landroidx/window/embedding/l;", "n", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/embedding/p$c;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "l", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "m", "()V", "splitChangeCallbacks", "Landroidx/window/embedding/p$b;", "Landroidx/window/embedding/p$b;", "splitInfoEmbeddingCallback", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "splitRules", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements j {

    /* renamed from: f, reason: collision with root package name */
    @fg.m
    private static volatile p f35736f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @b0("globalLock")
    @m1
    private l embeddingExtension;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CopyOnWriteArrayList<c> splitChangeCallbacks;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b splitInfoEmbeddingCallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CopyOnWriteArraySet<m> splitRules;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final String f35738h = "EmbeddingBackend";

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final ReentrantLock f35737g = new ReentrantLock();

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/window/embedding/p$a;", "", "<init>", "()V", "Landroidx/window/embedding/l;", "b", "()Landroidx/window/embedding/l;", "Landroidx/window/embedding/p;", "a", "()Landroidx/window/embedding/p;", "", "extensionVersion", "", "c", "(Ljava/lang/Integer;)Z", "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/embedding/p;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.window.embedding.p$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final l b() {
            try {
                k.Companion companion = k.INSTANCE;
                if (c(companion.b()) && companion.c()) {
                    return new k();
                }
                return null;
            } catch (Throwable th) {
                l0.C("Failed to load embedding extension: ", th);
                return null;
            }
        }

        @fg.l
        public final p a() {
            if (p.f35736f == null) {
                ReentrantLock reentrantLock = p.f35737g;
                reentrantLock.lock();
                try {
                    if (p.f35736f == null) {
                        p.f35736f = new p(p.INSTANCE.b());
                    }
                    k2 k2Var = k2.f75408a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            p pVar = p.f35736f;
            l0.m(pVar);
            return pVar;
        }

        @m1
        public final boolean c(@fg.m Integer extensionVersion) {
            return extensionVersion != null && extensionVersion.intValue() >= 1;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/window/embedding/p$b;", "Landroidx/window/embedding/l$a;", "<init>", "(Landroidx/window/embedding/p;)V", "", "Landroidx/window/embedding/t;", "splitInfo", "Lkotlin/k2;", "a", "(Ljava/util/List;)V", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "lastInfo", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class b implements l.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private List<t> lastInfo;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f35744b;

        public b(p this$0) {
            l0.p(this$0, "this$0");
            this.f35744b = this$0;
        }

        @Override // androidx.window.embedding.l.a
        public void a(@fg.l List<t> splitInfo) {
            l0.p(splitInfo, "splitInfo");
            this.lastInfo = splitInfo;
            Iterator<c> it = this.f35744b.l().iterator();
            while (it.hasNext()) {
                it.next().b(splitInfo);
            }
        }

        @fg.m
        public final List<t> b() {
            return this.lastInfo;
        }

        public final void c(@fg.m List<t> list) {
            this.lastInfo = list;
        }
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/window/embedding/p$c;", "", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/e;", "", "Landroidx/window/embedding/t;", "callback", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/e;)V", "splitInfoList", "Lkotlin/k2;", "b", "(Ljava/util/List;)V", "a", "Landroid/app/Activity;", "Ljava/util/concurrent/Executor;", "c", "Landroidx/core/util/e;", "d", "()Landroidx/core/util/e;", "Ljava/util/List;", "lastValue", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Activity activity;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Executor executor;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.core.util.e<List<t>> callback;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private List<t> lastValue;

        public c(@fg.l Activity activity, @fg.l Executor executor, @fg.l androidx.core.util.e<List<t>> callback) {
            l0.p(activity, "activity");
            l0.p(executor, "executor");
            l0.p(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c this$0, List splitsWithActivity) {
            l0.p(this$0, "this$0");
            l0.p(splitsWithActivity, "$splitsWithActivity");
            this$0.callback.accept(splitsWithActivity);
        }

        public final void b(@fg.l List<t> splitInfoList) {
            l0.p(splitInfoList, "splitInfoList");
            final ArrayList arrayList = new ArrayList();
            for (Object obj : splitInfoList) {
                if (((t) obj).a(this.activity)) {
                    arrayList.add(obj);
                }
            }
            if (l0.g(arrayList, this.lastValue)) {
                return;
            }
            this.lastValue = arrayList;
            this.executor.execute(new Runnable() { // from class: androidx.window.embedding.q
                @Override // java.lang.Runnable
                public final void run() {
                    p.c.c(p.c.this, arrayList);
                }
            });
        }

        @fg.l
        public final androidx.core.util.e<List<t>> d() {
            return this.callback;
        }
    }

    @m1
    public p(@fg.m l lVar) {
        this.embeddingExtension = lVar;
        b bVar = new b(this);
        this.splitInfoEmbeddingCallback = bVar;
        this.splitChangeCallbacks = new CopyOnWriteArrayList<>();
        l lVar2 = this.embeddingExtension;
        if (lVar2 != null) {
            lVar2.b(bVar);
        }
        this.splitRules = new CopyOnWriteArraySet<>();
    }

    @m1
    public static /* synthetic */ void m() {
    }

    @Override // androidx.window.embedding.j
    public void a(@fg.l Set<? extends m> rules) {
        l0.p(rules, "rules");
        this.splitRules.clear();
        this.splitRules.addAll(rules);
        l lVar = this.embeddingExtension;
        if (lVar == null) {
            return;
        }
        lVar.a(this.splitRules);
    }

    @Override // androidx.window.embedding.j
    @fg.l
    public Set<m> b() {
        return this.splitRules;
    }

    @Override // androidx.window.embedding.j
    public void c(@fg.l Activity activity, @fg.l Executor executor, @fg.l androidx.core.util.e<List<t>> callback) {
        l0.p(activity, "activity");
        l0.p(executor, "executor");
        l0.p(callback, "callback");
        ReentrantLock reentrantLock = f35737g;
        reentrantLock.lock();
        try {
            if (this.embeddingExtension == null) {
                callback.accept(j0.f74919b);
                return;
            }
            c cVar = new c(activity, executor, callback);
            this.splitChangeCallbacks.add(cVar);
            if (this.splitInfoEmbeddingCallback.b() != null) {
                List<t> b5 = this.splitInfoEmbeddingCallback.b();
                l0.m(b5);
                cVar.b(b5);
            } else {
                cVar.b(j0.f74919b);
            }
            k2 k2Var = k2.f75408a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.j
    public void d(@fg.l m rule) {
        l0.p(rule, "rule");
        if (this.splitRules.contains(rule)) {
            return;
        }
        this.splitRules.add(rule);
        l lVar = this.embeddingExtension;
        if (lVar == null) {
            return;
        }
        lVar.a(this.splitRules);
    }

    @Override // androidx.window.embedding.j
    public void e(@fg.l androidx.core.util.e<List<t>> consumer) {
        l0.p(consumer, "consumer");
        ReentrantLock reentrantLock = f35737g;
        reentrantLock.lock();
        try {
            Iterator<c> it = this.splitChangeCallbacks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c next = it.next();
                if (l0.g(next.d(), consumer)) {
                    this.splitChangeCallbacks.remove(next);
                    break;
                }
            }
            k2 k2Var = k2.f75408a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.window.embedding.j
    public boolean f() {
        return this.embeddingExtension != null;
    }

    @Override // androidx.window.embedding.j
    public void g(@fg.l m rule) {
        l0.p(rule, "rule");
        if (this.splitRules.contains(rule)) {
            this.splitRules.remove(rule);
            l lVar = this.embeddingExtension;
            if (lVar == null) {
                return;
            }
            lVar.a(this.splitRules);
        }
    }

    @fg.m
    /* renamed from: k, reason: from getter */
    public final l getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    @fg.l
    public final CopyOnWriteArrayList<c> l() {
        return this.splitChangeCallbacks;
    }

    public final void n(@fg.m l lVar) {
        this.embeddingExtension = lVar;
    }
}
