package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.Comparable;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PrecisionElement.java */
/* loaded from: classes7.dex */
class o0<U extends Comparable<U>> implements net.time4j.engine.q<U> {

    /* renamed from: e, reason: collision with root package name */
    static final net.time4j.engine.q<j> f83420e = new o0(j.class, j.HOURS, j.NANOS);

    /* renamed from: f, reason: collision with root package name */
    static final net.time4j.engine.q<TimeUnit> f83421f = new o0(TimeUnit.class, TimeUnit.DAYS, TimeUnit.NANOSECONDS);

    /* renamed from: b, reason: collision with root package name */
    private final Class<U> f83422b;

    /* renamed from: c, reason: collision with root package name */
    private final transient U f83423c;

    /* renamed from: d, reason: collision with root package name */
    private final transient U f83424d;

    private o0(Class<U> cls, U u4, U u5) {
        this.f83422b = cls;
        this.f83423c = u4;
        this.f83424d = u5;
    }

    private Object e() {
        return this.f83422b == j.class ? f83420e : f83421f;
    }

    @Override // net.time4j.engine.q
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public U getDefaultMaximum() {
        return this.f83424d;
    }

    @Override // net.time4j.engine.q
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public U getDefaultMinimum() {
        return this.f83423c;
    }

    @Override // net.time4j.engine.q
    public String getDisplayName(Locale locale) {
        return name();
    }

    @Override // net.time4j.engine.q
    public char getSymbol() {
        return (char) 0;
    }

    @Override // net.time4j.engine.q
    public Class<U> getType() {
        return this.f83422b;
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return false;
    }

    @Override // net.time4j.engine.q
    public boolean isLenient() {
        return false;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return true;
    }

    @Override // net.time4j.engine.q
    public String name() {
        return ProtectedSandApp.s("頊\u0001");
    }

    @Override // java.util.Comparator
    public int compare(net.time4j.engine.p pVar, net.time4j.engine.p pVar2) {
        Comparable comparable = (Comparable) pVar.r(this);
        Comparable comparable2 = (Comparable) pVar2.r(this);
        return this.f83422b == j.class ? comparable.compareTo(comparable2) : comparable2.compareTo(comparable);
    }
}
