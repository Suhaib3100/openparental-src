package com.nostra13.universalimageloader.utils;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: MemoryCacheUtils.java */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f70524a = ProtectedSandApp.s("\u1aaf\u0001");

    /* renamed from: b, reason: collision with root package name */
    private static final String f70525b = ProtectedSandApp.s("᪰\u0001");

    /* compiled from: MemoryCacheUtils.java */
    static class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            String s4 = ProtectedSandApp.s("\u1aae\u0001");
            return str.substring(0, str.lastIndexOf(s4)).compareTo(str2.substring(0, str2.lastIndexOf(s4)));
        }
    }

    private e() {
    }

    public static Comparator<String> a() {
        return new a();
    }

    public static List<String> b(String str, com.nostra13.universalimageloader.cache.memory.c cVar) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : cVar.keys()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static List<Bitmap> c(String str, com.nostra13.universalimageloader.cache.memory.c cVar) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : cVar.keys()) {
            if (str2.startsWith(str)) {
                arrayList.add(cVar.get(str2));
            }
        }
        return arrayList;
    }

    public static String d(String str, com.nostra13.universalimageloader.core.assist.e eVar) {
        return str + ProtectedSandApp.s("\u1aaf\u0001") + eVar.b() + ProtectedSandApp.s("᪰\u0001") + eVar.a();
    }

    public static void e(String str, com.nostra13.universalimageloader.cache.memory.c cVar) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : cVar.keys()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cVar.remove((String) it.next());
        }
    }
}
