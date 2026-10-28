package net.minidev.json;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import kotlin.text.m0;
import net.minidev.json.parser.ParseException;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: JSONValue.java */
/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static h f81725a = h.f81713k;

    /* renamed from: b, reason: collision with root package name */
    private static final net.minidev.json.parser.e f81726b = new net.minidev.json.parser.e();

    public static Object A(Reader reader) throws IOException, ParseException {
        return new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).e(reader, net.minidev.json.parser.a.f81743a);
    }

    public static Object B(String str) throws ParseException {
        return new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).h(str, net.minidev.json.parser.a.f81743a);
    }

    public static Object C(byte[] bArr) throws IOException, ParseException {
        return new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).k(bArr, net.minidev.json.parser.a.f81743a);
    }

    public static String D(Object obj) {
        return E(obj, f81725a);
    }

    public static String E(Object obj, h hVar) {
        StringBuilder sb = new StringBuilder();
        try {
            H(obj, sb, hVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static String F(String str) {
        return e(str, h.f81713k);
    }

    public static void G(Object obj, Appendable appendable) throws IOException {
        H(obj, appendable, f81725a);
    }

    public static void H(Object obj, Appendable appendable, h hVar) throws IOException {
        Method method;
        Object invoke;
        Class<?> type;
        String s4 = ProtectedSandApp.s("褼\u0001");
        if (obj == null) {
            appendable.append(s4);
            return;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!hVar.m(str)) {
                appendable.append(str);
                return;
            }
            appendable.append(m0.quote);
            i(str, appendable, hVar);
            appendable.append(m0.quote);
            return;
        }
        if (obj instanceof Number) {
            if (obj instanceof Double) {
                if (((Double) obj).isInfinite()) {
                    appendable.append(s4);
                    return;
                } else {
                    appendable.append(obj.toString());
                    return;
                }
            }
            if (!(obj instanceof Float)) {
                appendable.append(obj.toString());
                return;
            } else if (((Float) obj).isInfinite()) {
                appendable.append(s4);
                return;
            } else {
                appendable.append(obj.toString());
                return;
            }
        }
        if (obj instanceof Boolean) {
            appendable.append(obj.toString());
            return;
        }
        if (obj instanceof f) {
            if (obj instanceof g) {
                ((g) obj).b(appendable, hVar);
                return;
            } else {
                ((f) obj).c(appendable);
                return;
            }
        }
        if (obj instanceof b) {
            if (obj instanceof c) {
                appendable.append(((c) obj).f(hVar));
                return;
            } else {
                appendable.append(((b) obj).i());
                return;
            }
        }
        if (obj instanceof Map) {
            e.t((Map) obj, appendable, hVar);
            return;
        }
        if (obj instanceof Iterable) {
            a.r((Iterable) obj, appendable, hVar);
            return;
        }
        if (obj instanceof Date) {
            H(obj.toString(), appendable, hVar);
            return;
        }
        if (obj instanceof Enum) {
            String name = ((Enum) obj).name();
            if (!hVar.m(name)) {
                appendable.append(name);
                return;
            }
            appendable.append(m0.quote);
            i(name, appendable, hVar);
            appendable.append(m0.quote);
            return;
        }
        int i4 = 0;
        if (!obj.getClass().isArray()) {
            try {
                Class<?> cls = obj.getClass();
                Field[] declaredFields = cls.getDeclaredFields();
                appendable.append('{');
                int length = declaredFields.length;
                boolean z4 = false;
                while (i4 < length) {
                    Field field = declaredFields[i4];
                    int modifiers = field.getModifiers();
                    if ((modifiers & SyslogAppender.LOG_LOCAL3) <= 0) {
                        if ((modifiers & 1) > 0) {
                            invoke = field.get(obj);
                        } else {
                            try {
                                method = cls.getDeclaredMethod(j.a(field.getName()), null);
                            } catch (Exception unused) {
                                method = null;
                            }
                            if (method == null && ((type = field.getType()) == Boolean.TYPE || type == Boolean.class)) {
                                method = cls.getDeclaredMethod(j.b(field.getName()), null);
                            }
                            if (method != null) {
                                invoke = method.invoke(obj, null);
                            }
                        }
                        if (z4) {
                            appendable.append(',');
                        } else {
                            z4 = true;
                        }
                        e.u(field.getName(), invoke, appendable, hVar);
                    }
                    i4++;
                }
                appendable.append('}');
                return;
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
        Class<?> componentType = obj.getClass().getComponentType();
        appendable.append('[');
        if (!componentType.isPrimitive()) {
            Object[] objArr = (Object[]) obj;
            int length2 = objArr.length;
            boolean z5 = false;
            while (i4 < length2) {
                Object obj2 = objArr[i4];
                if (z5) {
                    appendable.append(',');
                } else {
                    z5 = true;
                }
                H(obj2, appendable, hVar);
                i4++;
            }
        } else if (componentType == Integer.TYPE) {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length;
            boolean z6 = false;
            while (i4 < length3) {
                int i5 = iArr[i4];
                if (z6) {
                    appendable.append(',');
                } else {
                    z6 = true;
                }
                appendable.append(Integer.toString(i5));
                i4++;
            }
        } else if (componentType == Short.TYPE) {
            short[] sArr = (short[]) obj;
            int length4 = sArr.length;
            boolean z7 = false;
            while (i4 < length4) {
                short s5 = sArr[i4];
                if (z7) {
                    appendable.append(',');
                } else {
                    z7 = true;
                }
                appendable.append(Short.toString(s5));
                i4++;
            }
        } else if (componentType == Byte.TYPE) {
            byte[] bArr = (byte[]) obj;
            int length5 = bArr.length;
            boolean z10 = false;
            while (i4 < length5) {
                byte b5 = bArr[i4];
                if (z10) {
                    appendable.append(',');
                } else {
                    z10 = true;
                }
                appendable.append(Byte.toString(b5));
                i4++;
            }
        } else if (componentType == Long.TYPE) {
            long[] jArr = (long[]) obj;
            int length6 = jArr.length;
            boolean z11 = false;
            while (i4 < length6) {
                long j4 = jArr[i4];
                if (z11) {
                    appendable.append(',');
                } else {
                    z11 = true;
                }
                appendable.append(Long.toString(j4));
                i4++;
            }
        } else if (componentType == Float.TYPE) {
            float[] fArr = (float[]) obj;
            int length7 = fArr.length;
            boolean z12 = false;
            while (i4 < length7) {
                float f4 = fArr[i4];
                if (z12) {
                    appendable.append(',');
                } else {
                    z12 = true;
                }
                appendable.append(Float.toString(f4));
                i4++;
            }
        } else if (componentType == Double.TYPE) {
            double[] dArr = (double[]) obj;
            int length8 = dArr.length;
            boolean z13 = false;
            while (i4 < length8) {
                double d5 = dArr[i4];
                if (z13) {
                    appendable.append(',');
                } else {
                    z13 = true;
                }
                appendable.append(Double.toString(d5));
                i4++;
            }
        } else if (componentType == Boolean.TYPE) {
            boolean[] zArr = (boolean[]) obj;
            int length9 = zArr.length;
            boolean z14 = false;
            while (i4 < length9) {
                boolean z15 = zArr[i4];
                if (z14) {
                    appendable.append(',');
                } else {
                    z14 = true;
                }
                if (z15) {
                    appendable.append(ProtectedSandApp.s("褽\u0001"));
                } else {
                    appendable.append(ProtectedSandApp.s("褾\u0001"));
                }
                i4++;
            }
        }
        appendable.append(']');
    }

    public static void a(InputStream inputStream, net.minidev.json.parser.b bVar) throws ParseException, IOException {
        new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).c(inputStream, f81726b, bVar);
    }

    public static void b(Reader reader, net.minidev.json.parser.b bVar) throws ParseException, IOException {
        new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).f(reader, f81726b, bVar);
    }

    public static void c(String str, net.minidev.json.parser.b bVar) throws ParseException {
        new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).i(str, f81726b, bVar);
    }

    public static String d(String str) {
        return e(str, h.f81714l);
    }

    public static String e(String str, h hVar) {
        try {
            StringBuilder sb = new StringBuilder();
            new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).i(str, f81726b, new net.minidev.json.parser.c(sb, hVar));
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String f(String str) {
        return g(str, f81725a);
    }

    public static String g(String str, h hVar) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        hVar.j(str, sb);
        return sb.toString();
    }

    public static void h(String str, Appendable appendable) {
        i(str, appendable, f81725a);
    }

    public static void i(String str, Appendable appendable, h hVar) {
        if (str == null) {
            return;
        }
        hVar.j(str, appendable);
    }

    public static boolean j(Reader reader) throws IOException {
        try {
            new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).e(reader, f81726b);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public static boolean k(String str) {
        try {
            new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).h(str, f81726b);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public static boolean l(Reader reader) throws IOException {
        try {
            new net.minidev.json.parser.f(400).e(reader, f81726b);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public static boolean m(String str) {
        try {
            new net.minidev.json.parser.f(400).h(str, f81726b);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public static Object n(InputStream inputStream) {
        try {
            return new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).a(inputStream);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object o(Reader reader) {
        try {
            return new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).d(reader);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object p(String str) {
        try {
            return new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).g(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object q(byte[] bArr) {
        try {
            return new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).j(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object r(InputStream inputStream) {
        try {
            return new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).b(inputStream, net.minidev.json.parser.a.f81744b);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object s(Reader reader) {
        try {
            return new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).e(reader, net.minidev.json.parser.a.f81744b);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object t(String str) {
        try {
            return new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).h(str, net.minidev.json.parser.a.f81744b);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object u(byte[] bArr) {
        try {
            return new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).k(bArr, net.minidev.json.parser.a.f81744b);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object v(InputStream inputStream) throws IOException, ParseException {
        return new net.minidev.json.parser.f(400).b(inputStream, net.minidev.json.parser.a.f81743a);
    }

    public static Object w(Reader reader) throws IOException, ParseException {
        return new net.minidev.json.parser.f(400).e(reader, net.minidev.json.parser.a.f81743a);
    }

    public static Object x(String str) throws ParseException {
        return new net.minidev.json.parser.f(400).h(str, net.minidev.json.parser.a.f81743a);
    }

    public static Object y(byte[] bArr) throws ParseException {
        return new net.minidev.json.parser.f(400).k(bArr, net.minidev.json.parser.a.f81743a);
    }

    public static Object z(InputStream inputStream) throws IOException, ParseException {
        return new net.minidev.json.parser.f(net.minidev.json.parser.f.f81765s).b(inputStream, net.minidev.json.parser.a.f81743a);
    }
}
