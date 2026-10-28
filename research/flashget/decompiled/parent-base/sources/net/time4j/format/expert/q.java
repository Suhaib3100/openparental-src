package net.time4j.format.expert;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: LookupProcessor.java */
/* loaded from: classes7.dex */
final class q<V> implements i<V> {

    /* renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.q<V> f83027b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<V, String> f83028c;

    /* renamed from: d, reason: collision with root package name */
    private final int f83029d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f83030e;

    /* renamed from: f, reason: collision with root package name */
    private final Locale f83031f;

    q(net.time4j.engine.q<V> qVar, Map<V, String> map) {
        Map hashMap;
        Class<V> type = qVar.getType();
        if (!type.isEnum()) {
            hashMap = new HashMap(map.size());
        } else {
            if (map.size() < type.getEnumConstants().length) {
                throw new IllegalArgumentException(ProtectedSandApp.s("锣\u0001").concat(type.getName()));
            }
            hashMap = new EnumMap(type);
        }
        hashMap.putAll(map);
        this.f83027b = qVar;
        this.f83028c = Collections.unmodifiableMap(hashMap);
        this.f83029d = 0;
        this.f83030e = true;
        this.f83031f = Locale.getDefault();
    }

    private static <V, K extends Enum<K>> Map<V, String> a(Class<V> cls) {
        return new EnumMap(cls);
    }

    private String b(V v4) {
        String str = this.f83028c.get(v4);
        return str == null ? v4.toString() : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int c(net.time4j.engine.p pVar, Appendable appendable) throws IOException {
        String b5 = b(pVar.r(this.f83027b));
        appendable.append(b5);
        return b5.length();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f83027b.equals(qVar.f83027b) && this.f83028c.equals(qVar.f83028c);
    }

    @Override // net.time4j.format.expert.i
    public net.time4j.engine.q<V> getElement() {
        return this.f83027b;
    }

    public int hashCode() {
        return (this.f83028c.hashCode() * 31) + (this.f83027b.hashCode() * 7);
    }

    @Override // net.time4j.format.expert.i
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.i
    public void parse(CharSequence charSequence, w wVar, net.time4j.engine.d dVar, x<?> xVar, boolean z4) {
        int f4 = wVar.f();
        int length = charSequence.length();
        int intValue = z4 ? this.f83029d : ((Integer) dVar.b(net.time4j.format.a.f82797s, 0)).intValue();
        if (intValue > 0) {
            length -= intValue;
        }
        if (f4 >= length) {
            wVar.l(f4, ProtectedSandApp.s("锤\u0001") + this.f83027b.name());
            wVar.o();
            return;
        }
        boolean booleanValue = z4 ? this.f83030e : ((Boolean) dVar.b(net.time4j.format.a.f82787i, Boolean.TRUE)).booleanValue();
        Locale locale = z4 ? this.f83031f : (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.getDefault());
        int i4 = length - f4;
        for (V v4 : this.f83028c.keySet()) {
            String b5 = b(v4);
            if (booleanValue) {
                String upperCase = b5.toUpperCase(locale);
                int length2 = b5.length();
                if (length2 <= i4) {
                    int i5 = length2 + f4;
                    if (upperCase.equals(charSequence.subSequence(f4, i5).toString().toUpperCase(locale))) {
                        xVar.R(this.f83027b, v4);
                        wVar.m(i5);
                        return;
                    }
                } else {
                    continue;
                }
            } else {
                int length3 = b5.length();
                if (length3 <= i4) {
                    int i6 = length3 + f4;
                    if (b5.equals(charSequence.subSequence(f4, i6).toString())) {
                        xVar.R(this.f83027b, v4);
                        wVar.m(i6);
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
        wVar.l(f4, ProtectedSandApp.s("锥\u0001") + this.f83027b.name());
    }

    @Override // net.time4j.format.expert.i
    public int print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, Set<h> set, boolean z4) throws IOException {
        if (!(appendable instanceof CharSequence)) {
            return c(pVar, appendable);
        }
        CharSequence charSequence = (CharSequence) appendable;
        int length = charSequence.length();
        int c5 = c(pVar, appendable);
        if (set != null) {
            set.add(new h(this.f83027b, length, charSequence.length()));
        }
        return c5;
    }

    @Override // net.time4j.format.expert.i
    public i<V> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i4) {
        return new q(this.f83027b, this.f83028c, ((Integer) dVar.b(net.time4j.format.a.f82797s, 0)).intValue(), ((Boolean) dVar.b(net.time4j.format.a.f82787i, Boolean.TRUE)).booleanValue(), (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.getDefault()));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(512);
        m2.a(q.class, sb, ProtectedSandApp.s("锦\u0001"));
        sb.append(this.f83027b.name());
        sb.append(ProtectedSandApp.s("锧\u0001"));
        sb.append(this.f83028c);
        sb.append(']');
        return sb.toString();
    }

    @Override // net.time4j.format.expert.i
    public i<V> withElement(net.time4j.engine.q<V> qVar) {
        return this.f83027b == qVar ? this : new q(qVar, this.f83028c);
    }

    private q(net.time4j.engine.q<V> qVar, Map<V, String> map, int i4, boolean z4, Locale locale) {
        this.f83027b = qVar;
        this.f83028c = map;
        this.f83029d = i4;
        this.f83030e = z4;
        this.f83031f = locale;
    }
}
