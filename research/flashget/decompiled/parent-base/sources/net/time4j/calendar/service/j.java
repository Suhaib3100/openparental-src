package net.time4j.calendar.service;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.engine.r;
import net.time4j.engine.v;

/* compiled from: StdIntegerDateElement.java */
/* loaded from: classes7.dex */
public class j<T extends r<T>> extends h<Integer, T> {
    private static final long serialVersionUID = -4975173343610190782L;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f82652e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f82653f;

    /* renamed from: g, reason: collision with root package name */
    private final transient v<T> f82654g;

    /* renamed from: h, reason: collision with root package name */
    private final transient v<T> f82655h;

    public j(String str, Class<T> cls, int i4, int i5, char c5) {
        super(str, cls, c5, str.startsWith(ProtectedSandApp.s("謪\u0001")));
        this.f82652e = i4;
        this.f82653f = i5;
        this.f82654g = null;
        this.f82655h = null;
    }

    @Override // net.time4j.engine.q
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Integer getDefaultMinimum() {
        return Integer.valueOf(this.f82652e);
    }

    @Override // net.time4j.calendar.service.h, net.time4j.calendar.o0
    public v<T> f() {
        v<T> vVar = this.f82655h;
        return vVar != null ? vVar : super.f();
    }

    @Override // net.time4j.engine.q
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // net.time4j.calendar.service.h, net.time4j.calendar.o0
    public v<T> l() {
        v<T> vVar = this.f82654g;
        return vVar != null ? vVar : super.l();
    }

    @Override // net.time4j.engine.q
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Integer getDefaultMaximum() {
        return Integer.valueOf(this.f82653f);
    }

    public j(String str, Class<T> cls, int i4, int i5, char c5, v<T> vVar, v<T> vVar2) {
        super(str, cls, c5, false);
        this.f82652e = i4;
        this.f82653f = i5;
        this.f82654g = vVar;
        this.f82655h = vVar2;
    }
}
