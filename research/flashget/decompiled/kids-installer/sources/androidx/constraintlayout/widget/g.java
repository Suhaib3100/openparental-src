package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: StateSet.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: h, reason: collision with root package name */
    public static final String f3892h = "ConstraintLayoutStates";

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f3893i = false;

    /* renamed from: b, reason: collision with root package name */
    d f3895b;

    /* renamed from: a, reason: collision with root package name */
    int f3894a = -1;

    /* renamed from: c, reason: collision with root package name */
    int f3896c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f3897d = -1;

    /* renamed from: e, reason: collision with root package name */
    private SparseArray<a> f3898e = new SparseArray<>();

    /* renamed from: f, reason: collision with root package name */
    private SparseArray<d> f3899f = new SparseArray<>();

    /* renamed from: g, reason: collision with root package name */
    private e f3900g = null;

    /* compiled from: StateSet.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f3901a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<b> f3902b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        int f3903c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3904d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f3903c = -1;
            this.f3904d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.m.Vg);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.Wg) {
                    this.f3901a = obtainStyledAttributes.getResourceId(index, this.f3901a);
                } else if (index == f.m.Xg) {
                    this.f3903c = obtainStyledAttributes.getResourceId(index, this.f3903c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3903c);
                    context.getResources().getResourceName(this.f3903c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f3904d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f3902b.add(bVar);
        }

        public int b(float f6, float f7) {
            for (int i5 = 0; i5 < this.f3902b.size(); i5++) {
                if (this.f3902b.get(i5).a(f6, f7)) {
                    return i5;
                }
            }
            return -1;
        }
    }

    /* compiled from: StateSet.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        int f3905a;

        /* renamed from: b, reason: collision with root package name */
        float f3906b;

        /* renamed from: c, reason: collision with root package name */
        float f3907c;

        /* renamed from: d, reason: collision with root package name */
        float f3908d;

        /* renamed from: e, reason: collision with root package name */
        float f3909e;

        /* renamed from: f, reason: collision with root package name */
        int f3910f;

        /* renamed from: g, reason: collision with root package name */
        boolean f3911g;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f3906b = Float.NaN;
            this.f3907c = Float.NaN;
            this.f3908d = Float.NaN;
            this.f3909e = Float.NaN;
            this.f3910f = -1;
            this.f3911g = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.m.Si);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == f.m.Ti) {
                    this.f3910f = obtainStyledAttributes.getResourceId(index, this.f3910f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3910f);
                    context.getResources().getResourceName(this.f3910f);
                    if ("layout".equals(resourceTypeName)) {
                        this.f3911g = true;
                    }
                } else if (index == f.m.Ui) {
                    this.f3909e = obtainStyledAttributes.getDimension(index, this.f3909e);
                } else if (index == f.m.Vi) {
                    this.f3907c = obtainStyledAttributes.getDimension(index, this.f3907c);
                } else if (index == f.m.Wi) {
                    this.f3908d = obtainStyledAttributes.getDimension(index, this.f3908d);
                } else if (index == f.m.Xi) {
                    this.f3906b = obtainStyledAttributes.getDimension(index, this.f3906b);
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f6, float f7) {
            if (!Float.isNaN(this.f3906b) && f6 < this.f3906b) {
                return false;
            }
            if (!Float.isNaN(this.f3907c) && f7 < this.f3907c) {
                return false;
            }
            if (Float.isNaN(this.f3908d) || f6 <= this.f3908d) {
                return Float.isNaN(this.f3909e) || f7 <= this.f3909e;
            }
            return false;
        }
    }

    public g(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        char c6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.m.hh);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = obtainStyledAttributes.getIndex(i5);
            if (index == f.m.ih) {
                this.f3894a = obtainStyledAttributes.getResourceId(index, this.f3894a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c6 = 2;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c6 = 0;
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
                            aVar = new a(context, xmlPullParser);
                            this.f3898e.put(aVar.f3901a, aVar);
                        } else if (c6 == 3) {
                            b bVar = new b(context, xmlPullParser);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        } catch (XmlPullParserException e7) {
            e7.printStackTrace();
        }
    }

    public int a(int i5, int i6, float f6, float f7) {
        a aVar = this.f3898e.get(i6);
        if (aVar == null) {
            return i6;
        }
        if (f6 == -1.0f || f7 == -1.0f) {
            if (aVar.f3903c == i5) {
                return i5;
            }
            Iterator<b> it = aVar.f3902b.iterator();
            while (it.hasNext()) {
                if (i5 == it.next().f3910f) {
                    return i5;
                }
            }
            return aVar.f3903c;
        }
        Iterator<b> it2 = aVar.f3902b.iterator();
        b bVar = null;
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.a(f6, f7)) {
                if (i5 == next.f3910f) {
                    return i5;
                }
                bVar = next;
            }
        }
        return bVar != null ? bVar.f3910f : aVar.f3903c;
    }

    public boolean c(int i5, float f6, float f7) {
        int i6 = this.f3896c;
        if (i6 != i5) {
            return true;
        }
        a valueAt = i5 == -1 ? this.f3898e.valueAt(0) : this.f3898e.get(i6);
        int i7 = this.f3897d;
        return (i7 == -1 || !valueAt.f3902b.get(i7).a(f6, f7)) && this.f3897d != valueAt.b(f6, f7);
    }

    public void d(e eVar) {
        this.f3900g = eVar;
    }

    public int e(int i5, int i6, int i7) {
        return f(-1, i5, i6, i7);
    }

    public int f(int i5, int i6, float f6, float f7) {
        if (i5 != i6) {
            a aVar = this.f3898e.get(i6);
            if (aVar == null) {
                return -1;
            }
            int b6 = aVar.b(f6, f7);
            return b6 == -1 ? aVar.f3903c : aVar.f3902b.get(b6).f3910f;
        }
        a valueAt = i6 == -1 ? this.f3898e.valueAt(0) : this.f3898e.get(this.f3896c);
        if (valueAt == null) {
            return -1;
        }
        if (this.f3897d != -1 && valueAt.f3902b.get(i5).a(f6, f7)) {
            return i5;
        }
        int b7 = valueAt.b(f6, f7);
        return i5 == b7 ? i5 : b7 == -1 ? valueAt.f3903c : valueAt.f3902b.get(b7).f3910f;
    }
}
