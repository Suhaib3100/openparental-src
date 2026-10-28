package s2;

/* compiled from: SystemClock.java */
/* loaded from: classes3.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private static b f33436a;

    private b() {
    }

    public static b a() {
        if (f33436a == null) {
            f33436a = new b();
        }
        return f33436a;
    }

    @Override // s2.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
