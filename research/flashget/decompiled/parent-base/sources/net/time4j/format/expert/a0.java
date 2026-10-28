package net.time4j.format.expert;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.format.expert.c;
import net.time4j.i1;
import net.time4j.m0;

/* compiled from: PatternType.java */
/* loaded from: classes7.dex */
public enum a0 {
    CLDR,
    SIMPLE_DATE_FORMAT,
    CLDR_24,
    CLDR_DATE,
    DYNAMIC;

    /* compiled from: PatternType.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82828a;

        static {
            int[] iArr = new int[a0.values().length];
            f82828a = iArr;
            try {
                iArr[a0.CLDR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82828a[a0.SIMPLE_DATE_FORMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82828a[a0.CLDR_24.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82828a[a0.CLDR_DATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82828a[a0.DYNAMIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void addEnumElementAsInteger(c.d<?> dVar, net.time4j.engine.q<? extends Enum> qVar, int i4) {
        dVar.C(qVar, i4, 9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void addEnumElementAsText(c.d<?> dVar, net.time4j.engine.q<? extends Enum> qVar) {
        dVar.K(qVar);
    }

    private static void addMonth(c.d<?> dVar, int i4) {
        if (i4 == 1) {
            dVar.p(net.time4j.l0.f83331v, 1, 2);
            return;
        }
        if (i4 == 2) {
            dVar.l(net.time4j.l0.f83331v, 2);
            return;
        }
        if (i4 == 3) {
            dVar.u0(net.time4j.format.a.f82785g, net.time4j.format.x.ABBREVIATED);
            dVar.K(net.time4j.l0.f83330u);
            dVar.a0();
        } else if (i4 == 4) {
            dVar.u0(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE);
            dVar.K(net.time4j.l0.f83330u);
            dVar.a0();
        } else {
            if (i4 != 5) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎞\u0001"), i4));
            }
            dVar.u0(net.time4j.format.a.f82785g, net.time4j.format.x.NARROW);
            dVar.K(net.time4j.l0.f83330u);
            dVar.a0();
        }
    }

    private static void addNumber(net.time4j.engine.q<Integer> qVar, char c5, c.d<?> dVar, int i4, boolean z4) {
        if (i4 == 1) {
            dVar.p(qVar, 1, 2);
            return;
        }
        if (i4 == 2 || z4) {
            dVar.l(qVar, i4);
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("鎟\u0001") + c5 + ProtectedSandApp.s("鎠\u0001") + i4);
    }

    private static void addOffset(c.d<?> dVar, char c5, int i4, boolean z4) {
        String s4 = ProtectedSandApp.s("鎡\u0001");
        if (i4 == 1) {
            net.time4j.format.e eVar = net.time4j.format.e.SHORT;
            if (!z4) {
                s4 = ProtectedSandApp.s("鎤\u0001");
            }
            dVar.R(eVar, false, Collections.singletonList(s4));
            return;
        }
        String s5 = ProtectedSandApp.s("鎢\u0001");
        if (i4 == 2) {
            net.time4j.format.e eVar2 = net.time4j.format.e.MEDIUM;
            if (!z4) {
                s4 = s5;
            }
            dVar.R(eVar2, false, Collections.singletonList(s4));
            return;
        }
        String s6 = ProtectedSandApp.s("鎣\u0001");
        if (i4 == 3) {
            net.time4j.format.e eVar3 = net.time4j.format.e.MEDIUM;
            if (!z4) {
                s4 = s6;
            }
            dVar.R(eVar3, true, Collections.singletonList(s4));
            return;
        }
        if (i4 == 4) {
            net.time4j.format.e eVar4 = net.time4j.format.e.LONG;
            if (!z4) {
                s4 = s5;
            }
            dVar.R(eVar4, false, Collections.singletonList(s4));
            return;
        }
        if (i4 == 5) {
            net.time4j.format.e eVar5 = net.time4j.format.e.LONG;
            if (!z4) {
                s4 = s6;
            }
            dVar.R(eVar5, true, Collections.singletonList(s4));
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("鎟\u0001") + c5 + ProtectedSandApp.s("鎠\u0001") + i4);
    }

    private static void addQuarterOfYear(c.d<?> dVar, int i4) {
        if (i4 == 1 || i4 == 2) {
            dVar.m(net.time4j.l0.f83329t, i4);
            return;
        }
        if (i4 == 3) {
            dVar.u0(net.time4j.format.a.f82785g, net.time4j.format.x.ABBREVIATED);
            dVar.K(net.time4j.l0.f83329t);
            dVar.a0();
        } else if (i4 == 4) {
            dVar.u0(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE);
            dVar.K(net.time4j.l0.f83329t);
            dVar.a0();
        } else {
            if (i4 != 5) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎥\u0001"), i4));
            }
            dVar.u0(net.time4j.format.a.f82785g, net.time4j.format.x.NARROW);
            dVar.K(net.time4j.l0.f83329t);
            dVar.a0();
        }
    }

    private static int capitalized(int i4) {
        return (i4 < 65 || i4 > 90) ? i4 - 32 : i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T cast(Object obj) {
        return obj;
    }

    private Map<net.time4j.engine.q<?>, net.time4j.engine.q<?>> cldr(c.d<?> dVar, Locale locale, char c5, int i4) {
        net.time4j.engine.x<?> effectiveChronology = getEffectiveChronology(dVar);
        if (isGeneralSymbol(c5) && !isISO(effectiveChronology)) {
            return general(dVar, effectiveChronology, c5, i4, locale);
        }
        if (c5 != 'h' || !getCalendarType(effectiveChronology).equals(ProtectedSandApp.s("鎦\u0001"))) {
            return cldrISO(dVar, effectiveChronology, locale, c5, i4, false);
        }
        net.time4j.engine.q<Integer> findEthiopianHour = findEthiopianHour(effectiveChronology);
        if (findEthiopianHour == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鎧\u0001"));
        }
        addNumber(findEthiopianHour, c5, dVar, i4, false);
        return Collections.emptyMap();
    }

    private Map<net.time4j.engine.q<?>, net.time4j.engine.q<?>> cldr24(c.d<?> dVar, Locale locale, char c5, int i4) {
        if (c5 != 'H') {
            return cldr(dVar, locale, c5, i4);
        }
        addNumber(m0.f83375z, c5, dVar, i4, false);
        return Collections.emptyMap();
    }

    private Map<net.time4j.engine.q<?>, net.time4j.engine.q<?>> cldrISO(c.d<?> dVar, net.time4j.engine.x<?> xVar, Locale locale, char c5, int i4, boolean z4) {
        net.time4j.format.x xVar2;
        net.time4j.format.x xVar3;
        String s4 = ProtectedSandApp.s("鎨\u0001");
        switch (c5) {
            case 'A':
                dVar.p(m0.H, i4, 8);
                break;
            case 'B':
                dVar.u0(net.time4j.format.a.f82785g, getPeriodWidth(i4));
                dVar.g();
                dVar.a0();
                break;
            case 'C':
            case 'I':
            case 'J':
            case 'N':
            case 'P':
            case 'R':
            case 'T':
            case 'U':
            case '[':
            case '\\':
            case ']':
            case '^':
            case '_':
            case '`':
            case 'f':
            case 'i':
            case 'j':
            case 'l':
            case 'n':
            case 'o':
            case 'p':
            case 't':
            case 'v':
            default:
                throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a(ProtectedSandApp.s("鎩\u0001"), c5));
            case 'D':
                if (i4 < 3) {
                    dVar.p(net.time4j.l0.f83334y, i4, 3);
                    break;
                } else {
                    if (i4 != 3 && !z4) {
                        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎳\u0001"), i4));
                    }
                    dVar.l(net.time4j.l0.f83334y, i4);
                    break;
                }
            case 'E':
                if (i4 <= 3) {
                    xVar2 = net.time4j.format.x.ABBREVIATED;
                } else if (i4 == 4 || z4) {
                    xVar2 = net.time4j.format.x.WIDE;
                } else if (i4 == 5) {
                    xVar2 = net.time4j.format.x.NARROW;
                } else {
                    if (i4 != 6) {
                        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎲\u0001"), i4));
                    }
                    xVar2 = net.time4j.format.x.SHORT;
                }
                dVar.u0(net.time4j.format.a.f82785g, xVar2);
                dVar.K(net.time4j.l0.f83333x);
                dVar.a0();
                break;
            case 'F':
                if (i4 != 1 && !z4) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎱\u0001"), i4));
                }
                dVar.l(net.time4j.l0.A, i4);
                break;
            case 'G':
                if (i4 <= 3) {
                    xVar3 = net.time4j.format.x.ABBREVIATED;
                } else if (i4 == 4 || z4) {
                    xVar3 = net.time4j.format.x.WIDE;
                } else {
                    if (i4 != 5) {
                        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎰\u0001"), i4));
                    }
                    xVar3 = net.time4j.format.x.NARROW;
                }
                dVar.u0(net.time4j.format.a.f82785g, xVar3);
                net.time4j.history.d C = net.time4j.history.d.C(locale);
                dVar.M((net.time4j.format.v) net.time4j.format.v.class.cast(C.i()));
                dVar.a0();
                HashMap hashMap = new HashMap();
                hashMap.put(net.time4j.l0.f83327r, C.L());
                hashMap.put(net.time4j.l0.f83330u, C.B());
                hashMap.put(net.time4j.l0.f83331v, C.B());
                hashMap.put(net.time4j.l0.f83332w, C.g());
                hashMap.put(net.time4j.l0.f83334y, C.h());
                return hashMap;
            case 'H':
                addNumber(m0.f83374y, c5, dVar, i4, z4);
                break;
            case 'K':
                addNumber(m0.f83373x, c5, dVar, i4, z4);
                break;
            case 'L':
                dVar.u0(net.time4j.format.a.f82786h, net.time4j.format.m.STANDALONE);
                addMonth(dVar, Math.min(i4, z4 ? 4 : i4));
                dVar.a0();
                break;
            case 'M':
                addMonth(dVar, Math.min(i4, z4 ? 4 : i4));
                break;
            case 'O':
                if (i4 == 1) {
                    dVar.H();
                    break;
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎯\u0001"), i4));
                    }
                    dVar.w();
                    break;
                }
            case 'Q':
                addQuarterOfYear(dVar, i4);
                break;
            case 'S':
                dVar.n(m0.G, i4, i4, false);
                break;
            case 'V':
                if (i4 != 2) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎮\u0001"), i4));
                }
                try {
                    dVar.N();
                    break;
                } catch (IllegalStateException e4) {
                    throw new IllegalArgumentException(e4.getMessage());
                }
            case 'W':
                if (i4 != 1) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎭\u0001"), i4));
                }
                dVar.l(i1.k(locale).o(), 1);
                break;
            case 'X':
                addOffset(dVar, c5, i4, true);
                break;
            case 'Y':
                if (i4 != 2) {
                    dVar.T(net.time4j.l0.f83328s, i4, false);
                    break;
                } else {
                    dVar.S(net.time4j.l0.f83328s);
                    break;
                }
            case 'Z':
                if (i4 < 4) {
                    dVar.R(net.time4j.format.e.LONG, false, Collections.singletonList(ProtectedSandApp.s("鎢\u0001")));
                    break;
                } else if (i4 == 4) {
                    dVar.w();
                    break;
                } else {
                    if (i4 != 5) {
                        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎬\u0001"), i4));
                    }
                    dVar.R(net.time4j.format.e.LONG, true, Collections.singletonList(ProtectedSandApp.s("鎡\u0001")));
                    break;
                }
            case 'a':
                dVar.u0(net.time4j.format.a.f82785g, z4 ? net.time4j.format.x.ABBREVIATED : getPeriodWidth(i4));
                dVar.K(m0.f83370u);
                dVar.a0();
                if (getCalendarType(xVar).equals(ProtectedSandApp.s("鎦\u0001"))) {
                    net.time4j.engine.q<Integer> findEthiopianHour = findEthiopianHour(xVar);
                    if (findEthiopianHour == null) {
                        throw new IllegalArgumentException(ProtectedSandApp.s("鎧\u0001"));
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(findEthiopianHour, m0.f83371v);
                    return hashMap2;
                }
                break;
            case 'b':
                dVar.u0(net.time4j.format.a.f82785g, getPeriodWidth(i4));
                dVar.h();
                dVar.a0();
                break;
            case 'c':
                if (i4 == 2) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("鎫\u0001"));
                }
                dVar.u0(net.time4j.format.a.f82786h, net.time4j.format.m.STANDALONE);
                if (i4 == 1) {
                    dVar.m(i1.k(locale).j(), 1);
                } else {
                    cldrISO(dVar, xVar, locale, 'E', i4, z4);
                }
                dVar.a0();
                break;
            case 'd':
                addNumber(net.time4j.l0.f83332w, c5, dVar, i4, z4);
                break;
            case 'e':
                if (i4 > 2) {
                    cldrISO(dVar, xVar, locale, 'E', i4, z4);
                    break;
                } else {
                    dVar.m(i1.k(locale).j(), i4);
                    break;
                }
            case 'g':
                dVar.x(net.time4j.engine.b0.MODIFIED_JULIAN_DATE, i4, 18, b0.SHOW_WHEN_NEGATIVE);
                break;
            case 'h':
                addNumber(m0.f83371v, c5, dVar, i4, z4);
                break;
            case 'k':
                addNumber(m0.f83372w, c5, dVar, i4, z4);
                break;
            case 'm':
                addNumber(m0.A, c5, dVar, i4, z4);
                break;
            case 'q':
                dVar.u0(net.time4j.format.a.f82786h, net.time4j.format.m.STANDALONE);
                addQuarterOfYear(dVar, i4);
                dVar.a0();
                break;
            case 'r':
                dVar.u0(net.time4j.format.a.f82790l, net.time4j.format.j.ARABIC);
                dVar.s0(net.time4j.format.a.f82791m, '0');
                dVar.T(net.time4j.l0.f83327r, i4, true);
                dVar.a0();
                dVar.a0();
                break;
            case 's':
                addNumber(m0.C, c5, dVar, i4, z4);
                break;
            case 'u':
                dVar.T(net.time4j.l0.f83327r, i4, true);
                break;
            case 'w':
                if (i4 > 2) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎪\u0001"), i4));
                }
                net.time4j.c<Integer, net.time4j.l0> p4 = i1.k(locale).p();
                Iterator<net.time4j.engine.q<?>> it = xVar.H().iterator();
                while (true) {
                    if (it.hasNext()) {
                        net.time4j.engine.q<?> next = it.next();
                        if (next.getSymbol() == c5) {
                            i1 i1Var = i1.f83248r;
                            if (next.equals(i1Var.p())) {
                                p4 = i1Var.p();
                            }
                        }
                    }
                }
                addNumber(p4, c5, dVar, i4, z4);
                break;
            case 'x':
                addOffset(dVar, c5, i4, false);
                break;
            case 'y':
                if (i4 != 2) {
                    dVar.T(net.time4j.l0.f83327r, i4, false);
                    break;
                } else {
                    dVar.S(net.time4j.l0.f83327r);
                    break;
                }
            case 'z':
                try {
                    if (i4 < 4) {
                        dVar.I();
                        break;
                    } else {
                        if (i4 != 4 && !z4) {
                            throw new IllegalArgumentException(s4 + i4);
                        }
                        dVar.y();
                    }
                } catch (IllegalStateException e5) {
                    throw new IllegalArgumentException(e5.getMessage());
                }
        }
        return Collections.emptyMap();
    }

    private Map<net.time4j.engine.q<?>, net.time4j.engine.q<?>> dynamic(c.d<?> dVar, char c5, int i4, Locale locale) {
        boolean z4;
        boolean z5 = c5 >= 'A' && c5 <= 'Z';
        net.time4j.engine.q<?> findDynamicElement = findDynamicElement(getEffectiveChronology(dVar), locale, c5);
        if (findDynamicElement == null) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a(ProtectedSandApp.s("鎶\u0001"), c5));
        }
        if (z5 && (((z4 = findDynamicElement instanceof net.time4j.format.v)) || Enum.class.isAssignableFrom(findDynamicElement.getType()))) {
            if (i4 == 1) {
                dVar.u0(net.time4j.format.a.f82785g, net.time4j.format.x.NARROW);
            } else if (i4 == 2) {
                dVar.u0(net.time4j.format.a.f82785g, net.time4j.format.x.SHORT);
            } else if (i4 == 3) {
                dVar.u0(net.time4j.format.a.f82785g, net.time4j.format.x.ABBREVIATED);
            } else {
                if (i4 != 4) {
                    throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a(ProtectedSandApp.s("鎴\u0001"), c5));
                }
                dVar.u0(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE);
            }
            if (z4) {
                dVar.M((net.time4j.format.v) cast(findDynamicElement));
            } else {
                addEnumElementAsText(dVar, (net.time4j.engine.q) cast(findDynamicElement));
            }
            dVar.a0();
        } else if (findDynamicElement.getType() == Integer.class) {
            dVar.p((net.time4j.engine.q) cast(findDynamicElement), i4, 9);
        } else {
            if (!Enum.class.isAssignableFrom(findDynamicElement.getType())) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鎵\u0001") + findDynamicElement);
            }
            addEnumElementAsInteger(dVar, (net.time4j.engine.q) cast(findDynamicElement), i4);
        }
        return Collections.emptyMap();
    }

    private static net.time4j.engine.q<?> find(Set<net.time4j.engine.q<?>> set, char c5, String str) {
        char c6 = c5 == 'L' ? 'M' : c5 == 'c' ? 'e' : c5;
        for (net.time4j.engine.q<?> qVar : set) {
            if (qVar.isDateElement() && qVar.getSymbol() == c6 && (c6 != 'M' || !qVar.name().equals(ProtectedSandApp.s("鎷\u0001")))) {
                return qVar;
            }
        }
        if (c5 == 'y' && str.equals(ProtectedSandApp.s("鎸\u0001"))) {
            return net.time4j.l0.f83327r;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("鎹\u0001") + c5 + ProtectedSandApp.s("鎺\u0001") + str + ProtectedSandApp.s("鎻\u0001"));
    }

    private static net.time4j.engine.q<?> findDynamicElement(net.time4j.engine.x<?> xVar, Locale locale, int i4) {
        net.time4j.engine.q<?> findDynamicElement = findDynamicElement(xVar, locale, i4, false);
        return findDynamicElement == null ? findDynamicElement(xVar, locale, i4, true) : findDynamicElement;
    }

    private static net.time4j.engine.q<Integer> findEthiopianHour(net.time4j.engine.x<?> xVar) {
        Iterator<net.time4j.engine.s> it = xVar.E().iterator();
        while (it.hasNext()) {
            for (net.time4j.engine.q<?> qVar : it.next().b(Locale.ROOT, net.time4j.format.a.f())) {
                if (qVar.name().equals(ProtectedSandApp.s("鎼\u0001"))) {
                    return (net.time4j.engine.q) cast(qVar);
                }
            }
        }
        return null;
    }

    private Map<net.time4j.engine.q<?>, net.time4j.engine.q<?>> general(c.d<?> dVar, net.time4j.engine.x<?> xVar, char c5, int i4, Locale locale) {
        net.time4j.format.v<?> vVar;
        net.time4j.engine.q<Integer> qVar;
        net.time4j.format.x xVar2;
        net.time4j.format.x xVar3;
        net.time4j.format.x xVar4;
        if (c5 == 'g') {
            dVar.x(net.time4j.engine.b0.MODIFIED_JULIAN_DATE, i4, 18, b0.SHOW_WHEN_NEGATIVE);
            return Collections.emptyMap();
        }
        if (c5 == 'G' && xVar == net.time4j.l0.T0()) {
            return cldrISO(dVar, xVar, locale, c5, i4, false);
        }
        Set<net.time4j.engine.q<?>> elements = getElements(xVar, c5, locale);
        String name = dVar.e0().C().getName();
        net.time4j.engine.q<?> find = find(elements, c5, name);
        boolean isAssignableFrom = Integer.class.isAssignableFrom(find.getType());
        String s4 = ProtectedSandApp.s("鎽\u0001");
        String s5 = ProtectedSandApp.s("鎺\u0001");
        String s6 = ProtectedSandApp.s("鎾\u0001");
        if (isAssignableFrom) {
            vVar = find instanceof pe.a ? (net.time4j.format.v) cast(find) : null;
            qVar = (net.time4j.engine.q) cast(find);
        } else {
            if (!(find instanceof net.time4j.format.v)) {
                throw new IllegalStateException(s6 + find + s5 + name + s4);
            }
            vVar = (net.time4j.format.v) cast(find);
            qVar = null;
        }
        if (c5 == 'L') {
            dVar.u0(net.time4j.format.a.f82786h, net.time4j.format.m.STANDALONE);
            addMonth(dVar, i4, vVar);
            dVar.a0();
        } else if (c5 == 'M') {
            addMonth(dVar, i4, vVar);
        } else if (c5 != 'U') {
            boolean z4 = true;
            if (c5 != 'W') {
                if (c5 == 'r') {
                    dVar.u0(net.time4j.format.a.f82790l, net.time4j.format.j.ARABIC);
                    dVar.s0(net.time4j.format.a.f82791m, '0');
                    dVar.T(qVar, i4, true);
                    dVar.a0();
                    dVar.a0();
                } else if (c5 == 'w') {
                    addNumber(qVar, c5, dVar, i4, false);
                } else if (c5 != 'y') {
                    switch (c5) {
                        case 'D':
                            if (i4 < 3) {
                                dVar.p(qVar, i4, 3);
                                break;
                            } else {
                                if (i4 != 3) {
                                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎳\u0001"), i4));
                                }
                                dVar.l(qVar, i4);
                                break;
                            }
                        case 'E':
                            if (i4 <= 3) {
                                xVar3 = net.time4j.format.x.ABBREVIATED;
                            } else if (i4 == 4) {
                                xVar3 = net.time4j.format.x.WIDE;
                            } else if (i4 == 5) {
                                xVar3 = net.time4j.format.x.NARROW;
                            } else {
                                if (i4 != 6) {
                                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎲\u0001"), i4));
                                }
                                xVar3 = net.time4j.format.x.SHORT;
                            }
                            dVar.u0(net.time4j.format.a.f82785g, xVar3);
                            dVar.M(vVar);
                            dVar.a0();
                            break;
                        case 'F':
                            if (i4 != 1) {
                                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎱\u0001"), i4));
                            }
                            dVar.l(qVar, i4);
                            break;
                        case 'G':
                            if (i4 <= 3) {
                                xVar4 = net.time4j.format.x.ABBREVIATED;
                            } else if (i4 == 4) {
                                xVar4 = net.time4j.format.x.WIDE;
                            } else {
                                if (i4 != 5) {
                                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎰\u0001"), i4));
                                }
                                xVar4 = net.time4j.format.x.NARROW;
                            }
                            dVar.u0(net.time4j.format.a.f82785g, xVar4);
                            dVar.M(vVar);
                            dVar.a0();
                            break;
                        default:
                            switch (c5) {
                                case 'c':
                                    if (i4 == 2) {
                                        throw new IllegalArgumentException(ProtectedSandApp.s("鎫\u0001"));
                                    }
                                    dVar.u0(net.time4j.format.a.f82786h, net.time4j.format.m.STANDALONE);
                                    if (i4 == 1) {
                                        dVar.m((net.time4j.engine.q) cast(find), 1);
                                    } else {
                                        general(dVar, xVar, 'E', i4, locale);
                                    }
                                    dVar.a0();
                                    break;
                                case 'd':
                                    if (qVar != null) {
                                        addNumber(qVar, c5, dVar, i4, false);
                                        break;
                                    } else {
                                        if (i4 > 2) {
                                            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎿\u0001"), i4));
                                        }
                                        dVar.t0(pe.a.G2, i4);
                                        dVar.M(vVar);
                                        dVar.a0();
                                        break;
                                    }
                                case 'e':
                                    if (i4 > 2) {
                                        general(dVar, xVar, 'E', i4, locale);
                                        break;
                                    } else {
                                        dVar.m((net.time4j.engine.q) cast(find), i4);
                                        break;
                                    }
                                default:
                                    throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a(ProtectedSandApp.s("鎩\u0001"), c5));
                            }
                    }
                } else {
                    if (locale.getLanguage().equals(ProtectedSandApp.s("鏀\u0001")) && getCalendarType(xVar).equals(ProtectedSandApp.s("鎦\u0001"))) {
                        dVar.u0(net.time4j.format.a.f82790l, net.time4j.format.j.ETHIOPIC);
                    } else {
                        z4 = false;
                    }
                    if (i4 == 2) {
                        dVar.S(qVar);
                    } else {
                        dVar.T(qVar, i4, false);
                    }
                    if (z4) {
                        dVar.a0();
                    }
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎭\u0001"), i4));
                }
                dVar.l(qVar, 1);
            }
        } else {
            if (vVar == null) {
                throw new IllegalStateException(s6 + find + s5 + name + s4);
            }
            if (i4 <= 3) {
                xVar2 = net.time4j.format.x.ABBREVIATED;
            } else if (i4 == 4) {
                xVar2 = net.time4j.format.x.WIDE;
            } else {
                if (i4 != 5) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鏁\u0001"), i4));
                }
                xVar2 = net.time4j.format.x.NARROW;
            }
            dVar.u0(net.time4j.format.a.f82785g, xVar2);
            dVar.M(vVar);
            dVar.a0();
        }
        return Collections.emptyMap();
    }

    private static String getCalendarType(net.time4j.engine.x<?> xVar) {
        net.time4j.format.c cVar = (net.time4j.format.c) xVar.C().getAnnotation(net.time4j.format.c.class);
        return cVar == null ? ProtectedSandApp.s("鏂\u0001") : cVar.value();
    }

    private static net.time4j.engine.x<?> getEffectiveChronology(c.d<?> dVar) {
        net.time4j.engine.x<?> e02 = dVar.e0();
        while (e02 instanceof net.time4j.engine.g) {
            e02 = e02.d();
        }
        return e02;
    }

    private static Set<net.time4j.engine.q<?>> getElements(net.time4j.engine.x<?> xVar, char c5, Locale locale) {
        if (c5 != 'w' && c5 != 'W' && c5 != 'e' && c5 != 'c') {
            return xVar.H();
        }
        Iterator<net.time4j.engine.s> it = xVar.E().iterator();
        while (it.hasNext()) {
            for (net.time4j.engine.q<?> qVar : it.next().b(locale, net.time4j.format.a.f())) {
                if (((c5 == 'e' || c5 == 'c') && qVar.name().equals(ProtectedSandApp.s("鏃\u0001"))) || ((c5 == 'w' && qVar.name().equals(ProtectedSandApp.s("鏄\u0001"))) || (c5 == 'W' && qVar.name().equals(ProtectedSandApp.s("鏅\u0001"))))) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(qVar);
                    return hashSet;
                }
            }
        }
        return Collections.emptySet();
    }

    private static net.time4j.format.x getPeriodWidth(int i4) {
        if (i4 <= 3) {
            return net.time4j.format.x.ABBREVIATED;
        }
        if (i4 == 4) {
            return net.time4j.format.x.WIDE;
        }
        if (i4 == 5) {
            return net.time4j.format.x.NARROW;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鏆\u0001"), i4));
    }

    private static boolean isGeneralSymbol(char c5) {
        if (c5 == 'L' || c5 == 'M' || c5 == 'U' || c5 == 'W' || c5 == 'g' || c5 == 'r' || c5 == 'w' || c5 == 'y') {
            return true;
        }
        switch (c5) {
            case 'D':
            case 'E':
            case 'F':
            case 'G':
                return true;
            default:
                switch (c5) {
                    case 'c':
                    case 'd':
                    case 'e':
                        return true;
                    default:
                        return false;
                }
        }
    }

    private static boolean isISO(net.time4j.engine.x<?> xVar) {
        return getCalendarType(xVar).equals(ProtectedSandApp.s("鏂\u0001"));
    }

    private Map<net.time4j.engine.q<?>, net.time4j.engine.q<?>> sdf(c.d<?> dVar, net.time4j.engine.x<?> xVar, Locale locale, char c5, int i4) {
        if (c5 != 'B' && c5 != 'O' && c5 != 'Q') {
            if (c5 == 'S') {
                dVar.l(m0.E, i4);
            } else if (c5 == 'Z') {
                addOffset(dVar, c5, 2, false);
            } else if (c5 != 'e' && c5 != 'g') {
                if (c5 == 'u') {
                    dVar.m(net.time4j.l0.f83333x, i4);
                } else if (c5 != 'x' && c5 != 'b' && c5 != 'c' && c5 != 'q' && c5 != 'r') {
                    switch (c5) {
                        case 'U':
                        case 'V':
                            break;
                        case 'W':
                            dVar.l(i1.k(locale).a(), i4);
                            break;
                        case 'X':
                            if (i4 < 4) {
                                return cldrISO(dVar, xVar, locale, 'X', i4, true);
                            }
                            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鏇\u0001"), i4));
                        default:
                            return cldrISO(dVar, xVar, locale, c5, i4, true);
                    }
                }
            }
            return Collections.emptyMap();
        }
        throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a(ProtectedSandApp.s("鏈\u0001"), c5));
    }

    Map<net.time4j.engine.q<?>, net.time4j.engine.q<?>> registerSymbol(c.d<?> dVar, Locale locale, char c5, int i4) {
        net.time4j.engine.x<?> effectiveChronology = getEffectiveChronology(dVar);
        int i5 = a.f82828a[ordinal()];
        if (i5 == 1) {
            return cldr(dVar, locale, c5, i4);
        }
        if (i5 == 2) {
            return sdf(dVar, effectiveChronology, locale, c5, i4);
        }
        if (i5 == 3) {
            return cldr24(dVar, locale, c5, i4);
        }
        if (i5 != 4) {
            if (i5 == 5) {
                return dynamic(dVar, c5, i4, locale);
            }
            throw new UnsupportedOperationException(name());
        }
        Class<?> C = effectiveChronology.C();
        if (net.time4j.engine.n.class.isAssignableFrom(C) || net.time4j.engine.m.class.isAssignableFrom(C)) {
            return general(dVar, effectiveChronology, c5, i4, locale);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("鏉\u0001"));
    }

    private static net.time4j.engine.q<?> findDynamicElement(net.time4j.engine.x<?> xVar, Locale locale, int i4, boolean z4) {
        if (z4) {
            i4 = capitalized(i4);
        }
        for (net.time4j.engine.q<?> qVar : xVar.H()) {
            int symbol = qVar.getSymbol();
            if (z4) {
                symbol = capitalized(symbol);
            }
            if (symbol == i4) {
                return qVar;
            }
        }
        Iterator<net.time4j.engine.s> it = xVar.E().iterator();
        while (it.hasNext()) {
            for (net.time4j.engine.q<?> qVar2 : it.next().b(locale, net.time4j.format.a.f())) {
                int symbol2 = qVar2.getSymbol();
                if (z4) {
                    symbol2 = capitalized(symbol2);
                }
                if (symbol2 == i4) {
                    return qVar2;
                }
            }
        }
        return null;
    }

    private static <V extends Enum<V>> void addMonth(c.d<?> dVar, int i4, net.time4j.format.v<?> vVar) {
        if (i4 == 1 || i4 == 2) {
            if (Enum.class.isAssignableFrom(vVar.getType())) {
                net.time4j.engine.q<V> qVar = (net.time4j.engine.q) cast(vVar);
                if (i4 == 1) {
                    dVar.C(qVar, 1, 2);
                    return;
                } else {
                    if (i4 == 2) {
                        dVar.m(qVar, 2);
                        return;
                    }
                    return;
                }
            }
            dVar.t0(pe.a.G2, i4);
            dVar.M(vVar);
            dVar.a0();
            return;
        }
        if (i4 == 3) {
            dVar.u0(net.time4j.format.a.f82785g, net.time4j.format.x.ABBREVIATED);
            dVar.M(vVar);
            dVar.a0();
        } else if (i4 == 4) {
            dVar.u0(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE);
            dVar.M(vVar);
            dVar.a0();
        } else {
            if (i4 == 5) {
                dVar.u0(net.time4j.format.a.f82785g, net.time4j.format.x.NARROW);
                dVar.M(vVar);
                dVar.a0();
                return;
            }
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鎞\u0001"), i4));
        }
    }
}
