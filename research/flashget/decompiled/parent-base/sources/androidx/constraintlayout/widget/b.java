package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.g;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: h, reason: collision with root package name */
    public static final String f23931h = "ConstraintLayoutStates";

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f23932i = false;

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f23933a;

    /* renamed from: b, reason: collision with root package name */
    d f23934b;

    /* renamed from: c, reason: collision with root package name */
    int f23935c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f23936d = -1;

    /* renamed from: e, reason: collision with root package name */
    private SparseArray<a> f23937e = new SparseArray<>();

    /* renamed from: f, reason: collision with root package name */
    private SparseArray<d> f23938f = new SparseArray<>();

    /* renamed from: g, reason: collision with root package name */
    private f f23939g = null;

    /* compiled from: ConstraintLayoutStates.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f23940a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<C0396b> f23941b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        int f23942c;

        /* renamed from: d, reason: collision with root package name */
        d f23943d;

        public a(Context context, XmlPullParser parser) {
            this.f23942c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.Hl);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.Il) {
                    this.f23940a = obtainStyledAttributes.getResourceId(index, this.f23940a);
                } else if (index == g.m.Jl) {
                    this.f23942c = obtainStyledAttributes.getResourceId(index, this.f23942c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f23942c);
                    context.getResources().getResourceName(this.f23942c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f23943d = dVar;
                        dVar.G(context, this.f23942c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(C0396b size) {
            this.f23941b.add(size);
        }

        public int b(float width, float height) {
            for (int i4 = 0; i4 < this.f23941b.size(); i4++) {
                if (this.f23941b.get(i4).a(width, height)) {
                    return i4;
                }
            }
            return -1;
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    /* renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    static class C0396b {

        /* renamed from: a, reason: collision with root package name */
        int f23944a;

        /* renamed from: b, reason: collision with root package name */
        float f23945b;

        /* renamed from: c, reason: collision with root package name */
        float f23946c;

        /* renamed from: d, reason: collision with root package name */
        float f23947d;

        /* renamed from: e, reason: collision with root package name */
        float f23948e;

        /* renamed from: f, reason: collision with root package name */
        int f23949f;

        /* renamed from: g, reason: collision with root package name */
        d f23950g;

        public C0396b(Context context, XmlPullParser parser) {
            this.f23945b = Float.NaN;
            this.f23946c = Float.NaN;
            this.f23947d = Float.NaN;
            this.f23948e = Float.NaN;
            this.f23949f = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.Un);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.Vn) {
                    this.f23949f = obtainStyledAttributes.getResourceId(index, this.f23949f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f23949f);
                    context.getResources().getResourceName(this.f23949f);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f23950g = dVar;
                        dVar.G(context, this.f23949f);
                    }
                } else if (index == g.m.Wn) {
                    this.f23948e = obtainStyledAttributes.getDimension(index, this.f23948e);
                } else if (index == g.m.Xn) {
                    this.f23946c = obtainStyledAttributes.getDimension(index, this.f23946c);
                } else if (index == g.m.Yn) {
                    this.f23947d = obtainStyledAttributes.getDimension(index, this.f23947d);
                } else if (index == g.m.Zn) {
                    this.f23945b = obtainStyledAttributes.getDimension(index, this.f23945b);
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float widthDp, float heightDp) {
            if (!Float.isNaN(this.f23945b) && widthDp < this.f23945b) {
                return false;
            }
            if (!Float.isNaN(this.f23946c) && heightDp < this.f23946c) {
                return false;
            }
            if (Float.isNaN(this.f23947d) || widthDp <= this.f23947d) {
                return Float.isNaN(this.f23948e) || heightDp <= this.f23948e;
            }
            return false;
        }
    }

    b(Context context, ConstraintLayout layout, int resourceID) {
        this.f23933a = layout;
        a(context, resourceID);
    }

    private void a(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c5 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c5 = 4;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    if (c5 == 2) {
                        aVar = new a(context, xml);
                        this.f23937e.put(aVar.f23940a, aVar);
                    } else if (c5 == 3) {
                        C0396b c0396b = new C0396b(context, xml);
                        if (aVar != null) {
                            aVar.a(c0396b);
                        }
                    } else if (c5 == 4) {
                        c(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    private void c(Context context, XmlPullParser parser) {
        d dVar = new d();
        int attributeCount = parser.getAttributeCount();
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeName = parser.getAttributeName(i4);
            String attributeValue = parser.getAttributeValue(i4);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                dVar.x0(context, parser);
                this.f23938f.put(identifier, dVar);
                return;
            }
        }
    }

    public boolean b(int id2, float width, float height) {
        int i4 = this.f23935c;
        if (i4 != id2) {
            return true;
        }
        a valueAt = id2 == -1 ? this.f23937e.valueAt(0) : this.f23937e.get(i4);
        int i5 = this.f23936d;
        return (i5 == -1 || !valueAt.f23941b.get(i5).a(width, height)) && this.f23936d != valueAt.b(width, height);
    }

    public void d(f constraintsChangedListener) {
        this.f23939g = constraintsChangedListener;
    }

    public void e(int id2, float width, float height) {
        int b5;
        int i4 = this.f23935c;
        if (i4 != id2) {
            this.f23935c = id2;
            a aVar = this.f23937e.get(id2);
            int b6 = aVar.b(width, height);
            d dVar = b6 == -1 ? aVar.f23943d : aVar.f23941b.get(b6).f23950g;
            int i5 = b6 == -1 ? aVar.f23942c : aVar.f23941b.get(b6).f23949f;
            if (dVar == null) {
                return;
            }
            this.f23936d = b6;
            f fVar = this.f23939g;
            if (fVar != null) {
                fVar.b(id2, i5);
            }
            dVar.r(this.f23933a);
            f fVar2 = this.f23939g;
            if (fVar2 != null) {
                fVar2.a(id2, i5);
                return;
            }
            return;
        }
        a valueAt = id2 == -1 ? this.f23937e.valueAt(0) : this.f23937e.get(i4);
        int i6 = this.f23936d;
        if ((i6 == -1 || !valueAt.f23941b.get(i6).a(width, height)) && this.f23936d != (b5 = valueAt.b(width, height))) {
            d dVar2 = b5 == -1 ? this.f23934b : valueAt.f23941b.get(b5).f23950g;
            int i7 = b5 == -1 ? valueAt.f23942c : valueAt.f23941b.get(b5).f23949f;
            if (dVar2 == null) {
                return;
            }
            this.f23936d = b5;
            f fVar3 = this.f23939g;
            if (fVar3 != null) {
                fVar3.b(-1, i7);
            }
            dVar2.r(this.f23933a);
            f fVar4 = this.f23939g;
            if (fVar4 != null) {
                fVar4.a(-1, i7);
            }
        }
    }
}
