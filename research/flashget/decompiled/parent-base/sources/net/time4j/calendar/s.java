package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HebrewAnniversary.java */
/* loaded from: classes7.dex */
public class s {
    private static final /* synthetic */ s[] $VALUES;
    public static final s BIRTHDAY;
    public static final s YAHRZEIT;

    /* compiled from: HebrewAnniversary.java */
    enum a extends s {

        /* compiled from: HebrewAnniversary.java */
        /* renamed from: net.time4j.calendar.s$a$a, reason: collision with other inner class name */
        class C1288a implements net.time4j.engine.t<net.time4j.engine.h, HebrewCalendar> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f82629a;

            C1288a(int i4) {
                this.f82629a = i4;
            }

            @Override // net.time4j.engine.t
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HebrewCalendar apply(net.time4j.engine.h hVar) {
                HebrewCalendar convert = s.convert(hVar);
                int t4 = convert.t();
                u F0 = convert.F0();
                u uVar = u.ADAR_II;
                if (F0 == uVar) {
                    int i4 = this.f82629a;
                    return HebrewCalendar.X0(i4, HebrewCalendar.L0(i4) ? 13 : 12, t4);
                }
                u F02 = convert.F0();
                if (F02 != u.ADAR_I || HebrewCalendar.L0(this.f82629a)) {
                    uVar = F02;
                }
                return t4 <= 29 ? HebrewCalendar.W0(this.f82629a, uVar, t4) : HebrewCalendar.W0(this.f82629a, uVar, 1).h0(net.time4j.engine.i.i(t4 - 1));
            }
        }

        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // net.time4j.calendar.s
        public net.time4j.engine.t<net.time4j.engine.h, HebrewCalendar> inHebrewYear(int i4) {
            return new C1288a(i4);
        }
    }

    /* compiled from: HebrewAnniversary.java */
    enum b extends s {

        /* compiled from: HebrewAnniversary.java */
        class a implements net.time4j.engine.t<net.time4j.engine.h, HebrewCalendar> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f82631a;

            a(int i4) {
                this.f82631a = i4;
            }

            @Override // net.time4j.engine.t
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HebrewCalendar apply(net.time4j.engine.h hVar) {
                HebrewCalendar convert = s.convert(hVar);
                int o4 = convert.o();
                u F0 = convert.F0();
                int t4 = convert.t();
                u uVar = u.HESHVAN;
                if (F0 == uVar && t4 == 30 && HebrewCalendar.R0(o4 + 1, uVar) == 29) {
                    return HebrewCalendar.W0(this.f82631a, u.KISLEV, 1).g0(net.time4j.engine.i.f82737c);
                }
                u uVar2 = u.KISLEV;
                if (F0 == uVar2 && t4 == 30 && HebrewCalendar.R0(o4 + 1, uVar2) == 29) {
                    return HebrewCalendar.W0(this.f82631a, u.TEVET, 1).g0(net.time4j.engine.i.f82737c);
                }
                u uVar3 = u.ADAR_II;
                return (F0 == uVar3 && HebrewCalendar.L0(o4)) ? HebrewCalendar.W0(this.f82631a, uVar3, t4) : (F0.getBiblicalValue(false) == 12 && t4 == 30 && !HebrewCalendar.L0(this.f82631a)) ? HebrewCalendar.W0(this.f82631a, u.SHEVAT, 30) : HebrewCalendar.X0(this.f82631a, F0.getBiblicalValue(false), 1).h0(net.time4j.engine.i.i(t4 - 1));
            }
        }

        b(String str, int i4) {
            super(str, i4, null);
        }

        @Override // net.time4j.calendar.s
        public net.time4j.engine.t<net.time4j.engine.h, HebrewCalendar> inHebrewYear(int i4) {
            return new a(i4);
        }
    }

    /* compiled from: HebrewAnniversary.java */
    class c implements net.time4j.engine.t<net.time4j.engine.h, List<net.time4j.l0>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f82633a;

        c(int i4) {
            this.f82633a = i4;
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<net.time4j.l0> apply(net.time4j.engine.h hVar) {
            HebrewCalendar convert = s.convert(hVar);
            int o4 = ((HebrewCalendar) net.time4j.l0.r1(this.f82633a, 1, 1).l0(HebrewCalendar.class)).o();
            net.time4j.l0 l0Var = (net.time4j.l0) s.this.inHebrewYear(o4).apply(convert).l0(net.time4j.l0.class);
            net.time4j.l0 l0Var2 = (net.time4j.l0) s.this.inHebrewYear(o4 + 1).apply(convert).l0(net.time4j.l0.class);
            ArrayList arrayList = new ArrayList(2);
            if (l0Var.o() == this.f82633a) {
                arrayList.add(l0Var);
            }
            if (l0Var2.o() == this.f82633a) {
                arrayList.add(l0Var2);
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    static {
        a aVar = new a(ProtectedSandApp.s("鈔\u0001"), 0);
        BIRTHDAY = aVar;
        b bVar = new b(ProtectedSandApp.s("鈕\u0001"), 1);
        YAHRZEIT = bVar;
        $VALUES = new s[]{aVar, bVar};
    }

    private s(String str, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HebrewCalendar convert(net.time4j.engine.h hVar) {
        return hVar instanceof HebrewCalendar ? (HebrewCalendar) hVar : HebrewCalendar.x0().y().e(hVar.b());
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    public net.time4j.engine.t<net.time4j.engine.h, List<net.time4j.l0>> inGregorianYear(int i4) {
        return new c(i4);
    }

    public net.time4j.engine.t<net.time4j.engine.h, HebrewCalendar> inHebrewYear(int i4) {
        throw new AbstractMethodError();
    }

    /* synthetic */ s(String str, int i4, a aVar) {
        this(str, i4);
    }
}
