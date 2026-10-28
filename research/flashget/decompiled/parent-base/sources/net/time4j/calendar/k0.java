package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ObjectStreamException;

/* compiled from: RelatedGregorianYearElement.java */
/* loaded from: classes7.dex */
final class k0 extends net.time4j.engine.e<Integer> {

    /* renamed from: b, reason: collision with root package name */
    static final k0 f82590b = new k0();
    private static final long serialVersionUID = -1117064522468823402L;

    private k0() {
        super(ProtectedSandApp.s("鄒\u0001"));
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMaximum() {
        return 999999999;
    }

    @Override // net.time4j.engine.q
    public Object getDefaultMinimum() {
        return -999999999;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.q
    public char getSymbol() {
        return 'r';
    }

    @Override // net.time4j.engine.q
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // net.time4j.engine.q
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.q
    public boolean isTimeElement() {
        return false;
    }

    protected Object readResolve() throws ObjectStreamException {
        return f82590b;
    }

    @Override // net.time4j.engine.e
    protected boolean u() {
        return true;
    }

    public Integer y() {
        return 999999999;
    }

    public Integer z() {
        return -999999999;
    }
}
