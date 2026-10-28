package androidx.work.impl.model;

import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.room.h0;
import androidx.room.v0;
import androidx.room.x1;
import androidx.work.f0;
import androidx.work.i0;
import androidx.work.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkSpec.java */
@androidx.room.u(indices = {@h0({"schedule_requested_at"}), @h0({"period_start_time"})})
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: t, reason: collision with root package name */
    public static final long f36344t = -1;

    /* renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "id")
    @o0
    @v0
    public String f36346a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "state")
    @o0
    public f0.a f36347b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.room.i(name = "worker_class_name")
    @o0
    public String f36348c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.room.i(name = "input_merger_class_name")
    public String f36349d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.room.i(name = "input")
    @o0
    public androidx.work.f f36350e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.room.i(name = "output")
    @o0
    public androidx.work.f f36351f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.room.i(name = "initial_delay")
    public long f36352g;

    /* renamed from: h, reason: collision with root package name */
    @androidx.room.i(name = "interval_duration")
    public long f36353h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.room.i(name = "flex_duration")
    public long f36354i;

    /* renamed from: j, reason: collision with root package name */
    @androidx.room.t
    @o0
    public androidx.work.d f36355j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.room.i(name = "run_attempt_count")
    @g0(from = 0)
    public int f36356k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.room.i(name = "backoff_policy")
    @o0
    public androidx.work.a f36357l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.room.i(name = "backoff_delay_duration")
    public long f36358m;

    /* renamed from: n, reason: collision with root package name */
    @androidx.room.i(name = "period_start_time")
    public long f36359n;

    /* renamed from: o, reason: collision with root package name */
    @androidx.room.i(name = "minimum_retention_duration")
    public long f36360o;

    /* renamed from: p, reason: collision with root package name */
    @androidx.room.i(name = "schedule_requested_at")
    public long f36361p;

    /* renamed from: q, reason: collision with root package name */
    @androidx.room.i(name = "run_in_foreground")
    public boolean f36362q;

    /* renamed from: r, reason: collision with root package name */
    @androidx.room.i(name = "out_of_quota_policy")
    @o0
    public androidx.work.y f36363r;

    /* renamed from: s, reason: collision with root package name */
    private static final String f36343s = androidx.work.s.f("WorkSpec");

    /* renamed from: u, reason: collision with root package name */
    public static final i.a<List<c>, List<f0>> f36345u = new a();

    /* compiled from: WorkSpec.java */
    class a implements i.a<List<c>, List<f0>> {
        a() {
        }

        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<f0> apply(List<c> input) {
            if (input == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(input.size());
            Iterator<c> it = input.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            return arrayList;
        }
    }

    /* compiled from: WorkSpec.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @androidx.room.i(name = "id")
        public String f36364a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.room.i(name = "state")
        public f0.a f36365b;

        public boolean equals(Object o4) {
            if (this == o4) {
                return true;
            }
            if (!(o4 instanceof b)) {
                return false;
            }
            b bVar = (b) o4;
            if (this.f36365b != bVar.f36365b) {
                return false;
            }
            return this.f36364a.equals(bVar.f36364a);
        }

        public int hashCode() {
            return this.f36365b.hashCode() + (this.f36364a.hashCode() * 31);
        }
    }

    /* compiled from: WorkSpec.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @androidx.room.i(name = "id")
        public String f36366a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.room.i(name = "state")
        public f0.a f36367b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.room.i(name = "output")
        public androidx.work.f f36368c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.room.i(name = "run_attempt_count")
        public int f36369d;

        /* renamed from: e, reason: collision with root package name */
        @x1(entity = u.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        public List<String> f36370e;

        /* renamed from: f, reason: collision with root package name */
        @x1(entity = o.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        public List<androidx.work.f> f36371f;

        @o0
        public f0 a() {
            List<androidx.work.f> list = this.f36371f;
            return new f0(UUID.fromString(this.f36366a), this.f36367b, this.f36368c, this.f36370e, (list == null || list.isEmpty()) ? androidx.work.f.f35969c : this.f36371f.get(0), this.f36369d);
        }

        public boolean equals(Object o4) {
            if (this == o4) {
                return true;
            }
            if (!(o4 instanceof c)) {
                return false;
            }
            c cVar = (c) o4;
            if (this.f36369d != cVar.f36369d) {
                return false;
            }
            String str = this.f36366a;
            if (str == null ? cVar.f36366a != null : !str.equals(cVar.f36366a)) {
                return false;
            }
            if (this.f36367b != cVar.f36367b) {
                return false;
            }
            androidx.work.f fVar = this.f36368c;
            if (fVar == null ? cVar.f36368c != null : !fVar.equals(cVar.f36368c)) {
                return false;
            }
            List<String> list = this.f36370e;
            if (list == null ? cVar.f36370e != null : !list.equals(cVar.f36370e)) {
                return false;
            }
            List<androidx.work.f> list2 = this.f36371f;
            List<androidx.work.f> list3 = cVar.f36371f;
            return list2 != null ? list2.equals(list3) : list3 == null;
        }

        public int hashCode() {
            String str = this.f36366a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            f0.a aVar = this.f36367b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            androidx.work.f fVar = this.f36368c;
            int hashCode3 = (((hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31) + this.f36369d) * 31;
            List<String> list = this.f36370e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<androidx.work.f> list2 = this.f36371f;
            return hashCode4 + (list2 != null ? list2.hashCode() : 0);
        }
    }

    public r(@o0 String id2, @o0 String workerClassName) {
        this.f36347b = f0.a.ENQUEUED;
        androidx.work.f fVar = androidx.work.f.f35969c;
        this.f36350e = fVar;
        this.f36351f = fVar;
        this.f36355j = androidx.work.d.f35948i;
        this.f36357l = androidx.work.a.EXPONENTIAL;
        this.f36358m = i0.f35989d;
        this.f36361p = -1L;
        this.f36363r = androidx.work.y.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f36346a = id2;
        this.f36348c = workerClassName;
    }

    public long a() {
        if (c()) {
            return Math.min(i0.f35990e, this.f36357l == androidx.work.a.LINEAR ? this.f36358m * this.f36356k : (long) Math.scalb(this.f36358m, this.f36356k - 1)) + this.f36359n;
        }
        if (!d()) {
            long j4 = this.f36359n;
            if (j4 == 0) {
                j4 = System.currentTimeMillis();
            }
            return j4 + this.f36352g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j5 = this.f36359n;
        long j6 = j5 == 0 ? currentTimeMillis + this.f36352g : j5;
        long j7 = this.f36354i;
        long j10 = this.f36353h;
        if (j7 != j10) {
            return j6 + j10 + (j5 == 0 ? j7 * (-1) : 0L);
        }
        return j6 + (j5 != 0 ? j10 : 0L);
    }

    public boolean b() {
        return !androidx.work.d.f35948i.equals(this.f36355j);
    }

    public boolean c() {
        return this.f36347b == f0.a.ENQUEUED && this.f36356k > 0;
    }

    public boolean d() {
        return this.f36353h != 0;
    }

    public void e(long backoffDelayDuration) {
        if (backoffDelayDuration > i0.f35990e) {
            androidx.work.s.c().h(f36343s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            backoffDelayDuration = 18000000;
        }
        if (backoffDelayDuration < i0.f35991f) {
            androidx.work.s.c().h(f36343s, "Backoff delay duration less than minimum value", new Throwable[0]);
            backoffDelayDuration = 10000;
        }
        this.f36358m = backoffDelayDuration;
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (o4 == null || r.class != o4.getClass()) {
            return false;
        }
        r rVar = (r) o4;
        if (this.f36352g != rVar.f36352g || this.f36353h != rVar.f36353h || this.f36354i != rVar.f36354i || this.f36356k != rVar.f36356k || this.f36358m != rVar.f36358m || this.f36359n != rVar.f36359n || this.f36360o != rVar.f36360o || this.f36361p != rVar.f36361p || this.f36362q != rVar.f36362q || !this.f36346a.equals(rVar.f36346a) || this.f36347b != rVar.f36347b || !this.f36348c.equals(rVar.f36348c)) {
            return false;
        }
        String str = this.f36349d;
        if (str == null ? rVar.f36349d == null : str.equals(rVar.f36349d)) {
            return this.f36350e.equals(rVar.f36350e) && this.f36351f.equals(rVar.f36351f) && this.f36355j.equals(rVar.f36355j) && this.f36357l == rVar.f36357l && this.f36363r == rVar.f36363r;
        }
        return false;
    }

    public void f(long intervalDuration) {
        if (intervalDuration < z.f36620g) {
            androidx.work.s.c().h(f36343s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf(z.f36620g)), new Throwable[0]);
            intervalDuration = 900000;
        }
        g(intervalDuration, intervalDuration);
    }

    public void g(long intervalDuration, long flexDuration) {
        if (intervalDuration < z.f36620g) {
            androidx.work.s.c().h(f36343s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf(z.f36620g)), new Throwable[0]);
            intervalDuration = 900000;
        }
        if (flexDuration < z.f36621h) {
            androidx.work.s.c().h(f36343s, String.format("Flex duration lesser than minimum allowed value; Changed to %s", Long.valueOf(z.f36621h)), new Throwable[0]);
            flexDuration = 300000;
        }
        if (flexDuration > intervalDuration) {
            androidx.work.s.c().h(f36343s, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(intervalDuration)), new Throwable[0]);
            flexDuration = intervalDuration;
        }
        this.f36353h = intervalDuration;
        this.f36354i = flexDuration;
    }

    public int hashCode() {
        int a5 = androidx.compose.foundation.text.modifiers.n.a(this.f36348c, (this.f36347b.hashCode() + (this.f36346a.hashCode() * 31)) * 31, 31);
        String str = this.f36349d;
        int hashCode = (this.f36351f.hashCode() + ((this.f36350e.hashCode() + ((a5 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j4 = this.f36352g;
        int i4 = (hashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f36353h;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f36354i;
        int hashCode2 = (this.f36357l.hashCode() + ((((this.f36355j.hashCode() + ((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31)) * 31) + this.f36356k) * 31)) * 31;
        long j7 = this.f36358m;
        int i6 = (hashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j10 = this.f36359n;
        int i7 = (i6 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f36360o;
        int i10 = (i7 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f36361p;
        return this.f36363r.hashCode() + ((((i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f36362q ? 1 : 0)) * 31);
    }

    @o0
    public String toString() {
        return android.support.v4.media.c.a(new StringBuilder("{WorkSpec: "), this.f36346a, "}");
    }

    public r(@o0 r other) {
        this.f36347b = f0.a.ENQUEUED;
        androidx.work.f fVar = androidx.work.f.f35969c;
        this.f36350e = fVar;
        this.f36351f = fVar;
        this.f36355j = androidx.work.d.f35948i;
        this.f36357l = androidx.work.a.EXPONENTIAL;
        this.f36358m = i0.f35989d;
        this.f36361p = -1L;
        this.f36363r = androidx.work.y.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f36346a = other.f36346a;
        this.f36348c = other.f36348c;
        this.f36347b = other.f36347b;
        this.f36349d = other.f36349d;
        this.f36350e = new androidx.work.f(other.f36350e);
        this.f36351f = new androidx.work.f(other.f36351f);
        this.f36352g = other.f36352g;
        this.f36353h = other.f36353h;
        this.f36354i = other.f36354i;
        this.f36355j = new androidx.work.d(other.f36355j);
        this.f36356k = other.f36356k;
        this.f36357l = other.f36357l;
        this.f36358m = other.f36358m;
        this.f36359n = other.f36359n;
        this.f36360o = other.f36360o;
        this.f36361p = other.f36361p;
        this.f36362q = other.f36362q;
        this.f36363r = other.f36363r;
    }
}
