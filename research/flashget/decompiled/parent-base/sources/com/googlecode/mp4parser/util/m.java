package com.googlecode.mp4parser.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Path.java */
/* loaded from: classes6.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    static Pattern f64112a = Pattern.compile(ProtectedSandApp.s("ᑚ\u0001"));

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f64113b = false;

    private m() {
    }

    public static String a(com.coremedia.iso.boxes.b bVar) {
        return b(bVar, "");
    }

    private static String b(com.coremedia.iso.boxes.b bVar, String str) {
        com.coremedia.iso.boxes.c parent = bVar.getParent();
        int i4 = 0;
        for (com.coremedia.iso.boxes.b bVar2 : parent.getBoxes()) {
            if (bVar2.getType().equals(bVar.getType())) {
                if (bVar2 == bVar) {
                    break;
                }
                i4++;
            }
        }
        String str2 = String.format(ProtectedSandApp.s("ᑛ\u0001"), bVar.getType(), Integer.valueOf(i4)) + str;
        return parent instanceof com.coremedia.iso.boxes.b ? b((com.coremedia.iso.boxes.b) parent, str2) : str2;
    }

    public static <T extends com.coremedia.iso.boxes.b> T c(com.coremedia.iso.boxes.b bVar, String str) {
        List k4 = k(bVar, str, true);
        if (k4.isEmpty()) {
            return null;
        }
        return (T) k4.get(0);
    }

    public static <T extends com.coremedia.iso.boxes.b> T d(com.coremedia.iso.boxes.c cVar, String str) {
        List k4 = k(cVar, str, true);
        if (k4.isEmpty()) {
            return null;
        }
        return (T) k4.get(0);
    }

    public static <T extends com.coremedia.iso.boxes.b> T e(AbstractContainerBox abstractContainerBox, String str) {
        List k4 = k(abstractContainerBox, str, true);
        if (k4.isEmpty()) {
            return null;
        }
        return (T) k4.get(0);
    }

    public static <T extends com.coremedia.iso.boxes.b> List<T> f(com.coremedia.iso.boxes.b bVar, String str) {
        return k(bVar, str, false);
    }

    private static <T extends com.coremedia.iso.boxes.b> List<T> g(com.coremedia.iso.boxes.b bVar, String str, boolean z4) {
        return k(bVar, str, z4);
    }

    public static <T extends com.coremedia.iso.boxes.b> List<T> h(com.coremedia.iso.boxes.c cVar, String str) {
        return k(cVar, str, false);
    }

    private static <T extends com.coremedia.iso.boxes.b> List<T> i(com.coremedia.iso.boxes.c cVar, String str, boolean z4) {
        return k(cVar, str, z4);
    }

    private static <T extends com.coremedia.iso.boxes.b> List<T> j(AbstractContainerBox abstractContainerBox, String str, boolean z4) {
        return k(abstractContainerBox, str, z4);
    }

    private static <T extends com.coremedia.iso.boxes.b> List<T> k(Object obj, String str, boolean z4) {
        String str2;
        String s4 = ProtectedSandApp.s("ᑜ\u0001");
        if (str.startsWith(s4)) {
            String substring = str.substring(1);
            while (obj instanceof com.coremedia.iso.boxes.b) {
                obj = ((com.coremedia.iso.boxes.b) obj).getParent();
            }
            str = substring;
        }
        if (str.length() == 0) {
            if (obj instanceof com.coremedia.iso.boxes.b) {
                return Collections.singletonList((com.coremedia.iso.boxes.b) obj);
            }
            throw new RuntimeException(ProtectedSandApp.s("ᑝ\u0001"));
        }
        int i4 = 0;
        if (str.contains(s4)) {
            str2 = str.substring(str.indexOf(47) + 1);
            str = str.substring(0, str.indexOf(47));
        } else {
            str2 = "";
        }
        Matcher matcher = f64112a.matcher(str);
        if (!matcher.matches()) {
            throw new RuntimeException(String.valueOf(str).concat(ProtectedSandApp.s("ᑟ\u0001")));
        }
        String group = matcher.group(1);
        if (ProtectedSandApp.s("ᑞ\u0001").equals(group)) {
            return obj instanceof com.coremedia.iso.boxes.b ? i(((com.coremedia.iso.boxes.b) obj).getParent(), str2, z4) : Collections.emptyList();
        }
        if (!(obj instanceof com.coremedia.iso.boxes.c)) {
            return Collections.emptyList();
        }
        int parseInt = matcher.group(2) != null ? Integer.parseInt(matcher.group(3)) : -1;
        LinkedList linkedList = new LinkedList();
        for (com.coremedia.iso.boxes.b bVar : ((com.coremedia.iso.boxes.c) obj).getBoxes()) {
            if (bVar.getType().matches(group)) {
                if (parseInt == -1 || parseInt == i4) {
                    linkedList.addAll(k(bVar, str2, z4));
                }
                i4++;
            }
            if (z4 || parseInt >= 0) {
                if (!linkedList.isEmpty()) {
                    return linkedList;
                }
            }
        }
        return linkedList;
    }

    public static boolean l(com.coremedia.iso.boxes.b bVar, String str) {
        return k(bVar, str, false).contains(bVar);
    }
}
