package net.time4j.tz;

/* compiled from: SimpleUT.java */
/* loaded from: classes7.dex */
class i implements net.time4j.base.f {

    /* renamed from: b, reason: collision with root package name */
    private final long f83552b;

    /* renamed from: c, reason: collision with root package name */
    private final int f83553c;

    private i(long j4, int i4) {
        this.f83552b = j4;
        this.f83553c = i4;
    }

    static net.time4j.base.f b(long j4, int i4) {
        if (i4 == 0) {
            j4--;
        }
        return new i(j4, i4 == 0 ? 999999999 : i4 - 1);
    }

    static net.time4j.base.f d(net.time4j.base.f fVar) {
        return b(fVar.j(), fVar.a());
    }

    @Override // net.time4j.base.f
    public int a() {
        return this.f83553c;
    }

    @Override // net.time4j.base.f
    public long j() {
        return this.f83552b;
    }
}
