package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ConstraintAttribute.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    private static final String f23921i = "TransitionLayout";

    /* renamed from: a, reason: collision with root package name */
    private boolean f23922a;

    /* renamed from: b, reason: collision with root package name */
    String f23923b;

    /* renamed from: c, reason: collision with root package name */
    private b f23924c;

    /* renamed from: d, reason: collision with root package name */
    private int f23925d;

    /* renamed from: e, reason: collision with root package name */
    private float f23926e;

    /* renamed from: f, reason: collision with root package name */
    private String f23927f;

    /* renamed from: g, reason: collision with root package name */
    boolean f23928g;

    /* renamed from: h, reason: collision with root package name */
    private int f23929h;

    /* compiled from: ConstraintAttribute.java */
    /* renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0395a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23930a;

        static {
            int[] iArr = new int[b.values().length];
            f23930a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23930a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23930a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23930a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23930a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23930a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23930a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23930a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: ConstraintAttribute.java */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String name, b attributeType) {
        this.f23922a = false;
        this.f23923b = name;
        this.f23924c = attributeType;
    }

    private static int b(int c5) {
        int i4 = (c5 & (~(c5 >> 31))) - 255;
        return (i4 & (i4 >> 31)) + 255;
    }

    public static HashMap<String, a> d(HashMap<String, a> base, View view) {
        HashMap<String, a> hashMap = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : base.keySet()) {
            a aVar = base.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            } catch (NoSuchMethodException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
        return hashMap;
    }

    public static void q(Context context, XmlPullParser parser, HashMap<String, a> custom) {
        b bVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.f25151pd);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar2 = null;
        boolean z4 = false;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == g.m.f25165qd) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == g.m.Ad) {
                str = obtainStyledAttributes.getString(index);
                z4 = true;
            } else if (index == g.m.f25178rd) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == g.m.f25203td) {
                    bVar = b.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == g.m.f25191sd) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == g.m.f25251xd) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == g.m.f25215ud) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == g.m.f25227vd) {
                    bVar = b.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == g.m.f25239wd) {
                    bVar = b.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == g.m.f25275zd) {
                    bVar = b.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == g.m.f25263yd) {
                    bVar = b.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            custom.put(str, new a(str, bVar2, obj, z4));
        }
        obtainStyledAttributes.recycle();
    }

    public static void r(View view, HashMap<String, a> map) {
        Class<?> cls = view.getClass();
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            a aVar = map.get(next);
            if (!aVar.f23922a) {
                next = androidx.constraintlayout.core.motion.key.c.a("set", next);
            }
            try {
                switch (C0395a.f23930a[aVar.f23924c.ordinal()]) {
                    case 1:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f23925d));
                        break;
                    case 2:
                        cls.getMethod(next, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f23928g));
                        break;
                    case 3:
                        cls.getMethod(next, CharSequence.class).invoke(view, aVar.f23927f);
                        break;
                    case 4:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f23929h));
                        break;
                    case 5:
                        Method method = cls.getMethod(next, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f23929h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f23925d));
                        break;
                    case 7:
                        cls.getMethod(next, Float.TYPE).invoke(view, Float.valueOf(aVar.f23926e));
                        break;
                    case 8:
                        cls.getMethod(next, Float.TYPE).invoke(view, Float.valueOf(aVar.f23926e));
                        break;
                }
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            } catch (NoSuchMethodException e5) {
                e5.getMessage();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    public void a(View view) {
        Class<?> cls = view.getClass();
        String str = this.f23923b;
        if (!this.f23922a) {
            str = androidx.constraintlayout.core.motion.key.c.a("set", str);
        }
        try {
            switch (C0395a.f23930a[this.f23924c.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f23925d));
                    break;
                case 2:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f23928g));
                    break;
                case 3:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f23927f);
                    break;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f23929h));
                    break;
                case 5:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f23929h);
                    method.invoke(view, colorDrawable);
                    break;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f23926e));
                    break;
                case 8:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f23926e));
                    break;
            }
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
        } catch (NoSuchMethodException e5) {
            e5.getMessage();
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
        }
    }

    public boolean c(a constraintAttribute) {
        b bVar;
        if (constraintAttribute == null || (bVar = this.f23924c) != constraintAttribute.f23924c) {
            return false;
        }
        switch (C0395a.f23930a[bVar.ordinal()]) {
            case 1:
            case 6:
                return this.f23925d == constraintAttribute.f23925d;
            case 2:
                return this.f23928g == constraintAttribute.f23928g;
            case 3:
                return this.f23925d == constraintAttribute.f23925d;
            case 4:
            case 5:
                return this.f23929h == constraintAttribute.f23929h;
            case 7:
                return this.f23926e == constraintAttribute.f23926e;
            case 8:
                return this.f23926e == constraintAttribute.f23926e;
            default:
                return false;
        }
    }

    public int e() {
        return this.f23929h;
    }

    public float f() {
        return this.f23926e;
    }

    public int g() {
        return this.f23925d;
    }

    public String h() {
        return this.f23923b;
    }

    public String i() {
        return this.f23927f;
    }

    public b j() {
        return this.f23924c;
    }

    public float k() {
        switch (C0395a.f23930a[this.f23924c.ordinal()]) {
            case 2:
                return this.f23928g ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f23925d;
            case 7:
                return this.f23926e;
            case 8:
                return this.f23926e;
            default:
                return Float.NaN;
        }
    }

    public void l(float[] ret) {
        switch (C0395a.f23930a[this.f23924c.ordinal()]) {
            case 2:
                ret[0] = this.f23928g ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i4 = (this.f23929h >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                ret[0] = pow;
                ret[1] = pow2;
                ret[2] = pow3;
                ret[3] = i4 / 255.0f;
                return;
            case 6:
                ret[0] = this.f23925d;
                return;
            case 7:
                ret[0] = this.f23926e;
                return;
            case 8:
                ret[0] = this.f23926e;
                return;
            default:
                return;
        }
    }

    public boolean m() {
        return this.f23928g;
    }

    public boolean n() {
        int i4 = C0395a.f23930a[this.f23924c.ordinal()];
        return (i4 == 1 || i4 == 2 || i4 == 3) ? false : true;
    }

    public boolean o() {
        return this.f23922a;
    }

    public int p() {
        int i4 = C0395a.f23930a[this.f23924c.ordinal()];
        return (i4 == 4 || i4 == 5) ? 4 : 1;
    }

    public void s(int value) {
        this.f23929h = value;
    }

    public void t(float value) {
        this.f23926e = value;
    }

    public void u(int value) {
        this.f23925d = value;
    }

    public void v(String value) {
        this.f23927f = value;
    }

    public void w(Object value) {
        switch (C0395a.f23930a[this.f23924c.ordinal()]) {
            case 1:
            case 6:
                this.f23925d = ((Integer) value).intValue();
                break;
            case 2:
                this.f23928g = ((Boolean) value).booleanValue();
                break;
            case 3:
                this.f23927f = (String) value;
                break;
            case 4:
            case 5:
                this.f23929h = ((Integer) value).intValue();
                break;
            case 7:
                this.f23926e = ((Float) value).floatValue();
                break;
            case 8:
                this.f23926e = ((Float) value).floatValue();
                break;
        }
    }

    public void x(float[] value) {
        switch (C0395a.f23930a[this.f23924c.ordinal()]) {
            case 1:
            case 6:
                this.f23925d = (int) value[0];
                return;
            case 2:
                this.f23928g = ((double) value[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int HSVToColor = Color.HSVToColor(value);
                this.f23929h = HSVToColor;
                this.f23929h = (b((int) (value[3] * 255.0f)) << 24) | (HSVToColor & 16777215);
                return;
            case 7:
                this.f23926e = value[0];
                return;
            case 8:
                this.f23926e = value[0];
                return;
            default:
                return;
        }
    }

    public a(String name, b attributeType, Object value, boolean method) {
        this.f23923b = name;
        this.f23924c = attributeType;
        this.f23922a = method;
        w(value);
    }

    public a(a source, Object value) {
        this.f23922a = false;
        this.f23923b = source.f23923b;
        this.f23924c = source.f23924c;
        w(value);
    }
}
