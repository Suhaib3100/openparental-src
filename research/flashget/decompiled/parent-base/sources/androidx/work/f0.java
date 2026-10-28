package androidx.work;

import androidx.annotation.c1;
import androidx.annotation.o0;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkInfo.java */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private UUID f35973a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private a f35974b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private f f35975c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private Set<String> f35976d;

    /* renamed from: e, reason: collision with root package name */
    @o0
    private f f35977e;

    /* renamed from: f, reason: collision with root package name */
    private int f35978f;

    /* compiled from: WorkInfo.java */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    public f0(@o0 UUID id2, @o0 a state, @o0 f outputData, @o0 List<String> tags, @o0 f progress, int runAttemptCount) {
        this.f35973a = id2;
        this.f35974b = state;
        this.f35975c = outputData;
        this.f35976d = new HashSet(tags);
        this.f35977e = progress;
        this.f35978f = runAttemptCount;
    }

    @o0
    public UUID a() {
        return this.f35973a;
    }

    @o0
    public f b() {
        return this.f35975c;
    }

    @o0
    public f c() {
        return this.f35977e;
    }

    @androidx.annotation.g0(from = 0)
    public int d() {
        return this.f35978f;
    }

    @o0
    public a e() {
        return this.f35974b;
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (o4 == null || f0.class != o4.getClass()) {
            return false;
        }
        f0 f0Var = (f0) o4;
        if (this.f35978f == f0Var.f35978f && this.f35973a.equals(f0Var.f35973a) && this.f35974b == f0Var.f35974b && this.f35975c.equals(f0Var.f35975c) && this.f35976d.equals(f0Var.f35976d)) {
            return this.f35977e.equals(f0Var.f35977e);
        }
        return false;
    }

    @o0
    public Set<String> f() {
        return this.f35976d;
    }

    public int hashCode() {
        return ((this.f35977e.hashCode() + ((this.f35976d.hashCode() + ((this.f35975c.hashCode() + ((this.f35974b.hashCode() + (this.f35973a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f35978f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f35973a + "', mState=" + this.f35974b + ", mOutputData=" + this.f35975c + ", mTags=" + this.f35976d + ", mProgress=" + this.f35977e + '}';
    }
}
