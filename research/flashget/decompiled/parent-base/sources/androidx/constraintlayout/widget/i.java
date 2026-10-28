package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: StateSet.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: h, reason: collision with root package name */
    public static final String f25281h = "ConstraintLayoutStates";

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f25282i = false;

    /* renamed from: b, reason: collision with root package name */
    d f25284b;

    /* renamed from: a, reason: collision with root package name */
    int f25283a = -1;

    /* renamed from: c, reason: collision with root package name */
    int f25285c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f25286d = -1;

    /* renamed from: e, reason: collision with root package name */
    private SparseArray<a> f25287e = new SparseArray<>();

    /* renamed from: f, reason: collision with root package name */
    private SparseArray<d> f25288f = new SparseArray<>();

    /* renamed from: g, reason: collision with root package name */
    private f f25289g = null;

    /* compiled from: StateSet.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f25290a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<b> f25291b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        int f25292c;

        /* renamed from: d, reason: collision with root package name */
        boolean f25293d;

        public a(Context context, XmlPullParser parser) {
            this.f25292c = -1;
            this.f25293d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.Hl);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.Il) {
                    this.f25290a = obtainStyledAttributes.getResourceId(index, this.f25290a);
                } else if (index == g.m.Jl) {
                    this.f25292c = obtainStyledAttributes.getResourceId(index, this.f25292c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f25292c);
                    context.getResources().getResourceName(this.f25292c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f25293d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b size) {
            this.f25291b.add(size);
        }

        public int b(float width, float height) {
            for (int i4 = 0; i4 < this.f25291b.size(); i4++) {
                if (this.f25291b.get(i4).a(width, height)) {
                    return i4;
                }
            }
            return -1;
        }
    }

    /* compiled from: StateSet.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        int f25294a;

        /* renamed from: b, reason: collision with root package name */
        float f25295b;

        /* renamed from: c, reason: collision with root package name */
        float f25296c;

        /* renamed from: d, reason: collision with root package name */
        float f25297d;

        /* renamed from: e, reason: collision with root package name */
        float f25298e;

        /* renamed from: f, reason: collision with root package name */
        int f25299f;

        /* renamed from: g, reason: collision with root package name */
        boolean f25300g;

        public b(Context context, XmlPullParser parser) {
            this.f25295b = Float.NaN;
            this.f25296c = Float.NaN;
            this.f25297d = Float.NaN;
            this.f25298e = Float.NaN;
            this.f25299f = -1;
            this.f25300g = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.Un);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.Vn) {
                    this.f25299f = obtainStyledAttributes.getResourceId(index, this.f25299f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f25299f);
                    context.getResources().getResourceName(this.f25299f);
                    if ("layout".equals(resourceTypeName)) {
                        this.f25300g = true;
                    }
                } else if (index == g.m.Wn) {
                    this.f25298e = obtainStyledAttributes.getDimension(index, this.f25298e);
                } else if (index == g.m.Xn) {
                    this.f25296c = obtainStyledAttributes.getDimension(index, this.f25296c);
                } else if (index == g.m.Yn) {
                    this.f25297d = obtainStyledAttributes.getDimension(index, this.f25297d);
                } else if (index == g.m.Zn) {
                    this.f25295b = obtainStyledAttributes.getDimension(index, this.f25295b);
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float widthDp, float heightDp) {
            if (!Float.isNaN(this.f25295b) && widthDp < this.f25295b) {
                return false;
            }
            if (!Float.isNaN(this.f25296c) && heightDp < this.f25296c) {
                return false;
            }
            if (Float.isNaN(this.f25297d) || widthDp <= this.f25297d) {
                return Float.isNaN(this.f25298e) || heightDp <= this.f25298e;
            }
            return false;
        }
    }

    public i(Context context, XmlPullParser parser) {
        b(context, parser);
    }

    private void b(Context context, XmlPullParser parser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.Tl);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == g.m.Ul) {
                this.f25283a = obtainStyledAttributes.getResourceId(index, this.f25283a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = parser.getEventType();
            a aVar = null;
            while (true) {
                char c5 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    parser.getName();
                } else if (eventType == 2) {
                    String name = parser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c5 = 0;
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
                        aVar = new a(context, parser);
                        this.f25287e.put(aVar.f25290a, aVar);
                    } else if (c5 == 3) {
                        b bVar = new b(context, parser);
                        if (aVar != null) {
                            aVar.a(bVar);
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(parser.getName())) {
                    return;
                }
                eventType = parser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    public int a(int currentConstrainSettId, int stateId, float width, float height) {
        a aVar = this.f25287e.get(stateId);
        if (aVar == null) {
            return stateId;
        }
        if (width == -1.0f || height == -1.0f) {
            if (aVar.f25292c == currentConstrainSettId) {
                return currentConstrainSettId;
            }
            Iterator<b> it = aVar.f25291b.iterator();
            while (it.hasNext()) {
                if (currentConstrainSettId == it.next().f25299f) {
                    return currentConstrainSettId;
                }
            }
            return aVar.f25292c;
        }
        Iterator<b> it2 = aVar.f25291b.iterator();
        b bVar = null;
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.a(width, height)) {
                if (currentConstrainSettId == next.f25299f) {
                    return currentConstrainSettId;
                }
                bVar = next;
            }
        }
        return bVar != null ? bVar.f25299f : aVar.f25292c;
    }

    public boolean c(int id2, float width, float height) {
        int i4 = this.f25285c;
        if (i4 != id2) {
            return true;
        }
        a valueAt = id2 == -1 ? this.f25287e.valueAt(0) : this.f25287e.get(i4);
        int i5 = this.f25286d;
        return (i5 == -1 || !valueAt.f25291b.get(i5).a(width, height)) && this.f25286d != valueAt.b(width, height);
    }

    public void d(f constraintsChangedListener) {
        this.f25289g = constraintsChangedListener;
    }

    public int e(int id2, int width, int height) {
        return f(-1, id2, width, height);
    }

    public int f(int currentId, int id2, float width, float height) {
        if (currentId != id2) {
            a aVar = this.f25287e.get(id2);
            if (aVar == null) {
                return -1;
            }
            int b5 = aVar.b(width, height);
            return b5 == -1 ? aVar.f25292c : aVar.f25291b.get(b5).f25299f;
        }
        a valueAt = id2 == -1 ? this.f25287e.valueAt(0) : this.f25287e.get(this.f25285c);
        if (valueAt == null) {
            return -1;
        }
        if (this.f25286d != -1 && valueAt.f25291b.get(currentId).a(width, height)) {
            return currentId;
        }
        int b6 = valueAt.b(width, height);
        return currentId == b6 ? currentId : b6 == -1 ? valueAt.f25292c : valueAt.f25291b.get(b6).f25299f;
    }
}
