package org.mortbay.http;

import androidx.compose.material3.j4;
import androidx.compose.material3.z3;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.mortbay.util.b;
import org.mortbay.util.c;

/* compiled from: PathMap.java */
/* loaded from: classes9.dex */
public class a extends HashMap implements Externalizable {

    /* renamed from: j, reason: collision with root package name */
    private static String f87570j = System.getProperty("org.mortbay.http.PathMap.separators", ":,");

    /* renamed from: b, reason: collision with root package name */
    c f87571b;

    /* renamed from: c, reason: collision with root package name */
    c f87572c;

    /* renamed from: d, reason: collision with root package name */
    c f87573d;

    /* renamed from: e, reason: collision with root package name */
    List f87574e;

    /* renamed from: f, reason: collision with root package name */
    Map.Entry f87575f;

    /* renamed from: g, reason: collision with root package name */
    Map.Entry f87576g;

    /* renamed from: h, reason: collision with root package name */
    Set f87577h;

    /* renamed from: i, reason: collision with root package name */
    boolean f87578i;

    /* compiled from: PathMap.java */
    /* renamed from: org.mortbay.http.a$a, reason: collision with other inner class name */
    private static class C1362a implements Map.Entry {

        /* renamed from: b, reason: collision with root package name */
        private Object f87579b;

        /* renamed from: c, reason: collision with root package name */
        private Object f87580c;

        /* renamed from: d, reason: collision with root package name */
        private transient String f87581d;

        C1362a(Object obj, Object obj2) {
            this.f87579b = obj;
            this.f87580c = obj2;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f87579b;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f87580c;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            if (this.f87581d == null) {
                this.f87581d = this.f87579b + "=" + this.f87580c;
            }
            return this.f87581d;
        }
    }

    public a() {
        super(11);
        this.f87571b = new c();
        this.f87572c = new c();
        this.f87573d = new c();
        this.f87574e = null;
        this.f87575f = null;
        this.f87576g = null;
        this.f87578i = false;
        this.f87577h = entrySet();
    }

    public static boolean e(String str, String str2) throws IllegalArgumentException {
        char charAt = str.charAt(0);
        if (charAt == '/') {
            if (str.length() == 1 || str.equals(str2) || (str.endsWith("/*") && str.regionMatches(0, str2, 0, str.length() - 2))) {
                return true;
            }
            if (str2.startsWith(str) && str2.charAt(str.length()) == ';') {
                return true;
            }
        } else if (charAt == '*') {
            return str2.regionMatches((str2.length() - str.length()) + 1, str, 1, str.length() - 1);
        }
        return false;
    }

    public static boolean f(String str, String str2, boolean z4) throws IllegalArgumentException {
        char charAt = str.charAt(0);
        if (charAt == '/') {
            if ((!z4 && str.length() == 1) || str.equals(str2)) {
                return true;
            }
            if (str.endsWith("/*") && str.regionMatches(0, str2, 0, str.length() - 2)) {
                return true;
            }
            if (str2.startsWith(str) && str2.charAt(str.length()) == ';') {
                return true;
            }
        } else if (charAt == '*') {
            return str2.regionMatches((str2.length() - str.length()) + 1, str, 1, str.length() - 1);
        }
        return false;
    }

    public static String i(String str, String str2) {
        if (str.charAt(0) != '/' || str.length() == 1 || str.equals(str2) || !str.endsWith("/*") || !str.regionMatches(0, str2, 0, str.length() - 2) || str2.length() == str.length() - 2) {
            return null;
        }
        return str2.substring(str.length() - 2);
    }

    public static String k(String str, String str2) {
        char charAt = str.charAt(0);
        if (charAt != '/') {
            if (charAt == '*' && str2.regionMatches(str2.length() - (str.length() - 1), str, 1, str.length() - 1)) {
                return str2;
            }
            return null;
        }
        if (str.length() == 1) {
            return str2;
        }
        if (str.equals(str2)) {
            return str2;
        }
        if (str.endsWith("/*") && str.regionMatches(0, str2, 0, str.length() - 2)) {
            return str2.substring(0, str.length() - 2);
        }
        if (str2.startsWith(str) && str2.charAt(str.length()) == ';') {
            return str2;
        }
        return null;
    }

    public static String l(String str, String str2, String str3) {
        String i4 = i(str2, str3);
        if (i4 != null) {
            str3 = i4;
        }
        if (str3.startsWith("./")) {
            str3 = str3.substring(2);
        }
        if (!str.endsWith("/")) {
            return str3.startsWith("/") ? str.concat(str3) : z3.a(str, "/", str3);
        }
        if (!str3.startsWith("/")) {
            return str.concat(str3);
        }
        StringBuilder a5 = j4.a(str);
        a5.append(str3.substring(1));
        return a5.toString();
    }

    public static void m(String str) {
        f87570j = str;
    }

    public Map.Entry b(String str) {
        Map.Entry c5;
        Map.Entry c6;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(59);
        if (indexOf < 0 && (indexOf = str.indexOf(63)) < 0) {
            indexOf = str.length();
        }
        int i4 = 0;
        Map.Entry c7 = this.f87573d.c(str, 0, indexOf);
        if (c7 != null) {
            return (Map.Entry) c7.getValue();
        }
        int i5 = indexOf;
        do {
            i5 = str.lastIndexOf(47, i5 - 1);
            if (i5 < 0) {
                Map.Entry entry = this.f87575f;
                if (entry != null) {
                    return entry;
                }
                do {
                    i4 = str.indexOf(46, i4 + 1);
                    if (i4 <= 0) {
                        return this.f87576g;
                    }
                    c5 = this.f87572c.c(str, i4 + 1, (indexOf - i4) - 1);
                } while (c5 == null);
                return (Map.Entry) c5.getValue();
            }
            c6 = this.f87571b.c(str, 0, i5);
        } while (c6 == null);
        return (Map.Entry) c6.getValue();
    }

    public List c(String str) {
        if (str == null) {
            return org.mortbay.util.a.i(null);
        }
        int indexOf = str.indexOf(59);
        if (indexOf < 0 && (indexOf = str.indexOf(63)) < 0) {
            indexOf = str.length();
        }
        int i4 = 0;
        Map.Entry c5 = this.f87573d.c(str, 0, indexOf);
        Object b5 = c5 != null ? org.mortbay.util.a.b(null, c5.getValue()) : null;
        int i5 = indexOf - 1;
        while (true) {
            i5 = str.lastIndexOf(47, i5 - 1);
            if (i5 < 0) {
                break;
            }
            Map.Entry c6 = this.f87571b.c(str, 0, i5);
            if (c6 != null) {
                b5 = org.mortbay.util.a.b(b5, c6.getValue());
            }
        }
        Map.Entry entry = this.f87575f;
        if (entry != null) {
            b5 = org.mortbay.util.a.b(b5, entry);
        }
        while (true) {
            i4 = str.indexOf(46, i4 + 1);
            if (i4 <= 0) {
                break;
            }
            Map.Entry c7 = this.f87572c.c(str, i4 + 1, (indexOf - i4) - 1);
            if (c7 != null) {
                b5 = org.mortbay.util.a.b(b5, c7.getValue());
            }
        }
        Map.Entry entry2 = this.f87576g;
        if (entry2 != null) {
            if (b5 == null) {
                return this.f87574e;
            }
            b5 = org.mortbay.util.a.b(b5, entry2);
        }
        return org.mortbay.util.a.i(b5);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f87573d = new c();
        this.f87571b = new c();
        this.f87572c = new c();
        this.f87576g = null;
        this.f87574e = null;
        super.clear();
    }

    public Object d(String str) {
        Map.Entry b5 = b(str);
        if (b5 != null) {
            return b5.getValue();
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized Object put(Object obj, Object obj2) {
        Object obj3;
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(obj.toString(), f87570j);
            obj3 = null;
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (!nextToken.startsWith("/") && !nextToken.startsWith("*.")) {
                    System.out.println("PathSpec " + nextToken + ". must start with '/' or '*.'");
                    StringBuilder sb = new StringBuilder();
                    sb.append("/");
                    sb.append(nextToken);
                    nextToken = sb.toString();
                }
                Object put = super.put(nextToken, obj2);
                C1362a c1362a = new C1362a(nextToken, obj2);
                if (c1362a.getKey().equals(nextToken)) {
                    if (nextToken.equals("/*")) {
                        this.f87575f = c1362a;
                    } else if (nextToken.endsWith("/*")) {
                        this.f87571b.i(nextToken.substring(0, nextToken.length() - 2), c1362a);
                        this.f87573d.i(nextToken.substring(0, nextToken.length() - 1), c1362a);
                        this.f87573d.i(nextToken.substring(0, nextToken.length() - 2), c1362a);
                    } else if (nextToken.startsWith("*.")) {
                        this.f87572c.i(nextToken.substring(2), c1362a);
                    } else if (!nextToken.equals("/")) {
                        this.f87573d.i(nextToken, c1362a);
                    } else if (this.f87578i) {
                        this.f87573d.i(nextToken, c1362a);
                    } else {
                        this.f87576g = c1362a;
                        this.f87574e = b.c(c1362a);
                    }
                }
                obj3 = put;
            }
        } catch (Throwable th) {
            throw th;
        }
        return obj3;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        putAll((HashMap) objectInput.readObject());
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized Object remove(Object obj) {
        if (obj != null) {
            try {
                String str = (String) obj;
                if (str.equals("/*")) {
                    this.f87575f = null;
                } else if (str.endsWith("/*")) {
                    this.f87571b.j(str.substring(0, str.length() - 2));
                    this.f87573d.j(str.substring(0, str.length() - 1));
                    this.f87573d.j(str.substring(0, str.length() - 2));
                } else if (str.startsWith("*.")) {
                    this.f87572c.j(str.substring(2));
                } else if (str.equals("/")) {
                    this.f87576g = null;
                    this.f87574e = null;
                } else {
                    this.f87573d.j(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return super.remove(obj);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(new HashMap(this));
    }

    public a(boolean z4) {
        super(11);
        this.f87571b = new c();
        this.f87572c = new c();
        this.f87573d = new c();
        this.f87574e = null;
        this.f87575f = null;
        this.f87576g = null;
        this.f87578i = false;
        this.f87577h = entrySet();
        this.f87578i = z4;
    }

    public a(int i4) {
        super(i4);
        this.f87571b = new c();
        this.f87572c = new c();
        this.f87573d = new c();
        this.f87574e = null;
        this.f87575f = null;
        this.f87576g = null;
        this.f87578i = false;
        this.f87577h = entrySet();
    }

    public a(Map map) {
        this.f87571b = new c();
        this.f87572c = new c();
        this.f87573d = new c();
        this.f87574e = null;
        this.f87575f = null;
        this.f87576g = null;
        this.f87578i = false;
        putAll(map);
        this.f87577h = entrySet();
    }
}
