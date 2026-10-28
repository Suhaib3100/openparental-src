package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z0.a;

/* compiled from: FontResourcesParserCompat.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f26111a = 400;

    /* renamed from: b, reason: collision with root package name */
    private static final int f26112b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f26113c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f26114d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f26115e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f26116f = 500;

    /* compiled from: FontResourcesParserCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        static int a(TypedArray typedArray, int i4) {
            return typedArray.getType(i4);
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
    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final e[] f26117a;

        public d(@o0 e[] eVarArr) {
            this.f26117a = eVarArr;
        }

        @o0
        public e[] a() {
            return this.f26117a;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final String f26118a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26119b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f26120c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26121d;

        /* renamed from: e, reason: collision with root package name */
        private final int f26122e;

        /* renamed from: f, reason: collision with root package name */
        private final int f26123f;

        public e(@o0 String str, int i4, boolean z4, @q0 String str2, int i5, int i6) {
            this.f26118a = str;
            this.f26119b = i4;
            this.f26120c = z4;
            this.f26121d = str2;
            this.f26122e = i5;
            this.f26123f = i6;
        }

        @o0
        public String a() {
            return this.f26118a;
        }

        public int b() {
            return this.f26123f;
        }

        public int c() {
            return this.f26122e;
        }

        @q0
        public String d() {
            return this.f26121d;
        }

        public int e() {
            return this.f26119b;
        }

        public boolean f() {
            return this.f26120c;
        }
    }

    private f() {
    }

    private static int a(TypedArray typedArray, int i4) {
        return typedArray.getType(i4);
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
    public static List<List<byte[]>> c(@o0 Resources resources, @androidx.annotation.e int i4) {
        if (i4 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i5 = 0; i5 < obtainTypedArray.length(); i5++) {
                    int resourceId = obtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i4)));
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
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.j.f93638j);
        String string = obtainAttributes.getString(a.j.f93639k);
        String string2 = obtainAttributes.getString(a.j.f93644p);
        String string3 = obtainAttributes.getString(a.j.f93645q);
        String string4 = obtainAttributes.getString(a.j.f93641m);
        int resourceId = obtainAttributes.getResourceId(a.j.f93640l, 0);
        int integer = obtainAttributes.getInteger(a.j.f93642n, 1);
        int integer2 = obtainAttributes.getInteger(a.j.f93643o, 500);
        String string5 = obtainAttributes.getString(a.j.f93646r);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            List<List<byte[]>> c5 = c(resources, resourceId);
            return new C0412f(new androidx.core.provider.g(string, string2, string3, c5), string4 != null ? new androidx.core.provider.g(string, string2, string4, c5) : null, integer, integer2, string5);
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
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.j.f93647s);
        int i4 = a.j.B;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = a.j.f93649u;
        }
        int i5 = obtainAttributes.getInt(i4, 400);
        int i6 = a.j.f93654z;
        if (!obtainAttributes.hasValue(i6)) {
            i6 = a.j.f93650v;
        }
        boolean z4 = 1 == obtainAttributes.getInt(i6, 0);
        int i7 = a.j.C;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = a.j.f93651w;
        }
        int i10 = a.j.A;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = a.j.f93652x;
        }
        String string = obtainAttributes.getString(i10);
        int i11 = obtainAttributes.getInt(i7, 0);
        int i12 = a.j.f93653y;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = a.j.f93648t;
        }
        int resourceId = obtainAttributes.getResourceId(i12, 0);
        String string2 = obtainAttributes.getString(i12);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new e(string2, i5, z4, string, i11, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i4++;
            } else if (next == 3) {
                i4--;
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
    public static final class C0412f implements b {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final androidx.core.provider.g f26124a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        private final androidx.core.provider.g f26125b;

        /* renamed from: c, reason: collision with root package name */
        private final int f26126c;

        /* renamed from: d, reason: collision with root package name */
        private final int f26127d;

        /* renamed from: e, reason: collision with root package name */
        @q0
        private final String f26128e;

        @c1({c1.a.LIBRARY})
        public C0412f(@o0 androidx.core.provider.g gVar, @q0 androidx.core.provider.g gVar2, int i4, int i5, @q0 String str) {
            this.f26124a = gVar;
            this.f26125b = gVar2;
            this.f26127d = i4;
            this.f26126c = i5;
            this.f26128e = str;
        }

        @q0
        public androidx.core.provider.g a() {
            return this.f26125b;
        }

        public int b() {
            return this.f26127d;
        }

        @o0
        public androidx.core.provider.g c() {
            return this.f26124a;
        }

        @q0
        @c1({c1.a.LIBRARY})
        public String d() {
            return this.f26128e;
        }

        public int e() {
            return this.f26126c;
        }

        public C0412f(@o0 androidx.core.provider.g gVar, int i4, int i5) {
            this(gVar, null, i4, i5, null);
        }
    }
}
