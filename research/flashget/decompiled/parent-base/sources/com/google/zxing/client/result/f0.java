package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: VCardResultParser.java */
/* loaded from: classes6.dex */
public final class f0 extends u {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f62672g = Pattern.compile(ProtectedSandApp.s("ॳ\u0001"), 2);

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f62673h = Pattern.compile(ProtectedSandApp.s("ॴ\u0001"));

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f62674i = Pattern.compile(ProtectedSandApp.s("ॵ\u0001"));

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f62675j = Pattern.compile(ProtectedSandApp.s("ॶ\u0001"));

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f62676k = Pattern.compile(ProtectedSandApp.s("ॷ\u0001"));

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f62677l = Pattern.compile(ProtectedSandApp.s("ॸ\u0001"));

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f62678m = Pattern.compile(ProtectedSandApp.s("ॹ\u0001"));

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f62679n = Pattern.compile(ProtectedSandApp.s("ॺ\u0001"));

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f62680o = Pattern.compile(ProtectedSandApp.s("ॻ\u0001"));

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f62681p = Pattern.compile(ProtectedSandApp.s("ॼ\u0001"));

    private static String[] A(Collection<List<String>> collection) {
        String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str2 = list.get(0);
            if (str2 != null && !str2.isEmpty()) {
                int i4 = 1;
                while (true) {
                    if (i4 >= list.size()) {
                        str = null;
                        break;
                    }
                    str = list.get(i4);
                    int indexOf = str.indexOf(61);
                    if (indexOf < 0) {
                        break;
                    }
                    if (ProtectedSandApp.s("ॽ\u0001").equalsIgnoreCase(str.substring(0, indexOf))) {
                        str = str.substring(indexOf + 1);
                        break;
                    }
                    i4++;
                }
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(u.f62753f);
    }

    private static String q(CharSequence charSequence, String str) {
        char charAt;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        while (i4 < length) {
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 != '\n' && charAt2 != '\r') {
                if (charAt2 != '=') {
                    w(byteArrayOutputStream, str, sb);
                    sb.append(charAt2);
                } else if (i4 < length - 2 && (charAt = charSequence.charAt(i4 + 1)) != '\r' && charAt != '\n') {
                    i4 += 2;
                    char charAt3 = charSequence.charAt(i4);
                    int l4 = u.l(charAt);
                    int l5 = u.l(charAt3);
                    if (l4 >= 0 && l5 >= 0) {
                        byteArrayOutputStream.write((l4 << 4) + l5);
                    }
                }
            }
            i4++;
        }
        w(byteArrayOutputStream, str, sb);
        return sb.toString();
    }

    private static void r(Iterable<List<String>> iterable) {
        int indexOf;
        if (iterable != null) {
            for (List<String> list : iterable) {
                String str = list.get(0);
                String[] strArr = new String[5];
                int i4 = 0;
                int i5 = 0;
                while (i4 < 4 && (indexOf = str.indexOf(59, i5)) >= 0) {
                    strArr[i4] = str.substring(i5, indexOf);
                    i4++;
                    i5 = indexOf + 1;
                }
                strArr[i4] = str.substring(i5);
                StringBuilder sb = new StringBuilder(100);
                v(strArr, 3, sb);
                v(strArr, 1, sb);
                v(strArr, 2, sb);
                v(strArr, 0, sb);
                v(strArr, 4, sb);
                list.set(0, sb.toString().trim());
            }
        }
    }

    private static boolean s(CharSequence charSequence) {
        return charSequence == null || f62673h.matcher(charSequence).matches();
    }

    static List<String> t(CharSequence charSequence, String str, boolean z4, boolean z5) {
        List<List<String>> u4 = u(charSequence, str, z4, z5);
        if (u4 == null || u4.isEmpty()) {
            return null;
        }
        return u4.get(0);
    }

    static List<List<String>> u(CharSequence charSequence, String str, boolean z4, boolean z5) {
        ArrayList arrayList;
        int i4;
        String str2;
        String str3;
        int indexOf;
        int i5;
        String replaceAll;
        int length = str.length();
        int i6 = 0;
        int i7 = 0;
        ArrayList arrayList2 = null;
        while (i7 < length) {
            int i10 = 2;
            Matcher matcher = Pattern.compile(ProtectedSandApp.s("ॾ\u0001") + ((Object) charSequence) + ProtectedSandApp.s("ॿ\u0001"), 2).matcher(str);
            if (i7 > 0) {
                i7--;
            }
            if (!matcher.find(i7)) {
                break;
            }
            int end = matcher.end(i6);
            String group = matcher.group(1);
            if (group != null) {
                String[] split = f62678m.split(group);
                int length2 = split.length;
                int i11 = i6;
                i4 = i11;
                arrayList = null;
                str2 = null;
                str3 = null;
                while (i11 < length2) {
                    String str4 = split[i11];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(str4);
                    String[] split2 = f62677l.split(str4, i10);
                    if (split2.length > 1) {
                        String str5 = split2[0];
                        String str6 = split2[1];
                        if (ProtectedSandApp.s("ঀ\u0001").equalsIgnoreCase(str5) && ProtectedSandApp.s("ঁ\u0001").equalsIgnoreCase(str6)) {
                            i4 = 1;
                        } else if (ProtectedSandApp.s("ং\u0001").equalsIgnoreCase(str5)) {
                            str2 = str6;
                        } else if (ProtectedSandApp.s("ঃ\u0001").equalsIgnoreCase(str5)) {
                            str3 = str6;
                        }
                    }
                    i11++;
                    i10 = 2;
                }
            } else {
                arrayList = null;
                i4 = 0;
                str2 = null;
                str3 = null;
            }
            int i12 = end;
            while (true) {
                indexOf = str.indexOf(10, i12);
                if (indexOf < 0) {
                    break;
                }
                if (indexOf < str.length() - 1) {
                    int i13 = indexOf + 1;
                    if (str.charAt(i13) == ' ' || str.charAt(i13) == '\t') {
                        i12 = indexOf + 2;
                    }
                }
                if (i4 == 0) {
                    break;
                }
                if (indexOf > 0) {
                    if (str.charAt(indexOf - 1) == '=') {
                        i12 = indexOf + 1;
                    }
                }
                if (indexOf < 2) {
                    break;
                }
                if (str.charAt(indexOf - 2) != '=') {
                    break;
                }
                i12 = indexOf + 1;
            }
            if (indexOf < 0) {
                i7 = length;
                i6 = 0;
            } else {
                if (indexOf > end) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                    }
                    if (indexOf > 0 && str.charAt(indexOf - 1) == '\r') {
                        indexOf--;
                    }
                    String substring = str.substring(end, indexOf);
                    if (z4) {
                        substring = substring.trim();
                    }
                    String s4 = ProtectedSandApp.s("\u0984\u0001");
                    if (i4 != 0) {
                        replaceAll = q(substring, str2);
                        if (z5) {
                            replaceAll = f62679n.matcher(replaceAll).replaceAll(s4).trim();
                        }
                    } else {
                        if (z5) {
                            substring = f62679n.matcher(substring).replaceAll(s4).trim();
                        }
                        replaceAll = f62676k.matcher(f62675j.matcher(f62674i.matcher(substring).replaceAll("")).replaceAll(s4)).replaceAll(ProtectedSandApp.s("অ\u0001"));
                    }
                    if (ProtectedSandApp.s("আ\u0001").equals(str3)) {
                        try {
                            replaceAll = URI.create(replaceAll).getSchemeSpecificPart();
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (arrayList == null) {
                        ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(replaceAll);
                        arrayList2.add(arrayList3);
                    } else {
                        i5 = 0;
                        arrayList.add(0, replaceAll);
                        arrayList2.add(arrayList);
                        i6 = i5;
                        i7 = indexOf + 1;
                    }
                }
                i5 = 0;
                i6 = i5;
                i7 = indexOf + 1;
            }
        }
        return arrayList2;
    }

    private static void v(String[] strArr, int i4, StringBuilder sb) {
        String str = strArr[i4];
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb.length() > 0) {
            sb.append(' ');
        }
        sb.append(strArr[i4]);
    }

    private static void w(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, StandardCharsets.UTF_8);
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, StandardCharsets.UTF_8);
                }
            }
            byteArrayOutputStream.reset();
            sb.append(str2);
        }
    }

    private static String y(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private static String[] z(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<List<String>> it = collection.iterator();
        while (it.hasNext()) {
            String str = it.next().get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(u.f62753f);
    }

    @Override // com.google.zxing.client.result.u
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public d k(com.google.zxing.n nVar) {
        String c5 = u.c(nVar);
        Matcher matcher = f62672g.matcher(c5);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List<List<String>> u4 = u(ProtectedSandApp.s("ই\u0001"), c5, true, false);
        if (u4 == null) {
            u4 = u(ProtectedSandApp.s("ঈ\u0001"), c5, true, false);
            r(u4);
        }
        List<String> t4 = t(ProtectedSandApp.s("উ\u0001"), c5, true, false);
        String[] split = t4 == null ? null : f62680o.split(t4.get(0));
        List<List<String>> u5 = u(ProtectedSandApp.s("ঊ\u0001"), c5, true, false);
        List<List<String>> u6 = u(ProtectedSandApp.s("ঋ\u0001"), c5, true, false);
        List<String> t5 = t(ProtectedSandApp.s("ঌ\u0001"), c5, false, false);
        List<List<String>> u7 = u(ProtectedSandApp.s("\u098d\u0001"), c5, true, true);
        List<String> t6 = t(ProtectedSandApp.s("\u098e\u0001"), c5, true, true);
        List<String> t7 = t(ProtectedSandApp.s("এ\u0001"), c5, true, false);
        List<String> list = (t7 == null || s(t7.get(0))) ? t7 : null;
        List<String> t10 = t(ProtectedSandApp.s("ঐ\u0001"), c5, true, false);
        List<List<String>> u10 = u(ProtectedSandApp.s("\u0991\u0001"), c5, true, false);
        List<String> t11 = t(ProtectedSandApp.s("\u0992\u0001"), c5, true, false);
        List<String> t12 = t(ProtectedSandApp.s("ও\u0001"), c5, true, false);
        String[] split2 = t12 == null ? null : f62681p.split(t12.get(0));
        return new d(z(u4), split, null, z(u5), A(u5), z(u6), A(u6), y(t11), y(t5), z(u7), A(u7), y(t6), y(list), y(t10), z(u10), (split2 == null || split2.length == 2) ? split2 : null);
    }
}
