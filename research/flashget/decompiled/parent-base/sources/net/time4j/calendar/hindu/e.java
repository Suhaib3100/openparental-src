package net.time4j.calendar.hindu;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import net.time4j.engine.o;

/* compiled from: HinduDay.java */
/* loaded from: classes7.dex */
public final class e extends h implements Comparable<e>, o<d>, Serializable {
    private final boolean leap;
    private final int value;

    private e(int i4, boolean z4) {
        if (i4 < 1 || i4 > 32) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("邻\u0001"), i4));
        }
        this.value = i4;
        this.leap = z4;
    }

    public static e e(int i4) {
        return new e(i4, false);
    }

    @Override // net.time4j.calendar.hindu.h
    public boolean a() {
        return this.leap;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        int i4 = this.value - eVar.value;
        if (i4 != 0) {
            return i4;
        }
        if (this.leap) {
            return !eVar.leap ? 1 : 0;
        }
        return eVar.leap ? -1 : 0;
    }

    public int c() {
        return this.value;
    }

    @Override // net.time4j.engine.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean test(d dVar) {
        return equals(dVar.w0());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.value == eVar.value && this.leap == eVar.leap;
    }

    public e f() {
        return this.leap ? this : new e(this.value, true);
    }

    public int hashCode() {
        return this.value + (this.leap ? 12 : 0);
    }

    public String toString() {
        String valueOf = String.valueOf(this.value);
        return this.leap ? androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("邼\u0001"), valueOf) : valueOf;
    }
}
