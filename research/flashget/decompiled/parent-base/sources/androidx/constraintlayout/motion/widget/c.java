package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;

/* compiled from: Debug.java */
@SuppressLint({"LogConditional"})
/* loaded from: classes.dex */
public class c {
    public static void a(ViewGroup.LayoutParams param, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        PrintStream printStream = System.out;
        StringBuilder a5 = androidx.appcompat.view.g.a(" >>>>>>>>>>>>>>>>>>. dump ", str2, "  ");
        a5.append(param.getClass().getName());
        printStream.println(a5.toString());
        for (Field field : param.getClass().getFields()) {
            try {
                Object obj = field.get(param);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    System.out.println(str2 + "       " + name + " " + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + str2);
    }

    public static void b(ViewGroup layout, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        int childCount = layout.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = layout.getChildAt(i4);
            PrintStream printStream = System.out;
            StringBuilder a5 = androidx.constraintlayout.core.e.a(str2, "     ");
            a5.append(k(childAt));
            printStream.println(a5.toString());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            for (Field field : layoutParams.getClass().getFields()) {
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        System.out.println(str2 + "       " + field.getName() + " " + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void c(Object obj) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
        Class<?> cls = obj.getClass();
        PrintStream printStream = System.out;
        StringBuilder a5 = androidx.constraintlayout.core.e.a(str, "------------- ");
        a5.append(cls.getName());
        a5.append(" --------------------");
        printStream.println(a5.toString());
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(str + "    " + field.getName() + " " + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream2 = System.out;
        StringBuilder a6 = androidx.constraintlayout.core.e.a(str, "------------- ");
        a6.append(cls.getSimpleName());
        a6.append(" --------------------");
        printStream2.println(a6.toString());
    }

    public static String d(MotionEvent event) {
        int action = event.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String e(int n4) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[n4 + 2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String f() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String g() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String h() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String i(Context context, int id2) {
        if (id2 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(id2);
        } catch (Exception unused) {
            return android.support.v4.media.a.a("?", id2);
        }
    }

    public static String j(Context context, int[] id2) {
        String str;
        try {
            String str2 = id2.length + "[";
            int i4 = 0;
            while (i4 < id2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(i4 == 0 ? "" : " ");
                String sb2 = sb.toString();
                try {
                    str = context.getResources().getResourceEntryName(id2[i4]);
                } catch (Resources.NotFoundException unused) {
                    str = "? " + id2[i4] + " ";
                }
                str2 = sb2 + str;
                i4++;
            }
            return str2 + "]";
        } catch (Exception e4) {
            e4.toString();
            return "UNKNOWN";
        }
    }

    public static String k(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String l(MotionLayout layout, int stateId) {
        return m(layout, stateId, -1);
    }

    public static String m(MotionLayout layout, int stateId, int len) {
        int length;
        if (stateId == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = layout.getContext().getResources().getResourceEntryName(stateId);
        if (len == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > len) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= len || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - len) / length).toString().replace((char) 0, '.') + "_", "_");
    }

    public static void n(String tag, String msg, int n4) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(n4, stackTrace.length - 1);
        String str = " ";
        for (int i4 = 1; i4 <= min; i4++) {
            StackTraceElement stackTraceElement = stackTrace[i4];
            StringBuilder sb = new StringBuilder(".(");
            sb.append(stackTrace[i4].getFileName());
            sb.append(":");
            sb.append(stackTrace[i4].getLineNumber());
            sb.append(") ");
            sb.append(stackTrace[i4].getMethodName());
            str = str + " ";
        }
    }

    public static void o(String msg, int n4) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(n4, stackTrace.length - 1);
        String str = " ";
        for (int i4 = 1; i4 <= min; i4++) {
            StackTraceElement stackTraceElement = stackTrace[i4];
            String str2 = ".(" + stackTrace[i4].getFileName() + ":" + stackTrace[i4].getLineNumber() + ") ";
            str = androidx.compose.runtime.changelist.j.a(str, " ");
            System.out.println(msg + str + str2 + str);
        }
    }
}
