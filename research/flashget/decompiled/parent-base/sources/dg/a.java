package dg;

import org.greenrobot.eventbus.g;

/* compiled from: AndroidComponents.java */
/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    private static final a f73728c;

    /* renamed from: a, reason: collision with root package name */
    public final org.greenrobot.eventbus.f f73729a;

    /* renamed from: b, reason: collision with root package name */
    public final g f73730b;

    static {
        f73728c = b.c() ? b.b() : null;
    }

    public a(org.greenrobot.eventbus.f fVar, g gVar) {
        this.f73729a = fVar;
        this.f73730b = gVar;
    }

    public static boolean a() {
        return f73728c != null;
    }

    public static a b() {
        return f73728c;
    }
}
