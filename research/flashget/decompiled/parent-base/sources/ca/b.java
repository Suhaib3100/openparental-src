package ca;

/* compiled from: SystemClock.java */
/* loaded from: classes6.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private static b f38603a;

    private b() {
    }

    public static b a() {
        if (f38603a == null) {
            f38603a = new b();
        }
        return f38603a;
    }

    @Override // ca.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
