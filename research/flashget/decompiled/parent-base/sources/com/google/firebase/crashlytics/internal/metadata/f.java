package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MetaDataStore.java */
/* loaded from: classes6.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f58916a;

    /* renamed from: c, reason: collision with root package name */
    private static final String f58915c = ProtectedSandApp.s("ﴉ");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f58914b = Charset.forName(ProtectedSandApp.s("ﴊ"));

    /* compiled from: MetaDataStore.java */
    class a extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f58917a;

        a(String str) throws JSONException {
            this.f58917a = str;
            put(ProtectedSandApp.s("ﴈ"), str);
        }
    }

    public f(com.google.firebase.crashlytics.internal.persistence.g gVar) {
        this.f58916a = gVar;
    }

    private static Map<String, String> e(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, p(jSONObject, next));
        }
        return hashMap;
    }

    private static List<i> f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray(ProtectedSandApp.s("ﴋ"));
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            try {
                arrayList.add(i.a(string));
            } catch (Exception e4) {
                com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ﴌ") + string, e4);
            }
        }
        return arrayList;
    }

    @q0
    private String g(String str) throws JSONException {
        return p(new JSONObject(str), ProtectedSandApp.s("ﴉ"));
    }

    private static String h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String m(List<i> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i4 = 0; i4 < list.size(); i4++) {
            try {
                jSONArray.put(new JSONObject(i.f58947b.a(list.get(i4))));
            } catch (JSONException e4) {
                com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ﴍ"), e4);
            }
        }
        hashMap.put(ProtectedSandApp.s("ﴋ"), jSONArray);
        return new JSONObject(hashMap).toString();
    }

    private static void n(File file) {
        if (file.exists() && file.delete()) {
            com.google.firebase.crashlytics.internal.g.f().g(ProtectedSandApp.s("ﴎ") + file.getAbsolutePath());
        }
    }

    private static String o(String str) throws JSONException {
        return new a(str).toString();
    }

    private static String p(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    @o0
    public File a(String str) {
        return this.f58916a.r(str, ProtectedSandApp.s("ﴏ"));
    }

    @o0
    public File b(String str) {
        return this.f58916a.r(str, ProtectedSandApp.s("ﴐ"));
    }

    @o0
    public File c(String str) {
        return this.f58916a.r(str, ProtectedSandApp.s("ﴑ"));
    }

    @o0
    public File d(String str) {
        return this.f58916a.r(str, ProtectedSandApp.s("ﴒ"));
    }

    public Map<String, String> i(String str) {
        return j(str, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    Map<String, String> j(String str, boolean z4) {
        FileInputStream fileInputStream;
        Exception e4;
        String s4 = ProtectedSandApp.s("ﴓ");
        File a5 = z4 ? a(str) : b(str);
        if (a5.exists()) {
            ?? length = a5.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(a5);
                        try {
                            Map<String, String> e5 = e(com.google.firebase.crashlytics.internal.common.i.D(fileInputStream));
                            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s4);
                            return e5;
                        } catch (Exception e6) {
                            e4 = e6;
                            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ﴔ"), e4);
                            n(a5);
                            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s4);
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        closeable = length;
                        com.google.firebase.crashlytics.internal.common.i.f(closeable, s4);
                        throw th;
                    }
                } catch (Exception e7) {
                    fileInputStream = null;
                    e4 = e7;
                } catch (Throwable th2) {
                    th = th2;
                    com.google.firebase.crashlytics.internal.common.i.f(closeable, s4);
                    throw th;
                }
            }
        }
        n(a5);
        return Collections.emptyMap();
    }

    public List<i> k(String str) {
        FileInputStream fileInputStream;
        String s4 = ProtectedSandApp.s("ﴕ");
        String s5 = ProtectedSandApp.s("ﴖ");
        File c5 = c(str);
        if (!c5.exists() || c5.length() == 0) {
            n(c5);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(c5);
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            List<i> f4 = f(com.google.firebase.crashlytics.internal.common.i.D(fileInputStream));
            com.google.firebase.crashlytics.internal.g.f().b(s5 + f4 + ProtectedSandApp.s("ﴗ") + str);
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s4);
            return f4;
        } catch (Exception e5) {
            e = e5;
            fileInputStream2 = fileInputStream;
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ﴘ"), e);
            n(c5);
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, s4);
            return Collections.emptyList();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, s4);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    @q0
    public String l(String str) {
        FileInputStream fileInputStream;
        String s4 = ProtectedSandApp.s("ﴓ");
        String s5 = ProtectedSandApp.s("ﴙ");
        File d5 = d(str);
        Closeable closeable = null;
        if (d5.exists()) {
            ?? r32 = (d5.length() > 0L ? 1 : (d5.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(d5);
                        try {
                            String g4 = g(com.google.firebase.crashlytics.internal.common.i.D(fileInputStream));
                            com.google.firebase.crashlytics.internal.g.f().b(s5 + g4 + ProtectedSandApp.s("ﴚ") + str);
                            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s4);
                            return g4;
                        } catch (Exception e4) {
                            e = e4;
                            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ﴔ"), e);
                            n(d5);
                            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s4);
                            return null;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        com.google.firebase.crashlytics.internal.common.i.f(closeable, s4);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
            }
        }
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﴛ") + str);
        n(d5);
        return null;
    }

    public void q(String str, Map<String, String> map) {
        r(str, map, false);
    }

    public void r(String str, Map<String, String> map, boolean z4) {
        String h4;
        BufferedWriter bufferedWriter;
        String s4 = ProtectedSandApp.s("ﴜ");
        File a5 = z4 ? a(str) : b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                h4 = h(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a5), f58914b));
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(h4);
            bufferedWriter.flush();
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, s4);
        } catch (Exception e5) {
            e = e5;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ﴝ"), e);
            n(a5);
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, s4);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, s4);
            throw th;
        }
    }

    public void s(String str, List<i> list) {
        String m4;
        BufferedWriter bufferedWriter;
        String s4 = ProtectedSandApp.s("ﴕ");
        File c5 = c(str);
        if (list.isEmpty()) {
            n(c5);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                m4 = m(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c5), f58914b));
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(m4);
            bufferedWriter.flush();
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, s4);
        } catch (Exception e5) {
            e = e5;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ﴞ"), e);
            n(c5);
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, s4);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, s4);
            throw th;
        }
    }

    public void t(String str, String str2) {
        String o4;
        BufferedWriter bufferedWriter;
        String s4 = ProtectedSandApp.s("ﴓ");
        File d5 = d(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                o4 = o(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d5), f58914b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e4) {
            e = e4;
        }
        try {
            bufferedWriter.write(o4);
            bufferedWriter.flush();
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, s4);
        } catch (Exception e5) {
            e = e5;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ﴟ"), e);
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, s4);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, s4);
            throw th;
        }
    }
}
