package androidx.content.preferences.protobuf;

/* compiled from: RawMessageInfo.java */
/* loaded from: classes3.dex */
final class j3 implements g2 {

    /* renamed from: a, reason: collision with root package name */
    private final i2 f28716a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28717b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f28718c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28719d;

    j3(i2 i2Var, String str, Object[] objArr) {
        this.f28716a = i2Var;
        this.f28717b = str;
        this.f28718c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f28719d = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i5 = 13;
        int i6 = 1;
        while (true) {
            int i7 = i6 + 1;
            char charAt2 = str.charAt(i6);
            if (charAt2 < 55296) {
                this.f28719d = i4 | (charAt2 << i5);
                return;
            } else {
                i4 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i6 = i7;
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.g2
    public boolean a() {
        return (this.f28719d & 2) == 2;
    }

    @Override // androidx.content.preferences.protobuf.g2
    public i2 b() {
        return this.f28716a;
    }

    Object[] c() {
        return this.f28718c;
    }

    String d() {
        return this.f28717b;
    }

    @Override // androidx.content.preferences.protobuf.g2
    public e3 g() {
        return (this.f28719d & 1) == 1 ? e3.PROTO2 : e3.PROTO3;
    }
}
