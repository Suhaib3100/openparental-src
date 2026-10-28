package org.apache.commons.lang3.exception;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;
import org.apache.commons.lang3.b1;
import org.apache.commons.lang3.e;
import org.apache.commons.lang3.s;

/* compiled from: ExceptionUtils.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f85992a = -1;

    /* renamed from: c, reason: collision with root package name */
    static final String f85994c = " [wrapped] ";

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f85993b = {"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};

    private static <T extends Throwable> T A(Throwable th, Class<T> cls, int i4, boolean z4) {
        if (th != null && cls != null) {
            if (i4 < 0) {
                i4 = 0;
            }
            Throwable[] o4 = o(th);
            if (i4 >= o4.length) {
                return null;
            }
            if (z4) {
                while (i4 < o4.length) {
                    if (cls.isAssignableFrom(o4[i4].getClass())) {
                        return cls.cast(o4[i4]);
                    }
                    i4++;
                }
            } else {
                while (i4 < o4.length) {
                    if (cls.equals(o4[i4].getClass())) {
                        return cls.cast(o4[i4]);
                    }
                    i4++;
                }
            }
        }
        return null;
    }

    public static <T extends Throwable> T B(Throwable th, Class<T> cls) {
        return (T) A(th, cls, 0, false);
    }

    public static <T extends Throwable> T C(Throwable th, Class<T> cls, int i4) {
        return (T) A(th, cls, i4, false);
    }

    public static <T extends Throwable> T D(Throwable th, Class<T> cls) {
        return (T) A(th, cls, 0, true);
    }

    public static <T extends Throwable> T E(Throwable th, Class<T> cls, int i4) {
        return (T) A(th, cls, i4, true);
    }

    private static <R, T extends Throwable> R F(Throwable th) throws Throwable {
        throw th;
    }

    public static <R> R G(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new UndeclaredThrowableException(th);
    }

    @Deprecated
    public static Throwable a(Throwable th) {
        return b(th, null);
    }

    @Deprecated
    public static Throwable b(Throwable th, String[] strArr) {
        Throwable c5;
        if (th == null) {
            return null;
        }
        if (strArr == null) {
            Throwable cause = th.getCause();
            if (cause != null) {
                return cause;
            }
            strArr = f85993b;
        }
        for (String str : strArr) {
            if (str != null && (c5 = c(th, str)) != null) {
                return c5;
            }
        }
        return null;
    }

    private static Throwable c(Throwable th, String str) {
        Method method;
        try {
            method = th.getClass().getMethod(str, null);
        } catch (NoSuchMethodException | SecurityException unused) {
            method = null;
        }
        if (method != null && Throwable.class.isAssignableFrom(method.getReturnType())) {
            try {
                return (Throwable) method.invoke(th, null);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            }
        }
        return null;
    }

    @Deprecated
    public static String[] d() {
        return (String[]) e.R(f85993b);
    }

    public static String e(Throwable th) {
        if (th == null) {
            return "";
        }
        String H = s.H(th, null);
        String message = th.getMessage();
        StringBuilder a5 = androidx.constraintlayout.core.e.a(H, ": ");
        a5.append(b1.J(message));
        return a5.toString();
    }

    public static Throwable f(Throwable th) {
        List<Throwable> n4 = n(th);
        if (n4.isEmpty()) {
            return null;
        }
        return (Throwable) androidx.appcompat.view.menu.d.a(n4, 1);
    }

    public static String g(Throwable th) {
        Throwable f4 = f(th);
        if (f4 != null) {
            th = f4;
        }
        return e(th);
    }

    public static String[] h(Throwable th) {
        List<String> list;
        if (th == null) {
            return e.f85969u;
        }
        Throwable[] o4 = o(th);
        int length = o4.length;
        ArrayList arrayList = new ArrayList();
        int i4 = length - 1;
        List<String> i5 = i(o4[i4]);
        while (true) {
            int i6 = length - 1;
            if (i6 < 0) {
                return (String[]) arrayList.toArray(e.f85969u);
            }
            if (i6 != 0) {
                list = i(o4[length - 2]);
                y(i5, list);
            } else {
                list = i5;
            }
            if (i6 == i4) {
                arrayList.add(o4[i6].toString());
            } else {
                arrayList.add(" [wrapped] " + o4[i6].toString());
            }
            arrayList.addAll(i5);
            i5 = list;
            length = i6;
        }
    }

    static List<String> i(Throwable th) {
        StringTokenizer stringTokenizer = new StringTokenizer(l(th), System.lineSeparator());
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf("at");
            if (indexOf != -1 && nextToken.substring(0, indexOf).trim().isEmpty()) {
                arrayList.add(nextToken);
                z4 = true;
            } else if (z4) {
                break;
            }
        }
        return arrayList;
    }

    static String[] j(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, System.lineSeparator());
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return (String[]) arrayList.toArray(e.f85969u);
    }

    public static String[] k(Throwable th) {
        return th == null ? e.f85969u : j(l(th));
    }

    public static String l(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static int m(Throwable th) {
        return n(th).size();
    }

    public static List<Throwable> n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        return arrayList;
    }

    public static Throwable[] o(Throwable th) {
        return (Throwable[]) n(th).toArray(e.f85970v);
    }

    public static boolean p(Throwable th, Class<? extends Throwable> cls) {
        if (th instanceof UndeclaredThrowableException) {
            th = th.getCause();
        }
        return cls.isInstance(th);
    }

    private static int q(Throwable th, Class<? extends Throwable> cls, int i4, boolean z4) {
        if (th != null && cls != null) {
            if (i4 < 0) {
                i4 = 0;
            }
            Throwable[] o4 = o(th);
            if (i4 >= o4.length) {
                return -1;
            }
            if (z4) {
                while (i4 < o4.length) {
                    if (cls.isAssignableFrom(o4[i4].getClass())) {
                        return i4;
                    }
                    i4++;
                }
            } else {
                while (i4 < o4.length) {
                    if (cls.equals(o4[i4].getClass())) {
                        return i4;
                    }
                    i4++;
                }
            }
        }
        return -1;
    }

    public static int r(Throwable th, Class<? extends Throwable> cls) {
        return q(th, cls, 0, false);
    }

    public static int s(Throwable th, Class<? extends Throwable> cls, int i4) {
        return q(th, cls, i4, false);
    }

    public static int t(Throwable th, Class<? extends Throwable> cls) {
        return q(th, cls, 0, true);
    }

    public static int u(Throwable th, Class<? extends Throwable> cls, int i4) {
        return q(th, cls, i4, true);
    }

    public static void v(Throwable th) {
        w(th, System.err);
    }

    public static void w(Throwable th, PrintStream printStream) {
        if (th == null) {
            return;
        }
        Objects.requireNonNull(printStream, "printStream");
        for (String str : h(th)) {
            printStream.println(str);
        }
        printStream.flush();
    }

    public static void x(Throwable th, PrintWriter printWriter) {
        if (th == null) {
            return;
        }
        Objects.requireNonNull(printWriter, "printWriter");
        for (String str : h(th)) {
            printWriter.println(str);
        }
        printWriter.flush();
    }

    public static void y(List<String> list, List<String> list2) {
        if (list == null || list2 == null) {
            throw new IllegalArgumentException("The List must not be null");
        }
        int size = list.size() - 1;
        for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
            if (list.get(size).equals(list2.get(size2))) {
                list.remove(size);
            }
            size--;
        }
    }

    public static <R> R z(Throwable th) {
        throw th;
    }
}
