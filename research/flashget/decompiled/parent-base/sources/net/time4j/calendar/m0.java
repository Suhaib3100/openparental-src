package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: SexagesimalName.java */
/* loaded from: classes7.dex */
public class m0 implements Comparable<m0>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f82598b = {ProtectedSandApp.s("迨\u0001"), ProtectedSandApp.s("迩\u0001"), ProtectedSandApp.s("迪\u0001"), ProtectedSandApp.s("迫\u0001"), ProtectedSandApp.s("迬\u0001"), ProtectedSandApp.s("迭\u0001"), ProtectedSandApp.s("迮\u0001"), ProtectedSandApp.s("迯\u0001"), ProtectedSandApp.s("迦\u0001"), ProtectedSandApp.s("迧\u0001")};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f82599c = {ProtectedSandApp.s("迲\u0001"), ProtectedSandApp.s("迳\u0001"), ProtectedSandApp.s("迴\u0001"), ProtectedSandApp.s("迵\u0001"), ProtectedSandApp.s("迶\u0001"), ProtectedSandApp.s("迷\u0001"), ProtectedSandApp.s("迸\u0001"), ProtectedSandApp.s("迹\u0001"), ProtectedSandApp.s("述\u0001"), ProtectedSandApp.s("迱\u0001")};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f82600d = {ProtectedSandApp.s("迼\u0001"), ProtectedSandApp.s("追\u0001"), ProtectedSandApp.s("迾\u0001"), ProtectedSandApp.s("迿\u0001"), ProtectedSandApp.s("退\u0001"), ProtectedSandApp.s("送\u0001"), ProtectedSandApp.s("适\u0001"), ProtectedSandApp.s("逃\u0001"), ProtectedSandApp.s("迺\u0001"), ProtectedSandApp.s("迻\u0001")};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f82601e = {ProtectedSandApp.s("逆\u0001"), ProtectedSandApp.s("逇\u0001"), ProtectedSandApp.s("逈\u0001"), ProtectedSandApp.s("选\u0001"), ProtectedSandApp.s("逊\u0001"), ProtectedSandApp.s("逋\u0001"), ProtectedSandApp.s("逌\u0001"), ProtectedSandApp.s("逍\u0001"), ProtectedSandApp.s("逄\u0001"), ProtectedSandApp.s("逅\u0001")};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f82602f = {ProtectedSandApp.s("逐\u0001"), ProtectedSandApp.s("逑\u0001"), ProtectedSandApp.s("递\u0001"), ProtectedSandApp.s("逓\u0001"), ProtectedSandApp.s("途\u0001"), ProtectedSandApp.s("逕\u0001"), ProtectedSandApp.s("逖\u0001"), ProtectedSandApp.s("逗\u0001"), ProtectedSandApp.s("逎\u0001"), ProtectedSandApp.s("透\u0001")};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f82603g = {ProtectedSandApp.s("通\u0001"), ProtectedSandApp.s("逛\u0001"), ProtectedSandApp.s("逜\u0001"), ProtectedSandApp.s("逝\u0001"), ProtectedSandApp.s("逞\u0001"), ProtectedSandApp.s("速\u0001"), ProtectedSandApp.s("造\u0001"), ProtectedSandApp.s("逡\u0001"), ProtectedSandApp.s("逘\u0001"), ProtectedSandApp.s("這\u0001")};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f82604h = {ProtectedSandApp.s("逤\u0001"), ProtectedSandApp.s("逥\u0001"), ProtectedSandApp.s("逦\u0001"), ProtectedSandApp.s("逧\u0001"), ProtectedSandApp.s("逨\u0001"), ProtectedSandApp.s("逩\u0001"), ProtectedSandApp.s("迬\u0001"), ProtectedSandApp.s("逪\u0001"), ProtectedSandApp.s("逫\u0001"), ProtectedSandApp.s("逬\u0001"), ProtectedSandApp.s("逢\u0001"), ProtectedSandApp.s("連\u0001")};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f82605i = {ProtectedSandApp.s("逯\u0001"), ProtectedSandApp.s("逰\u0001"), ProtectedSandApp.s("週\u0001"), ProtectedSandApp.s("進\u0001"), ProtectedSandApp.s("逳\u0001"), ProtectedSandApp.s("逴\u0001"), ProtectedSandApp.s("逵\u0001"), ProtectedSandApp.s("逶\u0001"), ProtectedSandApp.s("逷\u0001"), ProtectedSandApp.s("逸\u0001"), ProtectedSandApp.s("逭\u0001"), ProtectedSandApp.s("逮\u0001")};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f82606j = {ProtectedSandApp.s("逻\u0001"), ProtectedSandApp.s("逼\u0001"), ProtectedSandApp.s("逽\u0001"), ProtectedSandApp.s("逾\u0001"), ProtectedSandApp.s("逿\u0001"), ProtectedSandApp.s("遀\u0001"), ProtectedSandApp.s("遁\u0001"), ProtectedSandApp.s("遂\u0001"), ProtectedSandApp.s("遃\u0001"), ProtectedSandApp.s("遄\u0001"), ProtectedSandApp.s("逹\u0001"), ProtectedSandApp.s("逺\u0001")};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f82607k = {ProtectedSandApp.s("遇\u0001"), ProtectedSandApp.s("遈\u0001"), ProtectedSandApp.s("遉\u0001"), ProtectedSandApp.s("遊\u0001"), ProtectedSandApp.s("運\u0001"), ProtectedSandApp.s("遌\u0001"), ProtectedSandApp.s("遍\u0001"), ProtectedSandApp.s("過\u0001"), ProtectedSandApp.s("逍\u0001"), ProtectedSandApp.s("遏\u0001"), ProtectedSandApp.s("遅\u0001"), ProtectedSandApp.s("遆\u0001")};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f82608l = {ProtectedSandApp.s("遒\u0001"), ProtectedSandApp.s("道\u0001"), ProtectedSandApp.s("達\u0001"), ProtectedSandApp.s("違\u0001"), ProtectedSandApp.s("遖\u0001"), ProtectedSandApp.s("遗\u0001"), ProtectedSandApp.s("遘\u0001"), ProtectedSandApp.s("遙\u0001"), ProtectedSandApp.s("遚\u0001"), ProtectedSandApp.s("遛\u0001"), ProtectedSandApp.s("遐\u0001"), ProtectedSandApp.s("遑\u0001")};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f82609m = {ProtectedSandApp.s("遞\u0001"), ProtectedSandApp.s("遟\u0001"), ProtectedSandApp.s("遠\u0001"), ProtectedSandApp.s("遡\u0001"), ProtectedSandApp.s("遢\u0001"), ProtectedSandApp.s("遣\u0001"), ProtectedSandApp.s("逞\u0001"), ProtectedSandApp.s("遤\u0001"), ProtectedSandApp.s("遥\u0001"), ProtectedSandApp.s("遦\u0001"), ProtectedSandApp.s("遜\u0001"), ProtectedSandApp.s("遝\u0001")};

    /* renamed from: n, reason: collision with root package name */
    private static final m0[] f82610n;

    /* renamed from: o, reason: collision with root package name */
    private static final Map<String, String[]> f82611o;

    /* renamed from: p, reason: collision with root package name */
    private static final Map<String, String[]> f82612p;

    /* renamed from: q, reason: collision with root package name */
    private static final Set<String> f82613q;
    private static final long serialVersionUID = -4556668597489844917L;
    private final int number;

    /* compiled from: SexagesimalName.java */
    public enum a {
        ZI_1_RAT,
        CHOU_2_OX,
        YIN_3_TIGER,
        MAO_4_HARE,
        CHEN_5_DRAGON,
        SI_6_SNAKE,
        WU_7_HORSE,
        WEI_8_SHEEP,
        SHEN_9_MONKEY,
        YOU_10_FOWL,
        XU_11_DOG,
        HAI_12_PIG;

        public String getDisplayName(Locale locale) {
            String language = locale.getLanguage();
            Map map = m0.f82612p;
            if (language.isEmpty()) {
                language = ProtectedSandApp.s("鄰\u0001");
            }
            String[] strArr = (String[]) map.get(language);
            if (strArr == null) {
                strArr = m0.f82605i;
            }
            return strArr[ordinal()];
        }

        public String getZodiac(Locale locale) {
            return net.time4j.format.b.d(ProtectedSandApp.s("鄲\u0001"), locale).o().get(ProtectedSandApp.s("鄱\u0001") + String.valueOf(ordinal() + 1));
        }
    }

    /* compiled from: SexagesimalName.java */
    public enum b {
        JIA_1_WOOD_YANG,
        YI_2_WOOD_YIN,
        BING_3_FIRE_YANG,
        DING_4_FIRE_YIN,
        WU_5_EARTH_YANG,
        JI_6_EARTH_YIN,
        GENG_7_METAL_YANG,
        XIN_8_METAL_YIN,
        REN_9_WATER_YANG,
        GUI_10_WATER_YIN;

        public String getDisplayName(Locale locale) {
            String language = locale.getLanguage();
            Map map = m0.f82611o;
            if (language.isEmpty()) {
                language = ProtectedSandApp.s("鄽\u0001");
            }
            String[] strArr = (String[]) map.get(language);
            if (strArr == null) {
                strArr = m0.f82599c;
            }
            return strArr[ordinal()];
        }
    }

    static {
        m0[] m0VarArr = new m0[60];
        int i4 = 0;
        while (i4 < 60) {
            int i5 = i4 + 1;
            m0VarArr[i4] = new m0(i5);
            i4 = i5;
        }
        f82610n = m0VarArr;
        HashMap hashMap = new HashMap();
        String[] strArr = f82598b;
        String s4 = ProtectedSandApp.s("遧\u0001");
        hashMap.put(s4, strArr);
        String[] strArr2 = f82600d;
        String s5 = ProtectedSandApp.s("遨\u0001");
        hashMap.put(s5, strArr2);
        String s6 = ProtectedSandApp.s("適\u0001");
        hashMap.put(s6, strArr2);
        String[] strArr3 = f82601e;
        String s7 = ProtectedSandApp.s("遪\u0001");
        hashMap.put(s7, strArr3);
        String[] strArr4 = f82602f;
        String s10 = ProtectedSandApp.s("遫\u0001");
        hashMap.put(s10, strArr4);
        String[] strArr5 = f82603g;
        String s11 = ProtectedSandApp.s("遬\u0001");
        hashMap.put(s11, strArr5);
        f82611o = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(s4, f82604h);
        String[] strArr6 = f82606j;
        hashMap2.put(s5, strArr6);
        hashMap2.put(s6, strArr6);
        hashMap2.put(s7, f82607k);
        hashMap2.put(s10, f82608l);
        hashMap2.put(s11, f82609m);
        f82612p = Collections.unmodifiableMap(hashMap2);
        HashSet hashSet = new HashSet();
        hashSet.add(s5);
        hashSet.add(s6);
        hashSet.add(s7);
        f82613q = Collections.unmodifiableSet(hashSet);
    }

    m0(int i4) {
        this.number = i4;
    }

    public static m0 j(int i4) {
        if (i4 < 1 || i4 > 60) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("遭\u0001"), i4));
        }
        return f82610n[i4 - 1];
    }

    public static m0 k(b bVar, a aVar) {
        int ordinal = bVar.ordinal();
        m0 j4 = j(net.time4j.base.c.c((aVar.ordinal() - ordinal) * 25, 60) + ordinal + 1);
        if (j4.h() == bVar && j4.f() == aVar) {
            return j4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("遮\u0001"));
    }

    static m0 l(CharSequence charSequence, ParsePosition parsePosition, Locale locale, boolean z4) {
        b bVar;
        a aVar;
        int i4;
        int i5;
        b[] bVarArr;
        Locale locale2 = locale;
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        boolean isEmpty = locale.getLanguage().isEmpty();
        int i6 = index + 1;
        if (i6 >= length || index < 0) {
            parsePosition.setErrorIndex(index);
            return null;
        }
        if (f82613q.contains(locale.getLanguage())) {
            b[] values = b.values();
            int length2 = values.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length2) {
                    bVar = null;
                    break;
                }
                bVar = values[i7];
                if (bVar.getDisplayName(locale2).charAt(0) == charSequence.charAt(index)) {
                    break;
                }
                i7++;
            }
            if (bVar != null) {
                a[] values2 = a.values();
                int length3 = values2.length;
                for (int i10 = 0; i10 < length3; i10++) {
                    aVar = values2[i10];
                    if (aVar.getDisplayName(locale2).charAt(0) == charSequence.charAt(i6)) {
                        index += 2;
                        break;
                    }
                }
            }
            aVar = null;
        } else {
            while (true) {
                if (i6 >= length) {
                    i6 = -1;
                    break;
                }
                if (charSequence.charAt(i6) == '-') {
                    break;
                }
                i6++;
            }
            if (i6 == -1) {
                parsePosition.setErrorIndex(index);
                return null;
            }
            b[] values3 = b.values();
            int length4 = values3.length;
            bVar = null;
            int i11 = 0;
            while (i11 < length4) {
                b bVar2 = values3[i11];
                String displayName = bVar2.getDisplayName(locale2);
                int i12 = index;
                while (true) {
                    if (i12 >= i6) {
                        bVarArr = values3;
                        break;
                    }
                    int i13 = i12 - index;
                    char charAt = charSequence.charAt(i12);
                    if (isEmpty) {
                        charAt = o(charAt);
                    }
                    char c5 = charAt;
                    bVarArr = values3;
                    if (i13 < displayName.length() && displayName.charAt(i13) == c5) {
                        if (i13 + 1 == displayName.length()) {
                            bVar = bVar2;
                            break;
                        }
                        i12++;
                        values3 = bVarArr;
                    }
                }
                i11++;
                values3 = bVarArr;
            }
            if (bVar == null) {
                if (z4 && !isEmpty && i6 + 1 < length) {
                    return l(charSequence, parsePosition, Locale.ROOT, true);
                }
                parsePosition.setErrorIndex(index);
                return null;
            }
            a[] values4 = a.values();
            int length5 = values4.length;
            int i14 = 0;
            aVar = null;
            while (i14 < length5) {
                a aVar2 = values4[i14];
                String displayName2 = aVar2.getDisplayName(locale2);
                int i15 = i6 + 1;
                while (true) {
                    if (i15 >= length) {
                        i4 = index;
                        i5 = length;
                        break;
                    }
                    int i16 = i15 - i6;
                    int i17 = i16 - 1;
                    char charAt2 = charSequence.charAt(i15);
                    if (isEmpty) {
                        charAt2 = o(charAt2);
                    }
                    i4 = index;
                    char c6 = charAt2;
                    i5 = length;
                    if (i17 >= displayName2.length() || displayName2.charAt(i17) != c6) {
                        break;
                    }
                    if (i16 == displayName2.length()) {
                        aVar = aVar2;
                        index = i15 + 1;
                        break;
                    }
                    i15++;
                    length = i5;
                    index = i4;
                }
                index = i4;
                i14++;
                locale2 = locale;
                length = i5;
            }
        }
        if (bVar != null && aVar != null) {
            parsePosition.setIndex(index);
            return k(bVar, aVar);
        }
        if (z4 && !isEmpty) {
            return l(charSequence, parsePosition, Locale.ROOT, true);
        }
        parsePosition.setErrorIndex(index);
        return null;
    }

    public static m0 m(String str, Locale locale) throws ParseException {
        m0 l4 = l(str, new ParsePosition(0), locale, true);
        if (l4 != null) {
            return l4;
        }
        throw new ParseException(str, 0);
    }

    private static char o(char c5) {
        if (c5 == 224) {
            return 'a';
        }
        if (c5 == 249) {
            return 'u';
        }
        if (c5 == 275) {
            return 'e';
        }
        if (c5 == 299) {
            return 'i';
        }
        if (c5 == 363) {
            return 'u';
        }
        if (c5 == 462) {
            return 'a';
        }
        if (c5 == 464) {
            return 'i';
        }
        if (c5 == 466) {
            return 'o';
        }
        if (c5 == 232 || c5 == 233) {
            return 'e';
        }
        if (c5 == 236 || c5 == 237) {
            return 'i';
        }
        return c5;
    }

    @Override // java.lang.Comparable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(m0 m0Var) {
        if (getClass().equals(m0Var.getClass())) {
            return this.number - ((m0) m0.class.cast(m0Var)).number;
        }
        throw new ClassCastException(ProtectedSandApp.s("遯\u0001"));
    }

    public boolean equals(Object obj) {
        return getClass().equals(obj.getClass()) && this.number == ((m0) obj).number;
    }

    public a f() {
        return a.values()[(this.number % 12 != 0 ? r0 : 12) - 1];
    }

    public String g(Locale locale) {
        b h4 = h();
        a f4 = f();
        return h4.getDisplayName(locale) + (f82613q.contains(locale.getLanguage()) ? "" : ProtectedSandApp.s("遰\u0001")) + f4.getDisplayName(locale);
    }

    public int getNumber() {
        return this.number;
    }

    public b h() {
        return b.values()[(this.number % 10 != 0 ? r0 : 10) - 1];
    }

    public int hashCode() {
        return this.number;
    }

    public String i(Locale locale) {
        return f().getZodiac(locale);
    }

    public m0 n(int i4) {
        return i4 == 0 ? this : j(net.time4j.base.c.c(net.time4j.base.c.e(this.number - 1, i4), 60) + 1);
    }

    Object readResolve() throws ObjectStreamException {
        return j(this.number);
    }

    public String toString() {
        return g(Locale.ROOT) + ProtectedSandApp.s("遱\u0001") + String.valueOf(this.number) + ProtectedSandApp.s("遲\u0001");
    }
}
