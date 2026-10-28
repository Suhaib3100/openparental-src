package net.time4j;

import java.io.Serializable;

/* compiled from: DayCycles.java */
/* loaded from: classes7.dex */
public final class m implements Serializable {
    private static final long serialVersionUID = -4124961309622141228L;
    private final long days;
    private final m0 time;

    m(long j4, m0 m0Var) {
        this.days = j4;
        this.time = m0Var;
    }

    public long a() {
        return this.days;
    }

    public m0 b() {
        return this.time;
    }
}
