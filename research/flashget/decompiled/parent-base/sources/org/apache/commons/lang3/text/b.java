package org.apache.commons.lang3.text;

import androidx.collection.s;
import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.k1;
import org.apache.commons.lang3.p0;

/* compiled from: ExtendedMessageFormat.java */
@Deprecated
/* loaded from: classes6.dex */
public class b extends MessageFormat {

    /* renamed from: d, reason: collision with root package name */
    private static final long f86140d = -2362048321261811743L;

    /* renamed from: e, reason: collision with root package name */
    private static final int f86141e = 31;

    /* renamed from: f, reason: collision with root package name */
    private static final String f86142f = "";

    /* renamed from: g, reason: collision with root package name */
    private static final char f86143g = ',';

    /* renamed from: h, reason: collision with root package name */
    private static final char f86144h = '}';

    /* renamed from: i, reason: collision with root package name */
    private static final char f86145i = '{';

    /* renamed from: j, reason: collision with root package name */
    private static final char f86146j = '\'';

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ boolean f86147k = false;

    /* renamed from: b, reason: collision with root package name */
    private String f86148b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, ? extends c> f86149c;

    public b(String str) {
        this(str, Locale.getDefault(), null);
    }

    private StringBuilder b(String str, ParsePosition parsePosition, StringBuilder sb) {
        if (sb != null) {
            sb.append(f86146j);
        }
        g(parsePosition);
        int index = parsePosition.getIndex();
        char[] charArray = str.toCharArray();
        for (int index2 = parsePosition.getIndex(); index2 < str.length(); index2++) {
            if (charArray[parsePosition.getIndex()] == '\'') {
                g(parsePosition);
                if (sb == null) {
                    return null;
                }
                sb.append(charArray, index, parsePosition.getIndex() - index);
                return sb;
            }
            g(parsePosition);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a("Unterminated quoted string at position ", index));
    }

    private boolean c(Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    private Format d(String str) {
        String str2;
        if (this.f86149c != null) {
            int indexOf = str.indexOf(44);
            if (indexOf > 0) {
                String trim = str.substring(0, indexOf).trim();
                str2 = str.substring(indexOf + 1).trim();
                str = trim;
            } else {
                str2 = null;
            }
            c cVar = this.f86149c.get(str);
            if (cVar != null) {
                return cVar.a(str, str2, getLocale());
            }
        }
        return null;
    }

    private void e(String str, ParsePosition parsePosition) {
        b(str, parsePosition, null);
    }

    private String f(String str, ArrayList<String> arrayList) {
        String str2;
        if (!c(arrayList)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() * 2);
        int i4 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        int i5 = -1;
        while (parsePosition.getIndex() < str.length()) {
            char charAt = str.charAt(parsePosition.getIndex());
            if (charAt == '\'') {
                b(str, parsePosition, sb);
            } else if (charAt != '{') {
                if (charAt == '}') {
                    i4--;
                }
                sb.append(charAt);
                g(parsePosition);
            } else {
                i4++;
                sb.append(f86145i);
                sb.append(k(str, g(parsePosition)));
                if (i4 == 1 && (str2 = arrayList.get((i5 = i5 + 1))) != null) {
                    sb.append(f86143g);
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }

    private ParsePosition g(ParsePosition parsePosition) {
        parsePosition.setIndex(parsePosition.getIndex() + 1);
        return parsePosition;
    }

    private String i(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        l(str, parsePosition);
        int index2 = parsePosition.getIndex();
        int i4 = 1;
        while (parsePosition.getIndex() < str.length()) {
            char charAt = str.charAt(parsePosition.getIndex());
            if (charAt == '\'') {
                b(str, parsePosition, null);
            } else if (charAt == '{') {
                i4++;
            } else if (charAt == '}' && i4 - 1 == 0) {
                return str.substring(index2, parsePosition.getIndex());
            }
            g(parsePosition);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a("Unterminated format element at position ", index));
    }

    private int k(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        l(str, parsePosition);
        StringBuilder sb = new StringBuilder();
        boolean z4 = false;
        while (!z4 && parsePosition.getIndex() < str.length()) {
            char charAt = str.charAt(parsePosition.getIndex());
            if (Character.isWhitespace(charAt)) {
                l(str, parsePosition);
                charAt = str.charAt(parsePosition.getIndex());
                if (charAt != ',' && charAt != '}') {
                    z4 = true;
                    g(parsePosition);
                }
            }
            if ((charAt == ',' || charAt == '}') && sb.length() > 0) {
                try {
                    return Integer.parseInt(sb.toString());
                } catch (NumberFormatException unused) {
                }
            }
            boolean z5 = !Character.isDigit(charAt);
            sb.append(charAt);
            z4 = z5;
            g(parsePosition);
        }
        if (!z4) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Unterminated format element at position ", index));
        }
        StringBuilder a5 = s.a("Invalid format argument index at position ", index, ": ");
        a5.append(str.substring(index, parsePosition.getIndex()));
        throw new IllegalArgumentException(a5.toString());
    }

    private void l(String str, ParsePosition parsePosition) {
        char[] charArray = str.toCharArray();
        do {
            int f4 = g.l().f(charArray, parsePosition.getIndex());
            parsePosition.setIndex(parsePosition.getIndex() + f4);
            if (f4 <= 0) {
                return;
            }
        } while (parsePosition.getIndex() < str.length());
    }

    @Override // java.text.MessageFormat
    public final void applyPattern(String str) {
        String str2;
        Format format;
        if (this.f86149c == null) {
            super.applyPattern(str);
            this.f86148b = super.toPattern();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str.length());
        int i4 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        char[] charArray = str.toCharArray();
        int i5 = 0;
        while (parsePosition.getIndex() < str.length()) {
            char c5 = charArray[parsePosition.getIndex()];
            if (c5 != '\'') {
                if (c5 == '{') {
                    i5++;
                    l(str, parsePosition);
                    int index = parsePosition.getIndex();
                    int k4 = k(str, g(parsePosition));
                    sb.append(f86145i);
                    sb.append(k4);
                    l(str, parsePosition);
                    if (charArray[parsePosition.getIndex()] == ',') {
                        str2 = i(str, g(parsePosition));
                        format = d(str2);
                        if (format == null) {
                            sb.append(f86143g);
                            sb.append(str2);
                        }
                    } else {
                        str2 = null;
                        format = null;
                    }
                    arrayList.add(format);
                    arrayList2.add(format != null ? str2 : null);
                    k1.y(arrayList.size() == i5);
                    k1.y(arrayList2.size() == i5);
                    if (charArray[parsePosition.getIndex()] != '}') {
                        throw new IllegalArgumentException(android.support.v4.media.a.a("Unreadable format element at position ", index));
                    }
                }
                sb.append(charArray[parsePosition.getIndex()]);
                g(parsePosition);
            } else {
                b(str, parsePosition, sb);
            }
        }
        super.applyPattern(sb.toString());
        this.f86148b = f(super.toPattern(), arrayList2);
        if (c(arrayList)) {
            Format[] formats = getFormats();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Format format2 = (Format) it.next();
                if (format2 != null) {
                    formats[i4] = format2;
                }
                i4++;
            }
            super.setFormats(formats);
        }
    }

    @Override // java.text.MessageFormat
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !super.equals(obj) || p0.M(getClass(), obj.getClass())) {
            return false;
        }
        if (p0.M(this.f86148b, ((b) obj).f86148b)) {
            return false;
        }
        return !p0.M(this.f86149c, r5.f86149c);
    }

    @Override // java.text.MessageFormat
    public int hashCode() {
        return Objects.hashCode(this.f86148b) + ((Objects.hashCode(this.f86149c) + (super.hashCode() * 31)) * 31);
    }

    @Override // java.text.MessageFormat
    public void setFormat(int i4, Format format) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormatByArgumentIndex(int i4, Format format) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormats(Format[] formatArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public void setFormatsByArgumentIndex(Format[] formatArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.text.MessageFormat
    public String toPattern() {
        return this.f86148b;
    }

    public b(String str, Locale locale) {
        this(str, locale, null);
    }

    public b(String str, Map<String, ? extends c> map) {
        this(str, Locale.getDefault(), map);
    }

    public b(String str, Locale locale, Map<String, ? extends c> map) {
        super("");
        setLocale(locale);
        this.f86149c = map;
        applyPattern(str);
    }
}
