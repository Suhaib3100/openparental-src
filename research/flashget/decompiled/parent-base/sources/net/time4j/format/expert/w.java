package net.time4j.format.expert;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.ParsePosition;
import kotlin.text.m0;

/* compiled from: ParseLog.java */
/* loaded from: classes7.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private ParsePosition f83060a;

    /* renamed from: b, reason: collision with root package name */
    private String f83061b;

    /* renamed from: c, reason: collision with root package name */
    private net.time4j.engine.r<?> f83062c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f83063d;

    public w() {
        this(0);
    }

    void a() {
        this.f83060a.setErrorIndex(-1);
        this.f83061b = "";
    }

    void b() {
        this.f83063d = false;
    }

    public int c() {
        return this.f83060a.getErrorIndex();
    }

    public String d() {
        return this.f83061b;
    }

    ParsePosition e() {
        return this.f83060a;
    }

    public int f() {
        return this.f83060a.getIndex();
    }

    public net.time4j.engine.r<?> g() {
        if (this.f83062c == null) {
            this.f83062c = new z(0, false);
        }
        return this.f83062c;
    }

    net.time4j.engine.r<?> h() {
        return this.f83062c;
    }

    public boolean i() {
        return this.f83060a.getErrorIndex() != -1;
    }

    boolean j() {
        return this.f83063d;
    }

    public void k() {
        this.f83060a.setIndex(0);
        this.f83060a.setErrorIndex(-1);
        this.f83061b = "";
        this.f83063d = false;
        this.f83062c = null;
    }

    public void l(int i4, String str) {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("镦\u0001"), i4));
        }
        if (str == null || str.isEmpty()) {
            str = android.support.v4.media.a.a(ProtectedSandApp.s("镥\u0001"), i4);
        }
        this.f83061b = str;
        this.f83060a.setErrorIndex(i4);
    }

    public void m(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("镤\u0001"), i4));
        }
        this.f83060a.setIndex(i4);
    }

    void n(net.time4j.engine.r<?> rVar) {
        this.f83062c = rVar;
    }

    public void o() {
        if (!i()) {
            this.f83061b = ProtectedSandApp.s("镧\u0001");
            this.f83060a.setErrorIndex(f());
        }
        this.f83063d = true;
    }

    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(128, ProtectedSandApp.s("镨\u0001"));
        a5.append(f());
        a5.append(ProtectedSandApp.s("镩\u0001"));
        a5.append(c());
        a5.append(ProtectedSandApp.s("镪\u0001"));
        a5.append(this.f83061b);
        a5.append(m0.quote);
        if (this.f83063d) {
            a5.append(ProtectedSandApp.s("镫\u0001"));
        }
        if (this.f83062c != null) {
            a5.append(ProtectedSandApp.s("镬\u0001"));
            a5.append(this.f83062c);
        }
        a5.append(']');
        return a5.toString();
    }

    public w(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("镣\u0001"), i4));
        }
        this.f83060a = new ParsePosition(i4);
        this.f83061b = "";
        this.f83062c = null;
        this.f83063d = false;
    }

    w(ParsePosition parsePosition) {
        if (parsePosition.getIndex() >= 0) {
            parsePosition.setErrorIndex(-1);
            this.f83060a = parsePosition;
            this.f83061b = "";
            this.f83062c = null;
            this.f83063d = false;
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("镤\u0001") + parsePosition.getIndex());
    }
}
