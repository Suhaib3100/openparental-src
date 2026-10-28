package android.content.preferences.protobuf;

/* compiled from: RawMessageInfo.java */
/* loaded from: classes3.dex */
final class g3 implements f2 {

    /* renamed from: a, reason: collision with root package name */
    private final h2 f7228a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7229b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f7230c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7231d;

    g3(h2 h2Var, String str, Object[] objArr) {
        this.f7228a = h2Var;
        this.f7229b = str;
        this.f7230c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f7231d = charAt;
            return;
        }
        int i5 = charAt & 8191;
        int i6 = 13;
        int i7 = 1;
        while (true) {
            int i8 = i7 + 1;
            char charAt2 = str.charAt(i7);
            if (charAt2 < 55296) {
                this.f7231d = i5 | (charAt2 << i6);
                return;
            } else {
                i5 |= (charAt2 & 8191) << i6;
                i6 += 13;
                i7 = i8;
            }
        }
    }

    @Override // android.content.preferences.protobuf.f2
    public boolean a() {
        return (this.f7231d & 2) == 2;
    }

    @Override // android.content.preferences.protobuf.f2
    public h2 b() {
        return this.f7228a;
    }

    Object[] c() {
        return this.f7230c;
    }

    String d() {
        return this.f7229b;
    }

    @Override // android.content.preferences.protobuf.f2
    public b3 e() {
        return (this.f7231d & 1) == 1 ? b3.PROTO2 : b3.PROTO3;
    }
}
