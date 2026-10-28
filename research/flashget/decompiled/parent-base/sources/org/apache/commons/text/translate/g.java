package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;
import java.security.InvalidParameterException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* compiled from: LookupTranslator.java */
/* loaded from: classes3.dex */
public class g extends b {

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f86703b;

    /* renamed from: c, reason: collision with root package name */
    private final BitSet f86704c;

    /* renamed from: d, reason: collision with root package name */
    private final int f86705d;

    /* renamed from: e, reason: collision with root package name */
    private final int f86706e;

    public g(Map<CharSequence, CharSequence> map) {
        if (map == null) {
            throw new InvalidParameterException("lookupMap cannot be null");
        }
        this.f86703b = new HashMap();
        this.f86704c = new BitSet();
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        for (Map.Entry<CharSequence, CharSequence> entry : map.entrySet()) {
            this.f86703b.put(entry.getKey().toString(), entry.getValue().toString());
            this.f86704c.set(entry.getKey().charAt(0));
            int length = entry.getKey().length();
            i4 = length < i4 ? length : i4;
            if (length > i5) {
                i5 = length;
            }
        }
        this.f86705d = i4;
        this.f86706e = i5;
    }

    @Override // org.apache.commons.text.translate.b
    public int b(CharSequence charSequence, int i4, Writer writer) throws IOException {
        if (!this.f86704c.get(charSequence.charAt(i4))) {
            return 0;
        }
        int i5 = this.f86706e;
        if (i4 + i5 > charSequence.length()) {
            i5 = charSequence.length() - i4;
        }
        while (i5 >= this.f86705d) {
            String str = this.f86703b.get(charSequence.subSequence(i4, i4 + i5).toString());
            if (str != null) {
                writer.write(str);
                return i5;
            }
            i5--;
        }
        return 0;
    }
}
