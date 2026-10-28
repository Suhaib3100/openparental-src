package org.apache.http.pool;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i;
import java.util.concurrent.TimeUnit;
import org.apache.http.annotation.GuardedBy;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.util.Args;

@ThreadSafe
/* loaded from: classes3.dex */
public abstract class PoolEntry<T, C> {
    private final C conn;
    private final long created;

    @GuardedBy("this")
    private long expiry;

    /* renamed from: id, reason: collision with root package name */
    private final String f86714id;
    private final T route;
    private volatile Object state;

    @GuardedBy("this")
    private long updated;
    private final long validUnit;

    public PoolEntry(String str, T t4, C c5, long j4, TimeUnit timeUnit) {
        Args.notNull(t4, "Route");
        Args.notNull(c5, "Connection");
        Args.notNull(timeUnit, "Time unit");
        this.f86714id = str;
        this.route = t4;
        this.conn = c5;
        long currentTimeMillis = System.currentTimeMillis();
        this.created = currentTimeMillis;
        if (j4 > 0) {
            this.validUnit = timeUnit.toMillis(j4) + currentTimeMillis;
        } else {
            this.validUnit = Long.MAX_VALUE;
        }
        this.expiry = this.validUnit;
    }

    public abstract void close();

    public C getConnection() {
        return this.conn;
    }

    public long getCreated() {
        return this.created;
    }

    public synchronized long getExpiry() {
        return this.expiry;
    }

    public String getId() {
        return this.f86714id;
    }

    public T getRoute() {
        return this.route;
    }

    public Object getState() {
        return this.state;
    }

    public synchronized long getUpdated() {
        return this.updated;
    }

    public long getValidUnit() {
        return this.validUnit;
    }

    public abstract boolean isClosed();

    public synchronized boolean isExpired(long j4) {
        return j4 >= this.expiry;
    }

    public void setState(Object obj) {
        this.state = obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id:");
        sb.append(this.f86714id);
        sb.append("][route:");
        sb.append(this.route);
        sb.append("][state:");
        return i.a(sb, this.state, "]");
    }

    public synchronized void updateExpiry(long j4, TimeUnit timeUnit) {
        try {
            Args.notNull(timeUnit, "Time unit");
            long currentTimeMillis = System.currentTimeMillis();
            this.updated = currentTimeMillis;
            this.expiry = Math.min(j4 > 0 ? currentTimeMillis + timeUnit.toMillis(j4) : Long.MAX_VALUE, this.validUnit);
        } catch (Throwable th) {
            throw th;
        }
    }

    public PoolEntry(String str, T t4, C c5) {
        this(str, t4, c5, 0L, TimeUnit.MILLISECONDS);
    }
}
