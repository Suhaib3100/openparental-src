package net.minidev.json.parser;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class ParseException extends Exception {

    /* renamed from: e, reason: collision with root package name */
    private static final long f81732e = 8879024178584091857L;

    /* renamed from: f, reason: collision with root package name */
    public static final int f81733f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f81734g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f81735h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f81736i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f81737j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f81738k = 5;

    /* renamed from: l, reason: collision with root package name */
    public static final int f81739l = 6;

    /* renamed from: b, reason: collision with root package name */
    private int f81740b;

    /* renamed from: c, reason: collision with root package name */
    private Object f81741c;

    /* renamed from: d, reason: collision with root package name */
    private int f81742d;

    public ParseException(int i4, int i5, Object obj) {
        super(d(i4, i5, obj));
        this.f81742d = i4;
        this.f81740b = i5;
        this.f81741c = obj;
    }

    private static String d(int i4, int i5, Object obj) {
        StringBuilder sb = new StringBuilder();
        String s4 = ProtectedSandApp.s("襘\u0001");
        if (i5 == 0) {
            sb.append(ProtectedSandApp.s("襙\u0001"));
            sb.append(obj);
            sb.append(ProtectedSandApp.s("襚\u0001"));
            sb.append(i4);
            sb.append(s4);
        } else {
            String s5 = ProtectedSandApp.s("襛\u0001");
            if (i5 == 1) {
                sb.append(ProtectedSandApp.s("襜\u0001"));
                sb.append(obj);
                sb.append(s5);
                sb.append(i4);
                sb.append(s4);
            } else if (i5 == 2) {
                sb.append(ProtectedSandApp.s("襝\u0001"));
                sb.append(obj);
                sb.append(ProtectedSandApp.s("襞\u0001"));
                sb.append(i4);
                sb.append(s4);
            } else if (i5 == 3) {
                sb.append(ProtectedSandApp.s("襟\u0001"));
                sb.append(i4);
                sb.append(ProtectedSandApp.s("襠\u0001"));
                sb.append(obj);
            } else if (i5 == 4) {
                sb.append(ProtectedSandApp.s("襡\u0001"));
                sb.append(obj);
                sb.append(s5);
                sb.append(i4);
                sb.append(s4);
            } else if (i5 == 5) {
                sb.append(ProtectedSandApp.s("襢\u0001"));
                sb.append(obj);
                sb.append(s5);
                sb.append(i4);
                sb.append(s4);
            } else if (i5 == 6) {
                sb.append(ProtectedSandApp.s("襣\u0001"));
                sb.append(obj);
                sb.append(s5);
                sb.append(i4);
                sb.append(s4);
            } else {
                sb.append(ProtectedSandApp.s("襤\u0001"));
                sb.append(i4);
                sb.append(s4);
            }
        }
        return sb.toString();
    }

    public int a() {
        return this.f81740b;
    }

    public int b() {
        return this.f81742d;
    }

    public Object c() {
        return this.f81741c;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }

    public ParseException(int i4, Throwable th) {
        super(d(i4, 2, th), th);
        this.f81742d = i4;
        this.f81740b = 2;
        this.f81741c = th;
    }
}
