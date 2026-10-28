package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private UUID f35904a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private f f35905b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private Set<String> f35906c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private a f35907d;

    /* renamed from: e, reason: collision with root package name */
    private int f35908e;

    /* renamed from: f, reason: collision with root package name */
    @o0
    private Executor f35909f;

    /* renamed from: g, reason: collision with root package name */
    @o0
    private androidx.work.impl.utils.taskexecutor.a f35910g;

    /* renamed from: h, reason: collision with root package name */
    @o0
    private j0 f35911h;

    /* renamed from: i, reason: collision with root package name */
    @o0
    private b0 f35912i;

    /* renamed from: j, reason: collision with root package name */
    @o0
    private m f35913j;

    @c1({c1.a.LIBRARY_GROUP})
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @o0
        public List<String> f35914a = Collections.emptyList();

        /* renamed from: b, reason: collision with root package name */
        @o0
        public List<Uri> f35915b = Collections.emptyList();

        /* renamed from: c, reason: collision with root package name */
        @x0(28)
        public Network f35916c;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public WorkerParameters(@o0 UUID id2, @o0 f inputData, @o0 Collection<String> tags, @o0 a runtimeExtras, @androidx.annotation.g0(from = 0) int runAttemptCount, @o0 Executor backgroundExecutor, @o0 androidx.work.impl.utils.taskexecutor.a workTaskExecutor, @o0 j0 workerFactory, @o0 b0 progressUpdater, @o0 m foregroundUpdater) {
        this.f35904a = id2;
        this.f35905b = inputData;
        this.f35906c = new HashSet(tags);
        this.f35907d = runtimeExtras;
        this.f35908e = runAttemptCount;
        this.f35909f = backgroundExecutor;
        this.f35910g = workTaskExecutor;
        this.f35911h = workerFactory;
        this.f35912i = progressUpdater;
        this.f35913j = foregroundUpdater;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public Executor a() {
        return this.f35909f;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public m b() {
        return this.f35913j;
    }

    @o0
    public UUID c() {
        return this.f35904a;
    }

    @o0
    public f d() {
        return this.f35905b;
    }

    @q0
    @x0(28)
    public Network e() {
        return this.f35907d.f35916c;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public b0 f() {
        return this.f35912i;
    }

    @androidx.annotation.g0(from = 0)
    public int g() {
        return this.f35908e;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public a h() {
        return this.f35907d;
    }

    @o0
    public Set<String> i() {
        return this.f35906c;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public androidx.work.impl.utils.taskexecutor.a j() {
        return this.f35910g;
    }

    @o0
    @x0(24)
    public List<String> k() {
        return this.f35907d.f35914a;
    }

    @o0
    @x0(24)
    public List<Uri> l() {
        return this.f35907d.f35915b;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public j0 m() {
        return this.f35911h;
    }
}
