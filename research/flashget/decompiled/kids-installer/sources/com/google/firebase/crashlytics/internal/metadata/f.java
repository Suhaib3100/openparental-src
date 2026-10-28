package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes2.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.f f15814a;

    /* renamed from: c, reason: collision with root package name */
    private static final String f15813c = ProtectedSandApp.s("ᓔ");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f15812b = Charset.forName(ProtectedSandApp.s("ᓕ"));

    /* compiled from: MetaDataStore.java */
    class a extends JSONObject {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15815a;

        a(String str) throws JSONException {
            this.f15815a = str;
            put(ProtectedSandApp.s("ᓓ"), str);
        }
    }

    public f(com.google.firebase.crashlytics.internal.persistence.f fVar) {
        this.f15814a = fVar;
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
        JSONArray jSONArray = new JSONObject(str).getJSONArray(ProtectedSandApp.s("ᓖ"));
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            String string = jSONArray.getString(i5);
            try {
                arrayList.add(i.a(string));
            } catch (Exception e6) {
                com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ᓗ") + string, e6);
            }
        }
        return arrayList;
    }

    @q0
    private String g(String str) throws JSONException {
        return p(new JSONObject(str), ProtectedSandApp.s("ᓘ"));
    }

    private static String h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static String m(List<i> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i5 = 0; i5 < list.size(); i5++) {
            try {
                jSONArray.put(new JSONObject(i.f15845b.a(list.get(i5))));
            } catch (JSONException e6) {
                com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ᓙ"), e6);
            }
        }
        hashMap.put(ProtectedSandApp.s("ᓚ"), jSONArray);
        return new JSONObject(hashMap).toString();
    }

    private static void n(File file) {
        if (file.exists() && file.delete()) {
            com.google.firebase.crashlytics.internal.g.f().g(ProtectedSandApp.s("ᓛ") + file.getAbsolutePath());
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
        return this.f15814a.p(str, ProtectedSandApp.s("ᓜ"));
    }

    @o0
    public File b(String str) {
        return this.f15814a.p(str, ProtectedSandApp.s("ᓝ"));
    }

    @o0
    public File c(String str) {
        return this.f15814a.p(str, ProtectedSandApp.s("ᓞ"));
    }

    @o0
    public File d(String str) {
        return this.f15814a.p(str, ProtectedSandApp.s("ᓟ"));
    }

    public Map<String, String> i(String str) {
        return j(str, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    Map<String, String> j(String str, boolean z5) {
        FileInputStream fileInputStream;
        Exception e6;
        String s5 = ProtectedSandApp.s("ᓠ");
        File a6 = z5 ? a(str) : b(str);
        if (a6.exists()) {
            ?? length = a6.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(a6);
                        try {
                            Map<String, String> e7 = e(com.google.firebase.crashlytics.internal.common.i.D(fileInputStream));
                            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s5);
                            return e7;
                        } catch (Exception e8) {
                            e6 = e8;
                            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ᓡ"), e6);
                            n(a6);
                            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s5);
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        closeable = length;
                        com.google.firebase.crashlytics.internal.common.i.f(closeable, s5);
                        throw th;
                    }
                } catch (Exception e9) {
                    fileInputStream = null;
                    e6 = e9;
                } catch (Throwable th2) {
                    th = th2;
                    com.google.firebase.crashlytics.internal.common.i.f(closeable, s5);
                    throw th;
                }
            }
        }
        n(a6);
        return Collections.emptyMap();
    }

    public List<i> k(String str) {
        FileInputStream fileInputStream;
        String s5 = ProtectedSandApp.s("ᓢ");
        String s6 = ProtectedSandApp.s("ᓣ");
        File c6 = c(str);
        if (!c6.exists() || c6.length() == 0) {
            n(c6);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(c6);
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            List<i> f6 = f(com.google.firebase.crashlytics.internal.common.i.D(fileInputStream));
            com.google.firebase.crashlytics.internal.g.f().b(s6 + f6 + ProtectedSandApp.s("ᓤ") + str);
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s5);
            return f6;
        } catch (Exception e7) {
            e = e7;
            fileInputStream2 = fileInputStream;
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ᓥ"), e);
            n(c6);
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, s5);
            return Collections.emptyList();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, s5);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    @q0
    public String l(String str) {
        FileInputStream fileInputStream;
        String s5 = ProtectedSandApp.s("ᓦ");
        String s6 = ProtectedSandApp.s("ᓧ");
        File d6 = d(str);
        Closeable closeable = null;
        if (d6.exists()) {
            ?? r32 = (d6.length() > 0L ? 1 : (d6.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(d6);
                        try {
                            String g5 = g(com.google.firebase.crashlytics.internal.common.i.D(fileInputStream));
                            com.google.firebase.crashlytics.internal.g.f().b(s6 + g5 + ProtectedSandApp.s("ᓨ") + str);
                            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s5);
                            return g5;
                        } catch (Exception e6) {
                            e = e6;
                            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ᓩ"), e);
                            n(d6);
                            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s5);
                            return null;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        com.google.firebase.crashlytics.internal.common.i.f(closeable, s5);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
            }
        }
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᓪ") + str);
        n(d6);
        return null;
    }

    public void q(String str, Map<String, String> map) {
        r(str, map, false);
    }

    public void r(String str, Map<String, String> map, boolean z5) {
        String h5;
        BufferedWriter bufferedWriter;
        String s5 = ProtectedSandApp.s("ᓫ");
        File a6 = z5 ? a(str) : b(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                h5 = h(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a6), f15812b));
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(h5);
            bufferedWriter.flush();
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, s5);
        } catch (Exception e7) {
            e = e7;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ᓬ"), e);
            n(a6);
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, s5);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, s5);
            throw th;
        }
    }

    public void s(String str, List<i> list) {
        String m5;
        BufferedWriter bufferedWriter;
        String s5 = ProtectedSandApp.s("ᓭ");
        File c6 = c(str);
        if (list.isEmpty()) {
            n(c6);
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                m5 = m(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c6), f15812b));
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(m5);
            bufferedWriter.flush();
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, s5);
        } catch (Exception e7) {
            e = e7;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ᓮ"), e);
            n(c6);
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, s5);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, s5);
            throw th;
        }
    }

    public void t(String str, String str2) {
        String o5;
        BufferedWriter bufferedWriter;
        String s5 = ProtectedSandApp.s("ᓯ");
        File d6 = d(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                o5 = o(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(d6), f15812b));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e6) {
            e = e6;
        }
        try {
            bufferedWriter.write(o5);
            bufferedWriter.flush();
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, s5);
        } catch (Exception e7) {
            e = e7;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ᓰ"), e);
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, s5);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, s5);
            throw th;
        }
    }
}
