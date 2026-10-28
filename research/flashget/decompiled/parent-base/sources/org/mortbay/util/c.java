package org.mortbay.util;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: StringMap.java */
/* loaded from: classes9.dex */
public class c extends AbstractMap implements Externalizable {

    /* renamed from: i, reason: collision with root package name */
    private static final int f87586i = 9;

    /* renamed from: b, reason: collision with root package name */
    protected int f87587b;

    /* renamed from: c, reason: collision with root package name */
    protected a f87588c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f87589d;

    /* renamed from: e, reason: collision with root package name */
    protected b f87590e;

    /* renamed from: f, reason: collision with root package name */
    protected Object f87591f;

    /* renamed from: g, reason: collision with root package name */
    protected HashSet f87592g;

    /* renamed from: h, reason: collision with root package name */
    protected Set f87593h;

    /* compiled from: StringMap.java */
    private static class a implements Map.Entry {

        /* renamed from: b, reason: collision with root package name */
        char[] f87594b;

        /* renamed from: c, reason: collision with root package name */
        char[] f87595c;

        /* renamed from: d, reason: collision with root package name */
        a f87596d;

        /* renamed from: e, reason: collision with root package name */
        a[] f87597e;

        /* renamed from: f, reason: collision with root package name */
        String f87598f;

        /* renamed from: g, reason: collision with root package name */
        Object f87599g;

        a() {
        }

        private void b(StringBuffer stringBuffer) {
            stringBuffer.append("{[");
            if (this.f87594b != null) {
                int i4 = 0;
                while (true) {
                    char[] cArr = this.f87594b;
                    if (i4 >= cArr.length) {
                        break;
                    }
                    stringBuffer.append(cArr[i4]);
                    i4++;
                }
            } else {
                stringBuffer.append('-');
            }
            stringBuffer.append(':');
            stringBuffer.append(this.f87598f);
            stringBuffer.append('=');
            stringBuffer.append(this.f87599g);
            stringBuffer.append(']');
            if (this.f87597e != null) {
                for (int i5 = 0; i5 < this.f87597e.length; i5++) {
                    stringBuffer.append('|');
                    a aVar = this.f87597e[i5];
                    if (aVar != null) {
                        aVar.b(stringBuffer);
                    } else {
                        stringBuffer.append("-");
                    }
                }
            }
            stringBuffer.append('}');
            if (this.f87596d != null) {
                stringBuffer.append(",\n");
                this.f87596d.b(stringBuffer);
            }
        }

        a a(c cVar, int i4) {
            a aVar = new a();
            char[] cArr = this.f87594b;
            int length = cArr.length - i4;
            this.f87594b = new char[i4];
            aVar.f87594b = new char[length];
            System.arraycopy(cArr, 0, this.f87594b, 0, i4);
            System.arraycopy(cArr, i4, aVar.f87594b, 0, length);
            char[] cArr2 = this.f87595c;
            if (cArr2 != null) {
                this.f87595c = new char[i4];
                aVar.f87595c = new char[length];
                System.arraycopy(cArr2, 0, this.f87595c, 0, i4);
                System.arraycopy(cArr2, i4, aVar.f87595c, 0, length);
            }
            aVar.f87598f = this.f87598f;
            aVar.f87599g = this.f87599g;
            this.f87598f = null;
            this.f87599g = null;
            if (cVar.f87592g.remove(this)) {
                cVar.f87592g.add(aVar);
            }
            aVar.f87597e = this.f87597e;
            int i5 = cVar.f87587b;
            a[] aVarArr = new a[i5];
            this.f87597e = aVarArr;
            aVarArr[aVar.f87594b[0] % i5] = aVar;
            char[] cArr3 = aVar.f87595c;
            if (cArr3 != null) {
                char c5 = cArr3[0];
                if (aVarArr[c5 % i5] != aVar) {
                    aVarArr[c5 % i5] = aVar;
                }
            }
            return aVar;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f87598f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f87599g;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f87599g;
            this.f87599g = obj;
            return obj2;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            synchronized (stringBuffer) {
                b(stringBuffer);
            }
            return stringBuffer.toString();
        }

        a(boolean z4, String str, int i4) {
            int length = str.length() - i4;
            this.f87594b = new char[length];
            this.f87595c = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                char charAt = str.charAt(i4 + i5);
                this.f87594b[i5] = charAt;
                if (z4) {
                    if (Character.isUpperCase(charAt)) {
                        charAt = Character.toLowerCase(charAt);
                    } else if (Character.isLowerCase(charAt)) {
                        charAt = Character.toUpperCase(charAt);
                    }
                    this.f87595c[i5] = charAt;
                }
            }
        }
    }

    /* compiled from: StringMap.java */
    private class b implements Map.Entry {
        @Override // java.util.Map.Entry
        public Object getKey() {
            return null;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return c.this.f87591f;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            c cVar = c.this;
            Object obj2 = cVar.f87591f;
            cVar.f87591f = obj;
            return obj2;
        }

        public String toString() {
            return i.a(new StringBuilder("[:null="), c.this.f87591f, "]");
        }

        private b() {
        }
    }

    public c() {
        this.f87587b = 9;
        this.f87588c = new a();
        this.f87589d = false;
        this.f87590e = null;
        this.f87591f = null;
        HashSet hashSet = new HashSet(3);
        this.f87592g = hashSet;
        this.f87593h = Collections.unmodifiableSet(hashSet);
    }

    public Object b(String str) {
        if (str == null) {
            return this.f87591f;
        }
        Map.Entry c5 = c(str, 0, str.length());
        if (c5 == null) {
            return null;
        }
        return c5.getValue();
    }

    public Map.Entry c(String str, int i4, int i5) {
        if (str == null) {
            return this.f87590e;
        }
        a aVar = this.f87588c;
        int i6 = -1;
        for (int i7 = 0; i7 < i5; i7++) {
            char charAt = str.charAt(i4 + i7);
            if (i6 == -1) {
                a[] aVarArr = aVar.f87597e;
                aVar = aVarArr == null ? null : aVarArr[charAt % this.f87587b];
                i6 = 0;
            }
            while (aVar != null) {
                char[] cArr = aVar.f87594b;
                if (cArr[i6] == charAt || (this.f87589d && aVar.f87595c[i6] == charAt)) {
                    i6++;
                    if (i6 == cArr.length) {
                        i6 = -1;
                    }
                } else {
                    if (i6 > 0) {
                        return null;
                    }
                    aVar = aVar.f87596d;
                }
            }
            return null;
        }
        if (i6 > 0) {
            return null;
        }
        if (aVar == null || aVar.f87598f != null) {
            return aVar;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f87588c = new a();
        this.f87590e = null;
        this.f87591f = null;
        this.f87592g.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return obj == null ? this.f87590e != null : c(obj.toString(), 0, obj.toString().length()) != null;
    }

    public Map.Entry d(byte[] bArr, int i4, int i5) {
        if (bArr == null) {
            return this.f87590e;
        }
        a aVar = this.f87588c;
        int i6 = -1;
        for (int i7 = 0; i7 < i5; i7++) {
            char c5 = (char) bArr[i4 + i7];
            if (i6 == -1) {
                a[] aVarArr = aVar.f87597e;
                aVar = aVarArr == null ? null : aVarArr[c5 % this.f87587b];
                i6 = 0;
            }
            while (aVar != null) {
                char[] cArr = aVar.f87594b;
                if (cArr[i6] == c5 || (this.f87589d && aVar.f87595c[i6] == c5)) {
                    i6++;
                    if (i6 == cArr.length) {
                        i6 = -1;
                    }
                } else {
                    if (i6 > 0) {
                        return null;
                    }
                    aVar = aVar.f87596d;
                }
            }
            return null;
        }
        if (i6 > 0) {
            return null;
        }
        if (aVar == null || aVar.f87598f != null) {
            return aVar;
        }
        return null;
    }

    public Map.Entry e(char[] cArr, int i4, int i5) {
        if (cArr == null) {
            return this.f87590e;
        }
        a aVar = this.f87588c;
        int i6 = -1;
        for (int i7 = 0; i7 < i5; i7++) {
            char c5 = cArr[i4 + i7];
            if (i6 == -1) {
                a[] aVarArr = aVar.f87597e;
                aVar = aVarArr == null ? null : aVarArr[c5 % this.f87587b];
                i6 = 0;
            }
            while (aVar != null) {
                char[] cArr2 = aVar.f87594b;
                if (cArr2[i6] == c5 || (this.f87589d && aVar.f87595c[i6] == c5)) {
                    i6++;
                    if (i6 == cArr2.length) {
                        i6 = -1;
                    }
                } else {
                    if (i6 > 0) {
                        return null;
                    }
                    aVar = aVar.f87596d;
                }
            }
            return null;
        }
        if (i6 > 0) {
            return null;
        }
        if (aVar == null || aVar.f87598f != null) {
            return aVar;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return this.f87593h;
    }

    public int f() {
        return this.f87587b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return obj == null ? this.f87591f : obj instanceof String ? b((String) obj) : b(obj.toString());
    }

    public boolean h() {
        return this.f87589d;
    }

    public Object i(String str, Object obj) {
        if (str == null) {
            Object obj2 = this.f87591f;
            this.f87591f = obj;
            if (this.f87590e == null) {
                b bVar = new b();
                this.f87590e = bVar;
                this.f87592g.add(bVar);
            }
            return obj2;
        }
        a aVar = this.f87588c;
        a aVar2 = null;
        a aVar3 = null;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            if (i4 >= str.length()) {
                break;
            }
            char charAt = str.charAt(i4);
            if (i5 == -1) {
                a[] aVarArr = aVar.f87597e;
                aVar2 = null;
                aVar3 = aVar;
                aVar = aVarArr == null ? null : aVarArr[charAt % this.f87587b];
                i5 = 0;
            }
            while (aVar != null) {
                char[] cArr = aVar.f87594b;
                if (cArr[i5] == charAt || (this.f87589d && aVar.f87595c[i5] == charAt)) {
                    i5++;
                    if (i5 == cArr.length) {
                        aVar2 = null;
                    } else {
                        aVar2 = null;
                        i4++;
                    }
                } else if (i5 == 0) {
                    aVar2 = aVar;
                    aVar = aVar.f87596d;
                } else {
                    aVar.a(this, i5);
                    i4--;
                }
                i5 = -1;
                i4++;
            }
            aVar = new a(this.f87589d, str, i4);
            if (aVar2 != null) {
                aVar2.f87596d = aVar;
            } else if (aVar3 != null) {
                if (aVar3.f87597e == null) {
                    aVar3.f87597e = new a[this.f87587b];
                }
                a[] aVarArr2 = aVar3.f87597e;
                int i6 = this.f87587b;
                aVarArr2[charAt % i6] = aVar;
                char[] cArr2 = aVar.f87595c;
                int i7 = cArr2[0] % i6;
                if (cArr2 != null && aVar.f87594b[0] % i6 != i7) {
                    a aVar4 = aVarArr2[i7];
                    if (aVar4 == null) {
                        aVarArr2[i7] = aVar;
                    } else {
                        while (true) {
                            a aVar5 = aVar4.f87596d;
                            if (aVar5 == null) {
                                break;
                            }
                            aVar4 = aVar5;
                        }
                        aVar4.f87596d = aVar;
                    }
                }
            } else {
                this.f87588c = aVar;
            }
        }
        if (aVar == null) {
            return null;
        }
        if (i5 > 0) {
            aVar.a(this, i5);
        }
        Object obj3 = aVar.f87599g;
        aVar.f87598f = str;
        aVar.f87599g = obj;
        this.f87592g.add(aVar);
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f87592g.isEmpty();
    }

    public Object j(String str) {
        if (str == null) {
            Object obj = this.f87591f;
            b bVar = this.f87590e;
            if (bVar != null) {
                this.f87592g.remove(bVar);
                this.f87590e = null;
                this.f87591f = null;
            }
            return obj;
        }
        a aVar = this.f87588c;
        int i4 = -1;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (i4 == -1) {
                a[] aVarArr = aVar.f87597e;
                aVar = aVarArr == null ? null : aVarArr[charAt % this.f87587b];
                i4 = 0;
            }
            while (aVar != null) {
                char[] cArr = aVar.f87594b;
                if (cArr[i4] == charAt || (this.f87589d && aVar.f87595c[i4] == charAt)) {
                    i4++;
                    if (i4 == cArr.length) {
                        i4 = -1;
                    }
                } else {
                    if (i4 > 0) {
                        return null;
                    }
                    aVar = aVar.f87596d;
                }
            }
            return null;
        }
        if (i4 > 0 || aVar == null || aVar.f87598f == null) {
            return null;
        }
        Object obj2 = aVar.f87599g;
        this.f87592g.remove(aVar);
        aVar.f87599g = null;
        aVar.f87598f = null;
        return obj2;
    }

    public void k(boolean z4) {
        if (this.f87588c.f87597e != null) {
            throw new IllegalStateException("Must be set before first put");
        }
        this.f87589d = z4;
    }

    public void l(int i4) {
        this.f87587b = i4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return obj == null ? i(null, obj2) : i(obj.toString(), obj2);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        putAll((HashMap) objectInput.readObject());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return obj == null ? j(null) : j(obj.toString());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f87592g.size();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(new HashMap(this));
    }

    public c(boolean z4) {
        this.f87587b = 9;
        this.f87588c = new a();
        this.f87589d = false;
        this.f87590e = null;
        this.f87591f = null;
        HashSet hashSet = new HashSet(3);
        this.f87592g = hashSet;
        this.f87593h = Collections.unmodifiableSet(hashSet);
        this.f87589d = z4;
    }

    public c(boolean z4, int i4) {
        this.f87587b = 9;
        this.f87588c = new a();
        this.f87589d = false;
        this.f87590e = null;
        this.f87591f = null;
        HashSet hashSet = new HashSet(3);
        this.f87592g = hashSet;
        this.f87593h = Collections.unmodifiableSet(hashSet);
        this.f87589d = z4;
        this.f87587b = i4;
    }
}
