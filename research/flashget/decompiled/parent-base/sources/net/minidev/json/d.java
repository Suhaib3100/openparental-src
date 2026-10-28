package net.minidev.json;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* compiled from: JSONNavi.java */
/* loaded from: classes7.dex */
public class d<T> {

    /* renamed from: j, reason: collision with root package name */
    private static final h f81698j = new h(2);

    /* renamed from: a, reason: collision with root package name */
    private net.minidev.json.parser.a f81699a;

    /* renamed from: b, reason: collision with root package name */
    private T f81700b;

    /* renamed from: c, reason: collision with root package name */
    private Stack<Object> f81701c;

    /* renamed from: d, reason: collision with root package name */
    private Stack<Object> f81702d;

    /* renamed from: e, reason: collision with root package name */
    private Object f81703e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f81704f;

    /* renamed from: g, reason: collision with root package name */
    private String f81705g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f81706h;

    /* renamed from: i, reason: collision with root package name */
    private Object f81707i;

    public d() {
        this(net.minidev.json.parser.a.f81744b);
    }

    public static d<e> A() {
        d<e> dVar = new d<>(net.minidev.json.parser.a.f81743a);
        dVar.D();
        return dVar;
    }

    public static d<Collection<?>> B() {
        return new d<>(net.minidev.json.parser.a.f81744b);
    }

    private Map<String, Object> C(Object obj) {
        return (Map) obj;
    }

    private void O() {
        Object peek = this.f81701c.peek();
        if (peek == null ? false : peek instanceof Map) {
            ((Map) peek).put((String) this.f81707i, this.f81703e);
            return;
        }
        if (peek != null ? peek instanceof List : false) {
            int intValue = ((Number) this.f81707i).intValue();
            List list = (List) peek;
            while (list.size() <= intValue) {
                list.add(null);
            }
            list.set(intValue, this.f81703e);
        }
    }

    private List<Object> a(Object obj) {
        return (List) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d<?> r(String str, Object obj) {
        this.f81704f = true;
        StringBuilder a5 = androidx.appcompat.view.g.a(ProtectedSandApp.s("褭\u0001"), str, ProtectedSandApp.s("褮\u0001"));
        a5.append(t());
        if (obj != null) {
            if (obj instanceof Integer) {
                a5.append('[');
                a5.append(obj);
                a5.append(']');
            } else {
                a5.append('/');
                a5.append(obj);
            }
        }
        this.f81705g = a5.toString();
        return this;
    }

    private boolean w(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof List;
    }

    private boolean x(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof Map;
    }

    public static d<c> y() {
        return new d<>(net.minidev.json.parser.a.f81743a);
    }

    public static d<a> z() {
        d<a> dVar = new d<>(net.minidev.json.parser.a.f81743a);
        dVar.c();
        return dVar;
    }

    public d<T> D() {
        if (this.f81704f) {
            return this;
        }
        if (this.f81703e == null && this.f81706h) {
            r(ProtectedSandApp.s("褯\u0001"), null);
        }
        Object obj = this.f81703e;
        if (obj != null) {
            if (obj == null ? false : obj instanceof Map) {
                return this;
            }
            if (obj != null ? obj instanceof List : false) {
                r(ProtectedSandApp.s("褰\u0001"), null);
            }
            r(ProtectedSandApp.s("褱\u0001"), null);
        } else {
            this.f81703e = this.f81699a.b();
        }
        if (this.f81700b == null) {
            this.f81700b = (T) this.f81703e;
        } else {
            O();
        }
        return this;
    }

    public d<T> E() {
        this.f81703e = this.f81700b;
        this.f81701c.clear();
        this.f81702d.clear();
        this.f81704f = false;
        this.f81707i = null;
        this.f81705g = null;
        return this;
    }

    public d<T> F(Boolean bool) {
        if (this.f81704f) {
            return this;
        }
        this.f81703e = bool;
        O();
        return this;
    }

    public d<T> G(Number number) {
        if (this.f81704f) {
            return this;
        }
        this.f81703e = number;
        O();
        return this;
    }

    public d<T> H(String str) {
        if (this.f81704f) {
            return this;
        }
        this.f81703e = str;
        O();
        return this;
    }

    public d<T> I(String str, double d5) {
        return M(str, Double.valueOf(d5));
    }

    public d<T> J(String str, float f4) {
        return M(str, Float.valueOf(f4));
    }

    public d<T> K(String str, int i4) {
        return M(str, Integer.valueOf(i4));
    }

    public d<T> L(String str, long j4) {
        return M(str, Long.valueOf(j4));
    }

    public d<T> M(String str, Number number) {
        D();
        if (this.f81704f) {
            return this;
        }
        ((Map) this.f81703e).put(str, number);
        return this;
    }

    public d<T> N(String str, String str2) {
        D();
        if (this.f81704f) {
            return this;
        }
        ((Map) this.f81703e).put(str, str2);
        return this;
    }

    public String P(h hVar) {
        return this.f81704f ? k.E(this.f81705g, hVar) : k.E(this.f81700b, hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d<?> Q() {
        if (this.f81701c.size() > 0) {
            this.f81703e = this.f81701c.pop();
            this.f81702d.pop();
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d<?> R(int i4) {
        while (true) {
            int i5 = i4 - 1;
            if (i4 <= 0 || this.f81701c.size() <= 0) {
                break;
            }
            this.f81703e = this.f81701c.pop();
            this.f81702d.pop();
            i4 = i5;
        }
        return this;
    }

    public d<T> b(Object... objArr) {
        c();
        if (this.f81704f) {
            return this;
        }
        List list = (List) this.f81703e;
        for (Object obj : objArr) {
            list.add(obj);
        }
        return this;
    }

    public d<T> c() {
        if (this.f81704f) {
            return this;
        }
        if (this.f81703e == null && this.f81706h) {
            r(ProtectedSandApp.s("褲\u0001"), null);
        }
        Object obj = this.f81703e;
        if (obj != null) {
            if (obj == null ? false : obj instanceof List) {
                return this;
            }
            if (obj != null ? obj instanceof Map : false) {
                r(ProtectedSandApp.s("褰\u0001"), null);
            }
            r(ProtectedSandApp.s("褱\u0001"), null);
        } else {
            this.f81703e = this.f81699a.a();
        }
        if (this.f81700b == null) {
            this.f81700b = (T) this.f81703e;
        } else {
            O();
        }
        return this;
    }

    public boolean d() {
        Object obj = this.f81703e;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    public Boolean e() {
        Object obj = this.f81703e;
        if (obj != null && (obj instanceof Boolean)) {
            return (Boolean) obj;
        }
        return null;
    }

    public double f() {
        Object obj = this.f81703e;
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        return Double.NaN;
    }

    public Double g() {
        Object obj = this.f81703e;
        if (obj == null) {
            return null;
        }
        return obj instanceof Number ? obj instanceof Double ? (Double) obj : Double.valueOf(((Number) obj).doubleValue()) : Double.valueOf(Double.NaN);
    }

    public double h() {
        if (this.f81703e instanceof Number) {
            return ((Number) r0).floatValue();
        }
        return Double.NaN;
    }

    public Float i() {
        Object obj = this.f81703e;
        if (obj == null) {
            return null;
        }
        return obj instanceof Number ? obj instanceof Float ? (Float) obj : Float.valueOf(((Number) obj).floatValue()) : Float.valueOf(Float.NaN);
    }

    public int j() {
        Object obj = this.f81703e;
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return 0;
    }

    public Integer k() {
        Object obj = this.f81703e;
        if (obj != null && (obj instanceof Number)) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            if (obj instanceof Long) {
                Long l4 = (Long) obj;
                if (l4.longValue() == l4.intValue()) {
                    return Integer.valueOf(l4.intValue());
                }
            }
        }
        return null;
    }

    public long l() {
        Object obj = this.f81703e;
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return 0L;
    }

    public Long m() {
        Object obj = this.f81703e;
        if (obj != null && (obj instanceof Number)) {
            if (obj instanceof Long) {
                return (Long) obj;
            }
            if (obj instanceof Integer) {
                return Long.valueOf(((Number) obj).longValue());
            }
        }
        return null;
    }

    public String n() {
        Object obj = this.f81703e;
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : obj.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d<?> o(int i4) {
        if (this.f81704f) {
            return this;
        }
        Object obj = this.f81703e;
        if (!(obj instanceof List)) {
            return r(ProtectedSandApp.s("褳\u0001"), Integer.valueOf(i4));
        }
        List list = (List) obj;
        if (i4 < 0 && (i4 = i4 + list.size()) < 0) {
            i4 = 0;
        }
        if (i4 < list.size()) {
            Object obj2 = list.get(i4);
            this.f81701c.add(this.f81703e);
            this.f81702d.add(Integer.valueOf(i4));
            this.f81703e = obj2;
            return this;
        }
        if (this.f81706h) {
            return r(ProtectedSandApp.s("褴\u0001"), Integer.valueOf(i4));
        }
        this.f81701c.add(this.f81703e);
        this.f81702d.add(Integer.valueOf(i4));
        this.f81703e = null;
        this.f81707i = Integer.valueOf(i4);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d<?> p(String str) {
        if (this.f81704f) {
            return this;
        }
        Object obj = this.f81703e;
        if (!(obj == null ? false : obj instanceof Map)) {
            D();
        }
        Object obj2 = this.f81703e;
        if (!(obj2 instanceof Map)) {
            return r(ProtectedSandApp.s("褵\u0001"), str);
        }
        if (((Map) obj2).containsKey(str)) {
            Object obj3 = ((Map) this.f81703e).get(str);
            this.f81701c.add(this.f81703e);
            this.f81702d.add(str);
            this.f81703e = obj3;
            return this;
        }
        if (this.f81706h) {
            return r(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("褶\u0001"), str), str);
        }
        this.f81701c.add(this.f81703e);
        this.f81702d.add(str);
        this.f81703e = null;
        this.f81707i = str;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d<?> q() {
        if (this.f81704f) {
            return this;
        }
        Object obj = this.f81703e;
        return !(obj instanceof List) ? r(ProtectedSandApp.s("褳\u0001"), null) : o(((List) obj).size());
    }

    public Object s() {
        return this.f81703e;
    }

    public String t() {
        StringBuilder sb = new StringBuilder();
        Iterator<Object> it = this.f81702d.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                sb.append('/');
                sb.append(next.toString());
            } else {
                sb.append('[');
                sb.append(next.toString());
                sb.append(']');
            }
        }
        return sb.toString();
    }

    public String toString() {
        return this.f81704f ? k.E(this.f81705g, f81698j) : k.D(this.f81700b);
    }

    public T u() {
        return this.f81700b;
    }

    public boolean v() {
        return this.f81704f;
    }

    public d(String str) {
        this.f81701c = new Stack<>();
        this.f81702d = new Stack<>();
        this.f81704f = false;
        this.f81706h = false;
        this.f81707i = null;
        T t4 = (T) k.p(str);
        this.f81700b = t4;
        this.f81703e = t4;
        this.f81706h = true;
    }

    public d(net.minidev.json.parser.a aVar) {
        this.f81701c = new Stack<>();
        this.f81702d = new Stack<>();
        this.f81704f = false;
        this.f81707i = null;
        this.f81699a = aVar;
        this.f81706h = false;
    }
}
