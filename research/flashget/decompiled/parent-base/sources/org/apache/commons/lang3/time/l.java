package org.apache.commons.lang3.time;

import java.util.Date;
import java.util.TimeZone;

/* compiled from: GmtTimeZone.java */
/* loaded from: classes6.dex */
class l extends TimeZone {

    /* renamed from: d, reason: collision with root package name */
    private static final int f86365d = 60000;

    /* renamed from: e, reason: collision with root package name */
    private static final int f86366e = 60;

    /* renamed from: f, reason: collision with root package name */
    private static final int f86367f = 24;

    /* renamed from: g, reason: collision with root package name */
    static final long f86368g = 1;

    /* renamed from: b, reason: collision with root package name */
    private final int f86369b;

    /* renamed from: c, reason: collision with root package name */
    private final String f86370c;

    l(boolean z4, int i4, int i5) {
        if (i4 >= 24) {
            throw new IllegalArgumentException(i4 + " hours out of range");
        }
        if (i5 >= 60) {
            throw new IllegalArgumentException(i5 + " minutes out of range");
        }
        int i6 = ((i4 * 60) + i5) * f86365d;
        this.f86369b = z4 ? -i6 : i6;
        StringBuilder a5 = androidx.fragment.app.a.a(9, "GMT");
        a5.append(z4 ? '-' : '+');
        StringBuilder b5 = b(a5, i4);
        b5.append(':');
        this.f86370c = b(b5, i5).toString();
    }

    private static StringBuilder b(StringBuilder sb, int i4) {
        sb.append((char) ((i4 / 10) + 48));
        sb.append((char) ((i4 % 10) + 48));
        return sb;
    }

    public boolean equals(Object obj) {
        return (obj instanceof l) && this.f86370c == ((l) obj).f86370c;
    }

    @Override // java.util.TimeZone
    public String getID() {
        return this.f86370c;
    }

    @Override // java.util.TimeZone
    public int getOffset(int i4, int i5, int i6, int i7, int i10, int i11) {
        return this.f86369b;
    }

    @Override // java.util.TimeZone
    public int getRawOffset() {
        return this.f86369b;
    }

    public int hashCode() {
        return this.f86369b;
    }

    @Override // java.util.TimeZone
    public boolean inDaylightTime(Date date) {
        return false;
    }

    @Override // java.util.TimeZone
    public void setRawOffset(int i4) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[GmtTimeZone id=\"");
        sb.append(this.f86370c);
        sb.append("\",offset=");
        return androidx.view.e.a(sb, this.f86369b, ']');
    }

    @Override // java.util.TimeZone
    public boolean useDaylightTime() {
        return false;
    }
}
