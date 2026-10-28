package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.f;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: h, reason: collision with root package name */
    public static final String f2823h = "ConstraintLayoutStates";

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f2824i = false;

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f2825a;

    /* renamed from: b, reason: collision with root package name */
    d f2826b;

    /* renamed from: c, reason: collision with root package name */
    int f2827c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f2828d = -1;

    /* renamed from: e, reason: collision with root package name */
    private SparseArray<a> f2829e = new SparseArray<>();

    /* renamed from: f, reason: collision with root package name */
    private SparseArray<d> f2830f = new SparseArray<>();

    /* renamed from: g, reason: collision with root package name */
    private e f2831g = null;

    /* compiled from: ConstraintLayoutStates.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f2832a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<C0023b> f2833b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        int f2834c;

        /* renamed from: d, reason: collision with root package name */
        d f2835d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f2834c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.m.Vg);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.Wg) {
                    this.f2832a = obtainStyledAttributes.getResourceId(index, this.f2832a);
                } else if (index == f.m.Xg) {
                    this.f2834c = obtainStyledAttributes.getResourceId(index, this.f2834c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2834c);
                    context.getResources().getResourceName(this.f2834c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f2835d = dVar;
                        dVar.z(context, this.f2834c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(C0023b c0023b) {
            this.f2833b.add(c0023b);
        }

        public int b(float f6, float f7) {
            for (int i5 = 0; i5 < this.f2833b.size(); i5++) {
                if (this.f2833b.get(i5).a(f6, f7)) {
                    return i5;
                }
            }
            return -1;
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    static class C0023b {

        /* renamed from: a, reason: collision with root package name */
        int f2836a;

        /* renamed from: b, reason: collision with root package name */
        float f2837b;

        /* renamed from: c, reason: collision with root package name */
        float f2838c;

        /* renamed from: d, reason: collision with root package name */
        float f2839d;

        /* renamed from: e, reason: collision with root package name */
        float f2840e;

        /* renamed from: f, reason: collision with root package name */
        int f2841f;

        /* renamed from: g, reason: collision with root package name */
        d f2842g;

        public C0023b(Context context, XmlPullParser xmlPullParser) {
            this.f2837b = Float.NaN;
            this.f2838c = Float.NaN;
            this.f2839d = Float.NaN;
            this.f2840e = Float.NaN;
            this.f2841f = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.m.Si);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.Ti) {
                    this.f2841f = obtainStyledAttributes.getResourceId(index, this.f2841f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2841f);
                    context.getResources().getResourceName(this.f2841f);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f2842g = dVar;
                        dVar.z(context, this.f2841f);
                    }
                } else if (index == f.m.Ui) {
                    this.f2840e = obtainStyledAttributes.getDimension(index, this.f2840e);
                } else if (index == f.m.Vi) {
                    this.f2838c = obtainStyledAttributes.getDimension(index, this.f2838c);
                } else if (index == f.m.Wi) {
                    this.f2839d = obtainStyledAttributes.getDimension(index, this.f2839d);
                } else if (index == f.m.Xi) {
                    this.f2837b = obtainStyledAttributes.getDimension(index, this.f2837b);
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f6, float f7) {
            if (!Float.isNaN(this.f2837b) && f6 < this.f2837b) {
                return false;
            }
            if (!Float.isNaN(this.f2838c) && f7 < this.f2838c) {
                return false;
            }
            if (Float.isNaN(this.f2839d) || f6 <= this.f2839d) {
                return Float.isNaN(this.f2840e) || f7 <= this.f2840e;
            }
            return false;
        }
    }

    b(Context context, ConstraintLayout constraintLayout, int i5) {
        this.f2825a = constraintLayout;
        a(context, i5);
    }

    private void a(Context context, int i5) {
        char c6;
        XmlResourceParser xml = context.getResources().getXml(i5);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c6 = 4;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c6 = 2;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c6 = 1;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c6 = 0;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c6 = 3;
                                break;
                            }
                            c6 = 65535;
                            break;
                        default:
                            c6 = 65535;
                            break;
                    }
                    if (c6 != 0 && c6 != 1) {
                        if (c6 == 2) {
                            aVar = new a(context, xml);
                            this.f2829e.put(aVar.f2832a, aVar);
                        } else if (c6 == 3) {
                            C0023b c0023b = new C0023b(context, xml);
                            if (aVar != null) {
                                aVar.a(c0023b);
                            }
                        } else if (c6 == 4) {
                            c(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        } catch (XmlPullParserException e7) {
            e7.printStackTrace();
        }
    }

    private void c(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i5 = 0; i5 < attributeCount; i5++) {
            if ("id".equals(xmlPullParser.getAttributeName(i5))) {
                String attributeValue = xmlPullParser.getAttributeValue(i5);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                dVar.o0(context, xmlPullParser);
                this.f2830f.put(identifier, dVar);
                return;
            }
        }
    }

    public boolean b(int i5, float f6, float f7) {
        int i6 = this.f2827c;
        if (i6 != i5) {
            return true;
        }
        a valueAt = i5 == -1 ? this.f2829e.valueAt(0) : this.f2829e.get(i6);
        int i7 = this.f2828d;
        return (i7 == -1 || !valueAt.f2833b.get(i7).a(f6, f7)) && this.f2828d != valueAt.b(f6, f7);
    }

    public void d(e eVar) {
        this.f2831g = eVar;
    }

    public void e(int i5, float f6, float f7) {
        int b6;
        int i6 = this.f2827c;
        if (i6 != i5) {
            this.f2827c = i5;
            a aVar = this.f2829e.get(i5);
            int b7 = aVar.b(f6, f7);
            d dVar = b7 == -1 ? aVar.f2835d : aVar.f2833b.get(b7).f2842g;
            int i7 = b7 == -1 ? aVar.f2834c : aVar.f2833b.get(b7).f2841f;
            if (dVar == null) {
                return;
            }
            this.f2828d = b7;
            e eVar = this.f2831g;
            if (eVar != null) {
                eVar.b(i5, i7);
            }
            dVar.l(this.f2825a);
            e eVar2 = this.f2831g;
            if (eVar2 != null) {
                eVar2.a(i5, i7);
                return;
            }
            return;
        }
        a valueAt = i5 == -1 ? this.f2829e.valueAt(0) : this.f2829e.get(i6);
        int i8 = this.f2828d;
        if ((i8 == -1 || !valueAt.f2833b.get(i8).a(f6, f7)) && this.f2828d != (b6 = valueAt.b(f6, f7))) {
            d dVar2 = b6 == -1 ? this.f2826b : valueAt.f2833b.get(b6).f2842g;
            int i9 = b6 == -1 ? valueAt.f2834c : valueAt.f2833b.get(b6).f2841f;
            if (dVar2 == null) {
                return;
            }
            this.f2828d = b6;
            e eVar3 = this.f2831g;
            if (eVar3 != null) {
                eVar3.b(-1, i9);
            }
            dVar2.l(this.f2825a);
            e eVar4 = this.f2831g;
            if (eVar4 != null) {
                eVar4.a(-1, i9);
            }
        }
    }
}
