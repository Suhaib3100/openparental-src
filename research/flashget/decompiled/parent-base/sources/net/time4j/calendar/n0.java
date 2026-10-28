package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: SolarTerm.java */
/* loaded from: classes7.dex */
public enum n0 {
    MINOR_01_LICHUN_315,
    MAJOR_01_YUSHUI_330,
    MINOR_02_JINGZHE_345,
    MAJOR_02_CHUNFEN_000,
    MINOR_03_QINGMING_015,
    MAJOR_03_GUYU_030,
    MINOR_04_LIXIA_045,
    MAJOR_04_XIAOMAN_060,
    MINOR_05_MANGZHONG_075,
    MAJOR_05_XIAZHI_090,
    MINOR_06_XIAOSHU_105,
    MAJOR_06_DASHU_120,
    MINOR_07_LIQIU_135,
    MAJOR_07_CHUSHU_150,
    MINOR_08_BAILU_165,
    MAJOR_08_QIUFEN_180,
    MINOR_09_HANLU_195,
    MAJOR_09_SHUANGJIANG_210,
    MINOR_10_LIDONG_225,
    MAJOR_10_XIAOXUE_240,
    MINOR_11_DAXUE_255,
    MAJOR_11_DONGZHI_270,
    MINOR_12_XIAOHAN_285,
    MAJOR_12_DAHAN_300;

    private static final double MEAN_TROPICAL_YEAR = 365.242189d;
    private static final n0[] ENUMS = values();
    private static final String[] SIMPLE = {ProtectedSandApp.s("酦\u0001"), ProtectedSandApp.s("酧\u0001"), ProtectedSandApp.s("酨\u0001"), ProtectedSandApp.s("酩\u0001"), ProtectedSandApp.s("酪\u0001"), ProtectedSandApp.s("酫\u0001"), ProtectedSandApp.s("酬\u0001"), ProtectedSandApp.s("酭\u0001"), ProtectedSandApp.s("酮\u0001"), ProtectedSandApp.s("酯\u0001"), ProtectedSandApp.s("酰\u0001"), ProtectedSandApp.s("酱\u0001"), ProtectedSandApp.s("酲\u0001"), ProtectedSandApp.s("酳\u0001"), ProtectedSandApp.s("酴\u0001"), ProtectedSandApp.s("酵\u0001"), ProtectedSandApp.s("酶\u0001"), ProtectedSandApp.s("酷\u0001"), ProtectedSandApp.s("酸\u0001"), ProtectedSandApp.s("酹\u0001"), ProtectedSandApp.s("酺\u0001"), ProtectedSandApp.s("酻\u0001"), ProtectedSandApp.s("酤\u0001"), ProtectedSandApp.s("酥\u0001")};
    private static final String[] TRANSSCRIPTION = {ProtectedSandApp.s("酾\u0001"), ProtectedSandApp.s("酿\u0001"), ProtectedSandApp.s("醀\u0001"), ProtectedSandApp.s("醁\u0001"), ProtectedSandApp.s("醂\u0001"), ProtectedSandApp.s("醃\u0001"), ProtectedSandApp.s("醄\u0001"), ProtectedSandApp.s("醅\u0001"), ProtectedSandApp.s("醆\u0001"), ProtectedSandApp.s("醇\u0001"), ProtectedSandApp.s("醈\u0001"), ProtectedSandApp.s("醉\u0001"), ProtectedSandApp.s("醊\u0001"), ProtectedSandApp.s("醋\u0001"), ProtectedSandApp.s("醌\u0001"), ProtectedSandApp.s("醍\u0001"), ProtectedSandApp.s("醎\u0001"), ProtectedSandApp.s("醏\u0001"), ProtectedSandApp.s("醐\u0001"), ProtectedSandApp.s("醑\u0001"), ProtectedSandApp.s("醒\u0001"), ProtectedSandApp.s("醓\u0001"), ProtectedSandApp.s("酼\u0001"), ProtectedSandApp.s("酽\u0001")};
    private static final String[] CHINESE_SIMPLIFIED = {ProtectedSandApp.s("醖\u0001"), ProtectedSandApp.s("醗\u0001"), ProtectedSandApp.s("醘\u0001"), ProtectedSandApp.s("醙\u0001"), ProtectedSandApp.s("醚\u0001"), ProtectedSandApp.s("醛\u0001"), ProtectedSandApp.s("醜\u0001"), ProtectedSandApp.s("醝\u0001"), ProtectedSandApp.s("醞\u0001"), ProtectedSandApp.s("醟\u0001"), ProtectedSandApp.s("醠\u0001"), ProtectedSandApp.s("醡\u0001"), ProtectedSandApp.s("醢\u0001"), ProtectedSandApp.s("醣\u0001"), ProtectedSandApp.s("醤\u0001"), ProtectedSandApp.s("醥\u0001"), ProtectedSandApp.s("醦\u0001"), ProtectedSandApp.s("醧\u0001"), ProtectedSandApp.s("醨\u0001"), ProtectedSandApp.s("醩\u0001"), ProtectedSandApp.s("醪\u0001"), ProtectedSandApp.s("醫\u0001"), ProtectedSandApp.s("醔\u0001"), ProtectedSandApp.s("醕\u0001")};
    private static final String[] CHINESE_TRADITIONAL = {ProtectedSandApp.s("醖\u0001"), ProtectedSandApp.s("醗\u0001"), ProtectedSandApp.s("醬\u0001"), ProtectedSandApp.s("醙\u0001"), ProtectedSandApp.s("醚\u0001"), ProtectedSandApp.s("醭\u0001"), ProtectedSandApp.s("醜\u0001"), ProtectedSandApp.s("醮\u0001"), ProtectedSandApp.s("醯\u0001"), ProtectedSandApp.s("醟\u0001"), ProtectedSandApp.s("醠\u0001"), ProtectedSandApp.s("醡\u0001"), ProtectedSandApp.s("醢\u0001"), ProtectedSandApp.s("醰\u0001"), ProtectedSandApp.s("醤\u0001"), ProtectedSandApp.s("醥\u0001"), ProtectedSandApp.s("醦\u0001"), ProtectedSandApp.s("醧\u0001"), ProtectedSandApp.s("醨\u0001"), ProtectedSandApp.s("醩\u0001"), ProtectedSandApp.s("醪\u0001"), ProtectedSandApp.s("醫\u0001"), ProtectedSandApp.s("醔\u0001"), ProtectedSandApp.s("醕\u0001")};
    private static final String[] KOREAN = {ProtectedSandApp.s("醳\u0001"), ProtectedSandApp.s("醴\u0001"), ProtectedSandApp.s("醵\u0001"), ProtectedSandApp.s("醶\u0001"), ProtectedSandApp.s("醷\u0001"), ProtectedSandApp.s("醸\u0001"), ProtectedSandApp.s("醹\u0001"), ProtectedSandApp.s("醺\u0001"), ProtectedSandApp.s("醻\u0001"), ProtectedSandApp.s("醼\u0001"), ProtectedSandApp.s("醽\u0001"), ProtectedSandApp.s("醾\u0001"), ProtectedSandApp.s("醿\u0001"), ProtectedSandApp.s("釀\u0001"), ProtectedSandApp.s("釁\u0001"), ProtectedSandApp.s("釂\u0001"), ProtectedSandApp.s("釃\u0001"), ProtectedSandApp.s("釄\u0001"), ProtectedSandApp.s("釅\u0001"), ProtectedSandApp.s("釆\u0001"), ProtectedSandApp.s("采\u0001"), ProtectedSandApp.s("釈\u0001"), ProtectedSandApp.s("醱\u0001"), ProtectedSandApp.s("醲\u0001")};
    private static final String[] VIETNAMESE = {ProtectedSandApp.s("釋\u0001"), ProtectedSandApp.s("里\u0001"), ProtectedSandApp.s("重\u0001"), ProtectedSandApp.s("野\u0001"), ProtectedSandApp.s("量\u0001"), ProtectedSandApp.s("釐\u0001"), ProtectedSandApp.s("金\u0001"), ProtectedSandApp.s("釒\u0001"), ProtectedSandApp.s("釓\u0001"), ProtectedSandApp.s("釔\u0001"), ProtectedSandApp.s("釕\u0001"), ProtectedSandApp.s("釖\u0001"), ProtectedSandApp.s("釗\u0001"), ProtectedSandApp.s("釘\u0001"), ProtectedSandApp.s("釙\u0001"), ProtectedSandApp.s("釚\u0001"), ProtectedSandApp.s("釛\u0001"), ProtectedSandApp.s("釜\u0001"), ProtectedSandApp.s("針\u0001"), ProtectedSandApp.s("釞\u0001"), ProtectedSandApp.s("釟\u0001"), ProtectedSandApp.s("釠\u0001"), ProtectedSandApp.s("釉\u0001"), ProtectedSandApp.s("释\u0001")};
    private static final String[] JAPANESE = {ProtectedSandApp.s("醖\u0001"), ProtectedSandApp.s("醗\u0001"), ProtectedSandApp.s("釡\u0001"), ProtectedSandApp.s("醙\u0001"), ProtectedSandApp.s("醚\u0001"), ProtectedSandApp.s("醭\u0001"), ProtectedSandApp.s("醜\u0001"), ProtectedSandApp.s("釢\u0001"), ProtectedSandApp.s("醯\u0001"), ProtectedSandApp.s("醟\u0001"), ProtectedSandApp.s("醠\u0001"), ProtectedSandApp.s("醡\u0001"), ProtectedSandApp.s("醢\u0001"), ProtectedSandApp.s("釣\u0001"), ProtectedSandApp.s("醤\u0001"), ProtectedSandApp.s("醥\u0001"), ProtectedSandApp.s("醦\u0001"), ProtectedSandApp.s("醧\u0001"), ProtectedSandApp.s("醨\u0001"), ProtectedSandApp.s("醩\u0001"), ProtectedSandApp.s("醪\u0001"), ProtectedSandApp.s("醫\u0001"), ProtectedSandApp.s("醔\u0001"), ProtectedSandApp.s("醕\u0001")};

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* compiled from: SolarTerm.java */
    class a<D> implements net.time4j.engine.v<D> {
        a() {
        }

        /* JADX WARN: Incorrect return type in method signature: (TD;)TD; */
        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j apply(j jVar) {
            return n0.this.onOrAfter(n0.MINOR_01_LICHUN_315.onOrAfter(jVar.p0().e(net.time4j.l0.r1(((net.time4j.l0) jVar.l0(net.time4j.l0.class)).o(), 1, 1).b())));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* compiled from: SolarTerm.java */
    class b<D> implements net.time4j.engine.v<D> {
        b() {
        }

        /* JADX WARN: Incorrect return type in method signature: (TD;)TD; */
        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j apply(j jVar) {
            return n0.this.onOrAfter(jVar.p0().e(n0.newYear(jVar)));
        }
    }

    private net.time4j.d0 atOrAfter(net.time4j.d0 d0Var) {
        double solarLongitude = getSolarLongitude();
        double e4 = net.time4j.calendar.astro.e.k(d0Var).e();
        double modulo360 = ((modulo360(solarLongitude - solarLongitude(e4)) * MEAN_TROPICAL_YEAR) / 360.0d) + e4;
        double max = Math.max(e4, modulo360 - 5.0d);
        double d5 = modulo360 + 5.0d;
        while (true) {
            double d6 = (max + d5) / 2.0d;
            if (d5 - max < 1.0E-5d) {
                return net.time4j.calendar.astro.e.j(d6).s();
            }
            if (modulo360(solarLongitude(d6) - solarLongitude) < 180.0d) {
                d5 = d6;
            } else {
                max = d6;
            }
        }
    }

    private static String[] getTextForms(Locale locale) {
        return locale.getLanguage().equals(ProtectedSandApp.s("釤\u0001")) ? locale.getCountry().equals(ProtectedSandApp.s("釥\u0001")) ? CHINESE_TRADITIONAL : CHINESE_SIMPLIFIED : locale.getLanguage().equals(ProtectedSandApp.s("釦\u0001")) ? KOREAN : locale.getLanguage().equals(ProtectedSandApp.s("釧\u0001")) ? VIETNAMESE : locale.getLanguage().equals(ProtectedSandApp.s("釨\u0001")) ? JAPANESE : locale.getLanguage().isEmpty() ? SIMPLE : TRANSSCRIPTION;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <D extends j<?, D>> List<D> list(int i4, Class<D> cls) {
        ArrayList arrayList = new ArrayList(24);
        j onOrAfter = MINOR_01_LICHUN_315.onOrAfter((j) net.time4j.l0.r1(i4, 1, 1).l0(cls));
        arrayList.add(onOrAfter);
        n0[] values = values();
        for (int i5 = 1; i5 < 24; i5++) {
            onOrAfter = values[i5].onOrAfter(onOrAfter);
            arrayList.add(onOrAfter);
        }
        return arrayList;
    }

    private static double modulo360(double d5) {
        return d5 - (Math.floor(d5 / 360.0d) * 360.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <D extends j<?, ?>> long newYear(D d5) {
        return d5.p0().v(d5.r0(), d5.G0().getNumber());
    }

    public static n0 of(net.time4j.d0 d0Var) {
        return ENUMS[(((int) Math.floor(solarLongitude(net.time4j.calendar.astro.e.k(d0Var).e()) / 15.0d)) + 3) % 24];
    }

    public static n0 ofMajor(int i4) {
        if (i4 < 1 || i4 > 12) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("釩\u0001"), i4));
        }
        return ENUMS[(i4 * 2) - 1];
    }

    public static n0 ofMinor(int i4) {
        if (i4 < 1 || i4 > 12) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("釩\u0001"), i4));
        }
        return ENUMS[(i4 - 1) * 2];
    }

    public static n0 parse(CharSequence charSequence, Locale locale) throws ParseException {
        n0 parse = parse(charSequence, locale, new ParsePosition(0));
        if (parse != null) {
            return parse;
        }
        throw new ParseException(ProtectedSandApp.s("釪\u0001") + ((Object) charSequence), 0);
    }

    static double solarLongitude(double d5) {
        return net.time4j.calendar.astro.k.TIME4J.getFeature(d5, ProtectedSandApp.s("釫\u0001"));
    }

    public String getDisplayName(Locale locale) {
        return getTextForms(locale)[ordinal()];
    }

    public int getIndex() {
        return (ordinal() / 2) + 1;
    }

    public int getSolarLongitude() {
        return ((ordinal() + 21) % 24) * 15;
    }

    public boolean isMajor() {
        return ordinal() % 2 == 1;
    }

    public boolean isMinor() {
        return ordinal() % 2 == 0;
    }

    public <D extends j<?, D>> D onOrAfter(D d5) {
        h p02 = d5.p0();
        long b5 = d5.b();
        return (D) p02.e(atOrAfter(p02.s(b5)).j1(p02.n(b5)).H0().b());
    }

    public n0 roll(int i4) {
        return ENUMS[net.time4j.base.c.c(ordinal() + i4, 24)];
    }

    public <D extends j<?, D>> net.time4j.engine.v<D> sinceLichun() {
        return new a();
    }

    public <D extends j<?, D>> net.time4j.engine.v<D> sinceNewYear() {
        return new b();
    }

    static n0 parse(CharSequence charSequence, Locale locale, ParsePosition parsePosition) {
        String[] textForms = getTextForms(locale);
        boolean isEmpty = locale.getLanguage().isEmpty();
        int index = parsePosition.getIndex();
        for (int i4 = 0; i4 < textForms.length; i4++) {
            String str = textForms[i4];
            String charSequence2 = charSequence.subSequence(index, Math.min(charSequence.length(), str.length() + index)).toString();
            if ((isEmpty && charSequence2.equalsIgnoreCase(str)) || charSequence2.equals(str)) {
                parsePosition.setIndex(str.length() + parsePosition.getIndex());
                return ENUMS[i4];
            }
        }
        if (!locale.getLanguage().isEmpty() && textForms == TRANSSCRIPTION) {
            return parse(charSequence, Locale.ROOT, parsePosition);
        }
        parsePosition.setErrorIndex(parsePosition.getIndex());
        return null;
    }
}
