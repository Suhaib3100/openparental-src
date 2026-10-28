package c5;

import org.greenrobot.eventbus.g;

/* compiled from: AndroidComponents.java */
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    private static final a f10688c;

    /* renamed from: a, reason: collision with root package name */
    public final org.greenrobot.eventbus.f f10689a;

    /* renamed from: b, reason: collision with root package name */
    public final g f10690b;

    static {
        f10688c = b.c() ? b.b() : null;
    }

    public a(org.greenrobot.eventbus.f fVar, g gVar) {
        this.f10689a = fVar;
        this.f10690b = gVar;
    }

    public static boolean a() {
        return f10688c != null;
    }

    public static a b() {
        return f10688c;
    }
}
