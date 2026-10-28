package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.x0;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k.a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FontResourcesParserCompat.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f4623a = 400;

    /* renamed from: b, reason: collision with root package name */
    private static final int f4624b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4625c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4626d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f4627e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f4628f = 500;

    /* compiled from: FontResourcesParserCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        @u
        static int a(TypedArray typedArray, int i5) {
            return typedArray.getType(i5);
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    public interface b {
    }

    /* compiled from: FontResourcesParserCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes3.dex */
    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final e[] f4629a;

        public d(@o0 e[] eVarArr) {
            this.f4629a = eVarArr;
        }

        @o0
        public e[] a() {
            return this.f4629a;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final String f4630a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4631b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f4632c;

        /* renamed from: d, reason: collision with root package name */
        private final String f4633d;

        /* renamed from: e, reason: collision with root package name */
        private final int f4634e;

        /* renamed from: f, reason: collision with root package name */
        private final int f4635f;

        public e(@o0 String str, int i5, boolean z5, @q0 String str2, int i6, int i7) {
            this.f4630a = str;
            this.f4631b = i5;
            this.f4632c = z5;
            this.f4633d = str2;
            this.f4634e = i6;
            this.f4635f = i7;
        }

        @o0
        public String a() {
            return this.f4630a;
        }

        public int b() {
            return this.f4635f;
        }

        public int c() {
            return this.f4634e;
        }

        @q0
        public String d() {
            return this.f4633d;
        }

        public int e() {
            return this.f4631b;
        }

        public boolean f() {
            return this.f4632c;
        }
    }

    private f() {
    }

    private static int a(TypedArray typedArray, int i5) {
        return a.a(typedArray, i5);
    }

    @q0
    public static b b(@o0 XmlPullParser xmlPullParser, @o0 Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @o0
    public static List<List<byte[]>> c(@o0 Resources resources, @androidx.annotation.e int i5) {
        if (i5 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i5);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a.a(obtainTypedArray, 0) == 1) {
                for (int i6 = 0; i6 < obtainTypedArray.length(); i6++) {
                    int resourceId = obtainTypedArray.getResourceId(i6, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i5)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    @q0
    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    @q0
    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.j.f23044j);
        String string = obtainAttributes.getString(a.j.f23045k);
        String string2 = obtainAttributes.getString(a.j.f23049o);
        String string3 = obtainAttributes.getString(a.j.f23050p);
        int resourceId = obtainAttributes.getResourceId(a.j.f23046l, 0);
        int integer = obtainAttributes.getInteger(a.j.f23047m, 1);
        int integer2 = obtainAttributes.getInteger(a.j.f23048n, 500);
        String string4 = obtainAttributes.getString(a.j.f23051q);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0035f(new androidx.core.provider.f(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new d((e[]) arrayList.toArray(new e[0]));
    }

    private static e f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.j.f23052r);
        int i5 = a.j.A;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = a.j.f23054t;
        }
        int i6 = obtainAttributes.getInt(i5, f4623a);
        int i7 = a.j.f23059y;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = a.j.f23055u;
        }
        boolean z5 = 1 == obtainAttributes.getInt(i7, 0);
        int i8 = a.j.B;
        if (!obtainAttributes.hasValue(i8)) {
            i8 = a.j.f23056v;
        }
        int i9 = a.j.f23060z;
        if (!obtainAttributes.hasValue(i9)) {
            i9 = a.j.f23057w;
        }
        String string = obtainAttributes.getString(i9);
        int i10 = obtainAttributes.getInt(i8, 0);
        int i11 = a.j.f23058x;
        if (!obtainAttributes.hasValue(i11)) {
            i11 = a.j.f23053s;
        }
        int resourceId = obtainAttributes.getResourceId(i11, 0);
        String string2 = obtainAttributes.getString(i11);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new e(string2, i6, z5, string, i10, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i5 = 1;
        while (i5 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i5++;
            } else if (next == 3) {
                i5--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* renamed from: androidx.core.content.res.f$f, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0035f implements b {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final androidx.core.provider.f f4636a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4637b;

        /* renamed from: c, reason: collision with root package name */
        private final int f4638c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        private final String f4639d;

        @c1({c1.a.LIBRARY})
        public C0035f(@o0 androidx.core.provider.f fVar, int i5, int i6, @q0 String str) {
            this.f4636a = fVar;
            this.f4638c = i5;
            this.f4637b = i6;
            this.f4639d = str;
        }

        public int a() {
            return this.f4638c;
        }

        @o0
        public androidx.core.provider.f b() {
            return this.f4636a;
        }

        @q0
        @c1({c1.a.LIBRARY})
        public String c() {
            return this.f4639d;
        }

        public int d() {
            return this.f4637b;
        }

        public C0035f(@o0 androidx.core.provider.f fVar, int i5, int i6) {
            this(fVar, i5, i6, null);
        }
    }
}
