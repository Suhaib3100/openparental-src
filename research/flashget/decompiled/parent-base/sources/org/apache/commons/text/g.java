package org.apache.commons.text;

import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* compiled from: ExtendedMessageFormat.java */
/* loaded from: classes3.dex */
public class g extends MessageFormat {

    /* renamed from: d, reason: collision with root package name */
    private static final long f86446d = -2362048321261811743L;

    /* renamed from: e, reason: collision with root package name */
    private static final int f86447e = 31;

    /* renamed from: f, reason: collision with root package name */
    private static final String f86448f = "";

    /* renamed from: g, reason: collision with root package name */
    private static final char f86449g = ',';

    /* renamed from: h, reason: collision with root package name */
    private static final char f86450h = '}';

    /* renamed from: i, reason: collision with root package name */
    private static final char f86451i = '{';

    /* renamed from: j, reason: collision with root package name */
    private static final char f86452j = '\'';

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ boolean f86453k = false;

    /* renamed from: b, reason: collision with root package name */
    private String f86454b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, ? extends h> f86455c;

    public g(String str) {
        this(str, Locale.getDefault(Locale.Category.FORMAT), null);
    }

    private StringBuilder b(String str, ParsePosition parsePosition, StringBuilder sb) {
        if (sb != null) {
            sb.append(f86452j);
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
        if (this.f86455c != null) {
            int indexOf = str.indexOf(44);
            if (indexOf > 0) {
                String trim = str.substring(0, indexOf).trim();
                str2 = str.substring(indexOf + 1).trim();
                str = trim;
            } else {
                str2 = null;
            }
            h hVar = this.f86455c.get(str);
            if (hVar != null) {
                return hVar.a(str, str2, getLocale());
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
                sb.append(f86451i);
                sb.append(k(str, g(parsePosition)));
                if (i4 == 1 && (str2 = arrayList.get((i5 = i5 + 1))) != null) {
                    sb.append(f86449g);
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
                g(parsePosition);
            } else if (charAt != '}') {
                g(parsePosition);
            } else {
                i4--;
                if (i4 == 0) {
                    return str.substring(index2, parsePosition.getIndex());
                }
                g(parsePosition);
            }
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
        StringBuilder a5 = androidx.collection.s.a("Invalid format argument index at position ", index, ": ");
        a5.append(str.substring(index, parsePosition.getIndex()));
        throw new IllegalArgumentException(a5.toString());
    }

    private void l(String str, ParsePosition parsePosition) {
        char[] charArray = str.toCharArray();
        do {
            int b5 = org.apache.commons.text.matcher.c.f86564c.k().b(charArray, parsePosition.getIndex(), 0, charArray.length);
            parsePosition.setIndex(parsePosition.getIndex() + b5);
            if (b5 <= 0) {
                return;
            }
        } while (parsePosition.getIndex() < str.length());
    }

    @Override // java.text.MessageFormat
    public final void applyPattern(String str) {
        String str2;
        Format format;
        if (this.f86455c == null) {
            super.applyPattern(str);
            this.f86454b = super.toPattern();
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
                    sb.append(f86451i);
                    sb.append(k4);
                    l(str, parsePosition);
                    if (charArray[parsePosition.getIndex()] == ',') {
                        str2 = i(str, g(parsePosition));
                        format = d(str2);
                        if (format == null) {
                            sb.append(f86449g);
                            sb.append(str2);
                        }
                    } else {
                        str2 = null;
                        format = null;
                    }
                    arrayList.add(format);
                    arrayList2.add(format != null ? str2 : null);
                    if (arrayList.size() != i5) {
                        throw new IllegalArgumentException("The validated expression is false");
                    }
                    if (arrayList2.size() != i5) {
                        throw new IllegalArgumentException("The validated expression is false");
                    }
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
        this.f86454b = f(super.toPattern(), arrayList2);
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
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        g gVar = (g) obj;
        if (Objects.equals(this.f86454b, gVar.f86454b) && super.equals(obj)) {
            return Objects.equals(this.f86455c, gVar.f86455c);
        }
        return false;
    }

    @Override // java.text.MessageFormat
    public int hashCode() {
        return Objects.hashCode(this.f86454b) + ((Objects.hashCode(this.f86455c) + (super.hashCode() * 31)) * 31);
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
        return this.f86454b;
    }

    public g(String str, Locale locale) {
        this(str, locale, null);
    }

    public g(String str, Map<String, ? extends h> map) {
        this(str, Locale.getDefault(Locale.Category.FORMAT), map);
    }

    public g(String str, Locale locale, Map<String, ? extends h> map) {
        super("");
        setLocale(locale);
        this.f86455c = map;
        applyPattern(str);
    }
}
