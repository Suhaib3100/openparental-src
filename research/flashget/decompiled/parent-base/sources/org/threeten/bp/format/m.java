package org.threeten.bp.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: SimpleDateTimeTextProvider.java */
/* loaded from: classes9.dex */
final class m extends g {

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator<Map.Entry<String, Long>> f88219c = new a();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Map.Entry<org.threeten.bp.temporal.j, Locale>, Object> f88220b = new ConcurrentHashMap(16, 0.75f, 2);

    /* compiled from: SimpleDateTimeTextProvider.java */
    class a implements Comparator<Map.Entry<String, Long>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    /* compiled from: SimpleDateTimeTextProvider.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<n, Map<Long, String>> f88221a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<n, List<Map.Entry<String, Long>>> f88222b;

        b(Map<n, Map<Long, String>> map) {
            this.f88221a = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (n nVar : map.keySet()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Long, String> entry : map.get(nVar).entrySet()) {
                    hashMap2.put(entry.getValue(), m.f(entry.getValue(), entry.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, m.f88219c);
                hashMap.put(nVar, arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put(null, arrayList);
            }
            Collections.sort(arrayList, m.f88219c);
            this.f88222b = hashMap;
        }

        String a(long j4, n nVar) {
            Map<Long, String> map = this.f88221a.get(nVar);
            if (map != null) {
                return map.get(Long.valueOf(j4));
            }
            return null;
        }

        Iterator<Map.Entry<String, Long>> b(n nVar) {
            List<Map.Entry<String, Long>> list = this.f88222b.get(nVar);
            if (list != null) {
                return list.iterator();
            }
            return null;
        }
    }

    m() {
    }

    static Map.Entry f(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    private static <A, B> Map.Entry<A, B> h(A a5, B b5) {
        return new AbstractMap.SimpleImmutableEntry(a5, b5);
    }

    private static b i(Map<n, Map<Long, String>> map) {
        map.put(n.FULL_STANDALONE, map.get(n.FULL));
        map.put(n.SHORT_STANDALONE, map.get(n.SHORT));
        n nVar = n.NARROW;
        if (map.containsKey(nVar)) {
            n nVar2 = n.NARROW_STANDALONE;
            if (!map.containsKey(nVar2)) {
                map.put(nVar2, map.get(nVar));
            }
        }
        return new b(map);
    }

    private Object j(org.threeten.bp.temporal.j jVar, Locale locale) {
        if (jVar == org.threeten.bp.temporal.a.MONTH_OF_YEAR) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap hashMap = new HashMap();
            String[] months = dateFormatSymbols.getMonths();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(1L, months[0]);
            hashMap2.put(2L, months[1]);
            hashMap2.put(3L, months[2]);
            hashMap2.put(4L, months[3]);
            hashMap2.put(5L, months[4]);
            hashMap2.put(6L, months[5]);
            hashMap2.put(7L, months[6]);
            hashMap2.put(8L, months[7]);
            hashMap2.put(9L, months[8]);
            hashMap2.put(10L, months[9]);
            hashMap2.put(11L, months[10]);
            hashMap2.put(12L, months[11]);
            hashMap.put(n.FULL, hashMap2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put(1L, m(1, months[0], locale));
            hashMap3.put(2L, m(2, months[1], locale));
            hashMap3.put(3L, m(3, months[2], locale));
            hashMap3.put(4L, m(4, months[3], locale));
            hashMap3.put(5L, m(5, months[4], locale));
            hashMap3.put(6L, m(6, months[5], locale));
            hashMap3.put(7L, m(7, months[6], locale));
            hashMap3.put(8L, m(8, months[7], locale));
            hashMap3.put(9L, m(9, months[8], locale));
            hashMap3.put(10L, m(10, months[9], locale));
            hashMap3.put(11L, m(11, months[10], locale));
            hashMap3.put(12L, m(12, months[11], locale));
            hashMap.put(n.NARROW, hashMap3);
            String[] shortMonths = dateFormatSymbols.getShortMonths();
            HashMap hashMap4 = new HashMap();
            hashMap4.put(1L, shortMonths[0]);
            hashMap4.put(2L, shortMonths[1]);
            hashMap4.put(3L, shortMonths[2]);
            hashMap4.put(4L, shortMonths[3]);
            hashMap4.put(5L, shortMonths[4]);
            hashMap4.put(6L, shortMonths[5]);
            hashMap4.put(7L, shortMonths[6]);
            hashMap4.put(8L, shortMonths[7]);
            hashMap4.put(9L, shortMonths[8]);
            hashMap4.put(10L, shortMonths[9]);
            hashMap4.put(11L, shortMonths[10]);
            hashMap4.put(12L, shortMonths[11]);
            hashMap.put(n.SHORT, hashMap4);
            return i(hashMap);
        }
        if (jVar == org.threeten.bp.temporal.a.DAY_OF_WEEK) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap5 = new HashMap();
            String[] weekdays = dateFormatSymbols2.getWeekdays();
            HashMap hashMap6 = new HashMap();
            hashMap6.put(1L, weekdays[2]);
            hashMap6.put(2L, weekdays[3]);
            hashMap6.put(3L, weekdays[4]);
            hashMap6.put(4L, weekdays[5]);
            hashMap6.put(5L, weekdays[6]);
            hashMap6.put(6L, weekdays[7]);
            hashMap6.put(7L, weekdays[1]);
            hashMap5.put(n.FULL, hashMap6);
            HashMap hashMap7 = new HashMap();
            hashMap7.put(1L, l(1, weekdays[2], locale));
            hashMap7.put(2L, l(2, weekdays[3], locale));
            hashMap7.put(3L, l(3, weekdays[4], locale));
            hashMap7.put(4L, l(4, weekdays[5], locale));
            hashMap7.put(5L, l(5, weekdays[6], locale));
            hashMap7.put(6L, l(6, weekdays[7], locale));
            hashMap7.put(7L, l(7, weekdays[1], locale));
            hashMap5.put(n.NARROW, hashMap7);
            String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
            HashMap hashMap8 = new HashMap();
            hashMap8.put(1L, shortWeekdays[2]);
            hashMap8.put(2L, shortWeekdays[3]);
            hashMap8.put(3L, shortWeekdays[4]);
            hashMap8.put(4L, shortWeekdays[5]);
            hashMap8.put(5L, shortWeekdays[6]);
            hashMap8.put(6L, shortWeekdays[7]);
            hashMap8.put(7L, shortWeekdays[1]);
            hashMap5.put(n.SHORT, hashMap8);
            return i(hashMap5);
        }
        if (jVar == org.threeten.bp.temporal.a.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap9 = new HashMap();
            String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
            HashMap hashMap10 = new HashMap();
            hashMap10.put(0L, amPmStrings[0]);
            hashMap10.put(1L, amPmStrings[1]);
            hashMap9.put(n.FULL, hashMap10);
            hashMap9.put(n.SHORT, hashMap10);
            return i(hashMap9);
        }
        if (jVar != org.threeten.bp.temporal.a.ERA) {
            if (jVar != org.threeten.bp.temporal.c.f88348b) {
                return "";
            }
            HashMap hashMap11 = new HashMap();
            HashMap hashMap12 = new HashMap();
            hashMap12.put(1L, "Q1");
            hashMap12.put(2L, "Q2");
            hashMap12.put(3L, "Q3");
            hashMap12.put(4L, "Q4");
            hashMap11.put(n.SHORT, hashMap12);
            HashMap hashMap13 = new HashMap();
            hashMap13.put(1L, "1st quarter");
            hashMap13.put(2L, "2nd quarter");
            hashMap13.put(3L, "3rd quarter");
            hashMap13.put(4L, "4th quarter");
            hashMap11.put(n.FULL, hashMap13);
            return i(hashMap11);
        }
        DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
        HashMap hashMap14 = new HashMap();
        String[] eras = dateFormatSymbols4.getEras();
        HashMap hashMap15 = new HashMap();
        hashMap15.put(0L, eras[0]);
        hashMap15.put(1L, eras[1]);
        hashMap14.put(n.SHORT, hashMap15);
        if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
            HashMap hashMap16 = new HashMap();
            hashMap16.put(0L, "Before Christ");
            hashMap16.put(1L, "Anno Domini");
            hashMap14.put(n.FULL, hashMap16);
        } else {
            hashMap14.put(n.FULL, hashMap15);
        }
        HashMap hashMap17 = new HashMap();
        hashMap17.put(0L, eras[0].substring(0, 1));
        hashMap17.put(1L, eras[1].substring(0, 1));
        hashMap14.put(n.NARROW, hashMap17);
        return i(hashMap14);
    }

    private Object k(org.threeten.bp.temporal.j jVar, Locale locale) {
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(jVar, locale);
        Object obj = this.f88220b.get(simpleImmutableEntry);
        if (obj != null) {
            return obj;
        }
        this.f88220b.putIfAbsent(simpleImmutableEntry, j(jVar, locale));
        return this.f88220b.get(simpleImmutableEntry);
    }

    private String l(int i4, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i4) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i4) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    private String m(int i4, String str, Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i4) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i4) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        return (locale.getLanguage().equals("ja") && locale.getCountry().equals("JP")) ? Integer.toString(i4) : str.substring(0, 1);
    }

    @Override // org.threeten.bp.format.g
    public String c(org.threeten.bp.temporal.j jVar, long j4, n nVar, Locale locale) {
        Object k4 = k(jVar, locale);
        if (k4 instanceof b) {
            return ((b) k4).a(j4, nVar);
        }
        return null;
    }

    @Override // org.threeten.bp.format.g
    public Iterator<Map.Entry<String, Long>> d(org.threeten.bp.temporal.j jVar, n nVar, Locale locale) {
        Object k4 = k(jVar, locale);
        if (k4 instanceof b) {
            return ((b) k4).b(nVar);
        }
        return null;
    }
}
