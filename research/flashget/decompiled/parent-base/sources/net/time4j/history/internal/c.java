package net.time4j.history.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ObjectStreamException;
import net.time4j.engine.q;
import net.time4j.format.d;
import org.threeten.bp.chrono.m;

/* compiled from: StdHistoricalElement.java */
/* loaded from: classes7.dex */
public class c extends d<Integer> {

    /* renamed from: f, reason: collision with root package name */
    public static final q<Integer> f83207f = new c(ProtectedSandApp.s("隉\u0001"), 0, 1, m.f87989n);
    private static final long serialVersionUID = 1;

    /* renamed from: c, reason: collision with root package name */
    private final transient char f83208c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Integer f83209d;

    /* renamed from: e, reason: collision with root package name */
    private final transient Integer f83210e;

    protected c(String str, char c5, int i4, int i5) {
        super(str);
        this.f83208c = c5;
        this.f83209d = Integer.valueOf(i4);
        this.f83210e = Integer.valueOf(i5);
    }

    private Object readResolve() throws ObjectStreamException {
        return f83207f;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.q
    public char getSymbol() {
        return this.f83208c;
    }

    @Override // net.time4j.engine.q
    public final Class<Integer> getType() {
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

    @Override // net.time4j.engine.e
    protected boolean u() {
        return true;
    }

    @Override // net.time4j.engine.q
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Integer getDefaultMaximum() {
        return this.f83210e;
    }

    @Override // net.time4j.engine.q
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Integer getDefaultMinimum() {
        return this.f83209d;
    }
}
