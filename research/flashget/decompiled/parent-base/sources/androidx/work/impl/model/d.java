package androidx.work.impl.model;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.room.v0;

/* compiled from: Preference.java */
@androidx.room.u
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    @androidx.room.i(name = "key")
    @o0
    @v0
    public String f36312a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    @androidx.room.i(name = "long_value")
    public Long f36313b;

    public d(@o0 String key, boolean value) {
        this(key, value ? 1L : 0L);
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof d)) {
            return false;
        }
        d dVar = (d) o4;
        if (!this.f36312a.equals(dVar.f36312a)) {
            return false;
        }
        Long l4 = this.f36313b;
        Long l5 = dVar.f36313b;
        return l4 != null ? l4.equals(l5) : l5 == null;
    }

    public int hashCode() {
        int hashCode = this.f36312a.hashCode() * 31;
        Long l4 = this.f36313b;
        return hashCode + (l4 != null ? l4.hashCode() : 0);
    }

    public d(@o0 String key, long value) {
        this.f36312a = key;
        this.f36313b = Long.valueOf(value);
    }
}
