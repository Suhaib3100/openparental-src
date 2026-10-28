package org.apache.commons.text;

import androidx.compose.material3.j4;
import androidx.fragment.app.k0;
import androidx.fragment.app.y;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: AlphabetConverter.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f86424d = " -> ";

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, String> f86425a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f86426b;

    /* renamed from: c, reason: collision with root package name */
    private final int f86427c;

    private a(Map<Integer, String> map, Map<String, String> map2, int i4) {
        this.f86425a = map;
        this.f86426b = map2;
        this.f86427c = i4;
    }

    private void a(int i4, String str, Collection<Integer> collection, Iterator<Integer> it, Map<Integer, String> map) {
        if (i4 > 0) {
            for (Integer num : collection) {
                int intValue = num.intValue();
                if (!it.hasNext()) {
                    return;
                }
                if (i4 != this.f86427c || !map.containsKey(num)) {
                    StringBuilder a5 = j4.a(str);
                    a5.append(b(intValue));
                    a(i4 - 1, a5.toString(), collection, it, map);
                }
            }
            return;
        }
        Integer next = it.next();
        while (true) {
            Integer num2 = next;
            if (!map.containsKey(num2)) {
                String b5 = b(num2.intValue());
                this.f86425a.put(num2, str);
                this.f86426b.put(str, b5);
                return;
            } else {
                String b6 = b(num2.intValue());
                this.f86425a.put(num2, b6);
                this.f86426b.put(b6, b6);
                if (!it.hasNext()) {
                    return;
                } else {
                    next = it.next();
                }
            }
        }
    }

    private static String b(int i4) {
        return Character.charCount(i4) == 1 ? String.valueOf((char) i4) : new String(Character.toChars(i4));
    }

    private static Integer[] c(Character[] chArr) {
        if (org.apache.commons.lang3.e.n1(chArr)) {
            return org.apache.commons.lang3.e.f85962n;
        }
        Integer[] numArr = new Integer[chArr.length];
        for (int i4 = 0; i4 < chArr.length; i4++) {
            numArr[i4] = Integer.valueOf(chArr[i4].charValue());
        }
        return numArr;
    }

    public static a d(Integer[] numArr, Integer[] numArr2, Integer[] numArr3) {
        Integer num;
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet(Arrays.asList(numArr));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(Arrays.asList(numArr2));
        LinkedHashSet<Integer> linkedHashSet3 = new LinkedHashSet(Arrays.asList(numArr3));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashMap hashMap = new HashMap();
        for (Integer num2 : linkedHashSet3) {
            int intValue = num2.intValue();
            if (!linkedHashSet.contains(num2)) {
                throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("Can not use 'do not encode' list because original alphabet does not contain '"), b(intValue), "'"));
            }
            if (!linkedHashSet2.contains(num2)) {
                throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("Can not use 'do not encode' list because encoding alphabet does not contain '"), b(intValue), "'"));
            }
            hashMap.put(num2, b(intValue));
        }
        if (linkedHashSet2.size() < linkedHashSet.size()) {
            if (linkedHashSet2.size() - linkedHashSet3.size() < 2) {
                throw new IllegalArgumentException("Must have at least two encoding characters (excluding those in the 'do not encode' list), but has " + (linkedHashSet2.size() - linkedHashSet3.size()));
            }
            int size = (linkedHashSet.size() - linkedHashSet3.size()) / (linkedHashSet2.size() - linkedHashSet3.size());
            int i4 = 1;
            while (size / linkedHashSet2.size() >= 1) {
                size /= linkedHashSet2.size();
                i4++;
            }
            int i5 = i4 + 1;
            a aVar = new a(linkedHashMap, linkedHashMap2, i5);
            aVar.a(i5, "", linkedHashSet2, linkedHashSet.iterator(), hashMap);
            return aVar;
        }
        Iterator it = linkedHashSet2.iterator();
        for (Integer num3 : linkedHashSet) {
            String b5 = b(num3.intValue());
            if (hashMap.containsKey(num3)) {
                linkedHashMap.put(num3, b5);
                linkedHashMap2.put(b5, b5);
            } else {
                Object next = it.next();
                while (true) {
                    num = (Integer) next;
                    if (!linkedHashSet3.contains(num)) {
                        break;
                    }
                    next = it.next();
                }
                String b6 = b(num.intValue());
                linkedHashMap.put(num3, b6);
                linkedHashMap2.put(b6, b5);
            }
        }
        return new a(linkedHashMap, linkedHashMap2, 1);
    }

    public static a e(Character[] chArr, Character[] chArr2, Character[] chArr3) {
        return d(c(chArr), c(chArr2), c(chArr3));
    }

    public static a f(Map<Integer, String> map) {
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i4 = 1;
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            linkedHashMap.put(entry.getValue(), b(((Integer) entry.getKey()).intValue()));
            if (((String) entry.getValue()).length() > i4) {
                i4 = ((String) entry.getValue()).length();
            }
        }
        return new a(unmodifiableMap, linkedHashMap, i4);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f86425a.equals(aVar.f86425a) && this.f86426b.equals(aVar.f86426b) && this.f86427c == aVar.f86427c;
    }

    public String g(String str) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (i4 < str.length()) {
            int codePointAt = str.codePointAt(i4);
            String b5 = b(codePointAt);
            if (b5.equals(this.f86425a.get(Integer.valueOf(codePointAt)))) {
                sb.append(b5);
                i4++;
            } else {
                if (this.f86427c + i4 > str.length()) {
                    throw new UnsupportedEncodingException("Unexpected end of string while decoding ".concat(str));
                }
                String substring = str.substring(i4, this.f86427c + i4);
                String str2 = this.f86426b.get(substring);
                if (str2 == null) {
                    throw new UnsupportedEncodingException(y.a("Unexpected string without decoding (", substring, ") in ", str));
                }
                sb.append(str2);
                i4 += this.f86427c;
            }
        }
        return sb.toString();
    }

    public String h(String str) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (i4 < str.length()) {
            int codePointAt = str.codePointAt(i4);
            String str2 = this.f86425a.get(Integer.valueOf(codePointAt));
            if (str2 == null) {
                throw new UnsupportedEncodingException(k0.a(new StringBuilder("Couldn't find encoding for '"), b(codePointAt), "' in ", str));
            }
            sb.append(str2);
            i4 += Character.charCount(codePointAt);
        }
        return sb.toString();
    }

    public int hashCode() {
        return Objects.hash(this.f86425a, this.f86426b, Integer.valueOf(this.f86427c));
    }

    public int i() {
        return this.f86427c;
    }

    public Map<Integer, String> j() {
        return Collections.unmodifiableMap(this.f86425a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> entry : this.f86425a.entrySet()) {
            sb.append(b(entry.getKey().intValue()));
            sb.append(" -> ");
            sb.append(entry.getValue());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
