package net.time4j.format;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: TextAccessor.java */
/* loaded from: classes7.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    private static final char f83111b = 160;

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ boolean f83112c = false;

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f83113a;

    u(String[] strArr) {
        this.f83113a = Collections.unmodifiableList(Arrays.asList(strArr));
    }

    private boolean a(char c5, char c6) {
        if (c5 >= 'a' && c5 <= 'z') {
            if (c6 >= 'A' && c6 <= 'Z') {
                c6 = (char) (c6 + ' ');
            }
            return c5 == c6;
        }
        if (c5 < 'A' || c5 > 'Z') {
            return Character.toUpperCase(c5) == Character.toUpperCase(c6) || Character.toLowerCase(c5) == Character.toLowerCase(c6);
        }
        char c7 = (char) (c5 + ' ');
        if (c6 >= 'A' && c6 <= 'Z') {
            c6 = (char) (c6 + ' ');
        }
        return c7 == c6;
    }

    private <V extends Enum<V>> V f(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, boolean z4, boolean z5, boolean z6) {
        int i4;
        int i5;
        String str;
        V v4;
        V[] enumConstants = cls.getEnumConstants();
        int size = this.f83113a.size();
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        String str2 = "";
        String str3 = "";
        int i6 = 0;
        V v5 = null;
        int i7 = 0;
        while (i6 < enumConstants.length) {
            boolean isEmpty = str3.isEmpty();
            if (isEmpty) {
                str3 = i6 >= size ? enumConstants[i6].name() : this.f83113a.get(i6);
            }
            int length2 = str3.length();
            int i10 = index;
            int i11 = 0;
            boolean z7 = true;
            while (z7 && i11 < length2) {
                int i12 = size;
                int i13 = index + i11;
                if (i13 >= length) {
                    str = str2;
                    v4 = v5;
                    z7 = false;
                } else {
                    char charAt = charSequence.charAt(i13);
                    str = str2;
                    char charAt2 = str3.charAt(i11);
                    if (z6) {
                        v4 = v5;
                        if (charAt == 160) {
                            charAt = ' ';
                        }
                        if (charAt2 == 160) {
                            charAt2 = ' ';
                        }
                    } else {
                        v4 = v5;
                    }
                    boolean z10 = !z4 ? charAt != charAt2 : !(charAt == charAt2 || a(charAt, charAt2));
                    if (z10) {
                        i10++;
                    }
                    z7 = z10;
                }
                i11++;
                size = i12;
                str2 = str;
                v5 = v4;
            }
            int i14 = size;
            String str4 = str2;
            V v6 = v5;
            if (z6 && isEmpty && length2 == 5 && str3.charAt(4) == '.' && i10 == (i5 = index + 3) && i5 < length && charSequence.charAt(i5) == '.') {
                i6--;
                str3 = ((Object) str3.subSequence(index, i5)) + ProtectedSandApp.s("闲\u0001");
            } else {
                if (z5 || length2 == 1) {
                    int i15 = i10 - index;
                    if (i7 < i15) {
                        v5 = enumConstants[i6];
                        i7 = i15;
                        str3 = str4;
                        i4 = 1;
                        i6 += i4;
                        size = i14;
                        str2 = str4;
                    } else if (i7 == i15) {
                        str3 = str4;
                        i4 = 1;
                        v5 = null;
                        i6 += i4;
                        size = i14;
                        str2 = str4;
                    }
                } else if (z7) {
                    parsePosition.setIndex(i10);
                    return enumConstants[i6];
                }
                str3 = str4;
            }
            v5 = v6;
            i4 = 1;
            i6 += i4;
            size = i14;
            str2 = str4;
        }
        V v7 = v5;
        if (v7 == null) {
            parsePosition.setErrorIndex(index);
        } else {
            parsePosition.setIndex(index + i7);
        }
        return v7;
    }

    public List<String> b() {
        return this.f83113a;
    }

    public <V extends Enum<V>> V c(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls) {
        return (V) f(charSequence, parsePosition, cls, true, false, true);
    }

    public <V extends Enum<V>> V d(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, net.time4j.engine.d dVar) {
        net.time4j.engine.c<Boolean> cVar = a.f82787i;
        Boolean bool = Boolean.TRUE;
        return (V) f(charSequence, parsePosition, cls, ((Boolean) dVar.b(cVar, bool)).booleanValue(), ((Boolean) dVar.b(a.f82788j, Boolean.FALSE)).booleanValue(), ((Boolean) dVar.b(a.f82789k, bool)).booleanValue());
    }

    public <V extends Enum<V>> V e(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, g gVar) {
        boolean z4;
        boolean z5;
        boolean z6;
        if (gVar == g.STRICT) {
            z5 = false;
        } else {
            if (gVar != g.LAX) {
                z4 = false;
                z5 = true;
                z6 = true;
                return (V) f(charSequence, parsePosition, cls, z5, z4, z6);
            }
            z5 = true;
        }
        z4 = z5;
        z6 = z4;
        return (V) f(charSequence, parsePosition, cls, z5, z4, z6);
    }

    public String g(Enum<?> r32) {
        int ordinal = r32.ordinal();
        return this.f83113a.size() <= ordinal ? r32.name() : this.f83113a.get(ordinal);
    }

    public String toString() {
        int size = this.f83113a.size();
        StringBuilder sb = new StringBuilder((size * 16) + 2);
        sb.append('{');
        boolean z4 = true;
        for (int i4 = 0; i4 < size; i4++) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(',');
            }
            sb.append(this.f83113a.get(i4));
        }
        sb.append('}');
        return sb.toString();
    }
}
