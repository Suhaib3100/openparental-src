package net.time4j.calendar.service;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.text.ParsePosition;
import net.time4j.engine.ChronoException;
import net.time4j.engine.p;
import net.time4j.engine.r;
import net.time4j.format.x;

/* compiled from: DualYearOfEraElement.java */
/* loaded from: classes7.dex */
public abstract class a<T extends r<T>> extends j<T> implements pe.a {

    /* compiled from: DualYearOfEraElement.java */
    /* renamed from: net.time4j.calendar.service.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1289a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82637a;

        static {
            int[] iArr = new int[x.values().length];
            f82637a = iArr;
            try {
                iArr[x.NARROW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82637a[x.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82637a[x.ABBREVIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected a(Class<T> cls, int i4, int i5, char c5) {
        super(ProtectedSandApp.s("蹊\u0001"), cls, i4, i5, c5, null, null);
    }

    protected abstract net.time4j.format.j C(net.time4j.engine.d dVar);

    @Override // net.time4j.format.v
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Integer parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        int i4;
        net.time4j.format.j C = C(dVar);
        int index = parsePosition.getIndex();
        net.time4j.engine.c<Character> cVar = net.time4j.format.a.f82791m;
        int i5 = 0;
        char charValue = dVar.c(cVar) ? ((Character) dVar.a(cVar)).charValue() : C.isDecimal() ? C.getDigits().charAt(0) : '0';
        net.time4j.format.g gVar = C.isDecimal() ? net.time4j.format.g.SMART : (net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART);
        long j4 = 0;
        if (C.isDecimal()) {
            int min = Math.min(index + 9, charSequence.length());
            int i6 = index;
            i4 = i6;
            while (i6 < min) {
                int charAt = charSequence.charAt(i6) - charValue;
                if (charAt < 0 || charAt > 9) {
                    break;
                }
                j4 = (j4 * 10) + charAt;
                i4++;
                i6++;
            }
        } else {
            int length = charSequence.length();
            for (int i7 = index; i7 < length && C.contains(charSequence.charAt(i7)); i7++) {
                i5++;
            }
            if (i5 > 0) {
                i4 = index + i5;
                j4 = C.toInteger(charSequence.subSequence(index, i4).toString(), gVar);
            } else {
                i4 = index;
            }
        }
        if (i4 == index || j4 > 2147483647L) {
            parsePosition.setErrorIndex(index);
            return null;
        }
        parsePosition.setIndex(i4);
        return Integer.valueOf((int) j4);
    }

    @Override // pe.a
    public void T(p pVar, Appendable appendable, net.time4j.engine.d dVar, net.time4j.format.j jVar, char c5, int i4, int i5) throws IOException, ChronoException {
        String numeral = jVar.toNumeral(pVar.l(this));
        if (jVar.isDecimal()) {
            int length = i4 - numeral.length();
            for (int i6 = 0; i6 < length; i6++) {
                appendable.append(c5);
            }
        }
        appendable.append(numeral);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    @Override // net.time4j.format.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void print(net.time4j.engine.p r9, java.lang.Appendable r10, net.time4j.engine.d r11) throws java.io.IOException, net.time4j.engine.ChronoException {
        /*
            r8 = this;
            net.time4j.format.j r4 = r8.C(r11)
            net.time4j.engine.c<net.time4j.format.x> r0 = net.time4j.format.a.f82785g
            net.time4j.format.x r1 = net.time4j.format.x.NARROW
            java.lang.Object r0 = r11.b(r0, r1)
            net.time4j.format.x r0 = (net.time4j.format.x) r0
            int[] r1 = net.time4j.calendar.service.a.C1289a.f82637a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L22
            r1 = 2
            if (r0 == r1) goto L22
            r1 = 3
            if (r0 == r1) goto L22
            r0 = 4
            r6 = r0
            goto L23
        L22:
            r6 = r1
        L23:
            net.time4j.engine.c<java.lang.Character> r0 = net.time4j.format.a.f82791m
            boolean r1 = r11.c(r0)
            if (r1 == 0) goto L37
            java.lang.Object r0 = r11.a(r0)
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
        L35:
            r5 = r0
            goto L4a
        L37:
            boolean r0 = r4.isDecimal()
            if (r0 == 0) goto L47
            java.lang.String r0 = r4.getDigits()
            r1 = 0
            char r0 = r0.charAt(r1)
            goto L35
        L47:
            r0 = 48
            goto L35
        L4a:
            r7 = 10
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.T(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.service.a.print(net.time4j.engine.p, java.lang.Appendable, net.time4j.engine.d):void");
    }

    @Override // pe.a
    public Integer x(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar, r<?> rVar) {
        return parse(charSequence, parsePosition, dVar);
    }
}
